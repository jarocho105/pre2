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

import com.bydan.erp.nomina.util.CuotaConstantesFunciones;
import com.bydan.erp.nomina.util.CuotaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CuotaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CuotaBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class CuotaBeanSwingJInternalFrame extends CuotaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CuotaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Cuota> cuotaValidator = new ClassValidator<Cuota>(Cuota.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Cuota cuota;	
	public Cuota cuotaAux;
	public Cuota cuotaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Cuota cuotaTotales;
	public Long idCuotaActual;
	public Long iIdNuevoCuota=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPrestamo="";

	public List<Prestamo> prestamosForeignKey;

	public List<Prestamo> getprestamosForeignKey() {
		return prestamosForeignKey;
	}

	public void setprestamosForeignKey(List<Prestamo> prestamosForeignKey) {
		this.prestamosForeignKey = prestamosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Prestamo prestamoForeignKey;

	public Prestamo getprestamoForeignKey() {
		return prestamoForeignKey;
	}

	public void setprestamoForeignKey(Prestamo prestamoForeignKey) {
		this.prestamoForeignKey = prestamoForeignKey;
	}

	public String sFinalQueryComboEstadoCuota="";

	public List<EstadoCuota> estadocuotasForeignKey;

	public List<EstadoCuota> getestadocuotasForeignKey() {
		return estadocuotasForeignKey;
	}

	public void setestadocuotasForeignKey(List<EstadoCuota> estadocuotasForeignKey) {
		this.estadocuotasForeignKey = estadocuotasForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoCuota estadocuotaForeignKey;

	public EstadoCuota getestadocuotaForeignKey() {
		return estadocuotaForeignKey;
	}

	public void setestadocuotaForeignKey(EstadoCuota estadocuotaForeignKey) {
		this.estadocuotaForeignKey = estadocuotaForeignKey;
	}

	public String sFinalQueryComboDefiProvisionEmpleado="";

	public List<DefiProvisionEmpleado> defiprovisionempleadosForeignKey;

	public List<DefiProvisionEmpleado> getdefiprovisionempleadosForeignKey() {
		return defiprovisionempleadosForeignKey;
	}

	public void setdefiprovisionempleadosForeignKey(List<DefiProvisionEmpleado> defiprovisionempleadosForeignKey) {
		this.defiprovisionempleadosForeignKey = defiprovisionempleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DefiProvisionEmpleado defiprovisionempleadoForeignKey;

	public DefiProvisionEmpleado getdefiprovisionempleadoForeignKey() {
		return defiprovisionempleadoForeignKey;
	}

	public void setdefiprovisionempleadoForeignKey(DefiProvisionEmpleado defiprovisionempleadoForeignKey) {
		this.defiprovisionempleadoForeignKey = defiprovisionempleadoForeignKey;
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
	
	public Boolean isPermisoTodoCuota;
	public Boolean isPermisoNuevoCuota;
	public Boolean isPermisoActualizarCuota;
	public Boolean isPermisoActualizarOriginalCuota;
	public Boolean isPermisoEliminarCuota;
	public Boolean isPermisoGuardarCambiosCuota;
	public Boolean isPermisoConsultaCuota;
	public Boolean isPermisoBusquedaCuota;
	public Boolean isPermisoReporteCuota;
	public Boolean isPermisoPaginacionMedioCuota;
	public Boolean isPermisoPaginacionAltoCuota;
	public Boolean isPermisoPaginacionTodoCuota;
	public Boolean isPermisoCopiarCuota;
	public Boolean isPermisoVerFormCuota;
	public Boolean isPermisoDuplicarCuota;
	public Boolean isPermisoOrdenCuota;
	
	
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
	
	public CuotaParameterReturnGeneral cuotaReturnGeneral;
	public CuotaParameterReturnGeneral cuotaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCuota=false;
	public Boolean esParaAccionDesdeFormularioCuota=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CuotaSessionBeanAdditional cuotaSessionBeanAdditional=null;
	
	public CuotaSessionBeanAdditional getCuotaSessionBeanAdditional() {
		return this.cuotaSessionBeanAdditional;
	}
	
	public void setCuotaSessionBeanAdditional(CuotaSessionBeanAdditional cuotaSessionBeanAdditional) {
		try {
			this.cuotaSessionBeanAdditional=cuotaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CuotaBeanSwingJInternalFrameAdditional cuotaBeanSwingJInternalFrameAdditional=null;
	//public class CuotaBeanSwingJInternalFrame
	
	public CuotaBeanSwingJInternalFrameAdditional getCuotaBeanSwingJInternalFrameAdditional() {
		return this.cuotaBeanSwingJInternalFrameAdditional;
	}
	
	public void setCuotaBeanSwingJInternalFrameAdditional(CuotaBeanSwingJInternalFrameAdditional cuotaBeanSwingJInternalFrameAdditional) {
		try {
			this.cuotaBeanSwingJInternalFrameAdditional=cuotaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CuotaLogic cuotaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Cuota cuotaBean;
	public CuotaConstantesFunciones cuotaConstantesFunciones;
	//public CuotaParameterReturnGeneral cuotaReturnGeneral;
	
	//FK
	
	public PrestamoLogic prestamoLogic;
	public EstadoCuotaLogic estadocuotaLogic;
	public DefiProvisionEmpleadoLogic defiprovisionempleadoLogic;
	
	//PARAMETROS
	
	
	//public List<Cuota> cuotas;	
	//public List<Cuota> cuotasEliminados;
	//public List<Cuota> cuotasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCuota=false;
	public Boolean isVisibilidadCeldaDuplicarCuota=true;
	public Boolean isVisibilidadCeldaCopiarCuota=true;
	public Boolean isVisibilidadCeldaVerFormCuota=true;
	public Boolean isVisibilidadCeldaOrdenCuota=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCuota=false;
	public Boolean isVisibilidadCeldaModificarCuota=false;
	public Boolean isVisibilidadCeldaActualizarCuota=false;
	public Boolean isVisibilidadCeldaEliminarCuota=false;
	public Boolean isVisibilidadCeldaCancelarCuota=false;
	public Boolean isVisibilidadCeldaGuardarCuota=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCuota=false;	
	
	
	public Boolean isVisibilidadFK_IdDefiProvisionEmpleado=false;
	public Boolean isVisibilidadFK_IdEstadoCuota=false;
	public Boolean isVisibilidadFK_IdPrestamo=false;
	
	public Long getiIdNuevoCuota() {
		return this.iIdNuevoCuota;
	}

	public void setiIdNuevoCuota(Long iIdNuevoCuota) {
		this.iIdNuevoCuota = iIdNuevoCuota;
	}
	
	public Long getidCuotaActual() {
		return this.idCuotaActual;
	}

	public void setidCuotaActual(Long idCuotaActual) {
		this.idCuotaActual = idCuotaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Cuota getcuota() {
		return this.cuota;
	}

	public void setcuota(Cuota cuota) {
		this.cuota = cuota;
	}
	
	public Cuota getcuotaAux() {
		return this.cuotaAux;
	}

	public void setcuotaAux(Cuota cuotaAux) {
		this.cuotaAux = cuotaAux;
	}				
	
	public Cuota getcuotaAnterior() {
		return this.cuotaAnterior;
	}

	public void setcuotaAnterior(Cuota cuotaAnterior) {
		this.cuotaAnterior = cuotaAnterior;
	}	
	
	public Cuota getcuotaTotales() {
		return this.cuotaTotales;
	}

	public void setcuotaTotales(Cuota cuotaTotales) {
		this.cuotaTotales = cuotaTotales;
	}	
	
	public Cuota getcuotaBean() {
		return this.cuotaBean;
	}

	public void setcuotaBean(Cuota cuotaBean) {
		this.cuotaBean = cuotaBean;
	}	
	
	public CuotaParameterReturnGeneral getcuotaReturnGeneral() {
		return this.cuotaReturnGeneral;
	}

	public void setcuotaReturnGeneral(CuotaParameterReturnGeneral cuotaReturnGeneral) {
		this.cuotaReturnGeneral = cuotaReturnGeneral;
	}	
	
	
	public Long id_defi_provision_empleadoFK_IdDefiProvisionEmpleado=-1L;

	public Long getid_defi_provision_empleadoFK_IdDefiProvisionEmpleado() {
		return this.id_defi_provision_empleadoFK_IdDefiProvisionEmpleado;
	}

	public void setid_defi_provision_empleadoFK_IdDefiProvisionEmpleado(Long id_defi_provision_empleadoFK_IdDefiProvisionEmpleado) {
		this.id_defi_provision_empleadoFK_IdDefiProvisionEmpleado = id_defi_provision_empleadoFK_IdDefiProvisionEmpleado;
	}

	public Long id_estado_cuotaFK_IdEstadoCuota=-1L;

	public Long getid_estado_cuotaFK_IdEstadoCuota() {
		return this.id_estado_cuotaFK_IdEstadoCuota;
	}

	public void setid_estado_cuotaFK_IdEstadoCuota(Long id_estado_cuotaFK_IdEstadoCuota) {
		this.id_estado_cuotaFK_IdEstadoCuota = id_estado_cuotaFK_IdEstadoCuota;
	}

	public Long id_prestamoFK_IdPrestamo=-1L;

	public Long getid_prestamoFK_IdPrestamo() {
		return this.id_prestamoFK_IdPrestamo;
	}

	public void setid_prestamoFK_IdPrestamo(Long id_prestamoFK_IdPrestamo) {
		this.id_prestamoFK_IdPrestamo = id_prestamoFK_IdPrestamo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CuotaLogic getCuotaLogic()	{		
		return cuotaLogic;
	}

	public void setCuotaLogic(CuotaLogic cuotaLogic) {
		this.cuotaLogic = cuotaLogic;
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
	
	public Boolean getIsEsNuevoCuota() {
		return isEsNuevoCuota;
	}

	public void setIsEsNuevoCuota(Boolean isEsNuevoCuota) {
		this.isEsNuevoCuota = isEsNuevoCuota;
	}

	public Boolean getEsParaAccionDesdeFormularioCuota() {
		return esParaAccionDesdeFormularioCuota;
	}
	
	public void setEsParaAccionDesdeFormularioCuota(Boolean esParaAccionDesdeFormularioCuota) {
		this.esParaAccionDesdeFormularioCuota = esParaAccionDesdeFormularioCuota;
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
	
	
	public void cargarCombosPrestamosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.prestamosForeignKey=new ArrayList<Prestamo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PrestamoLogic prestamoLogic=new PrestamoLogic();

			prestamoLogic.getPrestamoDataAccess().setIsForForeingKeyData(true);

			if(this.cuotaSessionBean==null) {
				this.cuotaSessionBean=new CuotaSessionBean();
			}

			if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionPrestamo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getPrestamoDataAccess().setIsForForeingKeyData(true);

					prestamoLogic.getTodosPrestamosWithConnection(sFinalQuery,new Pagination());

					this.prestamosForeignKey=prestamoLogic.getPrestamos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPrestamo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getEntityWithConnection(cuotaSessionBean.getlidPrestamoActual());
					this.prestamosForeignKey.add(prestamoLogic.getPrestamo());
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

	public void cargarCombosEstadoCuotasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadocuotasForeignKey=new ArrayList<EstadoCuota>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoCuotaLogic estadocuotaLogic=new EstadoCuotaLogic();

			estadocuotaLogic.getEstadoCuotaDataAccess().setIsForForeingKeyData(true);

			if(this.cuotaSessionBean==null) {
				this.cuotaSessionBean=new CuotaSessionBean();
			}

			if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCuota()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocuotaLogic.getEstadoCuotaDataAccess().setIsForForeingKeyData(true);

					estadocuotaLogic.getTodosEstadoCuotasWithConnection(sFinalQuery,new Pagination());

					this.estadocuotasForeignKey=estadocuotaLogic.getEstadoCuotas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoCuota(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocuotaLogic.getEntityWithConnection(cuotaSessionBean.getlidEstadoCuotaActual());
					this.estadocuotasForeignKey.add(estadocuotaLogic.getEstadoCuota());
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

	public void cargarCombosDefiProvisionEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.defiprovisionempleadosForeignKey=new ArrayList<DefiProvisionEmpleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DefiProvisionEmpleadoLogic defiprovisionempleadoLogic=new DefiProvisionEmpleadoLogic();

			defiprovisionempleadoLogic.getDefiProvisionEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.cuotaSessionBean==null) {
				this.cuotaSessionBean=new CuotaSessionBean();
			}

			if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getDefiProvisionEmpleadoDataAccess().setIsForForeingKeyData(true);

					defiprovisionempleadoLogic.getTodosDefiProvisionEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.defiprovisionempleadosForeignKey=defiprovisionempleadoLogic.getDefiProvisionEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDefiProvisionEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getEntityWithConnection(cuotaSessionBean.getlidDefiProvisionEmpleadoActual());
					this.defiprovisionempleadosForeignKey.add(defiprovisionempleadoLogic.getDefiProvisionEmpleado());
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

	
	
	public void setActualPrestamoForeignKey(Long idPrestamoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Prestamo  prestamoTemp=null;

			for(Prestamo prestamoAux:prestamosForeignKey) {
				if(prestamoAux.getId()!=null && prestamoAux.getId().equals(idPrestamoSeleccionado)) {
					prestamoTemp=prestamoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(prestamoTemp!=null) {

					if(this.cuota!=null) {
						this.cuota.setPrestamo(prestamoTemp);
					}

					if(this.jInternalFrameDetalleFormCuota!=null) {
						this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setSelectedItem(prestamoTemp);
					}
				} else {
					//jComboBoxid_prestamoCuota.setSelectedItem(prestamoTemp);
					if(this.jInternalFrameDetalleFormCuota!=null) {
						if(this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPrestamo") || sFormularioTipoBusqueda.equals("Todos")){
					if(prestamoTemp!=null && jComboBoxid_prestamoFK_IdPrestamoCuota!=null) {
						jComboBoxid_prestamoFK_IdPrestamoCuota.setSelectedItem(prestamoTemp);
					} else {
						if(jComboBoxid_prestamoFK_IdPrestamoCuota!=null) {
							//jComboBoxid_prestamoFK_IdPrestamoCuota.setSelectedItem(prestamoTemp);
							if(jComboBoxid_prestamoFK_IdPrestamoCuota.getItemCount()>0) {
								jComboBoxid_prestamoFK_IdPrestamoCuota.setSelectedIndex(0);
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

	public String getActualPrestamoForeignKeyDescripcion(Long idPrestamoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Prestamo  prestamoTemp=null;

			for(Prestamo prestamoAux:prestamosForeignKey) {
				if(prestamoAux.getId()!=null && prestamoAux.getId().equals(idPrestamoSeleccionado)) {
					prestamoTemp=prestamoAux;
					break;
				}
			}


			sDescripcion=PrestamoConstantesFunciones.getPrestamoDescripcion(prestamoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPrestamoForeignKeyGenerico(Long idPrestamoSeleccionado,JComboBox jComboBoxid_prestamoCuotaGenerico)throws Exception
	{
		try
		{
			Prestamo  prestamoTemp=null;

			for(Prestamo prestamoAux:prestamosForeignKey) {
				if(prestamoAux.getId()!=null && prestamoAux.getId().equals(idPrestamoSeleccionado)) {
					prestamoTemp=prestamoAux;
					break;
				}
			}

			if(prestamoTemp!=null) {
				jComboBoxid_prestamoCuotaGenerico.setSelectedItem(prestamoTemp);
			} else {
				if(jComboBoxid_prestamoCuotaGenerico!=null && jComboBoxid_prestamoCuotaGenerico.getItemCount()>0) {
					jComboBoxid_prestamoCuotaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoCuotaForeignKey(Long idEstadoCuotaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoCuota  estadocuotaTemp=null;

			for(EstadoCuota estadocuotaAux:estadocuotasForeignKey) {
				if(estadocuotaAux.getId()!=null && estadocuotaAux.getId().equals(idEstadoCuotaSeleccionado)) {
					estadocuotaTemp=estadocuotaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadocuotaTemp!=null) {

					if(this.cuota!=null) {
						this.cuota.setEstadoCuota(estadocuotaTemp);
					}

					if(this.jInternalFrameDetalleFormCuota!=null) {
						this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setSelectedItem(estadocuotaTemp);
					}
				} else {
					//jComboBoxid_estado_cuotaCuota.setSelectedItem(estadocuotaTemp);
					if(this.jInternalFrameDetalleFormCuota!=null) {
						if(this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoCuota") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadocuotaTemp!=null && jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota!=null) {
						jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.setSelectedItem(estadocuotaTemp);
					} else {
						if(jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota!=null) {
							//jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.setSelectedItem(estadocuotaTemp);
							if(jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.getItemCount()>0) {
								jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.setSelectedIndex(0);
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

	public String getActualEstadoCuotaForeignKeyDescripcion(Long idEstadoCuotaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoCuota  estadocuotaTemp=null;

			for(EstadoCuota estadocuotaAux:estadocuotasForeignKey) {
				if(estadocuotaAux.getId()!=null && estadocuotaAux.getId().equals(idEstadoCuotaSeleccionado)) {
					estadocuotaTemp=estadocuotaAux;
					break;
				}
			}


			sDescripcion=EstadoCuotaConstantesFunciones.getEstadoCuotaDescripcion(estadocuotaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoCuotaForeignKeyGenerico(Long idEstadoCuotaSeleccionado,JComboBox jComboBoxid_estado_cuotaCuotaGenerico)throws Exception
	{
		try
		{
			EstadoCuota  estadocuotaTemp=null;

			for(EstadoCuota estadocuotaAux:estadocuotasForeignKey) {
				if(estadocuotaAux.getId()!=null && estadocuotaAux.getId().equals(idEstadoCuotaSeleccionado)) {
					estadocuotaTemp=estadocuotaAux;
					break;
				}
			}

			if(estadocuotaTemp!=null) {
				jComboBoxid_estado_cuotaCuotaGenerico.setSelectedItem(estadocuotaTemp);
			} else {
				if(jComboBoxid_estado_cuotaCuotaGenerico!=null && jComboBoxid_estado_cuotaCuotaGenerico.getItemCount()>0) {
					jComboBoxid_estado_cuotaCuotaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDefiProvisionEmpleadoForeignKey(Long idDefiProvisionEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoTemp=null;

			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosForeignKey) {
				if(defiprovisionempleadoAux.getId()!=null && defiprovisionempleadoAux.getId().equals(idDefiProvisionEmpleadoSeleccionado)) {
					defiprovisionempleadoTemp=defiprovisionempleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(defiprovisionempleadoTemp!=null) {

					if(this.cuota!=null) {
						this.cuota.setDefiProvisionEmpleado(defiprovisionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCuota!=null) {
						this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setSelectedItem(defiprovisionempleadoTemp);
					}
				} else {
					//jComboBoxid_defi_provision_empleadoCuota.setSelectedItem(defiprovisionempleadoTemp);
					if(this.jInternalFrameDetalleFormCuota!=null) {
						if(this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDefiProvisionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(defiprovisionempleadoTemp!=null && jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota!=null) {
						jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setSelectedItem(defiprovisionempleadoTemp);
					} else {
						if(jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota!=null) {
							//jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setSelectedItem(defiprovisionempleadoTemp);
							if(jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.getItemCount()>0) {
								jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setSelectedIndex(0);
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

	public String getActualDefiProvisionEmpleadoForeignKeyDescripcion(Long idDefiProvisionEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoTemp=null;

			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosForeignKey) {
				if(defiprovisionempleadoAux.getId()!=null && defiprovisionempleadoAux.getId().equals(idDefiProvisionEmpleadoSeleccionado)) {
					defiprovisionempleadoTemp=defiprovisionempleadoAux;
					break;
				}
			}


			sDescripcion=DefiProvisionEmpleadoConstantesFunciones.getDefiProvisionEmpleadoDescripcion(defiprovisionempleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDefiProvisionEmpleadoForeignKeyGenerico(Long idDefiProvisionEmpleadoSeleccionado,JComboBox jComboBoxid_defi_provision_empleadoCuotaGenerico)throws Exception
	{
		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoTemp=null;

			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosForeignKey) {
				if(defiprovisionempleadoAux.getId()!=null && defiprovisionempleadoAux.getId().equals(idDefiProvisionEmpleadoSeleccionado)) {
					defiprovisionempleadoTemp=defiprovisionempleadoAux;
					break;
				}
			}

			if(defiprovisionempleadoTemp!=null) {
				jComboBoxid_defi_provision_empleadoCuotaGenerico.setSelectedItem(defiprovisionempleadoTemp);
			} else {
				if(jComboBoxid_defi_provision_empleadoCuotaGenerico!=null && jComboBoxid_defi_provision_empleadoCuotaGenerico.getItemCount()>0) {
					jComboBoxid_defi_provision_empleadoCuotaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPrestamoForeignKey(Cuota cuota,JComboBox jComboBoxid_prestamoCuotaGenerico)throws Exception
	{
		try
		{
			Prestamo  prestamoAux=new Prestamo();

			if(jComboBoxid_prestamoCuotaGenerico==null) {
				prestamoAux=(Prestamo)this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.getSelectedItem();
			} else {
				prestamoAux=(Prestamo)jComboBoxid_prestamoCuotaGenerico.getSelectedItem();
			}

			if(prestamoAux!=null && prestamoAux.getId()!=null) {
				cuota.setid_prestamo(prestamoAux.getId());
				cuota.setprestamo_descripcion(CuotaConstantesFunciones.getPrestamoDescripcion(prestamoAux));
				cuota.setPrestamo(prestamoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoCuotaForeignKey(Cuota cuota,JComboBox jComboBoxid_estado_cuotaCuotaGenerico)throws Exception
	{
		try
		{
			EstadoCuota  estadocuotaAux=new EstadoCuota();

			if(jComboBoxid_estado_cuotaCuotaGenerico==null) {
				estadocuotaAux=(EstadoCuota)this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.getSelectedItem();
			} else {
				estadocuotaAux=(EstadoCuota)jComboBoxid_estado_cuotaCuotaGenerico.getSelectedItem();
			}

			if(estadocuotaAux!=null && estadocuotaAux.getId()!=null) {
				cuota.setid_estado_cuota(estadocuotaAux.getId());
				cuota.setestadocuota_descripcion(CuotaConstantesFunciones.getEstadoCuotaDescripcion(estadocuotaAux));
				cuota.setEstadoCuota(estadocuotaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDefiProvisionEmpleadoForeignKey(Cuota cuota,JComboBox jComboBoxid_defi_provision_empleadoCuotaGenerico)throws Exception
	{
		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoAux=new DefiProvisionEmpleado();

			if(jComboBoxid_defi_provision_empleadoCuotaGenerico==null) {
				defiprovisionempleadoAux=(DefiProvisionEmpleado)this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.getSelectedItem();
			} else {
				defiprovisionempleadoAux=(DefiProvisionEmpleado)jComboBoxid_defi_provision_empleadoCuotaGenerico.getSelectedItem();
			}

			if(defiprovisionempleadoAux!=null && defiprovisionempleadoAux.getId()!=null) {
				cuota.setid_defi_provision_empleado(defiprovisionempleadoAux.getId());
				cuota.setdefiprovisionempleado_descripcion(CuotaConstantesFunciones.getDefiProvisionEmpleadoDescripcion(defiprovisionempleadoAux));
				cuota.setDefiProvisionEmpleado(defiprovisionempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePrestamosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPrestamo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuota!=null) { 
							this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.removeAllItems();

							for(Prestamo prestamo:this.prestamosForeignKey) {
								this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.addItem(prestamo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuota!=null) { 
					}

					if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPrestamo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_prestamoFK_IdPrestamoCuota.removeAllItems();

							for(Prestamo prestamo:this.prestamosForeignKey) {
								this.jComboBoxid_prestamoFK_IdPrestamoCuota.addItem(prestamo);
							}
						}

						if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoCuotasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoCuota=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuota!=null) { 
							this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.removeAllItems();

							for(EstadoCuota estadocuota:this.estadocuotasForeignKey) {
								this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.addItem(estadocuota);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuota!=null) { 
					}

					if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoCuota") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.removeAllItems();

							for(EstadoCuota estadocuota:this.estadocuotasForeignKey) {
								this.jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.addItem(estadocuota);
							}
						}

						if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDefiProvisionEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDefiProvisionEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuota!=null) { 
							this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.removeAllItems();

							for(DefiProvisionEmpleado defiprovisionempleado:this.defiprovisionempleadosForeignKey) {
								this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.addItem(defiprovisionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuota!=null) { 
					}

					if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDefiProvisionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.removeAllItems();

							for(DefiProvisionEmpleado defiprovisionempleado:this.defiprovisionempleadosForeignKey) {
								this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.addItem(defiprovisionempleado);
							}
						}

						if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePrestamoForeignKey(Prestamo prestamo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuota!=null) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setSelectedItem(prestamo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuota!=null) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_prestamoFK_IdPrestamoCuota.setSelectedItem(prestamo);
						} else {
							this.jComboBoxid_prestamoFK_IdPrestamoCuota.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoCuotaForeignKey(EstadoCuota estadocuota,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuota!=null) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setSelectedItem(estadocuota);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuota!=null) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.setSelectedItem(estadocuota);
						} else {
							this.jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameDefiProvisionEmpleadoForeignKey(DefiProvisionEmpleado defiprovisionempleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuota!=null) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setSelectedItem(defiprovisionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuota!=null) {
							this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setSelectedItem(defiprovisionempleado);
						} else {
							this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCuota() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CuotaConstantesFunciones.refrescarForeignKeysDescripcionesCuota(this.cuotaLogic.getCuotas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CuotaConstantesFunciones.refrescarForeignKeysDescripcionesCuota(this.cuotas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Prestamo.class));
		classes.add(new Classe(EstadoCuota.class));
		classes.add(new Classe(DefiProvisionEmpleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cuotaLogic.setCuotas(this.cuotas);
			cuotaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CuotaParameterReturnGeneral getCuotaParameterGeneral() {
		return this.cuotaParameterGeneral;
	}
	
	public void setCuotaParameterGeneral(CuotaParameterReturnGeneral cuotaParameterGeneral) {
		this.cuotaParameterGeneral = cuotaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCuota() {
		return isPermisoTodoCuota;
	}

	public void setIsPermisoTodoCuota(Boolean isPermisoTodoCuota) {
		this.isPermisoTodoCuota = isPermisoTodoCuota;
	}

	public Boolean getIsPermisoNuevoCuota() {
		return isPermisoNuevoCuota;
	}

	public void setIsPermisoNuevoCuota(Boolean isPermisoNuevoCuota) {
		this.isPermisoNuevoCuota = isPermisoNuevoCuota;
	}

	public Boolean getIsPermisoActualizarCuota() {
		return isPermisoActualizarCuota;
	}

	public void setIsPermisoActualizarCuota(Boolean isPermisoActualizarCuota) {
		this.isPermisoActualizarCuota = isPermisoActualizarCuota;
	}

	public Boolean getIsPermisoEliminarCuota() {
		return isPermisoEliminarCuota;
	}

	public void setIsPermisoEliminarCuota(Boolean isPermisoEliminarCuota) {
		this.isPermisoEliminarCuota = isPermisoEliminarCuota;
	}

	public Boolean getIsPermisoGuardarCambiosCuota() {
		return isPermisoGuardarCambiosCuota;
	}

	public void setIsPermisoGuardarCambiosCuota(Boolean isPermisoGuardarCambiosCuota) {
		this.isPermisoGuardarCambiosCuota = isPermisoGuardarCambiosCuota;
	}
	
	public Boolean getIsPermisoConsultaCuota() {
		return isPermisoConsultaCuota;
	}

	public void setIsPermisoConsultaCuota(Boolean isPermisoConsultaCuota) {
		this.isPermisoConsultaCuota = isPermisoConsultaCuota;
	}

	public Boolean getIsPermisoBusquedaCuota() {
		return isPermisoBusquedaCuota;
	}

	public void setIsPermisoBusquedaCuota(Boolean isPermisoBusquedaCuota) {
		this.isPermisoBusquedaCuota = isPermisoBusquedaCuota;
	}

	public Boolean getIsPermisoReporteCuota() {
		return isPermisoReporteCuota;
	}

	public void setIsPermisoReporteCuota(Boolean isPermisoReporteCuota) {
		this.isPermisoReporteCuota = isPermisoReporteCuota;
	}
	
	public Boolean getIsPermisoPaginacionMedioCuota() {
		return isPermisoPaginacionMedioCuota;
	}

	public void setIsPermisoPaginacionMedioCuota(Boolean isPermisoPaginacionMedioCuota) {
		this.isPermisoPaginacionMedioCuota = isPermisoPaginacionMedioCuota;
	}
	
	public Boolean getIsPermisoPaginacionTodoCuota() {
		return isPermisoPaginacionTodoCuota;
	}

	public void setIsPermisoPaginacionTodoCuota(Boolean isPermisoPaginacionTodoCuota) {
		this.isPermisoPaginacionTodoCuota = isPermisoPaginacionTodoCuota;
	}
	
	public Boolean getIsPermisoPaginacionAltoCuota() {
		return isPermisoPaginacionAltoCuota;
	}

	public void setIsPermisoPaginacionAltoCuota(Boolean isPermisoPaginacionAltoCuota) {
		this.isPermisoPaginacionAltoCuota = isPermisoPaginacionAltoCuota;
	}
	
	public Boolean getIsPermisoCopiarCuota() {
		return isPermisoCopiarCuota;
	}

	public void setIsPermisoCopiarCuota(Boolean isPermisoCopiarCuota) {
		this.isPermisoCopiarCuota = isPermisoCopiarCuota;
	}
	
	public Boolean getIsPermisoVerFormCuota() {
		return isPermisoVerFormCuota;
	}

	public void setIsPermisoVerFormCuota(Boolean isPermisoVerFormCuota) {
		this.isPermisoVerFormCuota = isPermisoVerFormCuota;
	}
	
	public Boolean getIsPermisoDuplicarCuota() {
		return isPermisoDuplicarCuota;
	}

	public void setIsPermisoDuplicarCuota(Boolean isPermisoDuplicarCuota) {
		this.isPermisoDuplicarCuota = isPermisoDuplicarCuota;
	}
	
	public Boolean getIsPermisoOrdenCuota() {
		return isPermisoOrdenCuota;
	}

	public void setIsPermisoOrdenCuota(Boolean isPermisoOrdenCuota) {
		this.isPermisoOrdenCuota = isPermisoOrdenCuota;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCuota() {
		return isVisibilidadCeldaNuevoCuota;
	}

	public void setIsVisibilidadCeldaNuevoCuota(Boolean isVisibilidadCeldaNuevoCuota) {
		this.isVisibilidadCeldaNuevoCuota = isVisibilidadCeldaNuevoCuota;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCuota() {
		return isVisibilidadCeldaDuplicarCuota;
	}

	public void setIsVisibilidadCeldaDuplicarCuota(Boolean isVisibilidadCeldaDuplicarCuota) {
		this.isVisibilidadCeldaDuplicarCuota = isVisibilidadCeldaDuplicarCuota;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCuota() {
		return isVisibilidadCeldaCopiarCuota;
	}

	public void setIsVisibilidadCeldaCopiarCuota(Boolean isVisibilidadCeldaCopiarCuota) {
		this.isVisibilidadCeldaCopiarCuota = isVisibilidadCeldaCopiarCuota;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCuota() {
		return isVisibilidadCeldaVerFormCuota;
	}

	public void setIsVisibilidadCeldaVerFormCuota(Boolean isVisibilidadCeldaVerFormCuota) {
		this.isVisibilidadCeldaVerFormCuota = isVisibilidadCeldaVerFormCuota;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCuota() {
		return isVisibilidadCeldaOrdenCuota;
	}

	public void setIsVisibilidadCeldaOrdenCuota(Boolean isVisibilidadCeldaOrdenCuota) {
		this.isVisibilidadCeldaOrdenCuota = isVisibilidadCeldaOrdenCuota;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCuota() {
		return isVisibilidadCeldaNuevoRelacionesCuota;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCuota(Boolean isVisibilidadCeldaNuevoRelacionesCuota) {
		this.isVisibilidadCeldaNuevoRelacionesCuota = isVisibilidadCeldaNuevoRelacionesCuota;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCuota() {
		return isVisibilidadCeldaModificarCuota;
	}

	public void setIsVisibilidadCeldaModificarCuota(Boolean isVisibilidadCeldaModificarCuota) {
		this.isVisibilidadCeldaModificarCuota = isVisibilidadCeldaModificarCuota;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCuota() {
		return isVisibilidadCeldaActualizarCuota;
	}

	public void setIsVisibilidadCeldaActualizarCuota(Boolean isVisibilidadCeldaActualizarCuota) {
		this.isVisibilidadCeldaActualizarCuota = isVisibilidadCeldaActualizarCuota;
	}

	public Boolean getIsVisibilidadCeldaEliminarCuota() {
		return isVisibilidadCeldaEliminarCuota;
	}

	public void setIsVisibilidadCeldaEliminarCuota(Boolean isVisibilidadCeldaEliminarCuota) {
		this.isVisibilidadCeldaEliminarCuota = isVisibilidadCeldaEliminarCuota;
	}

	public Boolean getIsVisibilidadCeldaCancelarCuota() {
		return isVisibilidadCeldaCancelarCuota;
	}

	public void setIsVisibilidadCeldaCancelarCuota(Boolean isVisibilidadCeldaCancelarCuota) {
		this.isVisibilidadCeldaCancelarCuota = isVisibilidadCeldaCancelarCuota;
	}

	public Boolean getIsVisibilidadCeldaGuardarCuota() {
		return isVisibilidadCeldaGuardarCuota;
	}

	public void setIsVisibilidadCeldaGuardarCuota(Boolean isVisibilidadCeldaGuardarCuota) {
		this.isVisibilidadCeldaGuardarCuota = isVisibilidadCeldaGuardarCuota;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCuota() {
		return isVisibilidadCeldaGuardarCambiosCuota;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCuota(Boolean isVisibilidadCeldaGuardarCambiosCuota) {
		this.isVisibilidadCeldaGuardarCambiosCuota = isVisibilidadCeldaGuardarCambiosCuota;
	}
		
	public CuotaSessionBean getcuotaSessionBean() {
		return this.cuotaSessionBean;
	}
	
	public void setcuotaSessionBean(CuotaSessionBean cuotaSessionBean) {
		this.cuotaSessionBean=cuotaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdDefiProvisionEmpleado() {
		return this.isVisibilidadFK_IdDefiProvisionEmpleado;
	}

	public void setisVisibilidadFK_IdDefiProvisionEmpleado(Boolean isVisibilidadFK_IdDefiProvisionEmpleado) {
		this.isVisibilidadFK_IdDefiProvisionEmpleado=isVisibilidadFK_IdDefiProvisionEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEstadoCuota() {
		return this.isVisibilidadFK_IdEstadoCuota;
	}

	public void setisVisibilidadFK_IdEstadoCuota(Boolean isVisibilidadFK_IdEstadoCuota) {
		this.isVisibilidadFK_IdEstadoCuota=isVisibilidadFK_IdEstadoCuota;
	}

	public Boolean getisVisibilidadFK_IdPrestamo() {
		return this.isVisibilidadFK_IdPrestamo;
	}

	public void setisVisibilidadFK_IdPrestamo(Boolean isVisibilidadFK_IdPrestamo) {
		this.isVisibilidadFK_IdPrestamo=isVisibilidadFK_IdPrestamo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCuota(Cuota cuota)throws Exception {
		try {
			
				this.setActualParaGuardarPrestamoForeignKey(cuota,null);
				this.setActualParaGuardarEstadoCuotaForeignKey(cuota,null);
				this.setActualParaGuardarDefiProvisionEmpleadoForeignKey(cuota,null);
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
	
	public void bugActualizarReferenciaActual(Cuota cuota,Cuota cuotaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCuota(cuota);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cuotaAux.setId(cuota.getId());
		cuotaAux.setVersionRow(cuota.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCuota();
		
			int intSelectedRow = this.jTableDatosCuota.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cuotaValidator.getInvalidValues(this.cuota);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cuotaLogic.setDatosCliente(datosCliente);
			cuotaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cuotaAux=new  Cuota();
				
				cuotaAux.setIsNew(true);
				cuotaAux.setIsChanged(true);
				
				cuotaAux.setCuotaOriginal(this.cuota);
				
				cuotaAux.setId(this.cuota.getId());	
				cuotaAux.setVersionRow(this.cuota.getVersionRow());	
				cuotaAux.setid_prestamo(this.cuota.getid_prestamo());	
				cuotaAux.setid_estado_cuota(this.cuota.getid_estado_cuota());	
				cuotaAux.setid_defi_provision_empleado(this.cuota.getid_defi_provision_empleado());	
				cuotaAux.setnumero_cuota(this.cuota.getnumero_cuota());	
				cuotaAux.setcapital(this.cuota.getcapital());	
				cuotaAux.setinteres(this.cuota.getinteres());	
				cuotaAux.settotal(this.cuota.gettotal());	
				cuotaAux.setfecha_liquidacion(this.cuota.getfecha_liquidacion());	
				cuotaAux.setmonto_ajuste(this.cuota.getmonto_ajuste());	
				cuotaAux.setinteres_ajuste(this.cuota.getinteres_ajuste());	
				cuotaAux.setfecha_vencimiento(this.cuota.getfecha_vencimiento());	
				cuotaAux.setdescripcion(this.cuota.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuotaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuotaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cuotaAux,cuotaLogic.getCuotas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuotaAux,cuotas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotaLogic.saveCuotas();//WithConnection
						//cuotaLogic.getSetVersionRowCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuota,cuotaAux);
					
					this.refrescarForeignKeysDescripcionesCuota();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuotaLogic.saveCuotaRelaciones(cuotaAux);//WithConnection
								//cuotaLogic.getSetVersionRowCuotas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuota,cuotaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuotaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuotaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuotaAux,cuotaLogic.getCuotas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuotaAux,cuotas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuota,cuotaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cuotaAux=new  Cuota();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cuotaSessionBean.getEsGuardarRelacionado() 
					|| (this.cuotaSessionBean.getEsGuardarRelacionado() && this.cuota.getId()>=0)) {
						
					cuotaAux.setIsNew(false);
				}
				
				cuotaAux.setIsDeleted(false);
			
				cuotaAux.setId(this.cuota.getId());	
				cuotaAux.setVersionRow(this.cuota.getVersionRow());	
				cuotaAux.setid_prestamo(this.cuota.getid_prestamo());	
				cuotaAux.setid_estado_cuota(this.cuota.getid_estado_cuota());	
				cuotaAux.setid_defi_provision_empleado(this.cuota.getid_defi_provision_empleado());	
				cuotaAux.setnumero_cuota(this.cuota.getnumero_cuota());	
				cuotaAux.setcapital(this.cuota.getcapital());	
				cuotaAux.setinteres(this.cuota.getinteres());	
				cuotaAux.settotal(this.cuota.gettotal());	
				cuotaAux.setfecha_liquidacion(this.cuota.getfecha_liquidacion());	
				cuotaAux.setmonto_ajuste(this.cuota.getmonto_ajuste());	
				cuotaAux.setinteres_ajuste(this.cuota.getinteres_ajuste());	
				cuotaAux.setfecha_vencimiento(this.cuota.getfecha_vencimiento());	
				cuotaAux.setdescripcion(this.cuota.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuotaAux,cuotaLogic.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuotaAux,cuotas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotaLogic.saveCuotas();//WithConnection
						//cuotaLogic.getSetVersionRowCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuota,cuotaAux);
					
					this.refrescarForeignKeysDescripcionesCuota();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuotaLogic.saveCuotaRelaciones(cuotaAux);//WithConnection
								//cuotaLogic.getSetVersionRowCuotas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuota,cuotaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuotaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuotaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuotaAux,cuotaLogic.getCuotas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuotaAux,cuotas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuota,cuotaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cuotaAux=new  Cuota();
				
				cuotaAux.setIsNew(false);
				cuotaAux.setIsChanged(false);
				
				cuotaAux.setIsDeleted(true);
				
				cuotaAux.setId(this.cuota.getId());	
				cuotaAux.setVersionRow(this.cuota.getVersionRow());	
				cuotaAux.setid_prestamo(this.cuota.getid_prestamo());	
				cuotaAux.setid_estado_cuota(this.cuota.getid_estado_cuota());	
				cuotaAux.setid_defi_provision_empleado(this.cuota.getid_defi_provision_empleado());	
				cuotaAux.setnumero_cuota(this.cuota.getnumero_cuota());	
				cuotaAux.setcapital(this.cuota.getcapital());	
				cuotaAux.setinteres(this.cuota.getinteres());	
				cuotaAux.settotal(this.cuota.gettotal());	
				cuotaAux.setfecha_liquidacion(this.cuota.getfecha_liquidacion());	
				cuotaAux.setmonto_ajuste(this.cuota.getmonto_ajuste());	
				cuotaAux.setinteres_ajuste(this.cuota.getinteres_ajuste());	
				cuotaAux.setfecha_vencimiento(this.cuota.getfecha_vencimiento());	
				cuotaAux.setdescripcion(this.cuota.getdescripcion());	
				
				if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cuotaAux.getId()>=0) {	
						this.cuotasEliminados.add(cuotaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cuotaAux,cuotaLogic.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuotaAux,cuotas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cuotaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuotaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotaLogic.saveCuotas();//WithConnection
						//cuotaLogic.getSetVersionRowCuotas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuotaLogic.saveCuotaRelaciones(cuotaAux);//WithConnection
								//cuotaLogic.getSetVersionRowCuotas();//WithConnection
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
							if(this.cuotaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cuotaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cuotaAux,cuotaLogic.getCuotas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cuotaAux,cuotas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getCuotas().addAll(this.cuotasEliminados);
					
					cuotaLogic.saveCuotas();//WithConnection
					//cuotaLogic.getSetVersionRowCuotas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCuota();
				
				this.cuotasEliminados= new ArrayList<Cuota>();		
			}
			
			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuota GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cuota=cuotaAux;
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
      		//this.finishProcessCuota();
      	}
		
	}	
	
	public void actualizarRelaciones(Cuota cuotaLocal) throws Exception {
		
		if(this.cuotaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Cuota cuotaLocal) throws Exception {	
		if(this.cuotaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PrestamoDetalleFormJInternalFrame.class)) {
				PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrameLocal=(PrestamoBeanSwingJInternalFrame) ((PrestamoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				prestamoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPrestamo(prestamoBeanSwingJInternalFrameLocal.getprestamo(),true);
				prestamoBeanSwingJInternalFrameLocal.actualizarLista(prestamoBeanSwingJInternalFrameLocal.prestamo,this.prestamosForeignKey);

				prestamoBeanSwingJInternalFrameLocal.actualizarRelaciones(prestamoBeanSwingJInternalFrameLocal.prestamo);

				cuotaLocal.setPrestamo(prestamoBeanSwingJInternalFrameLocal.prestamo);

				this.addItemDefectoCombosForeignKeyPrestamo();
				this.cargarCombosFramePrestamosForeignKey("Formulario");
				this.setActualPrestamoForeignKey(prestamoBeanSwingJInternalFrameLocal.prestamo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoCuotaDetalleFormJInternalFrame.class)) {
				EstadoCuotaBeanSwingJInternalFrame estadocuotaBeanSwingJInternalFrameLocal=(EstadoCuotaBeanSwingJInternalFrame) ((EstadoCuotaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadocuotaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoCuota(estadocuotaBeanSwingJInternalFrameLocal.getestadocuota(),true);
				estadocuotaBeanSwingJInternalFrameLocal.actualizarLista(estadocuotaBeanSwingJInternalFrameLocal.estadocuota,this.estadocuotasForeignKey);

				estadocuotaBeanSwingJInternalFrameLocal.actualizarRelaciones(estadocuotaBeanSwingJInternalFrameLocal.estadocuota);

				cuotaLocal.setEstadoCuota(estadocuotaBeanSwingJInternalFrameLocal.estadocuota);

				this.addItemDefectoCombosForeignKeyEstadoCuota();
				this.cargarCombosFrameEstadoCuotasForeignKey("Formulario");
				this.setActualEstadoCuotaForeignKey(estadocuotaBeanSwingJInternalFrameLocal.estadocuota.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DefiProvisionEmpleadoDetalleFormJInternalFrame.class)) {
				DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrameLocal=(DefiProvisionEmpleadoBeanSwingJInternalFrame) ((DefiProvisionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				defiprovisionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDefiProvisionEmpleado(defiprovisionempleadoBeanSwingJInternalFrameLocal.getdefiprovisionempleado(),true);
				defiprovisionempleadoBeanSwingJInternalFrameLocal.actualizarLista(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado,this.defiprovisionempleadosForeignKey);

				defiprovisionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado);

				cuotaLocal.setDefiProvisionEmpleado(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado);

				this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
				this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Formulario");
				this.setActualDefiProvisionEmpleadoForeignKey(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCuotaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCuota.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cuotaValidator.getInvalidValues(this.cuota);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Cuota cuota,List<Cuota> cuotas) throws Exception {
		try	{		
			CuotaConstantesFunciones.actualizarLista(cuota,cuotas,this.cuotaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Cuota cuota,List<Cuota> cuotas) throws Exception {
		try	{			
			CuotaConstantesFunciones.actualizarSelectedLista(cuota,cuotas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Cuota> cuotasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cuotasLocal=this.cuotaLogic.getCuotas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cuotasLocal=this.cuotas;
			}
			//ARCHITECTURE
		
			for(Cuota cuotaLocal:cuotasLocal) {
				if(this.permiteMantenimiento(cuotaLocal) && cuotaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CuotaConstantesFunciones.getCuotaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.IDPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelid_prestamoCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.IDESTADOCUOTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelid_estado_cuotaCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.IDDEFIPROVISIONEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelid_defi_provision_empleadoCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.NUMEROCUOTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelnumero_cuotaCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.CAPITAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelcapitalCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.INTERES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelinteresCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabeltotalCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.FECHALIQUIDACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelfecha_liquidacionCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.MONTOAJUSTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelmonto_ajusteCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.INTERESAJUSTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelinteres_ajusteCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelfecha_vencimientoCuota,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuotaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabeldescripcionCuota,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCuota!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelid_prestamoCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelid_estado_cuotaCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelid_defi_provision_empleadoCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelnumero_cuotaCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelcapitalCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelinteresCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabeltotalCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelfecha_liquidacionCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelmonto_ajusteCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelinteres_ajusteCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabelfecha_vencimientoCuota,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuota.jLabeldescripcionCuota,"");
		
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
		this.iIdNuevoCuota--;	
		
		
		this.cuotaAux=new Cuota();
		
		this.cuotaAux.setId(this.iIdNuevoCuota);
		this.cuotaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuotaLogic.getCuotas().add(this.cuotaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cuotas.add(this.cuotaAux);
		}
		//ARCHITECTURE
		
		this.cuota=this.cuotaAux;
		
		if(CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCuota(this.cuota);
			this.setVariablesObjetoActualToFormularioForeignKeyCuota(this.cuota);
		}
				
		//this.setDefaultControlesCuota();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCuota();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCuota();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuota();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuota(this.cuotaBean,this.cuota,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CuotaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cuotaSessionBean.getConGuardarRelaciones()) {
			classes=CuotaConstantesFunciones.getClassesRelationshipsOfCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cuotaReturnGeneral=cuotaLogic.procesarEventosCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuotaLogic.getCuotas(),this.cuota,this.cuotaParameterGeneral,this.isEsNuevoCuota,classes);//this.cuotaLogic.getCuota()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCuota(this.cuotaReturnGeneral,this.cuotaBean,false);
		
		if(this.cuotaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCuota(this.cuotaReturnGeneral.getCuota());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCuota(this.cuotaReturnGeneral.getCuota());
		}
		
		if(this.cuotaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCuota(this.cuotaReturnGeneral.getCuota(),classes);//this.cuotaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCuota(this.cuota,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCuota();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCuota();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuotaBeanSwingJInternalFrameAdditional.RecargarFormCuota(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCuota(false);
						
			if(cuotaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuota();
			}
			
			this.actualizarVisualTableDatosCuota();
			
			this.jTableDatosCuota.setRowSelectionInterval(this.getIndiceNuevoCuota(), this.getIndiceNuevoCuota());
			
			this.seleccionarFilaTablaCuotaActual();
						
			this.actualizarEstadoCeldasBotonesCuota("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCuota(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCuota.jTextFieldnumero_cuotaCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarnumero_cuotaCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldcapitalCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarcapitalCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldinteresCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarinteresCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldtotalCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activartotalCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldfecha_liquidacionCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarfecha_liquidacionCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldmonto_ajusteCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarmonto_ajusteCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldinteres_ajusteCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarinteres_ajusteCuota);
		this.jInternalFrameDetalleFormCuota.jDateChooserfecha_vencimientoCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarfecha_vencimientoCuota);
		this.jInternalFrameDetalleFormCuota.jTextAreadescripcionCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activardescripcionCuota);	
		
		this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarid_prestamoCuota);
		this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarid_estado_cuotaCuota);
		this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setEnabled(isHabilitar && this.cuotaConstantesFunciones.activarid_defi_provision_empleadoCuota);
	};
	
	public void setDefaultControlesCuota() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCuota(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cuotaSessionBean.setConGuardarRelaciones(true);			
			this.cuotaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.setVisible(true);
			
					
		} else {
			//this.cuotaSessionBean.setConGuardarRelaciones(false);			
			this.cuotaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCuota() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
				if(cuotaAux.getId().equals(this.iIdNuevoCuota)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cuota cuotaAux:this.cuotas) {
				if(cuotaAux.getId().equals(this.iIdNuevoCuota)) {
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
	
	public int getIndiceActualCuota(Cuota cuota,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
				if(cuotaAux.getId().equals(cuota.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cuota cuotaAux:this.cuotas) {
				if(cuotaAux.getId().equals(cuota.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCuota(Cuota cuotaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
				if(cuotaAux.getCuotaOriginal().getId().equals(cuotaOriginal.getId())) {
					existe=true;
					cuotaOriginal.setId(cuotaAux.getId());
					cuotaOriginal.setVersionRow(cuotaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cuota cuotaAux:this.cuotas) {
				if(cuotaAux.getCuotaOriginal().getId().equals(cuotaOriginal.getId())) {
					existe=true;
					cuotaOriginal.setId(cuotaAux.getId());
					cuotaOriginal.setVersionRow(cuotaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCuota(Boolean esParaCancelar) throws Exception {
		cuotasAux=new ArrayList<Cuota>();
		cuotaAux=new Cuota();
		
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
					if(cuotaAux.getId()<0) {
						cuotasAux.add(cuotaAux);
					}		
				}
				this.iIdNuevoCuota=0L;
				this.cuotaLogic.getCuotas().removeAll(cuotasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cuota cuotaAux:this.cuotas) {
					if(cuotaAux.getId()<0) {
						cuotasAux.add(cuotaAux);
					}		
				}
				this.iIdNuevoCuota=0L;
				this.cuotas.removeAll(cuotasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCuota 
					&& this.cuotaLogic.getCuotas().size()>0
					) {
					cuotaAux=this.cuotaLogic.getCuotas().get(this.cuotaLogic.getCuotas().size() - 1);
				
					if(cuotaAux.getId()<0) {
						this.cuotaLogic.getCuotas().remove(cuotaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCuota && this.cuotas.size()>0) {
					cuotaAux=this.cuotas.get(this.cuotas.size() - 1);
				
					if(cuotaAux.getId()<0) {
						this.cuotas.remove(cuotaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCuota(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cuota.getId()<0) {
				this.cuotaLogic.getCuotas().remove(this.cuota);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cuota.getId()<0) {
				this.cuotas.remove(this.cuota);
			}
		}			
	}
	
	public void setEstadosInicialesCuota(List<Cuota> cuotasAux) throws Exception {
		CuotaConstantesFunciones.setEstadosInicialesCuota(cuotasAux);
	}
	
	public void setEstadosInicialesCuota(Cuota cuotaAux) throws Exception {
		CuotaConstantesFunciones.setEstadosInicialesCuota(cuotaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCuotaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCuotaActual()) {
				if(!this.isEsNuevoCuota) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCuota=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCuotaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuota ?", "MANTENIMIENTO DE Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Cuota cuota) throws Exception {
		CuotaConstantesFunciones.seleccionarAsignar(this.cuota,cuota);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCuota=this.isPermisoActualizarOriginalCuota;
			
			
			this.seleccionarAsignar(cuota);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuotaConstantesFunciones.quitarEspaciosCuota(this.cuota,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cuotaSessionBean.setsFuncionBusquedaRapida(this.cuotaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCuota) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCuota(esParaCancelar);				
				this.cancelarNuevoCuota(esParaCancelar);								
			}
			
			this.cuota=new Cuota();
			
			this.inicializarCuota();
			
			this.actualizarEstadoCeldasBotonesCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCuota() throws Exception {
		try {
			CuotaConstantesFunciones.inicializarCuota(this.cuota);
			
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
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cuotaLogic.getCuotas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCuotas(String sAccionBusqueda,List<Cuota> cuotasParaReportes) throws Exception {
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
					sPathReporteFinal="Cuota"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CuotaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CuotaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Cuota"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuotas");		
		parameters.put("busquedapor", CuotaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCuota=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CuotaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CuotaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCuota=new JRBeanArrayDataSource(CuotaJInternalFrame.TraerCuotaBeans(cuotasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCuota);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CuotaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CuotaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CuotaBean.TraerCuotaBeans(cuotasParaReportes).toArray()));
							
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
				this.generarExcelReporteCuotas(sAccionBusqueda,sTipoArchivoReporte,cuotasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCuotas(sAccionBusqueda,sTipoArchivoReporte,cuotasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCuotaActionPerformed(null);
					//this.generarExcelReporteCuotas(sAccionBusqueda,sTipoArchivoReporte,cuotasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCuotas(sAccionBusqueda,sTipoArchivoReporte,cuotasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCuotas(sAccionBusqueda,sTipoArchivoReporte,cuotasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCuotas(sAccionBusqueda,sTipoArchivoReporte,cuotasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<Cuota> cuotasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuota";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cuotas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuota("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Cuota cuota : cuotasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CuotaConstantesFunciones.generarExcelReporteDataCuota("NORMAL",row,workbook,cuota,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCuota(String sTipo,Row row,Workbook workbook) {
		
		CuotaConstantesFunciones.generarExcelReporteHeaderCuota(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<Cuota> cuotasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuota_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cuotas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Cuota cuota : cuotasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CuotaConstantesFunciones.getCuotaDescripcion(cuota));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_IDPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_IDPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getprestamo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_IDESTADOCUOTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_IDESTADOCUOTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getestadocuota_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getdefiprovisionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_NUMEROCUOTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_NUMEROCUOTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getnumero_cuota());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_CAPITAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_CAPITAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getcapital());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_INTERES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_INTERES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getinteres());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_FECHALIQUIDACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_FECHALIQUIDACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getfecha_liquidacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_MONTOAJUSTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_MONTOAJUSTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getmonto_ajuste());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_INTERESAJUSTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_INTERESAJUSTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getinteres_ajuste());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuotaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuotaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuota.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCuotas(String sAccionBusqueda,String sTipoArchivoReporte,List<Cuota> cuotasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Cuota> cuotasRespaldo=null;
		
		classes=CuotaConstantesFunciones.getClassesRelationshipsOfCuota(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cuotaLogic.setDatosCliente(this.datosCliente);
		this.cuotaLogic.setDatosDeep(this.datosDeep);
		this.cuotaLogic.setIsConDeep(true);
		
		cuotasRespaldo=this.cuotaLogic.getCuotas();
		
		this.cuotaLogic.setCuotas(cuotasParaReportes);	
		this.cuotaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cuotasParaReportes=this.cuotaLogic.getCuotas();
		this.cuotaLogic.setCuotas(cuotasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuota_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cuotas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuota("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Cuota cuota : cuotasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCuota("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CuotaConstantesFunciones.generarExcelReporteDataCuota("NORMAL",row,workbook,cuota,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CuotaConstantesFunciones.getCuotaDescripcion(cuota));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuota.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuota.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCuota() throws Exception {		
		this.startProcessCuota(true);
	}
	
	public void startProcessCuota(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCuota ,this.jPanelParametrosReportesCuota, this.jScrollPanelDatosCuota,this.jPanelPaginacionCuota, this.jScrollPanelDatosEdicionCuota, this.jPanelAccionesCuota,this.jPanelAccionesFormularioCuota,this.jmenuBarCuota,this.jmenuBarDetalleCuota,this.jTtoolBarCuota,this.jTtoolBarDetalleCuota);		
		
		final JTabbedPane jTabbedPaneBusquedasCuota=this.jTabbedPaneBusquedasCuota; 
		
		final JPanel jPanelParametrosReportesCuota=this.jPanelParametrosReportesCuota;
		//final JScrollPane jScrollPanelDatosCuota=this.jScrollPanelDatosCuota;
		final JTable jTableDatosCuota=this.jTableDatosCuota;		
		final JPanel jPanelPaginacionCuota=this.jPanelPaginacionCuota;
		//final JScrollPane jScrollPanelDatosEdicionCuota=this.jScrollPanelDatosEdicionCuota;
		final JPanel jPanelAccionesCuota=this.jPanelAccionesCuota;
		
		JPanel jPanelCamposAuxiliarCuota=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCuota=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCuota!=null) {
			jPanelCamposAuxiliarCuota=this.jInternalFrameDetalleFormCuota.jPanelCamposCuota;
			jPanelAccionesFormularioAuxiliarCuota=this.jInternalFrameDetalleFormCuota.jPanelAccionesFormularioCuota;
		}
		
		final JPanel jPanelCamposCuota=jPanelCamposAuxiliarCuota;
		final JPanel jPanelAccionesFormularioCuota=jPanelAccionesFormularioAuxiliarCuota;
		
		
		final JMenuBar jmenuBarCuota=this.jmenuBarCuota;
		final JToolBar jTtoolBarCuota=this.jTtoolBarCuota;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCuota=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuota=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCuota!=null) {
			jmenuBarDetalleAuxiliarCuota=this.jInternalFrameDetalleFormCuota.jmenuBarDetalleCuota;
			jTtoolBarDetalleAuxiliarCuota=this.jInternalFrameDetalleFormCuota.jTtoolBarDetalleCuota;
		}
		
		final JMenuBar jmenuBarDetalleCuota=jmenuBarDetalleAuxiliarCuota;
		final JToolBar jTtoolBarDetalleCuota=jTtoolBarDetalleAuxiliarCuota;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuota;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuota;
			processRunnable.jTableDatos=jTableDatosCuota;
			processRunnable.jPanelCampos=jPanelCamposCuota;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuota;
			processRunnable.jPanelAcciones=jPanelAccionesCuota;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuota;
			
			
			processRunnable.jmenuBar=jmenuBarCuota;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuota;
			processRunnable.jTtoolBar=jTtoolBarCuota;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuota;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuota ,jPanelParametrosReportesCuota,jTableDatosCuota, /*jScrollPanelDatosCuota,*/jPanelCamposCuota,jPanelPaginacionCuota, /*jScrollPanelDatosEdicionCuota,*/ jPanelAccionesCuota,jPanelAccionesFormularioCuota,jmenuBarCuota,jmenuBarDetalleCuota,jTtoolBarCuota,jTtoolBarDetalleCuota);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuota ,jPanelParametrosReportesCuota, jScrollPanelDatosCuota,jPanelPaginacionCuota, jScrollPanelDatosEdicionCuota, jPanelAccionesCuota,jPanelAccionesFormularioCuota,jmenuBarCuota,jmenuBarDetalleCuota,jTtoolBarCuota,jTtoolBarDetalleCuota);
						
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
	
	public void finishProcessCuota() {// throws Exception 
		this.finishProcessCuota(true);
	}
	
	public void finishProcessCuota(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCuota ,this.jPanelParametrosReportesCuota, this.jScrollPanelDatosCuota,this.jPanelPaginacionCuota, this.jScrollPanelDatosEdicionCuota, this.jPanelAccionesCuota,this.jPanelAccionesFormularioCuota,this.jmenuBarCuota,this.jmenuBarDetalleCuota,this.jTtoolBarCuota,this.jTtoolBarDetalleCuota);		
		
		final JTabbedPane jTabbedPaneBusquedasCuota=this.jTabbedPaneBusquedasCuota; 
		
		final JPanel jPanelParametrosReportesCuota=this.jPanelParametrosReportesCuota;
		//final JScrollPane jScrollPanelDatosCuota=this.jScrollPanelDatosCuota;
		final JTable jTableDatosCuota=this.jTableDatosCuota;		
		final JPanel jPanelPaginacionCuota=this.jPanelPaginacionCuota;
		//final JScrollPane jScrollPanelDatosEdicionCuota=this.jScrollPanelDatosEdicionCuota;
		final JPanel jPanelAccionesCuota=this.jPanelAccionesCuota;
		
		JPanel jPanelCamposAuxiliarCuota=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCuota=new JPanel();
		
		if(this.jInternalFrameDetalleFormCuota!=null) {
			jPanelCamposAuxiliarCuota=this.jInternalFrameDetalleFormCuota.jPanelCamposCuota;
			jPanelAccionesFormularioAuxiliarCuota=this.jInternalFrameDetalleFormCuota.jPanelAccionesFormularioCuota;
		}
		
		final JPanel jPanelCamposCuota=jPanelCamposAuxiliarCuota;
		final JPanel jPanelAccionesFormularioCuota=jPanelAccionesFormularioAuxiliarCuota;
		
		
		final JMenuBar jmenuBarCuota=this.jmenuBarCuota;		
		final JToolBar jTtoolBarCuota=this.jTtoolBarCuota;
				
		JMenuBar jmenuBarDetalleAuxiliarCuota=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuota=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCuota!=null) {
			jmenuBarDetalleAuxiliarCuota=this.jInternalFrameDetalleFormCuota.jmenuBarDetalleCuota;
			jTtoolBarDetalleAuxiliarCuota=this.jInternalFrameDetalleFormCuota.jTtoolBarDetalleCuota;		
		}
		
		final JMenuBar jmenuBarDetalleCuota=jmenuBarDetalleAuxiliarCuota;
		final JToolBar jTtoolBarDetalleCuota=jTtoolBarDetalleAuxiliarCuota;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuota;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuota;
			processRunnable.jTableDatos=jTableDatosCuota;
			processRunnable.jPanelCampos=jPanelCamposCuota;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuota;
			processRunnable.jPanelAcciones=jPanelAccionesCuota;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuota;
			
			
			processRunnable.jmenuBar=jmenuBarCuota;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuota;
			processRunnable.jTtoolBar=jTtoolBarCuota;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuota;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCuota ,jPanelParametrosReportesCuota, jTableDatosCuota,/*jScrollPanelDatosCuota,*/jPanelCamposCuota,jPanelPaginacionCuota, /*jScrollPanelDatosEdicionCuota,*/ jPanelAccionesCuota,jPanelAccionesFormularioCuota,jmenuBarCuota,jmenuBarDetalleCuota,jTtoolBarCuota,jTtoolBarDetalleCuota));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCuota(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCuota(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCuota(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCuota(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCuota,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuota,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCuota(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCuota,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuota,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cuotaConstantesFunciones.getsFinalQueryCuota();
		String  finalQueryPaginacionTodos=this.cuotaConstantesFunciones.getsFinalQueryCuota();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CuotaConstantesFunciones.getArrayColumnasGlobalesNoCuota(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CuotaConstantesFunciones.getArrayColumnasGlobalesCuota(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CuotaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cuotasEliminados= new ArrayList<Cuota>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCuota();
		
				///*CuotaSessionBean*/this.cuotaSessionBean=new CuotaSessionBean();
			
			if(this.cuotaSessionBean==null) {
				this.cuotaSessionBean=new CuotaSessionBean();
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
					this.iNumeroPaginacion=CuotaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CuotaConstantesFunciones.getClassesForeignKeysOfCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cuota."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cuotasAux= new ArrayList<Cuota>();
			
				
			cuotaLogic.setDatosCliente(this.datosCliente);
			cuotaLogic.setDatosDeep(this.datosDeep);
			cuotaLogic.setIsConDeep(true);
			
			
			cuotaLogic.getCuotaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cuotaLogic.getTodosCuotas(finalQueryGlobal,pagination);
					
					//cuotaLogic.getTodosCuotasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cuotaLogic.getCuotas()==null|| cuotaLogic.getCuotas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuotasAux= new ArrayList<Cuota>();
							cuotasAux.addAll(cuotaLogic.getCuotas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotasAux= new ArrayList<Cuota>();
							cuotasAux.addAll(cuotas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuotaLogic.getTodosCuotas(finalQueryGlobal+"",this.pagination);												
							
							//cuotaLogic.getTodosCuotasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCuotas("Todos",cuotaLogic.getCuotas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuotaLogic.setCuotas(new ArrayList<Cuota>());					
							cuotaLogic.getCuotas().addAll(cuotasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotas=new ArrayList<Cuota>();
							cuotas.addAll(cuotasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCuota=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCuota=this.idActual;
				
				} else if(this.idCuotaActual!=null && this.idCuotaActual!=0L) {
					idCuota=idCuotaActual;
				}
				
					
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndicePorId(idCuota);
				
				this.cuotas=new ArrayList<Cuota>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cuotaLogic.getEntity(idCuota);
					
					//cuotaLogic.getEntityWithConnection(idCuota);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuotaLogic.setCuotas(new ArrayList<Cuota>());
					cuotaLogic.getCuotas().add(cuotaLogic.getCuota());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuotas=new ArrayList<Cuota>();
					this.cuotas.add(cuota);
				}
				
				if(cuotaLogic.getCuota()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdDefiProvisionEmpleado")) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuotaLogic.getCuotasFK_IdDefiProvisionEmpleado(finalQueryGlobal,pagination,id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuotaLogic.getCuotas()==null||cuotaLogic.getCuotas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuotas==null|| cuotas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotasAux=new ArrayList<Cuota>();
						cuotasAux.addAll(cuotaLogic.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotasAux=new ArrayList<Cuota>();
							cuotasAux.addAll(cuotas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuotaLogic.getCuotasFK_IdDefiProvisionEmpleado(finalQueryGlobal,pagination,id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuotas("FK_IdDefiProvisionEmpleado",cuotaLogic.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuotas("FK_IdDefiProvisionEmpleado",cuotas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotaLogic.setCuotas(new ArrayList<Cuota>());
						cuotaLogic.getCuotas().addAll(cuotasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotas=new ArrayList<Cuota>();
							cuotas.addAll(cuotasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoCuota")) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdEstadoCuota(id_estado_cuotaFK_IdEstadoCuota);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuotaLogic.getCuotasFK_IdEstadoCuota(finalQueryGlobal,pagination,id_estado_cuotaFK_IdEstadoCuota);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdEstadoCuota(id_estado_cuotaFK_IdEstadoCuota);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdEstadoCuota(id_estado_cuotaFK_IdEstadoCuota);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuotaLogic.getCuotas()==null||cuotaLogic.getCuotas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuotas==null|| cuotas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotasAux=new ArrayList<Cuota>();
						cuotasAux.addAll(cuotaLogic.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotasAux=new ArrayList<Cuota>();
							cuotasAux.addAll(cuotas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuotaLogic.getCuotasFK_IdEstadoCuota(finalQueryGlobal,pagination,id_estado_cuotaFK_IdEstadoCuota);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdEstadoCuota(id_estado_cuotaFK_IdEstadoCuota);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdEstadoCuota(id_estado_cuotaFK_IdEstadoCuota);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuotas("FK_IdEstadoCuota",cuotaLogic.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuotas("FK_IdEstadoCuota",cuotas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotaLogic.setCuotas(new ArrayList<Cuota>());
						cuotaLogic.getCuotas().addAll(cuotasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotas=new ArrayList<Cuota>();
							cuotas.addAll(cuotasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPrestamo")) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuotaLogic.getCuotasFK_IdPrestamo(finalQueryGlobal,pagination,id_prestamoFK_IdPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuotaLogic.getCuotas()==null||cuotaLogic.getCuotas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuotas==null|| cuotas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotasAux=new ArrayList<Cuota>();
						cuotasAux.addAll(cuotaLogic.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotasAux=new ArrayList<Cuota>();
							cuotasAux.addAll(cuotas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuotaLogic.getCuotasFK_IdPrestamo(finalQueryGlobal,pagination,id_prestamoFK_IdPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuotaConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuotas("FK_IdPrestamo",cuotaLogic.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuotas("FK_IdPrestamo",cuotas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotaLogic.setCuotas(new ArrayList<Cuota>());
						cuotaLogic.getCuotas().addAll(cuotasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotas=new ArrayList<Cuota>();
							cuotas.addAll(cuotasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCuota();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCuota();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuotaLogic.getCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuotas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuotaLogic.getCuotas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuotas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Cuota cuota) {
		Boolean permite=true;
		
		if(this.cuota.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CuotaConstantesFunciones.getOrderByListaCuota();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CuotaConstantesFunciones.getOrderByListaCuota();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cuota cuota:cuotaLogic.getCuotas()) {
				if(cuota.getsType().equals(Constantes2.S_TOTALES)) {
					cuotaTotales=cuota;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cuota cuota:this.cuotas) {
				if(cuota.getsType().equals(Constantes2.S_TOTALES)) {
					cuotaTotales=cuota;
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
			this.cuotaAux=new Cuota();
			this.cuotaAux.setsType(Constantes2.S_TOTALES);
			this.cuotaAux.setIsNew(false);
			this.cuotaAux.setIsChanged(false);
			this.cuotaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CuotaConstantesFunciones.TotalizarValoresFilaCuota(this.cuotaLogic.getCuotas(),this.cuotaAux);
				
				this.cuotaLogic.getCuotas().add(this.cuotaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CuotaConstantesFunciones.TotalizarValoresFilaCuota(this.cuotas,this.cuotaAux);
				
				this.cuotas.add(this.cuotaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cuotaTotales=new Cuota();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuotaLogic.getCuotas().remove(cuotaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuotas.remove(cuotaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cuotaTotales=new Cuota();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cuota cuota:cuotaLogic.getCuotas()) {
				if(cuota.getsType().equals(Constantes2.S_TOTALES)) {
					cuotaTotales=cuota;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuotaConstantesFunciones.TotalizarValoresFilaCuota(this.cuotaLogic.getCuotas(),cuotaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cuota cuota:this.cuotas) {
				if(cuota.getsType().equals(Constantes2.S_TOTALES)) {
					cuotaTotales=cuota;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuotaConstantesFunciones.TotalizarValoresFilaCuota(this.cuotas,cuotaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCuotasFK_IdDefiProvisionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdDefiProvisionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuotasFK_IdEstadoCuota()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoCuota";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuotasFK_IdPrestamo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPrestamo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCuotasFK_IdDefiProvisionEmpleado(String sFinalQuery,Long id_defi_provision_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuotaLogic.getCuotasFK_IdDefiProvisionEmpleado(sFinalQuery,this.pagination,id_defi_provision_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuotasFK_IdEstadoCuota(String sFinalQuery,Long id_estado_cuota)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuotaLogic.getCuotasFK_IdEstadoCuota(sFinalQuery,this.pagination,id_estado_cuota);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuotasFK_IdPrestamo(String sFinalQuery,Long id_prestamo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuotaLogic.getCuotasFK_IdPrestamo(sFinalQuery,this.pagination,id_prestamo);
				
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
	
	public void inicializarPermisosCuota() {
		this.isPermisoTodoCuota=false;
		this.isPermisoNuevoCuota=false;
		this.isPermisoActualizarCuota=false;
		this.isPermisoActualizarOriginalCuota=false;
		this.isPermisoEliminarCuota=false;
		this.isPermisoGuardarCambiosCuota=false;
		this.isPermisoConsultaCuota=false;
		this.isPermisoBusquedaCuota=false;
		this.isPermisoReporteCuota=false;		
		this.isPermisoOrdenCuota=false;		
		this.isPermisoPaginacionMedioCuota=false;		
		this.isPermisoPaginacionAltoCuota=false;
		this.isPermisoPaginacionTodoCuota=false;
		this.isPermisoCopiarCuota=false;		
		this.isPermisoVerFormCuota=false;		
		this.isPermisoDuplicarCuota=false;		
		this.isPermisoOrdenCuota=false;		
	}
	
	public void setPermisosUsuarioCuota(Boolean isPermiso) {
		this.isPermisoTodoCuota=isPermiso;
		this.isPermisoNuevoCuota=isPermiso;
		this.isPermisoActualizarCuota=isPermiso;
		this.isPermisoActualizarOriginalCuota=isPermiso;
		this.isPermisoEliminarCuota=isPermiso;
		this.isPermisoGuardarCambiosCuota=isPermiso;
		this.isPermisoConsultaCuota=isPermiso;
		this.isPermisoBusquedaCuota=isPermiso;
		this.isPermisoReporteCuota=isPermiso;
		this.isPermisoOrdenCuota=isPermiso;		
		this.isPermisoPaginacionMedioCuota=isPermiso;		
		this.isPermisoPaginacionAltoCuota=isPermiso;		
		this.isPermisoPaginacionTodoCuota=isPermiso;		
		this.isPermisoCopiarCuota=isPermiso;		
		this.isPermisoVerFormCuota=isPermiso;		
		this.isPermisoDuplicarCuota=isPermiso;
		this.isPermisoOrdenCuota=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCuota(Boolean isPermiso) {
		//this.isPermisoTodoCuota=isPermiso;
		this.isPermisoNuevoCuota=isPermiso;
		this.isPermisoActualizarCuota=isPermiso;
		this.isPermisoActualizarOriginalCuota=isPermiso;
		this.isPermisoEliminarCuota=isPermiso;
		this.isPermisoGuardarCambiosCuota=isPermiso;
		//this.isPermisoConsultaCuota=isPermiso;
		//this.isPermisoBusquedaCuota=isPermiso;
		//this.isPermisoReporteCuota=isPermiso;
		//this.isPermisoOrdenCuota=isPermiso;		
		//this.isPermisoPaginacionMedioCuota=isPermiso;		
		//this.isPermisoPaginacionAltoCuota=isPermiso;		
		//this.isPermisoPaginacionTodoCuota=isPermiso;		
		//this.isPermisoCopiarCuota=isPermiso;		
		//this.isPermisoDuplicarCuota=isPermiso;
		//this.isPermisoOrdenCuota=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCuotaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCuota(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCuotaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCuotaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCuotaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCuotaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCuota() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CuotaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCuota=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCuota=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCuota=this.isPermisoActualizarCuota;
			this.isPermisoEliminarCuota=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCuota=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCuota=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCuota=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCuota=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCuota=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuota=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCuota=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCuota=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCuota=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCuota=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCuota=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCuota=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuota=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCuota.setToolTipText(this.jTableDatosCuota.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCuota(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCuota(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCuota() throws Exception {
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
	public void inicializarCombosForeignKeyCuotaListas()throws Exception {
		try	{						
			
				this.prestamosForeignKey=new ArrayList();
				this.estadocuotasForeignKey=new ArrayList();
				this.defiprovisionempleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCuotaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CuotaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCuotaListas(false);
			} else {
			
				this.cargarCombosForeignKeyPrestamoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoCuotaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDefiProvisionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPrestamoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.prestamosForeignKey==null||this.prestamosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PrestamoConstantesFunciones.getArrayColumnasGlobalesPrestamo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PrestamoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PrestamoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPrestamosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoCuotaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadocuotasForeignKey==null||this.estadocuotasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoCuotaConstantesFunciones.getArrayColumnasGlobalesEstadoCuota(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoCuotaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoCuotaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoCuotasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDefiProvisionEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.defiprovisionempleadosForeignKey==null||this.defiprovisionempleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DefiProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesDefiProvisionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DefiProvisionEmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DefiProvisionEmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDefiProvisionEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCuotaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CuotaParameterReturnGeneral cuotaReturnGeneral=new CuotaParameterReturnGeneral();
						
			


				String finalQueryGlobalPrestamo="";

				if(((this.prestamosForeignKey==null||this.prestamosForeignKey.size()<=0) && this.cuotaConstantesFunciones.cargarid_prestamoCuota)
					 || (this.esRecargarFks && this.cuotaConstantesFunciones.cargarid_prestamoCuota)) {

					if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionPrestamo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PrestamoConstantesFunciones.getArrayColumnasGlobalesPrestamo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPrestamo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PrestamoConstantesFunciones.TABLENAME);

						finalQueryGlobalPrestamo=Funciones.GetFinalQueryAppend(finalQueryGlobalPrestamo, "");
						finalQueryGlobalPrestamo+=PrestamoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPrestamosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPrestamo=" WHERE " + ConstantesSql.ID + "="+cuotaSessionBean.getlidPrestamoActual();
					}
				} else {
					finalQueryGlobalPrestamo="NONE";
				}


				String finalQueryGlobalEstadoCuota="";

				if(((this.estadocuotasForeignKey==null||this.estadocuotasForeignKey.size()<=0) && this.cuotaConstantesFunciones.cargarid_estado_cuotaCuota)
					 || (this.esRecargarFks && this.cuotaConstantesFunciones.cargarid_estado_cuotaCuota)) {

					if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCuota()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoCuotaConstantesFunciones.getArrayColumnasGlobalesEstadoCuota(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoCuota=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoCuotaConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoCuota=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoCuota, "");
						finalQueryGlobalEstadoCuota+=EstadoCuotaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoCuotasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoCuota=" WHERE " + ConstantesSql.ID + "="+cuotaSessionBean.getlidEstadoCuotaActual();
					}
				} else {
					finalQueryGlobalEstadoCuota="NONE";
				}


				String finalQueryGlobalDefiProvisionEmpleado="";

				if(((this.defiprovisionempleadosForeignKey==null||this.defiprovisionempleadosForeignKey.size()<=0) && this.cuotaConstantesFunciones.cargarid_defi_provision_empleadoCuota)
					 || (this.esRecargarFks && this.cuotaConstantesFunciones.cargarid_defi_provision_empleadoCuota)) {

					if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DefiProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesDefiProvisionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDefiProvisionEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DefiProvisionEmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalDefiProvisionEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalDefiProvisionEmpleado, "");
						finalQueryGlobalDefiProvisionEmpleado+=DefiProvisionEmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDefiProvisionEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDefiProvisionEmpleado=" WHERE " + ConstantesSql.ID + "="+cuotaSessionBean.getlidDefiProvisionEmpleadoActual();
					}
				} else {
					finalQueryGlobalDefiProvisionEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cuotaReturnGeneral=cuotaLogic.cargarCombosLoteForeignKeyCuota(finalQueryGlobalPrestamo,finalQueryGlobalEstadoCuota,finalQueryGlobalDefiProvisionEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPrestamo.equals("NONE")) {
				this.prestamosForeignKey=cuotaReturnGeneral.getprestamosForeignKey();
			}

			if(!finalQueryGlobalEstadoCuota.equals("NONE")) {
				this.estadocuotasForeignKey=cuotaReturnGeneral.getestadocuotasForeignKey();
			}

			if(!finalQueryGlobalDefiProvisionEmpleado.equals("NONE")) {
				this.defiprovisionempleadosForeignKey=cuotaReturnGeneral.getdefiprovisionempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCuota()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPrestamo();
			this.addItemDefectoCombosForeignKeyEstadoCuota();
			this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPrestamo()throws Exception {
		try {
			if(this.cuotaSessionBean==null) {
				this.cuotaSessionBean=new CuotaSessionBean();
			}

			if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionPrestamo()) {
				Prestamo prestamo=new Prestamo();
				PrestamoConstantesFunciones.setPrestamoDescripcion(prestamo,Constantes.SMENSAJE_ESCOJA_OPCION);
				prestamo.setId(null);

				if(!PrestamoConstantesFunciones.ExisteEnLista(this.prestamosForeignKey,prestamo,true)) {

					this.prestamosForeignKey.add(0,prestamo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoCuota()throws Exception {
		try {

			if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoCuota()) {
				EstadoCuota estadocuota=new EstadoCuota();
				EstadoCuotaConstantesFunciones.setEstadoCuotaDescripcion(estadocuota,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadocuota.setId(null);

				if(!EstadoCuotaConstantesFunciones.ExisteEnLista(this.estadocuotasForeignKey,estadocuota,true)) {

					this.estadocuotasForeignKey.add(0,estadocuota);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDefiProvisionEmpleado()throws Exception {
		try {

			if(!this.cuotaSessionBean.getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado()) {
				DefiProvisionEmpleado defiprovisionempleado=new DefiProvisionEmpleado();
				DefiProvisionEmpleadoConstantesFunciones.setDefiProvisionEmpleadoDescripcion(defiprovisionempleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				defiprovisionempleado.setId(null);

				if(!DefiProvisionEmpleadoConstantesFunciones.ExisteEnLista(this.defiprovisionempleadosForeignKey,defiprovisionempleado,true)) {

					this.defiprovisionempleadosForeignKey.add(0,defiprovisionempleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCuota()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCuota(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCuota()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.cuota.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuota();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCuota(Cuota cuota)throws Exception {	
		try {
			
			this.setActualPrestamoForeignKey(cuota.getid_prestamo(),false,"Formulario");
			this.setActualEstadoCuotaForeignKey(cuota.getid_estado_cuota(),false,"Formulario");
			this.setActualDefiProvisionEmpleadoForeignKey(cuota.getid_defi_provision_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCuota(Cuota cuota,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCuota()throws Exception {	
		try {
			
			this.setActualPrestamoForeignKey(this.cuotaConstantesFunciones.getid_prestamo(),false,"Formulario");
			this.setActualEstadoCuotaForeignKey(this.cuotaConstantesFunciones.getid_estado_cuota(),false,"Formulario");
			this.setActualDefiProvisionEmpleadoForeignKey(this.cuotaConstantesFunciones.getid_defi_provision_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCuota()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCuota()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCuota()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCuota()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCuota()throws Exception {
		try {
			

			this.cargarCombosFramePrestamosForeignKey("Todos");
			this.cargarCombosFrameEstadoCuotasForeignKey("Todos");
			this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCuota(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePrestamosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoCuotasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDefiProvisionEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCuota()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota!=null && this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota!=null && this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota!=null && this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CuotaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CuotaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CuotaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cuotaSessionBean=new CuotaSessionBean(); 
		this.cuotaConstantesFunciones=new CuotaConstantesFunciones(); 
		this.cuotaBean=new Cuota();//(this.cuotaConstantesFunciones); 		
		this.cuotaReturnGeneral=new CuotaParameterReturnGeneral(); 
		
		this.cuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CuotaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCuota(true);
			
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
			
			this.cuotaConstantesFunciones=new CuotaConstantesFunciones(); 
			this.cuotaBean=new Cuota();//this.cuotaConstantesFunciones); 			
			this.cuotaReturnGeneral=new CuotaParameterReturnGeneral(); 
		
			CuotaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuota Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cuota=new Cuota();
			this.cuotas = new ArrayList<Cuota>();
			this.cuotasAux = new ArrayList<Cuota>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic=new CuotaLogic();
				this.cuotaLogic.getNewConnexionToDeep("");
			}
			
			//this.cuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCuota);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuota);	
					}
					
					if(this.jInternalFrameImportacionCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuota);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCuota!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCuota);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCuota!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCuota);
				this.jInternalFrameDetalleFormCuota.setVisible(false);
				this.jInternalFrameDetalleFormCuota.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuota);
					this.jInternalFrameReporteDinamicoCuota.setVisible(false);
					this.jInternalFrameReporteDinamicoCuota.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCuota);
					this.jInternalFrameImportacionCuota.setVisible(false);
					this.jInternalFrameImportacionCuota.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCuota!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCuota);
					this.jInternalFrameOrderByCuota.setVisible(false);
					this.jInternalFrameOrderByCuota.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCuotaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CuotaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cuotaReturnGeneral=new CuotaParameterReturnGeneral();
			
			this.cuotaParameterGeneral=new CuotaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cuotaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CuotaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuotaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuotaSessionBean.getEsGuardarRelacionado(),this.cuotaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuotaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuotaSessionBean.getEsGuardarRelacionado(),this.cuotaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCuota=false;
			this.isVisibilidadCeldaDuplicarCuota=true;
			this.isVisibilidadCeldaCopiarCuota=true;
			this.isVisibilidadCeldaVerFormCuota=true;
			this.isVisibilidadCeldaOrdenCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesCuota=false;
			this.isVisibilidadCeldaModificarCuota=false;
			this.isVisibilidadCeldaActualizarCuota=false;
			this.isVisibilidadCeldaEliminarCuota=false;
			this.isVisibilidadCeldaCancelarCuota=false;
			this.isVisibilidadCeldaGuardarCuota=false;
			this.isVisibilidadCeldaGuardarCambiosCuota=false;
			
			
			this.isVisibilidadFK_IdDefiProvisionEmpleado=true;
			this.isVisibilidadFK_IdEstadoCuota=true;
			this.isVisibilidadFK_IdPrestamo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCuota();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCuota(false);
			
			this.setPermisosUsuarioCuota();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuotaSessionBean.getEsGuardarRelacionado() 
				|| (this.cuotaSessionBean.getEsGuardarRelacionado() && this.cuotaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCuotaClasesRelacionadas();
			}
			
			if(this.cuotaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCuotaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CuotaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCuota();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCuota();
			}
			
			if(!this.isPermisoBusquedaCuota) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCuota.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCuota,this.isPermisoPaginacionMedioCuota,this.isPermisoPaginacionTodoCuota);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CuotaConstantesFunciones.getTiposSeleccionarCuota());
				
				this.tiposColumnasSelect=CuotaConstantesFunciones.getTiposSeleccionarCuota(true);
				
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
			//if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCuota();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCuota(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCuota(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCuota() ;
			
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
			
			this.prestamoLogic=new PrestamoLogic();
			this.estadocuotaLogic=new EstadoCuotaLogic();
			this.defiprovisionempleadoLogic=new DefiProvisionEmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cuotaImplementable= (CuotaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuotaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cuotaImplementableHome= (CuotaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuotaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cuotas= new ArrayList<Cuota>();
			this.cuotasEliminados= new ArrayList<Cuota>();
						
			this.isEsNuevoCuota=false;
			this.esParaAccionDesdeFormularioCuota=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.prestamosForeignKey=new ArrayList<Prestamo>() ;
			this.estadocuotasForeignKey=new ArrayList<EstadoCuota>() ;
			this.defiprovisionempleadosForeignKey=new ArrayList<DefiProvisionEmpleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCuota(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCuota();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CuotaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CuotaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCuota("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCuota(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCuota!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCuota();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCuota();
			}
			
			CuotaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCuota.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCuota.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCuota.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCuota(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Cuota: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCuota() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCuota")) {
				iIndex=this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCuota.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCuota();	
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
	
	public void cargarCombosForeignKeyCuota(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCuota(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCuota(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCuotaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCuota();
		
		this.cargarCombosFrameForeignKeyCuota();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCuota();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCuota();
		}
	}
	
	

	public void cargarCombosForeignKeyPrestamo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPrestamoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPrestamo();
				this.cargarCombosFramePrestamosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPrestamo(this.prestamosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoCuota(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoCuotaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoCuota();
				this.cargarCombosFrameEstadoCuotasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoCuota(this.estadocuotasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDefiProvisionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDefiProvisionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
				this.cargarCombosFrameDefiProvisionEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDefiProvisionEmpleado(this.defiprovisionempleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCuotaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cuotaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
			
			if(jTableDatosCuota.getRowCount()>=1) {
				jTableDatosCuota.removeRowSelectionInterval(0, jTableDatosCuota.getRowCount()-1);						
			}
			
			this.isEsNuevoCuota=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCuota(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCuota(true);			
			//this.cuota=new Cuota();
			//this.cuota.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuota(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuota() ;
			
			if(CuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuota(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cuota);	
			this.actualizarInformacion("INFO_PADRE",false,this.cuota);				
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
			if(this.cuotaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Cuota: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCuotaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCuota.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCuota.getSelectedRows().length;			
			}
			
			cuotasSeleccionados=this.getCuotasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCuota--;			
				//Cuota cuotaAux= new Cuota();			
				//cuotaAux.setId(this.iIdNuevoCuota);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Cuota cuotaOrigen=new Cuota();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Cuota cuotaOrigen : cuotasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCuota.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cuotaOrigen =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuotaOrigen =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCuota();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cuota.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCuota(cuotaOrigen,this.cuota,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuotaLogic.getCuotas().add(this.cuotaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuotas.add(this.cuotaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCuota(false);
				
				this.jTableDatosCuota.setRowSelectionInterval(this.getIndiceNuevoCuota(), this.getIndiceNuevoCuota());
				
				int iLastRow =  this.jTableDatosCuota.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuota.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuota.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuota(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();									
		
			Cuota cuotaOrigen=new Cuota();
			Cuota cuotaDestino=new Cuota();
				
			cuotasSeleccionados=this.getCuotasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCuota.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cuotasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCuota.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotaOrigen =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuotaOrigen =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuotaDestino =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuotaDestino =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cuotaOrigen =cuotasSeleccionados.get(0);
				cuotaDestino =cuotasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCuota(cuotaOrigen,cuotaDestino,true,false);
				
				cuotaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuotaDestino,cuotaLogic.getCuotas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuotaDestino,cuotas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCuota(false);
				
				//this.jTableDatosCuota.setRowSelectionInterval(this.getIndiceNuevoCuota(), this.getIndiceNuevoCuota());
				
				int iLastRow =  this.jTableDatosCuota.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuota.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuota.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuota(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCuota.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCuota.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCuota.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCuota.setVisible(!isVisible);
			this.jPanelPaginacionCuota.setVisible(!isVisible);
			this.jPanelAccionesCuota.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCuota();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCuota();
			
			this.abrirFrameOrderByCuota();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCuota();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCuota(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuota);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCuota.isMaximum()) {
					this.jInternalFrameDetalleFormCuota.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCuota.setSize(this.jInternalFrameDetalleFormCuota.iWidthFormulario,this.jInternalFrameDetalleFormCuota.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCuota.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCuota.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCuota.isMaximum()) {
						this.jInternalFrameDetalleFormCuota.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCuota.jContentPaneDetalleCuota.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCuota.jContentPaneDetalleCuota.getWidth(),CuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCuota.jContentPaneDetalleCuota.getWidth(),CuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCuota.jContentPaneDetalleCuota.getWidth(),CuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCuota.setVisible(true);
	        this.jInternalFrameDetalleFormCuota.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCuota() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCuota==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuota,false,this);
				} else {
					this.jInternalFrameOrderByCuota=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuota,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCuota);
				this.jInternalFrameOrderByCuota.setVisible(false);
				this.jInternalFrameOrderByCuota.setSelected(false);
				
				this.jInternalFrameOrderByCuota.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuota"));
				
				this.inicializarActualizarBindingTablaOrderByCuota();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCuota() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCuota==null) {
				
				this.jInternalFrameImportacionCuota=new ImportacionJInternalFrame(CuotaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuota);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCuota);
				this.jInternalFrameImportacionCuota.setVisible(false);
				this.jInternalFrameImportacionCuota.setSelected(false);


				this.jInternalFrameImportacionCuota.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuota"));
				this.jInternalFrameImportacionCuota.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuota"));
				this.jInternalFrameImportacionCuota.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuota"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCuota() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCuota==null) {
				this.jInternalFrameReporteDinamicoCuota=new ReporteDinamicoJInternalFrame(CuotaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuota);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuota);
				this.jInternalFrameReporteDinamicoCuota.setVisible(false);
				this.jInternalFrameReporteDinamicoCuota.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCuota.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuota"));
				this.jInternalFrameReporteDinamicoCuota.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuota"));
				this.jInternalFrameReporteDinamicoCuota.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuota"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuota();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCuota() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuota);
			
	       	this.jInternalFrameDetalleFormCuota.setVisible(false);
	        this.jInternalFrameDetalleFormCuota.setSelected(false);
			
			//this.jInternalFrameDetalleFormCuota.dispose();
			//this.jInternalFrameDetalleFormCuota=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCuota() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCuota.setVisible(true);
	        this.jInternalFrameReporteDinamicoCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCuota() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCuota.setVisible(true);
	        this.jInternalFrameImportacionCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCuota() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCuota.setVisible(true);
	        this.jInternalFrameOrderByCuota.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCuota() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCuota.setVisible(false);
	        this.jInternalFrameOrderByCuota.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCuota() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCuota.setVisible(false);
	        this.jInternalFrameReporteDinamicoCuota.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCuota() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCuota.setVisible(false);
	        this.jInternalFrameImportacionCuota.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCuota(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCuota(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuota.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCuota(true);
			//this.isEsNuevoCuota=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuota(false) ;
			
			if(cuotaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuota(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuota(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCuotaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCuota(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuota.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCuota(true);
			//this.isEsNuevoCuota=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cuota.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCuota("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCuota(false) ;
			
			if(CuotaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuota(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuota(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPrestamo(List<Prestamo> prestamosForeignKey)throws Exception{
		TableColumn tableColumnPrestamo=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_IDPRESTAMO));
		TableCellEditor tableCellEditorPrestamo =tableColumnPrestamo.getCellEditor();

		PrestamoTableCell prestamoTableCellFk=(PrestamoTableCell)tableCellEditorPrestamo;

		if(prestamoTableCellFk!=null) {
			prestamoTableCellFk.setprestamosForeignKey(prestamosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuota.getSelectedRow();

		//if(intSelectedRow<=0) {
			//prestamoTableCellFk.setRowActual(intSelectedRow);
			//prestamoTableCellFk.setprestamosForeignKeyActual(prestamosForeignKey);
		//}


		if(prestamoTableCellFk!=null) {
			prestamoTableCellFk.RecargarPrestamosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoCuota(List<EstadoCuota> estadocuotasForeignKey)throws Exception{
		TableColumn tableColumnEstadoCuota=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_IDESTADOCUOTA));
		TableCellEditor tableCellEditorEstadoCuota =tableColumnEstadoCuota.getCellEditor();

		EstadoCuotaTableCell estadocuotaTableCellFk=(EstadoCuotaTableCell)tableCellEditorEstadoCuota;

		if(estadocuotaTableCellFk!=null) {
			estadocuotaTableCellFk.setestadocuotasForeignKey(estadocuotasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuota.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadocuotaTableCellFk.setRowActual(intSelectedRow);
			//estadocuotaTableCellFk.setestadocuotasForeignKeyActual(estadocuotasForeignKey);
		//}


		if(estadocuotaTableCellFk!=null) {
			estadocuotaTableCellFk.RecargarEstadoCuotasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDefiProvisionEmpleado(List<DefiProvisionEmpleado> defiprovisionempleadosForeignKey)throws Exception{
		TableColumn tableColumnDefiProvisionEmpleado=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO));
		TableCellEditor tableCellEditorDefiProvisionEmpleado =tableColumnDefiProvisionEmpleado.getCellEditor();

		DefiProvisionEmpleadoTableCell defiprovisionempleadoTableCellFk=(DefiProvisionEmpleadoTableCell)tableCellEditorDefiProvisionEmpleado;

		if(defiprovisionempleadoTableCellFk!=null) {
			defiprovisionempleadoTableCellFk.setdefiprovisionempleadosForeignKey(defiprovisionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuota.getSelectedRow();

		//if(intSelectedRow<=0) {
			//defiprovisionempleadoTableCellFk.setRowActual(intSelectedRow);
			//defiprovisionempleadoTableCellFk.setdefiprovisionempleadosForeignKeyActual(defiprovisionempleadosForeignKey);
		//}


		if(defiprovisionempleadoTableCellFk!=null) {
			defiprovisionempleadoTableCellFk.RecargarDefiProvisionEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCuota(false);
			
			//if(!this.isEsNuevoCuota) {								
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				
			}
			
			if(this.permiteMantenimiento(this.cuota)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuotaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCuota=true;
					this.inicializarActualizarBindingTablaCuota(false);
					this.isEsNuevoCuota=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCuota=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCuota=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuota(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuota(false);
				
				this.habilitarDeshabilitarControlesCuota(false);
			
												
				
				if(CuotaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCuota();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCuotaActionPerformed(evt,cuotaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCuota(this.cuota,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCuota.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cuotaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cuota.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCuotaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCuota.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				this.cuota.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				this.cuota.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cuota)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuotaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CuotaModel) this.jTableDatosCuota.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCuota=true;
				this.inicializarActualizarBindingTablaCuota(false);
				this.isEsNuevoCuota=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuota(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuota(false);
				
				this.habilitarDeshabilitarControlesCuota(false);
				
				
				
				if(CuotaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCuota();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCuotaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCuota.getRowCount()>=1) {
				jTableDatosCuota.removeRowSelectionInterval(0, jTableDatosCuota.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCuota(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCuota(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuota(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuota(false) ;
			
			this.isEsNuevoCuota=false;
			
			if(CuotaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCuota();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCuota(false);
				
				//SI ES MANUAL
				if(CuotaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCuota();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCuota--;			
			//Cuota cuotaAux= new Cuota();			
			//cuotaAux.setId(this.iIdNuevoCuota);
			
			if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCuota();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
			
			this.cuota.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cuotaLogic.getCuotas().add(this.cuotaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cuotas.add(this.cuotaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCuota(false);
			
			this.jTableDatosCuota.setRowSelectionInterval(this.getIndiceNuevoCuota(), this.getIndiceNuevoCuota());
			
			int iLastRow =  this.jTableDatosCuota.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCuota.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCuota.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCuota(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCuota(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuota(false);
			
			//SI ES MANUAL
			if(CuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuota();
			}
			
			//this.abrirFrameTreeCuota();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCuotaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CuotaS ?", "MANTENIMIENTO DE Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCuota.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCuota();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cuotaReturnGeneral=cuotaLogic.procesarImportacionCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cuotaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCuotaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCuotaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCuota.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCuota.setFileImportacion(this.jInternalFrameImportacionCuota.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCuota.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCuota.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCuota.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCuota.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		

		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CuotaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CuotaBaseDesign.jrxml";
			
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
			
			this.generarReporteCuotas("Todos",cuotasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuotaConstantesFunciones.LABEL_IDPRESTAMO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Prestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Prestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Prestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Prestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_IDESTADOCUOTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoCuota_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoCuota_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoCuota_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoCuota_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DefiProvisionEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DefiProvisionEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DefiProvisionEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DefiProvisionEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_NUMEROCUOTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuota_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuota_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuota_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuota_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_CAPITAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_pital_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_pital_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_pital_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_pital_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_INTERES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_teres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_teres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_teres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_teres_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_FECHALIQUIDACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaLiquidacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaLiquidacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaLiquidacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaLiquidacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_MONTOAJUSTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoAjuste_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoAjuste_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoAjuste_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoAjuste_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_INTERESAJUSTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_teresAjuste_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_teresAjuste_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_teresAjuste_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_teresAjuste_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuotaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoCuota.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCuota.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CuotaConstantesFunciones.LABEL_IDPRESTAMO:
					sNombreCampoCategoria="id_prestamo";
					break;

				case CuotaConstantesFunciones.LABEL_IDESTADOCUOTA:
					sNombreCampoCategoria="id_estado_cuota";
					break;

				case CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					sNombreCampoCategoria="id_defi_provision_empleado";
					break;

				case CuotaConstantesFunciones.LABEL_NUMEROCUOTA:
					sNombreCampoCategoria="numero_cuota";
					break;

				case CuotaConstantesFunciones.LABEL_CAPITAL:
					sNombreCampoCategoria="capital";
					break;

				case CuotaConstantesFunciones.LABEL_INTERES:
					sNombreCampoCategoria="interes";
					break;

				case CuotaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case CuotaConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoria="fecha_liquidacion";
					break;

				case CuotaConstantesFunciones.LABEL_MONTOAJUSTE:
					sNombreCampoCategoria="monto_ajuste";
					break;

				case CuotaConstantesFunciones.LABEL_INTERESAJUSTE:
					sNombreCampoCategoria="interes_ajuste";
					break;

				case CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case CuotaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCuota.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CuotaConstantesFunciones.LABEL_IDPRESTAMO:
					sNombreCampoCategoriaValor="id_prestamo";
					break;

				case CuotaConstantesFunciones.LABEL_IDESTADOCUOTA:
					sNombreCampoCategoriaValor="id_estado_cuota";
					break;

				case CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					sNombreCampoCategoriaValor="id_defi_provision_empleado";
					break;

				case CuotaConstantesFunciones.LABEL_NUMEROCUOTA:
					sNombreCampoCategoriaValor="numero_cuota";
					break;

				case CuotaConstantesFunciones.LABEL_CAPITAL:
					sNombreCampoCategoriaValor="capital";
					break;

				case CuotaConstantesFunciones.LABEL_INTERES:
					sNombreCampoCategoriaValor="interes";
					break;

				case CuotaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case CuotaConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoriaValor="fecha_liquidacion";
					break;

				case CuotaConstantesFunciones.LABEL_MONTOAJUSTE:
					sNombreCampoCategoriaValor="monto_ajuste";
					break;

				case CuotaConstantesFunciones.LABEL_INTERESAJUSTE:
					sNombreCampoCategoriaValor="interes_ajuste";
					break;

				case CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case CuotaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCuota.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuota.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuotaConstantesFunciones.LABEL_IDPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_prestamo");
					break;

				case CuotaConstantesFunciones.LABEL_IDESTADOCUOTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Cuota",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_cuota");
					break;

				case CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Defi Provision Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_defi_provision_empleado");
					break;

				case CuotaConstantesFunciones.LABEL_NUMEROCUOTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuota",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuota");
					break;

				case CuotaConstantesFunciones.LABEL_CAPITAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Capital",sNombreCampoCategoria,sNombreCampoCategoriaValor,"capital");
					break;

				case CuotaConstantesFunciones.LABEL_INTERES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Interes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"interes");
					break;

				case CuotaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case CuotaConstantesFunciones.LABEL_FECHALIQUIDACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Liquacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_liquidacion");
					break;

				case CuotaConstantesFunciones.LABEL_MONTOAJUSTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Ajuste",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_ajuste");
					break;

				case CuotaConstantesFunciones.LABEL_INTERESAJUSTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Interes Ajuste",sNombreCampoCategoria,sNombreCampoCategoriaValor,"interes_ajuste");
					break;

				case CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case CuotaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoCuotaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuota";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Cuotas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CuotaConstantesFunciones.LABEL_IDPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_IDPRESTAMO);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getprestamo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_IDESTADOCUOTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_IDESTADOCUOTA);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getestadocuota_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getdefiprovisionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_NUMEROCUOTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_NUMEROCUOTA);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getnumero_cuota());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_CAPITAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_CAPITAL);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getcapital());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_INTERES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_INTERES);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getinteres());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_FECHALIQUIDACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_FECHALIQUIDACION);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getfecha_liquidacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_MONTOAJUSTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_MONTOAJUSTE);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getmonto_ajuste());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_INTERESAJUSTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_INTERESAJUSTE);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getinteres_ajuste());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuotaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuotaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Cuota cuota:cuotasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuota.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelCuota(row);				
			//	iRow++;
			//}				
			
			//for(Cuota cuotaAux:cuotasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCuota(cuotaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
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
				this.cuotaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuota(false);
			
			//SI ES MANUAL
			if(CuotaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuota();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuota(false);
			
			//SI ES MANUAL
			if(CuotaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuota();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCuotaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuota(false);
			
			//SI ES MANUAL
			if(CuotaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuota();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCuota() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCuota.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCuota.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCuota.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCuota.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCuota.setMinimumSize(dimensionMinimum);
		this.jTableDatosCuota.setMaximumSize(dimensionMaximum);
		this.jTableDatosCuota.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCuota(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCuota(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCuota(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCuota(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCuota(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCuota(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuota(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCuota(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CuotaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CuotaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCuota() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCuota();
		
		this.inicializarActualizarBindingBotonesManualCuota(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCuota();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuota() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCuota(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCuota(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCuota.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCuota.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCuota.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCuota!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCuota.jCheckBoxPostAccionNuevoCuota.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCuota.jCheckBoxPostAccionSinCerrarCuota.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCuota.jCheckBoxPostAccionSinMensajeCuota.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCuota.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCuota.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCuota.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCuota!=null) {
				this.jInternalFrameDetalleFormCuota.jCheckBoxPostAccionNuevoCuota.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCuota.jCheckBoxPostAccionSinCerrarCuota.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCuota.jCheckBoxPostAccionSinMensajeCuota.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCuota.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCuota.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCuota!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCuota.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCuota!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCuota.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCuota.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCuota.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCuota.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCuota!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCuota.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCuota.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCuota(Boolean esInicializar) throws Exception {
		try	{	
			if(CuotaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCuota(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCuota() throws Exception {
		try	{
			if(CuotaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCuota();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuota() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCuota() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCuota.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCuota.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCuota.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCuota.addItem(reporte);
			}
			
			
			if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCuota.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCuota.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCuota.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCuota.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCuota.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCuota.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCuota.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuota();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuota() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuota!=null) {
				this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuota!=null) {
				this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCuota!=null) {
				
				if(this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuota.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCuota.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuota.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuota.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCuota.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCuota.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CuotaConstantesFunciones.getTiposSeleccionarCuota(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCuota.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCuota.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCuota.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CuotaConstantesFunciones.getTiposSeleccionarCuota(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCuota.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCuota.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCuota.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CuotaConstantesFunciones.getTiposSeleccionarCuota(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuota.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCuota.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCuota()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.getSelectedItem()!=null){this.id_defi_provision_empleadoFK_IdDefiProvisionEmpleado=((DefiProvisionEmpleado)this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoCuota.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.getSelectedItem()!=null){this.id_estado_cuotaFK_IdEstadoCuota=((EstadoCuota)this.jComboBoxid_estado_cuotaFK_IdEstadoCuotaCuota.getSelectedItem()).getId();}
		if(this.jComboBoxid_prestamoFK_IdPrestamoCuota.getSelectedItem()!=null){this.id_prestamoFK_IdPrestamo=((Prestamo)this.jComboBoxid_prestamoFK_IdPrestamoCuota.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCuota(Boolean esInicializar) throws Exception {				
		if(CuotaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCuota();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCuota() throws Exception {
		this.inicializarActualizarBindingTablaCuota(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCuota() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuota.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuota.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCuotaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuotaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuota.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCuota.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCuota(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cuotaLogic.getCuotas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cuotas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCuota.setModel(new CuotaModel(this.cuotaLogic.getCuotas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCuota.setModel(new CuotaModel(this.cuotas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCuota!=null && this.jInternalFrameOrderByCuota.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCuota();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CuotaConstantesFunciones.SCLASSWEBTITULO,cuotaConstantesFunciones.resaltarSeleccionarCuota,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CuotaConstantesFunciones.SCLASSWEBTITULO,cuotaConstantesFunciones.resaltarSeleccionarCuota,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_ID));

		if(this.cuotaConstantesFunciones.mostraridCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuotaConstantesFunciones.resaltaridCuota,this.cuotaConstantesFunciones.activaridCuota,iSizeTabla,this,true,"idCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltaridCuota,this.cuotaConstantesFunciones.activaridCuota,this,true,"idCuota","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_IDPRESTAMO));

		if(this.cuotaConstantesFunciones.mostrarid_prestamoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_IDPRESTAMO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PrestamoTableCell(this.prestamosForeignKey,this.cuotaConstantesFunciones.resaltarid_prestamoCuota,this,this.cuotaConstantesFunciones.activarid_prestamoCuota,iSizeTabla));
			tableColumn.setCellEditor(new PrestamoTableCell(this.prestamosForeignKey,this.cuotaConstantesFunciones.resaltarid_prestamoCuota,this,this.cuotaConstantesFunciones.activarid_prestamoCuota,true,"id_prestamoCuota","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_IDESTADOCUOTA));

		if(this.cuotaConstantesFunciones.mostrarid_estado_cuotaCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_IDESTADOCUOTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoCuotaTableCell(this.estadocuotasForeignKey,this.cuotaConstantesFunciones.resaltarid_estado_cuotaCuota,this,this.cuotaConstantesFunciones.activarid_estado_cuotaCuota,iSizeTabla));
			tableColumn.setCellEditor(new EstadoCuotaTableCell(this.estadocuotasForeignKey,this.cuotaConstantesFunciones.resaltarid_estado_cuotaCuota,this,this.cuotaConstantesFunciones.activarid_estado_cuotaCuota,true,"id_estado_cuotaCuota","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO));

		if(this.cuotaConstantesFunciones.mostrarid_defi_provision_empleadoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DefiProvisionEmpleadoTableCell(this.defiprovisionempleadosForeignKey,this.cuotaConstantesFunciones.resaltarid_defi_provision_empleadoCuota,this,this.cuotaConstantesFunciones.activarid_defi_provision_empleadoCuota,iSizeTabla));
			tableColumn.setCellEditor(new DefiProvisionEmpleadoTableCell(this.defiprovisionempleadosForeignKey,this.cuotaConstantesFunciones.resaltarid_defi_provision_empleadoCuota,this,this.cuotaConstantesFunciones.activarid_defi_provision_empleadoCuota,true,"id_defi_provision_empleadoCuota","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_NUMEROCUOTA));

		if(this.cuotaConstantesFunciones.mostrarnumero_cuotaCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_NUMEROCUOTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuotaConstantesFunciones.resaltarnumero_cuotaCuota,this.cuotaConstantesFunciones.activarnumero_cuotaCuota,iSizeTabla,this,true,"numero_cuotaCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltarnumero_cuotaCuota,this.cuotaConstantesFunciones.activarnumero_cuotaCuota,this,true,"numero_cuotaCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_CAPITAL));

		if(this.cuotaConstantesFunciones.mostrarcapitalCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_CAPITAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuotaConstantesFunciones.resaltarcapitalCuota,this.cuotaConstantesFunciones.activarcapitalCuota,iSizeTabla,this,true,"capitalCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltarcapitalCuota,this.cuotaConstantesFunciones.activarcapitalCuota,this,true,"capitalCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_INTERES));

		if(this.cuotaConstantesFunciones.mostrarinteresCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_INTERES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuotaConstantesFunciones.resaltarinteresCuota,this.cuotaConstantesFunciones.activarinteresCuota,iSizeTabla,this,true,"interesCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltarinteresCuota,this.cuotaConstantesFunciones.activarinteresCuota,this,true,"interesCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_TOTAL));

		if(this.cuotaConstantesFunciones.mostrartotalCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuotaConstantesFunciones.resaltartotalCuota,this.cuotaConstantesFunciones.activartotalCuota,iSizeTabla,this,true,"totalCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltartotalCuota,this.cuotaConstantesFunciones.activartotalCuota,this,true,"totalCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_FECHALIQUIDACION));

		if(this.cuotaConstantesFunciones.mostrarfecha_liquidacionCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_FECHALIQUIDACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuotaConstantesFunciones.resaltarfecha_liquidacionCuota,this.cuotaConstantesFunciones.activarfecha_liquidacionCuota,iSizeTabla,this,true,"fecha_liquidacionCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltarfecha_liquidacionCuota,this.cuotaConstantesFunciones.activarfecha_liquidacionCuota,this,true,"fecha_liquidacionCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_MONTOAJUSTE));

		if(this.cuotaConstantesFunciones.mostrarmonto_ajusteCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_MONTOAJUSTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuotaConstantesFunciones.resaltarmonto_ajusteCuota,this.cuotaConstantesFunciones.activarmonto_ajusteCuota,iSizeTabla,this,true,"monto_ajusteCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltarmonto_ajusteCuota,this.cuotaConstantesFunciones.activarmonto_ajusteCuota,this,true,"monto_ajusteCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_INTERESAJUSTE));

		if(this.cuotaConstantesFunciones.mostrarinteres_ajusteCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_INTERESAJUSTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuotaConstantesFunciones.resaltarinteres_ajusteCuota,this.cuotaConstantesFunciones.activarinteres_ajusteCuota,iSizeTabla,this,true,"interes_ajusteCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltarinteres_ajusteCuota,this.cuotaConstantesFunciones.activarinteres_ajusteCuota,this,true,"interes_ajusteCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.cuotaConstantesFunciones.mostrarfecha_vencimientoCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cuotaConstantesFunciones.resaltarfecha_vencimientoCuota,this.cuotaConstantesFunciones.activarfecha_vencimientoCuota,iSizeTabla,this,true,"fecha_vencimientoCuota","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cuotaConstantesFunciones.resaltarfecha_vencimientoCuota,this.cuotaConstantesFunciones.activarfecha_vencimientoCuota,this,true,"fecha_vencimientoCuota","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuota,CuotaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.cuotaConstantesFunciones.mostrardescripcionCuota && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuotaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cuotaConstantesFunciones.resaltardescripcionCuota,this.cuotaConstantesFunciones.activardescripcionCuota,iSizeTabla,this,true,"descripcionCuota","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuotaConstantesFunciones.resaltardescripcionCuota,this.cuotaConstantesFunciones.activardescripcionCuota,this,true,"descripcionCuota","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuotaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cuotaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuotaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuotaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuota.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuotaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuotaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuota.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCuota && this.isPermisoGuardarCambiosCuota) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cuotaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cuotaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCuota.addColumn(tableColumn);
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
			
			this.jTableDatosCuota.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuota && this.isPermisoGuardarCambiosCuota) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuota && this.isPermisoGuardarCambiosCuota) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCuota.moveColumn(this.jTableDatosCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCuota.moveColumn(this.jTableDatosCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCuota.moveColumn(this.jTableDatosCuota.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCuota.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCuota.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCuota,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCuota.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCuota.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCuota.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCuota.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCuota.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cuotaLogic.getCuotas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cuotas.size()-1;
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
		//this.jTableDatosCuota.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCuota.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCuota();
			
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
				
				//this.isEsNuevoCuota=false;
					
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
				if(this.cuotaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCuota==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuota.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuota.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cuota.getsType().equals("DUPLICADO")
				   || this.cuota.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCuota=true;
				
				} else {
					this.isEsNuevoCuota=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cuotaSessionBean.getEsGuardarRelacionado()) {
					if(this.cuota.getId()>=0 && !this.cuota.getIsNew()) {						
						this.isEsNuevoCuota=false;
						
					} else {
						this.isEsNuevoCuota=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCuota(esRelaciones);						
				
				this.seleccionarCuota(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cuota.getId()<0) {
					this.isEsNuevoCuota=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCuota(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCuota(evt,rowIndex);
				}	
				
				if(this.cuotaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Cuota: " + this.dDif); 
					}
				}								
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCuota(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cuota)) {
					if(this.cuota.getId()>0) {
						this.cuota.setIsDeleted(true);
						
						this.cuotasEliminados.add(this.cuota);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuotaLogic.getCuotas().remove(this.cuota);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuotas.remove(this.cuota);				
					}
					
					
					((CuotaModel) this.jTableDatosCuota.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCuota(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCuota(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCuota) {
			
			if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuota.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuota.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCuota(this.cuota);
				}
				
				//ARCHITECTURE
				try {
					

					//Prestamo
					if(!this.cuotaConstantesFunciones.cargarid_prestamoCuota || this.cuotaConstantesFunciones.event_dependid_prestamoCuota) {
						//this.cargarCombosPrestamosForeignKeyLista(" where id="+this.cuota.getid_prestamo());
									//this.inicializarActualizarBindingCuota(false,false);
						this.prestamosForeignKey=new ArrayList<Prestamo>();

						if(cuota.getPrestamo()!=null) {
							this.prestamosForeignKey.add(cuota.getPrestamo());
						}

						this.addItemDefectoCombosForeignKeyPrestamo();
						this.cargarCombosFramePrestamosForeignKey("Todos");
					}
					this.setActualPrestamoForeignKey(this.cuota.getid_prestamo(),false,"Formulario");

					//EstadoCuota
					if(!this.cuotaConstantesFunciones.cargarid_estado_cuotaCuota || this.cuotaConstantesFunciones.event_dependid_estado_cuotaCuota) {
						//this.cargarCombosEstadoCuotasForeignKeyLista(" where id="+this.cuota.getid_estado_cuota());
									//this.inicializarActualizarBindingCuota(false,false);
						this.estadocuotasForeignKey=new ArrayList<EstadoCuota>();

						if(cuota.getEstadoCuota()!=null) {
							this.estadocuotasForeignKey.add(cuota.getEstadoCuota());
						}

						this.addItemDefectoCombosForeignKeyEstadoCuota();
						this.cargarCombosFrameEstadoCuotasForeignKey("Todos");
					}
					this.setActualEstadoCuotaForeignKey(this.cuota.getid_estado_cuota(),false,"Formulario");

					//DefiProvisionEmpleado
					if(!this.cuotaConstantesFunciones.cargarid_defi_provision_empleadoCuota || this.cuotaConstantesFunciones.event_dependid_defi_provision_empleadoCuota) {
						//this.cargarCombosDefiProvisionEmpleadosForeignKeyLista(" where id="+this.cuota.getid_defi_provision_empleado());
									//this.inicializarActualizarBindingCuota(false,false);
						this.defiprovisionempleadosForeignKey=new ArrayList<DefiProvisionEmpleado>();

						if(cuota.getDefiProvisionEmpleado()!=null) {
							this.defiprovisionempleadosForeignKey.add(cuota.getDefiProvisionEmpleado());
						}

						this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
						this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Todos");
					}
					this.setActualDefiProvisionEmpleadoForeignKey(this.cuota.getid_defi_provision_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCuota("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCuota(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuota() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuota(Cuota cuota) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCuota(cuota,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuota(Cuota cuota,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCuota(cuota);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCuota(cuota,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCuota(cuota);
	}
	
	public void setVariablesObjetoActualToFormularioCuota(Cuota cuota) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCuota.jLabelidCuota.setText(cuota.getId().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldnumero_cuotaCuota.setText(cuota.getnumero_cuota().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldcapitalCuota.setText(cuota.getcapital().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldinteresCuota.setText(cuota.getinteres().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldtotalCuota.setText(cuota.gettotal().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldfecha_liquidacionCuota.setText(cuota.getfecha_liquidacion().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldmonto_ajusteCuota.setText(cuota.getmonto_ajuste().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldinteres_ajusteCuota.setText(cuota.getinteres_ajuste().toString());
			this.jInternalFrameDetalleFormCuota.jDateChooserfecha_vencimientoCuota.setDate(cuota.getfecha_vencimiento());
			this.jInternalFrameDetalleFormCuota.jTextAreadescripcionCuota.setText(cuota.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Cuota cuotaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cuotaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Cuota cuotaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cuotaLocal=this.cuota;
			} else {
				cuotaLocal=this.cuotaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cuotaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCuota(cuotaLocal,true);
					
					if(cuotaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cuotaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cuotaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCuota(Cuota cuota,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuota(cuota,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCuota(cuota);
	}
	
	public void setVariablesFormularioToObjetoActualCuota(Cuota cuota,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuota(cuota,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCuota(Cuota cuota,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCuota.jLabelidCuota.getText()==null || this.jInternalFrameDetalleFormCuota.jLabelidCuota.getText()=="" || this.jInternalFrameDetalleFormCuota.jLabelidCuota.getText()=="Id") {
				this.jInternalFrameDetalleFormCuota.jLabelidCuota.setText("0");
			}

			if(conColumnasBase) {cuota.setId(Long.parseLong(this.jInternalFrameDetalleFormCuota.jLabelidCuota.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelIdCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.setnumero_cuota(Integer.parseInt(this.jInternalFrameDetalleFormCuota.jTextFieldnumero_cuotaCuota.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_NUMEROCUOTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelnumero_cuotaCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.setcapital(Double.parseDouble(this.jInternalFrameDetalleFormCuota.jTextFieldcapitalCuota.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_CAPITAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelcapitalCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.setinteres(Double.parseDouble(this.jInternalFrameDetalleFormCuota.jTextFieldinteresCuota.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_INTERES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelinteresCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.settotal(Double.parseDouble(this.jInternalFrameDetalleFormCuota.jTextFieldtotalCuota.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabeltotalCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.setfecha_liquidacion(Double.parseDouble(this.jInternalFrameDetalleFormCuota.jTextFieldfecha_liquidacionCuota.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_FECHALIQUIDACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelfecha_liquidacionCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.setmonto_ajuste(Double.parseDouble(this.jInternalFrameDetalleFormCuota.jTextFieldmonto_ajusteCuota.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_MONTOAJUSTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelmonto_ajusteCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.setinteres_ajuste(Double.parseDouble(this.jInternalFrameDetalleFormCuota.jTextFieldinteres_ajusteCuota.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_INTERESAJUSTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelinteres_ajusteCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.setfecha_vencimiento(this.jInternalFrameDetalleFormCuota.jDateChooserfecha_vencimientoCuota.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabelfecha_vencimientoCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuota.setdescripcion(this.jInternalFrameDetalleFormCuota.jTextAreadescripcionCuota.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuotaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuota.jLabeldescripcionCuota,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuota(Cuota cuotaBean,Cuota cuota,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cuotaBean.getid_prestamo()!=null && !cuotaBean.getid_prestamo().equals(-1L))) {cuota.setid_prestamo(cuotaBean.getid_prestamo());}
			if(conDefault || (!conDefault && cuotaBean.getid_estado_cuota()!=null && !cuotaBean.getid_estado_cuota().equals(-1L))) {cuota.setid_estado_cuota(cuotaBean.getid_estado_cuota());}
			if(conDefault || (!conDefault && cuotaBean.getid_defi_provision_empleado()!=null && !cuotaBean.getid_defi_provision_empleado().equals(-1L))) {cuota.setid_defi_provision_empleado(cuotaBean.getid_defi_provision_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCuota(Cuota cuotaOrigen,Cuota cuota,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuotaOrigen.getId()!=null && !cuotaOrigen.getId().equals(0L))) {cuota.setId(cuotaOrigen.getId());}}
			if(conDefault || (!conDefault && cuotaOrigen.getid_prestamo()!=null && !cuotaOrigen.getid_prestamo().equals(-1L))) {cuota.setid_prestamo(cuotaOrigen.getid_prestamo());}
			if(conDefault || (!conDefault && cuotaOrigen.getid_estado_cuota()!=null && !cuotaOrigen.getid_estado_cuota().equals(-1L))) {cuota.setid_estado_cuota(cuotaOrigen.getid_estado_cuota());}
			if(conDefault || (!conDefault && cuotaOrigen.getid_defi_provision_empleado()!=null && !cuotaOrigen.getid_defi_provision_empleado().equals(-1L))) {cuota.setid_defi_provision_empleado(cuotaOrigen.getid_defi_provision_empleado());}
			if(conDefault || (!conDefault && cuotaOrigen.getnumero_cuota()!=null && !cuotaOrigen.getnumero_cuota().equals(0))) {cuota.setnumero_cuota(cuotaOrigen.getnumero_cuota());}
			if(conDefault || (!conDefault && cuotaOrigen.getcapital()!=null && !cuotaOrigen.getcapital().equals(0.0))) {cuota.setcapital(cuotaOrigen.getcapital());}
			if(conDefault || (!conDefault && cuotaOrigen.getinteres()!=null && !cuotaOrigen.getinteres().equals(0.0))) {cuota.setinteres(cuotaOrigen.getinteres());}
			if(conDefault || (!conDefault && cuotaOrigen.gettotal()!=null && !cuotaOrigen.gettotal().equals(0.0))) {cuota.settotal(cuotaOrigen.gettotal());}
			if(conDefault || (!conDefault && cuotaOrigen.getfecha_liquidacion()!=null && !cuotaOrigen.getfecha_liquidacion().equals(0.0))) {cuota.setfecha_liquidacion(cuotaOrigen.getfecha_liquidacion());}
			if(conDefault || (!conDefault && cuotaOrigen.getmonto_ajuste()!=null && !cuotaOrigen.getmonto_ajuste().equals(0.0))) {cuota.setmonto_ajuste(cuotaOrigen.getmonto_ajuste());}
			if(conDefault || (!conDefault && cuotaOrigen.getinteres_ajuste()!=null && !cuotaOrigen.getinteres_ajuste().equals(0.0))) {cuota.setinteres_ajuste(cuotaOrigen.getinteres_ajuste());}
			if(conDefault || (!conDefault && cuotaOrigen.getfecha_vencimiento()!=null && !cuotaOrigen.getfecha_vencimiento().equals(new Date()))) {cuota.setfecha_vencimiento(cuotaOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && cuotaOrigen.getdescripcion()!=null && !cuotaOrigen.getdescripcion().equals(""))) {cuota.setdescripcion(cuotaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuota(Cuota cuota) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuota.jLabelidCuota.setText(cuota.getId().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldnumero_cuotaCuota.setText(cuota.getnumero_cuota().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldcapitalCuota.setText(cuota.getcapital().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldinteresCuota.setText(cuota.getinteres().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldtotalCuota.setText(cuota.gettotal().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldfecha_liquidacionCuota.setText(cuota.getfecha_liquidacion().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldmonto_ajusteCuota.setText(cuota.getmonto_ajuste().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldinteres_ajusteCuota.setText(cuota.getinteres_ajuste().toString());
			this.jInternalFrameDetalleFormCuota.jDateChooserfecha_vencimientoCuota.setDate(cuota.getfecha_vencimiento());
			this.jInternalFrameDetalleFormCuota.jTextAreadescripcionCuota.setText(cuota.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuota(CuotaBean cuotaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuota.jLabelidCuota.setText(cuotaBean.getId().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldnumero_cuotaCuota.setText(cuotaBean.getnumero_cuota().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldcapitalCuota.setText(cuotaBean.getcapital().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldinteresCuota.setText(cuotaBean.getinteres().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldtotalCuota.setText(cuotaBean.gettotal().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldfecha_liquidacionCuota.setText(cuotaBean.getfecha_liquidacion().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldmonto_ajusteCuota.setText(cuotaBean.getmonto_ajuste().toString());
			this.jInternalFrameDetalleFormCuota.jTextFieldinteres_ajusteCuota.setText(cuotaBean.getinteres_ajuste().toString());
			this.jInternalFrameDetalleFormCuota.jDateChooserfecha_vencimientoCuota.setDate(cuotaBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormCuota.jTextAreadescripcionCuota.setText(cuotaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCuota(CuotaParameterReturnGeneral cuotaReturnGeneral,CuotaBean cuotaBean,Boolean conDefault) throws Exception { 
		try {
			Cuota cuotaLocal=new Cuota();
			
			cuotaLocal=cuotaReturnGeneral.getCuota();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuotaLocal.getId()!=null && !cuotaLocal.getId().equals(0L))) {cuotaBean.setId(cuotaLocal.getId());}}
			if(conDefault || (!conDefault && cuotaLocal.getid_prestamo()!=null && !cuotaLocal.getid_prestamo().equals(-1L))) {cuotaBean.setid_prestamo(cuotaLocal.getid_prestamo());}
			if(conDefault || (!conDefault && cuotaLocal.getid_estado_cuota()!=null && !cuotaLocal.getid_estado_cuota().equals(-1L))) {cuotaBean.setid_estado_cuota(cuotaLocal.getid_estado_cuota());}
			if(conDefault || (!conDefault && cuotaLocal.getid_defi_provision_empleado()!=null && !cuotaLocal.getid_defi_provision_empleado().equals(-1L))) {cuotaBean.setid_defi_provision_empleado(cuotaLocal.getid_defi_provision_empleado());}
			if(conDefault || (!conDefault && cuotaLocal.getnumero_cuota()!=null && !cuotaLocal.getnumero_cuota().equals(0))) {cuotaBean.setnumero_cuota(cuotaLocal.getnumero_cuota());}
			if(conDefault || (!conDefault && cuotaLocal.getcapital()!=null && !cuotaLocal.getcapital().equals(0.0))) {cuotaBean.setcapital(cuotaLocal.getcapital());}
			if(conDefault || (!conDefault && cuotaLocal.getinteres()!=null && !cuotaLocal.getinteres().equals(0.0))) {cuotaBean.setinteres(cuotaLocal.getinteres());}
			if(conDefault || (!conDefault && cuotaLocal.gettotal()!=null && !cuotaLocal.gettotal().equals(0.0))) {cuotaBean.settotal(cuotaLocal.gettotal());}
			if(conDefault || (!conDefault && cuotaLocal.getfecha_liquidacion()!=null && !cuotaLocal.getfecha_liquidacion().equals(0.0))) {cuotaBean.setfecha_liquidacion(cuotaLocal.getfecha_liquidacion());}
			if(conDefault || (!conDefault && cuotaLocal.getmonto_ajuste()!=null && !cuotaLocal.getmonto_ajuste().equals(0.0))) {cuotaBean.setmonto_ajuste(cuotaLocal.getmonto_ajuste());}
			if(conDefault || (!conDefault && cuotaLocal.getinteres_ajuste()!=null && !cuotaLocal.getinteres_ajuste().equals(0.0))) {cuotaBean.setinteres_ajuste(cuotaLocal.getinteres_ajuste());}
			if(conDefault || (!conDefault && cuotaLocal.getfecha_vencimiento()!=null && !cuotaLocal.getfecha_vencimiento().equals(new Date()))) {cuotaBean.setfecha_vencimiento(cuotaLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && cuotaLocal.getdescripcion()!=null && !cuotaLocal.getdescripcion().equals(""))) {cuotaBean.setdescripcion(cuotaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCuotaGenerico(Long idCuotaSeleccionado,JComboBox jComboBoxCuota,List<Cuota> cuotasLocal)throws Exception {
		try {
			Cuota  cuotaTemp=null;

			for(Cuota cuotaAux:cuotasLocal) {
				if(cuotaAux.getId()!=null && cuotaAux.getId().equals(idCuotaSeleccionado)) {
					cuotaTemp=cuotaAux;
					break;
				}
			}

			jComboBoxCuota.setSelectedItem(cuotaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCuotaGenerico(JComboBox jComboBoxCuota,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuota.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCuota.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuota.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCuota.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuota=(Cuota) cuotaLogic.getCuotas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuota =(Cuota) cuotas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Prestamo")) {
			//sDescripcion=this.getActualPrestamoForeignKeyDescripcion((Long)value);
			if(!cuota.getIsNew() && !cuota.getIsChanged() && !cuota.getIsDeleted()) {
				sDescripcion=cuota.getprestamo_descripcion();
			} else {
				//sDescripcion=this.getActualPrestamoForeignKeyDescripcion((Long)value);
				sDescripcion=cuota.getprestamo_descripcion();
			}
		}

		if(sTipo.equals("EstadoCuota")) {
			//sDescripcion=this.getActualEstadoCuotaForeignKeyDescripcion((Long)value);
			if(!cuota.getIsNew() && !cuota.getIsChanged() && !cuota.getIsDeleted()) {
				sDescripcion=cuota.getestadocuota_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoCuotaForeignKeyDescripcion((Long)value);
				sDescripcion=cuota.getestadocuota_descripcion();
			}
		}

		if(sTipo.equals("DefiProvisionEmpleado")) {
			//sDescripcion=this.getActualDefiProvisionEmpleadoForeignKeyDescripcion((Long)value);
			if(!cuota.getIsNew() && !cuota.getIsChanged() && !cuota.getIsDeleted()) {
				sDescripcion=cuota.getdefiprovisionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualDefiProvisionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=cuota.getdefiprovisionempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Cuota cuotaRow=new Cuota();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuotaRow=(Cuota) cuotaLogic.getCuotas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuotaRow=(Cuota) cuotas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCuota(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCuota.setVisible((this.isVisibilidadCeldaNuevoCuota && this.isPermisoNuevoCuota));			
			this.jButtonDuplicarCuota.setVisible((this.isVisibilidadCeldaDuplicarCuota && this.isPermisoDuplicarCuota));			
			this.jButtonCopiarCuota.setVisible((this.isVisibilidadCeldaCopiarCuota && this.isPermisoCopiarCuota));
			this.jButtonVerFormCuota.setVisible((this.isVisibilidadCeldaVerFormCuota && this.isPermisoVerFormCuota));
			
			this.jButtonAbrirOrderByCuota.setVisible((this.isVisibilidadCeldaOrdenCuota && this.isPermisoOrdenCuota));			
			
			this.jButtonNuevoRelacionesCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuota && this.isPermisoNuevoCuota));			
			this.jButtonNuevoGuardarCambiosCuota.setVisible((this.isVisibilidadCeldaNuevoCuota && this.isPermisoNuevoCuota && this.isPermisoGuardarCambiosCuota));
			
			if(this.jInternalFrameDetalleFormCuota!=null) {
			this.jInternalFrameDetalleFormCuota.jButtonModificarCuota.setVisible((this.isVisibilidadCeldaModificarCuota && this.isPermisoActualizarCuota));	
			this.jInternalFrameDetalleFormCuota.jButtonActualizarCuota.setVisible((this.isVisibilidadCeldaActualizarCuota && this.isPermisoActualizarCuota));	
			this.jInternalFrameDetalleFormCuota.jButtonEliminarCuota.setVisible((this.isVisibilidadCeldaEliminarCuota && this.isPermisoEliminarCuota));
			this.jInternalFrameDetalleFormCuota.jButtonCancelarCuota.setVisible(this.isVisibilidadCeldaCancelarCuota);							
			this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosCuota.setVisible((this.isVisibilidadCeldaGuardarCuota && this.isPermisoGuardarCambiosCuota));			
			
			}
						
			this.jButtonGuardarCambiosTablaCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosCuota && this.isPermisoGuardarCambiosCuota));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCuota.setVisible((this.isVisibilidadCeldaNuevoCuota && this.isPermisoNuevoCuota));						
			this.jButtonDuplicarToolBarCuota.setVisible((this.isVisibilidadCeldaDuplicarCuota && this.isPermisoDuplicarCuota));						
			this.jButtonCopiarToolBarCuota.setVisible((this.isVisibilidadCeldaCopiarCuota && this.isPermisoCopiarCuota));			
			this.jButtonVerFormToolBarCuota.setVisible((this.isVisibilidadCeldaVerFormCuota && this.isPermisoVerFormCuota));			
			this.jButtonAbrirOrderByToolBarCuota.setVisible((this.isVisibilidadCeldaOrdenCuota && this.isPermisoOrdenCuota));
			this.jButtonNuevoRelacionesToolBarCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuota && this.isPermisoNuevoCuota));			
			this.jButtonNuevoGuardarCambiosToolBarCuota.setVisible((this.isVisibilidadCeldaNuevoCuota && this.isPermisoNuevoCuota && this.isPermisoGuardarCambiosCuota));			
			
			if(this.jInternalFrameDetalleFormCuota!=null) {
			this.jInternalFrameDetalleFormCuota.jButtonModificarToolBarCuota.setVisible((this.isVisibilidadCeldaModificarCuota && this.isPermisoActualizarCuota));	
			this.jInternalFrameDetalleFormCuota.jButtonActualizarToolBarCuota.setVisible((this.isVisibilidadCeldaActualizarCuota  && this.isPermisoActualizarCuota));	
			this.jInternalFrameDetalleFormCuota.jButtonEliminarToolBarCuota.setVisible((this.isVisibilidadCeldaEliminarCuota && this.isPermisoEliminarCuota));
			this.jInternalFrameDetalleFormCuota.jButtonCancelarToolBarCuota.setVisible(this.isVisibilidadCeldaCancelarCuota);				
			this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosToolBarCuota.setVisible((this.isVisibilidadCeldaGuardarCuota && this.isPermisoGuardarCambiosCuota));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosCuota && this.isPermisoGuardarCambiosCuota));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCuota.setVisible((this.isVisibilidadCeldaNuevoCuota && this.isPermisoNuevoCuota));			
			this.jMenuItemDuplicarCuota.setVisible((this.isVisibilidadCeldaDuplicarCuota && this.isPermisoDuplicarCuota));			
			this.jMenuItemCopiarCuota.setVisible((this.isVisibilidadCeldaCopiarCuota && this.isPermisoCopiarCuota));			
			this.jMenuItemVerFormCuota.setVisible((this.isVisibilidadCeldaVerFormCuota && this.isPermisoVerFormCuota));			
			this.jMenuItemAbrirOrderByCuota.setVisible((this.isVisibilidadCeldaOrdenCuota && this.isPermisoOrdenCuota));			
			//this.jMenuItemMostrarOcultarCuota.setVisible((this.isVisibilidadCeldaOrdenCuota && this.isPermisoOrdenCuota));
			this.jMenuItemDetalleAbrirOrderByCuota.setVisible((this.isVisibilidadCeldaOrdenCuota && this.isPermisoOrdenCuota));			
			//this.jMenuItemDetalleMostrarOcultarCuota.setVisible((this.isVisibilidadCeldaOrdenCuota && this.isPermisoOrdenCuota));			
			this.jMenuItemNuevoRelacionesCuota.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuota && this.isPermisoNuevoCuota));			
			this.jMenuItemNuevoGuardarCambiosCuota.setVisible((this.isVisibilidadCeldaNuevoCuota && this.isPermisoNuevoCuota && this.isPermisoGuardarCambiosCuota));									
			
			if(this.jInternalFrameDetalleFormCuota!=null) {
			this.jInternalFrameDetalleFormCuota.jMenuItemModificarCuota.setVisible((this.isVisibilidadCeldaModificarCuota && this.isPermisoActualizarCuota));	
			this.jInternalFrameDetalleFormCuota.jMenuItemActualizarCuota.setVisible((this.isVisibilidadCeldaActualizarCuota && this.isPermisoActualizarCuota));	
			this.jInternalFrameDetalleFormCuota.jMenuItemEliminarCuota.setVisible((this.isVisibilidadCeldaEliminarCuota && this.isPermisoEliminarCuota));
			this.jInternalFrameDetalleFormCuota.jMenuItemCancelarCuota.setVisible(this.isVisibilidadCeldaCancelarCuota);				
			}
			
			this.jMenuItemGuardarCambiosCuota.setVisible((this.isVisibilidadCeldaGuardarCuota && this.isPermisoGuardarCambiosCuota));						
			this.jMenuItemGuardarCambiosTablaCuota.setVisible((this.isVisibilidadCeldaGuardarCambiosCuota && this.isPermisoGuardarCambiosCuota));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCuota=this.jButtonNuevoCuota.isVisible();
			this.isVisibilidadCeldaDuplicarCuota=this.jButtonDuplicarCuota.isVisible();
			this.isVisibilidadCeldaCopiarCuota=this.jButtonCopiarCuota.isVisible();
			this.isVisibilidadCeldaVerFormCuota=this.jButtonVerFormCuota.isVisible();
			
			this.isVisibilidadCeldaOrdenCuota=this.jButtonAbrirOrderByCuota.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCuota=this.jButtonNuevoRelacionesCuota.isVisible();
			this.isVisibilidadCeldaModificarCuota=this.jButtonModificarCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormCuota!=null) {
			this.isVisibilidadCeldaActualizarCuota=this.jInternalFrameDetalleFormCuota.jButtonActualizarCuota.isVisible();
			this.isVisibilidadCeldaEliminarCuota=this.jInternalFrameDetalleFormCuota.jButtonEliminarCuota.isVisible();
			this.isVisibilidadCeldaCancelarCuota=this.jInternalFrameDetalleFormCuota.jButtonCancelarCuota.isVisible();
			this.isVisibilidadCeldaGuardarCuota=this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosCuota.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCuota=this.jButtonGuardarCambiosTablaCuota.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCuota=this.jButtonNuevoToolBarCuota.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuota=this.jButtonNuevoRelacionesToolBarCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormCuota!=null) {
			this.isVisibilidadCeldaModificarCuota=this.jInternalFrameDetalleFormCuota.jButtonModificarToolBarCuota.isVisible();
			this.isVisibilidadCeldaActualizarCuota=this.jInternalFrameDetalleFormCuota.jButtonActualizarToolBarCuota.isVisible();
			this.isVisibilidadCeldaEliminarCuota=this.jInternalFrameDetalleFormCuota.jButtonEliminarToolBarCuota.isVisible();
			this.isVisibilidadCeldaCancelarCuota=this.jInternalFrameDetalleFormCuota.jButtonCancelarToolBarCuota.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuota=this.jButtonGuardarCambiosToolBarCuota.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuota=this.jButtonGuardarCambiosTablaToolBarCuota.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCuota=this.jMenuItemNuevoCuota.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuota=this.jMenuItemNuevoRelacionesCuota.isVisible();
			
			if(this.jInternalFrameDetalleFormCuota!=null) {
			this.isVisibilidadCeldaModificarCuota=this.jInternalFrameDetalleFormCuota.jMenuItemModificarCuota.isVisible();
			this.isVisibilidadCeldaActualizarCuota=this.jInternalFrameDetalleFormCuota.jMenuItemActualizarCuota.isVisible();
			this.isVisibilidadCeldaEliminarCuota=this.jInternalFrameDetalleFormCuota.jMenuItemEliminarCuota.isVisible();
			this.isVisibilidadCeldaCancelarCuota=this.jInternalFrameDetalleFormCuota.jMenuItemCancelarCuota.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuota=this.jMenuItemGuardarCambiosCuota.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuota=this.jMenuItemGuardarCambiosTablaCuota.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCuota(Boolean esInicializar) {
		if(CuotaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cuotaSessionBean.getConGuardarRelaciones()) {
				//if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCuota();
			}
			
			this.inicializarActualizarBindingBotonesManualCuota(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCuota() {
		this.jButtonNuevoCuota.setVisible(this.isPermisoNuevoCuota);			
		this.jButtonDuplicarCuota.setVisible(this.isPermisoDuplicarCuota);			
		this.jButtonCopiarCuota.setVisible(this.isPermisoCopiarCuota);			
		this.jButtonVerFormCuota.setVisible(this.isPermisoVerFormCuota);			
		
		this.jButtonAbrirOrderByCuota.setVisible(this.isPermisoOrdenCuota);					
		
		this.jButtonNuevoRelacionesCuota.setVisible(this.isPermisoNuevoCuota);			
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonModificarCuota.setVisible(this.isPermisoActualizarCuota);	
			this.jInternalFrameDetalleFormCuota.jButtonActualizarCuota.setVisible(this.isPermisoActualizarCuota);	
			this.jInternalFrameDetalleFormCuota.jButtonEliminarCuota.setVisible(this.isPermisoEliminarCuota);
			this.jInternalFrameDetalleFormCuota.jButtonCancelarCuota.setVisible(this.isVisibilidadCeldaCancelarCuota);						
			this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosCuota.setVisible(this.isPermisoGuardarCambiosCuota);							
		}
		
		this.jButtonGuardarCambiosTablaCuota.setVisible(this.isPermisoActualizarCuota);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCuota() {
		this.jInternalFrameDetalleFormCuota.jButtonModificarCuota.setVisible(this.isPermisoActualizarCuota);	
		this.jInternalFrameDetalleFormCuota.jButtonActualizarCuota.setVisible(this.isPermisoActualizarCuota);	
		this.jInternalFrameDetalleFormCuota.jButtonEliminarCuota.setVisible(this.isPermisoEliminarCuota);
		this.jInternalFrameDetalleFormCuota.jButtonCancelarCuota.setVisible(this.isVisibilidadCeldaCancelarCuota);							
		this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosCuota.setVisible((this.isVisibilidadCeldaGuardarCuota && this.isPermisoGuardarCambiosCuota));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCuota() {
		if(CuotaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCuota();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCuota() {
	}
	
	public void jTableDatosCuotaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCuota(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cuota.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_prestamoCuotaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprestamo=true;

			idTienePermisoprestamo=this.tienePermisosUsuarioEnPaginaWebCuota(PrestamoConstantesFunciones.CLASSNAME);

			if(idTienePermisoprestamo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuota.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuota.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);

				this.prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.prestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.prestamoBeanSwingJInternalFrame.getPrestamoLogic().setConnexion(this.cuotaLogic.getConnexion());

				if(this.cuota.getid_prestamo()!=null) {
					this.prestamoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.prestamoBeanSwingJInternalFrame.setIdActual(this.cuota.getid_prestamo());
					this.prestamoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.prestamoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo();
				}

				JInternalFrameBase jinternalFrame =this.prestamoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuota=(TitledBorder)this.jScrollPanelDatosCuota.getBorder();
				TitledBorder titledBorderprestamo=(TitledBorder)this.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.getBorder();

				titledBorderprestamo.setTitle(titledBorderCuota.getTitle() + " -> Prestamo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_prestamoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getid_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_prestamo = "+this.cuota.getid_prestamo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_cuotaCuotaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadocuota=true;

			idTienePermisoestadocuota=this.tienePermisosUsuarioEnPaginaWebCuota(EstadoCuotaConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadocuota) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuota.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuota.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);

				this.estadocuotaBeanSwingJInternalFrame=new EstadoCuotaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadocuotaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadocuotaBeanSwingJInternalFrame.getEstadoCuotaLogic().setConnexion(this.cuotaLogic.getConnexion());

				if(this.cuota.getid_estado_cuota()!=null) {
					this.estadocuotaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadocuotaBeanSwingJInternalFrame.setIdActual(this.cuota.getid_estado_cuota());
					this.estadocuotaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadocuotaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadocuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoCuota();
				}

				JInternalFrameBase jinternalFrame =this.estadocuotaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuota=(TitledBorder)this.jScrollPanelDatosCuota.getBorder();
				TitledBorder titledBorderestadocuota=(TitledBorder)this.estadocuotaBeanSwingJInternalFrame.jScrollPanelDatosEstadoCuota.getBorder();

				titledBorderestadocuota.setTitle(titledBorderCuota.getTitle() + " -> Estado Cuota");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_cuotaCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getid_estado_cuota()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_cuota = "+this.cuota.getid_estado_cuota().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_defi_provision_empleadoCuotaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodefiprovisionempleado=true;

			idTienePermisodefiprovisionempleado=this.tienePermisosUsuarioEnPaginaWebCuota(DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisodefiprovisionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuota.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuota.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);

				this.defiprovisionempleadoBeanSwingJInternalFrame=new DefiProvisionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.defiprovisionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.defiprovisionempleadoBeanSwingJInternalFrame.getDefiProvisionEmpleadoLogic().setConnexion(this.cuotaLogic.getConnexion());

				if(this.cuota.getid_defi_provision_empleado()!=null) {
					this.defiprovisionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.defiprovisionempleadoBeanSwingJInternalFrame.setIdActual(this.cuota.getid_defi_provision_empleado());
					this.defiprovisionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.defiprovisionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.defiprovisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefiProvisionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.defiprovisionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuota=(TitledBorder)this.jScrollPanelDatosCuota.getBorder();
				TitledBorder titledBorderdefiprovisionempleado=(TitledBorder)this.defiprovisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosDefiProvisionEmpleado.getBorder();

				titledBorderdefiprovisionempleado.setTitle(titledBorderCuota.getTitle() + " -> Defi Provision Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_defi_provision_empleadoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getid_defi_provision_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_defi_provision_empleado = "+this.cuota.getid_defi_provision_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuotaCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getnumero_cuota()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuota = "+this.cuota.getnumero_cuota().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncapitalCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getcapital()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where capital = "+this.cuota.getcapital().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoninteresCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getinteres()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where interes = "+this.cuota.getinteres().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.cuota.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_liquidacionCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getfecha_liquidacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_liquidacion = "+this.cuota.getfecha_liquidacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_ajusteCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getmonto_ajuste()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_ajuste = "+this.cuota.getmonto_ajuste().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoninteres_ajusteCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getinteres_ajuste()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where interes_ajuste = "+this.cuota.getinteres_ajuste().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.cuota.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCuotaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuota.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuota(this.getcuota(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuota==null) {
						this.cuota = new Cuota();
					}

					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);
				}

				if(this.cuota.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.cuota.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuota(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdDefiProvisionEmpleadoCuotaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuota(false,false);

			this.getCuotasFK_IdDefiProvisionEmpleado();

			this.inicializarActualizarBindingCuota(false);

			//if(CuotaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuota(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoCuotaCuotaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuota(false,false);

			this.getCuotasFK_IdEstadoCuota();

			this.inicializarActualizarBindingCuota(false);

			//if(CuotaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuota(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPrestamoCuotaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuota(false,false);

			this.getCuotasFK_IdPrestamo();

			this.inicializarActualizarBindingCuota(false);

			//if(CuotaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuota(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuotaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCuota() {
		if(this.jInternalFrameDetalleFormCuota!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCuota!=null) {
			this.jInternalFrameDetalleFormCuota.setVisible(false);	    			
			this.jInternalFrameDetalleFormCuota.dispose();
			this.jInternalFrameDetalleFormCuota=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCuota!=null) {
			this.jInternalFrameReporteDinamicoCuota.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCuota.dispose();
			this.jInternalFrameReporteDinamicoCuota=null;
		}
		
		if(this.jInternalFrameImportacionCuota!=null) {
			this.jInternalFrameImportacionCuota.setVisible(false);	    			
			this.jInternalFrameImportacionCuota.dispose();
			this.jInternalFrameImportacionCuota=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCuota();
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
			
			if(sTipo.equals("NuevoCuota")) {
				jButtonNuevoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCuota")) {
				jButtonDuplicarCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCuota")) {
				jButtonCopiarCuotaActionPerformed(evt);
			} else if(sTipo.equals("VerFormCuota")) {
				jButtonVerFormCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCuota")) {
				jButtonNuevoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCuota")) {
				jButtonDuplicarCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCuota")) {
				jButtonNuevoCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCuota")) {
				jButtonDuplicarCuotaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCuota")) {
				jButtonNuevoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCuota")) {
				jButtonNuevoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCuota")) {
				jButtonNuevoCuotaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCuota")) {
				jButtonModificarCuotaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCuota")) {
				jButtonModificarCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCuota")) {
				jButtonModificarCuotaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCuota")) {
				jButtonActualizarCuotaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCuota")) {
				jButtonActualizarCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCuota")) {
				jButtonActualizarCuotaActionPerformed(evt);
			} else if(sTipo.equals("EliminarCuota")) {
				jButtonEliminarCuotaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCuota")) {
				jButtonEliminarCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCuota")) {
				jButtonEliminarCuotaActionPerformed(evt);
			} else if(sTipo.equals("CancelarCuota")) {
				jButtonCancelarCuotaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCuota")) {
				jButtonCancelarCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCuota")) {
				jButtonCancelarCuotaActionPerformed(evt);
			} else if(sTipo.equals("CerrarCuota")) {
				jButtonCerrarCuotaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCuota")) {
				jButtonCerrarCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCuota")) {
				jButtonCerrarCuotaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCuota")) {
				jButtonMostrarOcultarCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCuota")) {
				jButtonCancelarCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCuota")) {
				jButtonGuardarCambiosCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCuota")) {
				jButtonGuardarCambiosCuotaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCuota")) {
				jButtonCopiarCuotaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCuota")) {
				jButtonVerFormCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCuota")) {
				jButtonGuardarCambiosCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCuota")) {
				jButtonCopiarCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCuota")) {
				jButtonVerFormCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCuota")) {
				jButtonGuardarCambiosCuotaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCuota")) {
				jButtonGuardarCambiosCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCuota")) {
				jButtonGuardarCambiosCuotaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCuota")) {
				jButtonRecargarInformacionCuotaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCuota")) {
				jButtonRecargarInformacionCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCuota")) {
				jButtonRecargarInformacionCuotaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCuota")) {
				jButtonAnterioresCuotaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCuota")) {
				jButtonAnterioresCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCuota")) {
				jButtonAnterioresCuotaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCuota")) {
				jButtonSiguientesCuotaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCuota")) {
				jButtonSiguientesCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCuota")) {
				jButtonSiguientesCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCuota") || sTipo.equals("MenuItemDetalleAbrirOrderByCuota")) {
				jButtonAbrirOrderByCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCuota") || sTipo.equals("MenuItemDetalleMostrarOcultarCuota")) {
				jButtonMostrarOcultarCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCuota")) {
				jButtonNuevoGuardarCambiosCuotaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCuota")) {
				jButtonNuevoGuardarCambiosCuotaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCuota")) {
				jButtonNuevoGuardarCambiosCuotaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCuota")) {
				jButtonCerrarReporteDinamicoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCuota")) {
				jButtonGenerarReporteDinamicoCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCuota")) {
				
				jButtonGenerarExcelReporteDinamicoCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCuota")) {
				jButtonCerrarImportacionCuotaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCuota")) {
				
				jButtonGenerarImportacionCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCuota")) {
				
				jButtonAbrirImportacionCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCuota")) {
				jComboBoxTiposAccionesCuotaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCuota")) {
				jComboBoxTiposRelacionesCuotaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCuota")) {
				jComboBoxTiposAccionesCuotaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCuota")) {
				
				jComboBoxTiposSeleccionarCuotaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCuota")) {
				jTextFieldValorCampoGeneralCuotaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCuota")) {
				jButtonAbrirOrderByCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCuota")) {
				jButtonAbrirOrderByCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCuota")) {
				jButtonCerrarOrderByCuotaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuotaBusqueda")) {
				this.jButtonidCuotaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_prestamoCuotaUpdate")) {
				this.jButtonid_prestamoCuotaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_prestamoCuotaBusqueda")) {
				this.jButtonid_prestamoCuotaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_cuotaCuotaUpdate")) {
				this.jButtonid_estado_cuotaCuotaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_cuotaCuotaBusqueda")) {
				this.jButtonid_estado_cuotaCuotaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoCuotaUpdate")) {
				this.jButtonid_defi_provision_empleadoCuotaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoCuotaBusqueda")) {
				this.jButtonid_defi_provision_empleadoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotaCuotaBusqueda")) {
				this.jButtonnumero_cuotaCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("capitalCuotaBusqueda")) {
				this.jButtoncapitalCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("interesCuotaBusqueda")) {
				this.jButtoninteresCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCuotaBusqueda")) {
				this.jButtontotalCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionCuotaBusqueda")) {
				this.jButtonfecha_liquidacionCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ajusteCuotaBusqueda")) {
				this.jButtonmonto_ajusteCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("interes_ajusteCuotaBusqueda")) {
				this.jButtoninteres_ajusteCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoCuotaBusqueda")) {
				this.jButtonfecha_vencimientoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCuotaBusqueda")) {
				this.jButtondescripcionCuotaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdDefiProvisionEmpleadoCuota")) {
				this.jButtonFK_IdDefiProvisionEmpleadoCuotaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoCuotaCuota")) {
				this.jButtonFK_IdEstadoCuotaCuotaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPrestamoCuota")) {
				this.jButtonFK_IdPrestamoCuotaActionPerformed(evt);
			}
			
			;
			
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCuota();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuotaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				


				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Cuota cuotaLocal=null;
			
			if(!this.getEsControlTabla()) {
				cuotaLocal=this.cuota;
			} else {
				cuotaLocal=this.cuotaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
							
				
				


				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaAnterior =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuotaAnterior =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
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
			
			


			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuotaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
								
						
				


				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
								
				
				


				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaAnterior =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuotaAnterior =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaAnterior =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuotaAnterior =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuotaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
							
				
				


				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuotaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuotaAnterior =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuotaAnterior =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
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
			
			


			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuotaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
								
				
				


				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaAnterior =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuotaAnterior =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuotaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuotaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCuota")) {
					jCheckBoxSeleccionarTodosCuotaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCuota")) {
					jCheckBoxSeleccionadosCuotaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCuota")) {
					
				}
				
				


				
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
												
				
				


				
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuotaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuotaAnterior =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuotaAnterior =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuotaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
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
			
			


			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuotaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuota);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuota);
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
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
				
				


				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cuota.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cuota.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuotaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuotaAnterior =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuotaAnterior =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCuota")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCuotaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCuota.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cuota =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cuota =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cuota);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCuota")) {
				
				}
				
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCuota")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCuota.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCuota")) {
			
			}
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCuota();
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
			if(sTipo.equals("NuevoCuota")) {
				jButtonNuevoCuotaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCuota")) {
				jButtonDuplicarCuotaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCuota")) {
				jButtonCopiarCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCuota")) {
				jButtonVerFormCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCuota")) {
				jButtonNuevoCuotaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCuota")) {
				jButtonModificarCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCuota")) {
				jButtonActualizarCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCuota")) {
				jButtonEliminarCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCuota")) {
				jButtonGuardarCambiosCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCuota")) {
				jButtonCancelarCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCuota")) {
				jButtonCerrarCuotaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCuota")) {
				jButtonGuardarCambiosCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCuota")) {
				jButtonNuevoGuardarCambiosCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCuota")) {
				jButtonAbrirOrderByCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCuota")) {
				jButtonRecargarInformacionCuotaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCuota")) {
				jButtonAnterioresCuotaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCuota")) {
				jButtonSiguientesCuotaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuotaBusqueda")) {
				this.jButtonidCuotaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_prestamoCuotaUpdate")) {
				this.jButtonid_prestamoCuotaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_prestamoCuotaBusqueda")) {
				this.jButtonid_prestamoCuotaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_cuotaCuotaUpdate")) {
				this.jButtonid_estado_cuotaCuotaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_cuotaCuotaBusqueda")) {
				this.jButtonid_estado_cuotaCuotaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoCuotaUpdate")) {
				this.jButtonid_defi_provision_empleadoCuotaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoCuotaBusqueda")) {
				this.jButtonid_defi_provision_empleadoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotaCuotaBusqueda")) {
				this.jButtonnumero_cuotaCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("capitalCuotaBusqueda")) {
				this.jButtoncapitalCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("interesCuotaBusqueda")) {
				this.jButtoninteresCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCuotaBusqueda")) {
				this.jButtontotalCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionCuotaBusqueda")) {
				this.jButtonfecha_liquidacionCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ajusteCuotaBusqueda")) {
				this.jButtonmonto_ajusteCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("interes_ajusteCuotaBusqueda")) {
				this.jButtoninteres_ajusteCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoCuotaBusqueda")) {
				this.jButtonfecha_vencimientoCuotaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCuotaBusqueda")) {
				this.jButtondescripcionCuotaBusquedaActionPerformed(evt);
			}
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCuota();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCuota")) {
				closingInternalFrameCuota();
				
			} else if(sTipo.equals("jButtonCancelarCuota")) {
				JInternalFrameBase jInternalFrameDetalleFormCuota = (JInternalFrameBase)evt.getSource();
	            	
	            CuotaBeanSwingJInternalFrame jInternalFrameParent=(CuotaBeanSwingJInternalFrame)jInternalFrameDetalleFormCuota.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCuotaActionPerformed(null);
			}
			
			CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuota,new Object(),this.cuotaParameterGeneral,this.cuotaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCuota(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCuota(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCuota(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cuota)) {
			if(!esControlTabla) {
				if(CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);			
				}
				
				if(this.cuotaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCuota(this.cuota,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuotaReturnGeneral=cuotaLogic.procesarEventosCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuotaLogic.getCuotas(),this.cuota,this.cuotaParameterGeneral,this.isEsNuevoCuota,classes);//this.cuotaLogic.getCuota()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCuota(this.cuotaReturnGeneral,this.cuotaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cuotaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCuota(classes,this.cuotaReturnGeneral,this.cuotaBean,false);
					}
						
					if(this.cuotaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCuota(this.cuotaReturnGeneral.getCuota());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCuota(this.cuotaReturnGeneral.getCuota());	
					}
						
					if(this.cuotaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCuota(this.cuotaReturnGeneral.getCuota(),classes);//this.cuotaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCuota(this.cuota,classes);//this.cuotaBean);									
				}
			
				if(CuotaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCuota(this.cuota,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuota(this.cuota);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cuotaAnterior!=null) {
						this.cuota=this.cuotaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuotaReturnGeneral=cuotaLogic.procesarEventosCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuotaLogic.getCuotas(),this.cuota,this.cuotaParameterGeneral,this.isEsNuevoCuota,classes);//this.cuotaLogic.getCuota()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuotaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuotaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cuotaReturnGeneral.getCuota(),cuotaLogic.getCuotas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cuotaReturnGeneral.getCuota(),this.cuotas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCuota.repaint();
				
				//((AbstractTableModel) this.jTableDatosCuota.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCuota();
			}
		}
	}
	
	public void actualizarVisualTableDatosCuota() throws Exception {
		
		CuotaModel cuotaModel=(CuotaModel)this.jTableDatosCuota.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuotaModel.cuotas=this.cuotaLogic.getCuotas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cuotaModel.cuotas=this.cuotas;
		}
		
		
		((CuotaModel) this.jTableDatosCuota.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCuota() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcuotaAnterior(),this.cuotaLogic.getCuotas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcuotaAnterior(),this.cuotas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCuota();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCuota(Cuota cuota,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
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
										
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuota,new Object(),generalEntityParameterGeneral,this.cuotaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cuotaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CuotaConstantesFunciones.getClassesRelationshipsOfCuota(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CuotaConstantesFunciones.getClassesRelationshipsFromStringsOfCuota(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCuota(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CuotaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuota,new Object(),generalEntityParameterGeneral,this.cuotaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCuota(CuotaBean cuotaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCuota(ArrayList<Classe> classes,CuotaReturnGeneral cuotaReturnGeneral,CuotaBean cuotaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCuota(Cuota cuota,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cuota)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCuota = new CuotaDetalleFormJInternalFrame(jDesktopPane,this.cuotaSessionBean.getConGuardarRelaciones(),this.cuotaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCuota);
		this.jInternalFrameDetalleFormCuota.setVisible(false);
		this.jInternalFrameDetalleFormCuota.setSelected(false);						
		
		this.jInternalFrameDetalleFormCuota.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCuota.cuotaLogic=this.cuotaLogic;
		
		this.cargarCombosFrameForeignKeyCuota("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCuota();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuota();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCuota("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCuota();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCuota.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuota"));
		
		this.jInternalFrameDetalleFormCuota.jButtonModificarCuota.addActionListener(new ButtonActionListener(this,"ModificarCuota"));

		
		this.jInternalFrameDetalleFormCuota.jButtonModificarToolBarCuota.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuota"));
					
		this.jInternalFrameDetalleFormCuota.jMenuItemModificarCuota.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuota"));		
		
		
		
		this.jInternalFrameDetalleFormCuota.jButtonActualizarCuota.addActionListener (new ButtonActionListener(this,"ActualizarCuota"));
		
		
		this.jInternalFrameDetalleFormCuota.jButtonActualizarToolBarCuota.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuota"));
						
		this.jInternalFrameDetalleFormCuota.jMenuItemActualizarCuota.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuota"));		
		
		
		
		this.jInternalFrameDetalleFormCuota.jButtonEliminarCuota.addActionListener (new ButtonActionListener(this,"EliminarCuota"));
		
		
		this.jInternalFrameDetalleFormCuota.jButtonEliminarToolBarCuota.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuota"));
								
		this.jInternalFrameDetalleFormCuota.jMenuItemEliminarCuota.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuota"));		
		
		
		
		this.jInternalFrameDetalleFormCuota.jButtonCancelarCuota.addActionListener (new ButtonActionListener(this,"CancelarCuota"));
		
		
		this.jInternalFrameDetalleFormCuota.jButtonCancelarToolBarCuota.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuota"));
					
		this.jInternalFrameDetalleFormCuota.jMenuItemCancelarCuota.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuota"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCuota.jMenuItemDetalleCerrarCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuota"));		
		
		
		
		this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosToolBarCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuota"));
		
		
		
		this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosToolBarCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuota"));
		
		
		
		this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuota"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonidCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_prestamoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_prestamoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_prestamoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_prestamoCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_estado_cuotaCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_cuotaCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_estado_cuotaCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_cuotaCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_defi_provision_empleadoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_defi_provision_empleadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonnumero_cuotaCuotaBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotaCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoncapitalCuotaBusqueda.addActionListener(new ButtonActionListener(this,"capitalCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoninteresCuotaBusqueda.addActionListener(new ButtonActionListener(this,"interesCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtontotalCuotaBusqueda.addActionListener(new ButtonActionListener(this,"totalCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonfecha_liquidacionCuotaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonmonto_ajusteCuotaBusqueda.addActionListener(new ButtonActionListener(this,"monto_ajusteCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoninteres_ajusteCuotaBusqueda.addActionListener(new ButtonActionListener(this,"interes_ajusteCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonfecha_vencimientoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtondescripcionCuotaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCuotaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuota"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCuota"));
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuota"));
		}
		
		this.jTableDatosCuota.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCuota"));
		
		this.jTableDatosCuota.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCuota"));
		
		this.jButtonNuevoCuota.addActionListener(new ButtonActionListener(this,"NuevoCuota"));
		
		this.jButtonDuplicarCuota.addActionListener(new ButtonActionListener(this,"DuplicarCuota"));
		
		this.jButtonCopiarCuota.addActionListener(new ButtonActionListener(this,"CopiarCuota"));
		
		this.jButtonVerFormCuota.addActionListener(new ButtonActionListener(this,"VerFormCuota"));
		
		
		this.jButtonNuevoToolBarCuota.addActionListener(new ButtonActionListener(this,"NuevoToolBarCuota"));
			
		this.jButtonDuplicarToolBarCuota.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCuota"));
			
		this.jMenuItemNuevoCuota.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCuota"));
			
		this.jMenuItemDuplicarCuota.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCuota"));		
		
		
		this.jButtonNuevoRelacionesCuota.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCuota"));
		
		
		this.jButtonNuevoRelacionesToolBarCuota.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCuota"));
			
		this.jMenuItemNuevoRelacionesCuota.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCuota"));		
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonModificarCuota.addActionListener(new ButtonActionListener(this,"ModificarCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonModificarToolBarCuota.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuota"));
			
			this.jInternalFrameDetalleFormCuota.jMenuItemModificarCuota.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCuota.jButtonActualizarCuota.addActionListener (new ButtonActionListener(this,"ActualizarCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonActualizarToolBarCuota.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuota"));
				
			this.jInternalFrameDetalleFormCuota.jMenuItemActualizarCuota.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonEliminarCuota.addActionListener (new ButtonActionListener(this,"EliminarCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonEliminarToolBarCuota.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuota"));
						
			this.jInternalFrameDetalleFormCuota.jMenuItemEliminarCuota.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonCancelarCuota.addActionListener (new ButtonActionListener(this,"CancelarCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonCancelarToolBarCuota.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuota"));
			
			this.jInternalFrameDetalleFormCuota.jMenuItemCancelarCuota.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuota"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCuota.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCuota"));		
		
		
		this.jButtonCerrarCuota.addActionListener (new ButtonActionListener(this,"CerrarCuota"));
		
		
		this.jButtonCerrarToolBarCuota.addActionListener (new ButtonActionListener(this,"CerrarToolBarCuota"));
			
		this.jMenuItemCerrarCuota.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCuota"));
			
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jMenuItemDetalleCerrarCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuota"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosCuota"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosToolBarCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuota"));
		}
		
		this.jButtonCopiarToolBarCuota.addActionListener (new ButtonActionListener(this,"CopiarToolBarCuota"));
			
		this.jButtonVerFormToolBarCuota.addActionListener (new ButtonActionListener(this,"VerFormToolBarCuota"));
		
		this.jMenuItemGuardarCambiosCuota.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCuota"));
			
		this.jMenuItemCopiarCuota.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCuota"));		
		
		this.jMenuItemVerFormCuota.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCuota"));		
		
		
		this.jButtonGuardarCambiosTablaCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuota"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCuota"));
			
		this.jMenuItemGuardarCambiosTablaCuota.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuota"));		
		
		
		
		this.jButtonRecargarInformacionCuota.addActionListener (new ButtonActionListener(this,"RecargarInformacionCuota"));
					
		this.jButtonRecargarInformacionToolBarCuota.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCuota"));
		
		this.jMenuItemRecargarInformacionCuota.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCuota"));		
		
		
		
		this.jButtonAnterioresCuota.addActionListener (new ButtonActionListener(this,"AnterioresCuota"));
		
		
		this.jButtonAnterioresToolBarCuota.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCuota"));
		
		this.jMenuItemAnterioresCuota.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCuota"));		
		
		
		this.jButtonSiguientesCuota.addActionListener (new ButtonActionListener(this,"SiguientesCuota"));
		
		
		this.jButtonSiguientesToolBarCuota.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCuota"));
			
		this.jMenuItemSiguientesCuota.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCuota"));
			
		this.jMenuItemAbrirOrderByCuota.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCuota"));
			
		this.jMenuItemMostrarOcultarCuota.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCuota"));
			
		this.jMenuItemDetalleAbrirOrderByCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCuota"));
			
		this.jMenuItemDetalleMostarOcultarCuota.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCuota"));		
		
		
		this.jButtonNuevoGuardarCambiosCuota.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCuota"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuota.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCuota"));
			
		this.jMenuItemNuevoGuardarCambiosCuota.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCuota"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCuota.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCuota"));

		this.jCheckBoxSeleccionadosCuota.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCuota"));
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuota"));
		}
		
		
		this.jComboBoxTiposRelacionesCuota.addActionListener (new ButtonActionListener(this,"TiposRelacionesCuota"));
			
		this.jComboBoxTiposAccionesCuota.addActionListener (new ButtonActionListener(this,"TiposAccionesCuota"));
					
		this.jComboBoxTiposSeleccionarCuota.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCuota"));
			
		this.jTextFieldValorCampoGeneralCuota.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCuota"));		
		
		
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonidCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_prestamoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_prestamoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_prestamoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_prestamoCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_estado_cuotaCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_cuotaCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_estado_cuotaCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_cuotaCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_defi_provision_empleadoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_defi_provision_empleadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonnumero_cuotaCuotaBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotaCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoncapitalCuotaBusqueda.addActionListener(new ButtonActionListener(this,"capitalCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoninteresCuotaBusqueda.addActionListener(new ButtonActionListener(this,"interesCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtontotalCuotaBusqueda.addActionListener(new ButtonActionListener(this,"totalCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonfecha_liquidacionCuotaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonmonto_ajusteCuotaBusqueda.addActionListener(new ButtonActionListener(this,"monto_ajusteCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoninteres_ajusteCuotaBusqueda.addActionListener(new ButtonActionListener(this,"interes_ajusteCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonfecha_vencimientoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtondescripcionCuotaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCuotaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdDefiProvisionEmpleadoCuota.addActionListener(new ButtonActionListener(this,"FK_IdDefiProvisionEmpleadoCuota"));

			this.jButtonFK_IdEstadoCuotaCuota.addActionListener(new ButtonActionListener(this,"FK_IdEstadoCuotaCuota"));

			this.jButtonFK_IdPrestamoCuota.addActionListener(new ButtonActionListener(this,"FK_IdPrestamoCuota"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCuota!=null) {
				this.jInternalFrameReporteDinamicoCuota.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuota"));
				this.jInternalFrameReporteDinamicoCuota.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuota"));
				this.jInternalFrameReporteDinamicoCuota.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuota"));
			}
			
			//this.jButtonCerrarReporteDinamicoCuota.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuota"));				
			//this.jButtonGenerarReporteDinamicoCuota.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuota"));
			//this.jButtonGenerarExcelReporteDinamicoCuota.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuota"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCuota!=null) {
				this.jInternalFrameImportacionCuota.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuota"));
				this.jInternalFrameImportacionCuota.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuota"));
				this.jInternalFrameImportacionCuota.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuota"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCuota.addActionListener (new ButtonActionListener(this,"AbrirOrderByCuota"));
			
			this.jButtonAbrirOrderByToolBarCuota.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCuota"));			
			
			if(this.jInternalFrameOrderByCuota!=null) {
				this.jInternalFrameOrderByCuota.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuota"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCuota!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuota.jTabbedPaneRelacionesCuota.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuota"));
		
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
            		closingInternalFrameCuota();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCuota.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCuota = (JInternalFrameBase)event.getSource();
	            	
	            CuotaBeanSwingJInternalFrame jInternalFrameParent=(CuotaBeanSwingJInternalFrame)jInternalFrameDetalleFormCuota.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCuotaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCuota.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCuotaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCuota.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCuota.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuotaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCuota";
		inputMap = this.jButtonNuevoCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuotaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuotaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCuota";
		inputMap = this.jButtonNuevoRelacionesCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuotaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCuota";
		inputMap = this.jButtonModificarCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCuota";
		inputMap = this.jButtonActualizarCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCuota";
		inputMap = this.jButtonEliminarCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCuota";
		inputMap = this.jButtonCancelarCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCuota";
		inputMap = this.jButtonCerrarCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCuota";
		inputMap = this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosCuota.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCuota.jButtonGuardarCambiosCuota.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCuotaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCuota.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCuotaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCuota.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCuotaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonidCuotaBusqueda.addActionListener(new ButtonActionListener(this,"idCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_prestamoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_prestamoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_prestamoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_prestamoCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_estado_cuotaCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_cuotaCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_estado_cuotaCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_cuotaCuotaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuota.jButtonid_defi_provision_empleadoCuotaUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoCuotaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonid_defi_provision_empleadoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonnumero_cuotaCuotaBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotaCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoncapitalCuotaBusqueda.addActionListener(new ButtonActionListener(this,"capitalCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoninteresCuotaBusqueda.addActionListener(new ButtonActionListener(this,"interesCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtontotalCuotaBusqueda.addActionListener(new ButtonActionListener(this,"totalCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonfecha_liquidacionCuotaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonmonto_ajusteCuotaBusqueda.addActionListener(new ButtonActionListener(this,"monto_ajusteCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtoninteres_ajusteCuotaBusqueda.addActionListener(new ButtonActionListener(this,"interes_ajusteCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtonfecha_vencimientoCuotaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoCuotaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuota.jButtondescripcionCuotaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCuotaBusqueda"));
		
		
		this.jButtonFK_IdDefiProvisionEmpleadoCuota.addActionListener(new ButtonActionListener(this,"FK_IdDefiProvisionEmpleadoCuota"));

		this.jButtonFK_IdEstadoCuotaCuota.addActionListener(new ButtonActionListener(this,"FK_IdEstadoCuotaCuota"));

		this.jButtonFK_IdPrestamoCuota.addActionListener(new ButtonActionListener(this,"FK_IdPrestamoCuota"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCuota.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCuotaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCuotaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCuota.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCuota(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
					cuotaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cuota cuotaAux:cuotas) {
					cuotaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCuotaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuota(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
						cuotaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cuota cuotaAux:cuotas) {
						cuotaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cuota cuotaAux:cuotas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCuota(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuota.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuota.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuota,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCuotaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuota(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCuota.getSelectedRows();
			
			Cuota cuotaLocal=new Cuota();
			
			//this.seleccionarTodosCuota(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuotaLocal =(Cuota) this.cuotaLogic.getCuotas().toArray()[this.jTableDatosCuota.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cuotaLocal =(Cuota) this.cuotas.toArray()[this.jTableDatosCuota.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cuotaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
						cuotaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cuota cuotaAux:cuotas) {
						cuotaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCuota(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuota.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuota.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuota,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCuotaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCuotaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCuotaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCuota(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCuota.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cuota cuotaAux:this.cuotaLogic.getCuotas()) {
				
						if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_NUMEROCUOTA)) {
							existe=true;
							cuotaAux.setnumero_cuota(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_CAPITAL)) {
							existe=true;
							cuotaAux.setcapital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_INTERES)) {
							existe=true;
							cuotaAux.setinteres(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cuotaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							cuotaAux.setfecha_liquidacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_MONTOAJUSTE)) {
							existe=true;
							cuotaAux.setmonto_ajuste(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_INTERESAJUSTE)) {
							existe=true;
							cuotaAux.setinteres_ajuste(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							cuotaAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cuotaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cuota cuotaAux:cuotas) {
					
						if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_NUMEROCUOTA)) {
							existe=true;
							cuotaAux.setnumero_cuota(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_CAPITAL)) {
							existe=true;
							cuotaAux.setcapital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_INTERES)) {
							existe=true;
							cuotaAux.setinteres(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cuotaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							cuotaAux.setfecha_liquidacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_MONTOAJUSTE)) {
							existe=true;
							cuotaAux.setmonto_ajuste(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_INTERESAJUSTE)) {
							existe=true;
							cuotaAux.setinteres_ajuste(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							cuotaAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cuotaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCuota(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCuotaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCuota(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCuota=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCuota.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCuota) {				
					conSplash=true;//false;										
					
					//this.startProcessCuota(conSplash);
				
					this.generarReporteCuotasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCuotasSeleccionados();
				//this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuotasSeleccionados(false);
				//this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuotasSeleccionados(true);
				//this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuota();
				
				this.exportarCuotasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCuotas();
				//this.importarCuotas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuota();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCuotasSeleccionados();
				//this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCuota();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCuota)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCuota(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.setSelectedIndex(0);					
				}	
			} 			
			else if(CuotaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCuota) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCuota(conSplash);
					
						//this.actualizarParametrosGeneralCuota();
						
						this.generarReporteProcesoAccionCuotasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CuotaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CuotaS SELECCIONADOS?", "MANTENIMIENTO DE Cuota", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCuota();
				
						this.actualizarParametrosGeneralCuota();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cuotaReturnGeneral=cuotaLogic.procesarAccionCuotasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cuotaLogic.getCuotas(),this.cuotaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCuotaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCuota();
					
					CuotaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCuotaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuota.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuota.jComboBoxTiposAccionesFormularioCuota.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCuota(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCuotaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCuota();
			
			if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		
			Cuota cuota=new Cuota();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCuota(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCuota.getSelectedItem();
			
			
			
			
			cuotasSeleccionados=this.getCuotasSeleccionados(true);
			//this.sTipoAccion;
			
			if(cuotasSeleccionados.size()==1) {
				for(Cuota cuotaAux:cuotasSeleccionados) {
					cuota=cuotaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCuota();
			
      		//this.finishProcessCuota(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCuotaReturnGeneral() throws Exception {
		if(this.cuotaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cuotaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cuotaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cuotaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cuotaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cuotaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCuota(false);
		}
		
		if(this.cuotaReturnGeneral.getConRetornoLista() || this.cuotaReturnGeneral.getConRetornoObjeto()) {
			if(this.cuotaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuotaLogic.setCuotas(this.cuotaReturnGeneral.getCuotas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cuotaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuotaLogic.setCuota(this.cuotaReturnGeneral.getCuota());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCuota(false);
		}
	}
	
	public void actualizarParametrosGeneralCuota() throws Exception {
		
		
	}
	
	public ArrayList<Cuota> getCuotasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCuota) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Cuota cuotaAux:cuotaLogic.getCuotas()) {
					if(cuotaAux.getIsSelected()) {
						cuotasSeleccionados.add(cuotaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cuota cuotaAux:this.cuotas) {
					if(cuotaAux.getIsSelected()) {
						cuotasSeleccionados.add(cuotaAux);				
					}
				}
			}
			
			if(cuotasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cuotasSeleccionados.addAll(this.cuotaLogic.getCuotas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cuotasSeleccionados.addAll(this.cuotas);				
					}
				}
			}
		} else {
			cuotasSeleccionados.add(this.cuota);
		}
		
		return cuotasSeleccionados;
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
	
	public void generarReporteCuotasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCuotasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCuotasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuotasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuotasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuota",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCuotasSeleccionados() throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCuotas("Todos",cuotasSeleccionados);
		
	}	
	
	public void generarReporteNormalCuotasSeleccionados() throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCuotas("Todos",cuotasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCuotasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCuotas("Todos",cuotasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCuotasSeleccionados() throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCuota();
		
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCuota();
		
		
		//this.generarReporteCuotas("Todos",cuotasSeleccionados ,cuotaImplementable,cuotaImplementableHome);
	}
	
	public void mostrarImportacionCuotas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCuota();
		
		this.abrirFrameImportacionCuota();		
		
			
		//this.generarReporteCuotas("Todos",cuotasSeleccionados ,cuotaImplementable,cuotaImplementableHome);
	}
	
	public void importarCuotas() throws Exception {		
	
	}
	
	public void exportarCuotasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCuotasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCuotasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCuotasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuota",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCuotasSeleccionados() throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuota."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCuota(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Cuota cuotaAux:cuotasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCuota(cuotaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cuotaAux.setsDetalleGeneralEntityReporte(cuotaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCuota(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_IDPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_IDESTADOCUOTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_NUMEROCUOTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_CAPITAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_INTERES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_FECHALIQUIDACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_MONTOAJUSTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_INTERESAJUSTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuotaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCuota(Cuota cuota,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cuota.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getprestamo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getestadocuota_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getdefiprovisionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getnumero_cuota().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getcapital().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getinteres().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getfecha_liquidacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getmonto_ajuste().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getinteres_ajuste().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuota.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCuotasSeleccionados() throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuota.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Cuotas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCuota(row);				
				iRow++;
			}				
			
			for(Cuota cuotaAux:cuotasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCuota(cuotaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCuotasSeleccionados() throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();		
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuota.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cuotas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cuota");
			//elementRoot.appendChild(element);
		
			for(Cuota cuotaAux:cuotasSeleccionados) {
				element = document.createElement("cuota");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCuota(cuotaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuotaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuota",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCuota(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_IDPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_IDESTADOCUOTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_NUMEROCUOTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_CAPITAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_INTERES);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_FECHALIQUIDACION);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_MONTOAJUSTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_INTERESAJUSTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuotaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCuota(Cuota cuota,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getprestamo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getestadocuota_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getdefiprovisionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getnumero_cuota());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getcapital());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getinteres());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getfecha_liquidacion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getmonto_ajuste());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getinteres_ajuste());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cuota.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlCuota(Cuota cuota,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CuotaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cuota.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CuotaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cuota.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementprestamo_descripcion = document.createElement(CuotaConstantesFunciones.IDPRESTAMO);
		elementprestamo_descripcion.appendChild(document.createTextNode(cuota.getprestamo_descripcion()));
		element.appendChild(elementprestamo_descripcion);

		Element elementestadocuota_descripcion = document.createElement(CuotaConstantesFunciones.IDESTADOCUOTA);
		elementestadocuota_descripcion.appendChild(document.createTextNode(cuota.getestadocuota_descripcion()));
		element.appendChild(elementestadocuota_descripcion);

		Element elementdefiprovisionempleado_descripcion = document.createElement(CuotaConstantesFunciones.IDDEFIPROVISIONEMPLEADO);
		elementdefiprovisionempleado_descripcion.appendChild(document.createTextNode(cuota.getdefiprovisionempleado_descripcion()));
		element.appendChild(elementdefiprovisionempleado_descripcion);

		Element elementnumero_cuota = document.createElement(CuotaConstantesFunciones.NUMEROCUOTA);
		elementnumero_cuota.appendChild(document.createTextNode(cuota.getnumero_cuota().toString().trim()));
		element.appendChild(elementnumero_cuota);

		Element elementcapital = document.createElement(CuotaConstantesFunciones.CAPITAL);
		elementcapital.appendChild(document.createTextNode(cuota.getcapital().toString().trim()));
		element.appendChild(elementcapital);

		Element elementinteres = document.createElement(CuotaConstantesFunciones.INTERES);
		elementinteres.appendChild(document.createTextNode(cuota.getinteres().toString().trim()));
		element.appendChild(elementinteres);

		Element elementtotal = document.createElement(CuotaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(cuota.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementfecha_liquidacion = document.createElement(CuotaConstantesFunciones.FECHALIQUIDACION);
		elementfecha_liquidacion.appendChild(document.createTextNode(cuota.getfecha_liquidacion().toString().trim()));
		element.appendChild(elementfecha_liquidacion);

		Element elementmonto_ajuste = document.createElement(CuotaConstantesFunciones.MONTOAJUSTE);
		elementmonto_ajuste.appendChild(document.createTextNode(cuota.getmonto_ajuste().toString().trim()));
		element.appendChild(elementmonto_ajuste);

		Element elementinteres_ajuste = document.createElement(CuotaConstantesFunciones.INTERESAJUSTE);
		elementinteres_ajuste.appendChild(document.createTextNode(cuota.getinteres_ajuste().toString().trim()));
		element.appendChild(elementinteres_ajuste);

		Element elementfecha_vencimiento = document.createElement(CuotaConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(cuota.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementdescripcion = document.createElement(CuotaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(cuota.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoCuotasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Cuota> cuotasSeleccionados=new ArrayList<Cuota>();
		
		cuotasSeleccionados=this.getCuotasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCuota(cuotasSeleccionados);
		
		this.generarReporteCuotas("Todos",cuotasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCuota(ArrayList<Cuota> cuotasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Cuota cuotaAux:cuotasSeleccionados) {
				cuotaAux.setsDetalleGeneralEntityReporte(cuotaAux.toString());
			
				if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_IDPRESTAMO)) {
					existe=true;
					cuotaAux.setsDescripcionGeneralEntityReporte1(cuotaAux.getprestamo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_IDESTADOCUOTA)) {
					existe=true;
					cuotaAux.setsDescripcionGeneralEntityReporte1(cuotaAux.getestadocuota_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO)) {
					existe=true;
					cuotaAux.setsDescripcionGeneralEntityReporte1(cuotaAux.getdefiprovisionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_NUMEROCUOTA)) {
					existe=true;
					cuotaAux.setsDescripcionGeneralEntityReporte1(cuotaAux.getnumero_cuota().toString());
				}
				 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					cuotaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cuotaAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(CuotaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					cuotaAux.setsDescripcionGeneralEntityReporte1(cuotaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuotaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCuota(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCuota=true;
				this.isVisibilidadCeldaNuevoRelacionesCuota=true;
				this.isVisibilidadCeldaGuardarCambiosCuota=true;
			}
			
			this.isVisibilidadCeldaModificarCuota=false;
			this.isVisibilidadCeldaActualizarCuota=false;
			this.isVisibilidadCeldaEliminarCuota=false;
			this.isVisibilidadCeldaCancelarCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarCuota=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesCuota=false;
			this.isVisibilidadCeldaGuardarCambiosCuota=false;
			this.isVisibilidadCeldaModificarCuota=false;
			this.isVisibilidadCeldaActualizarCuota=true;
			this.isVisibilidadCeldaEliminarCuota=false;
			this.isVisibilidadCeldaCancelarCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarCuota=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesCuota=false;
			this.isVisibilidadCeldaGuardarCambiosCuota=false;
			this.isVisibilidadCeldaModificarCuota=false;
			this.isVisibilidadCeldaActualizarCuota=true;
			this.isVisibilidadCeldaEliminarCuota=true;
			this.isVisibilidadCeldaCancelarCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarCuota=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesCuota=false;
			this.isVisibilidadCeldaGuardarCambiosCuota=false;
			this.isVisibilidadCeldaModificarCuota=false;
			this.isVisibilidadCeldaActualizarCuota=true;
			this.isVisibilidadCeldaEliminarCuota=false;
			this.isVisibilidadCeldaCancelarCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarCuota=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesCuota=true;
			this.isVisibilidadCeldaGuardarCambiosCuota=true;
			this.isVisibilidadCeldaModificarCuota=false;
			this.isVisibilidadCeldaActualizarCuota=false;
			this.isVisibilidadCeldaEliminarCuota=false;
			this.isVisibilidadCeldaCancelarCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuota=true;
				} else {
					this.isVisibilidadCeldaGuardarCuota=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesCuota=false;
			this.isVisibilidadCeldaGuardarCambiosCuota=false;
			this.isVisibilidadCeldaActualizarCuota=false;
			this.isVisibilidadCeldaEliminarCuota=false;
			this.isVisibilidadCeldaCancelarCuota=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarCuota=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCuota=false;
			this.isVisibilidadCeldaNuevoRelacionesCuota=false;
			this.isVisibilidadCeldaGuardarCambiosCuota=false;
			this.isVisibilidadCeldaModificarCuota=true;
			this.isVisibilidadCeldaActualizarCuota=false;
			this.isVisibilidadCeldaEliminarCuota=false;
			this.isVisibilidadCeldaCancelarCuota=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuota=false;
				} else {
					this.isVisibilidadCeldaGuardarCuota=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CuotaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCuota=true;
			this.isVisibilidadCeldaNuevoRelacionesCuota=true;
			this.isVisibilidadCeldaGuardarCambiosCuota=true;
		} else {
			this.actualizarEstadoPanelsCuota(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCuota=false;
			//this.isVisibilidadCeldaVerFormCuota=false;
			this.isVisibilidadCeldaDuplicarCuota=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cuotaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCuota=false;
		} else {
			this.isVisibilidadCeldaNuevoCuota=false;
			this.isVisibilidadCeldaGuardarCambiosCuota=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cuotaSessionBean.getEsGuardarRelacionado()) {
			if(!cuotaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCuota=false;												
			}
			
			this.jButtonCerrarCuota.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCuota=false;
		}
		
		if(!this.permiteMantenimiento(this.cuota)) {
			this.isVisibilidadCeldaActualizarCuota=false;
			this.isVisibilidadCeldaEliminarCuota=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCuota() {
	}
	
	public void actualizarEstadoPanelsCuota(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCuota!=null) {
				this.jScrollPanelDatosEdicionCuota.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuota!=null) {
				this.jTabbedPaneBusquedasCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuota!=null) {
				this.jScrollPanelDatosCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuota!=null) {
				this.jPanelPaginacionCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCuota!=null) {
				this.jScrollPanelDatosEdicionCuota.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuota!=null) {
				this.jTabbedPaneBusquedasCuota.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCuota!=null) {
				this.jScrollPanelDatosCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuota!=null) {
				this.jPanelPaginacionCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCuota!=null) {
				this.jScrollPanelDatosEdicionCuota.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuota!=null) {
				this.jTabbedPaneBusquedasCuota.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuota!=null) {
				this.jScrollPanelDatosCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuota!=null) {
				this.jPanelPaginacionCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCuota!=null) {
				this.jScrollPanelDatosEdicionCuota.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuota!=null) {
				this.jTabbedPaneBusquedasCuota.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuota!=null) {
				this.jScrollPanelDatosCuota.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuota!=null) {
				this.jPanelPaginacionCuota.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCuota!=null) {
				this.jScrollPanelDatosEdicionCuota.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuota!=null) {
				this.jTabbedPaneBusquedasCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuota!=null) {
				this.jScrollPanelDatosCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuota!=null) {
				this.jPanelPaginacionCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCuota!=null) {
				this.jScrollPanelDatosEdicionCuota.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuota!=null) {
				this.jTabbedPaneBusquedasCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuota!=null) {
				this.jScrollPanelDatosCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuota!=null) {
				this.jPanelPaginacionCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCuota!=null) {
				this.jScrollPanelDatosEdicionCuota.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuota!=null) {
				this.jTabbedPaneBusquedasCuota.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuota!=null) {
				this.jScrollPanelDatosCuota.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuota!=null) {
				this.jPanelPaginacionCuota.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cuotaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCuota!=null) {
					this.jTabbedPaneBusquedasCuota.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cuotaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuota!=null) {
				this.jTabbedPaneBusquedasCuota.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCuota!=null) {
				this.jPanelParametrosReportesCuota.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPrestamo(Boolean isParaPrestamo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPrestamoNegation=!isParaPrestamo;

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaPrestamoNegation;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdDefiProvisionEmpleadoCuota);}

			this.isVisibilidadFK_IdEstadoCuota=isParaPrestamoNegation;
			if(!this.isVisibilidadFK_IdEstadoCuota) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdEstadoCuotaCuota);}

			this.isVisibilidadFK_IdPrestamo=isParaPrestamo;
			if(!this.isVisibilidadFK_IdPrestamo) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdPrestamoCuota);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoCuota(Boolean isParaEstadoCuota){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoCuotaNegation=!isParaEstadoCuota;

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaEstadoCuotaNegation;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdDefiProvisionEmpleadoCuota);}

			this.isVisibilidadFK_IdEstadoCuota=isParaEstadoCuota;
			if(!this.isVisibilidadFK_IdEstadoCuota) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdEstadoCuotaCuota);}

			this.isVisibilidadFK_IdPrestamo=isParaEstadoCuotaNegation;
			if(!this.isVisibilidadFK_IdPrestamo) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdPrestamoCuota);}
		}
		
	}

	public void setVisibilidadBusquedasParaDefiProvisionEmpleado(Boolean isParaDefiProvisionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDefiProvisionEmpleadoNegation=!isParaDefiProvisionEmpleado;

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaDefiProvisionEmpleado;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdDefiProvisionEmpleadoCuota);}

			this.isVisibilidadFK_IdEstadoCuota=isParaDefiProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoCuota) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdEstadoCuotaCuota);}

			this.isVisibilidadFK_IdPrestamo=isParaDefiProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPrestamo) {this.jTabbedPaneBusquedasCuota.remove(jPanelFK_IdPrestamoCuota);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CuotaSessionBean cuotaSessionBean=new CuotaSessionBean();
		
		if(this.cuotaSessionBean==null) {
			this.cuotaSessionBean=new CuotaSessionBean();
		}
		
		this.cuotaSessionBean.setsUltimaBusquedaCuota(this.getsAccionBusqueda());
		this.cuotaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cuotaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdDefiProvisionEmpleado")) {
			cuotaSessionBean.setid_defi_provision_empleado(this.getid_defi_provision_empleadoFK_IdDefiProvisionEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoCuota")) {
			cuotaSessionBean.setid_estado_cuota(this.getid_estado_cuotaFK_IdEstadoCuota());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPrestamo")) {
			cuotaSessionBean.setid_prestamo(this.getid_prestamoFK_IdPrestamo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CuotaSessionBean cuotaSessionBean=new CuotaSessionBean();
		
		if(this.cuotaSessionBean==null) {
			this.cuotaSessionBean=new CuotaSessionBean();
		}
		
		if(this.cuotaSessionBean.getsUltimaBusquedaCuota()!=null&&!this.cuotaSessionBean.getsUltimaBusquedaCuota().equals("")) {
			this.setsAccionBusqueda(cuotaSessionBean.getsUltimaBusquedaCuota());
			this.setiNumeroPaginacion(cuotaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cuotaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdDefiProvisionEmpleado")) {
				this.setid_defi_provision_empleadoFK_IdDefiProvisionEmpleado(cuotaSessionBean.getid_defi_provision_empleado());
				cuotaSessionBean.setid_defi_provision_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoCuota")) {
				this.setid_estado_cuotaFK_IdEstadoCuota(cuotaSessionBean.getid_estado_cuota());
				cuotaSessionBean.setid_estado_cuota(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPrestamo")) {
				this.setid_prestamoFK_IdPrestamo(cuotaSessionBean.getid_prestamo());
				cuotaSessionBean.setid_prestamo(-1L);
			}
		}
		
		this.cuotaSessionBean.setsUltimaBusquedaCuota("");
		this.cuotaSessionBean.setiNumeroPaginacion(CuotaConstantesFunciones.INUMEROPAGINACION);
		this.cuotaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCuota(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCuota() {
		this.updateBorderResaltarBusquedasFormularioCuota();
		this.updateVisibilidadBusquedasFormularioCuota();
		this.updateHabilitarBusquedasFormularioCuota();
	}
	
	public void updateBorderResaltarBusquedasFormularioCuota() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCuota.getComponents().length>0) {
	

		if(this.cuotaConstantesFunciones.resaltarFK_IdDefiProvisionEmpleadoCuota!=null) {
			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdDefiProvisionEmpleadoCuota);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
				jPanel.setBorder(this.cuotaConstantesFunciones.resaltarFK_IdDefiProvisionEmpleadoCuota);
			}
		}

		if(this.cuotaConstantesFunciones.resaltarFK_IdEstadoCuotaCuota!=null) {
			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdEstadoCuotaCuota);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
				jPanel.setBorder(this.cuotaConstantesFunciones.resaltarFK_IdEstadoCuotaCuota);
			}
		}

		if(this.cuotaConstantesFunciones.resaltarFK_IdPrestamoCuota!=null) {
			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdPrestamoCuota);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
				jPanel.setBorder(this.cuotaConstantesFunciones.resaltarFK_IdPrestamoCuota);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCuota() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCuota.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdDefiProvisionEmpleadoCuota);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuotaConstantesFunciones.mostrarFK_IdDefiProvisionEmpleadoCuota);
			if(!this.cuotaConstantesFunciones.mostrarFK_IdDefiProvisionEmpleadoCuota && index>-1) {
				this.jTabbedPaneBusquedasCuota.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdEstadoCuotaCuota);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuotaConstantesFunciones.mostrarFK_IdEstadoCuotaCuota);
			if(!this.cuotaConstantesFunciones.mostrarFK_IdEstadoCuotaCuota && index>-1) {
				this.jTabbedPaneBusquedasCuota.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdPrestamoCuota);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuotaConstantesFunciones.mostrarFK_IdPrestamoCuota);
			if(!this.cuotaConstantesFunciones.mostrarFK_IdPrestamoCuota && index>-1) {
				this.jTabbedPaneBusquedasCuota.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCuota() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCuota.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdDefiProvisionEmpleadoCuota);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuotaConstantesFunciones.activarFK_IdDefiProvisionEmpleadoCuota);
				this.jTabbedPaneBusquedasCuota.setEnabledAt(index,this.cuotaConstantesFunciones.activarFK_IdDefiProvisionEmpleadoCuota);
			}

			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdEstadoCuotaCuota);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuotaConstantesFunciones.activarFK_IdEstadoCuotaCuota);
				this.jTabbedPaneBusquedasCuota.setEnabledAt(index,this.cuotaConstantesFunciones.activarFK_IdEstadoCuotaCuota);
			}

			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdPrestamoCuota);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuotaConstantesFunciones.activarFK_IdPrestamoCuota);
				this.jTabbedPaneBusquedasCuota.setEnabledAt(index,this.cuotaConstantesFunciones.activarFK_IdPrestamoCuota);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCuota(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdDefiProvisionEmpleado")) {
			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdDefiProvisionEmpleadoCuota);

			this.jTabbedPaneBusquedasCuota.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);

			this.cuotaConstantesFunciones.setResaltarFK_IdDefiProvisionEmpleadoCuota(resaltar);

			jPanel.setBorder(this.cuotaConstantesFunciones.resaltarFK_IdDefiProvisionEmpleadoCuota);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoCuota")) {
			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdEstadoCuotaCuota);

			this.jTabbedPaneBusquedasCuota.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);

			this.cuotaConstantesFunciones.setResaltarFK_IdEstadoCuotaCuota(resaltar);

			jPanel.setBorder(this.cuotaConstantesFunciones.resaltarFK_IdEstadoCuotaCuota);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPrestamo")) {
			index= this.jTabbedPaneBusquedasCuota.indexOfComponent(this.jPanelFK_IdPrestamoCuota);

			this.jTabbedPaneBusquedasCuota.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuota.getComponent(index);

			this.cuotaConstantesFunciones.setResaltarFK_IdPrestamoCuota(resaltar);

			jPanel.setBorder(this.cuotaConstantesFunciones.resaltarFK_IdPrestamoCuota);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCuota.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCuota() throws Exception {

		if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCuota();
		this.updateVisibilidadResaltarControlesFormularioCuota();
		this.updateHabilitarResaltarControlesFormularioCuota();
		
	}
	
	public void updateBorderResaltarControlesFormularioCuota() throws Exception {
		if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cuotaConstantesFunciones.resaltaridCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jLabelidCuota.setBorder(this.cuotaConstantesFunciones.resaltaridCuota);}
		if(this.cuotaConstantesFunciones.resaltarid_prestamoCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setBorder(this.cuotaConstantesFunciones.resaltarid_prestamoCuota);}
		if(this.cuotaConstantesFunciones.resaltarid_estado_cuotaCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setBorder(this.cuotaConstantesFunciones.resaltarid_estado_cuotaCuota);}
		if(this.cuotaConstantesFunciones.resaltarid_defi_provision_empleadoCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setBorder(this.cuotaConstantesFunciones.resaltarid_defi_provision_empleadoCuota);}
		if(this.cuotaConstantesFunciones.resaltarnumero_cuotaCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jTextFieldnumero_cuotaCuota.setBorder(this.cuotaConstantesFunciones.resaltarnumero_cuotaCuota);}
		if(this.cuotaConstantesFunciones.resaltarcapitalCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jTextFieldcapitalCuota.setBorder(this.cuotaConstantesFunciones.resaltarcapitalCuota);}
		if(this.cuotaConstantesFunciones.resaltarinteresCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jTextFieldinteresCuota.setBorder(this.cuotaConstantesFunciones.resaltarinteresCuota);}
		if(this.cuotaConstantesFunciones.resaltartotalCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jTextFieldtotalCuota.setBorder(this.cuotaConstantesFunciones.resaltartotalCuota);}
		if(this.cuotaConstantesFunciones.resaltarfecha_liquidacionCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jTextFieldfecha_liquidacionCuota.setBorder(this.cuotaConstantesFunciones.resaltarfecha_liquidacionCuota);}
		if(this.cuotaConstantesFunciones.resaltarmonto_ajusteCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jTextFieldmonto_ajusteCuota.setBorder(this.cuotaConstantesFunciones.resaltarmonto_ajusteCuota);}
		if(this.cuotaConstantesFunciones.resaltarinteres_ajusteCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jTextFieldinteres_ajusteCuota.setBorder(this.cuotaConstantesFunciones.resaltarinteres_ajusteCuota);}
		if(this.cuotaConstantesFunciones.resaltarfecha_vencimientoCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jDateChooserfecha_vencimientoCuota.setBorder(this.cuotaConstantesFunciones.resaltarfecha_vencimientoCuota);}
		if(this.cuotaConstantesFunciones.resaltardescripcionCuota!=null && this.jInternalFrameDetalleFormCuota!=null) {this.jInternalFrameDetalleFormCuota.jTextAreadescripcionCuota.setBorder(this.cuotaConstantesFunciones.resaltardescripcionCuota);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCuota() throws Exception {		
		if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuota!=null) {
	
		//this.jInternalFrameDetalleFormCuota.jLabelidCuota.setVisible(this.cuotaConstantesFunciones.mostraridCuota);
		this.jInternalFrameDetalleFormCuota.jPanelidCuota.setVisible(this.cuotaConstantesFunciones.mostraridCuota);
		//this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setVisible(this.cuotaConstantesFunciones.mostrarid_prestamoCuota);
		this.jInternalFrameDetalleFormCuota.jPanelid_prestamoCuota.setVisible(this.cuotaConstantesFunciones.mostrarid_prestamoCuota);
		//this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setVisible(this.cuotaConstantesFunciones.mostrarid_estado_cuotaCuota);
		this.jInternalFrameDetalleFormCuota.jPanelid_estado_cuotaCuota.setVisible(this.cuotaConstantesFunciones.mostrarid_estado_cuotaCuota);
		//this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setVisible(this.cuotaConstantesFunciones.mostrarid_defi_provision_empleadoCuota);
		this.jInternalFrameDetalleFormCuota.jPanelid_defi_provision_empleadoCuota.setVisible(this.cuotaConstantesFunciones.mostrarid_defi_provision_empleadoCuota);
		//this.jInternalFrameDetalleFormCuota.jTextFieldnumero_cuotaCuota.setVisible(this.cuotaConstantesFunciones.mostrarnumero_cuotaCuota);
		this.jInternalFrameDetalleFormCuota.jPanelnumero_cuotaCuota.setVisible(this.cuotaConstantesFunciones.mostrarnumero_cuotaCuota);
		//this.jInternalFrameDetalleFormCuota.jTextFieldcapitalCuota.setVisible(this.cuotaConstantesFunciones.mostrarcapitalCuota);
		this.jInternalFrameDetalleFormCuota.jPanelcapitalCuota.setVisible(this.cuotaConstantesFunciones.mostrarcapitalCuota);
		//this.jInternalFrameDetalleFormCuota.jTextFieldinteresCuota.setVisible(this.cuotaConstantesFunciones.mostrarinteresCuota);
		this.jInternalFrameDetalleFormCuota.jPanelinteresCuota.setVisible(this.cuotaConstantesFunciones.mostrarinteresCuota);
		//this.jInternalFrameDetalleFormCuota.jTextFieldtotalCuota.setVisible(this.cuotaConstantesFunciones.mostrartotalCuota);
		this.jInternalFrameDetalleFormCuota.jPaneltotalCuota.setVisible(this.cuotaConstantesFunciones.mostrartotalCuota);
		//this.jInternalFrameDetalleFormCuota.jTextFieldfecha_liquidacionCuota.setVisible(this.cuotaConstantesFunciones.mostrarfecha_liquidacionCuota);
		this.jInternalFrameDetalleFormCuota.jPanelfecha_liquidacionCuota.setVisible(this.cuotaConstantesFunciones.mostrarfecha_liquidacionCuota);
		//this.jInternalFrameDetalleFormCuota.jTextFieldmonto_ajusteCuota.setVisible(this.cuotaConstantesFunciones.mostrarmonto_ajusteCuota);
		this.jInternalFrameDetalleFormCuota.jPanelmonto_ajusteCuota.setVisible(this.cuotaConstantesFunciones.mostrarmonto_ajusteCuota);
		//this.jInternalFrameDetalleFormCuota.jTextFieldinteres_ajusteCuota.setVisible(this.cuotaConstantesFunciones.mostrarinteres_ajusteCuota);
		this.jInternalFrameDetalleFormCuota.jPanelinteres_ajusteCuota.setVisible(this.cuotaConstantesFunciones.mostrarinteres_ajusteCuota);
		//this.jInternalFrameDetalleFormCuota.jDateChooserfecha_vencimientoCuota.setVisible(this.cuotaConstantesFunciones.mostrarfecha_vencimientoCuota);
		this.jInternalFrameDetalleFormCuota.jPanelfecha_vencimientoCuota.setVisible(this.cuotaConstantesFunciones.mostrarfecha_vencimientoCuota);
		//this.jInternalFrameDetalleFormCuota.jTextAreadescripcionCuota.setVisible(this.cuotaConstantesFunciones.mostrardescripcionCuota);
		this.jInternalFrameDetalleFormCuota.jPaneldescripcionCuota.setVisible(this.cuotaConstantesFunciones.mostrardescripcionCuota);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCuota() throws Exception {
		if(this.jInternalFrameDetalleFormCuota==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuota!=null) {
	
		this.jInternalFrameDetalleFormCuota.jLabelidCuota.setEnabled(this.cuotaConstantesFunciones.activaridCuota);
		this.jInternalFrameDetalleFormCuota.jComboBoxid_prestamoCuota.setEnabled(this.cuotaConstantesFunciones.activarid_prestamoCuota);
		this.jInternalFrameDetalleFormCuota.jComboBoxid_estado_cuotaCuota.setEnabled(this.cuotaConstantesFunciones.activarid_estado_cuotaCuota);
		this.jInternalFrameDetalleFormCuota.jComboBoxid_defi_provision_empleadoCuota.setEnabled(this.cuotaConstantesFunciones.activarid_defi_provision_empleadoCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldnumero_cuotaCuota.setEnabled(this.cuotaConstantesFunciones.activarnumero_cuotaCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldcapitalCuota.setEnabled(this.cuotaConstantesFunciones.activarcapitalCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldinteresCuota.setEnabled(this.cuotaConstantesFunciones.activarinteresCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldtotalCuota.setEnabled(this.cuotaConstantesFunciones.activartotalCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldfecha_liquidacionCuota.setEnabled(this.cuotaConstantesFunciones.activarfecha_liquidacionCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldmonto_ajusteCuota.setEnabled(this.cuotaConstantesFunciones.activarmonto_ajusteCuota);
		this.jInternalFrameDetalleFormCuota.jTextFieldinteres_ajusteCuota.setEnabled(this.cuotaConstantesFunciones.activarinteres_ajusteCuota);
		this.jInternalFrameDetalleFormCuota.jDateChooserfecha_vencimientoCuota.setEnabled(this.cuotaConstantesFunciones.activarfecha_vencimientoCuota);
		this.jInternalFrameDetalleFormCuota.jTextAreadescripcionCuota.setEnabled(this.cuotaConstantesFunciones.activardescripcionCuota);
		}
	}
	
		
}