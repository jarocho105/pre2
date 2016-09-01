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

import com.bydan.erp.nomina.util.PrestamoConstantesFunciones;
import com.bydan.erp.nomina.util.PrestamoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.PrestamoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.PrestamoBean;
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
public class PrestamoBeanSwingJInternalFrame extends PrestamoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PrestamoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Prestamo> prestamoValidator = new ClassValidator<Prestamo>(Prestamo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Prestamo prestamo;	
	public Prestamo prestamoAux;
	public Prestamo prestamoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Prestamo prestamoTotales;
	public Long idPrestamoActual;
	public Long iIdNuevoPrestamo=0L;
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

	public String sFinalQueryComboTipoPrestamo="";

	public List<TipoPrestamo> tipoprestamosForeignKey;

	public List<TipoPrestamo> gettipoprestamosForeignKey() {
		return tipoprestamosForeignKey;
	}

	public void settipoprestamosForeignKey(List<TipoPrestamo> tipoprestamosForeignKey) {
		this.tipoprestamosForeignKey = tipoprestamosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPrestamo tipoprestamoForeignKey;

	public TipoPrestamo gettipoprestamoForeignKey() {
		return tipoprestamoForeignKey;
	}

	public void settipoprestamoForeignKey(TipoPrestamo tipoprestamoForeignKey) {
		this.tipoprestamoForeignKey = tipoprestamoForeignKey;
	}

	public String sFinalQueryComboTipoCuota="";

	public List<TipoCuota> tipocuotasForeignKey;

	public List<TipoCuota> gettipocuotasForeignKey() {
		return tipocuotasForeignKey;
	}

	public void settipocuotasForeignKey(List<TipoCuota> tipocuotasForeignKey) {
		this.tipocuotasForeignKey = tipocuotasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCuota tipocuotaForeignKey;

	public TipoCuota gettipocuotaForeignKey() {
		return tipocuotaForeignKey;
	}

	public void settipocuotaForeignKey(TipoCuota tipocuotaForeignKey) {
		this.tipocuotaForeignKey = tipocuotaForeignKey;
	}

	public String sFinalQueryComboAsientoContable="";

	public List<AsientoContable> asientocontablesForeignKey;

	public List<AsientoContable> getasientocontablesForeignKey() {
		return asientocontablesForeignKey;
	}

	public void setasientocontablesForeignKey(List<AsientoContable> asientocontablesForeignKey) {
		this.asientocontablesForeignKey = asientocontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public AsientoContable asientocontableForeignKey;

	public AsientoContable getasientocontableForeignKey() {
		return asientocontableForeignKey;
	}

	public void setasientocontableForeignKey(AsientoContable asientocontableForeignKey) {
		this.asientocontableForeignKey = asientocontableForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	public Long idAsientoContableActual=0L;

	public Long getidAsientoContableActual() {
		return idAsientoContableActual;
	}

	public void setidAsientoContableActual(Long idAsientoContableActual) {
		this.idAsientoContableActual= idAsientoContableActual;
	}
	
	

	public Boolean isTienePermisosAbonoPrestamo=false;

	public Boolean getIsTienePermisosAbonoPrestamo() {
		return isTienePermisosAbonoPrestamo;
	}

	public void setIsTienePermisosAbonoPrestamo(Boolean isTienePermisosAbonoPrestamo) {
		this.isTienePermisosAbonoPrestamo= isTienePermisosAbonoPrestamo;
	}


	public Boolean isTienePermisosCuota=false;

	public Boolean getIsTienePermisosCuota() {
		return isTienePermisosCuota;
	}

	public void setIsTienePermisosCuota(Boolean isTienePermisosCuota) {
		this.isTienePermisosCuota= isTienePermisosCuota;
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
	
	public Boolean isPermisoTodoPrestamo;
	public Boolean isPermisoNuevoPrestamo;
	public Boolean isPermisoActualizarPrestamo;
	public Boolean isPermisoActualizarOriginalPrestamo;
	public Boolean isPermisoEliminarPrestamo;
	public Boolean isPermisoGuardarCambiosPrestamo;
	public Boolean isPermisoConsultaPrestamo;
	public Boolean isPermisoBusquedaPrestamo;
	public Boolean isPermisoReportePrestamo;
	public Boolean isPermisoPaginacionMedioPrestamo;
	public Boolean isPermisoPaginacionAltoPrestamo;
	public Boolean isPermisoPaginacionTodoPrestamo;
	public Boolean isPermisoCopiarPrestamo;
	public Boolean isPermisoVerFormPrestamo;
	public Boolean isPermisoDuplicarPrestamo;
	public Boolean isPermisoOrdenPrestamo;
	
	
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
	
	public PrestamoParameterReturnGeneral prestamoReturnGeneral;
	public PrestamoParameterReturnGeneral prestamoParameterGeneral;
	
	

	public AbonoPrestamoLogic abonoprestamoLogic=null;

	public AbonoPrestamoLogic getAbonoPrestamoLogic() {
		return abonoprestamoLogic;
	}

	public void setAbonoPrestamoLogic(AbonoPrestamoLogic abonoprestamoLogic) {
		this.abonoprestamoLogic = abonoprestamoLogic;
	}


	public CuotaLogic cuotaLogic=null;

	public CuotaLogic getCuotaLogic() {
		return cuotaLogic;
	}

	public void setCuotaLogic(CuotaLogic cuotaLogic) {
		this.cuotaLogic = cuotaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPrestamo=false;
	public Boolean esParaAccionDesdeFormularioPrestamo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PrestamoSessionBeanAdditional prestamoSessionBeanAdditional=null;
	
	public PrestamoSessionBeanAdditional getPrestamoSessionBeanAdditional() {
		return this.prestamoSessionBeanAdditional;
	}
	
	public void setPrestamoSessionBeanAdditional(PrestamoSessionBeanAdditional prestamoSessionBeanAdditional) {
		try {
			this.prestamoSessionBeanAdditional=prestamoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PrestamoBeanSwingJInternalFrameAdditional prestamoBeanSwingJInternalFrameAdditional=null;
	//public class PrestamoBeanSwingJInternalFrame
	
	public PrestamoBeanSwingJInternalFrameAdditional getPrestamoBeanSwingJInternalFrameAdditional() {
		return this.prestamoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPrestamoBeanSwingJInternalFrameAdditional(PrestamoBeanSwingJInternalFrameAdditional prestamoBeanSwingJInternalFrameAdditional) {
		try {
			this.prestamoBeanSwingJInternalFrameAdditional=prestamoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PrestamoLogic prestamoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Prestamo prestamoBean;
	public PrestamoConstantesFunciones prestamoConstantesFunciones;
	//public PrestamoParameterReturnGeneral prestamoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public TipoPrestamoLogic tipoprestamoLogic;
	public TipoCuotaLogic tipocuotaLogic;
	public AsientoContableLogic asientocontableLogic;
	
	//PARAMETROS
	
	
	//public List<Prestamo> prestamos;	
	//public List<Prestamo> prestamosEliminados;
	//public List<Prestamo> prestamosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPrestamo=false;
	public Boolean isVisibilidadCeldaDuplicarPrestamo=true;
	public Boolean isVisibilidadCeldaCopiarPrestamo=true;
	public Boolean isVisibilidadCeldaVerFormPrestamo=true;
	public Boolean isVisibilidadCeldaOrdenPrestamo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPrestamo=false;
	public Boolean isVisibilidadCeldaModificarPrestamo=false;
	public Boolean isVisibilidadCeldaActualizarPrestamo=false;
	public Boolean isVisibilidadCeldaEliminarPrestamo=false;
	public Boolean isVisibilidadCeldaCancelarPrestamo=false;
	public Boolean isVisibilidadCeldaGuardarPrestamo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPrestamo=false;	
	
	
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoCuota=false;
	public Boolean isVisibilidadFK_IdTipoPrestamo=false;
	
	public Long getiIdNuevoPrestamo() {
		return this.iIdNuevoPrestamo;
	}

	public void setiIdNuevoPrestamo(Long iIdNuevoPrestamo) {
		this.iIdNuevoPrestamo = iIdNuevoPrestamo;
	}
	
	public Long getidPrestamoActual() {
		return this.idPrestamoActual;
	}

	public void setidPrestamoActual(Long idPrestamoActual) {
		this.idPrestamoActual = idPrestamoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Prestamo getprestamo() {
		return this.prestamo;
	}

	public void setprestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	
	public Prestamo getprestamoAux() {
		return this.prestamoAux;
	}

	public void setprestamoAux(Prestamo prestamoAux) {
		this.prestamoAux = prestamoAux;
	}				
	
	public Prestamo getprestamoAnterior() {
		return this.prestamoAnterior;
	}

	public void setprestamoAnterior(Prestamo prestamoAnterior) {
		this.prestamoAnterior = prestamoAnterior;
	}	
	
	public Prestamo getprestamoTotales() {
		return this.prestamoTotales;
	}

	public void setprestamoTotales(Prestamo prestamoTotales) {
		this.prestamoTotales = prestamoTotales;
	}	
	
	public Prestamo getprestamoBean() {
		return this.prestamoBean;
	}

	public void setprestamoBean(Prestamo prestamoBean) {
		this.prestamoBean = prestamoBean;
	}	
	
	public PrestamoParameterReturnGeneral getprestamoReturnGeneral() {
		return this.prestamoReturnGeneral;
	}

	public void setprestamoReturnGeneral(PrestamoParameterReturnGeneral prestamoReturnGeneral) {
		this.prestamoReturnGeneral = prestamoReturnGeneral;
	}	
	
	
	public Long id_asiento_contableFK_IdAsientoContable=null;

	public Long getid_asiento_contableFK_IdAsientoContable() {
		return this.id_asiento_contableFK_IdAsientoContable;
	}

	public void setid_asiento_contableFK_IdAsientoContable(Long id_asiento_contableFK_IdAsientoContable) {
		this.id_asiento_contableFK_IdAsientoContable = id_asiento_contableFK_IdAsientoContable;
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

	public Long id_tipo_cuotaFK_IdTipoCuota=-1L;

	public Long getid_tipo_cuotaFK_IdTipoCuota() {
		return this.id_tipo_cuotaFK_IdTipoCuota;
	}

	public void setid_tipo_cuotaFK_IdTipoCuota(Long id_tipo_cuotaFK_IdTipoCuota) {
		this.id_tipo_cuotaFK_IdTipoCuota = id_tipo_cuotaFK_IdTipoCuota;
	}

	public Long id_tipo_prestamoFK_IdTipoPrestamo=-1L;

	public Long getid_tipo_prestamoFK_IdTipoPrestamo() {
		return this.id_tipo_prestamoFK_IdTipoPrestamo;
	}

	public void setid_tipo_prestamoFK_IdTipoPrestamo(Long id_tipo_prestamoFK_IdTipoPrestamo) {
		this.id_tipo_prestamoFK_IdTipoPrestamo = id_tipo_prestamoFK_IdTipoPrestamo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PrestamoLogic getPrestamoLogic()	{		
		return prestamoLogic;
	}

	public void setPrestamoLogic(PrestamoLogic prestamoLogic) {
		this.prestamoLogic = prestamoLogic;
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
	
	public Boolean getIsEsNuevoPrestamo() {
		return isEsNuevoPrestamo;
	}

	public void setIsEsNuevoPrestamo(Boolean isEsNuevoPrestamo) {
		this.isEsNuevoPrestamo = isEsNuevoPrestamo;
	}

	public Boolean getEsParaAccionDesdeFormularioPrestamo() {
		return esParaAccionDesdeFormularioPrestamo;
	}
	
	public void setEsParaAccionDesdeFormularioPrestamo(Boolean esParaAccionDesdeFormularioPrestamo) {
		this.esParaAccionDesdeFormularioPrestamo = esParaAccionDesdeFormularioPrestamo;
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

			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
			}

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(prestamoSessionBean.getlidEmpresaActual());
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

			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
			}

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(prestamoSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosTipoPrestamosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprestamosForeignKey=new ArrayList<TipoPrestamo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPrestamoLogic tipoprestamoLogic=new TipoPrestamoLogic();

			//tipoprestamoLogic.getTipoPrestamoDataAccess().setIsForForeingKeyData(true);

			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
			}

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrestamo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprestamoLogic.getTipoPrestamoDataAccess().setIsForForeingKeyData(true);

					tipoprestamoLogic.getTodosTipoPrestamosWithConnection(sFinalQuery,new Pagination());

					this.tipoprestamosForeignKey=tipoprestamoLogic.getTipoPrestamos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPrestamo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprestamoLogic.getEntityWithConnection(prestamoSessionBean.getlidTipoPrestamoActual());
					this.tipoprestamosForeignKey.add(tipoprestamoLogic.getTipoPrestamo());
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

	public void cargarCombosTipoCuotasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocuotasForeignKey=new ArrayList<TipoCuota>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCuotaLogic tipocuotaLogic=new TipoCuotaLogic();

			//tipocuotaLogic.getTipoCuotaDataAccess().setIsForForeingKeyData(true);

			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
			}

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuota()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocuotaLogic.getTipoCuotaDataAccess().setIsForForeingKeyData(true);

					tipocuotaLogic.getTodosTipoCuotasWithConnection(sFinalQuery,new Pagination());

					this.tipocuotasForeignKey=tipocuotaLogic.getTipoCuotas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCuota(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuotaLogic.getEntityWithConnection(prestamoSessionBean.getlidTipoCuotaActual());
					this.tipocuotasForeignKey.add(tipocuotaLogic.getTipoCuota());
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

	public void cargarCombosAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AsientoContableLogic asientocontableLogic=new AsientoContableLogic();

			//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
			}

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

					asientocontableLogic.getTodosAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.asientocontablesForeignKey=asientocontableLogic.getAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(prestamoSessionBean.getlidAsientoContableActual());
					this.asientocontablesForeignKey.add(asientocontableLogic.getAsientoContable());
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

					if(this.prestamo!=null) {
						this.prestamo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPrestamo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPrestamoGenerico)throws Exception
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
				jComboBoxid_empresaPrestamoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPrestamoGenerico!=null && jComboBoxid_empresaPrestamoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPrestamoGenerico.setSelectedIndex(0);
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

					if(this.prestamo!=null) {
						this.prestamo.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoPrestamo.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoPrestamo!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoPrestamo.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoPrestamo!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoPrestamo.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoPrestamo.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoPrestamo.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoPrestamoGenerico)throws Exception
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
				jComboBoxid_empleadoPrestamoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoPrestamoGenerico!=null && jComboBoxid_empleadoPrestamoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoPrestamoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoPrestamoForeignKey(Long idTipoPrestamoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPrestamo  tipoprestamoTemp=null;

			for(TipoPrestamo tipoprestamoAux:tipoprestamosForeignKey) {
				if(tipoprestamoAux.getId()!=null && tipoprestamoAux.getId().equals(idTipoPrestamoSeleccionado)) {
					tipoprestamoTemp=tipoprestamoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprestamoTemp!=null) {

					if(this.prestamo!=null) {
						this.prestamo.setTipoPrestamo(tipoprestamoTemp);
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setSelectedItem(tipoprestamoTemp);
					}
				} else {
					//jComboBoxid_tipo_prestamoPrestamo.setSelectedItem(tipoprestamoTemp);
					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPrestamo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprestamoTemp!=null && jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo!=null) {
						jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setSelectedItem(tipoprestamoTemp);
					} else {
						if(jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo!=null) {
							//jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setSelectedItem(tipoprestamoTemp);
							if(jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.getItemCount()>0) {
								jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setSelectedIndex(0);
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

	public String getActualTipoPrestamoForeignKeyDescripcion(Long idTipoPrestamoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPrestamo  tipoprestamoTemp=null;

			for(TipoPrestamo tipoprestamoAux:tipoprestamosForeignKey) {
				if(tipoprestamoAux.getId()!=null && tipoprestamoAux.getId().equals(idTipoPrestamoSeleccionado)) {
					tipoprestamoTemp=tipoprestamoAux;
					break;
				}
			}


			sDescripcion=TipoPrestamoConstantesFunciones.getTipoPrestamoDescripcion(tipoprestamoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPrestamoForeignKeyGenerico(Long idTipoPrestamoSeleccionado,JComboBox jComboBoxid_tipo_prestamoPrestamoGenerico)throws Exception
	{
		try
		{
			TipoPrestamo  tipoprestamoTemp=null;

			for(TipoPrestamo tipoprestamoAux:tipoprestamosForeignKey) {
				if(tipoprestamoAux.getId()!=null && tipoprestamoAux.getId().equals(idTipoPrestamoSeleccionado)) {
					tipoprestamoTemp=tipoprestamoAux;
					break;
				}
			}

			if(tipoprestamoTemp!=null) {
				jComboBoxid_tipo_prestamoPrestamoGenerico.setSelectedItem(tipoprestamoTemp);
			} else {
				if(jComboBoxid_tipo_prestamoPrestamoGenerico!=null && jComboBoxid_tipo_prestamoPrestamoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_prestamoPrestamoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCuotaForeignKey(Long idTipoCuotaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCuota  tipocuotaTemp=null;

			for(TipoCuota tipocuotaAux:tipocuotasForeignKey) {
				if(tipocuotaAux.getId()!=null && tipocuotaAux.getId().equals(idTipoCuotaSeleccionado)) {
					tipocuotaTemp=tipocuotaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocuotaTemp!=null) {

					if(this.prestamo!=null) {
						this.prestamo.setTipoCuota(tipocuotaTemp);
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setSelectedItem(tipocuotaTemp);
					}
				} else {
					//jComboBoxid_tipo_cuotaPrestamo.setSelectedItem(tipocuotaTemp);
					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCuota") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocuotaTemp!=null && jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo!=null) {
						jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.setSelectedItem(tipocuotaTemp);
					} else {
						if(jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo!=null) {
							//jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.setSelectedItem(tipocuotaTemp);
							if(jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.getItemCount()>0) {
								jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.setSelectedIndex(0);
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

	public String getActualTipoCuotaForeignKeyDescripcion(Long idTipoCuotaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCuota  tipocuotaTemp=null;

			for(TipoCuota tipocuotaAux:tipocuotasForeignKey) {
				if(tipocuotaAux.getId()!=null && tipocuotaAux.getId().equals(idTipoCuotaSeleccionado)) {
					tipocuotaTemp=tipocuotaAux;
					break;
				}
			}


			sDescripcion=TipoCuotaConstantesFunciones.getTipoCuotaDescripcion(tipocuotaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCuotaForeignKeyGenerico(Long idTipoCuotaSeleccionado,JComboBox jComboBoxid_tipo_cuotaPrestamoGenerico)throws Exception
	{
		try
		{
			TipoCuota  tipocuotaTemp=null;

			for(TipoCuota tipocuotaAux:tipocuotasForeignKey) {
				if(tipocuotaAux.getId()!=null && tipocuotaAux.getId().equals(idTipoCuotaSeleccionado)) {
					tipocuotaTemp=tipocuotaAux;
					break;
				}
			}

			if(tipocuotaTemp!=null) {
				jComboBoxid_tipo_cuotaPrestamoGenerico.setSelectedItem(tipocuotaTemp);
			} else {
				if(jComboBoxid_tipo_cuotaPrestamoGenerico!=null && jComboBoxid_tipo_cuotaPrestamoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_cuotaPrestamoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAsientoContableForeignKey(Long idAsientoContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(asientocontableTemp!=null) {

					if(this.prestamo!=null) {
						this.prestamo.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contablePrestamo.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormPrestamo!=null) {
						if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(asientocontableTemp!=null && jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo!=null) {
						jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.setSelectedItem(asientocontableTemp);
					} else {
						if(jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo!=null) {
							//jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.setSelectedItem(asientocontableTemp);
							if(jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.getItemCount()>0) {
								jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.setSelectedIndex(0);
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

	public String getActualAsientoContableForeignKeyDescripcion(Long idAsientoContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}


			sDescripcion=AsientoContableConstantesFunciones.getAsientoContableDescripcion(asientocontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contablePrestamoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(asientocontableTemp!=null) {
				jComboBoxid_asiento_contablePrestamoGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contablePrestamoGenerico!=null && jComboBoxid_asiento_contablePrestamoGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contablePrestamoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Prestamo prestamo,JComboBox jComboBoxid_empresaPrestamoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPrestamoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPrestamoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				prestamo.setid_empresa(empresaAux.getId());
				prestamo.setempresa_descripcion(PrestamoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				prestamo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Prestamo prestamo,JComboBox jComboBoxid_empleadoPrestamoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoPrestamoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoPrestamoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				prestamo.setid_empleado(empleadoAux.getId());
				prestamo.setempleado_descripcion(PrestamoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				prestamo.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPrestamoForeignKey(Prestamo prestamo,JComboBox jComboBoxid_tipo_prestamoPrestamoGenerico)throws Exception
	{
		try
		{
			TipoPrestamo  tipoprestamoAux=new TipoPrestamo();

			if(jComboBoxid_tipo_prestamoPrestamoGenerico==null) {
				tipoprestamoAux=(TipoPrestamo)this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.getSelectedItem();
			} else {
				tipoprestamoAux=(TipoPrestamo)jComboBoxid_tipo_prestamoPrestamoGenerico.getSelectedItem();
			}

			if(tipoprestamoAux!=null && tipoprestamoAux.getId()!=null) {
				prestamo.setid_tipo_prestamo(tipoprestamoAux.getId());
				prestamo.settipoprestamo_descripcion(PrestamoConstantesFunciones.getTipoPrestamoDescripcion(tipoprestamoAux));
				prestamo.setTipoPrestamo(tipoprestamoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCuotaForeignKey(Prestamo prestamo,JComboBox jComboBoxid_tipo_cuotaPrestamoGenerico)throws Exception
	{
		try
		{
			TipoCuota  tipocuotaAux=new TipoCuota();

			if(jComboBoxid_tipo_cuotaPrestamoGenerico==null) {
				tipocuotaAux=(TipoCuota)this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.getSelectedItem();
			} else {
				tipocuotaAux=(TipoCuota)jComboBoxid_tipo_cuotaPrestamoGenerico.getSelectedItem();
			}

			if(tipocuotaAux!=null && tipocuotaAux.getId()!=null) {
				prestamo.setid_tipo_cuota(tipocuotaAux.getId());
				prestamo.settipocuota_descripcion(PrestamoConstantesFunciones.getTipoCuotaDescripcion(tipocuotaAux));
				prestamo.setTipoCuota(tipocuotaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(Prestamo prestamo,JComboBox jComboBoxid_asiento_contablePrestamoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contablePrestamoGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contablePrestamoGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null) {
				prestamo.setid_asiento_contable(asientocontableAux.getId());
				prestamo.setasientocontable_descripcion(PrestamoConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				prestamo.setAsientoContable(asientocontableAux);			}
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

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) { 
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) { 
					}

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) { 
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) { 
					}

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPrestamo.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoPrestamo.addItem(empleado);
							}
						}

						if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPrestamosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPrestamo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) { 
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.removeAllItems();

							for(TipoPrestamo tipoprestamo:this.tipoprestamosForeignKey) {
								this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.addItem(tipoprestamo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) { 
					}

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPrestamo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.removeAllItems();

							for(TipoPrestamo tipoprestamo:this.tipoprestamosForeignKey) {
								this.jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.addItem(tipoprestamo);
							}
						}

						if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCuotasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCuota=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) { 
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.removeAllItems();

							for(TipoCuota tipocuota:this.tipocuotasForeignKey) {
								this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.addItem(tipocuota);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) { 
					}

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCuota") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.removeAllItems();

							for(TipoCuota tipocuota:this.tipocuotasForeignKey) {
								this.jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.addItem(tipocuota);
							}
						}

						if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAsientoContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAsientoContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) { 
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrestamo!=null) { 
					}

					if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.addItem(asientocontable);
							}
						}

						if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoPrestamo.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPrestamo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoPrestamoForeignKey(TipoPrestamo tipoprestamo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setSelectedItem(tipoprestamo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setSelectedItem(tipoprestamo);
						} else {
							this.jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCuotaForeignKey(TipoCuota tipocuota,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setSelectedItem(tipocuota);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.setSelectedItem(tipocuota);
						} else {
							this.jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAsientoContableForeignKey(AsientoContable asientocontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrestamo!=null) {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.setSelectedItem(asientocontable);
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPrestamo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PrestamoConstantesFunciones.refrescarForeignKeysDescripcionesPrestamo(this.prestamoLogic.getPrestamos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PrestamoConstantesFunciones.refrescarForeignKeysDescripcionesPrestamo(this.prestamos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(TipoPrestamo.class));
		classes.add(new Classe(TipoCuota.class));
		classes.add(new Classe(AsientoContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//prestamoLogic.setPrestamos(this.prestamos);
			prestamoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PrestamoParameterReturnGeneral getPrestamoParameterGeneral() {
		return this.prestamoParameterGeneral;
	}
	
	public void setPrestamoParameterGeneral(PrestamoParameterReturnGeneral prestamoParameterGeneral) {
		this.prestamoParameterGeneral = prestamoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPrestamo() {
		return isPermisoTodoPrestamo;
	}

	public void setIsPermisoTodoPrestamo(Boolean isPermisoTodoPrestamo) {
		this.isPermisoTodoPrestamo = isPermisoTodoPrestamo;
	}

	public Boolean getIsPermisoNuevoPrestamo() {
		return isPermisoNuevoPrestamo;
	}

	public void setIsPermisoNuevoPrestamo(Boolean isPermisoNuevoPrestamo) {
		this.isPermisoNuevoPrestamo = isPermisoNuevoPrestamo;
	}

	public Boolean getIsPermisoActualizarPrestamo() {
		return isPermisoActualizarPrestamo;
	}

	public void setIsPermisoActualizarPrestamo(Boolean isPermisoActualizarPrestamo) {
		this.isPermisoActualizarPrestamo = isPermisoActualizarPrestamo;
	}

	public Boolean getIsPermisoEliminarPrestamo() {
		return isPermisoEliminarPrestamo;
	}

	public void setIsPermisoEliminarPrestamo(Boolean isPermisoEliminarPrestamo) {
		this.isPermisoEliminarPrestamo = isPermisoEliminarPrestamo;
	}

	public Boolean getIsPermisoGuardarCambiosPrestamo() {
		return isPermisoGuardarCambiosPrestamo;
	}

	public void setIsPermisoGuardarCambiosPrestamo(Boolean isPermisoGuardarCambiosPrestamo) {
		this.isPermisoGuardarCambiosPrestamo = isPermisoGuardarCambiosPrestamo;
	}
	
	public Boolean getIsPermisoConsultaPrestamo() {
		return isPermisoConsultaPrestamo;
	}

	public void setIsPermisoConsultaPrestamo(Boolean isPermisoConsultaPrestamo) {
		this.isPermisoConsultaPrestamo = isPermisoConsultaPrestamo;
	}

	public Boolean getIsPermisoBusquedaPrestamo() {
		return isPermisoBusquedaPrestamo;
	}

	public void setIsPermisoBusquedaPrestamo(Boolean isPermisoBusquedaPrestamo) {
		this.isPermisoBusquedaPrestamo = isPermisoBusquedaPrestamo;
	}

	public Boolean getIsPermisoReportePrestamo() {
		return isPermisoReportePrestamo;
	}

	public void setIsPermisoReportePrestamo(Boolean isPermisoReportePrestamo) {
		this.isPermisoReportePrestamo = isPermisoReportePrestamo;
	}
	
	public Boolean getIsPermisoPaginacionMedioPrestamo() {
		return isPermisoPaginacionMedioPrestamo;
	}

	public void setIsPermisoPaginacionMedioPrestamo(Boolean isPermisoPaginacionMedioPrestamo) {
		this.isPermisoPaginacionMedioPrestamo = isPermisoPaginacionMedioPrestamo;
	}
	
	public Boolean getIsPermisoPaginacionTodoPrestamo() {
		return isPermisoPaginacionTodoPrestamo;
	}

	public void setIsPermisoPaginacionTodoPrestamo(Boolean isPermisoPaginacionTodoPrestamo) {
		this.isPermisoPaginacionTodoPrestamo = isPermisoPaginacionTodoPrestamo;
	}
	
	public Boolean getIsPermisoPaginacionAltoPrestamo() {
		return isPermisoPaginacionAltoPrestamo;
	}

	public void setIsPermisoPaginacionAltoPrestamo(Boolean isPermisoPaginacionAltoPrestamo) {
		this.isPermisoPaginacionAltoPrestamo = isPermisoPaginacionAltoPrestamo;
	}
	
	public Boolean getIsPermisoCopiarPrestamo() {
		return isPermisoCopiarPrestamo;
	}

	public void setIsPermisoCopiarPrestamo(Boolean isPermisoCopiarPrestamo) {
		this.isPermisoCopiarPrestamo = isPermisoCopiarPrestamo;
	}
	
	public Boolean getIsPermisoVerFormPrestamo() {
		return isPermisoVerFormPrestamo;
	}

	public void setIsPermisoVerFormPrestamo(Boolean isPermisoVerFormPrestamo) {
		this.isPermisoVerFormPrestamo = isPermisoVerFormPrestamo;
	}
	
	public Boolean getIsPermisoDuplicarPrestamo() {
		return isPermisoDuplicarPrestamo;
	}

	public void setIsPermisoDuplicarPrestamo(Boolean isPermisoDuplicarPrestamo) {
		this.isPermisoDuplicarPrestamo = isPermisoDuplicarPrestamo;
	}
	
	public Boolean getIsPermisoOrdenPrestamo() {
		return isPermisoOrdenPrestamo;
	}

	public void setIsPermisoOrdenPrestamo(Boolean isPermisoOrdenPrestamo) {
		this.isPermisoOrdenPrestamo = isPermisoOrdenPrestamo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPrestamo() {
		return isVisibilidadCeldaNuevoPrestamo;
	}

	public void setIsVisibilidadCeldaNuevoPrestamo(Boolean isVisibilidadCeldaNuevoPrestamo) {
		this.isVisibilidadCeldaNuevoPrestamo = isVisibilidadCeldaNuevoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPrestamo() {
		return isVisibilidadCeldaDuplicarPrestamo;
	}

	public void setIsVisibilidadCeldaDuplicarPrestamo(Boolean isVisibilidadCeldaDuplicarPrestamo) {
		this.isVisibilidadCeldaDuplicarPrestamo = isVisibilidadCeldaDuplicarPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPrestamo() {
		return isVisibilidadCeldaCopiarPrestamo;
	}

	public void setIsVisibilidadCeldaCopiarPrestamo(Boolean isVisibilidadCeldaCopiarPrestamo) {
		this.isVisibilidadCeldaCopiarPrestamo = isVisibilidadCeldaCopiarPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPrestamo() {
		return isVisibilidadCeldaVerFormPrestamo;
	}

	public void setIsVisibilidadCeldaVerFormPrestamo(Boolean isVisibilidadCeldaVerFormPrestamo) {
		this.isVisibilidadCeldaVerFormPrestamo = isVisibilidadCeldaVerFormPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPrestamo() {
		return isVisibilidadCeldaOrdenPrestamo;
	}

	public void setIsVisibilidadCeldaOrdenPrestamo(Boolean isVisibilidadCeldaOrdenPrestamo) {
		this.isVisibilidadCeldaOrdenPrestamo = isVisibilidadCeldaOrdenPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPrestamo() {
		return isVisibilidadCeldaNuevoRelacionesPrestamo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPrestamo(Boolean isVisibilidadCeldaNuevoRelacionesPrestamo) {
		this.isVisibilidadCeldaNuevoRelacionesPrestamo = isVisibilidadCeldaNuevoRelacionesPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPrestamo() {
		return isVisibilidadCeldaModificarPrestamo;
	}

	public void setIsVisibilidadCeldaModificarPrestamo(Boolean isVisibilidadCeldaModificarPrestamo) {
		this.isVisibilidadCeldaModificarPrestamo = isVisibilidadCeldaModificarPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPrestamo() {
		return isVisibilidadCeldaActualizarPrestamo;
	}

	public void setIsVisibilidadCeldaActualizarPrestamo(Boolean isVisibilidadCeldaActualizarPrestamo) {
		this.isVisibilidadCeldaActualizarPrestamo = isVisibilidadCeldaActualizarPrestamo;
	}

	public Boolean getIsVisibilidadCeldaEliminarPrestamo() {
		return isVisibilidadCeldaEliminarPrestamo;
	}

	public void setIsVisibilidadCeldaEliminarPrestamo(Boolean isVisibilidadCeldaEliminarPrestamo) {
		this.isVisibilidadCeldaEliminarPrestamo = isVisibilidadCeldaEliminarPrestamo;
	}

	public Boolean getIsVisibilidadCeldaCancelarPrestamo() {
		return isVisibilidadCeldaCancelarPrestamo;
	}

	public void setIsVisibilidadCeldaCancelarPrestamo(Boolean isVisibilidadCeldaCancelarPrestamo) {
		this.isVisibilidadCeldaCancelarPrestamo = isVisibilidadCeldaCancelarPrestamo;
	}

	public Boolean getIsVisibilidadCeldaGuardarPrestamo() {
		return isVisibilidadCeldaGuardarPrestamo;
	}

	public void setIsVisibilidadCeldaGuardarPrestamo(Boolean isVisibilidadCeldaGuardarPrestamo) {
		this.isVisibilidadCeldaGuardarPrestamo = isVisibilidadCeldaGuardarPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPrestamo() {
		return isVisibilidadCeldaGuardarCambiosPrestamo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPrestamo(Boolean isVisibilidadCeldaGuardarCambiosPrestamo) {
		this.isVisibilidadCeldaGuardarCambiosPrestamo = isVisibilidadCeldaGuardarCambiosPrestamo;
	}
		
	public PrestamoSessionBean getprestamoSessionBean() {
		return this.prestamoSessionBean;
	}
	
	public void setprestamoSessionBean(PrestamoSessionBean prestamoSessionBean) {
		this.prestamoSessionBean=prestamoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAsientoContable() {
		return this.isVisibilidadFK_IdAsientoContable;
	}

	public void setisVisibilidadFK_IdAsientoContable(Boolean isVisibilidadFK_IdAsientoContable) {
		this.isVisibilidadFK_IdAsientoContable=isVisibilidadFK_IdAsientoContable;
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

	public Boolean getisVisibilidadFK_IdTipoCuota() {
		return this.isVisibilidadFK_IdTipoCuota;
	}

	public void setisVisibilidadFK_IdTipoCuota(Boolean isVisibilidadFK_IdTipoCuota) {
		this.isVisibilidadFK_IdTipoCuota=isVisibilidadFK_IdTipoCuota;
	}

	public Boolean getisVisibilidadFK_IdTipoPrestamo() {
		return this.isVisibilidadFK_IdTipoPrestamo;
	}

	public void setisVisibilidadFK_IdTipoPrestamo(Boolean isVisibilidadFK_IdTipoPrestamo) {
		this.isVisibilidadFK_IdTipoPrestamo=isVisibilidadFK_IdTipoPrestamo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPrestamo(Prestamo prestamo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(prestamo,null);
				this.setActualParaGuardarEmpleadoForeignKey(prestamo,null);
				this.setActualParaGuardarTipoPrestamoForeignKey(prestamo,null);
				this.setActualParaGuardarTipoCuotaForeignKey(prestamo,null);
				this.setActualParaGuardarAsientoContableForeignKey(prestamo,null);
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
	
	public void bugActualizarReferenciaActual(Prestamo prestamo,Prestamo prestamoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPrestamo(prestamo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		prestamoAux.setId(prestamo.getId());
		prestamoAux.setVersionRow(prestamo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPrestamo();
		
			int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = prestamoValidator.getInvalidValues(this.prestamo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			prestamoLogic.setDatosCliente(datosCliente);
			prestamoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				prestamoAux=new  Prestamo();
				
				prestamoAux.setIsNew(true);
				prestamoAux.setIsChanged(true);
				
				prestamoAux.setPrestamoOriginal(this.prestamo);
				
				prestamoAux.setId(this.prestamo.getId());	
				prestamoAux.setVersionRow(this.prestamo.getVersionRow());	
				prestamoAux.setid_empresa(this.prestamo.getid_empresa());	
				prestamoAux.setid_empleado(this.prestamo.getid_empleado());	
				prestamoAux.setid_tipo_prestamo(this.prestamo.getid_tipo_prestamo());	
				prestamoAux.setid_tipo_cuota(this.prestamo.getid_tipo_cuota());	
				prestamoAux.setid_asiento_contable(this.prestamo.getid_asiento_contable());	
				prestamoAux.setcodigo(this.prestamo.getcodigo());	
				prestamoAux.setnumero_pre_impreso(this.prestamo.getnumero_pre_impreso());	
				prestamoAux.setfecha(this.prestamo.getfecha());	
				prestamoAux.setmonto(this.prestamo.getmonto());	
				prestamoAux.setnumero_cuotas(this.prestamo.getnumero_cuotas());	
				prestamoAux.settasa(this.prestamo.gettasa());	
				prestamoAux.setdescripcion(this.prestamo.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.prestamoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.prestamoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(prestamoAux,prestamoLogic.getPrestamos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prestamoAux,prestamos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.prestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoLogic.savePrestamos();//WithConnection
						//prestamoLogic.getSetVersionRowPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.prestamo,prestamoAux);
					
					this.refrescarForeignKeysDescripcionesPrestamo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos().addAll(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamosEliminados);
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamos.addAll(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamosEliminados);
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prestamoLogic.savePrestamoRelaciones(prestamoAux,this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos(),this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//prestamoLogic.getSetVersionRowPrestamos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.prestamo,prestamoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.setAbonoPrestamos(new ArrayList<AbonoPrestamo>());
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamos= new ArrayList<AbonoPrestamo>();
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							prestamoAux.setAbonoPrestamos(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos());

							if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							prestamoAux.setCuotas(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.prestamoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.prestamoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(prestamoAux,prestamoLogic.getPrestamos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(prestamoAux,prestamos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.prestamo,prestamoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				prestamoAux=new  Prestamo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.prestamoSessionBean.getEsGuardarRelacionado() 
					|| (this.prestamoSessionBean.getEsGuardarRelacionado() && this.prestamo.getId()>=0)) {
						
					prestamoAux.setIsNew(false);
				}
				
				prestamoAux.setIsDeleted(false);
			
				prestamoAux.setId(this.prestamo.getId());	
				prestamoAux.setVersionRow(this.prestamo.getVersionRow());	
				prestamoAux.setid_empresa(this.prestamo.getid_empresa());	
				prestamoAux.setid_empleado(this.prestamo.getid_empleado());	
				prestamoAux.setid_tipo_prestamo(this.prestamo.getid_tipo_prestamo());	
				prestamoAux.setid_tipo_cuota(this.prestamo.getid_tipo_cuota());	
				prestamoAux.setid_asiento_contable(this.prestamo.getid_asiento_contable());	
				prestamoAux.setcodigo(this.prestamo.getcodigo());	
				prestamoAux.setnumero_pre_impreso(this.prestamo.getnumero_pre_impreso());	
				prestamoAux.setfecha(this.prestamo.getfecha());	
				prestamoAux.setmonto(this.prestamo.getmonto());	
				prestamoAux.setnumero_cuotas(this.prestamo.getnumero_cuotas());	
				prestamoAux.settasa(this.prestamo.gettasa());	
				prestamoAux.setdescripcion(this.prestamo.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(prestamoAux,prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prestamoAux,prestamos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.prestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoLogic.savePrestamos();//WithConnection
						//prestamoLogic.getSetVersionRowPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.prestamo,prestamoAux);
					
					this.refrescarForeignKeysDescripcionesPrestamo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos().addAll(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamosEliminados);
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamos.addAll(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamosEliminados);
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prestamoLogic.savePrestamoRelaciones(prestamoAux,this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos(),this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//prestamoLogic.getSetVersionRowPrestamos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.prestamo,prestamoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.setAbonoPrestamos(new ArrayList<AbonoPrestamo>());
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamos= new ArrayList<AbonoPrestamo>();
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							prestamoAux.setAbonoPrestamos(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos());

							if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							prestamoAux.setCuotas(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.prestamoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.prestamoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(prestamoAux,prestamoLogic.getPrestamos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(prestamoAux,prestamos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.prestamo,prestamoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				prestamoAux=new  Prestamo();
				
				prestamoAux.setIsNew(false);
				prestamoAux.setIsChanged(false);
				
				prestamoAux.setIsDeleted(true);
				
				prestamoAux.setId(this.prestamo.getId());	
				prestamoAux.setVersionRow(this.prestamo.getVersionRow());	
				prestamoAux.setid_empresa(this.prestamo.getid_empresa());	
				prestamoAux.setid_empleado(this.prestamo.getid_empleado());	
				prestamoAux.setid_tipo_prestamo(this.prestamo.getid_tipo_prestamo());	
				prestamoAux.setid_tipo_cuota(this.prestamo.getid_tipo_cuota());	
				prestamoAux.setid_asiento_contable(this.prestamo.getid_asiento_contable());	
				prestamoAux.setcodigo(this.prestamo.getcodigo());	
				prestamoAux.setnumero_pre_impreso(this.prestamo.getnumero_pre_impreso());	
				prestamoAux.setfecha(this.prestamo.getfecha());	
				prestamoAux.setmonto(this.prestamo.getmonto());	
				prestamoAux.setnumero_cuotas(this.prestamo.getnumero_cuotas());	
				prestamoAux.settasa(this.prestamo.gettasa());	
				prestamoAux.setdescripcion(this.prestamo.getdescripcion());	
				
				if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.prestamoAux.getId()>=0) {	
						this.prestamosEliminados.add(prestamoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(prestamoAux,prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prestamoAux,prestamos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.prestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoLogic.savePrestamos();//WithConnection
						//prestamoLogic.getSetVersionRowPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos().addAll(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamosEliminados);
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas().addAll(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamos.addAll(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamosEliminados);
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotas.addAll(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prestamoLogic.savePrestamoRelaciones(prestamoAux,this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos(),this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());//WithConnection
								//prestamoLogic.getSetVersionRowPrestamos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.setAbonoPrestamos(new ArrayList<AbonoPrestamo>());
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(new ArrayList<Cuota>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamos= new ArrayList<AbonoPrestamo>();
							this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotas= new ArrayList<Cuota>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							prestamoAux.setAbonoPrestamos(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos());

							if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();}
							prestamoAux.setCuotas(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.prestamoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.prestamoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(prestamoAux,prestamoLogic.getPrestamos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(prestamoAux,prestamos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getPrestamos().addAll(this.prestamosEliminados);
					
					prestamoLogic.savePrestamos();//WithConnection
					//prestamoLogic.getSetVersionRowPrestamos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPrestamo();
				
				this.prestamosEliminados= new ArrayList<Prestamo>();		
			}
			
			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Prestamo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.prestamo=prestamoAux;
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
      		//this.finishProcessPrestamo();
      	}
		
	}	
	
	public void actualizarRelaciones(Prestamo prestamoLocal) throws Exception {
		
		if(this.prestamoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				prestamoLocal.setAbonoPrestamos(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos());
				prestamoLocal.setCuotas(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
			
			} else {
			
				prestamoLocal.setAbonoPrestamos(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamos);
				prestamoLocal.setCuotas(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Prestamo prestamoLocal) throws Exception {	
		if(this.prestamoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				prestamoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				prestamoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPrestamoDetalleFormJInternalFrame.class)) {
				TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrameLocal=(TipoPrestamoBeanSwingJInternalFrame) ((TipoPrestamoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprestamoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPrestamo(tipoprestamoBeanSwingJInternalFrameLocal.gettipoprestamo(),true);
				tipoprestamoBeanSwingJInternalFrameLocal.actualizarLista(tipoprestamoBeanSwingJInternalFrameLocal.tipoprestamo,this.tipoprestamosForeignKey);

				tipoprestamoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprestamoBeanSwingJInternalFrameLocal.tipoprestamo);

				prestamoLocal.setTipoPrestamo(tipoprestamoBeanSwingJInternalFrameLocal.tipoprestamo);

				this.addItemDefectoCombosForeignKeyTipoPrestamo();
				this.cargarCombosFrameTipoPrestamosForeignKey("Formulario");
				this.setActualTipoPrestamoForeignKey(tipoprestamoBeanSwingJInternalFrameLocal.tipoprestamo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCuotaDetalleFormJInternalFrame.class)) {
				TipoCuotaBeanSwingJInternalFrame tipocuotaBeanSwingJInternalFrameLocal=(TipoCuotaBeanSwingJInternalFrame) ((TipoCuotaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocuotaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCuota(tipocuotaBeanSwingJInternalFrameLocal.gettipocuota(),true);
				tipocuotaBeanSwingJInternalFrameLocal.actualizarLista(tipocuotaBeanSwingJInternalFrameLocal.tipocuota,this.tipocuotasForeignKey);

				tipocuotaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocuotaBeanSwingJInternalFrameLocal.tipocuota);

				prestamoLocal.setTipoCuota(tipocuotaBeanSwingJInternalFrameLocal.tipocuota);

				this.addItemDefectoCombosForeignKeyTipoCuota();
				this.cargarCombosFrameTipoCuotasForeignKey("Formulario");
				this.setActualTipoCuotaForeignKey(tipocuotaBeanSwingJInternalFrameLocal.tipocuota.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				prestamoLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPrestamoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = prestamoValidator.getInvalidValues(this.prestamo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Prestamo prestamo,List<Prestamo> prestamos) throws Exception {
		try	{		
			PrestamoConstantesFunciones.actualizarLista(prestamo,prestamos,this.prestamoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Prestamo prestamo,List<Prestamo> prestamos) throws Exception {
		try	{			
			PrestamoConstantesFunciones.actualizarSelectedLista(prestamo,prestamos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Prestamo> prestamosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				prestamosLocal=this.prestamoLogic.getPrestamos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				prestamosLocal=this.prestamos;
			}
			//ARCHITECTURE
		
			for(Prestamo prestamoLocal:prestamosLocal) {
				if(this.permiteMantenimiento(prestamoLocal) && prestamoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PrestamoConstantesFunciones.getPrestamoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelid_empresaPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelid_empleadoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.IDTIPOPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelid_tipo_prestamoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.IDTIPOCUOTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelid_tipo_cuotaPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelid_asiento_contablePrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelcodigoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelnumero_pre_impresoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelfechaPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelmontoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.NUMEROCUOTAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelnumero_cuotasPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.TASA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabeltasaPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrestamoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabeldescripcionPrestamo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelid_empresaPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelid_empleadoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelid_tipo_prestamoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelid_tipo_cuotaPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelid_asiento_contablePrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelcodigoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelnumero_pre_impresoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelfechaPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelmontoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabelnumero_cuotasPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabeltasaPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrestamo.jLabeldescripcionPrestamo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("AbonoPrestamo")) {
			if(this.prestamo==null) {
				this.prestamo= new Prestamo();
			}

			if(this.prestamoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPrestamo
				this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);

				this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.getabonoprestamo().setPrestamo(this.prestamo);
			}

			return;
		}
		 else  if(sTipo.equals("Cuota")) {
			if(this.prestamo==null) {
				this.prestamo= new Prestamo();
			}

			if(this.prestamoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPrestamo
				this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);

				this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.getcuota().setPrestamo(this.prestamo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPrestamo--;	
		
		
		this.prestamoAux=new Prestamo();
		
		this.prestamoAux.setId(this.iIdNuevoPrestamo);
		this.prestamoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.prestamoLogic.getPrestamos().add(this.prestamoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.prestamos.add(this.prestamoAux);
		}
		//ARCHITECTURE
		
		this.prestamo=this.prestamoAux;
		
		if(PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPrestamo(this.prestamo);
			this.setVariablesObjetoActualToFormularioForeignKeyPrestamo(this.prestamo);
		}
				
		//this.setDefaultControlesPrestamo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPrestamo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPrestamo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPrestamo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPrestamo(this.prestamoBean,this.prestamo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PrestamoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.prestamoSessionBean.getConGuardarRelaciones()) {
			classes=PrestamoConstantesFunciones.getClassesRelationshipsOfPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.prestamoReturnGeneral=prestamoLogic.procesarEventosPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prestamoLogic.getPrestamos(),this.prestamo,this.prestamoParameterGeneral,this.isEsNuevoPrestamo,classes);//this.prestamoLogic.getPrestamo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPrestamo(this.prestamoReturnGeneral,this.prestamoBean,false);
		
		if(this.prestamoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPrestamo(this.prestamoReturnGeneral.getPrestamo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPrestamo(this.prestamoReturnGeneral.getPrestamo());
		}
		
		if(this.prestamoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPrestamo(this.prestamoReturnGeneral.getPrestamo(),classes);//this.prestamoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPrestamo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPrestamo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PrestamoBeanSwingJInternalFrameAdditional.RecargarFormPrestamo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPrestamo(false);
						
			if(prestamoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.getEsGuardarRelacionado() && AbonoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAbonoPrestamoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado() && CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuotaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrestamo();
			}
			
			this.actualizarVisualTableDatosPrestamo();
			
			this.jTableDatosPrestamo.setRowSelectionInterval(this.getIndiceNuevoPrestamo(), this.getIndiceNuevoPrestamo());
			
			this.seleccionarFilaTablaPrestamoActual();
						
			this.actualizarEstadoCeldasBotonesPrestamo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPrestamo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPrestamo.jTextFieldcodigoPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarcodigoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_pre_impresoPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarnumero_pre_impresoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jDateChooserfechaPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarfechaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldmontoPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarmontoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_cuotasPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarnumero_cuotasPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldtasaPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activartasaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextAreadescripcionPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activardescripcionPrestamo);	
		//
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarid_empresaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarid_empleadoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarid_tipo_prestamoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarid_tipo_cuotaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setEnabled(isHabilitar && this.prestamoConstantesFunciones.activarid_asiento_contablePrestamo);
	};
	
	public void setDefaultControlesPrestamo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPrestamo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.prestamoSessionBean.setConGuardarRelaciones(true);			
			this.prestamoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.prestamoSessionBean.setConGuardarRelaciones(false);			
			this.prestamoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPrestamo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
				if(prestamoAux.getId().equals(this.iIdNuevoPrestamo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Prestamo prestamoAux:this.prestamos) {
				if(prestamoAux.getId().equals(this.iIdNuevoPrestamo)) {
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
	
	public int getIndiceActualPrestamo(Prestamo prestamo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
				if(prestamoAux.getId().equals(prestamo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Prestamo prestamoAux:this.prestamos) {
				if(prestamoAux.getId().equals(prestamo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPrestamo(Prestamo prestamoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
				if(prestamoAux.getPrestamoOriginal().getId().equals(prestamoOriginal.getId())) {
					existe=true;
					prestamoOriginal.setId(prestamoAux.getId());
					prestamoOriginal.setVersionRow(prestamoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Prestamo prestamoAux:this.prestamos) {
				if(prestamoAux.getPrestamoOriginal().getId().equals(prestamoOriginal.getId())) {
					existe=true;
					prestamoOriginal.setId(prestamoAux.getId());
					prestamoOriginal.setVersionRow(prestamoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPrestamo(Boolean esParaCancelar) throws Exception {
		prestamosAux=new ArrayList<Prestamo>();
		prestamoAux=new Prestamo();
		
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
					if(prestamoAux.getId()<0) {
						prestamosAux.add(prestamoAux);
					}		
				}
				this.iIdNuevoPrestamo=0L;
				this.prestamoLogic.getPrestamos().removeAll(prestamosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Prestamo prestamoAux:this.prestamos) {
					if(prestamoAux.getId()<0) {
						prestamosAux.add(prestamoAux);
					}		
				}
				this.iIdNuevoPrestamo=0L;
				this.prestamos.removeAll(prestamosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPrestamo 
					&& this.prestamoLogic.getPrestamos().size()>0
					) {
					prestamoAux=this.prestamoLogic.getPrestamos().get(this.prestamoLogic.getPrestamos().size() - 1);
				
					if(prestamoAux.getId()<0) {
						this.prestamoLogic.getPrestamos().remove(prestamoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPrestamo && this.prestamos.size()>0) {
					prestamoAux=this.prestamos.get(this.prestamos.size() - 1);
				
					if(prestamoAux.getId()<0) {
						this.prestamos.remove(prestamoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPrestamo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(prestamo.getId()<0) {
				this.prestamoLogic.getPrestamos().remove(this.prestamo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(prestamo.getId()<0) {
				this.prestamos.remove(this.prestamo);
			}
		}			
	}
	
	public void setEstadosInicialesPrestamo(List<Prestamo> prestamosAux) throws Exception {
		PrestamoConstantesFunciones.setEstadosInicialesPrestamo(prestamosAux);
	}
	
	public void setEstadosInicialesPrestamo(Prestamo prestamoAux) throws Exception {
		PrestamoConstantesFunciones.setEstadosInicialesPrestamo(prestamoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPrestamoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPrestamoActual()) {
				if(!this.isEsNuevoPrestamo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPrestamo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPrestamoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Prestamo ?", "MANTENIMIENTO DE Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Prestamo prestamo) throws Exception {
		PrestamoConstantesFunciones.seleccionarAsignar(this.prestamo,prestamo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPrestamo=this.isPermisoActualizarOriginalPrestamo;
			
			
			this.seleccionarAsignar(prestamo);
			
			

			idEmpleadoActual=prestamo.getid_empleado();
			this.seleccionarEmpleadoActual();

			idAsientoContableActual=prestamo.getid_asiento_contable();
			this.seleccionarAsientoContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PrestamoConstantesFunciones.quitarEspaciosPrestamo(this.prestamo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.prestamoSessionBean.setsFuncionBusquedaRapida(this.prestamoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarAsientoContableActual() throws Exception {
		try	{
			AsientoContable asientocontableAux=new AsientoContable();

			if(this.idAsientoContableActual != null && this.idAsientoContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(this.idAsientoContableActual);
					asientocontableAux= asientocontableLogic.getAsientoContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				asientocontablesForeignKey=new ArrayList<AsientoContable>();
				asientocontablesForeignKey.add(asientocontableAux);
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
			if(this.isEsNuevoPrestamo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPrestamo(esParaCancelar);				
				this.cancelarNuevoPrestamo(esParaCancelar);								
			}
			
			this.prestamo=new Prestamo();
			
			this.inicializarPrestamo();
			
			this.actualizarEstadoCeldasBotonesPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPrestamo() throws Exception {
		try {
			PrestamoConstantesFunciones.inicializarPrestamo(this.prestamo);
			
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
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.prestamoLogic.getPrestamos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePrestamos(String sAccionBusqueda,List<Prestamo> prestamosParaReportes) throws Exception {
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
					sPathReporteFinal="Prestamo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PrestamoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PrestamoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Prestamo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Prestamos");		
		parameters.put("busquedapor", PrestamoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(AbonoPrestamo.class));
			classes.add(new Classe(Cuota.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PrestamoLogic prestamoLogicAuxiliar=new PrestamoLogic();
					prestamoLogicAuxiliar.setDatosCliente(prestamoLogic.getDatosCliente());				
					prestamoLogicAuxiliar.setPrestamos(prestamosParaReportes);
					
					prestamoLogicAuxiliar.cargarRelacionesLoteForeignKeyPrestamoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					prestamosParaReportes=prestamoLogicAuxiliar.getPrestamos();
					
					//prestamoLogic.getNewConnexionToDeep();
					
					//for (Prestamo prestamo:prestamosParaReportes) {
					//	prestamoLogic.deepLoad(prestamo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//prestamoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//prestamoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileAbonoPrestamo = AuxiliarReportes.class.getResourceAsStream("AbonoPrestamoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_abonoprestamo", reportFileAbonoPrestamo);

			InputStream reportFileCuota = AuxiliarReportes.class.getResourceAsStream("CuotaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuota", reportFileCuota);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePrestamo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePrestamo=new JRBeanArrayDataSource(PrestamoJInternalFrame.TraerPrestamoBeans(prestamosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePrestamo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PrestamoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PrestamoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PrestamoBean.TraerPrestamoBeans(prestamosParaReportes).toArray()));
							
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
				this.generarExcelReportePrestamos(sAccionBusqueda,sTipoArchivoReporte,prestamosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPrestamos(sAccionBusqueda,sTipoArchivoReporte,prestamosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPrestamoActionPerformed(null);
					//this.generarExcelReportePrestamos(sAccionBusqueda,sTipoArchivoReporte,prestamosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPrestamos(sAccionBusqueda,sTipoArchivoReporte,prestamosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPrestamos(sAccionBusqueda,sTipoArchivoReporte,prestamosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPrestamos(sAccionBusqueda,sTipoArchivoReporte,prestamosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<Prestamo> prestamosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prestamo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Prestamos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPrestamo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Prestamo prestamo : prestamosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PrestamoConstantesFunciones.generarExcelReporteDataPrestamo("NORMAL",row,workbook,prestamo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPrestamo(String sTipo,Row row,Workbook workbook) {
		
		PrestamoConstantesFunciones.generarExcelReporteHeaderPrestamo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<Prestamo> prestamosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prestamo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Prestamos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Prestamo prestamo : prestamosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PrestamoConstantesFunciones.getPrestamoDescripcion(prestamo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.gettipoprestamo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.gettipocuota_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getnumero_cuotas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_TASA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_TASA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.gettasa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrestamoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrestamoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prestamo.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<Prestamo> prestamosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Prestamo> prestamosRespaldo=null;
		
		classes=PrestamoConstantesFunciones.getClassesRelationshipsOfPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.prestamoLogic.setDatosCliente(this.datosCliente);
		this.prestamoLogic.setDatosDeep(this.datosDeep);
		this.prestamoLogic.setIsConDeep(true);
		
		prestamosRespaldo=this.prestamoLogic.getPrestamos();
		
		this.prestamoLogic.setPrestamos(prestamosParaReportes);	
		this.prestamoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		prestamosParaReportes=this.prestamoLogic.getPrestamos();
		this.prestamoLogic.setPrestamos(prestamosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prestamo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Prestamos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPrestamo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Prestamo prestamo : prestamosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPrestamo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PrestamoConstantesFunciones.generarExcelReporteDataPrestamo("NORMAL",row,workbook,prestamo,cellStyleDataAux);
		
			
			


				//AbonoPrestamo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO))) {

				if(prestamo.getAbonoPrestamos()!=null && prestamo.getAbonoPrestamos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AbonoPrestamoConstantesFunciones.generarExcelReporteHeaderAbonoPrestamo("RELACIONADO",row,workbook);
				}

				if(prestamo.getAbonoPrestamos()!=null) {
					i2=0;
					for(AbonoPrestamo abonoprestamo : prestamo.getAbonoPrestamos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AbonoPrestamoConstantesFunciones.generarExcelReporteDataAbonoPrestamo("RELACIONADO",row,workbook,abonoprestamo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cuota
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuotaConstantesFunciones.SCLASSWEBTITULO))) {

				if(prestamo.getCuotas()!=null && prestamo.getCuotas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuotaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuotaConstantesFunciones.generarExcelReporteHeaderCuota("RELACIONADO",row,workbook);
				}

				if(prestamo.getCuotas()!=null) {
					i2=0;
					for(Cuota cuota : prestamo.getCuotas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuotaConstantesFunciones.generarExcelReporteDataCuota("RELACIONADO",row,workbook,cuota,cellStyleDataAuxHijo);
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
		cell.setCellValue(PrestamoConstantesFunciones.getPrestamoDescripcion(prestamo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPrestamo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPrestamo() throws Exception {		
		this.startProcessPrestamo(true);
	}
	
	public void startProcessPrestamo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPrestamo ,this.jPanelParametrosReportesPrestamo, this.jScrollPanelDatosPrestamo,this.jPanelPaginacionPrestamo, this.jScrollPanelDatosEdicionPrestamo, this.jPanelAccionesPrestamo,this.jPanelAccionesFormularioPrestamo,this.jmenuBarPrestamo,this.jmenuBarDetallePrestamo,this.jTtoolBarPrestamo,this.jTtoolBarDetallePrestamo);		
		
		final JTabbedPane jTabbedPaneBusquedasPrestamo=this.jTabbedPaneBusquedasPrestamo; 
		
		final JPanel jPanelParametrosReportesPrestamo=this.jPanelParametrosReportesPrestamo;
		//final JScrollPane jScrollPanelDatosPrestamo=this.jScrollPanelDatosPrestamo;
		final JTable jTableDatosPrestamo=this.jTableDatosPrestamo;		
		final JPanel jPanelPaginacionPrestamo=this.jPanelPaginacionPrestamo;
		//final JScrollPane jScrollPanelDatosEdicionPrestamo=this.jScrollPanelDatosEdicionPrestamo;
		final JPanel jPanelAccionesPrestamo=this.jPanelAccionesPrestamo;
		
		JPanel jPanelCamposAuxiliarPrestamo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPrestamo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
			jPanelCamposAuxiliarPrestamo=this.jInternalFrameDetalleFormPrestamo.jPanelCamposPrestamo;
			jPanelAccionesFormularioAuxiliarPrestamo=this.jInternalFrameDetalleFormPrestamo.jPanelAccionesFormularioPrestamo;
		}
		
		final JPanel jPanelCamposPrestamo=jPanelCamposAuxiliarPrestamo;
		final JPanel jPanelAccionesFormularioPrestamo=jPanelAccionesFormularioAuxiliarPrestamo;
		
		
		final JMenuBar jmenuBarPrestamo=this.jmenuBarPrestamo;
		final JToolBar jTtoolBarPrestamo=this.jTtoolBarPrestamo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPrestamo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPrestamo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
			jmenuBarDetalleAuxiliarPrestamo=this.jInternalFrameDetalleFormPrestamo.jmenuBarDetallePrestamo;
			jTtoolBarDetalleAuxiliarPrestamo=this.jInternalFrameDetalleFormPrestamo.jTtoolBarDetallePrestamo;
		}
		
		final JMenuBar jmenuBarDetallePrestamo=jmenuBarDetalleAuxiliarPrestamo;
		final JToolBar jTtoolBarDetallePrestamo=jTtoolBarDetalleAuxiliarPrestamo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPrestamo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPrestamo;
			processRunnable.jTableDatos=jTableDatosPrestamo;
			processRunnable.jPanelCampos=jPanelCamposPrestamo;
			processRunnable.jPanelPaginacion=jPanelPaginacionPrestamo;
			processRunnable.jPanelAcciones=jPanelAccionesPrestamo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPrestamo;
			
			
			processRunnable.jmenuBar=jmenuBarPrestamo;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePrestamo;
			processRunnable.jTtoolBar=jTtoolBarPrestamo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePrestamo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPrestamo ,jPanelParametrosReportesPrestamo,jTableDatosPrestamo, /*jScrollPanelDatosPrestamo,*/jPanelCamposPrestamo,jPanelPaginacionPrestamo, /*jScrollPanelDatosEdicionPrestamo,*/ jPanelAccionesPrestamo,jPanelAccionesFormularioPrestamo,jmenuBarPrestamo,jmenuBarDetallePrestamo,jTtoolBarPrestamo,jTtoolBarDetallePrestamo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPrestamo ,jPanelParametrosReportesPrestamo, jScrollPanelDatosPrestamo,jPanelPaginacionPrestamo, jScrollPanelDatosEdicionPrestamo, jPanelAccionesPrestamo,jPanelAccionesFormularioPrestamo,jmenuBarPrestamo,jmenuBarDetallePrestamo,jTtoolBarPrestamo,jTtoolBarDetallePrestamo);
						
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
	
	public void finishProcessPrestamo() {// throws Exception 
		this.finishProcessPrestamo(true);
	}
	
	public void finishProcessPrestamo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPrestamo ,this.jPanelParametrosReportesPrestamo, this.jScrollPanelDatosPrestamo,this.jPanelPaginacionPrestamo, this.jScrollPanelDatosEdicionPrestamo, this.jPanelAccionesPrestamo,this.jPanelAccionesFormularioPrestamo,this.jmenuBarPrestamo,this.jmenuBarDetallePrestamo,this.jTtoolBarPrestamo,this.jTtoolBarDetallePrestamo);		
		
		final JTabbedPane jTabbedPaneBusquedasPrestamo=this.jTabbedPaneBusquedasPrestamo; 
		
		final JPanel jPanelParametrosReportesPrestamo=this.jPanelParametrosReportesPrestamo;
		//final JScrollPane jScrollPanelDatosPrestamo=this.jScrollPanelDatosPrestamo;
		final JTable jTableDatosPrestamo=this.jTableDatosPrestamo;		
		final JPanel jPanelPaginacionPrestamo=this.jPanelPaginacionPrestamo;
		//final JScrollPane jScrollPanelDatosEdicionPrestamo=this.jScrollPanelDatosEdicionPrestamo;
		final JPanel jPanelAccionesPrestamo=this.jPanelAccionesPrestamo;
		
		JPanel jPanelCamposAuxiliarPrestamo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPrestamo=new JPanel();
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
			jPanelCamposAuxiliarPrestamo=this.jInternalFrameDetalleFormPrestamo.jPanelCamposPrestamo;
			jPanelAccionesFormularioAuxiliarPrestamo=this.jInternalFrameDetalleFormPrestamo.jPanelAccionesFormularioPrestamo;
		}
		
		final JPanel jPanelCamposPrestamo=jPanelCamposAuxiliarPrestamo;
		final JPanel jPanelAccionesFormularioPrestamo=jPanelAccionesFormularioAuxiliarPrestamo;
		
		
		final JMenuBar jmenuBarPrestamo=this.jmenuBarPrestamo;		
		final JToolBar jTtoolBarPrestamo=this.jTtoolBarPrestamo;
				
		JMenuBar jmenuBarDetalleAuxiliarPrestamo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPrestamo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
			jmenuBarDetalleAuxiliarPrestamo=this.jInternalFrameDetalleFormPrestamo.jmenuBarDetallePrestamo;
			jTtoolBarDetalleAuxiliarPrestamo=this.jInternalFrameDetalleFormPrestamo.jTtoolBarDetallePrestamo;		
		}
		
		final JMenuBar jmenuBarDetallePrestamo=jmenuBarDetalleAuxiliarPrestamo;
		final JToolBar jTtoolBarDetallePrestamo=jTtoolBarDetalleAuxiliarPrestamo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPrestamo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPrestamo;
			processRunnable.jTableDatos=jTableDatosPrestamo;
			processRunnable.jPanelCampos=jPanelCamposPrestamo;
			processRunnable.jPanelPaginacion=jPanelPaginacionPrestamo;
			processRunnable.jPanelAcciones=jPanelAccionesPrestamo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPrestamo;
			
			
			processRunnable.jmenuBar=jmenuBarPrestamo;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePrestamo;
			processRunnable.jTtoolBar=jTtoolBarPrestamo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePrestamo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPrestamo ,jPanelParametrosReportesPrestamo, jTableDatosPrestamo,/*jScrollPanelDatosPrestamo,*/jPanelCamposPrestamo,jPanelPaginacionPrestamo, /*jScrollPanelDatosEdicionPrestamo,*/ jPanelAccionesPrestamo,jPanelAccionesFormularioPrestamo,jmenuBarPrestamo,jmenuBarDetallePrestamo,jTtoolBarPrestamo,jTtoolBarDetallePrestamo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPrestamo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPrestamo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPrestamo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePrestamo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPrestamo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePrestamo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.prestamoConstantesFunciones.getsFinalQueryPrestamo();
		String  finalQueryPaginacionTodos=this.prestamoConstantesFunciones.getsFinalQueryPrestamo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PrestamoConstantesFunciones.getArrayColumnasGlobalesNoPrestamo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PrestamoConstantesFunciones.getArrayColumnasGlobalesPrestamo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PrestamoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.prestamosEliminados= new ArrayList<Prestamo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPrestamo();
		
				///*PrestamoSessionBean*/this.prestamoSessionBean=new PrestamoSessionBean();
			
			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
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
					this.iNumeroPaginacion=PrestamoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PrestamoConstantesFunciones.getClassesForeignKeysOfPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/prestamo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			prestamosAux= new ArrayList<Prestamo>();
			
				
			prestamoLogic.setDatosCliente(this.datosCliente);
			prestamoLogic.setDatosDeep(this.datosDeep);
			prestamoLogic.setIsConDeep(true);
			
			
			prestamoLogic.getPrestamoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					prestamoLogic.getTodosPrestamos(finalQueryGlobal,pagination);
					
					//prestamoLogic.getTodosPrestamosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(prestamoLogic.getPrestamos()==null|| prestamoLogic.getPrestamos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prestamosAux= new ArrayList<Prestamo>();
							prestamosAux.addAll(prestamoLogic.getPrestamos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamosAux= new ArrayList<Prestamo>();
							prestamosAux.addAll(prestamos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prestamoLogic.getTodosPrestamos(finalQueryGlobal+"",this.pagination);												
							
							//prestamoLogic.getTodosPrestamosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePrestamos("Todos",prestamoLogic.getPrestamos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prestamoLogic.setPrestamos(new ArrayList<Prestamo>());					
							prestamoLogic.getPrestamos().addAll(prestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamos=new ArrayList<Prestamo>();
							prestamos.addAll(prestamosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPrestamo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPrestamo=this.idActual;
				
				} else if(this.idPrestamoActual!=null && this.idPrestamoActual!=0L) {
					idPrestamo=idPrestamoActual;
				}
				
					
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndicePorId(idPrestamo);
				
				this.prestamos=new ArrayList<Prestamo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					prestamoLogic.getEntity(idPrestamo);
					
					//prestamoLogic.getEntityWithConnection(idPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
					prestamoLogic.getPrestamos().add(prestamoLogic.getPrestamo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prestamos=new ArrayList<Prestamo>();
					this.prestamos.add(prestamo);
				}
				
				if(prestamoLogic.getPrestamo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAsientoContable")) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					prestamoLogic.getPrestamosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=prestamoLogic.getPrestamos()==null||prestamoLogic.getPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=prestamos==null|| prestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamosAux=new ArrayList<Prestamo>();
						prestamosAux.addAll(prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamosAux=new ArrayList<Prestamo>();
							prestamosAux.addAll(prestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							prestamoLogic.getPrestamosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrestamos("FK_IdAsientoContable",prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrestamos("FK_IdAsientoContable",prestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
						prestamoLogic.getPrestamos().addAll(prestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamos=new ArrayList<Prestamo>();
							prestamos.addAll(prestamosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					prestamoLogic.getPrestamosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=prestamoLogic.getPrestamos()==null||prestamoLogic.getPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=prestamos==null|| prestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamosAux=new ArrayList<Prestamo>();
						prestamosAux.addAll(prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamosAux=new ArrayList<Prestamo>();
							prestamosAux.addAll(prestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							prestamoLogic.getPrestamosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrestamos("FK_IdEmpleado",prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrestamos("FK_IdEmpleado",prestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
						prestamoLogic.getPrestamos().addAll(prestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamos=new ArrayList<Prestamo>();
							prestamos.addAll(prestamosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					prestamoLogic.getPrestamosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=prestamoLogic.getPrestamos()==null||prestamoLogic.getPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=prestamos==null|| prestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamosAux=new ArrayList<Prestamo>();
						prestamosAux.addAll(prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamosAux=new ArrayList<Prestamo>();
							prestamosAux.addAll(prestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							prestamoLogic.getPrestamosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrestamos("FK_IdEmpresa",prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrestamos("FK_IdEmpresa",prestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
						prestamoLogic.getPrestamos().addAll(prestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamos=new ArrayList<Prestamo>();
							prestamos.addAll(prestamosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCuota")) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoCuota(id_tipo_cuotaFK_IdTipoCuota);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					prestamoLogic.getPrestamosFK_IdTipoCuota(finalQueryGlobal,pagination,id_tipo_cuotaFK_IdTipoCuota);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoCuota(id_tipo_cuotaFK_IdTipoCuota);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoCuota(id_tipo_cuotaFK_IdTipoCuota);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=prestamoLogic.getPrestamos()==null||prestamoLogic.getPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=prestamos==null|| prestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamosAux=new ArrayList<Prestamo>();
						prestamosAux.addAll(prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamosAux=new ArrayList<Prestamo>();
							prestamosAux.addAll(prestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							prestamoLogic.getPrestamosFK_IdTipoCuota(finalQueryGlobal,pagination,id_tipo_cuotaFK_IdTipoCuota);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoCuota(id_tipo_cuotaFK_IdTipoCuota);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoCuota(id_tipo_cuotaFK_IdTipoCuota);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrestamos("FK_IdTipoCuota",prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrestamos("FK_IdTipoCuota",prestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
						prestamoLogic.getPrestamos().addAll(prestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamos=new ArrayList<Prestamo>();
							prestamos.addAll(prestamosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPrestamo")) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_tipo_prestamoFK_IdTipoPrestamo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					prestamoLogic.getPrestamosFK_IdTipoPrestamo(finalQueryGlobal,pagination,id_tipo_prestamoFK_IdTipoPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_tipo_prestamoFK_IdTipoPrestamo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_tipo_prestamoFK_IdTipoPrestamo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=prestamoLogic.getPrestamos()==null||prestamoLogic.getPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=prestamos==null|| prestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamosAux=new ArrayList<Prestamo>();
						prestamosAux.addAll(prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamosAux=new ArrayList<Prestamo>();
							prestamosAux.addAll(prestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							prestamoLogic.getPrestamosFK_IdTipoPrestamo(finalQueryGlobal,pagination,id_tipo_prestamoFK_IdTipoPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_tipo_prestamoFK_IdTipoPrestamo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_tipo_prestamoFK_IdTipoPrestamo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrestamos("FK_IdTipoPrestamo",prestamoLogic.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrestamos("FK_IdTipoPrestamo",prestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
						prestamoLogic.getPrestamos().addAll(prestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamos=new ArrayList<Prestamo>();
							prestamos.addAll(prestamosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPrestamo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPrestamo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=prestamoLogic.getPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prestamos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=prestamoLogic.getPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prestamos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Prestamo prestamo) {
		Boolean permite=true;
		
		if(this.prestamo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PrestamoConstantesFunciones.getOrderByListaPrestamo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PrestamoConstantesFunciones.getOrderByListaPrestamo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Prestamo prestamo:prestamoLogic.getPrestamos()) {
				if(prestamo.getsType().equals(Constantes2.S_TOTALES)) {
					prestamoTotales=prestamo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Prestamo prestamo:this.prestamos) {
				if(prestamo.getsType().equals(Constantes2.S_TOTALES)) {
					prestamoTotales=prestamo;
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
			this.prestamoAux=new Prestamo();
			this.prestamoAux.setsType(Constantes2.S_TOTALES);
			this.prestamoAux.setIsNew(false);
			this.prestamoAux.setIsChanged(false);
			this.prestamoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PrestamoConstantesFunciones.TotalizarValoresFilaPrestamo(this.prestamoLogic.getPrestamos(),this.prestamoAux);
				
				this.prestamoLogic.getPrestamos().add(this.prestamoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PrestamoConstantesFunciones.TotalizarValoresFilaPrestamo(this.prestamos,this.prestamoAux);
				
				this.prestamos.add(this.prestamoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		prestamoTotales=new Prestamo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.prestamoLogic.getPrestamos().remove(prestamoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.prestamos.remove(prestamoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		prestamoTotales=new Prestamo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Prestamo prestamo:prestamoLogic.getPrestamos()) {
				if(prestamo.getsType().equals(Constantes2.S_TOTALES)) {
					prestamoTotales=prestamo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PrestamoConstantesFunciones.TotalizarValoresFilaPrestamo(this.prestamoLogic.getPrestamos(),prestamoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Prestamo prestamo:this.prestamos) {
				if(prestamo.getsType().equals(Constantes2.S_TOTALES)) {
					prestamoTotales=prestamo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PrestamoConstantesFunciones.TotalizarValoresFilaPrestamo(this.prestamos,prestamoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPrestamosFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPrestamosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPrestamosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPrestamosFK_IdTipoCuota()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCuota";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPrestamosFK_IdTipoPrestamo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrestamo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPrestamosFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getPrestamosFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPrestamosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getPrestamosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPrestamosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getPrestamosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPrestamosFK_IdTipoCuota(String sFinalQuery,Long id_tipo_cuota)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getPrestamosFK_IdTipoCuota(sFinalQuery,this.pagination,id_tipo_cuota);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPrestamosFK_IdTipoPrestamo(String sFinalQuery,Long id_tipo_prestamo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getPrestamosFK_IdTipoPrestamo(sFinalQuery,this.pagination,id_tipo_prestamo);
				
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
	
	public void inicializarPermisosPrestamo() {
		this.isPermisoTodoPrestamo=false;
		this.isPermisoNuevoPrestamo=false;
		this.isPermisoActualizarPrestamo=false;
		this.isPermisoActualizarOriginalPrestamo=false;
		this.isPermisoEliminarPrestamo=false;
		this.isPermisoGuardarCambiosPrestamo=false;
		this.isPermisoConsultaPrestamo=false;
		this.isPermisoBusquedaPrestamo=false;
		this.isPermisoReportePrestamo=false;		
		this.isPermisoOrdenPrestamo=false;		
		this.isPermisoPaginacionMedioPrestamo=false;		
		this.isPermisoPaginacionAltoPrestamo=false;
		this.isPermisoPaginacionTodoPrestamo=false;
		this.isPermisoCopiarPrestamo=false;		
		this.isPermisoVerFormPrestamo=false;		
		this.isPermisoDuplicarPrestamo=false;		
		this.isPermisoOrdenPrestamo=false;		
	}
	
	public void setPermisosUsuarioPrestamo(Boolean isPermiso) {
		this.isPermisoTodoPrestamo=isPermiso;
		this.isPermisoNuevoPrestamo=isPermiso;
		this.isPermisoActualizarPrestamo=isPermiso;
		this.isPermisoActualizarOriginalPrestamo=isPermiso;
		this.isPermisoEliminarPrestamo=isPermiso;
		this.isPermisoGuardarCambiosPrestamo=isPermiso;
		this.isPermisoConsultaPrestamo=isPermiso;
		this.isPermisoBusquedaPrestamo=isPermiso;
		this.isPermisoReportePrestamo=isPermiso;
		this.isPermisoOrdenPrestamo=isPermiso;		
		this.isPermisoPaginacionMedioPrestamo=isPermiso;		
		this.isPermisoPaginacionAltoPrestamo=isPermiso;		
		this.isPermisoPaginacionTodoPrestamo=isPermiso;		
		this.isPermisoCopiarPrestamo=isPermiso;		
		this.isPermisoVerFormPrestamo=isPermiso;		
		this.isPermisoDuplicarPrestamo=isPermiso;
		this.isPermisoOrdenPrestamo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPrestamo(Boolean isPermiso) {
		//this.isPermisoTodoPrestamo=isPermiso;
		this.isPermisoNuevoPrestamo=isPermiso;
		this.isPermisoActualizarPrestamo=isPermiso;
		this.isPermisoActualizarOriginalPrestamo=isPermiso;
		this.isPermisoEliminarPrestamo=isPermiso;
		this.isPermisoGuardarCambiosPrestamo=isPermiso;
		//this.isPermisoConsultaPrestamo=isPermiso;
		//this.isPermisoBusquedaPrestamo=isPermiso;
		//this.isPermisoReportePrestamo=isPermiso;
		//this.isPermisoOrdenPrestamo=isPermiso;		
		//this.isPermisoPaginacionMedioPrestamo=isPermiso;		
		//this.isPermisoPaginacionAltoPrestamo=isPermiso;		
		//this.isPermisoPaginacionTodoPrestamo=isPermiso;		
		//this.isPermisoCopiarPrestamo=isPermiso;		
		//this.isPermisoDuplicarPrestamo=isPermiso;
		//this.isPermisoOrdenPrestamo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPrestamoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(AbonoPrestamoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CuotaConstantesFunciones.SNOMBREOPCION);
		
		if(PrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosAbonoPrestamo=false;
		this.isTienePermisosAbonoPrestamo=this.verificarGetPermisosUsuarioOpcionPrestamoClaseRelacionada(this.opcionsRelacionadas,AbonoPrestamoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCuota=false;
		this.isTienePermisosCuota=this.verificarGetPermisosUsuarioOpcionPrestamoClaseRelacionada(this.opcionsRelacionadas,CuotaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPrestamo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPrestamoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosAbonoPrestamo=conPermiso;
		this.isTienePermisosCuota=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPrestamoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPrestamoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPrestamoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosAbonoPrestamo && this.jInternalFrameDetalleFormPrestamo!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.remove(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCuota && this.jInternalFrameDetalleFormPrestamo!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.remove(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPrestamo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PrestamoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPrestamo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPrestamo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPrestamo=this.isPermisoActualizarPrestamo;
			this.isPermisoEliminarPrestamo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPrestamo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPrestamo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPrestamo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPrestamo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePrestamo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPrestamo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPrestamo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPrestamo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPrestamo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPrestamo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPrestamo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPrestamo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPrestamo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPrestamo.setToolTipText(this.jTableDatosPrestamo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPrestamo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPrestamo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPrestamo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosAbonoPrestamo && this.prestamoConstantesFunciones.mostrarAbonoPrestamoPrestamo && !PrestamoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Abono Prestamo");
			reporte.setsDescripcion("Abono Prestamo");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCuota && this.prestamoConstantesFunciones.mostrarCuotaPrestamo && !PrestamoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuota");
			reporte.setsDescripcion("Cuota");
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
	public void inicializarCombosForeignKeyPrestamoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.tipoprestamosForeignKey=new ArrayList();
				this.tipocuotasForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPrestamoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PrestamoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPrestamoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoPrestamoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCuotaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoPrestamoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprestamosForeignKey==null||this.tipoprestamosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPrestamoConstantesFunciones.getArrayColumnasGlobalesTipoPrestamo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrestamoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPrestamoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPrestamosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCuotaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocuotasForeignKey==null||this.tipocuotasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCuotaConstantesFunciones.getArrayColumnasGlobalesTipoCuota(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuotaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCuotaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCuotasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AsientoContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPrestamoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PrestamoParameterReturnGeneral prestamoReturnGeneral=new PrestamoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.prestamoConstantesFunciones.cargarid_empresaPrestamo)
					 || (this.esRecargarFks && this.prestamoConstantesFunciones.cargarid_empresaPrestamo)) {

					if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+prestamoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.prestamoConstantesFunciones.cargarid_empleadoPrestamo)
					 || (this.esRecargarFks && this.prestamoConstantesFunciones.cargarid_empleadoPrestamo)) {

					if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+prestamoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalTipoPrestamo="";

				if(((this.tipoprestamosForeignKey==null||this.tipoprestamosForeignKey.size()<=0) && this.prestamoConstantesFunciones.cargarid_tipo_prestamoPrestamo)
					 || (this.esRecargarFks && this.prestamoConstantesFunciones.cargarid_tipo_prestamoPrestamo)) {

					if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrestamo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPrestamoConstantesFunciones.getArrayColumnasGlobalesTipoPrestamo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPrestamo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrestamoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPrestamo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPrestamo, "");
						finalQueryGlobalTipoPrestamo+=TipoPrestamoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPrestamosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPrestamo=" WHERE " + ConstantesSql.ID + "="+prestamoSessionBean.getlidTipoPrestamoActual();
					}
				} else {
					finalQueryGlobalTipoPrestamo="NONE";
				}


				String finalQueryGlobalTipoCuota="";

				if(((this.tipocuotasForeignKey==null||this.tipocuotasForeignKey.size()<=0) && this.prestamoConstantesFunciones.cargarid_tipo_cuotaPrestamo)
					 || (this.esRecargarFks && this.prestamoConstantesFunciones.cargarid_tipo_cuotaPrestamo)) {

					if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuota()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCuotaConstantesFunciones.getArrayColumnasGlobalesTipoCuota(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCuota=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuotaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCuota=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCuota, "");
						finalQueryGlobalTipoCuota+=TipoCuotaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCuotasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCuota=" WHERE " + ConstantesSql.ID + "="+prestamoSessionBean.getlidTipoCuotaActual();
					}
				} else {
					finalQueryGlobalTipoCuota="NONE";
				}


				String finalQueryGlobalAsientoContable="";

				if(((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0) && this.prestamoConstantesFunciones.cargarid_asiento_contablePrestamo)
					 || (this.esRecargarFks && this.prestamoConstantesFunciones.cargarid_asiento_contablePrestamo)) {

					if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalAsientoContable, "");
						finalQueryGlobalAsientoContable+=AsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAsientoContable=" WHERE " + ConstantesSql.ID + "="+prestamoSessionBean.getlidAsientoContableActual();
					}
				} else {
					finalQueryGlobalAsientoContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				prestamoReturnGeneral=prestamoLogic.cargarCombosLoteForeignKeyPrestamo(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalTipoPrestamo,finalQueryGlobalTipoCuota,finalQueryGlobalAsientoContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=prestamoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=prestamoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalTipoPrestamo.equals("NONE")) {
				this.tipoprestamosForeignKey=prestamoReturnGeneral.gettipoprestamosForeignKey();
			}

			if(!finalQueryGlobalTipoCuota.equals("NONE")) {
				this.tipocuotasForeignKey=prestamoReturnGeneral.gettipocuotasForeignKey();
			}

			if(!finalQueryGlobalAsientoContable.equals("NONE")) {
				this.asientocontablesForeignKey=prestamoReturnGeneral.getasientocontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPrestamo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyTipoPrestamo();
			this.addItemDefectoCombosForeignKeyTipoCuota();
			this.addItemDefectoCombosForeignKeyAsientoContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
			}

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyTipoPrestamo()throws Exception {
		try {

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrestamo()) {
				TipoPrestamo tipoprestamo=new TipoPrestamo();
				TipoPrestamoConstantesFunciones.setTipoPrestamoDescripcion(tipoprestamo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprestamo.setId(null);

				if(!TipoPrestamoConstantesFunciones.ExisteEnLista(this.tipoprestamosForeignKey,tipoprestamo,true)) {

					this.tipoprestamosForeignKey.add(0,tipoprestamo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoCuota()throws Exception {
		try {

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuota()) {
				TipoCuota tipocuota=new TipoCuota();
				TipoCuotaConstantesFunciones.setTipoCuotaDescripcion(tipocuota,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocuota.setId(null);

				if(!TipoCuotaConstantesFunciones.ExisteEnLista(this.tipocuotasForeignKey,tipocuota,true)) {

					this.tipocuotasForeignKey.add(0,tipocuota);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.prestamoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				AsientoContable asientocontable=new AsientoContable();
				AsientoContableConstantesFunciones.setAsientoContableDescripcion(asientocontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				asientocontable.setId(null);

				if(!AsientoContableConstantesFunciones.ExisteEnLista(this.asientocontablesForeignKey,asientocontable,true)) {

					this.asientocontablesForeignKey.add(0,asientocontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPrestamo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPrestamo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPrestamo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.prestamo.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPrestamo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPrestamo(Prestamo prestamo)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(prestamo.getid_empleado(),false,"Formulario");
			this.setActualTipoPrestamoForeignKey(prestamo.getid_tipo_prestamo(),false,"Formulario");
			this.setActualTipoCuotaForeignKey(prestamo.getid_tipo_cuota(),false,"Formulario");
			this.setActualAsientoContableForeignKey(prestamo.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPrestamo(Prestamo prestamo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(prestamo.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoPrestamo")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(prestamo.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				if(prestamo.getAsientoContable()!=null && !sTipoEvento.equals("id_asiento_contablePrestamo")) { //sTipoEvento Evita Bucle Infinito

					this.asientocontablesForeignKey=new ArrayList<AsientoContable>();
					this.asientocontablesForeignKey.add(prestamo.getAsientoContable());

					this.addItemDefectoCombosForeignKeyAsientoContable();
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPrestamo()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.prestamoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualTipoPrestamoForeignKey(this.prestamoConstantesFunciones.getid_tipo_prestamo(),false,"Formulario");
			this.setActualTipoCuotaForeignKey(this.prestamoConstantesFunciones.getid_tipo_cuota(),false,"Formulario");
			this.setActualAsientoContableForeignKey(this.prestamoConstantesFunciones.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPrestamo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPrestamo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPrestamo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPrestamo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPrestamo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameTipoPrestamosForeignKey("Todos");
			this.cargarCombosFrameTipoCuotasForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPrestamo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPrestamosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCuotasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPrestamo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo!=null && this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo!=null && this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo!=null && this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo!=null && this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo!=null && this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public PrestamoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PrestamoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PrestamoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.prestamoSessionBean=new PrestamoSessionBean(); 
		this.prestamoConstantesFunciones=new PrestamoConstantesFunciones(); 
		this.prestamoBean=new Prestamo();//(this.prestamoConstantesFunciones); 		
		this.prestamoReturnGeneral=new PrestamoParameterReturnGeneral(); 
		
		this.prestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPrestamo(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
			
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
			
			this.prestamoConstantesFunciones=new PrestamoConstantesFunciones(); 
			this.prestamoBean=new Prestamo();//this.prestamoConstantesFunciones); 			
			this.prestamoReturnGeneral=new PrestamoParameterReturnGeneral(); 
		
			PrestamoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Prestamo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.prestamo=new Prestamo();
			this.prestamos = new ArrayList<Prestamo>();
			this.prestamosAux = new ArrayList<Prestamo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic=new PrestamoLogic();
				this.prestamoLogic.getNewConnexionToDeep("");
			}
			
			//this.prestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.prestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPrestamo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPrestamo);	
					}
					
					if(this.jInternalFrameImportacionPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPrestamo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPrestamo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPrestamo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPrestamo);
				this.jInternalFrameDetalleFormPrestamo.setVisible(false);
				this.jInternalFrameDetalleFormPrestamo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPrestamo);
					this.jInternalFrameReporteDinamicoPrestamo.setVisible(false);
					this.jInternalFrameReporteDinamicoPrestamo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPrestamo);
					this.jInternalFrameImportacionPrestamo.setVisible(false);
					this.jInternalFrameImportacionPrestamo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPrestamo);
					this.jInternalFrameOrderByPrestamo.setVisible(false);
					this.jInternalFrameOrderByPrestamo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPrestamoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PrestamoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.prestamoReturnGeneral=new PrestamoParameterReturnGeneral();
			
			this.prestamoParameterGeneral=new PrestamoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.prestamoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(AbonoPrestamoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CuotaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PrestamoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.prestamoSessionBean.getEsGuardarRelacionado(),this.prestamoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PrestamoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.prestamoSessionBean.getEsGuardarRelacionado(),this.prestamoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPrestamo=false;
			this.isVisibilidadCeldaDuplicarPrestamo=true;
			this.isVisibilidadCeldaCopiarPrestamo=true;
			this.isVisibilidadCeldaVerFormPrestamo=true;
			this.isVisibilidadCeldaOrdenPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;
			this.isVisibilidadCeldaModificarPrestamo=false;
			this.isVisibilidadCeldaActualizarPrestamo=false;
			this.isVisibilidadCeldaEliminarPrestamo=false;
			this.isVisibilidadCeldaCancelarPrestamo=false;
			this.isVisibilidadCeldaGuardarPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=false;
			
			
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoCuota=true;
			this.isVisibilidadFK_IdTipoPrestamo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPrestamo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPrestamo(false);
			
			this.setPermisosUsuarioPrestamo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prestamoSessionBean.getEsGuardarRelacionado() 
				|| (this.prestamoSessionBean.getEsGuardarRelacionado() && this.prestamoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPrestamoClasesRelacionadas();
			}
			
			if(this.prestamoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPrestamoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PrestamoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPrestamo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPrestamo();
			}
			
			if(!this.isPermisoBusquedaPrestamo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPrestamo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPrestamo,this.isPermisoPaginacionMedioPrestamo,this.isPermisoPaginacionTodoPrestamo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PrestamoConstantesFunciones.getTiposSeleccionarPrestamo());
				
				this.tiposColumnasSelect=PrestamoConstantesFunciones.getTiposSeleccionarPrestamo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPrestamo();				
				//this.tiposRelacionesSelect=PrestamoConstantesFunciones.getTiposRelacionesPrestamo(true);
				
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
			//if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPrestamo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPrestamo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPrestamo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPrestamo() ;
			
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
			
			
			this.abonoprestamoLogic=new AbonoPrestamoLogic();
			this.cuotaLogic=new CuotaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.tipoprestamoLogic=new TipoPrestamoLogic();
			this.tipocuotaLogic=new TipoCuotaLogic();
			this.asientocontableLogic=new AsientoContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				prestamoImplementable= (PrestamoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PrestamoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				prestamoImplementableHome= (PrestamoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PrestamoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.prestamos= new ArrayList<Prestamo>();
			this.prestamosEliminados= new ArrayList<Prestamo>();
						
			this.isEsNuevoPrestamo=false;
			this.esParaAccionDesdeFormularioPrestamo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			this.idAsientoContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.tipoprestamosForeignKey=new ArrayList<TipoPrestamo>() ;
			this.tipocuotasForeignKey=new ArrayList<TipoCuota>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPrestamo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPrestamo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PrestamoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PrestamoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPrestamo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPrestamo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPrestamo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPrestamo();
			}
			
			PrestamoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPrestamo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPrestamo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPrestamo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPrestamo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Prestamo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPrestamo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CuotaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuotaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPrestamo")) {
				iIndex=this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();	
				
				

				if(sTitle.equals("Abono Prestamos")) {
					if(!AbonoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPrestamo();

						this.cargarParteTabPanelRelacionadaAbonoPrestamo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Cuotas")) {
					if(!CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPrestamo();

						this.cargarParteTabPanelRelacionadaCuota(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPrestamo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAbonoPrestamo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPrestamo.cargarSessionConBeanSwingJInternalFrameAbonoPrestamo(false,true,iIndex);
		this.jButtonAbonoPrestamoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAbonoPrestamo();

		//this.jTabbedPaneRelacionesPrestamo.updateUI();
		//this.jTabbedPaneRelacionesPrestamo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPrestamo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCuota(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPrestamo.cargarSessionConBeanSwingJInternalFrameCuota(false,true,iIndex);
		this.jButtonCuotaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuota();

		//this.jTabbedPaneRelacionesPrestamo.updateUI();
		//this.jTabbedPaneRelacionesPrestamo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPrestamo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("AbonoPrestamo")) {
				int row=this.jTableDatosPrestamo.getSelectedRow();
				jButtonAbonoPrestamoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cuota")) {
				int row=this.jTableDatosPrestamo.getSelectedRow();
				jButtonCuotaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Abono Prestamo")) {

					if(this.isTienePermisosAbonoPrestamo && this.prestamoConstantesFunciones.mostrarAbonoPrestamoPrestamo && !PrestamoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Abono Prestamos"+"("+AbonoPrestamoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Abono Prestamos");

						if(prestamoConstantesFunciones.resaltarAbonoPrestamoPrestamo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(prestamoConstantesFunciones.resaltarAbonoPrestamoPrestamo);
						}

						jmenuItem.setEnabled(this.prestamoConstantesFunciones.activarAbonoPrestamoPrestamo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AbonoPrestamo"));

						

						this.jInternalFrameDetalleFormPrestamo.jmenuDetallePrestamo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cuota")) {

					if(this.isTienePermisosCuota && this.prestamoConstantesFunciones.mostrarCuotaPrestamo && !PrestamoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuotas"+"("+CuotaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuotas");

						if(prestamoConstantesFunciones.resaltarCuotaPrestamo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(prestamoConstantesFunciones.resaltarCuotaPrestamo);
						}

						jmenuItem.setEnabled(this.prestamoConstantesFunciones.activarCuotaPrestamo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cuota"));

						

						this.jInternalFrameDetalleFormPrestamo.jmenuDetallePrestamo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPrestamo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPrestamo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPrestamo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPrestamoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPrestamo();
		
		this.cargarCombosFrameForeignKeyPrestamo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPrestamo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPrestamo();
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

	public void cargarCombosForeignKeyTipoPrestamo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPrestamoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPrestamo();
				this.cargarCombosFrameTipoPrestamosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoPrestamo(this.tipoprestamosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCuota(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCuotaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCuota();
				this.cargarCombosFrameTipoCuotasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCuota(this.tipocuotasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPrestamoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.prestamoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
			
			if(jTableDatosPrestamo.getRowCount()>=1) {
				jTableDatosPrestamo.removeRowSelectionInterval(0, jTableDatosPrestamo.getRowCount()-1);						
			}
			
			this.isEsNuevoPrestamo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPrestamo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPrestamo(true);			
			//this.prestamo=new Prestamo();
			//this.prestamo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrestamo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrestamo() ;
			
			if(PrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrestamo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.prestamo);	
			this.actualizarInformacion("INFO_PADRE",false,this.prestamo);				
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
			if(this.prestamoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Prestamo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPrestamoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPrestamo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPrestamo.getSelectedRows().length;			
			}
			
			prestamosSeleccionados=this.getPrestamosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPrestamo--;			
				//Prestamo prestamoAux= new Prestamo();			
				//prestamoAux.setId(this.iIdNuevoPrestamo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Prestamo prestamoOrigen=new Prestamo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Prestamo prestamoOrigen : prestamosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							prestamoOrigen =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prestamoOrigen =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPrestamo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.prestamo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPrestamo(prestamoOrigen,this.prestamo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.prestamoLogic.getPrestamos().add(this.prestamoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.prestamos.add(this.prestamoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPrestamo(false);
				
				this.jTableDatosPrestamo.setRowSelectionInterval(this.getIndiceNuevoPrestamo(), this.getIndiceNuevoPrestamo());
				
				int iLastRow =  this.jTableDatosPrestamo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPrestamo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPrestamo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPrestamo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();									
		
			Prestamo prestamoOrigen=new Prestamo();
			Prestamo prestamoDestino=new Prestamo();
				
			prestamosSeleccionados=this.getPrestamosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPrestamo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || prestamosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPrestamo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoOrigen =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						prestamoOrigen =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prestamoDestino =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						prestamoDestino =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				prestamoOrigen =prestamosSeleccionados.get(0);
				prestamoDestino =prestamosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPrestamo(prestamoOrigen,prestamoDestino,true,false);
				
				prestamoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(prestamoDestino,prestamoLogic.getPrestamos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prestamoDestino,prestamos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPrestamo(false);
				
				//this.jTableDatosPrestamo.setRowSelectionInterval(this.getIndiceNuevoPrestamo(), this.getIndiceNuevoPrestamo());
				
				int iLastRow =  this.jTableDatosPrestamo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPrestamo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPrestamo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPrestamo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPrestamo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPrestamo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPrestamo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPrestamo.setVisible(!isVisible);
			this.jPanelPaginacionPrestamo.setVisible(!isVisible);
			this.jPanelAccionesPrestamo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePrestamo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPrestamo();
			
			this.abrirFrameOrderByPrestamo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePrestamo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPrestamo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPrestamo.isMaximum()) {
					this.jInternalFrameDetalleFormPrestamo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPrestamo.setSize(this.jInternalFrameDetalleFormPrestamo.iWidthFormulario,this.jInternalFrameDetalleFormPrestamo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPrestamo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPrestamo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPrestamo.isMaximum()) {
						this.jInternalFrameDetalleFormPrestamo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPrestamo.jContentPaneDetallePrestamo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPrestamo.jContentPaneDetallePrestamo.getWidth(),PrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPrestamo.jContentPaneDetallePrestamo.getWidth(),PrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPrestamo.jContentPaneDetallePrestamo.getWidth(),PrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AbonoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAbonoPrestamo();
					}

					if(CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuota();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPrestamo.setVisible(true);
	        this.jInternalFrameDetalleFormPrestamo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPrestamo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPrestamo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrestamo,false,this);
				} else {
					this.jInternalFrameOrderByPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrestamo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPrestamo);
				this.jInternalFrameOrderByPrestamo.setVisible(false);
				this.jInternalFrameOrderByPrestamo.setSelected(false);
				
				this.jInternalFrameOrderByPrestamo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPrestamo"));
				
				this.inicializarActualizarBindingTablaOrderByPrestamo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPrestamo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPrestamo==null) {
				
				this.jInternalFrameImportacionPrestamo=new ImportacionJInternalFrame(PrestamoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPrestamo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPrestamo);
				this.jInternalFrameImportacionPrestamo.setVisible(false);
				this.jInternalFrameImportacionPrestamo.setSelected(false);


				this.jInternalFrameImportacionPrestamo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPrestamo"));
				this.jInternalFrameImportacionPrestamo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPrestamo"));
				this.jInternalFrameImportacionPrestamo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPrestamo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPrestamo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPrestamo==null) {
				this.jInternalFrameReporteDinamicoPrestamo=new ReporteDinamicoJInternalFrame(PrestamoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPrestamo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPrestamo);
				this.jInternalFrameReporteDinamicoPrestamo.setVisible(false);
				this.jInternalFrameReporteDinamicoPrestamo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPrestamo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrestamo"));
				this.jInternalFrameReporteDinamicoPrestamo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrestamo"));
				this.jInternalFrameReporteDinamicoPrestamo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrestamo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrestamo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAbonoPrestamo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.jScrollPanelDatosAbonoPrestamo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPrestamo.jContentPaneDetallePrestamo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.jScrollPanelDatosAbonoPrestamo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.jScrollPanelDatosAbonoPrestamo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.jScrollPanelDatosAbonoPrestamo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCuota() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPrestamo.jContentPaneDetallePrestamo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePrestamo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPrestamo);
			
	       	this.jInternalFrameDetalleFormPrestamo.setVisible(false);
	        this.jInternalFrameDetalleFormPrestamo.setSelected(false);
			
			//this.jInternalFrameDetalleFormPrestamo.dispose();
			//this.jInternalFrameDetalleFormPrestamo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPrestamo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPrestamo.setVisible(true);
	        this.jInternalFrameReporteDinamicoPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPrestamo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPrestamo.setVisible(true);
	        this.jInternalFrameImportacionPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPrestamo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPrestamo.setVisible(true);
	        this.jInternalFrameOrderByPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPrestamo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPrestamo.setVisible(false);
	        this.jInternalFrameOrderByPrestamo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPrestamo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPrestamo.setVisible(false);
	        this.jInternalFrameReporteDinamicoPrestamo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPrestamo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPrestamo.setVisible(false);
	        this.jInternalFrameImportacionPrestamo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPrestamo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPrestamo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPrestamo(true);
			//this.isEsNuevoPrestamo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrestamo(false) ;
			
			if(prestamoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.getEsGuardarRelacionado() && AbonoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAbonoPrestamoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado() && CuotaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuotaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrestamo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrestamo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPrestamoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPrestamo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPrestamo(true);
			//this.isEsNuevoPrestamo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.prestamo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPrestamo(false) ;
			
			if(PrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrestamo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrestamo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.prestamoConstantesFunciones.cargarid_empleadoPrestamo) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPrestamo(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
			
			if(sType.equals("AsientoContable")) {
				if(!this.prestamoConstantesFunciones.cargarid_asiento_contablePrestamo) {
					this.cargarCombosAsientoContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPrestamo(false,false);
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_asiento_contable (id);

				this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrestamo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoPrestamo(List<TipoPrestamo> tipoprestamosForeignKey)throws Exception{
		TableColumn tableColumnTipoPrestamo=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO));
		TableCellEditor tableCellEditorTipoPrestamo =tableColumnTipoPrestamo.getCellEditor();

		TipoPrestamoTableCell tipoprestamoTableCellFk=(TipoPrestamoTableCell)tableCellEditorTipoPrestamo;

		if(tipoprestamoTableCellFk!=null) {
			tipoprestamoTableCellFk.settipoprestamosForeignKey(tipoprestamosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrestamo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprestamoTableCellFk.setRowActual(intSelectedRow);
			//tipoprestamoTableCellFk.settipoprestamosForeignKeyActual(tipoprestamosForeignKey);
		//}


		if(tipoprestamoTableCellFk!=null) {
			tipoprestamoTableCellFk.RecargarTipoPrestamosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCuota(List<TipoCuota> tipocuotasForeignKey)throws Exception{
		TableColumn tableColumnTipoCuota=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA));
		TableCellEditor tableCellEditorTipoCuota =tableColumnTipoCuota.getCellEditor();

		TipoCuotaTableCell tipocuotaTableCellFk=(TipoCuotaTableCell)tableCellEditorTipoCuota;

		if(tipocuotaTableCellFk!=null) {
			tipocuotaTableCellFk.settipocuotasForeignKey(tipocuotasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrestamo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocuotaTableCellFk.setRowActual(intSelectedRow);
			//tipocuotaTableCellFk.settipocuotasForeignKeyActual(tipocuotasForeignKey);
		//}


		if(tipocuotaTableCellFk!=null) {
			tipocuotaTableCellFk.RecargarTipoCuotasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrestamo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_asiento_contable (Long id) throws Exception {
		this.setActualAsientoContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPrestamo(false);
			
			//if(!this.isEsNuevoPrestamo) {								
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				
			}
			
			if(this.permiteMantenimiento(this.prestamo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.prestamoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPrestamo=true;
					this.inicializarActualizarBindingTablaPrestamo(false);
					this.isEsNuevoPrestamo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPrestamo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPrestamo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPrestamo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrestamo(false);
				
				this.habilitarDeshabilitarControlesPrestamo(false);
			
												
				
				if(PrestamoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePrestamo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPrestamoActionPerformed(evt,prestamoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPrestamo(this.prestamo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPrestamo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,prestamoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.prestamo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				this.prestamo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				this.prestamo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.prestamo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.prestamoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PrestamoModel) this.jTableDatosPrestamo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPrestamo=true;
				this.inicializarActualizarBindingTablaPrestamo(false);
				this.isEsNuevoPrestamo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPrestamo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrestamo(false);
				
				this.habilitarDeshabilitarControlesPrestamo(false);
				
				
				
				if(PrestamoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePrestamo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPrestamoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPrestamo.getRowCount()>=1) {
				jTableDatosPrestamo.removeRowSelectionInterval(0, jTableDatosPrestamo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPrestamo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPrestamo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrestamo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrestamo(false) ;
			
			this.isEsNuevoPrestamo=false;
			
			if(PrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePrestamo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPrestamo(false);
				
				//SI ES MANUAL
				if(PrestamoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPrestamo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPrestamo--;			
			//Prestamo prestamoAux= new Prestamo();			
			//prestamoAux.setId(this.iIdNuevoPrestamo);
			
			if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPrestamo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
			
			this.prestamo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.prestamoLogic.getPrestamos().add(this.prestamoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.prestamos.add(this.prestamoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPrestamo(false);
			
			this.jTableDatosPrestamo.setRowSelectionInterval(this.getIndiceNuevoPrestamo(), this.getIndiceNuevoPrestamo());
			
			int iLastRow =  this.jTableDatosPrestamo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPrestamo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPrestamo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPrestamo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPrestamo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrestamo(false);
			
			//SI ES MANUAL
			if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrestamo();
			}
			
			//this.abrirFrameTreePrestamo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPrestamoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE PrestamoS ?", "MANTENIMIENTO DE Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPrestamo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPrestamo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.prestamoReturnGeneral=prestamoLogic.procesarImportacionPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.prestamoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPrestamoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPrestamoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPrestamo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPrestamo.setFileImportacion(this.jInternalFrameImportacionPrestamo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPrestamo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPrestamo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPrestamo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPrestamo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		

		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PrestamoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PrestamoBaseDesign.jrxml";
			
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
			
			this.generarReportePrestamos("Todos",prestamosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PrestamoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPrestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPrestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPrestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPrestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCuota_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCuota_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCuota_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCuota_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuotas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuotas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuotas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuotas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_TASA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrestamoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPrestamo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PrestamoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PrestamoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO:
					sNombreCampoCategoria="id_tipo_prestamo";
					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA:
					sNombreCampoCategoria="id_tipo_cuota";
					break;

				case PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case PrestamoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case PrestamoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PrestamoConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS:
					sNombreCampoCategoria="numero_cuotas";
					break;

				case PrestamoConstantesFunciones.LABEL_TASA:
					sNombreCampoCategoria="tasa";
					break;

				case PrestamoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PrestamoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PrestamoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO:
					sNombreCampoCategoriaValor="id_tipo_prestamo";
					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA:
					sNombreCampoCategoriaValor="id_tipo_cuota";
					break;

				case PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case PrestamoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case PrestamoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PrestamoConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS:
					sNombreCampoCategoriaValor="numero_cuotas";
					break;

				case PrestamoConstantesFunciones.LABEL_TASA:
					sNombreCampoCategoriaValor="tasa";
					break;

				case PrestamoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PrestamoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PrestamoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_prestamo");
					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Cuota",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_cuota");
					break;

				case PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case PrestamoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case PrestamoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PrestamoConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuotas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuotas");
					break;

				case PrestamoConstantesFunciones.LABEL_TASA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tasa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tasa");
					break;

				case PrestamoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPrestamoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prestamo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Prestamos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PrestamoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.gettipoprestamo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.gettipocuota_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getnumero_cuotas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_TASA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_TASA);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.gettasa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrestamoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrestamoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Prestamo prestamo:prestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prestamo.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPrestamo(row);				
			//	iRow++;
			//}				
			
			//for(Prestamo prestamoAux:prestamosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPrestamo(prestamoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
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
				this.prestamoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrestamo(false);
			
			//SI ES MANUAL
			if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrestamo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrestamo(false);
			
			//SI ES MANUAL
			if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPrestamo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrestamo(false);
			
			//SI ES MANUAL
			if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPrestamo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPrestamo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPrestamo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPrestamo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPrestamo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPrestamo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPrestamo.setMinimumSize(dimensionMinimum);
		this.jTableDatosPrestamo.setMaximumSize(dimensionMaximum);
		this.jTableDatosPrestamo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPrestamo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPrestamo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPrestamo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPrestamo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPrestamo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPrestamo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPrestamo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPrestamo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PrestamoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPrestamo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPrestamo();
		
		this.inicializarActualizarBindingBotonesManualPrestamo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPrestamo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPrestamo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPrestamo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPrestamo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPrestamo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPrestamo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePrestamo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPrestamo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPrestamo.jCheckBoxPostAccionNuevoPrestamo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPrestamo.jCheckBoxPostAccionSinCerrarPrestamo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPrestamo.jCheckBoxPostAccionSinMensajePrestamo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPrestamo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPrestamo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePrestamo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPrestamo!=null) {
				this.jInternalFrameDetalleFormPrestamo.jCheckBoxPostAccionNuevoPrestamo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPrestamo.jCheckBoxPostAccionSinCerrarPrestamo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPrestamo.jCheckBoxPostAccionSinMensajePrestamo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPrestamo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPrestamo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPrestamo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPrestamo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPrestamo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPrestamo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPrestamo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPrestamo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPrestamo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPrestamo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPrestamo(Boolean esInicializar) throws Exception {
		try	{	
			if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPrestamo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPrestamo() throws Exception {
		try	{
			if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPrestamo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePrestamo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPrestamo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPrestamo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPrestamo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPrestamo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPrestamo.addItem(reporte);
			}
			
			
			if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPrestamo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPrestamo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPrestamo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPrestamo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPrestamo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPrestamo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrestamo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrestamo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
				
				if(this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPrestamo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPrestamo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPrestamo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PrestamoConstantesFunciones.getTiposSeleccionarPrestamo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PrestamoConstantesFunciones.getTiposSeleccionarPrestamo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PrestamoConstantesFunciones.getTiposSeleccionarPrestamo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPrestamo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPrestamo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPrestamo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.getSelectedItem()!=null){this.id_asiento_contableFK_IdAsientoContable=((AsientoContable)this.jComboBoxid_asiento_contableFK_IdAsientoContablePrestamo.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoPrestamo.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoPrestamo.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.getSelectedItem()!=null){this.id_tipo_cuotaFK_IdTipoCuota=((TipoCuota)this.jComboBoxid_tipo_cuotaFK_IdTipoCuotaPrestamo.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.getSelectedItem()!=null){this.id_tipo_prestamoFK_IdTipoPrestamo=((TipoPrestamo)this.jComboBoxid_tipo_prestamoFK_IdTipoPrestamoPrestamo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPrestamo(Boolean esInicializar) throws Exception {				
		if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPrestamo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPrestamo() throws Exception {
		this.inicializarActualizarBindingTablaPrestamo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPrestamo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPrestamoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPrestamo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=prestamoLogic.getPrestamos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=prestamos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPrestamo.setModel(new PrestamoModel(this.prestamoLogic.getPrestamos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPrestamo.setModel(new PrestamoModel(this.prestamos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPrestamo!=null && this.jInternalFrameOrderByPrestamo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPrestamo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PrestamoConstantesFunciones.SCLASSWEBTITULO,prestamoConstantesFunciones.resaltarSeleccionarPrestamo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PrestamoConstantesFunciones.SCLASSWEBTITULO,prestamoConstantesFunciones.resaltarSeleccionarPrestamo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_ID));

		if(this.prestamoConstantesFunciones.mostraridPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prestamoConstantesFunciones.resaltaridPrestamo,this.prestamoConstantesFunciones.activaridPrestamo,iSizeTabla,this,true,"idPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prestamoConstantesFunciones.resaltaridPrestamo,this.prestamoConstantesFunciones.activaridPrestamo,this,true,"idPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.prestamoConstantesFunciones.mostrarid_empresaPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.prestamoConstantesFunciones.resaltarid_empresaPrestamo,this,this.prestamoConstantesFunciones.activarid_empresaPrestamo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.prestamoConstantesFunciones.resaltarid_empresaPrestamo,this,this.prestamoConstantesFunciones.activarid_empresaPrestamo,false,"id_empresaPrestamo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.prestamoConstantesFunciones.mostrarid_empleadoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.prestamoConstantesFunciones.resaltarid_empleadoPrestamo,this,this.prestamoConstantesFunciones.activarid_empleadoPrestamo,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.prestamoConstantesFunciones.resaltarid_empleadoPrestamo,this,this.prestamoConstantesFunciones.activarid_empleadoPrestamo,true,"id_empleadoPrestamo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO));

		if(this.prestamoConstantesFunciones.mostrarid_tipo_prestamoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPrestamoTableCell(this.tipoprestamosForeignKey,this.prestamoConstantesFunciones.resaltarid_tipo_prestamoPrestamo,this,this.prestamoConstantesFunciones.activarid_tipo_prestamoPrestamo,iSizeTabla));
			tableColumn.setCellEditor(new TipoPrestamoTableCell(this.tipoprestamosForeignKey,this.prestamoConstantesFunciones.resaltarid_tipo_prestamoPrestamo,this,this.prestamoConstantesFunciones.activarid_tipo_prestamoPrestamo,true,"id_tipo_prestamoPrestamo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA));

		if(this.prestamoConstantesFunciones.mostrarid_tipo_cuotaPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCuotaTableCell(this.tipocuotasForeignKey,this.prestamoConstantesFunciones.resaltarid_tipo_cuotaPrestamo,this,this.prestamoConstantesFunciones.activarid_tipo_cuotaPrestamo,iSizeTabla));
			tableColumn.setCellEditor(new TipoCuotaTableCell(this.tipocuotasForeignKey,this.prestamoConstantesFunciones.resaltarid_tipo_cuotaPrestamo,this,this.prestamoConstantesFunciones.activarid_tipo_cuotaPrestamo,true,"id_tipo_cuotaPrestamo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE));

		if(this.prestamoConstantesFunciones.mostrarid_asiento_contablePrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AsientoContableTableCell(this.asientocontablesForeignKey,this.prestamoConstantesFunciones.resaltarid_asiento_contablePrestamo,this,this.prestamoConstantesFunciones.activarid_asiento_contablePrestamo,iSizeTabla));
			tableColumn.setCellEditor(new AsientoContableTableCell(this.asientocontablesForeignKey,this.prestamoConstantesFunciones.resaltarid_asiento_contablePrestamo,this,this.prestamoConstantesFunciones.activarid_asiento_contablePrestamo,true,"id_asiento_contablePrestamo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_CODIGO));

		if(this.prestamoConstantesFunciones.mostrarcodigoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.prestamoConstantesFunciones.resaltarcodigoPrestamo,this.prestamoConstantesFunciones.activarcodigoPrestamo,iSizeTabla,this,true,"codigoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prestamoConstantesFunciones.resaltarcodigoPrestamo,this.prestamoConstantesFunciones.activarcodigoPrestamo,this,true,"codigoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.prestamoConstantesFunciones.mostrarnumero_pre_impresoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.prestamoConstantesFunciones.resaltarnumero_pre_impresoPrestamo,this.prestamoConstantesFunciones.activarnumero_pre_impresoPrestamo,iSizeTabla,this,true,"numero_pre_impresoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prestamoConstantesFunciones.resaltarnumero_pre_impresoPrestamo,this.prestamoConstantesFunciones.activarnumero_pre_impresoPrestamo,this,true,"numero_pre_impresoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_FECHA));

		if(this.prestamoConstantesFunciones.mostrarfechaPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.prestamoConstantesFunciones.resaltarfechaPrestamo,this.prestamoConstantesFunciones.activarfechaPrestamo,iSizeTabla,this,true,"fechaPrestamo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.prestamoConstantesFunciones.resaltarfechaPrestamo,this.prestamoConstantesFunciones.activarfechaPrestamo,this,true,"fechaPrestamo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_MONTO));

		if(this.prestamoConstantesFunciones.mostrarmontoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prestamoConstantesFunciones.resaltarmontoPrestamo,this.prestamoConstantesFunciones.activarmontoPrestamo,iSizeTabla,this,true,"montoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prestamoConstantesFunciones.resaltarmontoPrestamo,this.prestamoConstantesFunciones.activarmontoPrestamo,this,true,"montoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS));

		if(this.prestamoConstantesFunciones.mostrarnumero_cuotasPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prestamoConstantesFunciones.resaltarnumero_cuotasPrestamo,this.prestamoConstantesFunciones.activarnumero_cuotasPrestamo,iSizeTabla,this,true,"numero_cuotasPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prestamoConstantesFunciones.resaltarnumero_cuotasPrestamo,this.prestamoConstantesFunciones.activarnumero_cuotasPrestamo,this,true,"numero_cuotasPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_TASA));

		if(this.prestamoConstantesFunciones.mostrartasaPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_TASA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prestamoConstantesFunciones.resaltartasaPrestamo,this.prestamoConstantesFunciones.activartasaPrestamo,iSizeTabla,this,true,"tasaPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prestamoConstantesFunciones.resaltartasaPrestamo,this.prestamoConstantesFunciones.activartasaPrestamo,this,true,"tasaPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,PrestamoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.prestamoConstantesFunciones.mostrardescripcionPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrestamoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.prestamoConstantesFunciones.resaltardescripcionPrestamo,this.prestamoConstantesFunciones.activardescripcionPrestamo,iSizeTabla,this,true,"descripcionPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prestamoConstantesFunciones.resaltardescripcionPrestamo,this.prestamoConstantesFunciones.activardescripcionPrestamo,this,true,"descripcionPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.prestamoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosAbonoPrestamo && this.prestamoConstantesFunciones.mostrarAbonoPrestamoPrestamo && !PrestamoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Abono Prestamos");
				tableColumn.setHeaderValue("Abono Prestamos");
				tableColumn.setCellRenderer(new AbonoPrestamoTableCell(prestamoConstantesFunciones.resaltarAbonoPrestamoPrestamo,this,this.prestamoConstantesFunciones.activarAbonoPrestamoPrestamo));
				tableColumn.setCellEditor(new AbonoPrestamoTableCell(prestamoConstantesFunciones.resaltarAbonoPrestamoPrestamo,this,this.prestamoConstantesFunciones.activarAbonoPrestamoPrestamo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPrestamo.addColumn(tableColumn);
			}

			if(this.isTienePermisosCuota && this.prestamoConstantesFunciones.mostrarCuotaPrestamo && !PrestamoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuotas");
				tableColumn.setHeaderValue("Cuotas");
				tableColumn.setCellRenderer(new CuotaTableCell(prestamoConstantesFunciones.resaltarCuotaPrestamo,this,this.prestamoConstantesFunciones.activarCuotaPrestamo));
				tableColumn.setCellEditor(new CuotaTableCell(prestamoConstantesFunciones.resaltarCuotaPrestamo,this,this.prestamoConstantesFunciones.activarCuotaPrestamo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPrestamo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.prestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.prestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPrestamo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				//tableColumn= new TableColumn();
				//tableColumn.setIdentifier(sLabelColumnAccion);
				//tableColumn.setHeaderValue(sLabelColumnAccion);
				//tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.prestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				//tableColumn.setCellEditor(new IdTableCell(this,false,false,this.prestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				//tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				//tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				//this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				//this.jTableDatosPrestamo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPrestamo && this.isPermisoGuardarCambiosPrestamo) {
					//tableColumn= new TableColumn();
					//tableColumn.setIdentifier(Constantes2.S_ELI);
					//tableColumn.setHeaderValue(sLabelColumnAccionEli);
					//tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.prestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					//tableColumn.setCellEditor(new IdTableCell(this,false,true,this.prestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					//tableColumn.setPreferredWidth(65); 	 
					//tableColumn.setWidth(65); 	 
					//tableColumn.setMinWidth(65); 
					//tableColumn.setMaxWidth(65);
					
					//this.iWidthTableDefinicion+=65;
						
					//this.jTableDatosPrestamo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.prestamoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPrestamo.addColumn(tableColumn);
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
			
			this.jTableDatosPrestamo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPrestamo && this.isPermisoGuardarCambiosPrestamo) {
				//iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		//iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.prestamoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPrestamo && this.isPermisoGuardarCambiosPrestamo) {
				////REUBICA ELIMINAR SIMPLE
				//jTableDatosPrestamo.moveColumn(this.jTableDatosPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				//iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		//jTableDatosPrestamo.moveColumn(this.jTableDatosPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.prestamoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPrestamo.moveColumn(this.jTableDatosPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPrestamo.moveColumn(this.jTableDatosPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPrestamo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPrestamo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPrestamo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPrestamo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPrestamo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPrestamo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPrestamo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPrestamo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=prestamoLogic.getPrestamos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=prestamos.size()-1;
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
		//this.jTableDatosPrestamo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPrestamo();
			
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
				
				//this.isEsNuevoPrestamo=false;
					
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
				if(this.prestamoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPrestamo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPrestamo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPrestamo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.prestamo.getsType().equals("DUPLICADO")
				   || this.prestamo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPrestamo=true;
				
				} else {
					this.isEsNuevoPrestamo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.prestamoSessionBean.getEsGuardarRelacionado()) {
					if(this.prestamo.getId()>=0 && !this.prestamo.getIsNew()) {						
						this.isEsNuevoPrestamo=false;
						
					} else {
						this.isEsNuevoPrestamo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPrestamo(esRelaciones);						
				
				this.seleccionarPrestamo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.prestamo.getId()<0) {
					this.isEsNuevoPrestamo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPrestamo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPrestamo(evt,rowIndex);
				}	
				
				if(this.prestamoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Prestamo: " + this.dDif); 
					}
				}								
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPrestamo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.prestamo)) {
					if(this.prestamo.getId()>0) {
						this.prestamo.setIsDeleted(true);
						
						this.prestamosEliminados.add(this.prestamo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.prestamoLogic.getPrestamos().remove(this.prestamo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.prestamos.remove(this.prestamo);				
					}
					
					
					((PrestamoModel) this.jTableDatosPrestamo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPrestamo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPrestamo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPrestamo) {
			
			if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPrestamo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPrestamo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPrestamo(this.prestamo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.prestamoConstantesFunciones.cargarid_empresaPrestamo || this.prestamoConstantesFunciones.event_dependid_empresaPrestamo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.prestamo.getid_empresa());
									//this.inicializarActualizarBindingPrestamo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(prestamo.getEmpresa()!=null) {
							this.empresasForeignKey.add(prestamo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.prestamo.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.prestamoConstantesFunciones.cargarid_empleadoPrestamo || this.prestamoConstantesFunciones.event_dependid_empleadoPrestamo) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.prestamo.getid_empleado());
									//this.inicializarActualizarBindingPrestamo(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(prestamo.getEmpleado()!=null) {
							this.empleadosForeignKey.add(prestamo.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.prestamo.getid_empleado(),false,"Formulario");

					//TipoPrestamo
					if(!this.prestamoConstantesFunciones.cargarid_tipo_prestamoPrestamo || this.prestamoConstantesFunciones.event_dependid_tipo_prestamoPrestamo) {
						//this.cargarCombosTipoPrestamosForeignKeyLista(" where id="+this.prestamo.getid_tipo_prestamo());
									//this.inicializarActualizarBindingPrestamo(false,false);
						this.tipoprestamosForeignKey=new ArrayList<TipoPrestamo>();

						if(prestamo.getTipoPrestamo()!=null) {
							this.tipoprestamosForeignKey.add(prestamo.getTipoPrestamo());
						}

						this.addItemDefectoCombosForeignKeyTipoPrestamo();
						this.cargarCombosFrameTipoPrestamosForeignKey("Todos");
					}
					this.setActualTipoPrestamoForeignKey(this.prestamo.getid_tipo_prestamo(),false,"Formulario");

					//TipoCuota
					if(!this.prestamoConstantesFunciones.cargarid_tipo_cuotaPrestamo || this.prestamoConstantesFunciones.event_dependid_tipo_cuotaPrestamo) {
						//this.cargarCombosTipoCuotasForeignKeyLista(" where id="+this.prestamo.getid_tipo_cuota());
									//this.inicializarActualizarBindingPrestamo(false,false);
						this.tipocuotasForeignKey=new ArrayList<TipoCuota>();

						if(prestamo.getTipoCuota()!=null) {
							this.tipocuotasForeignKey.add(prestamo.getTipoCuota());
						}

						this.addItemDefectoCombosForeignKeyTipoCuota();
						this.cargarCombosFrameTipoCuotasForeignKey("Todos");
					}
					this.setActualTipoCuotaForeignKey(this.prestamo.getid_tipo_cuota(),false,"Formulario");

					//AsientoContable
					if(!this.prestamoConstantesFunciones.cargarid_asiento_contablePrestamo || this.prestamoConstantesFunciones.event_dependid_asiento_contablePrestamo) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.prestamo.getid_asiento_contable());
									//this.inicializarActualizarBindingPrestamo(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(prestamo.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(prestamo.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.prestamo.getid_asiento_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPrestamo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPrestamo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrestamo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPrestamo(Prestamo prestamo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPrestamo(prestamo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPrestamo(Prestamo prestamo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPrestamo(prestamo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPrestamo(prestamo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPrestamo(prestamo);
	}
	
	public void setVariablesObjetoActualToFormularioPrestamo(Prestamo prestamo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.setText(prestamo.getId().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldcodigoPrestamo.setText(prestamo.getcodigo());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_pre_impresoPrestamo.setText(prestamo.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormPrestamo.jDateChooserfechaPrestamo.setDate(prestamo.getfecha());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldmontoPrestamo.setText(prestamo.getmonto().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_cuotasPrestamo.setText(prestamo.getnumero_cuotas().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldtasaPrestamo.setText(prestamo.gettasa().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextAreadescripcionPrestamo.setText(prestamo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Prestamo prestamoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,prestamoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Prestamo prestamoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				prestamoLocal=this.prestamo;
			} else {
				prestamoLocal=this.prestamoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(prestamoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPrestamo(prestamoLocal,true);
					
					if(prestamoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(prestamoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(prestamoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPrestamo(Prestamo prestamo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPrestamo(prestamo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(prestamo);
	}
	
	public void setVariablesFormularioToObjetoActualPrestamo(Prestamo prestamo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPrestamo(prestamo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPrestamo(Prestamo prestamo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.getText()==null || this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.getText()=="" || this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.getText()=="Id") {
				this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.setText("0");
			}

			if(conColumnasBase) {prestamo.setId(Long.parseLong(this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrestamoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelIdPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prestamo.setcodigo(this.jInternalFrameDetalleFormPrestamo.jTextFieldcodigoPrestamo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrestamoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelcodigoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prestamo.setnumero_pre_impreso(this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_pre_impresoPrestamo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelnumero_pre_impresoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prestamo.setfecha(this.jInternalFrameDetalleFormPrestamo.jDateChooserfechaPrestamo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrestamoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelfechaPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prestamo.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormPrestamo.jTextFieldmontoPrestamo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrestamoConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelmontoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prestamo.setnumero_cuotas(Integer.parseInt(this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_cuotasPrestamo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabelnumero_cuotasPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prestamo.settasa(Double.parseDouble(this.jInternalFrameDetalleFormPrestamo.jTextFieldtasaPrestamo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrestamoConstantesFunciones.LABEL_TASA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabeltasaPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prestamo.setdescripcion(this.jInternalFrameDetalleFormPrestamo.jTextAreadescripcionPrestamo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrestamoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrestamo.jLabeldescripcionPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPrestamo(Prestamo prestamoBean,Prestamo prestamo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && prestamoBean.getid_empleado()!=null && !prestamoBean.getid_empleado().equals(-1L))) {prestamo.setid_empleado(prestamoBean.getid_empleado());}
			if(conDefault || (!conDefault && prestamoBean.getid_tipo_prestamo()!=null && !prestamoBean.getid_tipo_prestamo().equals(-1L))) {prestamo.setid_tipo_prestamo(prestamoBean.getid_tipo_prestamo());}
			if(conDefault || (!conDefault && prestamoBean.getid_tipo_cuota()!=null && !prestamoBean.getid_tipo_cuota().equals(-1L))) {prestamo.setid_tipo_cuota(prestamoBean.getid_tipo_cuota());}
			if(conDefault || (!conDefault && prestamoBean.getid_asiento_contable()!=null && !prestamoBean.getid_asiento_contable().equals(null))) {prestamo.setid_asiento_contable(prestamoBean.getid_asiento_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPrestamo(Prestamo prestamoOrigen,Prestamo prestamo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && prestamoOrigen.getId()!=null && !prestamoOrigen.getId().equals(0L))) {prestamo.setId(prestamoOrigen.getId());}}
			if(conDefault || (!conDefault && prestamoOrigen.getid_empleado()!=null && !prestamoOrigen.getid_empleado().equals(-1L))) {prestamo.setid_empleado(prestamoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && prestamoOrigen.getid_tipo_prestamo()!=null && !prestamoOrigen.getid_tipo_prestamo().equals(-1L))) {prestamo.setid_tipo_prestamo(prestamoOrigen.getid_tipo_prestamo());}
			if(conDefault || (!conDefault && prestamoOrigen.getid_tipo_cuota()!=null && !prestamoOrigen.getid_tipo_cuota().equals(-1L))) {prestamo.setid_tipo_cuota(prestamoOrigen.getid_tipo_cuota());}
			if(conDefault || (!conDefault && prestamoOrigen.getid_asiento_contable()!=null && !prestamoOrigen.getid_asiento_contable().equals(null))) {prestamo.setid_asiento_contable(prestamoOrigen.getid_asiento_contable());}
			if(conDefault || (!conDefault && prestamoOrigen.getcodigo()!=null && !prestamoOrigen.getcodigo().equals(""))) {prestamo.setcodigo(prestamoOrigen.getcodigo());}
			if(conDefault || (!conDefault && prestamoOrigen.getnumero_pre_impreso()!=null && !prestamoOrigen.getnumero_pre_impreso().equals(""))) {prestamo.setnumero_pre_impreso(prestamoOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && prestamoOrigen.getfecha()!=null && !prestamoOrigen.getfecha().equals(new Date()))) {prestamo.setfecha(prestamoOrigen.getfecha());}
			if(conDefault || (!conDefault && prestamoOrigen.getmonto()!=null && !prestamoOrigen.getmonto().equals(0.0))) {prestamo.setmonto(prestamoOrigen.getmonto());}
			if(conDefault || (!conDefault && prestamoOrigen.getnumero_cuotas()!=null && !prestamoOrigen.getnumero_cuotas().equals(0))) {prestamo.setnumero_cuotas(prestamoOrigen.getnumero_cuotas());}
			if(conDefault || (!conDefault && prestamoOrigen.gettasa()!=null && !prestamoOrigen.gettasa().equals(0.0))) {prestamo.settasa(prestamoOrigen.gettasa());}
			if(conDefault || (!conDefault && prestamoOrigen.getdescripcion()!=null && !prestamoOrigen.getdescripcion().equals(""))) {prestamo.setdescripcion(prestamoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPrestamo(Prestamo prestamo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.setText(prestamo.getId().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldcodigoPrestamo.setText(prestamo.getcodigo());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_pre_impresoPrestamo.setText(prestamo.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormPrestamo.jDateChooserfechaPrestamo.setDate(prestamo.getfecha());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldmontoPrestamo.setText(prestamo.getmonto().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_cuotasPrestamo.setText(prestamo.getnumero_cuotas().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldtasaPrestamo.setText(prestamo.gettasa().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextAreadescripcionPrestamo.setText(prestamo.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPrestamo(PrestamoBean prestamoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.setText(prestamoBean.getId().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldcodigoPrestamo.setText(prestamoBean.getcodigo());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_pre_impresoPrestamo.setText(prestamoBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormPrestamo.jDateChooserfechaPrestamo.setDate(prestamoBean.getfecha());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldmontoPrestamo.setText(prestamoBean.getmonto().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_cuotasPrestamo.setText(prestamoBean.getnumero_cuotas().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextFieldtasaPrestamo.setText(prestamoBean.gettasa().toString());
			this.jInternalFrameDetalleFormPrestamo.jTextAreadescripcionPrestamo.setText(prestamoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPrestamo(PrestamoParameterReturnGeneral prestamoReturnGeneral,PrestamoBean prestamoBean,Boolean conDefault) throws Exception { 
		try {
			Prestamo prestamoLocal=new Prestamo();
			
			prestamoLocal=prestamoReturnGeneral.getPrestamo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && prestamoLocal.getId()!=null && !prestamoLocal.getId().equals(0L))) {prestamoBean.setId(prestamoLocal.getId());}}
			if(conDefault || (!conDefault && prestamoLocal.getid_empleado()!=null && !prestamoLocal.getid_empleado().equals(-1L))) {prestamoBean.setid_empleado(prestamoLocal.getid_empleado());}
			if(conDefault || (!conDefault && prestamoLocal.getid_tipo_prestamo()!=null && !prestamoLocal.getid_tipo_prestamo().equals(-1L))) {prestamoBean.setid_tipo_prestamo(prestamoLocal.getid_tipo_prestamo());}
			if(conDefault || (!conDefault && prestamoLocal.getid_tipo_cuota()!=null && !prestamoLocal.getid_tipo_cuota().equals(-1L))) {prestamoBean.setid_tipo_cuota(prestamoLocal.getid_tipo_cuota());}
			if(conDefault || (!conDefault && prestamoLocal.getid_asiento_contable()!=null && !prestamoLocal.getid_asiento_contable().equals(null))) {prestamoBean.setid_asiento_contable(prestamoLocal.getid_asiento_contable());}
			if(conDefault || (!conDefault && prestamoLocal.getcodigo()!=null && !prestamoLocal.getcodigo().equals(""))) {prestamoBean.setcodigo(prestamoLocal.getcodigo());}
			if(conDefault || (!conDefault && prestamoLocal.getnumero_pre_impreso()!=null && !prestamoLocal.getnumero_pre_impreso().equals(""))) {prestamoBean.setnumero_pre_impreso(prestamoLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && prestamoLocal.getfecha()!=null && !prestamoLocal.getfecha().equals(new Date()))) {prestamoBean.setfecha(prestamoLocal.getfecha());}
			if(conDefault || (!conDefault && prestamoLocal.getmonto()!=null && !prestamoLocal.getmonto().equals(0.0))) {prestamoBean.setmonto(prestamoLocal.getmonto());}
			if(conDefault || (!conDefault && prestamoLocal.getnumero_cuotas()!=null && !prestamoLocal.getnumero_cuotas().equals(0))) {prestamoBean.setnumero_cuotas(prestamoLocal.getnumero_cuotas());}
			if(conDefault || (!conDefault && prestamoLocal.gettasa()!=null && !prestamoLocal.gettasa().equals(0.0))) {prestamoBean.settasa(prestamoLocal.gettasa());}
			if(conDefault || (!conDefault && prestamoLocal.getdescripcion()!=null && !prestamoLocal.getdescripcion().equals(""))) {prestamoBean.setdescripcion(prestamoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPrestamoGenerico(Long idPrestamoSeleccionado,JComboBox jComboBoxPrestamo,List<Prestamo> prestamosLocal)throws Exception {
		try {
			Prestamo  prestamoTemp=null;

			for(Prestamo prestamoAux:prestamosLocal) {
				if(prestamoAux.getId()!=null && prestamoAux.getId().equals(idPrestamoSeleccionado)) {
					prestamoTemp=prestamoAux;
					break;
				}
			}

			jComboBoxPrestamo.setSelectedItem(prestamoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPrestamoGenerico(JComboBox jComboBoxPrestamo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPrestamo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPrestamo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPrestamo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPrestamo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("AbonoPrestamo")) {
			jButtonAbonoPrestamoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cuota")) {
			jButtonCuotaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prestamo=(Prestamo) prestamoLogic.getPrestamos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			prestamo =(Prestamo) prestamos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!prestamo.getIsNew() && !prestamo.getIsChanged() && !prestamo.getIsDeleted()) {
				sDescripcion=prestamo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=prestamo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!prestamo.getIsNew() && !prestamo.getIsChanged() && !prestamo.getIsDeleted()) {
				sDescripcion=prestamo.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=prestamo.getempleado_descripcion();
			}
		}

		if(sTipo.equals("TipoPrestamo")) {
			//sDescripcion=this.getActualTipoPrestamoForeignKeyDescripcion((Long)value);
			if(!prestamo.getIsNew() && !prestamo.getIsChanged() && !prestamo.getIsDeleted()) {
				sDescripcion=prestamo.gettipoprestamo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPrestamoForeignKeyDescripcion((Long)value);
				sDescripcion=prestamo.gettipoprestamo_descripcion();
			}
		}

		if(sTipo.equals("TipoCuota")) {
			//sDescripcion=this.getActualTipoCuotaForeignKeyDescripcion((Long)value);
			if(!prestamo.getIsNew() && !prestamo.getIsChanged() && !prestamo.getIsDeleted()) {
				sDescripcion=prestamo.gettipocuota_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCuotaForeignKeyDescripcion((Long)value);
				sDescripcion=prestamo.gettipocuota_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!prestamo.getIsNew() && !prestamo.getIsChanged() && !prestamo.getIsDeleted()) {
				sDescripcion=prestamo.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=prestamo.getasientocontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Prestamo prestamoRow=new Prestamo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prestamoRow=(Prestamo) prestamoLogic.getPrestamos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			prestamoRow=(Prestamo) prestamos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonAbonoPrestamoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Prestamo prestamo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPrestamo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo = (Prestamo)this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.prestamo = (Prestamo)this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(prestamo!=null) {
						this.prestamo = prestamo;
					} else {
						this.prestamo = new Prestamo();
					}
				}

				if(this.isTienePermisosAbonoPrestamo && this.permiteMantenimiento(this.prestamo)) {
					AbonoPrestamoBeanSwingJInternalFrame abonoprestamoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFramePopup=new AbonoPrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						abonoprestamoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFramePopup;
					} else {
						abonoprestamoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame;
					}

					List<Prestamo> prestamos=new ArrayList<Prestamo>();
					prestamos.add(this.prestamo);
					if(!esRelacionado) {
						//abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.setConGuardarRelaciones(false);
						//abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					abonoprestamoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPrestamo.cargarAbonoPrestamoBeanSwingJInternalFrame(prestamos,this.prestamo,abonoprestamoBeanSwingJInternalFrame,/*conInicializar,*/abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.getConGuardarRelaciones(),abonoprestamoBeanSwingJInternalFrame.abonoprestamoSessionBean.getEsGuardarRelacionado());
					abonoprestamoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						abonoprestamoBeanSwingJInternalFrame.actualizarEstadoPanelsAbonoPrestamo("no_relacionado");

						abonoprestamoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AbonoPrestamoConstantesFunciones.ITAMANIOFILATABLA + (AbonoPrestamoConstantesFunciones.ITAMANIOFILATABLA/2));

						abonoprestamoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
						TitledBorder titledBorderAbonoPrestamo=(TitledBorder)abonoprestamoBeanSwingJInternalFrame.jScrollPanelDatosAbonoPrestamo.getBorder();

						titledBorderAbonoPrestamo.setTitle(titledBorderPrestamo.getTitle() + " -> Abono Prestamo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,abonoprestamoBeanSwingJInternalFrame);
						}

						abonoprestamoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(abonoprestamoBeanSwingJInternalFrame);

						abonoprestamoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.prestamoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Abono Prestamo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCuotaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Prestamo prestamo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPrestamo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo = (Prestamo)this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.prestamo = (Prestamo)this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(prestamo!=null) {
						this.prestamo = prestamo;
					} else {
						this.prestamo = new Prestamo();
					}
				}

				if(this.isTienePermisosCuota && this.permiteMantenimiento(this.prestamo)) {
					CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFramePopup=new CuotaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuotaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFramePopup;
					} else {
						cuotaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame;
					}

					List<Prestamo> prestamos=new ArrayList<Prestamo>();
					prestamos.add(this.prestamo);
					if(!esRelacionado) {
						//cuotaBeanSwingJInternalFrame.cuotaSessionBean.setConGuardarRelaciones(false);
						//cuotaBeanSwingJInternalFrame.cuotaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuotaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPrestamo.cargarCuotaBeanSwingJInternalFrame(prestamos,this.prestamo,cuotaBeanSwingJInternalFrame,/*conInicializar,*/cuotaBeanSwingJInternalFrame.cuotaSessionBean.getConGuardarRelaciones(),cuotaBeanSwingJInternalFrame.cuotaSessionBean.getEsGuardarRelacionado());
					cuotaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("no_relacionado");

						cuotaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuotaConstantesFunciones.ITAMANIOFILATABLA + (CuotaConstantesFunciones.ITAMANIOFILATABLA/2));

						cuotaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
						TitledBorder titledBorderCuota=(TitledBorder)cuotaBeanSwingJInternalFrame.jScrollPanelDatosCuota.getBorder();

						titledBorderCuota.setTitle(titledBorderPrestamo.getTitle() + " -> Cuota");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuotaBeanSwingJInternalFrame);
						}

						cuotaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuotaBeanSwingJInternalFrame);

						cuotaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.prestamoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuota",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPrestamo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPrestamo.setVisible((this.isVisibilidadCeldaNuevoPrestamo && this.isPermisoNuevoPrestamo));			
			this.jButtonDuplicarPrestamo.setVisible((this.isVisibilidadCeldaDuplicarPrestamo && this.isPermisoDuplicarPrestamo));			
			this.jButtonCopiarPrestamo.setVisible((this.isVisibilidadCeldaCopiarPrestamo && this.isPermisoCopiarPrestamo));
			this.jButtonVerFormPrestamo.setVisible((this.isVisibilidadCeldaVerFormPrestamo && this.isPermisoVerFormPrestamo));
			
			this.jButtonAbrirOrderByPrestamo.setVisible((this.isVisibilidadCeldaOrdenPrestamo && this.isPermisoOrdenPrestamo));			
			
			this.jButtonNuevoRelacionesPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrestamo && this.isPermisoNuevoPrestamo));			
			this.jButtonNuevoGuardarCambiosPrestamo.setVisible((this.isVisibilidadCeldaNuevoPrestamo && this.isPermisoNuevoPrestamo && this.isPermisoGuardarCambiosPrestamo));
			
			if(this.jInternalFrameDetalleFormPrestamo!=null) {
			this.jInternalFrameDetalleFormPrestamo.jButtonModificarPrestamo.setVisible((this.isVisibilidadCeldaModificarPrestamo && this.isPermisoActualizarPrestamo));	
			this.jInternalFrameDetalleFormPrestamo.jButtonActualizarPrestamo.setVisible((this.isVisibilidadCeldaActualizarPrestamo && this.isPermisoActualizarPrestamo));	
			this.jInternalFrameDetalleFormPrestamo.jButtonEliminarPrestamo.setVisible((this.isVisibilidadCeldaEliminarPrestamo && this.isPermisoEliminarPrestamo));
			this.jInternalFrameDetalleFormPrestamo.jButtonCancelarPrestamo.setVisible(this.isVisibilidadCeldaCancelarPrestamo);							
			this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosPrestamo.setVisible((this.isVisibilidadCeldaGuardarPrestamo && this.isPermisoGuardarCambiosPrestamo));			
			
			}
						
			this.jButtonGuardarCambiosTablaPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosPrestamo && this.isPermisoGuardarCambiosPrestamo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPrestamo.setVisible((this.isVisibilidadCeldaNuevoPrestamo && this.isPermisoNuevoPrestamo));						
			this.jButtonDuplicarToolBarPrestamo.setVisible((this.isVisibilidadCeldaDuplicarPrestamo && this.isPermisoDuplicarPrestamo));						
			this.jButtonCopiarToolBarPrestamo.setVisible((this.isVisibilidadCeldaCopiarPrestamo && this.isPermisoCopiarPrestamo));			
			this.jButtonVerFormToolBarPrestamo.setVisible((this.isVisibilidadCeldaVerFormPrestamo && this.isPermisoVerFormPrestamo));			
			this.jButtonAbrirOrderByToolBarPrestamo.setVisible((this.isVisibilidadCeldaOrdenPrestamo && this.isPermisoOrdenPrestamo));
			this.jButtonNuevoRelacionesToolBarPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrestamo && this.isPermisoNuevoPrestamo));			
			this.jButtonNuevoGuardarCambiosToolBarPrestamo.setVisible((this.isVisibilidadCeldaNuevoPrestamo && this.isPermisoNuevoPrestamo && this.isPermisoGuardarCambiosPrestamo));			
			
			if(this.jInternalFrameDetalleFormPrestamo!=null) {
			this.jInternalFrameDetalleFormPrestamo.jButtonModificarToolBarPrestamo.setVisible((this.isVisibilidadCeldaModificarPrestamo && this.isPermisoActualizarPrestamo));	
			this.jInternalFrameDetalleFormPrestamo.jButtonActualizarToolBarPrestamo.setVisible((this.isVisibilidadCeldaActualizarPrestamo  && this.isPermisoActualizarPrestamo));	
			this.jInternalFrameDetalleFormPrestamo.jButtonEliminarToolBarPrestamo.setVisible((this.isVisibilidadCeldaEliminarPrestamo && this.isPermisoEliminarPrestamo));
			this.jInternalFrameDetalleFormPrestamo.jButtonCancelarToolBarPrestamo.setVisible(this.isVisibilidadCeldaCancelarPrestamo);				
			this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosToolBarPrestamo.setVisible((this.isVisibilidadCeldaGuardarPrestamo && this.isPermisoGuardarCambiosPrestamo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosPrestamo && this.isPermisoGuardarCambiosPrestamo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPrestamo.setVisible((this.isVisibilidadCeldaNuevoPrestamo && this.isPermisoNuevoPrestamo));			
			this.jMenuItemDuplicarPrestamo.setVisible((this.isVisibilidadCeldaDuplicarPrestamo && this.isPermisoDuplicarPrestamo));			
			this.jMenuItemCopiarPrestamo.setVisible((this.isVisibilidadCeldaCopiarPrestamo && this.isPermisoCopiarPrestamo));			
			this.jMenuItemVerFormPrestamo.setVisible((this.isVisibilidadCeldaVerFormPrestamo && this.isPermisoVerFormPrestamo));			
			this.jMenuItemAbrirOrderByPrestamo.setVisible((this.isVisibilidadCeldaOrdenPrestamo && this.isPermisoOrdenPrestamo));			
			//this.jMenuItemMostrarOcultarPrestamo.setVisible((this.isVisibilidadCeldaOrdenPrestamo && this.isPermisoOrdenPrestamo));
			this.jMenuItemDetalleAbrirOrderByPrestamo.setVisible((this.isVisibilidadCeldaOrdenPrestamo && this.isPermisoOrdenPrestamo));			
			//this.jMenuItemDetalleMostrarOcultarPrestamo.setVisible((this.isVisibilidadCeldaOrdenPrestamo && this.isPermisoOrdenPrestamo));			
			this.jMenuItemNuevoRelacionesPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrestamo && this.isPermisoNuevoPrestamo));			
			this.jMenuItemNuevoGuardarCambiosPrestamo.setVisible((this.isVisibilidadCeldaNuevoPrestamo && this.isPermisoNuevoPrestamo && this.isPermisoGuardarCambiosPrestamo));									
			
			if(this.jInternalFrameDetalleFormPrestamo!=null) {
			this.jInternalFrameDetalleFormPrestamo.jMenuItemModificarPrestamo.setVisible((this.isVisibilidadCeldaModificarPrestamo && this.isPermisoActualizarPrestamo));	
			this.jInternalFrameDetalleFormPrestamo.jMenuItemActualizarPrestamo.setVisible((this.isVisibilidadCeldaActualizarPrestamo && this.isPermisoActualizarPrestamo));	
			this.jInternalFrameDetalleFormPrestamo.jMenuItemEliminarPrestamo.setVisible((this.isVisibilidadCeldaEliminarPrestamo && this.isPermisoEliminarPrestamo));
			this.jInternalFrameDetalleFormPrestamo.jMenuItemCancelarPrestamo.setVisible(this.isVisibilidadCeldaCancelarPrestamo);				
			}
			
			this.jMenuItemGuardarCambiosPrestamo.setVisible((this.isVisibilidadCeldaGuardarPrestamo && this.isPermisoGuardarCambiosPrestamo));						
			this.jMenuItemGuardarCambiosTablaPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosPrestamo && this.isPermisoGuardarCambiosPrestamo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPrestamo=this.jButtonNuevoPrestamo.isVisible();
			this.isVisibilidadCeldaDuplicarPrestamo=this.jButtonDuplicarPrestamo.isVisible();
			this.isVisibilidadCeldaCopiarPrestamo=this.jButtonCopiarPrestamo.isVisible();
			this.isVisibilidadCeldaVerFormPrestamo=this.jButtonVerFormPrestamo.isVisible();
			
			this.isVisibilidadCeldaOrdenPrestamo=this.jButtonAbrirOrderByPrestamo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=this.jButtonNuevoRelacionesPrestamo.isVisible();
			this.isVisibilidadCeldaModificarPrestamo=this.jButtonModificarPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormPrestamo!=null) {
			this.isVisibilidadCeldaActualizarPrestamo=this.jInternalFrameDetalleFormPrestamo.jButtonActualizarPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarPrestamo=this.jInternalFrameDetalleFormPrestamo.jButtonEliminarPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarPrestamo=this.jInternalFrameDetalleFormPrestamo.jButtonCancelarPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarPrestamo=this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosPrestamo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPrestamo=this.jButtonGuardarCambiosTablaPrestamo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPrestamo=this.jButtonNuevoToolBarPrestamo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=this.jButtonNuevoRelacionesToolBarPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormPrestamo!=null) {
			this.isVisibilidadCeldaModificarPrestamo=this.jInternalFrameDetalleFormPrestamo.jButtonModificarToolBarPrestamo.isVisible();
			this.isVisibilidadCeldaActualizarPrestamo=this.jInternalFrameDetalleFormPrestamo.jButtonActualizarToolBarPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarPrestamo=this.jInternalFrameDetalleFormPrestamo.jButtonEliminarToolBarPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarPrestamo=this.jInternalFrameDetalleFormPrestamo.jButtonCancelarToolBarPrestamo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPrestamo=this.jButtonGuardarCambiosToolBarPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPrestamo=this.jButtonGuardarCambiosTablaToolBarPrestamo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPrestamo=this.jMenuItemNuevoPrestamo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=this.jMenuItemNuevoRelacionesPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormPrestamo!=null) {
			this.isVisibilidadCeldaModificarPrestamo=this.jInternalFrameDetalleFormPrestamo.jMenuItemModificarPrestamo.isVisible();
			this.isVisibilidadCeldaActualizarPrestamo=this.jInternalFrameDetalleFormPrestamo.jMenuItemActualizarPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarPrestamo=this.jInternalFrameDetalleFormPrestamo.jMenuItemEliminarPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarPrestamo=this.jInternalFrameDetalleFormPrestamo.jMenuItemCancelarPrestamo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPrestamo=this.jMenuItemGuardarCambiosPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPrestamo=this.jMenuItemGuardarCambiosTablaPrestamo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPrestamo(Boolean esInicializar) {
		if(PrestamoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.prestamoSessionBean.getConGuardarRelaciones()) {
				//if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPrestamo();
			}
			
			this.inicializarActualizarBindingBotonesManualPrestamo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPrestamo() {
		this.jButtonNuevoPrestamo.setVisible(this.isPermisoNuevoPrestamo);			
		this.jButtonDuplicarPrestamo.setVisible(this.isPermisoDuplicarPrestamo);			
		this.jButtonCopiarPrestamo.setVisible(this.isPermisoCopiarPrestamo);			
		this.jButtonVerFormPrestamo.setVisible(this.isPermisoVerFormPrestamo);			
		
		this.jButtonAbrirOrderByPrestamo.setVisible(this.isPermisoOrdenPrestamo);					
		
		this.jButtonNuevoRelacionesPrestamo.setVisible(this.isPermisoNuevoPrestamo);			
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonModificarPrestamo.setVisible(this.isPermisoActualizarPrestamo);	
			this.jInternalFrameDetalleFormPrestamo.jButtonActualizarPrestamo.setVisible(this.isPermisoActualizarPrestamo);	
			this.jInternalFrameDetalleFormPrestamo.jButtonEliminarPrestamo.setVisible(this.isPermisoEliminarPrestamo);
			this.jInternalFrameDetalleFormPrestamo.jButtonCancelarPrestamo.setVisible(this.isVisibilidadCeldaCancelarPrestamo);						
			this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosPrestamo.setVisible(this.isPermisoGuardarCambiosPrestamo);							
		}
		
		this.jButtonGuardarCambiosTablaPrestamo.setVisible(this.isPermisoActualizarPrestamo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePrestamo() {
		this.jInternalFrameDetalleFormPrestamo.jButtonModificarPrestamo.setVisible(this.isPermisoActualizarPrestamo);	
		this.jInternalFrameDetalleFormPrestamo.jButtonActualizarPrestamo.setVisible(this.isPermisoActualizarPrestamo);	
		this.jInternalFrameDetalleFormPrestamo.jButtonEliminarPrestamo.setVisible(this.isPermisoEliminarPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jButtonCancelarPrestamo.setVisible(this.isVisibilidadCeldaCancelarPrestamo);							
		this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosPrestamo.setVisible((this.isVisibilidadCeldaGuardarPrestamo && this.isPermisoGuardarCambiosPrestamo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPrestamo() {
		if(PrestamoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPrestamo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPrestamo() {
	}
	
	public void jTableDatosPrestamoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPrestamo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.prestamo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPrestamo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.prestamoLogic.getConnexion());

				if(this.prestamo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.prestamo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPrestamo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.prestamo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoPrestamoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPrestamo=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosPrestamo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPrestamo.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoPrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebPrestamo(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.prestamoLogic.getConnexion());

				if(this.prestamo.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.prestamo.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPrestamo.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.prestamo.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_prestamoPrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprestamo=true;

			idTienePermisotipoprestamo=this.tienePermisosUsuarioEnPaginaWebPrestamo(TipoPrestamoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprestamo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);

				this.tipoprestamoBeanSwingJInternalFrame=new TipoPrestamoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprestamoBeanSwingJInternalFrame.getTipoPrestamoLogic().setConnexion(this.prestamoLogic.getConnexion());

				if(this.prestamo.getid_tipo_prestamo()!=null) {
					this.tipoprestamoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprestamoBeanSwingJInternalFrame.setIdActual(this.prestamo.getid_tipo_prestamo());
					this.tipoprestamoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprestamoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrestamo();
				}

				JInternalFrameBase jinternalFrame =this.tipoprestamoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
				TitledBorder titledBordertipoprestamo=(TitledBorder)this.tipoprestamoBeanSwingJInternalFrame.jScrollPanelDatosTipoPrestamo.getBorder();

				titledBordertipoprestamo.setTitle(titledBorderPrestamo.getTitle() + " -> Tipo Prestamo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_prestamoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getid_tipo_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_prestamo = "+this.prestamo.getid_tipo_prestamo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_cuotaPrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocuota=true;

			idTienePermisotipocuota=this.tienePermisosUsuarioEnPaginaWebPrestamo(TipoCuotaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocuota) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);

				this.tipocuotaBeanSwingJInternalFrame=new TipoCuotaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocuotaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocuotaBeanSwingJInternalFrame.getTipoCuotaLogic().setConnexion(this.prestamoLogic.getConnexion());

				if(this.prestamo.getid_tipo_cuota()!=null) {
					this.tipocuotaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocuotaBeanSwingJInternalFrame.setIdActual(this.prestamo.getid_tipo_cuota());
					this.tipocuotaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocuotaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuota();
				}

				JInternalFrameBase jinternalFrame =this.tipocuotaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
				TitledBorder titledBordertipocuota=(TitledBorder)this.tipocuotaBeanSwingJInternalFrame.jScrollPanelDatosTipoCuota.getBorder();

				titledBordertipocuota.setTitle(titledBorderPrestamo.getTitle() + " -> Tipo Cuota");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_cuotaPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getid_tipo_cuota()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_cuota = "+this.prestamo.getid_tipo_cuota().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contablePrestamoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="AsientoContable";

			if(!this.sFinalQueryGeneral_asientocontable.equals("")) {
				this.asientocontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_asientocontable);
				this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.asientocontableBeanSwingJInternalFrame.procesarBusqueda(this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingAsientoContable(false);
			}

			if(!this.sFinalQueryComboAsientoContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPrestamo=null;
			TitledBorder titledBorderasientocontable=null;

			if(!this.jScrollPanelDatosPrestamo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
				titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderPrestamo.getTitle() + " -> Asiento Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_asiento_contablePrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebPrestamo(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.prestamoLogic.getConnexion());

				if(this.prestamo.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.prestamo.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrestamo=(TitledBorder)this.jScrollPanelDatosPrestamo.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderPrestamo.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contablePrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.prestamo.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.prestamo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.prestamo.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.prestamo.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.prestamo.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuotasPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getnumero_cuotas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuotas = "+this.prestamo.getnumero_cuotas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontasaPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.gettasa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tasa = "+this.prestamo.gettasa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.getprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prestamo==null) {
						this.prestamo = new Prestamo();
					}

					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);
				}

				if(this.prestamo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.prestamo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAsientoContablePrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrestamo(false,false);

			this.getPrestamosFK_IdAsientoContable();

			this.inicializarActualizarBindingPrestamo(false);

			//if(PrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoPrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrestamo(false,false);

			this.getPrestamosFK_IdEmpleado();

			this.inicializarActualizarBindingPrestamo(false);

			//if(PrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrestamo(false,false);

			this.getPrestamosFK_IdEmpresa();

			this.inicializarActualizarBindingPrestamo(false);

			//if(PrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCuotaPrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrestamo(false,false);

			this.getPrestamosFK_IdTipoCuota();

			this.inicializarActualizarBindingPrestamo(false);

			//if(PrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrestamoPrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrestamo(false,false);

			this.getPrestamosFK_IdTipoPrestamo();

			this.inicializarActualizarBindingPrestamo(false);

			//if(PrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePrestamo() {
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
		

		if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
			this.jInternalFrameDetalleFormPrestamo.setVisible(false);	    			
			this.jInternalFrameDetalleFormPrestamo.dispose();
			this.jInternalFrameDetalleFormPrestamo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
			this.jInternalFrameReporteDinamicoPrestamo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPrestamo.dispose();
			this.jInternalFrameReporteDinamicoPrestamo=null;
		}
		
		if(this.jInternalFrameImportacionPrestamo!=null) {
			this.jInternalFrameImportacionPrestamo.setVisible(false);	    			
			this.jInternalFrameImportacionPrestamo.dispose();
			this.jInternalFrameImportacionPrestamo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPrestamo();
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPrestamo")) {
				jButtonNuevoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPrestamo")) {
				jButtonDuplicarPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPrestamo")) {
				jButtonCopiarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPrestamo")) {
				jButtonVerFormPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPrestamo")) {
				jButtonNuevoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPrestamo")) {
				jButtonDuplicarPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPrestamo")) {
				jButtonNuevoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPrestamo")) {
				jButtonDuplicarPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPrestamo")) {
				jButtonNuevoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPrestamo")) {
				jButtonNuevoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPrestamo")) {
				jButtonNuevoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPrestamo")) {
				jButtonModificarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPrestamo")) {
				jButtonModificarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPrestamo")) {
				jButtonModificarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPrestamo")) {
				jButtonActualizarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPrestamo")) {
				jButtonActualizarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPrestamo")) {
				jButtonActualizarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPrestamo")) {
				jButtonEliminarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPrestamo")) {
				jButtonEliminarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPrestamo")) {
				jButtonEliminarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPrestamo")) {
				jButtonCancelarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPrestamo")) {
				jButtonCancelarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPrestamo")) {
				jButtonCancelarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPrestamo")) {
				jButtonCerrarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPrestamo")) {
				jButtonCerrarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPrestamo")) {
				jButtonCerrarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPrestamo")) {
				jButtonMostrarOcultarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPrestamo")) {
				jButtonCancelarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPrestamo")) {
				jButtonGuardarCambiosPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPrestamo")) {
				jButtonGuardarCambiosPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPrestamo")) {
				jButtonCopiarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPrestamo")) {
				jButtonVerFormPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPrestamo")) {
				jButtonGuardarCambiosPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPrestamo")) {
				jButtonCopiarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPrestamo")) {
				jButtonVerFormPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPrestamo")) {
				jButtonGuardarCambiosPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPrestamo")) {
				jButtonGuardarCambiosPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPrestamo")) {
				jButtonGuardarCambiosPrestamoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPrestamo")) {
				jButtonRecargarInformacionPrestamoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPrestamo")) {
				jButtonRecargarInformacionPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPrestamo")) {
				jButtonRecargarInformacionPrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPrestamo")) {
				jButtonAnterioresPrestamoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPrestamo")) {
				jButtonAnterioresPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePrestamo")) {
				jButtonAnterioresPrestamoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPrestamo")) {
				jButtonSiguientesPrestamoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPrestamo")) {
				jButtonSiguientesPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPrestamo")) {
				jButtonSiguientesPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPrestamo") || sTipo.equals("MenuItemDetalleAbrirOrderByPrestamo")) {
				jButtonAbrirOrderByPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPrestamo") || sTipo.equals("MenuItemDetalleMostrarOcultarPrestamo")) {
				jButtonMostrarOcultarPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPrestamo")) {
				jButtonNuevoGuardarCambiosPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPrestamo")) {
				jButtonNuevoGuardarCambiosPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPrestamo")) {
				jButtonNuevoGuardarCambiosPrestamoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPrestamo")) {
				jButtonCerrarReporteDinamicoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPrestamo")) {
				jButtonGenerarReporteDinamicoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPrestamo")) {
				
				jButtonGenerarExcelReporteDinamicoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPrestamo")) {
				jButtonCerrarImportacionPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPrestamo")) {
				
				jButtonGenerarImportacionPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPrestamo")) {
				
				jButtonAbrirImportacionPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPrestamo")) {
				jComboBoxTiposAccionesPrestamoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPrestamo")) {
				jComboBoxTiposRelacionesPrestamoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPrestamo")) {
				jComboBoxTiposAccionesPrestamoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPrestamo")) {
				
				jComboBoxTiposSeleccionarPrestamoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPrestamo")) {
				jTextFieldValorCampoGeneralPrestamoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPrestamo")) {
				jButtonAbrirOrderByPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPrestamo")) {
				jButtonAbrirOrderByPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPrestamo")) {
				jButtonCerrarOrderByPrestamoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPrestamoBusqueda")) {
				this.jButtonidPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPrestamoUpdate")) {
				this.jButtonid_empresaPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPrestamoBusqueda")) {
				this.jButtonid_empresaPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoPrestamo")) {
				this.jButtonid_empleadoPrestamoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPrestamoUpdate")) {
				this.jButtonid_empleadoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPrestamoBusqueda")) {
				this.jButtonid_empleadoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_prestamoPrestamoUpdate")) {
				this.jButtonid_tipo_prestamoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_prestamoPrestamoBusqueda")) {
				this.jButtonid_tipo_prestamoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuotaPrestamoUpdate")) {
				this.jButtonid_tipo_cuotaPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuotaPrestamoBusqueda")) {
				this.jButtonid_tipo_cuotaPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contablePrestamo")) {
				this.jButtonid_asiento_contablePrestamoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contablePrestamoUpdate")) {
				this.jButtonid_asiento_contablePrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contablePrestamoBusqueda")) {
				this.jButtonid_asiento_contablePrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPrestamoBusqueda")) {
				this.jButtoncodigoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoPrestamoBusqueda")) {
				this.jButtonnumero_pre_impresoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPrestamoBusqueda")) {
				this.jButtonfechaPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoPrestamoBusqueda")) {
				this.jButtonmontoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotasPrestamoBusqueda")) {
				this.jButtonnumero_cuotasPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tasaPrestamoBusqueda")) {
				this.jButtontasaPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPrestamoBusqueda")) {
				this.jButtondescripcionPrestamoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_asiento_contablePrestamo")) {
				this.jButtonid_asiento_contablePrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("id_empleadoPrestamo")) {
				this.jButtonid_empleadoPrestamoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAsientoContablePrestamo")) {
				this.jButtonFK_IdAsientoContablePrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoPrestamo")) {
				this.jButtonFK_IdEmpleadoPrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCuotaPrestamo")) {
				this.jButtonFK_IdTipoCuotaPrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPrestamoPrestamo")) {
				this.jButtonFK_IdTipoPrestamoPrestamoActionPerformed(evt);
			}
			
			;
			
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPrestamo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrestamoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				


				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Prestamo prestamoLocal=null;
			
			if(!this.getEsControlTabla()) {
				prestamoLocal=this.prestamo;
			} else {
				prestamoLocal=this.prestamoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
							
				
				


				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoAnterior =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prestamoAnterior =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
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
			
			


			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrestamoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
								
						
				


				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
								
				
				


				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoAnterior =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prestamoAnterior =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoAnterior =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prestamoAnterior =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrestamoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
							
				
				


				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrestamoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamoAnterior =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.prestamoAnterior =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
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
			
			


			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrestamoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
								
				
				


				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoAnterior =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prestamoAnterior =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrestamoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrestamoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPrestamo")) {
					jCheckBoxSeleccionarTodosPrestamoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPrestamo")) {
					jCheckBoxSeleccionadosPrestamoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPrestamo")) {
					
				}
				
				


				
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
												
				
				


				
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrestamoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prestamoAnterior =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.prestamoAnterior =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrestamoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
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
			
			


			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrestamoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prestamo);
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
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
				
				


				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Prestamo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Prestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prestamoAnterior =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prestamoAnterior =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPrestamo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPrestamoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPrestamo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.prestamo =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.prestamo =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.prestamo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPrestamo")) {
				
				}
				
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPrestamo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPrestamo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPrestamo")) {
			
			}
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPrestamo();
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
			if(sTipo.equals("NuevoPrestamo")) {
				jButtonNuevoPrestamoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPrestamo")) {
				jButtonDuplicarPrestamoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPrestamo")) {
				jButtonCopiarPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPrestamo")) {
				jButtonVerFormPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPrestamo")) {
				jButtonNuevoPrestamoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPrestamo")) {
				jButtonModificarPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPrestamo")) {
				jButtonActualizarPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPrestamo")) {
				jButtonEliminarPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPrestamo")) {
				jButtonGuardarCambiosPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPrestamo")) {
				jButtonCancelarPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPrestamo")) {
				jButtonCerrarPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPrestamo")) {
				jButtonGuardarCambiosPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPrestamo")) {
				jButtonNuevoGuardarCambiosPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPrestamo")) {
				jButtonAbrirOrderByPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPrestamo")) {
				jButtonRecargarInformacionPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPrestamo")) {
				jButtonAnterioresPrestamoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPrestamo")) {
				jButtonSiguientesPrestamoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPrestamoBusqueda")) {
				this.jButtonidPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPrestamoUpdate")) {
				this.jButtonid_empresaPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPrestamoBusqueda")) {
				this.jButtonid_empresaPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoPrestamo")) {
				this.jButtonid_empleadoPrestamoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPrestamoUpdate")) {
				this.jButtonid_empleadoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPrestamoBusqueda")) {
				this.jButtonid_empleadoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_prestamoPrestamoUpdate")) {
				this.jButtonid_tipo_prestamoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_prestamoPrestamoBusqueda")) {
				this.jButtonid_tipo_prestamoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuotaPrestamoUpdate")) {
				this.jButtonid_tipo_cuotaPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuotaPrestamoBusqueda")) {
				this.jButtonid_tipo_cuotaPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contablePrestamo")) {
				this.jButtonid_asiento_contablePrestamoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contablePrestamoUpdate")) {
				this.jButtonid_asiento_contablePrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contablePrestamoBusqueda")) {
				this.jButtonid_asiento_contablePrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPrestamoBusqueda")) {
				this.jButtoncodigoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoPrestamoBusqueda")) {
				this.jButtonnumero_pre_impresoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPrestamoBusqueda")) {
				this.jButtonfechaPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoPrestamoBusqueda")) {
				this.jButtonmontoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotasPrestamoBusqueda")) {
				this.jButtonnumero_cuotasPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tasaPrestamoBusqueda")) {
				this.jButtontasaPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPrestamoBusqueda")) {
				this.jButtondescripcionPrestamoBusquedaActionPerformed(evt);
			}
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPrestamo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePrestamo")) {
				closingInternalFramePrestamo();
				
			} else if(sTipo.equals("jButtonCancelarPrestamo")) {
				JInternalFrameBase jInternalFrameDetalleFormPrestamo = (JInternalFrameBase)evt.getSource();
	            	
	            PrestamoBeanSwingJInternalFrame jInternalFrameParent=(PrestamoBeanSwingJInternalFrame)jInternalFrameDetalleFormPrestamo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPrestamoActionPerformed(null);
			}
			
			PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.prestamo,new Object(),this.prestamoParameterGeneral,this.prestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPrestamo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPrestamo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPrestamo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.prestamo)) {
			if(!esControlTabla) {
				if(PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);			
				}
				
				if(this.prestamoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPrestamo(this.prestamo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.prestamoReturnGeneral=prestamoLogic.procesarEventosPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prestamoLogic.getPrestamos(),this.prestamo,this.prestamoParameterGeneral,this.isEsNuevoPrestamo,classes);//this.prestamoLogic.getPrestamo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPrestamo(this.prestamoReturnGeneral,this.prestamoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.prestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPrestamo(classes,this.prestamoReturnGeneral,this.prestamoBean,false);
					}
						
					if(this.prestamoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPrestamo(this.prestamoReturnGeneral.getPrestamo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPrestamo(this.prestamoReturnGeneral.getPrestamo());	
					}
						
					if(this.prestamoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPrestamo(this.prestamoReturnGeneral.getPrestamo(),classes);//this.prestamoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPrestamo(this.prestamo,classes);//this.prestamoBean);									
				}
			
				if(PrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPrestamo(this.prestamo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPrestamo(this.prestamo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.prestamoAnterior!=null) {
						this.prestamo=this.prestamoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.prestamoReturnGeneral=prestamoLogic.procesarEventosPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prestamoLogic.getPrestamos(),this.prestamo,this.prestamoParameterGeneral,this.isEsNuevoPrestamo,classes);//this.prestamoLogic.getPrestamo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.prestamoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.prestamoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.prestamoReturnGeneral.getPrestamo(),prestamoLogic.getPrestamos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.prestamoReturnGeneral.getPrestamo(),this.prestamos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPrestamo.repaint();
				
				//((AbstractTableModel) this.jTableDatosPrestamo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPrestamo();
			}
		}
	}
	
	public void actualizarVisualTableDatosPrestamo() throws Exception {
		
		PrestamoModel prestamoModel=(PrestamoModel)this.jTableDatosPrestamo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prestamoModel.prestamos=this.prestamoLogic.getPrestamos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			prestamoModel.prestamos=this.prestamos;
		}
		
		
		((PrestamoModel) this.jTableDatosPrestamo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPrestamo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprestamoAnterior(),this.prestamoLogic.getPrestamos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprestamoAnterior(),this.prestamos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPrestamo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPrestamo(Prestamo prestamo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AbonoPrestamo.class)) {
					this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.setAbonoPrestamos(prestamo.getAbonoPrestamos());
					this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAbonoPrestamo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(prestamo.getCuotas());
					this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
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
										
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prestamo,new Object(),generalEntityParameterGeneral,this.prestamoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.prestamoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PrestamoConstantesFunciones.getClassesRelationshipsOfPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PrestamoConstantesFunciones.getClassesRelationshipsFromStringsOfPrestamo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPrestamo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prestamo,new Object(),generalEntityParameterGeneral,this.prestamoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPrestamo(PrestamoBean prestamoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AbonoPrestamo.class)) {
					this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.setAbonoPrestamos(prestamo.getAbonoPrestamos());
					this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAbonoPrestamo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.setCuotas(prestamo.getCuotas());
					this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPrestamo(ArrayList<Classe> classes,PrestamoReturnGeneral prestamoReturnGeneral,PrestamoBean prestamoBean,Boolean conDefault) throws Exception {
		
			this.prestamoBean.setAbonoPrestamos(prestamoReturnGeneral.getPrestamo().getAbonoPrestamos());
			this.prestamoBean.setCuotas(prestamoReturnGeneral.getPrestamo().getCuotas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPrestamo(Prestamo prestamo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(AbonoPrestamo.class)) {
					prestamo.setAbonoPrestamos(this.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.abonoprestamoLogic.getAbonoPrestamos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cuota.class)) {
					prestamo.setCuotas(this.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.cuotaLogic.getCuotas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.prestamo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPrestamo = new PrestamoDetalleFormJInternalFrame(jDesktopPane,this.prestamoSessionBean.getConGuardarRelaciones(),this.prestamoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPrestamo);
		this.jInternalFrameDetalleFormPrestamo.setVisible(false);
		this.jInternalFrameDetalleFormPrestamo.setSelected(false);						
		
		this.jInternalFrameDetalleFormPrestamo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPrestamo.prestamoLogic=this.prestamoLogic;
		
		this.cargarCombosFrameForeignKeyPrestamo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePrestamo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePrestamo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPrestamo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPrestamo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPrestamo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPrestamo"));
		
		this.jInternalFrameDetalleFormPrestamo.jButtonModificarPrestamo.addActionListener(new ButtonActionListener(this,"ModificarPrestamo"));

		
		this.jInternalFrameDetalleFormPrestamo.jButtonModificarToolBarPrestamo.addActionListener(new ButtonActionListener(this,"ModificarToolBarPrestamo"));
					
		this.jInternalFrameDetalleFormPrestamo.jMenuItemModificarPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemModificarPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormPrestamo.jButtonActualizarPrestamo.addActionListener (new ButtonActionListener(this,"ActualizarPrestamo"));
		
		
		this.jInternalFrameDetalleFormPrestamo.jButtonActualizarToolBarPrestamo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPrestamo"));
						
		this.jInternalFrameDetalleFormPrestamo.jMenuItemActualizarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormPrestamo.jButtonEliminarPrestamo.addActionListener (new ButtonActionListener(this,"EliminarPrestamo"));
		
		
		this.jInternalFrameDetalleFormPrestamo.jButtonEliminarToolBarPrestamo.addActionListener (new ButtonActionListener(this,"EliminarToolBarPrestamo"));
								
		this.jInternalFrameDetalleFormPrestamo.jMenuItemEliminarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormPrestamo.jButtonCancelarPrestamo.addActionListener (new ButtonActionListener(this,"CancelarPrestamo"));
		
		
		this.jInternalFrameDetalleFormPrestamo.jButtonCancelarToolBarPrestamo.addActionListener (new ButtonActionListener(this,"CancelarToolBarPrestamo"));
					
		this.jInternalFrameDetalleFormPrestamo.jMenuItemCancelarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPrestamo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPrestamo.jMenuItemDetalleCerrarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosToolBarPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrestamo"));
		
		
		
		this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosToolBarPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrestamo"));
		
		
		
		this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPrestamo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonidPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empresaPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empresaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrestamoBusqueda"));
		//jButtonid_empleadoPrestamo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPrestamoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamo.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_prestamoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_prestamoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_cuotaPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuotaPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_cuotaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuotaPrestamoBusqueda"));
		//jButtonid_asiento_contablePrestamo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contablePrestamoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamo.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtoncodigoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonnumero_pre_impresoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonfechaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonmontoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"montoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonnumero_cuotasPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtontasaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"tasaPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtondescripcionPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPrestamoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPrestamo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePrestamo"));
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPrestamo"));
		}
		
		this.jTableDatosPrestamo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPrestamo"));
		
		this.jTableDatosPrestamo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPrestamo"));
		
		this.jButtonNuevoPrestamo.addActionListener(new ButtonActionListener(this,"NuevoPrestamo"));
		
		this.jButtonDuplicarPrestamo.addActionListener(new ButtonActionListener(this,"DuplicarPrestamo"));
		
		this.jButtonCopiarPrestamo.addActionListener(new ButtonActionListener(this,"CopiarPrestamo"));
		
		this.jButtonVerFormPrestamo.addActionListener(new ButtonActionListener(this,"VerFormPrestamo"));
		
		
		this.jButtonNuevoToolBarPrestamo.addActionListener(new ButtonActionListener(this,"NuevoToolBarPrestamo"));
			
		this.jButtonDuplicarToolBarPrestamo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPrestamo"));
			
		this.jMenuItemNuevoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPrestamo"));
			
		this.jMenuItemDuplicarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPrestamo"));		
		
		
		this.jButtonNuevoRelacionesPrestamo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPrestamo"));
		
		
		this.jButtonNuevoRelacionesToolBarPrestamo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPrestamo"));
			
		this.jMenuItemNuevoRelacionesPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPrestamo"));		
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonModificarPrestamo.addActionListener(new ButtonActionListener(this,"ModificarPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonModificarToolBarPrestamo.addActionListener(new ButtonActionListener(this,"ModificarToolBarPrestamo"));
			
			this.jInternalFrameDetalleFormPrestamo.jMenuItemModificarPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemModificarPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPrestamo.jButtonActualizarPrestamo.addActionListener (new ButtonActionListener(this,"ActualizarPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonActualizarToolBarPrestamo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPrestamo"));
				
			this.jInternalFrameDetalleFormPrestamo.jMenuItemActualizarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonEliminarPrestamo.addActionListener (new ButtonActionListener(this,"EliminarPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonEliminarToolBarPrestamo.addActionListener (new ButtonActionListener(this,"EliminarToolBarPrestamo"));
						
			this.jInternalFrameDetalleFormPrestamo.jMenuItemEliminarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonCancelarPrestamo.addActionListener (new ButtonActionListener(this,"CancelarPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonCancelarToolBarPrestamo.addActionListener (new ButtonActionListener(this,"CancelarToolBarPrestamo"));
			
			this.jInternalFrameDetalleFormPrestamo.jMenuItemCancelarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPrestamo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPrestamo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPrestamo"));		
		
		
		this.jButtonCerrarPrestamo.addActionListener (new ButtonActionListener(this,"CerrarPrestamo"));
		
		
		this.jButtonCerrarToolBarPrestamo.addActionListener (new ButtonActionListener(this,"CerrarToolBarPrestamo"));
			
		this.jMenuItemCerrarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPrestamo"));
			
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jMenuItemDetalleCerrarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosToolBarPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrestamo"));
		}
		
		this.jButtonCopiarToolBarPrestamo.addActionListener (new ButtonActionListener(this,"CopiarToolBarPrestamo"));
			
		this.jButtonVerFormToolBarPrestamo.addActionListener (new ButtonActionListener(this,"VerFormToolBarPrestamo"));
		
		this.jMenuItemGuardarCambiosPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPrestamo"));
			
		this.jMenuItemCopiarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPrestamo"));		
		
		this.jMenuItemVerFormPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPrestamo"));		
		
		
		this.jButtonGuardarCambiosTablaPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPrestamo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPrestamo"));
			
		this.jMenuItemGuardarCambiosTablaPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPrestamo"));		
		
		
		
		this.jButtonRecargarInformacionPrestamo.addActionListener (new ButtonActionListener(this,"RecargarInformacionPrestamo"));
					
		this.jButtonRecargarInformacionToolBarPrestamo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPrestamo"));
		
		this.jMenuItemRecargarInformacionPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPrestamo"));		
		
		
		
		this.jButtonAnterioresPrestamo.addActionListener (new ButtonActionListener(this,"AnterioresPrestamo"));
		
		
		this.jButtonAnterioresToolBarPrestamo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPrestamo"));
		
		this.jMenuItemAnterioresPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPrestamo"));		
		
		
		this.jButtonSiguientesPrestamo.addActionListener (new ButtonActionListener(this,"SiguientesPrestamo"));
		
		
		this.jButtonSiguientesToolBarPrestamo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPrestamo"));
			
		this.jMenuItemSiguientesPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPrestamo"));
			
		this.jMenuItemAbrirOrderByPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPrestamo"));
			
		this.jMenuItemMostrarOcultarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPrestamo"));
			
		this.jMenuItemDetalleAbrirOrderByPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPrestamo"));
			
		this.jMenuItemDetalleMostarOcultarPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPrestamo"));		
		
		
		this.jButtonNuevoGuardarCambiosPrestamo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPrestamo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPrestamo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPrestamo"));
			
		this.jMenuItemNuevoGuardarCambiosPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPrestamo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPrestamo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPrestamo"));

		this.jCheckBoxSeleccionadosPrestamo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPrestamo"));
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPrestamo"));
		}
		
		
		this.jComboBoxTiposRelacionesPrestamo.addActionListener (new ButtonActionListener(this,"TiposRelacionesPrestamo"));
			
		this.jComboBoxTiposAccionesPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesPrestamo"));
					
		this.jComboBoxTiposSeleccionarPrestamo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPrestamo"));
			
		this.jTextFieldValorCampoGeneralPrestamo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPrestamo"));		
		
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonidPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empresaPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empresaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrestamoBusqueda"));
		//jButtonid_empleadoPrestamo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPrestamoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamo.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_prestamoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_prestamoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_cuotaPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuotaPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_cuotaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuotaPrestamoBusqueda"));
		//jButtonid_asiento_contablePrestamo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contablePrestamoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamo.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtoncodigoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonnumero_pre_impresoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonfechaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonmontoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"montoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonnumero_cuotasPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtontasaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"tasaPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtondescripcionPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPrestamoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAsientoContablePrestamo.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContablePrestamo"));

			this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamo"));

			this.jButtonFK_IdEmpleadoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPrestamo"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamo"));

			this.jButtonFK_IdTipoCuotaPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuotaPrestamo"));

			this.jButtonFK_IdTipoPrestamoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrestamoPrestamo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoPrestamo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrestamo"));
				this.jInternalFrameReporteDinamicoPrestamo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrestamo"));
				this.jInternalFrameReporteDinamicoPrestamo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrestamo"));
			}
			
			//this.jButtonCerrarReporteDinamicoPrestamo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrestamo"));				
			//this.jButtonGenerarReporteDinamicoPrestamo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrestamo"));
			//this.jButtonGenerarExcelReporteDinamicoPrestamo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrestamo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPrestamo!=null) {
				this.jInternalFrameImportacionPrestamo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPrestamo"));
				this.jInternalFrameImportacionPrestamo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPrestamo"));
				this.jInternalFrameImportacionPrestamo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPrestamo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPrestamo.addActionListener (new ButtonActionListener(this,"AbrirOrderByPrestamo"));
			
			this.jButtonAbrirOrderByToolBarPrestamo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPrestamo"));			
			
			if(this.jInternalFrameOrderByPrestamo!=null) {
				this.jInternalFrameOrderByPrestamo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPrestamo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrestamo.jTabbedPaneRelacionesPrestamo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPrestamo"));
		
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
            		closingInternalFramePrestamo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPrestamo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPrestamo = (JInternalFrameBase)event.getSource();
	            	
	            PrestamoBeanSwingJInternalFrame jInternalFrameParent=(PrestamoBeanSwingJInternalFrame)jInternalFrameDetalleFormPrestamo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPrestamoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPrestamo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPrestamoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPrestamo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPrestamo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPrestamo";
		inputMap = this.jButtonNuevoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPrestamoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPrestamo";
		inputMap = this.jButtonNuevoRelacionesPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPrestamoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPrestamo";
		inputMap = this.jButtonModificarPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPrestamo";
		inputMap = this.jButtonActualizarPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPrestamo";
		inputMap = this.jButtonEliminarPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPrestamo";
		inputMap = this.jButtonCancelarPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPrestamo";
		inputMap = this.jButtonCerrarPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPrestamo";
		inputMap = this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPrestamo.jButtonGuardarCambiosPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPrestamo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPrestamoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonidPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empresaPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empresaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrestamoBusqueda"));
		//jButtonid_empleadoPrestamo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPrestamoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamo.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_prestamoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_prestamoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prestamoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_cuotaPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuotaPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_tipo_cuotaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuotaPrestamoBusqueda"));
		//jButtonid_asiento_contablePrestamo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contablePrestamoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamo.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtoncodigoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonnumero_pre_impresoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonfechaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonmontoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"montoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtonnumero_cuotasPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtontasaPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"tasaPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrestamo.jButtondescripcionPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPrestamoBusqueda"));
		
		
		this.jButtonFK_IdAsientoContablePrestamo.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContablePrestamo"));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePrestamo.addActionListener(new ButtonActionListener(this,"id_asiento_contablePrestamo"));

		this.jButtonFK_IdEmpleadoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPrestamo"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPrestamo.addActionListener(new ButtonActionListener(this,"id_empleadoPrestamo"));

		this.jButtonFK_IdTipoCuotaPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuotaPrestamo"));

		this.jButtonFK_IdTipoPrestamoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrestamoPrestamo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPrestamoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPrestamo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPrestamo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
					prestamoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Prestamo prestamoAux:prestamos) {
					prestamoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPrestamoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPrestamo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
						prestamoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Prestamo prestamoAux:prestamos) {
						prestamoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Prestamo prestamoAux:prestamos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPrestamo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPrestamo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPrestamo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPrestamoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPrestamo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPrestamo.getSelectedRows();
			
			Prestamo prestamoLocal=new Prestamo();
			
			//this.seleccionarTodosPrestamo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLocal =(Prestamo) this.prestamoLogic.getPrestamos().toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					prestamoLocal =(Prestamo) this.prestamos.toArray()[this.jTableDatosPrestamo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				prestamoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
						prestamoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Prestamo prestamoAux:prestamos) {
						prestamoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPrestamo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPrestamo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPrestamo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPrestamo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPrestamoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPrestamoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPrestamoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPrestamo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPrestamo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Prestamo prestamoAux:this.prestamoLogic.getPrestamos()) {
				
						if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							prestamoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							prestamoAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							prestamoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							prestamoAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS)) {
							existe=true;
							prestamoAux.setnumero_cuotas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_TASA)) {
							existe=true;
							prestamoAux.settasa(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							prestamoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Prestamo prestamoAux:prestamos) {
					
						if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							prestamoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							prestamoAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							prestamoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							prestamoAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS)) {
							existe=true;
							prestamoAux.setnumero_cuotas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_TASA)) {
							existe=true;
							prestamoAux.settasa(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							prestamoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPrestamo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPrestamoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPrestamo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPrestamo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPrestamo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePrestamo) {				
					conSplash=true;//false;										
					
					//this.startProcessPrestamo(conSplash);
				
					this.generarReportePrestamosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPrestamosSeleccionados();
				//this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPrestamosSeleccionados(false);
				//this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPrestamosSeleccionados(true);
				//this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPrestamo();
				
				this.exportarPrestamosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPrestamos();
				//this.importarPrestamos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPrestamo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPrestamosSeleccionados();
				//this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPrestamo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPrestamo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPrestamo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.setSelectedIndex(0);					
				}	
			} 			
			else if(PrestamoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePrestamo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPrestamo(conSplash);
					
						//this.actualizarParametrosGeneralPrestamo();
						
						this.generarReporteProcesoAccionPrestamosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PrestamoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PrestamoS SELECCIONADOS?", "MANTENIMIENTO DE Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPrestamo();
				
						this.actualizarParametrosGeneralPrestamo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.prestamoReturnGeneral=prestamoLogic.procesarAccionPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.prestamoLogic.getPrestamos(),this.prestamoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPrestamoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPrestamo();
					
					PrestamoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPrestamoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPrestamo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPrestamo.jComboBoxTiposAccionesFormularioPrestamo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPrestamo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPrestamoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPrestamo();
			
			if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		
			Prestamo prestamo=new Prestamo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPrestamo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPrestamo.getSelectedItem();
			
			
			
			
			prestamosSeleccionados=this.getPrestamosSeleccionados(true);
			//this.sTipoAccion;
			
			if(prestamosSeleccionados.size()==1) {
				for(Prestamo prestamoAux:prestamosSeleccionados) {
					prestamo=prestamoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Abono Prestamo")) {
					jButtonAbonoPrestamoActionPerformed(null,rowIndex,true,false,prestamo);
				}
				else if(this.sTipoRelacion.equals("Cuota")) {
					jButtonCuotaActionPerformed(null,rowIndex,true,false,prestamo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPrestamo();
			
      		//this.finishProcessPrestamo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPrestamoReturnGeneral() throws Exception {
		if(this.prestamoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.prestamoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.prestamoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.prestamoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.prestamoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.prestamoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPrestamo(false);
		}
		
		if(this.prestamoReturnGeneral.getConRetornoLista() || this.prestamoReturnGeneral.getConRetornoObjeto()) {
			if(this.prestamoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.prestamoLogic.setPrestamos(this.prestamoReturnGeneral.getPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.prestamoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.prestamoLogic.setPrestamo(this.prestamoReturnGeneral.getPrestamo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPrestamo(false);
		}
	}
	
	public void actualizarParametrosGeneralPrestamo() throws Exception {
		
		
	}
	
	public ArrayList<Prestamo> getPrestamosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPrestamo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Prestamo prestamoAux:prestamoLogic.getPrestamos()) {
					if(prestamoAux.getIsSelected()) {
						prestamosSeleccionados.add(prestamoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Prestamo prestamoAux:this.prestamos) {
					if(prestamoAux.getIsSelected()) {
						prestamosSeleccionados.add(prestamoAux);				
					}
				}
			}
			
			if(prestamosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						prestamosSeleccionados.addAll(this.prestamoLogic.getPrestamos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						prestamosSeleccionados.addAll(this.prestamos);				
					}
				}
			}
		} else {
			prestamosSeleccionados.add(this.prestamo);
		}
		
		return prestamosSeleccionados;
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
	
	public void generarReportePrestamosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPrestamosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPrestamosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPrestamosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPrestamosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPrestamosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Prestamo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPrestamosSeleccionados() throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePrestamos("Todos",prestamosSeleccionados);
		
	}	
	
	public void generarReporteNormalPrestamosSeleccionados() throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePrestamos("Todos",prestamosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPrestamosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePrestamos("Todos",prestamosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPrestamosSeleccionados() throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPrestamo();
		
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPrestamo();
		
		
		//this.generarReportePrestamos("Todos",prestamosSeleccionados ,prestamoImplementable,prestamoImplementableHome);
	}
	
	public void mostrarImportacionPrestamos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPrestamo();
		
		this.abrirFrameImportacionPrestamo();		
		
			
		//this.generarReportePrestamos("Todos",prestamosSeleccionados ,prestamoImplementable,prestamoImplementableHome);
	}
	
	public void importarPrestamos() throws Exception {		
	
	}
	
	public void exportarPrestamosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPrestamosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPrestamosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPrestamosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Prestamo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPrestamosSeleccionados() throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prestamo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPrestamo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Prestamo prestamoAux:prestamosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPrestamo(prestamoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//prestamoAux.setsDetalleGeneralEntityReporte(prestamoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPrestamo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_TASA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrestamoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPrestamo(Prestamo prestamo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=prestamo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.gettipoprestamo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.gettipocuota_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getnumero_cuotas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.gettasa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prestamo.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPrestamosSeleccionados() throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prestamo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Prestamos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPrestamo(row);				
				iRow++;
			}				
			
			for(Prestamo prestamoAux:prestamosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPrestamo(prestamoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPrestamosSeleccionados() throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();		
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prestamo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("prestamos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("prestamo");
			//elementRoot.appendChild(element);
		
			for(Prestamo prestamoAux:prestamosSeleccionados) {
				element = document.createElement("prestamo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPrestamo(prestamoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPrestamo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_TASA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrestamoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPrestamo(Prestamo prestamo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.gettipoprestamo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.gettipocuota_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getnumero_cuotas());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.gettasa());
		cell = row.createCell(iColumn++);cell.setCellValue(prestamo.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPrestamo(Prestamo prestamo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PrestamoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(prestamo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PrestamoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(prestamo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PrestamoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(prestamo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(PrestamoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(prestamo.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementtipoprestamo_descripcion = document.createElement(PrestamoConstantesFunciones.IDTIPOPRESTAMO);
		elementtipoprestamo_descripcion.appendChild(document.createTextNode(prestamo.gettipoprestamo_descripcion()));
		element.appendChild(elementtipoprestamo_descripcion);

		Element elementtipocuota_descripcion = document.createElement(PrestamoConstantesFunciones.IDTIPOCUOTA);
		elementtipocuota_descripcion.appendChild(document.createTextNode(prestamo.gettipocuota_descripcion()));
		element.appendChild(elementtipocuota_descripcion);

		Element elementasientocontable_descripcion = document.createElement(PrestamoConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(prestamo.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementcodigo = document.createElement(PrestamoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(prestamo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnumero_pre_impreso = document.createElement(PrestamoConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(prestamo.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementfecha = document.createElement(PrestamoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(prestamo.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementmonto = document.createElement(PrestamoConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(prestamo.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementnumero_cuotas = document.createElement(PrestamoConstantesFunciones.NUMEROCUOTAS);
		elementnumero_cuotas.appendChild(document.createTextNode(prestamo.getnumero_cuotas().toString().trim()));
		element.appendChild(elementnumero_cuotas);

		Element elementtasa = document.createElement(PrestamoConstantesFunciones.TASA);
		elementtasa.appendChild(document.createTextNode(prestamo.gettasa().toString().trim()));
		element.appendChild(elementtasa);

		Element elementdescripcion = document.createElement(PrestamoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(prestamo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPrestamosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Prestamo> prestamosSeleccionados=new ArrayList<Prestamo>();
		
		prestamosSeleccionados=this.getPrestamosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPrestamo(prestamosSeleccionados);
		
		this.generarReportePrestamos("Todos",prestamosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPrestamo(ArrayList<Prestamo> prestamosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Prestamo prestamoAux:prestamosSeleccionados) {
				prestamoAux.setsDetalleGeneralEntityReporte(prestamoAux.toString());
			
				if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_IDTIPOPRESTAMO)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.gettipoprestamo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_IDTIPOCUOTA)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.gettipocuota_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(prestamoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_NUMEROCUOTAS)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.getnumero_cuotas().toString());
				}
				 else if(sTipoSeleccionar.equals(PrestamoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					prestamoAux.setsDescripcionGeneralEntityReporte1(prestamoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPrestamo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPrestamo=true;
				this.isVisibilidadCeldaNuevoRelacionesPrestamo=true;
				this.isVisibilidadCeldaGuardarCambiosPrestamo=true;
			}
			
			this.isVisibilidadCeldaModificarPrestamo=false;
			this.isVisibilidadCeldaActualizarPrestamo=false;
			this.isVisibilidadCeldaEliminarPrestamo=false;
			this.isVisibilidadCeldaCancelarPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=false;
			this.isVisibilidadCeldaModificarPrestamo=false;
			this.isVisibilidadCeldaActualizarPrestamo=true;
			this.isVisibilidadCeldaEliminarPrestamo=false;
			this.isVisibilidadCeldaCancelarPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=false;
			this.isVisibilidadCeldaModificarPrestamo=false;
			this.isVisibilidadCeldaActualizarPrestamo=true;
			this.isVisibilidadCeldaEliminarPrestamo=true;
			this.isVisibilidadCeldaCancelarPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=false;
			this.isVisibilidadCeldaModificarPrestamo=false;
			this.isVisibilidadCeldaActualizarPrestamo=true;
			this.isVisibilidadCeldaEliminarPrestamo=false;
			this.isVisibilidadCeldaCancelarPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=true;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=true;
			this.isVisibilidadCeldaModificarPrestamo=false;
			this.isVisibilidadCeldaActualizarPrestamo=false;
			this.isVisibilidadCeldaEliminarPrestamo=false;
			this.isVisibilidadCeldaCancelarPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=false;
			this.isVisibilidadCeldaActualizarPrestamo=false;
			this.isVisibilidadCeldaEliminarPrestamo=false;
			this.isVisibilidadCeldaCancelarPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=false;
			this.isVisibilidadCeldaModificarPrestamo=true;
			this.isVisibilidadCeldaActualizarPrestamo=false;
			this.isVisibilidadCeldaEliminarPrestamo=false;
			this.isVisibilidadCeldaCancelarPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarPrestamo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PrestamoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=true;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=true;
		} else {
			this.actualizarEstadoPanelsPrestamo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPrestamo=false;
			//this.isVisibilidadCeldaVerFormPrestamo=false;
			this.isVisibilidadCeldaDuplicarPrestamo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!prestamoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;
		} else {
			this.isVisibilidadCeldaNuevoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosPrestamo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(prestamoSessionBean.getEsGuardarRelacionado()) {
			if(!prestamoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;												
			}
			
			this.jButtonCerrarPrestamo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPrestamo=false;
		}
		
		if(!this.permiteMantenimiento(this.prestamo)) {
			this.isVisibilidadCeldaActualizarPrestamo=false;
			this.isVisibilidadCeldaEliminarPrestamo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPrestamo() {
		this.isVisibilidadCeldaNuevoPrestamo=false;
		this.isVisibilidadCeldaGuardarCambiosPrestamo=false;
	}
	
	public void actualizarEstadoPanelsPrestamo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPrestamo!=null) {
				this.jScrollPanelDatosEdicionPrestamo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrestamo!=null) {
				this.jTabbedPaneBusquedasPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrestamo!=null) {
				this.jScrollPanelDatosPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrestamo!=null) {
				this.jPanelPaginacionPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPrestamo!=null) {
				this.jScrollPanelDatosEdicionPrestamo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrestamo!=null) {
				this.jTabbedPaneBusquedasPrestamo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPrestamo!=null) {
				this.jScrollPanelDatosPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrestamo!=null) {
				this.jPanelPaginacionPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPrestamo!=null) {
				this.jScrollPanelDatosEdicionPrestamo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrestamo!=null) {
				this.jTabbedPaneBusquedasPrestamo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPrestamo!=null) {
				this.jScrollPanelDatosPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrestamo!=null) {
				this.jPanelPaginacionPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPrestamo!=null) {
				this.jScrollPanelDatosEdicionPrestamo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrestamo!=null) {
				this.jTabbedPaneBusquedasPrestamo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPrestamo!=null) {
				this.jScrollPanelDatosPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrestamo!=null) {
				this.jPanelPaginacionPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPrestamo!=null) {
				this.jScrollPanelDatosEdicionPrestamo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrestamo!=null) {
				this.jTabbedPaneBusquedasPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrestamo!=null) {
				this.jScrollPanelDatosPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrestamo!=null) {
				this.jPanelPaginacionPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPrestamo!=null) {
				this.jScrollPanelDatosEdicionPrestamo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrestamo!=null) {
				this.jTabbedPaneBusquedasPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrestamo!=null) {
				this.jScrollPanelDatosPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrestamo!=null) {
				this.jPanelPaginacionPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPrestamo!=null) {
				this.jScrollPanelDatosEdicionPrestamo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrestamo!=null) {
				this.jTabbedPaneBusquedasPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrestamo!=null) {
				this.jScrollPanelDatosPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrestamo!=null) {
				this.jPanelPaginacionPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.prestamoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPrestamo!=null) {
					this.jTabbedPaneBusquedasPrestamo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.prestamoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrestamo!=null) {
				this.jTabbedPaneBusquedasPrestamo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPrestamo!=null) {
				this.jPanelParametrosReportesPrestamo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdAsientoContablePrestamo);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdEmpleadoPrestamo);}

			this.isVisibilidadFK_IdTipoCuota=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCuota) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoCuotaPrestamo);}

			this.isVisibilidadFK_IdTipoPrestamo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPrestamo) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoPrestamoPrestamo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdAsientoContablePrestamo);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdEmpleadoPrestamo);}

			this.isVisibilidadFK_IdTipoCuota=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoCuota) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoCuotaPrestamo);}

			this.isVisibilidadFK_IdTipoPrestamo=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoPrestamo) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoPrestamoPrestamo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPrestamo(Boolean isParaTipoPrestamo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPrestamoNegation=!isParaTipoPrestamo;

			this.isVisibilidadFK_IdAsientoContable=isParaTipoPrestamoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdAsientoContablePrestamo);}

			this.isVisibilidadFK_IdEmpleado=isParaTipoPrestamoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdEmpleadoPrestamo);}

			this.isVisibilidadFK_IdTipoCuota=isParaTipoPrestamoNegation;
			if(!this.isVisibilidadFK_IdTipoCuota) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoCuotaPrestamo);}

			this.isVisibilidadFK_IdTipoPrestamo=isParaTipoPrestamo;
			if(!this.isVisibilidadFK_IdTipoPrestamo) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoPrestamoPrestamo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCuota(Boolean isParaTipoCuota){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCuotaNegation=!isParaTipoCuota;

			this.isVisibilidadFK_IdAsientoContable=isParaTipoCuotaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdAsientoContablePrestamo);}

			this.isVisibilidadFK_IdEmpleado=isParaTipoCuotaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdEmpleadoPrestamo);}

			this.isVisibilidadFK_IdTipoCuota=isParaTipoCuota;
			if(!this.isVisibilidadFK_IdTipoCuota) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoCuotaPrestamo);}

			this.isVisibilidadFK_IdTipoPrestamo=isParaTipoCuotaNegation;
			if(!this.isVisibilidadFK_IdTipoPrestamo) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoPrestamoPrestamo);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadFK_IdAsientoContable=isParaAsientoContable;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdAsientoContablePrestamo);}

			this.isVisibilidadFK_IdEmpleado=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdEmpleadoPrestamo);}

			this.isVisibilidadFK_IdTipoCuota=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoCuota) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoCuotaPrestamo);}

			this.isVisibilidadFK_IdTipoPrestamo=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoPrestamo) {this.jTabbedPaneBusquedasPrestamo.remove(jPanelFK_IdTipoPrestamoPrestamo);}
		}
		
	}
	
	

	public String registrarSesionPrestamoParaAbonoPrestamos() throws Exception {
		Boolean isPaginaPopupAbonoPrestamo=false;

		try {

			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
			}

			if(this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean==null) {
				this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
			}

			this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean.setsPathNavegacionActual(prestamoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAbonoPrestamo=this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAbonoPrestamo(true);
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAbonoPrestamo(PrestamoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean.setisBusquedaDesdeForeignKeySesionPrestamo(true);
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean.setlidPrestamoActual(this.idPrestamoActual);
			this.jInternalFrameDetalleFormPrestamo.abonoprestamoSessionBean.setNoMantenimiento(true);

			prestamoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPrestamo(true);
			prestamoSessionBean.setlIdPrestamoActualForeignKey(this.idPrestamoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPrestamoParaCuotas() throws Exception {
		Boolean isPaginaPopupCuota=false;

		try {

			if(this.prestamoSessionBean==null) {
				this.prestamoSessionBean=new PrestamoSessionBean();
			}

			if(this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean==null) {
				this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean=new CuotaSessionBean();
			}

			this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean.setsPathNavegacionActual(prestamoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuotaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuota=this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuota(true);
			this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuota(PrestamoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean.setisBusquedaDesdeForeignKeySesionPrestamo(true);
			this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean.setlidPrestamoActual(this.idPrestamoActual);
			this.jInternalFrameDetalleFormPrestamo.cuotaSessionBean.setNoMantenimiento(true);

			prestamoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPrestamo(true);
			prestamoSessionBean.setlIdPrestamoActualForeignKey(this.idPrestamoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionPrestamoParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(prestamoSessionBean==null) {
				prestamoSessionBean=new PrestamoSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(prestamoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.prestamoFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(PrestamoConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionPrestamo(true);
			//empleadoSessionBean.setlidPrestamoActual(this.idPrestamoActual);

			prestamoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPrestamo(true);
			prestamoSessionBean.setlIdPrestamoActualForeignKey(this.idPrestamoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionPrestamoParaBusquedaAsientoContables() throws Exception {
		Boolean isPaginaPopupAsientoContable=false;

		try {

			if(prestamoSessionBean==null) {
				prestamoSessionBean=new PrestamoSessionBean();
			}

			if(asientocontableSessionBean==null) {
				asientocontableSessionBean=new AsientoContableSessionBean();
			}

			asientocontableSessionBean.setsPathNavegacionActual(prestamoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			asientocontableSessionBean.setisPermiteRecargarInformacion(false);
			asientocontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupAsientoContable=asientocontableSessionBean.getisPaginaPopup();
			asientocontableSessionBean.setisPaginaPopup(false);
			asientocontableSessionBean.setEstaModoBusqueda(true);
			asientocontableSessionBean.setsFuncionBusquedaRapida("window.opener.prestamoFuncionGeneral.setCombosCodigoDesdeBusquedaid_asiento_contable(TO_REPLACE);");
			asientocontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(true);
			asientocontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(PrestamoConstantesFunciones.SNOMBREOPCION);
			//asientocontableSessionBean.setisBusquedaDesdeForeignKeySesionPrestamo(true);
			//asientocontableSessionBean.setlidPrestamoActual(this.idPrestamoActual);

			prestamoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPrestamo(true);
			prestamoSessionBean.setlIdPrestamoActualForeignKey(this.idPrestamoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PrestamoSessionBean prestamoSessionBean=new PrestamoSessionBean();
		
		if(this.prestamoSessionBean==null) {
			this.prestamoSessionBean=new PrestamoSessionBean();
		}
		
		this.prestamoSessionBean.setsUltimaBusquedaPrestamo(this.getsAccionBusqueda());
		this.prestamoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.prestamoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
			prestamoSessionBean.setid_asiento_contable(this.getid_asiento_contableFK_IdAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			prestamoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			prestamoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCuota")) {
			prestamoSessionBean.setid_tipo_cuota(this.getid_tipo_cuotaFK_IdTipoCuota());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPrestamo")) {
			prestamoSessionBean.setid_tipo_prestamo(this.getid_tipo_prestamoFK_IdTipoPrestamo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PrestamoSessionBean prestamoSessionBean=new PrestamoSessionBean();
		
		if(this.prestamoSessionBean==null) {
			this.prestamoSessionBean=new PrestamoSessionBean();
		}
		
		if(this.prestamoSessionBean.getsUltimaBusquedaPrestamo()!=null&&!this.prestamoSessionBean.getsUltimaBusquedaPrestamo().equals("")) {
			this.setsAccionBusqueda(prestamoSessionBean.getsUltimaBusquedaPrestamo());
			this.setiNumeroPaginacion(prestamoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(prestamoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
				this.setid_asiento_contableFK_IdAsientoContable(prestamoSessionBean.getid_asiento_contable());
				prestamoSessionBean.setid_asiento_contable(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(prestamoSessionBean.getid_empleado());
				prestamoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(prestamoSessionBean.getid_empresa());
				prestamoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCuota")) {
				this.setid_tipo_cuotaFK_IdTipoCuota(prestamoSessionBean.getid_tipo_cuota());
				prestamoSessionBean.setid_tipo_cuota(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPrestamo")) {
				this.setid_tipo_prestamoFK_IdTipoPrestamo(prestamoSessionBean.getid_tipo_prestamo());
				prestamoSessionBean.setid_tipo_prestamo(-1L);
			}
		}
		
		this.prestamoSessionBean.setsUltimaBusquedaPrestamo("");
		this.prestamoSessionBean.setiNumeroPaginacion(PrestamoConstantesFunciones.INUMEROPAGINACION);
		this.prestamoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPrestamo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPrestamo() {
		this.updateBorderResaltarBusquedasFormularioPrestamo();
		this.updateVisibilidadBusquedasFormularioPrestamo();
		this.updateHabilitarBusquedasFormularioPrestamo();
	}
	
	public void updateBorderResaltarBusquedasFormularioPrestamo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPrestamo.getComponents().length>0) {
	

		if(this.prestamoConstantesFunciones.resaltarFK_IdAsientoContablePrestamo!=null) {
			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdAsientoContablePrestamo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
				jPanel.setBorder(this.prestamoConstantesFunciones.resaltarFK_IdAsientoContablePrestamo);
			}
		}

		if(this.prestamoConstantesFunciones.resaltarFK_IdEmpleadoPrestamo!=null) {
			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdEmpleadoPrestamo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
				jPanel.setBorder(this.prestamoConstantesFunciones.resaltarFK_IdEmpleadoPrestamo);
			}
		}

		if(this.prestamoConstantesFunciones.resaltarFK_IdTipoCuotaPrestamo!=null) {
			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdTipoCuotaPrestamo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
				jPanel.setBorder(this.prestamoConstantesFunciones.resaltarFK_IdTipoCuotaPrestamo);
			}
		}

		if(this.prestamoConstantesFunciones.resaltarFK_IdTipoPrestamoPrestamo!=null) {
			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdTipoPrestamoPrestamo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
				jPanel.setBorder(this.prestamoConstantesFunciones.resaltarFK_IdTipoPrestamoPrestamo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPrestamo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPrestamo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdAsientoContablePrestamo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.prestamoConstantesFunciones.mostrarFK_IdAsientoContablePrestamo);
			if(!this.prestamoConstantesFunciones.mostrarFK_IdAsientoContablePrestamo && index>-1) {
				this.jTabbedPaneBusquedasPrestamo.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdEmpleadoPrestamo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.prestamoConstantesFunciones.mostrarFK_IdEmpleadoPrestamo);
			if(!this.prestamoConstantesFunciones.mostrarFK_IdEmpleadoPrestamo && index>-1) {
				this.jTabbedPaneBusquedasPrestamo.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdTipoCuotaPrestamo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.prestamoConstantesFunciones.mostrarFK_IdTipoCuotaPrestamo);
			if(!this.prestamoConstantesFunciones.mostrarFK_IdTipoCuotaPrestamo && index>-1) {
				this.jTabbedPaneBusquedasPrestamo.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdTipoPrestamoPrestamo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.prestamoConstantesFunciones.mostrarFK_IdTipoPrestamoPrestamo);
			if(!this.prestamoConstantesFunciones.mostrarFK_IdTipoPrestamoPrestamo && index>-1) {
				this.jTabbedPaneBusquedasPrestamo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPrestamo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPrestamo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdAsientoContablePrestamo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.prestamoConstantesFunciones.activarFK_IdAsientoContablePrestamo);
				this.jTabbedPaneBusquedasPrestamo.setEnabledAt(index,this.prestamoConstantesFunciones.activarFK_IdAsientoContablePrestamo);
			}

			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdEmpleadoPrestamo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.prestamoConstantesFunciones.activarFK_IdEmpleadoPrestamo);
				this.jTabbedPaneBusquedasPrestamo.setEnabledAt(index,this.prestamoConstantesFunciones.activarFK_IdEmpleadoPrestamo);
			}

			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdTipoCuotaPrestamo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.prestamoConstantesFunciones.activarFK_IdTipoCuotaPrestamo);
				this.jTabbedPaneBusquedasPrestamo.setEnabledAt(index,this.prestamoConstantesFunciones.activarFK_IdTipoCuotaPrestamo);
			}

			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdTipoPrestamoPrestamo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.prestamoConstantesFunciones.activarFK_IdTipoPrestamoPrestamo);
				this.jTabbedPaneBusquedasPrestamo.setEnabledAt(index,this.prestamoConstantesFunciones.activarFK_IdTipoPrestamoPrestamo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPrestamo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAsientoContable")) {
			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdAsientoContablePrestamo);

			this.jTabbedPaneBusquedasPrestamo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);

			this.prestamoConstantesFunciones.setResaltarFK_IdAsientoContablePrestamo(resaltar);

			jPanel.setBorder(this.prestamoConstantesFunciones.resaltarFK_IdAsientoContablePrestamo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdEmpleadoPrestamo);

			this.jTabbedPaneBusquedasPrestamo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);

			this.prestamoConstantesFunciones.setResaltarFK_IdEmpleadoPrestamo(resaltar);

			jPanel.setBorder(this.prestamoConstantesFunciones.resaltarFK_IdEmpleadoPrestamo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCuota")) {
			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdTipoCuotaPrestamo);

			this.jTabbedPaneBusquedasPrestamo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);

			this.prestamoConstantesFunciones.setResaltarFK_IdTipoCuotaPrestamo(resaltar);

			jPanel.setBorder(this.prestamoConstantesFunciones.resaltarFK_IdTipoCuotaPrestamo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPrestamo")) {
			index= this.jTabbedPaneBusquedasPrestamo.indexOfComponent(this.jPanelFK_IdTipoPrestamoPrestamo);

			this.jTabbedPaneBusquedasPrestamo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrestamo.getComponent(index);

			this.prestamoConstantesFunciones.setResaltarFK_IdTipoPrestamoPrestamo(resaltar);

			jPanel.setBorder(this.prestamoConstantesFunciones.resaltarFK_IdTipoPrestamoPrestamo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPrestamo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPrestamo() throws Exception {

		if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPrestamo();
		this.updateVisibilidadResaltarControlesFormularioPrestamo();
		this.updateHabilitarResaltarControlesFormularioPrestamo();
		
	}
	
	public void updateBorderResaltarControlesFormularioPrestamo() throws Exception {
		if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.prestamoConstantesFunciones.resaltaridPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.setBorder(this.prestamoConstantesFunciones.resaltaridPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarid_empresaPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarid_empresaPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarid_empleadoPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarid_empleadoPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarid_tipo_prestamoPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarid_tipo_prestamoPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarid_tipo_cuotaPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarid_tipo_cuotaPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarid_asiento_contablePrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setBorder(this.prestamoConstantesFunciones.resaltarid_asiento_contablePrestamo);}
		if(this.prestamoConstantesFunciones.resaltarcodigoPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jTextFieldcodigoPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarcodigoPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarnumero_pre_impresoPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_pre_impresoPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarnumero_pre_impresoPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarfechaPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jDateChooserfechaPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarfechaPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarmontoPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jTextFieldmontoPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarmontoPrestamo);}
		if(this.prestamoConstantesFunciones.resaltarnumero_cuotasPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_cuotasPrestamo.setBorder(this.prestamoConstantesFunciones.resaltarnumero_cuotasPrestamo);}
		if(this.prestamoConstantesFunciones.resaltartasaPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jTextFieldtasaPrestamo.setBorder(this.prestamoConstantesFunciones.resaltartasaPrestamo);}
		if(this.prestamoConstantesFunciones.resaltardescripcionPrestamo!=null && this.jInternalFrameDetalleFormPrestamo!=null) {this.jInternalFrameDetalleFormPrestamo.jTextAreadescripcionPrestamo.setBorder(this.prestamoConstantesFunciones.resaltardescripcionPrestamo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPrestamo() throws Exception {		
		if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
	
		//this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.setVisible(this.prestamoConstantesFunciones.mostraridPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelidPrestamo.setVisible(this.prestamoConstantesFunciones.mostraridPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_empresaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelid_empresaPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_empresaPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_empleadoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelid_empleadoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_empleadoPrestamo);
			this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_empleadoPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_tipo_prestamoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelid_tipo_prestamoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_tipo_prestamoPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_tipo_cuotaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelid_tipo_cuotaPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_tipo_cuotaPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_asiento_contablePrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelid_asiento_contablePrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_asiento_contablePrestamo);
			this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamo.setVisible(this.prestamoConstantesFunciones.mostrarid_asiento_contablePrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jTextFieldcodigoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarcodigoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelcodigoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarcodigoPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_pre_impresoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarnumero_pre_impresoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelnumero_pre_impresoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarnumero_pre_impresoPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jDateChooserfechaPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarfechaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelfechaPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarfechaPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jTextFieldmontoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarmontoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelmontoPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarmontoPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_cuotasPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarnumero_cuotasPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPanelnumero_cuotasPrestamo.setVisible(this.prestamoConstantesFunciones.mostrarnumero_cuotasPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jTextFieldtasaPrestamo.setVisible(this.prestamoConstantesFunciones.mostrartasaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPaneltasaPrestamo.setVisible(this.prestamoConstantesFunciones.mostrartasaPrestamo);
		//this.jInternalFrameDetalleFormPrestamo.jTextAreadescripcionPrestamo.setVisible(this.prestamoConstantesFunciones.mostrardescripcionPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jPaneldescripcionPrestamo.setVisible(this.prestamoConstantesFunciones.mostrardescripcionPrestamo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPrestamo() throws Exception {
		if(this.jInternalFrameDetalleFormPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPrestamo!=null) {
	
		this.jInternalFrameDetalleFormPrestamo.jLabelidPrestamo.setEnabled(this.prestamoConstantesFunciones.activaridPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empresaPrestamo.setEnabled(this.prestamoConstantesFunciones.activarid_empresaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_empleadoPrestamo.setEnabled(this.prestamoConstantesFunciones.activarid_empleadoPrestamo);
			this.jInternalFrameDetalleFormPrestamo.jButtonid_empleadoPrestamo.setEnabled(this.prestamoConstantesFunciones.activarid_empleadoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_prestamoPrestamo.setEnabled(this.prestamoConstantesFunciones.activarid_tipo_prestamoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_tipo_cuotaPrestamo.setEnabled(this.prestamoConstantesFunciones.activarid_tipo_cuotaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jComboBoxid_asiento_contablePrestamo.setEnabled(this.prestamoConstantesFunciones.activarid_asiento_contablePrestamo);
			this.jInternalFrameDetalleFormPrestamo.jButtonid_asiento_contablePrestamo.setEnabled(this.prestamoConstantesFunciones.activarid_asiento_contablePrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldcodigoPrestamo.setEnabled(this.prestamoConstantesFunciones.activarcodigoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_pre_impresoPrestamo.setEnabled(this.prestamoConstantesFunciones.activarnumero_pre_impresoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jDateChooserfechaPrestamo.setEnabled(this.prestamoConstantesFunciones.activarfechaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldmontoPrestamo.setEnabled(this.prestamoConstantesFunciones.activarmontoPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldnumero_cuotasPrestamo.setEnabled(this.prestamoConstantesFunciones.activarnumero_cuotasPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextFieldtasaPrestamo.setEnabled(this.prestamoConstantesFunciones.activartasaPrestamo);
		this.jInternalFrameDetalleFormPrestamo.jTextAreadescripcionPrestamo.setEnabled(this.prestamoConstantesFunciones.activardescripcionPrestamo);
		}
	}
	
		
}