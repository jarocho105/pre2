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

import com.bydan.erp.cartera.util.PreguntaEvaluacionConstantesFunciones;
import com.bydan.erp.cartera.util.PreguntaEvaluacionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.PreguntaEvaluacionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.PreguntaEvaluacionBean;
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
public class PreguntaEvaluacionBeanSwingJInternalFrame extends PreguntaEvaluacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PreguntaEvaluacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PreguntaEvaluacion> preguntaevaluacionValidator = new ClassValidator<PreguntaEvaluacion>(PreguntaEvaluacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PreguntaEvaluacion preguntaevaluacion;	
	public PreguntaEvaluacion preguntaevaluacionAux;
	public PreguntaEvaluacion preguntaevaluacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PreguntaEvaluacion preguntaevaluacionTotales;
	public Long idPreguntaEvaluacionActual;
	public Long iIdNuevoPreguntaEvaluacion=0L;
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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleEvaluacionProveedor=false;

	public Boolean getIsTienePermisosDetalleEvaluacionProveedor() {
		return isTienePermisosDetalleEvaluacionProveedor;
	}

	public void setIsTienePermisosDetalleEvaluacionProveedor(Boolean isTienePermisosDetalleEvaluacionProveedor) {
		this.isTienePermisosDetalleEvaluacionProveedor= isTienePermisosDetalleEvaluacionProveedor;
	}


	public Boolean isTienePermisosSubPreguntaEvaluacion=false;

	public Boolean getIsTienePermisosSubPreguntaEvaluacion() {
		return isTienePermisosSubPreguntaEvaluacion;
	}

	public void setIsTienePermisosSubPreguntaEvaluacion(Boolean isTienePermisosSubPreguntaEvaluacion) {
		this.isTienePermisosSubPreguntaEvaluacion= isTienePermisosSubPreguntaEvaluacion;
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
	
	public Boolean isPermisoTodoPreguntaEvaluacion;
	public Boolean isPermisoNuevoPreguntaEvaluacion;
	public Boolean isPermisoActualizarPreguntaEvaluacion;
	public Boolean isPermisoActualizarOriginalPreguntaEvaluacion;
	public Boolean isPermisoEliminarPreguntaEvaluacion;
	public Boolean isPermisoGuardarCambiosPreguntaEvaluacion;
	public Boolean isPermisoConsultaPreguntaEvaluacion;
	public Boolean isPermisoBusquedaPreguntaEvaluacion;
	public Boolean isPermisoReportePreguntaEvaluacion;
	public Boolean isPermisoPaginacionMedioPreguntaEvaluacion;
	public Boolean isPermisoPaginacionAltoPreguntaEvaluacion;
	public Boolean isPermisoPaginacionTodoPreguntaEvaluacion;
	public Boolean isPermisoCopiarPreguntaEvaluacion;
	public Boolean isPermisoVerFormPreguntaEvaluacion;
	public Boolean isPermisoDuplicarPreguntaEvaluacion;
	public Boolean isPermisoOrdenPreguntaEvaluacion;
	
	
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
	
	public PreguntaEvaluacionParameterReturnGeneral preguntaevaluacionReturnGeneral;
	public PreguntaEvaluacionParameterReturnGeneral preguntaevaluacionParameterGeneral;
	
	

	public DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic=null;

	public DetalleEvaluacionProveedorLogic getDetalleEvaluacionProveedorLogic() {
		return detalleevaluacionproveedorLogic;
	}

	public void setDetalleEvaluacionProveedorLogic(DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic) {
		this.detalleevaluacionproveedorLogic = detalleevaluacionproveedorLogic;
	}


	public SubPreguntaEvaluacionLogic subpreguntaevaluacionLogic=null;

	public SubPreguntaEvaluacionLogic getSubPreguntaEvaluacionLogic() {
		return subpreguntaevaluacionLogic;
	}

	public void setSubPreguntaEvaluacionLogic(SubPreguntaEvaluacionLogic subpreguntaevaluacionLogic) {
		this.subpreguntaevaluacionLogic = subpreguntaevaluacionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPreguntaEvaluacion=false;
	public Boolean esParaAccionDesdeFormularioPreguntaEvaluacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PreguntaEvaluacionSessionBeanAdditional preguntaevaluacionSessionBeanAdditional=null;
	
	public PreguntaEvaluacionSessionBeanAdditional getPreguntaEvaluacionSessionBeanAdditional() {
		return this.preguntaevaluacionSessionBeanAdditional;
	}
	
	public void setPreguntaEvaluacionSessionBeanAdditional(PreguntaEvaluacionSessionBeanAdditional preguntaevaluacionSessionBeanAdditional) {
		try {
			this.preguntaevaluacionSessionBeanAdditional=preguntaevaluacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PreguntaEvaluacionBeanSwingJInternalFrameAdditional preguntaevaluacionBeanSwingJInternalFrameAdditional=null;
	//public class PreguntaEvaluacionBeanSwingJInternalFrame
	
	public PreguntaEvaluacionBeanSwingJInternalFrameAdditional getPreguntaEvaluacionBeanSwingJInternalFrameAdditional() {
		return this.preguntaevaluacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setPreguntaEvaluacionBeanSwingJInternalFrameAdditional(PreguntaEvaluacionBeanSwingJInternalFrameAdditional preguntaevaluacionBeanSwingJInternalFrameAdditional) {
		try {
			this.preguntaevaluacionBeanSwingJInternalFrameAdditional=preguntaevaluacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PreguntaEvaluacionLogic preguntaevaluacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PreguntaEvaluacion preguntaevaluacionBean;
	public PreguntaEvaluacionConstantesFunciones preguntaevaluacionConstantesFunciones;
	//public PreguntaEvaluacionParameterReturnGeneral preguntaevaluacionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<PreguntaEvaluacion> preguntaevaluacions;	
	//public List<PreguntaEvaluacion> preguntaevaluacionsEliminados;
	//public List<PreguntaEvaluacion> preguntaevaluacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaDuplicarPreguntaEvaluacion=true;
	public Boolean isVisibilidadCeldaCopiarPreguntaEvaluacion=true;
	public Boolean isVisibilidadCeldaVerFormPreguntaEvaluacion=true;
	public Boolean isVisibilidadCeldaOrdenPreguntaEvaluacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaModificarPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaActualizarPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaCancelarPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaGuardarPreguntaEvaluacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=false;
	public Boolean isVisibilidadBusquedaPorPregunta=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPreguntaEvaluacion() {
		return this.iIdNuevoPreguntaEvaluacion;
	}

	public void setiIdNuevoPreguntaEvaluacion(Long iIdNuevoPreguntaEvaluacion) {
		this.iIdNuevoPreguntaEvaluacion = iIdNuevoPreguntaEvaluacion;
	}
	
	public Long getidPreguntaEvaluacionActual() {
		return this.idPreguntaEvaluacionActual;
	}

	public void setidPreguntaEvaluacionActual(Long idPreguntaEvaluacionActual) {
		this.idPreguntaEvaluacionActual = idPreguntaEvaluacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PreguntaEvaluacion getpreguntaevaluacion() {
		return this.preguntaevaluacion;
	}

	public void setpreguntaevaluacion(PreguntaEvaluacion preguntaevaluacion) {
		this.preguntaevaluacion = preguntaevaluacion;
	}
	
	public PreguntaEvaluacion getpreguntaevaluacionAux() {
		return this.preguntaevaluacionAux;
	}

	public void setpreguntaevaluacionAux(PreguntaEvaluacion preguntaevaluacionAux) {
		this.preguntaevaluacionAux = preguntaevaluacionAux;
	}				
	
	public PreguntaEvaluacion getpreguntaevaluacionAnterior() {
		return this.preguntaevaluacionAnterior;
	}

	public void setpreguntaevaluacionAnterior(PreguntaEvaluacion preguntaevaluacionAnterior) {
		this.preguntaevaluacionAnterior = preguntaevaluacionAnterior;
	}	
	
	public PreguntaEvaluacion getpreguntaevaluacionTotales() {
		return this.preguntaevaluacionTotales;
	}

	public void setpreguntaevaluacionTotales(PreguntaEvaluacion preguntaevaluacionTotales) {
		this.preguntaevaluacionTotales = preguntaevaluacionTotales;
	}	
	
	public PreguntaEvaluacion getpreguntaevaluacionBean() {
		return this.preguntaevaluacionBean;
	}

	public void setpreguntaevaluacionBean(PreguntaEvaluacion preguntaevaluacionBean) {
		this.preguntaevaluacionBean = preguntaevaluacionBean;
	}	
	
	public PreguntaEvaluacionParameterReturnGeneral getpreguntaevaluacionReturnGeneral() {
		return this.preguntaevaluacionReturnGeneral;
	}

	public void setpreguntaevaluacionReturnGeneral(PreguntaEvaluacionParameterReturnGeneral preguntaevaluacionReturnGeneral) {
		this.preguntaevaluacionReturnGeneral = preguntaevaluacionReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo=-1L;

	public Long getid_ejercicioBusquedaPorIdEjercicioPorIdPeriodo() {
		return this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo;
	}

	public void setid_ejercicioBusquedaPorIdEjercicioPorIdPeriodo(Long id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo) {
		this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo = id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo;
	}

;
	public Long id_periodoBusquedaPorIdEjercicioPorIdPeriodo=-1L;

	public Long getid_periodoBusquedaPorIdEjercicioPorIdPeriodo() {
		return this.id_periodoBusquedaPorIdEjercicioPorIdPeriodo;
	}

	public void setid_periodoBusquedaPorIdEjercicioPorIdPeriodo(Long id_periodoBusquedaPorIdEjercicioPorIdPeriodo) {
		this.id_periodoBusquedaPorIdEjercicioPorIdPeriodo = id_periodoBusquedaPorIdEjercicioPorIdPeriodo;
	}

	public String preguntaBusquedaPorPregunta="";

	public String getpreguntaBusquedaPorPregunta() {
		return this.preguntaBusquedaPorPregunta;
	}

	public void setpreguntaBusquedaPorPregunta(String preguntaBusquedaPorPregunta) {
		this.preguntaBusquedaPorPregunta = preguntaBusquedaPorPregunta;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
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
	
	
	public PreguntaEvaluacionLogic getPreguntaEvaluacionLogic()	{		
		return preguntaevaluacionLogic;
	}

	public void setPreguntaEvaluacionLogic(PreguntaEvaluacionLogic preguntaevaluacionLogic) {
		this.preguntaevaluacionLogic = preguntaevaluacionLogic;
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
	
	public Boolean getIsEsNuevoPreguntaEvaluacion() {
		return isEsNuevoPreguntaEvaluacion;
	}

	public void setIsEsNuevoPreguntaEvaluacion(Boolean isEsNuevoPreguntaEvaluacion) {
		this.isEsNuevoPreguntaEvaluacion = isEsNuevoPreguntaEvaluacion;
	}

	public Boolean getEsParaAccionDesdeFormularioPreguntaEvaluacion() {
		return esParaAccionDesdeFormularioPreguntaEvaluacion;
	}
	
	public void setEsParaAccionDesdeFormularioPreguntaEvaluacion(Boolean esParaAccionDesdeFormularioPreguntaEvaluacion) {
		this.esParaAccionDesdeFormularioPreguntaEvaluacion = esParaAccionDesdeFormularioPreguntaEvaluacion;
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

			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(preguntaevaluacionSessionBean.getlidEmpresaActual());
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

			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(preguntaevaluacionSessionBean.getlidSucursalActual());
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

			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(preguntaevaluacionSessionBean.getlidEjercicioActual());
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

			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(preguntaevaluacionSessionBean.getlidPeriodoActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(preguntaevaluacionSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(preguntaevaluacionSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.preguntaevaluacion!=null) {
						this.preguntaevaluacion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPreguntaEvaluacion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPreguntaEvaluacionGenerico)throws Exception
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
				jComboBoxid_empresaPreguntaEvaluacionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPreguntaEvaluacionGenerico!=null && jComboBoxid_empresaPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_empresaPreguntaEvaluacionGenerico.setSelectedIndex(0);
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

					if(this.preguntaevaluacion!=null) {
						this.preguntaevaluacion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPreguntaEvaluacion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPreguntaEvaluacionGenerico)throws Exception
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
				jComboBoxid_sucursalPreguntaEvaluacionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPreguntaEvaluacionGenerico!=null && jComboBoxid_sucursalPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPreguntaEvaluacionGenerico.setSelectedIndex(0);
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

					if(this.preguntaevaluacion!=null) {
						this.preguntaevaluacion.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPreguntaEvaluacion.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion!=null) {
						jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion!=null) {
							//jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPreguntaEvaluacionGenerico)throws Exception
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
				jComboBoxid_ejercicioPreguntaEvaluacionGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPreguntaEvaluacionGenerico!=null && jComboBoxid_ejercicioPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPreguntaEvaluacionGenerico.setSelectedIndex(0);
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

					if(this.preguntaevaluacion!=null) {
						this.preguntaevaluacion.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPreguntaEvaluacion.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion!=null) {
						jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion!=null) {
							//jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.getItemCount()>0) {
								jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPreguntaEvaluacionGenerico)throws Exception
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
				jComboBoxid_periodoPreguntaEvaluacionGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPreguntaEvaluacionGenerico!=null && jComboBoxid_periodoPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_periodoPreguntaEvaluacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.preguntaevaluacion!=null) {
						this.preguntaevaluacion.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioPreguntaEvaluacion.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioPreguntaEvaluacionGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioPreguntaEvaluacionGenerico!=null && jComboBoxid_anioPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_anioPreguntaEvaluacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.preguntaevaluacion!=null) {
						this.preguntaevaluacion.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesPreguntaEvaluacion.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesPreguntaEvaluacionGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesPreguntaEvaluacionGenerico!=null && jComboBoxid_mesPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_mesPreguntaEvaluacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PreguntaEvaluacion preguntaevaluacion,JComboBox jComboBoxid_empresaPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPreguntaEvaluacionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				preguntaevaluacion.setid_empresa(empresaAux.getId());
				preguntaevaluacion.setempresa_descripcion(PreguntaEvaluacionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				preguntaevaluacion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PreguntaEvaluacion preguntaevaluacion,JComboBox jComboBoxid_sucursalPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPreguntaEvaluacionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				preguntaevaluacion.setid_sucursal(sucursalAux.getId());
				preguntaevaluacion.setsucursal_descripcion(PreguntaEvaluacionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				preguntaevaluacion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PreguntaEvaluacion preguntaevaluacion,JComboBox jComboBoxid_ejercicioPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPreguntaEvaluacionGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				preguntaevaluacion.setid_ejercicio(ejercicioAux.getId());
				preguntaevaluacion.setejercicio_descripcion(PreguntaEvaluacionConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				preguntaevaluacion.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PreguntaEvaluacion preguntaevaluacion,JComboBox jComboBoxid_periodoPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPreguntaEvaluacionGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				preguntaevaluacion.setid_periodo(periodoAux.getId());
				preguntaevaluacion.setperiodo_descripcion(PreguntaEvaluacionConstantesFunciones.getPeriodoDescripcion(periodoAux));
				preguntaevaluacion.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(PreguntaEvaluacion preguntaevaluacion,JComboBox jComboBoxid_anioPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioPreguntaEvaluacionGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				preguntaevaluacion.setid_anio(anioAux.getId());
				preguntaevaluacion.setanio_descripcion(PreguntaEvaluacionConstantesFunciones.getAnioDescripcion(anioAux));
				preguntaevaluacion.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(PreguntaEvaluacion preguntaevaluacion,JComboBox jComboBoxid_mesPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesPreguntaEvaluacionGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				preguntaevaluacion.setid_mes(mesAux.getId());
				preguntaevaluacion.setmes_descripcion(PreguntaEvaluacionConstantesFunciones.getMesDescripcion(mesAux));
				preguntaevaluacion.setMes(mesAux);			}
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

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
					}

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
					}

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
					}

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.addItem(ejercicio);
							}
						}

						if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
					}

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.addItem(periodo);
							}
						}

						if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
					}

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { 
					}

					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPreguntaEvaluacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PreguntaEvaluacionConstantesFunciones.refrescarForeignKeysDescripcionesPreguntaEvaluacion(this.preguntaevaluacionLogic.getPreguntaEvaluacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PreguntaEvaluacionConstantesFunciones.refrescarForeignKeysDescripcionesPreguntaEvaluacion(this.preguntaevaluacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//preguntaevaluacionLogic.setPreguntaEvaluacions(this.preguntaevaluacions);
			preguntaevaluacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PreguntaEvaluacionParameterReturnGeneral getPreguntaEvaluacionParameterGeneral() {
		return this.preguntaevaluacionParameterGeneral;
	}
	
	public void setPreguntaEvaluacionParameterGeneral(PreguntaEvaluacionParameterReturnGeneral preguntaevaluacionParameterGeneral) {
		this.preguntaevaluacionParameterGeneral = preguntaevaluacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPreguntaEvaluacion() {
		return isPermisoTodoPreguntaEvaluacion;
	}

	public void setIsPermisoTodoPreguntaEvaluacion(Boolean isPermisoTodoPreguntaEvaluacion) {
		this.isPermisoTodoPreguntaEvaluacion = isPermisoTodoPreguntaEvaluacion;
	}

	public Boolean getIsPermisoNuevoPreguntaEvaluacion() {
		return isPermisoNuevoPreguntaEvaluacion;
	}

	public void setIsPermisoNuevoPreguntaEvaluacion(Boolean isPermisoNuevoPreguntaEvaluacion) {
		this.isPermisoNuevoPreguntaEvaluacion = isPermisoNuevoPreguntaEvaluacion;
	}

	public Boolean getIsPermisoActualizarPreguntaEvaluacion() {
		return isPermisoActualizarPreguntaEvaluacion;
	}

	public void setIsPermisoActualizarPreguntaEvaluacion(Boolean isPermisoActualizarPreguntaEvaluacion) {
		this.isPermisoActualizarPreguntaEvaluacion = isPermisoActualizarPreguntaEvaluacion;
	}

	public Boolean getIsPermisoEliminarPreguntaEvaluacion() {
		return isPermisoEliminarPreguntaEvaluacion;
	}

	public void setIsPermisoEliminarPreguntaEvaluacion(Boolean isPermisoEliminarPreguntaEvaluacion) {
		this.isPermisoEliminarPreguntaEvaluacion = isPermisoEliminarPreguntaEvaluacion;
	}

	public Boolean getIsPermisoGuardarCambiosPreguntaEvaluacion() {
		return isPermisoGuardarCambiosPreguntaEvaluacion;
	}

	public void setIsPermisoGuardarCambiosPreguntaEvaluacion(Boolean isPermisoGuardarCambiosPreguntaEvaluacion) {
		this.isPermisoGuardarCambiosPreguntaEvaluacion = isPermisoGuardarCambiosPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoConsultaPreguntaEvaluacion() {
		return isPermisoConsultaPreguntaEvaluacion;
	}

	public void setIsPermisoConsultaPreguntaEvaluacion(Boolean isPermisoConsultaPreguntaEvaluacion) {
		this.isPermisoConsultaPreguntaEvaluacion = isPermisoConsultaPreguntaEvaluacion;
	}

	public Boolean getIsPermisoBusquedaPreguntaEvaluacion() {
		return isPermisoBusquedaPreguntaEvaluacion;
	}

	public void setIsPermisoBusquedaPreguntaEvaluacion(Boolean isPermisoBusquedaPreguntaEvaluacion) {
		this.isPermisoBusquedaPreguntaEvaluacion = isPermisoBusquedaPreguntaEvaluacion;
	}

	public Boolean getIsPermisoReportePreguntaEvaluacion() {
		return isPermisoReportePreguntaEvaluacion;
	}

	public void setIsPermisoReportePreguntaEvaluacion(Boolean isPermisoReportePreguntaEvaluacion) {
		this.isPermisoReportePreguntaEvaluacion = isPermisoReportePreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioPreguntaEvaluacion() {
		return isPermisoPaginacionMedioPreguntaEvaluacion;
	}

	public void setIsPermisoPaginacionMedioPreguntaEvaluacion(Boolean isPermisoPaginacionMedioPreguntaEvaluacion) {
		this.isPermisoPaginacionMedioPreguntaEvaluacion = isPermisoPaginacionMedioPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoPreguntaEvaluacion() {
		return isPermisoPaginacionTodoPreguntaEvaluacion;
	}

	public void setIsPermisoPaginacionTodoPreguntaEvaluacion(Boolean isPermisoPaginacionTodoPreguntaEvaluacion) {
		this.isPermisoPaginacionTodoPreguntaEvaluacion = isPermisoPaginacionTodoPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoPreguntaEvaluacion() {
		return isPermisoPaginacionAltoPreguntaEvaluacion;
	}

	public void setIsPermisoPaginacionAltoPreguntaEvaluacion(Boolean isPermisoPaginacionAltoPreguntaEvaluacion) {
		this.isPermisoPaginacionAltoPreguntaEvaluacion = isPermisoPaginacionAltoPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoCopiarPreguntaEvaluacion() {
		return isPermisoCopiarPreguntaEvaluacion;
	}

	public void setIsPermisoCopiarPreguntaEvaluacion(Boolean isPermisoCopiarPreguntaEvaluacion) {
		this.isPermisoCopiarPreguntaEvaluacion = isPermisoCopiarPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoVerFormPreguntaEvaluacion() {
		return isPermisoVerFormPreguntaEvaluacion;
	}

	public void setIsPermisoVerFormPreguntaEvaluacion(Boolean isPermisoVerFormPreguntaEvaluacion) {
		this.isPermisoVerFormPreguntaEvaluacion = isPermisoVerFormPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoDuplicarPreguntaEvaluacion() {
		return isPermisoDuplicarPreguntaEvaluacion;
	}

	public void setIsPermisoDuplicarPreguntaEvaluacion(Boolean isPermisoDuplicarPreguntaEvaluacion) {
		this.isPermisoDuplicarPreguntaEvaluacion = isPermisoDuplicarPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoOrdenPreguntaEvaluacion() {
		return isPermisoOrdenPreguntaEvaluacion;
	}

	public void setIsPermisoOrdenPreguntaEvaluacion(Boolean isPermisoOrdenPreguntaEvaluacion) {
		this.isPermisoOrdenPreguntaEvaluacion = isPermisoOrdenPreguntaEvaluacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPreguntaEvaluacion() {
		return isVisibilidadCeldaNuevoPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaNuevoPreguntaEvaluacion(Boolean isVisibilidadCeldaNuevoPreguntaEvaluacion) {
		this.isVisibilidadCeldaNuevoPreguntaEvaluacion = isVisibilidadCeldaNuevoPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPreguntaEvaluacion() {
		return isVisibilidadCeldaDuplicarPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaDuplicarPreguntaEvaluacion(Boolean isVisibilidadCeldaDuplicarPreguntaEvaluacion) {
		this.isVisibilidadCeldaDuplicarPreguntaEvaluacion = isVisibilidadCeldaDuplicarPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPreguntaEvaluacion() {
		return isVisibilidadCeldaCopiarPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaCopiarPreguntaEvaluacion(Boolean isVisibilidadCeldaCopiarPreguntaEvaluacion) {
		this.isVisibilidadCeldaCopiarPreguntaEvaluacion = isVisibilidadCeldaCopiarPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPreguntaEvaluacion() {
		return isVisibilidadCeldaVerFormPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaVerFormPreguntaEvaluacion(Boolean isVisibilidadCeldaVerFormPreguntaEvaluacion) {
		this.isVisibilidadCeldaVerFormPreguntaEvaluacion = isVisibilidadCeldaVerFormPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPreguntaEvaluacion() {
		return isVisibilidadCeldaOrdenPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaOrdenPreguntaEvaluacion(Boolean isVisibilidadCeldaOrdenPreguntaEvaluacion) {
		this.isVisibilidadCeldaOrdenPreguntaEvaluacion = isVisibilidadCeldaOrdenPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion() {
		return isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion(Boolean isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion) {
		this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion = isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPreguntaEvaluacion() {
		return isVisibilidadCeldaModificarPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaModificarPreguntaEvaluacion(Boolean isVisibilidadCeldaModificarPreguntaEvaluacion) {
		this.isVisibilidadCeldaModificarPreguntaEvaluacion = isVisibilidadCeldaModificarPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPreguntaEvaluacion() {
		return isVisibilidadCeldaActualizarPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaActualizarPreguntaEvaluacion(Boolean isVisibilidadCeldaActualizarPreguntaEvaluacion) {
		this.isVisibilidadCeldaActualizarPreguntaEvaluacion = isVisibilidadCeldaActualizarPreguntaEvaluacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarPreguntaEvaluacion() {
		return isVisibilidadCeldaEliminarPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaEliminarPreguntaEvaluacion(Boolean isVisibilidadCeldaEliminarPreguntaEvaluacion) {
		this.isVisibilidadCeldaEliminarPreguntaEvaluacion = isVisibilidadCeldaEliminarPreguntaEvaluacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarPreguntaEvaluacion() {
		return isVisibilidadCeldaCancelarPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaCancelarPreguntaEvaluacion(Boolean isVisibilidadCeldaCancelarPreguntaEvaluacion) {
		this.isVisibilidadCeldaCancelarPreguntaEvaluacion = isVisibilidadCeldaCancelarPreguntaEvaluacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarPreguntaEvaluacion() {
		return isVisibilidadCeldaGuardarPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaGuardarPreguntaEvaluacion(Boolean isVisibilidadCeldaGuardarPreguntaEvaluacion) {
		this.isVisibilidadCeldaGuardarPreguntaEvaluacion = isVisibilidadCeldaGuardarPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPreguntaEvaluacion() {
		return isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPreguntaEvaluacion(Boolean isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion) {
		this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion = isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion;
	}
		
	public PreguntaEvaluacionSessionBean getpreguntaevaluacionSessionBean() {
		return this.preguntaevaluacionSessionBean;
	}
	
	public void setpreguntaevaluacionSessionBean(PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean) {
		this.preguntaevaluacionSessionBean=preguntaevaluacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdEjercicioPorIdPeriodo() {
		return this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo;
	}

	public void setisVisibilidadBusquedaPorIdEjercicioPorIdPeriodo(Boolean isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {
		this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo;
	}

	public Boolean getisVisibilidadBusquedaPorPregunta() {
		return this.isVisibilidadBusquedaPorPregunta;
	}

	public void setisVisibilidadBusquedaPorPregunta(Boolean isVisibilidadBusquedaPorPregunta) {
		this.isVisibilidadBusquedaPorPregunta=isVisibilidadBusquedaPorPregunta;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(preguntaevaluacion,null);
				this.setActualParaGuardarSucursalForeignKey(preguntaevaluacion,null);
				this.setActualParaGuardarEjercicioForeignKey(preguntaevaluacion,null);
				this.setActualParaGuardarPeriodoForeignKey(preguntaevaluacion,null);
				this.setActualParaGuardarAnioForeignKey(preguntaevaluacion,null);
				this.setActualParaGuardarMesForeignKey(preguntaevaluacion,null);
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
	
	public void bugActualizarReferenciaActual(PreguntaEvaluacion preguntaevaluacion,PreguntaEvaluacion preguntaevaluacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPreguntaEvaluacion(preguntaevaluacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		preguntaevaluacionAux.setId(preguntaevaluacion.getId());
		preguntaevaluacionAux.setVersionRow(preguntaevaluacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPreguntaEvaluacion();
		
			int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = preguntaevaluacionValidator.getInvalidValues(this.preguntaevaluacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			preguntaevaluacionLogic.setDatosCliente(datosCliente);
			preguntaevaluacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				preguntaevaluacionAux=new  PreguntaEvaluacion();
				
				preguntaevaluacionAux.setIsNew(true);
				preguntaevaluacionAux.setIsChanged(true);
				
				preguntaevaluacionAux.setPreguntaEvaluacionOriginal(this.preguntaevaluacion);
				
				preguntaevaluacionAux.setId(this.preguntaevaluacion.getId());	
				preguntaevaluacionAux.setVersionRow(this.preguntaevaluacion.getVersionRow());	
				preguntaevaluacionAux.setid_empresa(this.preguntaevaluacion.getid_empresa());	
				preguntaevaluacionAux.setid_sucursal(this.preguntaevaluacion.getid_sucursal());	
				preguntaevaluacionAux.setid_ejercicio(this.preguntaevaluacion.getid_ejercicio());	
				preguntaevaluacionAux.setid_periodo(this.preguntaevaluacion.getid_periodo());	
				preguntaevaluacionAux.setpregunta(this.preguntaevaluacion.getpregunta());	
				preguntaevaluacionAux.setcalificacion(this.preguntaevaluacion.getcalificacion());	
				preguntaevaluacionAux.setorden(this.preguntaevaluacion.getorden());	
				preguntaevaluacionAux.setid_anio(this.preguntaevaluacion.getid_anio());	
				preguntaevaluacionAux.setid_mes(this.preguntaevaluacion.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.preguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(preguntaevaluacionAux,preguntaevaluacionLogic.getPreguntaEvaluacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntaevaluacionAux,preguntaevaluacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionLogic.savePreguntaEvaluacions();//WithConnection
						//preguntaevaluacionLogic.getSetVersionRowPreguntaEvaluacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.preguntaevaluacion,preguntaevaluacionAux);
					
					this.refrescarForeignKeysDescripcionesPreguntaEvaluacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacions.addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntaevaluacionLogic.savePreguntaEvaluacionRelaciones(preguntaevaluacionAux,this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());//WithConnection
								//preguntaevaluacionLogic.getSetVersionRowPreguntaEvaluacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.preguntaevaluacion,preguntaevaluacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacions= new ArrayList<SubPreguntaEvaluacion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntaevaluacionAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());

							if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntaevaluacionAux.setSubPreguntaEvaluacions(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.preguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(preguntaevaluacionAux,preguntaevaluacionLogic.getPreguntaEvaluacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(preguntaevaluacionAux,preguntaevaluacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.preguntaevaluacion,preguntaevaluacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				preguntaevaluacionAux=new  PreguntaEvaluacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() 
					|| (this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() && this.preguntaevaluacion.getId()>=0)) {
						
					preguntaevaluacionAux.setIsNew(false);
				}
				
				preguntaevaluacionAux.setIsDeleted(false);
			
				preguntaevaluacionAux.setId(this.preguntaevaluacion.getId());	
				preguntaevaluacionAux.setVersionRow(this.preguntaevaluacion.getVersionRow());	
				preguntaevaluacionAux.setid_empresa(this.preguntaevaluacion.getid_empresa());	
				preguntaevaluacionAux.setid_sucursal(this.preguntaevaluacion.getid_sucursal());	
				preguntaevaluacionAux.setid_ejercicio(this.preguntaevaluacion.getid_ejercicio());	
				preguntaevaluacionAux.setid_periodo(this.preguntaevaluacion.getid_periodo());	
				preguntaevaluacionAux.setpregunta(this.preguntaevaluacion.getpregunta());	
				preguntaevaluacionAux.setcalificacion(this.preguntaevaluacion.getcalificacion());	
				preguntaevaluacionAux.setorden(this.preguntaevaluacion.getorden());	
				preguntaevaluacionAux.setid_anio(this.preguntaevaluacion.getid_anio());	
				preguntaevaluacionAux.setid_mes(this.preguntaevaluacion.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(preguntaevaluacionAux,preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntaevaluacionAux,preguntaevaluacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionLogic.savePreguntaEvaluacions();//WithConnection
						//preguntaevaluacionLogic.getSetVersionRowPreguntaEvaluacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.preguntaevaluacion,preguntaevaluacionAux);
					
					this.refrescarForeignKeysDescripcionesPreguntaEvaluacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacions.addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntaevaluacionLogic.savePreguntaEvaluacionRelaciones(preguntaevaluacionAux,this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());//WithConnection
								//preguntaevaluacionLogic.getSetVersionRowPreguntaEvaluacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.preguntaevaluacion,preguntaevaluacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacions= new ArrayList<SubPreguntaEvaluacion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntaevaluacionAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());

							if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntaevaluacionAux.setSubPreguntaEvaluacions(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.preguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(preguntaevaluacionAux,preguntaevaluacionLogic.getPreguntaEvaluacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(preguntaevaluacionAux,preguntaevaluacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.preguntaevaluacion,preguntaevaluacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				preguntaevaluacionAux=new  PreguntaEvaluacion();
				
				preguntaevaluacionAux.setIsNew(false);
				preguntaevaluacionAux.setIsChanged(false);
				
				preguntaevaluacionAux.setIsDeleted(true);
				
				preguntaevaluacionAux.setId(this.preguntaevaluacion.getId());	
				preguntaevaluacionAux.setVersionRow(this.preguntaevaluacion.getVersionRow());	
				preguntaevaluacionAux.setid_empresa(this.preguntaevaluacion.getid_empresa());	
				preguntaevaluacionAux.setid_sucursal(this.preguntaevaluacion.getid_sucursal());	
				preguntaevaluacionAux.setid_ejercicio(this.preguntaevaluacion.getid_ejercicio());	
				preguntaevaluacionAux.setid_periodo(this.preguntaevaluacion.getid_periodo());	
				preguntaevaluacionAux.setpregunta(this.preguntaevaluacion.getpregunta());	
				preguntaevaluacionAux.setcalificacion(this.preguntaevaluacion.getcalificacion());	
				preguntaevaluacionAux.setorden(this.preguntaevaluacion.getorden());	
				preguntaevaluacionAux.setid_anio(this.preguntaevaluacion.getid_anio());	
				preguntaevaluacionAux.setid_mes(this.preguntaevaluacion.getid_mes());	
				
				if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.preguntaevaluacionAux.getId()>=0) {	
						this.preguntaevaluacionsEliminados.add(preguntaevaluacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(preguntaevaluacionAux,preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntaevaluacionAux,preguntaevaluacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionLogic.savePreguntaEvaluacions();//WithConnection
						//preguntaevaluacionLogic.getSetVersionRowPreguntaEvaluacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacions.addAll(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntaevaluacionLogic.savePreguntaEvaluacionRelaciones(preguntaevaluacionAux,this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors(),this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());//WithConnection
								//preguntaevaluacionLogic.getSetVersionRowPreguntaEvaluacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacions= new ArrayList<SubPreguntaEvaluacion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntaevaluacionAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());

							if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.quitarFilaTotales();}
							preguntaevaluacionAux.setSubPreguntaEvaluacions(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.preguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(preguntaevaluacionAux,preguntaevaluacionLogic.getPreguntaEvaluacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(preguntaevaluacionAux,preguntaevaluacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getPreguntaEvaluacions().addAll(this.preguntaevaluacionsEliminados);
					
					preguntaevaluacionLogic.savePreguntaEvaluacions();//WithConnection
					//preguntaevaluacionLogic.getSetVersionRowPreguntaEvaluacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPreguntaEvaluacion();
				
				this.preguntaevaluacionsEliminados= new ArrayList<PreguntaEvaluacion>();		
			}
			
			if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Pregunta Evaluacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.preguntaevaluacion=preguntaevaluacionAux;
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
      		//this.finishProcessPreguntaEvaluacion();
      	}
		
	}	
	
	public void actualizarRelaciones(PreguntaEvaluacion preguntaevaluacionLocal) throws Exception {
		
		if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				preguntaevaluacionLocal.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
				preguntaevaluacionLocal.setSubPreguntaEvaluacions(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
			
			} else {
			
				preguntaevaluacionLocal.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors);
				preguntaevaluacionLocal.setSubPreguntaEvaluacions(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PreguntaEvaluacion preguntaevaluacionLocal) throws Exception {	
		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				preguntaevaluacionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				preguntaevaluacionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				preguntaevaluacionLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				preguntaevaluacionLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				preguntaevaluacionLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				preguntaevaluacionLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPreguntaEvaluacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = preguntaevaluacionValidator.getInvalidValues(this.preguntaevaluacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PreguntaEvaluacion preguntaevaluacion,List<PreguntaEvaluacion> preguntaevaluacions) throws Exception {
		try	{		
			PreguntaEvaluacionConstantesFunciones.actualizarLista(preguntaevaluacion,preguntaevaluacions,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PreguntaEvaluacion preguntaevaluacion,List<PreguntaEvaluacion> preguntaevaluacions) throws Exception {
		try	{			
			PreguntaEvaluacionConstantesFunciones.actualizarSelectedLista(preguntaevaluacion,preguntaevaluacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PreguntaEvaluacion> preguntaevaluacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				preguntaevaluacionsLocal=this.preguntaevaluacionLogic.getPreguntaEvaluacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				preguntaevaluacionsLocal=this.preguntaevaluacions;
			}
			//ARCHITECTURE
		
			for(PreguntaEvaluacion preguntaevaluacionLocal:preguntaevaluacionsLocal) {
				if(this.permiteMantenimiento(preguntaevaluacionLocal) && preguntaevaluacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PreguntaEvaluacionConstantesFunciones.getPreguntaEvaluacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_empresaPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_sucursalPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_ejercicioPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_periodoPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.PREGUNTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelpreguntaPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.CALIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelcalificacionPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelordenPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_anioPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEvaluacionConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_mesPreguntaEvaluacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_empresaPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_sucursalPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_ejercicioPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_periodoPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelpreguntaPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelcalificacionPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelordenPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_anioPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelid_mesPreguntaEvaluacion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleEvaluacionProveedor")) {
			if(this.preguntaevaluacion==null) {
				this.preguntaevaluacion= new PreguntaEvaluacion();
			}

			if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPreguntaEvaluacion
				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);

				this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.getdetalleevaluacionproveedor().setPreguntaEvaluacion(this.preguntaevaluacion);
			}

			return;
		}
		 else  if(sTipo.equals("SubPreguntaEvaluacion")) {
			if(this.preguntaevaluacion==null) {
				this.preguntaevaluacion= new PreguntaEvaluacion();
			}

			if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPreguntaEvaluacion
				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);

				this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.getsubpreguntaevaluacion().setPreguntaEvaluacion(this.preguntaevaluacion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPreguntaEvaluacion--;	
		
		
		this.preguntaevaluacionAux=new PreguntaEvaluacion();
		
		this.preguntaevaluacionAux.setId(this.iIdNuevoPreguntaEvaluacion);
		this.preguntaevaluacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.preguntaevaluacionLogic.getPreguntaEvaluacions().add(this.preguntaevaluacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.preguntaevaluacions.add(this.preguntaevaluacionAux);
		}
		//ARCHITECTURE
		
		this.preguntaevaluacion=this.preguntaevaluacionAux;
		
		if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPreguntaEvaluacion(this.preguntaevaluacion);
			this.setVariablesObjetoActualToFormularioForeignKeyPreguntaEvaluacion(this.preguntaevaluacion);
		}
				
		//this.setDefaultControlesPreguntaEvaluacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPreguntaEvaluacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPreguntaEvaluacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaEvaluacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPreguntaEvaluacion(this.preguntaevaluacionBean,this.preguntaevaluacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
			classes=PreguntaEvaluacionConstantesFunciones.getClassesRelationshipsOfPreguntaEvaluacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.preguntaevaluacionReturnGeneral=preguntaevaluacionLogic.procesarEventosPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntaevaluacionLogic.getPreguntaEvaluacions(),this.preguntaevaluacion,this.preguntaevaluacionParameterGeneral,this.isEsNuevoPreguntaEvaluacion,classes);//this.preguntaevaluacionLogic.getPreguntaEvaluacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral,this.preguntaevaluacionBean,false);
		
		if(this.preguntaevaluacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion());
		}
		
		if(this.preguntaevaluacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion(),classes);//this.preguntaevaluacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPreguntaEvaluacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPreguntaEvaluacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.RecargarFormPreguntaEvaluacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPreguntaEvaluacion(false);
						
			if(preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionProveedorActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() && SubPreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubPreguntaEvaluacionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaEvaluacion();
			}
			
			this.actualizarVisualTableDatosPreguntaEvaluacion();
			
			this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(this.getIndiceNuevoPreguntaEvaluacion(), this.getIndiceNuevoPreguntaEvaluacion());
			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
						
			this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPreguntaEvaluacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextAreapreguntaPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarpreguntaPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldcalificacionPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarcalificacionPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldordenPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarordenPreguntaEvaluacion);	
		//
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarid_empresaPreguntaEvaluacion);//
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarid_sucursalPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarid_ejercicioPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarid_periodoPreguntaEvaluacion);//
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarid_anioPreguntaEvaluacion);//
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setEnabled(isHabilitar && this.preguntaevaluacionConstantesFunciones.activarid_mesPreguntaEvaluacion);
	};
	
	public void setDefaultControlesPreguntaEvaluacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPreguntaEvaluacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.preguntaevaluacionSessionBean.setConGuardarRelaciones(true);			
			this.preguntaevaluacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.preguntaevaluacionSessionBean.setConGuardarRelaciones(false);			
			this.preguntaevaluacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPreguntaEvaluacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
				if(preguntaevaluacionAux.getId().equals(this.iIdNuevoPreguntaEvaluacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacions) {
				if(preguntaevaluacionAux.getId().equals(this.iIdNuevoPreguntaEvaluacion)) {
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
	
	public int getIndiceActualPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
				if(preguntaevaluacionAux.getId().equals(preguntaevaluacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacions) {
				if(preguntaevaluacionAux.getId().equals(preguntaevaluacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
				if(preguntaevaluacionAux.getPreguntaEvaluacionOriginal().getId().equals(preguntaevaluacionOriginal.getId())) {
					existe=true;
					preguntaevaluacionOriginal.setId(preguntaevaluacionAux.getId());
					preguntaevaluacionOriginal.setVersionRow(preguntaevaluacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacions) {
				if(preguntaevaluacionAux.getPreguntaEvaluacionOriginal().getId().equals(preguntaevaluacionOriginal.getId())) {
					existe=true;
					preguntaevaluacionOriginal.setId(preguntaevaluacionAux.getId());
					preguntaevaluacionOriginal.setVersionRow(preguntaevaluacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPreguntaEvaluacion(Boolean esParaCancelar) throws Exception {
		preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
		preguntaevaluacionAux=new PreguntaEvaluacion();
		
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
					if(preguntaevaluacionAux.getId()<0) {
						preguntaevaluacionsAux.add(preguntaevaluacionAux);
					}		
				}
				this.iIdNuevoPreguntaEvaluacion=0L;
				this.preguntaevaluacionLogic.getPreguntaEvaluacions().removeAll(preguntaevaluacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacions) {
					if(preguntaevaluacionAux.getId()<0) {
						preguntaevaluacionsAux.add(preguntaevaluacionAux);
					}		
				}
				this.iIdNuevoPreguntaEvaluacion=0L;
				this.preguntaevaluacions.removeAll(preguntaevaluacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPreguntaEvaluacion 
					&& this.preguntaevaluacionLogic.getPreguntaEvaluacions().size()>0
					) {
					preguntaevaluacionAux=this.preguntaevaluacionLogic.getPreguntaEvaluacions().get(this.preguntaevaluacionLogic.getPreguntaEvaluacions().size() - 1);
				
					if(preguntaevaluacionAux.getId()<0) {
						this.preguntaevaluacionLogic.getPreguntaEvaluacions().remove(preguntaevaluacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPreguntaEvaluacion && this.preguntaevaluacions.size()>0) {
					preguntaevaluacionAux=this.preguntaevaluacions.get(this.preguntaevaluacions.size() - 1);
				
					if(preguntaevaluacionAux.getId()<0) {
						this.preguntaevaluacions.remove(preguntaevaluacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPreguntaEvaluacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(preguntaevaluacion.getId()<0) {
				this.preguntaevaluacionLogic.getPreguntaEvaluacions().remove(this.preguntaevaluacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(preguntaevaluacion.getId()<0) {
				this.preguntaevaluacions.remove(this.preguntaevaluacion);
			}
		}			
	}
	
	public void setEstadosInicialesPreguntaEvaluacion(List<PreguntaEvaluacion> preguntaevaluacionsAux) throws Exception {
		PreguntaEvaluacionConstantesFunciones.setEstadosInicialesPreguntaEvaluacion(preguntaevaluacionsAux);
	}
	
	public void setEstadosInicialesPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacionAux) throws Exception {
		PreguntaEvaluacionConstantesFunciones.setEstadosInicialesPreguntaEvaluacion(preguntaevaluacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPreguntaEvaluacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPreguntaEvaluacionActual()) {
				if(!this.isEsNuevoPreguntaEvaluacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPreguntaEvaluacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPreguntaEvaluacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pregunta Evaluacion ?", "MANTENIMIENTO DE Pregunta Evaluacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PreguntaEvaluacion preguntaevaluacion) throws Exception {
		PreguntaEvaluacionConstantesFunciones.seleccionarAsignar(this.preguntaevaluacion,preguntaevaluacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPreguntaEvaluacion=this.isPermisoActualizarOriginalPreguntaEvaluacion;
			
			
			this.seleccionarAsignar(preguntaevaluacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PreguntaEvaluacionConstantesFunciones.quitarEspaciosPreguntaEvaluacion(this.preguntaevaluacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.preguntaevaluacionSessionBean.setsFuncionBusquedaRapida(this.preguntaevaluacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPreguntaEvaluacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPreguntaEvaluacion(esParaCancelar);				
				this.cancelarNuevoPreguntaEvaluacion(esParaCancelar);								
			}
			
			this.preguntaevaluacion=new PreguntaEvaluacion();
			
			this.inicializarPreguntaEvaluacion();
			
			this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPreguntaEvaluacion() throws Exception {
		try {
			PreguntaEvaluacionConstantesFunciones.inicializarPreguntaEvaluacion(this.preguntaevaluacion);
			
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
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.preguntaevaluacionLogic.getPreguntaEvaluacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePreguntaEvaluacions(String sAccionBusqueda,List<PreguntaEvaluacion> preguntaevaluacionsParaReportes) throws Exception {
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
					sPathReporteFinal="PreguntaEvaluacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PreguntaEvaluacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PreguntaEvaluacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PreguntaEvaluacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pregunta Evaluacions");		
		parameters.put("busquedapor", PreguntaEvaluacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleEvaluacionProveedor.class));
			classes.add(new Classe(SubPreguntaEvaluacion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PreguntaEvaluacionLogic preguntaevaluacionLogicAuxiliar=new PreguntaEvaluacionLogic();
					preguntaevaluacionLogicAuxiliar.setDatosCliente(preguntaevaluacionLogic.getDatosCliente());				
					preguntaevaluacionLogicAuxiliar.setPreguntaEvaluacions(preguntaevaluacionsParaReportes);
					
					preguntaevaluacionLogicAuxiliar.cargarRelacionesLoteForeignKeyPreguntaEvaluacionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					preguntaevaluacionsParaReportes=preguntaevaluacionLogicAuxiliar.getPreguntaEvaluacions();
					
					//preguntaevaluacionLogic.getNewConnexionToDeep();
					
					//for (PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsParaReportes) {
					//	preguntaevaluacionLogic.deepLoad(preguntaevaluacion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//preguntaevaluacionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//preguntaevaluacionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleEvaluacionProveedor = AuxiliarReportes.class.getResourceAsStream("DetalleEvaluacionProveedorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleevaluacionproveedor", reportFileDetalleEvaluacionProveedor);

			InputStream reportFileSubPreguntaEvaluacion = AuxiliarReportes.class.getResourceAsStream("SubPreguntaEvaluacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subpreguntaevaluacion", reportFileSubPreguntaEvaluacion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePreguntaEvaluacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PreguntaEvaluacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PreguntaEvaluacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePreguntaEvaluacion=new JRBeanArrayDataSource(PreguntaEvaluacionJInternalFrame.TraerPreguntaEvaluacionBeans(preguntaevaluacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePreguntaEvaluacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PreguntaEvaluacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PreguntaEvaluacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PreguntaEvaluacionBean.TraerPreguntaEvaluacionBeans(preguntaevaluacionsParaReportes).toArray()));
							
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
				this.generarExcelReportePreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,preguntaevaluacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,preguntaevaluacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPreguntaEvaluacionActionPerformed(null);
					//this.generarExcelReportePreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,preguntaevaluacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,preguntaevaluacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,preguntaevaluacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,preguntaevaluacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePreguntaEvaluacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaEvaluacion> preguntaevaluacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaevaluacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaEvaluacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPreguntaEvaluacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PreguntaEvaluacion preguntaevaluacion : preguntaevaluacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PreguntaEvaluacionConstantesFunciones.generarExcelReporteDataPreguntaEvaluacion("NORMAL",row,workbook,preguntaevaluacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPreguntaEvaluacion(String sTipo,Row row,Workbook workbook) {
		
		PreguntaEvaluacionConstantesFunciones.generarExcelReporteHeaderPreguntaEvaluacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPreguntaEvaluacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaEvaluacion> preguntaevaluacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaevaluacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaEvaluacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PreguntaEvaluacion preguntaevaluacion : preguntaevaluacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PreguntaEvaluacionConstantesFunciones.getPreguntaEvaluacionDescripcion(preguntaevaluacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getpregunta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getcalificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEvaluacionConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaevaluacion.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPreguntaEvaluacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaEvaluacion> preguntaevaluacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PreguntaEvaluacion> preguntaevaluacionsRespaldo=null;
		
		classes=PreguntaEvaluacionConstantesFunciones.getClassesRelationshipsOfPreguntaEvaluacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.preguntaevaluacionLogic.setDatosCliente(this.datosCliente);
		this.preguntaevaluacionLogic.setDatosDeep(this.datosDeep);
		this.preguntaevaluacionLogic.setIsConDeep(true);
		
		preguntaevaluacionsRespaldo=this.preguntaevaluacionLogic.getPreguntaEvaluacions();
		
		this.preguntaevaluacionLogic.setPreguntaEvaluacions(preguntaevaluacionsParaReportes);	
		this.preguntaevaluacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		preguntaevaluacionsParaReportes=this.preguntaevaluacionLogic.getPreguntaEvaluacions();
		this.preguntaevaluacionLogic.setPreguntaEvaluacions(preguntaevaluacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaevaluacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaEvaluacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPreguntaEvaluacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PreguntaEvaluacion preguntaevaluacion : preguntaevaluacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPreguntaEvaluacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PreguntaEvaluacionConstantesFunciones.generarExcelReporteDataPreguntaEvaluacion("NORMAL",row,workbook,preguntaevaluacion,cellStyleDataAux);
		
			
			


				//DetalleEvaluacionProveedor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO))) {

				if(preguntaevaluacion.getDetalleEvaluacionProveedors()!=null && preguntaevaluacion.getDetalleEvaluacionProveedors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleEvaluacionProveedorConstantesFunciones.generarExcelReporteHeaderDetalleEvaluacionProveedor("RELACIONADO",row,workbook);
				}

				if(preguntaevaluacion.getDetalleEvaluacionProveedors()!=null) {
					i2=0;
					for(DetalleEvaluacionProveedor detalleevaluacionproveedor : preguntaevaluacion.getDetalleEvaluacionProveedors()) {
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


				//SubPreguntaEvaluacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(preguntaevaluacion.getSubPreguntaEvaluacions()!=null && preguntaevaluacion.getSubPreguntaEvaluacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubPreguntaEvaluacionConstantesFunciones.generarExcelReporteHeaderSubPreguntaEvaluacion("RELACIONADO",row,workbook);
				}

				if(preguntaevaluacion.getSubPreguntaEvaluacions()!=null) {
					i2=0;
					for(SubPreguntaEvaluacion subpreguntaevaluacion : preguntaevaluacion.getSubPreguntaEvaluacions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SubPreguntaEvaluacionConstantesFunciones.generarExcelReporteDataSubPreguntaEvaluacion("RELACIONADO",row,workbook,subpreguntaevaluacion,cellStyleDataAuxHijo);
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
		cell.setCellValue(PreguntaEvaluacionConstantesFunciones.getPreguntaEvaluacionDescripcion(preguntaevaluacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPreguntaEvaluacion() throws Exception {		
		this.startProcessPreguntaEvaluacion(true);
	}
	
	public void startProcessPreguntaEvaluacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPreguntaEvaluacion ,this.jPanelParametrosReportesPreguntaEvaluacion, this.jScrollPanelDatosPreguntaEvaluacion,this.jPanelPaginacionPreguntaEvaluacion, this.jScrollPanelDatosEdicionPreguntaEvaluacion, this.jPanelAccionesPreguntaEvaluacion,this.jPanelAccionesFormularioPreguntaEvaluacion,this.jmenuBarPreguntaEvaluacion,this.jmenuBarDetallePreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,this.jTtoolBarDetallePreguntaEvaluacion);		
		
		final JTabbedPane jTabbedPaneBusquedasPreguntaEvaluacion=this.jTabbedPaneBusquedasPreguntaEvaluacion; 
		
		final JPanel jPanelParametrosReportesPreguntaEvaluacion=this.jPanelParametrosReportesPreguntaEvaluacion;
		//final JScrollPane jScrollPanelDatosPreguntaEvaluacion=this.jScrollPanelDatosPreguntaEvaluacion;
		final JTable jTableDatosPreguntaEvaluacion=this.jTableDatosPreguntaEvaluacion;		
		final JPanel jPanelPaginacionPreguntaEvaluacion=this.jPanelPaginacionPreguntaEvaluacion;
		//final JScrollPane jScrollPanelDatosEdicionPreguntaEvaluacion=this.jScrollPanelDatosEdicionPreguntaEvaluacion;
		final JPanel jPanelAccionesPreguntaEvaluacion=this.jPanelAccionesPreguntaEvaluacion;
		
		JPanel jPanelCamposAuxiliarPreguntaEvaluacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPreguntaEvaluacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			jPanelCamposAuxiliarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelCamposPreguntaEvaluacion;
			jPanelAccionesFormularioAuxiliarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelAccionesFormularioPreguntaEvaluacion;
		}
		
		final JPanel jPanelCamposPreguntaEvaluacion=jPanelCamposAuxiliarPreguntaEvaluacion;
		final JPanel jPanelAccionesFormularioPreguntaEvaluacion=jPanelAccionesFormularioAuxiliarPreguntaEvaluacion;
		
		
		final JMenuBar jmenuBarPreguntaEvaluacion=this.jmenuBarPreguntaEvaluacion;
		final JToolBar jTtoolBarPreguntaEvaluacion=this.jTtoolBarPreguntaEvaluacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPreguntaEvaluacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPreguntaEvaluacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			jmenuBarDetalleAuxiliarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jmenuBarDetallePreguntaEvaluacion;
			jTtoolBarDetalleAuxiliarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jTtoolBarDetallePreguntaEvaluacion;
		}
		
		final JMenuBar jmenuBarDetallePreguntaEvaluacion=jmenuBarDetalleAuxiliarPreguntaEvaluacion;
		final JToolBar jTtoolBarDetallePreguntaEvaluacion=jTtoolBarDetalleAuxiliarPreguntaEvaluacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPreguntaEvaluacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPreguntaEvaluacion;
			processRunnable.jTableDatos=jTableDatosPreguntaEvaluacion;
			processRunnable.jPanelCampos=jPanelCamposPreguntaEvaluacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPreguntaEvaluacion;
			processRunnable.jPanelAcciones=jPanelAccionesPreguntaEvaluacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPreguntaEvaluacion;
			
			
			processRunnable.jmenuBar=jmenuBarPreguntaEvaluacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePreguntaEvaluacion;
			processRunnable.jTtoolBar=jTtoolBarPreguntaEvaluacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePreguntaEvaluacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPreguntaEvaluacion ,jPanelParametrosReportesPreguntaEvaluacion,jTableDatosPreguntaEvaluacion, /*jScrollPanelDatosPreguntaEvaluacion,*/jPanelCamposPreguntaEvaluacion,jPanelPaginacionPreguntaEvaluacion, /*jScrollPanelDatosEdicionPreguntaEvaluacion,*/ jPanelAccionesPreguntaEvaluacion,jPanelAccionesFormularioPreguntaEvaluacion,jmenuBarPreguntaEvaluacion,jmenuBarDetallePreguntaEvaluacion,jTtoolBarPreguntaEvaluacion,jTtoolBarDetallePreguntaEvaluacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPreguntaEvaluacion ,jPanelParametrosReportesPreguntaEvaluacion, jScrollPanelDatosPreguntaEvaluacion,jPanelPaginacionPreguntaEvaluacion, jScrollPanelDatosEdicionPreguntaEvaluacion, jPanelAccionesPreguntaEvaluacion,jPanelAccionesFormularioPreguntaEvaluacion,jmenuBarPreguntaEvaluacion,jmenuBarDetallePreguntaEvaluacion,jTtoolBarPreguntaEvaluacion,jTtoolBarDetallePreguntaEvaluacion);
						
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
	
	public void finishProcessPreguntaEvaluacion() {// throws Exception 
		this.finishProcessPreguntaEvaluacion(true);
	}
	
	public void finishProcessPreguntaEvaluacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPreguntaEvaluacion ,this.jPanelParametrosReportesPreguntaEvaluacion, this.jScrollPanelDatosPreguntaEvaluacion,this.jPanelPaginacionPreguntaEvaluacion, this.jScrollPanelDatosEdicionPreguntaEvaluacion, this.jPanelAccionesPreguntaEvaluacion,this.jPanelAccionesFormularioPreguntaEvaluacion,this.jmenuBarPreguntaEvaluacion,this.jmenuBarDetallePreguntaEvaluacion,this.jTtoolBarPreguntaEvaluacion,this.jTtoolBarDetallePreguntaEvaluacion);		
		
		final JTabbedPane jTabbedPaneBusquedasPreguntaEvaluacion=this.jTabbedPaneBusquedasPreguntaEvaluacion; 
		
		final JPanel jPanelParametrosReportesPreguntaEvaluacion=this.jPanelParametrosReportesPreguntaEvaluacion;
		//final JScrollPane jScrollPanelDatosPreguntaEvaluacion=this.jScrollPanelDatosPreguntaEvaluacion;
		final JTable jTableDatosPreguntaEvaluacion=this.jTableDatosPreguntaEvaluacion;		
		final JPanel jPanelPaginacionPreguntaEvaluacion=this.jPanelPaginacionPreguntaEvaluacion;
		//final JScrollPane jScrollPanelDatosEdicionPreguntaEvaluacion=this.jScrollPanelDatosEdicionPreguntaEvaluacion;
		final JPanel jPanelAccionesPreguntaEvaluacion=this.jPanelAccionesPreguntaEvaluacion;
		
		JPanel jPanelCamposAuxiliarPreguntaEvaluacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPreguntaEvaluacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			jPanelCamposAuxiliarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelCamposPreguntaEvaluacion;
			jPanelAccionesFormularioAuxiliarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelAccionesFormularioPreguntaEvaluacion;
		}
		
		final JPanel jPanelCamposPreguntaEvaluacion=jPanelCamposAuxiliarPreguntaEvaluacion;
		final JPanel jPanelAccionesFormularioPreguntaEvaluacion=jPanelAccionesFormularioAuxiliarPreguntaEvaluacion;
		
		
		final JMenuBar jmenuBarPreguntaEvaluacion=this.jmenuBarPreguntaEvaluacion;		
		final JToolBar jTtoolBarPreguntaEvaluacion=this.jTtoolBarPreguntaEvaluacion;
				
		JMenuBar jmenuBarDetalleAuxiliarPreguntaEvaluacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPreguntaEvaluacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			jmenuBarDetalleAuxiliarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jmenuBarDetallePreguntaEvaluacion;
			jTtoolBarDetalleAuxiliarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jTtoolBarDetallePreguntaEvaluacion;		
		}
		
		final JMenuBar jmenuBarDetallePreguntaEvaluacion=jmenuBarDetalleAuxiliarPreguntaEvaluacion;
		final JToolBar jTtoolBarDetallePreguntaEvaluacion=jTtoolBarDetalleAuxiliarPreguntaEvaluacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPreguntaEvaluacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPreguntaEvaluacion;
			processRunnable.jTableDatos=jTableDatosPreguntaEvaluacion;
			processRunnable.jPanelCampos=jPanelCamposPreguntaEvaluacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPreguntaEvaluacion;
			processRunnable.jPanelAcciones=jPanelAccionesPreguntaEvaluacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPreguntaEvaluacion;
			
			
			processRunnable.jmenuBar=jmenuBarPreguntaEvaluacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePreguntaEvaluacion;
			processRunnable.jTtoolBar=jTtoolBarPreguntaEvaluacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePreguntaEvaluacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPreguntaEvaluacion ,jPanelParametrosReportesPreguntaEvaluacion, jTableDatosPreguntaEvaluacion,/*jScrollPanelDatosPreguntaEvaluacion,*/jPanelCamposPreguntaEvaluacion,jPanelPaginacionPreguntaEvaluacion, /*jScrollPanelDatosEdicionPreguntaEvaluacion,*/ jPanelAccionesPreguntaEvaluacion,jPanelAccionesFormularioPreguntaEvaluacion,jmenuBarPreguntaEvaluacion,jmenuBarDetallePreguntaEvaluacion,jTtoolBarPreguntaEvaluacion,jTtoolBarDetallePreguntaEvaluacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPreguntaEvaluacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPreguntaEvaluacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPreguntaEvaluacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPreguntaEvaluacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPreguntaEvaluacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePreguntaEvaluacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPreguntaEvaluacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPreguntaEvaluacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePreguntaEvaluacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.preguntaevaluacionConstantesFunciones.getsFinalQueryPreguntaEvaluacion();
		String  finalQueryPaginacionTodos=this.preguntaevaluacionConstantesFunciones.getsFinalQueryPreguntaEvaluacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesNoPreguntaEvaluacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesPreguntaEvaluacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PreguntaEvaluacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.preguntaevaluacionsEliminados= new ArrayList<PreguntaEvaluacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPreguntaEvaluacion();
		
				///*PreguntaEvaluacionSessionBean*/this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			
			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
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
					this.iNumeroPaginacion=PreguntaEvaluacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PreguntaEvaluacionConstantesFunciones.getClassesForeignKeysOfPreguntaEvaluacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/preguntaevaluacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			preguntaevaluacionsAux= new ArrayList<PreguntaEvaluacion>();
			
				
			preguntaevaluacionLogic.setDatosCliente(this.datosCliente);
			preguntaevaluacionLogic.setDatosDeep(this.datosDeep);
			preguntaevaluacionLogic.setIsConDeep(true);
			
			
			preguntaevaluacionLogic.getPreguntaEvaluacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					preguntaevaluacionLogic.getTodosPreguntaEvaluacions(finalQueryGlobal,pagination);
					
					//preguntaevaluacionLogic.getTodosPreguntaEvaluacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(preguntaevaluacionLogic.getPreguntaEvaluacions()==null|| preguntaevaluacionLogic.getPreguntaEvaluacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntaevaluacionsAux= new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacionsAux.addAll(preguntaevaluacionLogic.getPreguntaEvaluacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacionsAux= new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacionsAux.addAll(preguntaevaluacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntaevaluacionLogic.getTodosPreguntaEvaluacions(finalQueryGlobal+"",this.pagination);												
							
							//preguntaevaluacionLogic.getTodosPreguntaEvaluacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePreguntaEvaluacions("Todos",preguntaevaluacionLogic.getPreguntaEvaluacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntaevaluacionLogic.setPreguntaEvaluacions(new ArrayList<PreguntaEvaluacion>());					
							preguntaevaluacionLogic.getPreguntaEvaluacions().addAll(preguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacions.addAll(preguntaevaluacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPreguntaEvaluacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPreguntaEvaluacion=this.idActual;
				
				} else if(this.idPreguntaEvaluacionActual!=null && this.idPreguntaEvaluacionActual!=0L) {
					idPreguntaEvaluacion=idPreguntaEvaluacionActual;
				}
				
					
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndicePorId(idPreguntaEvaluacion);
				
				this.preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					preguntaevaluacionLogic.getEntity(idPreguntaEvaluacion);
					
					//preguntaevaluacionLogic.getEntityWithConnection(idPreguntaEvaluacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.setPreguntaEvaluacions(new ArrayList<PreguntaEvaluacion>());
					preguntaevaluacionLogic.getPreguntaEvaluacions().add(preguntaevaluacionLogic.getPreguntaEvaluacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
					this.preguntaevaluacions.add(preguntaevaluacion);
				}
				
				if(preguntaevaluacionLogic.getPreguntaEvaluacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo")) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntaevaluacionLogic.getPreguntaEvaluacionsBusquedaPorIdEjercicioPorIdPeriodo(finalQueryGlobal,pagination,id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntaevaluacionLogic.getPreguntaEvaluacions()==null||preguntaevaluacionLogic.getPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntaevaluacions==null|| preguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
						preguntaevaluacionsAux.addAll(preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacionsAux.addAll(preguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntaevaluacionLogic.getPreguntaEvaluacionsBusquedaPorIdEjercicioPorIdPeriodo(finalQueryGlobal,pagination,id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaEvaluacions("BusquedaPorIdEjercicioPorIdPeriodo",preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaEvaluacions("BusquedaPorIdEjercicioPorIdPeriodo",preguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionLogic.setPreguntaEvaluacions(new ArrayList<PreguntaEvaluacion>());
						preguntaevaluacionLogic.getPreguntaEvaluacions().addAll(preguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacions.addAll(preguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorPregunta")) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorPregunta(preguntaBusquedaPorPregunta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntaevaluacionLogic.getPreguntaEvaluacionsBusquedaPorPregunta(finalQueryGlobal,pagination,preguntaBusquedaPorPregunta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorPregunta(preguntaBusquedaPorPregunta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorPregunta(preguntaBusquedaPorPregunta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntaevaluacionLogic.getPreguntaEvaluacions()==null||preguntaevaluacionLogic.getPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntaevaluacions==null|| preguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
						preguntaevaluacionsAux.addAll(preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacionsAux.addAll(preguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntaevaluacionLogic.getPreguntaEvaluacionsBusquedaPorPregunta(finalQueryGlobal,pagination,preguntaBusquedaPorPregunta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorPregunta(preguntaBusquedaPorPregunta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceBusquedaPorPregunta(preguntaBusquedaPorPregunta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaEvaluacions("BusquedaPorPregunta",preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaEvaluacions("BusquedaPorPregunta",preguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionLogic.setPreguntaEvaluacions(new ArrayList<PreguntaEvaluacion>());
						preguntaevaluacionLogic.getPreguntaEvaluacions().addAll(preguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacions.addAll(preguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntaevaluacionLogic.getPreguntaEvaluacions()==null||preguntaevaluacionLogic.getPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntaevaluacions==null|| preguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
						preguntaevaluacionsAux.addAll(preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacionsAux.addAll(preguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaEvaluacions("FK_IdEmpresa",preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaEvaluacions("FK_IdEmpresa",preguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionLogic.setPreguntaEvaluacions(new ArrayList<PreguntaEvaluacion>());
						preguntaevaluacionLogic.getPreguntaEvaluacions().addAll(preguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacions.addAll(preguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntaevaluacionLogic.getPreguntaEvaluacions()==null||preguntaevaluacionLogic.getPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntaevaluacions==null|| preguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
						preguntaevaluacionsAux.addAll(preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacionsAux=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacionsAux.addAll(preguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaEvaluacions("FK_IdSucursal",preguntaevaluacionLogic.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaEvaluacions("FK_IdSucursal",preguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionLogic.setPreguntaEvaluacions(new ArrayList<PreguntaEvaluacion>());
						preguntaevaluacionLogic.getPreguntaEvaluacions().addAll(preguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
							preguntaevaluacions.addAll(preguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPreguntaEvaluacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPreguntaEvaluacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=preguntaevaluacionLogic.getPreguntaEvaluacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntaevaluacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=preguntaevaluacionLogic.getPreguntaEvaluacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntaevaluacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PreguntaEvaluacion preguntaevaluacion) {
		Boolean permite=true;
		
		if(this.preguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PreguntaEvaluacionConstantesFunciones.getOrderByListaPreguntaEvaluacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PreguntaEvaluacionConstantesFunciones.getOrderByListaPreguntaEvaluacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionLogic.getPreguntaEvaluacions()) {
				if(preguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
					preguntaevaluacionTotales=preguntaevaluacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEvaluacion preguntaevaluacion:this.preguntaevaluacions) {
				if(preguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
					preguntaevaluacionTotales=preguntaevaluacion;
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
			this.preguntaevaluacionAux=new PreguntaEvaluacion();
			this.preguntaevaluacionAux.setsType(Constantes2.S_TOTALES);
			this.preguntaevaluacionAux.setIsNew(false);
			this.preguntaevaluacionAux.setIsChanged(false);
			this.preguntaevaluacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PreguntaEvaluacionConstantesFunciones.TotalizarValoresFilaPreguntaEvaluacion(this.preguntaevaluacionLogic.getPreguntaEvaluacions(),this.preguntaevaluacionAux);
				
				this.preguntaevaluacionLogic.getPreguntaEvaluacions().add(this.preguntaevaluacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PreguntaEvaluacionConstantesFunciones.TotalizarValoresFilaPreguntaEvaluacion(this.preguntaevaluacions,this.preguntaevaluacionAux);
				
				this.preguntaevaluacions.add(this.preguntaevaluacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		preguntaevaluacionTotales=new PreguntaEvaluacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.preguntaevaluacionLogic.getPreguntaEvaluacions().remove(preguntaevaluacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.preguntaevaluacions.remove(preguntaevaluacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		preguntaevaluacionTotales=new PreguntaEvaluacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionLogic.getPreguntaEvaluacions()) {
				if(preguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
					preguntaevaluacionTotales=preguntaevaluacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PreguntaEvaluacionConstantesFunciones.TotalizarValoresFilaPreguntaEvaluacion(this.preguntaevaluacionLogic.getPreguntaEvaluacions(),preguntaevaluacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEvaluacion preguntaevaluacion:this.preguntaevaluacions) {
				if(preguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
					preguntaevaluacionTotales=preguntaevaluacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PreguntaEvaluacionConstantesFunciones.TotalizarValoresFilaPreguntaEvaluacion(this.preguntaevaluacions,preguntaevaluacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPreguntaEvaluacionsBusquedaPorIdEjercicioPorIdPeriodo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdEjercicioPorIdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEvaluacionsBusquedaPorPregunta()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorPregunta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEvaluacionsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEvaluacionsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEvaluacionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEvaluacionsFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEvaluacionsFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEvaluacionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPreguntaEvaluacionsBusquedaPorIdEjercicioPorIdPeriodo(String sFinalQuery,Long id_ejercicio,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getPreguntaEvaluacionsBusquedaPorIdEjercicioPorIdPeriodo(sFinalQuery,this.pagination,id_ejercicio,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEvaluacionsBusquedaPorPregunta(String sFinalQuery,String pregunta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getPreguntaEvaluacionsBusquedaPorPregunta(sFinalQuery,this.pagination,pregunta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEvaluacionsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEvaluacionsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEvaluacionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEvaluacionsFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEvaluacionsFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEvaluacionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getPreguntaEvaluacionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPreguntaEvaluacion() {
		this.isPermisoTodoPreguntaEvaluacion=false;
		this.isPermisoNuevoPreguntaEvaluacion=false;
		this.isPermisoActualizarPreguntaEvaluacion=false;
		this.isPermisoActualizarOriginalPreguntaEvaluacion=false;
		this.isPermisoEliminarPreguntaEvaluacion=false;
		this.isPermisoGuardarCambiosPreguntaEvaluacion=false;
		this.isPermisoConsultaPreguntaEvaluacion=false;
		this.isPermisoBusquedaPreguntaEvaluacion=false;
		this.isPermisoReportePreguntaEvaluacion=false;		
		this.isPermisoOrdenPreguntaEvaluacion=false;		
		this.isPermisoPaginacionMedioPreguntaEvaluacion=false;		
		this.isPermisoPaginacionAltoPreguntaEvaluacion=false;
		this.isPermisoPaginacionTodoPreguntaEvaluacion=false;
		this.isPermisoCopiarPreguntaEvaluacion=false;		
		this.isPermisoVerFormPreguntaEvaluacion=false;		
		this.isPermisoDuplicarPreguntaEvaluacion=false;		
		this.isPermisoOrdenPreguntaEvaluacion=false;		
	}
	
	public void setPermisosUsuarioPreguntaEvaluacion(Boolean isPermiso) {
		this.isPermisoTodoPreguntaEvaluacion=isPermiso;
		this.isPermisoNuevoPreguntaEvaluacion=isPermiso;
		this.isPermisoActualizarPreguntaEvaluacion=isPermiso;
		this.isPermisoActualizarOriginalPreguntaEvaluacion=isPermiso;
		this.isPermisoEliminarPreguntaEvaluacion=isPermiso;
		this.isPermisoGuardarCambiosPreguntaEvaluacion=isPermiso;
		this.isPermisoConsultaPreguntaEvaluacion=isPermiso;
		this.isPermisoBusquedaPreguntaEvaluacion=isPermiso;
		this.isPermisoReportePreguntaEvaluacion=isPermiso;
		this.isPermisoOrdenPreguntaEvaluacion=isPermiso;		
		this.isPermisoPaginacionMedioPreguntaEvaluacion=isPermiso;		
		this.isPermisoPaginacionAltoPreguntaEvaluacion=isPermiso;		
		this.isPermisoPaginacionTodoPreguntaEvaluacion=isPermiso;		
		this.isPermisoCopiarPreguntaEvaluacion=isPermiso;		
		this.isPermisoVerFormPreguntaEvaluacion=isPermiso;		
		this.isPermisoDuplicarPreguntaEvaluacion=isPermiso;
		this.isPermisoOrdenPreguntaEvaluacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPreguntaEvaluacion(Boolean isPermiso) {
		//this.isPermisoTodoPreguntaEvaluacion=isPermiso;
		this.isPermisoNuevoPreguntaEvaluacion=isPermiso;
		this.isPermisoActualizarPreguntaEvaluacion=isPermiso;
		this.isPermisoActualizarOriginalPreguntaEvaluacion=isPermiso;
		this.isPermisoEliminarPreguntaEvaluacion=isPermiso;
		this.isPermisoGuardarCambiosPreguntaEvaluacion=isPermiso;
		//this.isPermisoConsultaPreguntaEvaluacion=isPermiso;
		//this.isPermisoBusquedaPreguntaEvaluacion=isPermiso;
		//this.isPermisoReportePreguntaEvaluacion=isPermiso;
		//this.isPermisoOrdenPreguntaEvaluacion=isPermiso;		
		//this.isPermisoPaginacionMedioPreguntaEvaluacion=isPermiso;		
		//this.isPermisoPaginacionAltoPreguntaEvaluacion=isPermiso;		
		//this.isPermisoPaginacionTodoPreguntaEvaluacion=isPermiso;		
		//this.isPermisoCopiarPreguntaEvaluacion=isPermiso;		
		//this.isPermisoDuplicarPreguntaEvaluacion=isPermiso;
		//this.isPermisoOrdenPreguntaEvaluacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPreguntaEvaluacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SubPreguntaEvaluacionConstantesFunciones.SNOMBREOPCION);
		
		if(PreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDetalleEvaluacionProveedor=this.verificarGetPermisosUsuarioOpcionPreguntaEvaluacionClaseRelacionada(this.opcionsRelacionadas,DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSubPreguntaEvaluacion=false;
		this.isTienePermisosSubPreguntaEvaluacion=this.verificarGetPermisosUsuarioOpcionPreguntaEvaluacionClaseRelacionada(this.opcionsRelacionadas,SubPreguntaEvaluacionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPreguntaEvaluacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPreguntaEvaluacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleEvaluacionProveedor=conPermiso;
		this.isTienePermisosSubPreguntaEvaluacion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPreguntaEvaluacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPreguntaEvaluacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPreguntaEvaluacionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleEvaluacionProveedor && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.remove(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSubPreguntaEvaluacion && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.remove(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPreguntaEvaluacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PreguntaEvaluacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPreguntaEvaluacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPreguntaEvaluacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPreguntaEvaluacion=this.isPermisoActualizarPreguntaEvaluacion;
			this.isPermisoEliminarPreguntaEvaluacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPreguntaEvaluacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPreguntaEvaluacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPreguntaEvaluacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPreguntaEvaluacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePreguntaEvaluacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPreguntaEvaluacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPreguntaEvaluacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPreguntaEvaluacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPreguntaEvaluacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPreguntaEvaluacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPreguntaEvaluacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPreguntaEvaluacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPreguntaEvaluacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPreguntaEvaluacion.setToolTipText(this.jTableDatosPreguntaEvaluacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPreguntaEvaluacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPreguntaEvaluacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPreguntaEvaluacion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleEvaluacionProveedor && this.preguntaevaluacionConstantesFunciones.mostrarDetalleEvaluacionProveedorPreguntaEvaluacion && !PreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Evaluacion Proveedor");
			reporte.setsDescripcion("Detalle Evaluacion Proveedor");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubPreguntaEvaluacion && this.preguntaevaluacionConstantesFunciones.mostrarSubPreguntaEvaluacionPreguntaEvaluacion && !PreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sub Pregunta Evaluacion");
			reporte.setsDescripcion("Sub Pregunta Evaluacion");
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
	public void inicializarCombosForeignKeyPreguntaEvaluacionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPreguntaEvaluacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PreguntaEvaluacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPreguntaEvaluacionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPreguntaEvaluacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PreguntaEvaluacionParameterReturnGeneral preguntaevaluacionReturnGeneral=new PreguntaEvaluacionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.preguntaevaluacionConstantesFunciones.cargarid_empresaPreguntaEvaluacion)
					 || (this.esRecargarFks && this.preguntaevaluacionConstantesFunciones.cargarid_empresaPreguntaEvaluacion)) {

					if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+preguntaevaluacionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.preguntaevaluacionConstantesFunciones.cargarid_sucursalPreguntaEvaluacion)
					 || (this.esRecargarFks && this.preguntaevaluacionConstantesFunciones.cargarid_sucursalPreguntaEvaluacion)) {

					if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+preguntaevaluacionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.preguntaevaluacionConstantesFunciones.cargarid_ejercicioPreguntaEvaluacion)
					 || (this.esRecargarFks && this.preguntaevaluacionConstantesFunciones.cargarid_ejercicioPreguntaEvaluacion)) {

					if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+preguntaevaluacionSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.preguntaevaluacionConstantesFunciones.cargarid_periodoPreguntaEvaluacion)
					 || (this.esRecargarFks && this.preguntaevaluacionConstantesFunciones.cargarid_periodoPreguntaEvaluacion)) {

					if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+preguntaevaluacionSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.preguntaevaluacionConstantesFunciones.cargarid_anioPreguntaEvaluacion)
					 || (this.esRecargarFks && this.preguntaevaluacionConstantesFunciones.cargarid_anioPreguntaEvaluacion)) {

					if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+preguntaevaluacionSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.preguntaevaluacionConstantesFunciones.cargarid_mesPreguntaEvaluacion)
					 || (this.esRecargarFks && this.preguntaevaluacionConstantesFunciones.cargarid_mesPreguntaEvaluacion)) {

					if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+preguntaevaluacionSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				preguntaevaluacionReturnGeneral=preguntaevaluacionLogic.cargarCombosLoteForeignKeyPreguntaEvaluacion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=preguntaevaluacionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=preguntaevaluacionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=preguntaevaluacionReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=preguntaevaluacionReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=preguntaevaluacionReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=preguntaevaluacionReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPreguntaEvaluacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.preguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPreguntaEvaluacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPreguntaEvaluacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPreguntaEvaluacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaEvaluacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion)throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(preguntaevaluacion.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(preguntaevaluacion.getid_periodo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPreguntaEvaluacion()throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(this.preguntaevaluacionConstantesFunciones.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(this.preguntaevaluacionConstantesFunciones.getid_periodo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaEvaluacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPreguntaEvaluacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPreguntaEvaluacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPreguntaEvaluacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPreguntaEvaluacion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPreguntaEvaluacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPreguntaEvaluacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public PreguntaEvaluacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PreguntaEvaluacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PreguntaEvaluacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean(); 
		this.preguntaevaluacionConstantesFunciones=new PreguntaEvaluacionConstantesFunciones(); 
		this.preguntaevaluacionBean=new PreguntaEvaluacion();//(this.preguntaevaluacionConstantesFunciones); 		
		this.preguntaevaluacionReturnGeneral=new PreguntaEvaluacionParameterReturnGeneral(); 
		
		this.preguntaevaluacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntaevaluacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PreguntaEvaluacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PreguntaEvaluacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PreguntaEvaluacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPreguntaEvaluacion(true);
			
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
			
			this.preguntaevaluacionConstantesFunciones=new PreguntaEvaluacionConstantesFunciones(); 
			this.preguntaevaluacionBean=new PreguntaEvaluacion();//this.preguntaevaluacionConstantesFunciones); 			
			this.preguntaevaluacionReturnGeneral=new PreguntaEvaluacionParameterReturnGeneral(); 
		
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pregunta Evaluacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.preguntaevaluacion=new PreguntaEvaluacion();
			this.preguntaevaluacions = new ArrayList<PreguntaEvaluacion>();
			this.preguntaevaluacionsAux = new ArrayList<PreguntaEvaluacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic=new PreguntaEvaluacionLogic();
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			//this.preguntaevaluacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.preguntaevaluacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPreguntaEvaluacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPreguntaEvaluacion);	
					}
					
					if(this.jInternalFrameImportacionPreguntaEvaluacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPreguntaEvaluacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPreguntaEvaluacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPreguntaEvaluacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPreguntaEvaluacion);
				this.jInternalFrameDetalleFormPreguntaEvaluacion.setVisible(false);
				this.jInternalFrameDetalleFormPreguntaEvaluacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPreguntaEvaluacion);
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setVisible(false);
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPreguntaEvaluacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPreguntaEvaluacion);
					this.jInternalFrameImportacionPreguntaEvaluacion.setVisible(false);
					this.jInternalFrameImportacionPreguntaEvaluacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPreguntaEvaluacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPreguntaEvaluacion);
					this.jInternalFrameOrderByPreguntaEvaluacion.setVisible(false);
					this.jInternalFrameOrderByPreguntaEvaluacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPreguntaEvaluacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PreguntaEvaluacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.preguntaevaluacionReturnGeneral=new PreguntaEvaluacionParameterReturnGeneral();
			
			this.preguntaevaluacionParameterGeneral=new PreguntaEvaluacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.preguntaevaluacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SubPreguntaEvaluacionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PreguntaEvaluacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),this.preguntaevaluacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PreguntaEvaluacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),this.preguntaevaluacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
			this.isVisibilidadCeldaDuplicarPreguntaEvaluacion=true;
			this.isVisibilidadCeldaCopiarPreguntaEvaluacion=true;
			this.isVisibilidadCeldaVerFormPreguntaEvaluacion=true;
			this.isVisibilidadCeldaOrdenPreguntaEvaluacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;
			
			
			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=true;
			this.isVisibilidadBusquedaPorPregunta=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPreguntaEvaluacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPreguntaEvaluacion(false);
			
			this.setPermisosUsuarioPreguntaEvaluacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() 
				|| (this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() && this.preguntaevaluacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPreguntaEvaluacionClasesRelacionadas();
			}
			
			if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPreguntaEvaluacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPreguntaEvaluacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPreguntaEvaluacion();
			}
			
			if(!this.isPermisoBusquedaPreguntaEvaluacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPreguntaEvaluacion,this.isPermisoPaginacionMedioPreguntaEvaluacion,this.isPermisoPaginacionTodoPreguntaEvaluacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PreguntaEvaluacionConstantesFunciones.getTiposSeleccionarPreguntaEvaluacion());
				
				this.tiposColumnasSelect=PreguntaEvaluacionConstantesFunciones.getTiposSeleccionarPreguntaEvaluacion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPreguntaEvaluacion();				
				//this.tiposRelacionesSelect=PreguntaEvaluacionConstantesFunciones.getTiposRelacionesPreguntaEvaluacion(true);
				
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
			//if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPreguntaEvaluacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPreguntaEvaluacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPreguntaEvaluacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaEvaluacion() ;
			
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
			this.subpreguntaevaluacionLogic=new SubPreguntaEvaluacionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				preguntaevaluacionImplementable= (PreguntaEvaluacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PreguntaEvaluacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				preguntaevaluacionImplementableHome= (PreguntaEvaluacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PreguntaEvaluacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.preguntaevaluacions= new ArrayList<PreguntaEvaluacion>();
			this.preguntaevaluacionsEliminados= new ArrayList<PreguntaEvaluacion>();
						
			this.isEsNuevoPreguntaEvaluacion=false;
			this.esParaAccionDesdeFormularioPreguntaEvaluacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPreguntaEvaluacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPreguntaEvaluacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PreguntaEvaluacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPreguntaEvaluacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPreguntaEvaluacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPreguntaEvaluacion();
			}
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPreguntaEvaluacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPreguntaEvaluacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPreguntaEvaluacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPreguntaEvaluacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PreguntaEvaluacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPreguntaEvaluacion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPreguntaEvaluacion")) {
				iIndex=this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Evaluacion Proveedores")) {
					if(!DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPreguntaEvaluacion();

						this.cargarParteTabPanelRelacionadaDetalleEvaluacionProveedor(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Pregunta Evaluaciones")) {
					if(!SubPreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPreguntaEvaluacion();

						this.cargarParteTabPanelRelacionadaSubPreguntaEvaluacion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPreguntaEvaluacion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleEvaluacionProveedor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPreguntaEvaluacion.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(false,true,iIndex);
		this.jButtonDetalleEvaluacionProveedorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor();

		//this.jTabbedPaneRelacionesPreguntaEvaluacion.updateUI();
		//this.jTabbedPaneRelacionesPreguntaEvaluacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPreguntaEvaluacion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubPreguntaEvaluacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPreguntaEvaluacion.cargarSessionConBeanSwingJInternalFrameSubPreguntaEvaluacion(false,true,iIndex);
		this.jButtonSubPreguntaEvaluacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubPreguntaEvaluacion();

		//this.jTabbedPaneRelacionesPreguntaEvaluacion.updateUI();
		//this.jTabbedPaneRelacionesPreguntaEvaluacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPreguntaEvaluacion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleEvaluacionProveedor")) {
				int row=this.jTableDatosPreguntaEvaluacion.getSelectedRow();
				jButtonDetalleEvaluacionProveedorActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubPreguntaEvaluacion")) {
				int row=this.jTableDatosPreguntaEvaluacion.getSelectedRow();
				jButtonSubPreguntaEvaluacionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Evaluacion Proveedor")) {

					if(this.isTienePermisosDetalleEvaluacionProveedor && this.preguntaevaluacionConstantesFunciones.mostrarDetalleEvaluacionProveedorPreguntaEvaluacion && !PreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Evaluacion Proveedores"+"("+DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Evaluacion Proveedores");

						if(preguntaevaluacionConstantesFunciones.resaltarDetalleEvaluacionProveedorPreguntaEvaluacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(preguntaevaluacionConstantesFunciones.resaltarDetalleEvaluacionProveedorPreguntaEvaluacion);
						}

						jmenuItem.setEnabled(this.preguntaevaluacionConstantesFunciones.activarDetalleEvaluacionProveedorPreguntaEvaluacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleEvaluacionProveedor"));

						

						this.jInternalFrameDetalleFormPreguntaEvaluacion.jmenuDetallePreguntaEvaluacion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sub Pregunta Evaluacion")) {

					if(this.isTienePermisosSubPreguntaEvaluacion && this.preguntaevaluacionConstantesFunciones.mostrarSubPreguntaEvaluacionPreguntaEvaluacion && !PreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sub Pregunta Evaluaciones"+"("+SubPreguntaEvaluacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sub Pregunta Evaluaciones");

						if(preguntaevaluacionConstantesFunciones.resaltarSubPreguntaEvaluacionPreguntaEvaluacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(preguntaevaluacionConstantesFunciones.resaltarSubPreguntaEvaluacionPreguntaEvaluacion);
						}

						jmenuItem.setEnabled(this.preguntaevaluacionConstantesFunciones.activarSubPreguntaEvaluacionPreguntaEvaluacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubPreguntaEvaluacion"));

						

						this.jInternalFrameDetalleFormPreguntaEvaluacion.jmenuDetallePreguntaEvaluacion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPreguntaEvaluacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPreguntaEvaluacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPreguntaEvaluacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPreguntaEvaluacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPreguntaEvaluacion();
		
		this.cargarCombosFrameForeignKeyPreguntaEvaluacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPreguntaEvaluacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPreguntaEvaluacion();
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

	public void cargarCombosForeignKeyPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPeriodo(this.periodosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPreguntaEvaluacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
			
			if(jTableDatosPreguntaEvaluacion.getRowCount()>=1) {
				jTableDatosPreguntaEvaluacion.removeRowSelectionInterval(0, jTableDatosPreguntaEvaluacion.getRowCount()-1);						
			}
			
			this.isEsNuevoPreguntaEvaluacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPreguntaEvaluacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPreguntaEvaluacion(true);			
			//this.preguntaevaluacion=new PreguntaEvaluacion();
			//this.preguntaevaluacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaEvaluacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion() ;
			
			if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaEvaluacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.preguntaevaluacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);				
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
			if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PreguntaEvaluacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPreguntaEvaluacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPreguntaEvaluacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPreguntaEvaluacion.getSelectedRows().length;			
			}
			
			preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPreguntaEvaluacion--;			
				//PreguntaEvaluacion preguntaevaluacionAux= new PreguntaEvaluacion();			
				//preguntaevaluacionAux.setId(this.iIdNuevoPreguntaEvaluacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PreguntaEvaluacion preguntaevaluacionOrigen=new PreguntaEvaluacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PreguntaEvaluacion preguntaevaluacionOrigen : preguntaevaluacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							preguntaevaluacionOrigen =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaevaluacionOrigen =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPreguntaEvaluacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.preguntaevaluacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPreguntaEvaluacion(preguntaevaluacionOrigen,this.preguntaevaluacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.preguntaevaluacionLogic.getPreguntaEvaluacions().add(this.preguntaevaluacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacions.add(this.preguntaevaluacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
				
				this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(this.getIndiceNuevoPreguntaEvaluacion(), this.getIndiceNuevoPreguntaEvaluacion());
				
				int iLastRow =  this.jTableDatosPreguntaEvaluacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPreguntaEvaluacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPreguntaEvaluacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();									
		
			PreguntaEvaluacion preguntaevaluacionOrigen=new PreguntaEvaluacion();
			PreguntaEvaluacion preguntaevaluacionDestino=new PreguntaEvaluacion();
				
			preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPreguntaEvaluacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || preguntaevaluacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPreguntaEvaluacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionOrigen =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						preguntaevaluacionOrigen =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaevaluacionDestino =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						preguntaevaluacionDestino =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				preguntaevaluacionOrigen =preguntaevaluacionsSeleccionados.get(0);
				preguntaevaluacionDestino =preguntaevaluacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPreguntaEvaluacion(preguntaevaluacionOrigen,preguntaevaluacionDestino,true,false);
				
				preguntaevaluacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(preguntaevaluacionDestino,preguntaevaluacionLogic.getPreguntaEvaluacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntaevaluacionDestino,preguntaevaluacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
				
				//this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(this.getIndiceNuevoPreguntaEvaluacion(), this.getIndiceNuevoPreguntaEvaluacion());
				
				int iLastRow =  this.jTableDatosPreguntaEvaluacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPreguntaEvaluacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPreguntaEvaluacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPreguntaEvaluacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPreguntaEvaluacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(!isVisible);
			this.jPanelPaginacionPreguntaEvaluacion.setVisible(!isVisible);
			this.jPanelAccionesPreguntaEvaluacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePreguntaEvaluacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPreguntaEvaluacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPreguntaEvaluacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPreguntaEvaluacion();
			
			this.abrirFrameOrderByPreguntaEvaluacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPreguntaEvaluacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePreguntaEvaluacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPreguntaEvaluacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPreguntaEvaluacion.isMaximum()) {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPreguntaEvaluacion.setSize(this.jInternalFrameDetalleFormPreguntaEvaluacion.iWidthFormulario,this.jInternalFrameDetalleFormPreguntaEvaluacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPreguntaEvaluacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPreguntaEvaluacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPreguntaEvaluacion.isMaximum()) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jContentPaneDetallePreguntaEvaluacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPreguntaEvaluacion.jContentPaneDetallePreguntaEvaluacion.getWidth(),PreguntaEvaluacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPreguntaEvaluacion.jContentPaneDetallePreguntaEvaluacion.getWidth(),PreguntaEvaluacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPreguntaEvaluacion.jContentPaneDetallePreguntaEvaluacion.getWidth(),PreguntaEvaluacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor();
					}

					if(SubPreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubPreguntaEvaluacion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPreguntaEvaluacion.setVisible(true);
	        this.jInternalFrameDetalleFormPreguntaEvaluacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPreguntaEvaluacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPreguntaEvaluacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPreguntaEvaluacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaEvaluacion,false,this);
				} else {
					this.jInternalFrameOrderByPreguntaEvaluacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaEvaluacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPreguntaEvaluacion);
				this.jInternalFrameOrderByPreguntaEvaluacion.setVisible(false);
				this.jInternalFrameOrderByPreguntaEvaluacion.setSelected(false);
				
				this.jInternalFrameOrderByPreguntaEvaluacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPreguntaEvaluacion"));
				
				this.inicializarActualizarBindingTablaOrderByPreguntaEvaluacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPreguntaEvaluacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPreguntaEvaluacion==null) {
				
				this.jInternalFrameImportacionPreguntaEvaluacion=new ImportacionJInternalFrame(PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPreguntaEvaluacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPreguntaEvaluacion);
				this.jInternalFrameImportacionPreguntaEvaluacion.setVisible(false);
				this.jInternalFrameImportacionPreguntaEvaluacion.setSelected(false);


				this.jInternalFrameImportacionPreguntaEvaluacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPreguntaEvaluacion"));
				this.jInternalFrameImportacionPreguntaEvaluacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPreguntaEvaluacion"));
				this.jInternalFrameImportacionPreguntaEvaluacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPreguntaEvaluacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPreguntaEvaluacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion==null) {
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion=new ReporteDinamicoJInternalFrame(PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPreguntaEvaluacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPreguntaEvaluacion);
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setVisible(false);
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaEvaluacion"));
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaEvaluacion"));
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaEvaluacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaEvaluacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPreguntaEvaluacion.jContentPaneDetallePreguntaEvaluacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubPreguntaEvaluacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jScrollPanelDatosSubPreguntaEvaluacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPreguntaEvaluacion.jContentPaneDetallePreguntaEvaluacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jScrollPanelDatosSubPreguntaEvaluacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jScrollPanelDatosSubPreguntaEvaluacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.jScrollPanelDatosSubPreguntaEvaluacion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePreguntaEvaluacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPreguntaEvaluacion);
			
	       	this.jInternalFrameDetalleFormPreguntaEvaluacion.setVisible(false);
	        this.jInternalFrameDetalleFormPreguntaEvaluacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormPreguntaEvaluacion.dispose();
			//this.jInternalFrameDetalleFormPreguntaEvaluacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPreguntaEvaluacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPreguntaEvaluacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPreguntaEvaluacion.setVisible(true);
	        this.jInternalFrameImportacionPreguntaEvaluacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPreguntaEvaluacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPreguntaEvaluacion.setVisible(true);
	        this.jInternalFrameOrderByPreguntaEvaluacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPreguntaEvaluacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPreguntaEvaluacion.setVisible(false);
	        this.jInternalFrameOrderByPreguntaEvaluacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPreguntaEvaluacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPreguntaEvaluacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPreguntaEvaluacion.setVisible(false);
	        this.jInternalFrameImportacionPreguntaEvaluacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPreguntaEvaluacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPreguntaEvaluacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPreguntaEvaluacion(true);
			//this.isEsNuevoPreguntaEvaluacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaEvaluacion(false) ;
			
			if(preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionProveedorActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() && SubPreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubPreguntaEvaluacionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaEvaluacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPreguntaEvaluacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPreguntaEvaluacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPreguntaEvaluacion(true);
			//this.isEsNuevoPreguntaEvaluacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.preguntaevaluacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPreguntaEvaluacion(false) ;
			
			if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaEvaluacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEjercicio(List<Ejercicio> ejerciciosForeignKey)throws Exception{
		TableColumn tableColumnEjercicio=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO));
		TableCellEditor tableCellEditorEjercicio =tableColumnEjercicio.getCellEditor();

		EjercicioTableCell ejercicioTableCellFk=(EjercicioTableCell)tableCellEditorEjercicio;

		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.setejerciciosForeignKey(ejerciciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaEvaluacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ejercicioTableCellFk.setRowActual(intSelectedRow);
			//ejercicioTableCellFk.setejerciciosForeignKeyActual(ejerciciosForeignKey);
		//}


		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.RecargarEjerciciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPeriodo(List<Periodo> periodosForeignKey)throws Exception{
		TableColumn tableColumnPeriodo=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaEvaluacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periodoTableCellFk.setRowActual(intSelectedRow);
			//periodoTableCellFk.setperiodosForeignKeyActual(periodosForeignKey);
		//}


		if(periodoTableCellFk!=null) {
			periodoTableCellFk.RecargarPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaEvaluacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaEvaluacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPreguntaEvaluacion(false);
			
			//if(!this.isEsNuevoPreguntaEvaluacion) {								
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				
			}
			
			if(this.permiteMantenimiento(this.preguntaevaluacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPreguntaEvaluacion=true;
					this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
					this.isEsNuevoPreguntaEvaluacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPreguntaEvaluacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPreguntaEvaluacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPreguntaEvaluacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion(false);
				
				this.habilitarDeshabilitarControlesPreguntaEvaluacion(false);
			
												
				
				if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePreguntaEvaluacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPreguntaEvaluacionActionPerformed(evt,preguntaevaluacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPreguntaEvaluacion(this.preguntaevaluacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,preguntaevaluacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.preguntaevaluacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				this.preguntaevaluacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				this.preguntaevaluacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.preguntaevaluacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PreguntaEvaluacionModel) this.jTableDatosPreguntaEvaluacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPreguntaEvaluacion=true;
				this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
				this.isEsNuevoPreguntaEvaluacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPreguntaEvaluacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion(false);
				
				this.habilitarDeshabilitarControlesPreguntaEvaluacion(false);
				
				
				
				if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePreguntaEvaluacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPreguntaEvaluacion.getRowCount()>=1) {
				jTableDatosPreguntaEvaluacion.removeRowSelectionInterval(0, jTableDatosPreguntaEvaluacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPreguntaEvaluacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaEvaluacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion(false) ;
			
			this.isEsNuevoPreguntaEvaluacion=false;
			
			if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePreguntaEvaluacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPreguntaEvaluacion(false);
				
				//SI ES MANUAL
				if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPreguntaEvaluacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPreguntaEvaluacion--;			
			//PreguntaEvaluacion preguntaevaluacionAux= new PreguntaEvaluacion();			
			//preguntaevaluacionAux.setId(this.iIdNuevoPreguntaEvaluacion);
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPreguntaEvaluacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
			
			this.preguntaevaluacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.preguntaevaluacionLogic.getPreguntaEvaluacions().add(this.preguntaevaluacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.preguntaevaluacions.add(this.preguntaevaluacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
			
			this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(this.getIndiceNuevoPreguntaEvaluacion(), this.getIndiceNuevoPreguntaEvaluacion());
			
			int iLastRow =  this.jTableDatosPreguntaEvaluacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPreguntaEvaluacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPreguntaEvaluacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaEvaluacion(false);
			
			//SI ES MANUAL
			if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaEvaluacion();
			}
			
			//this.abrirFrameTreePreguntaEvaluacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Pregunta EvaluacionS ?", "MANTENIMIENTO DE Pregunta Evaluacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPreguntaEvaluacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPreguntaEvaluacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.preguntaevaluacionReturnGeneral=preguntaevaluacionLogic.procesarImportacionPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.preguntaevaluacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPreguntaEvaluacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPreguntaEvaluacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPreguntaEvaluacion.setFileImportacion(this.jInternalFrameImportacionPreguntaEvaluacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPreguntaEvaluacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPreguntaEvaluacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPreguntaEvaluacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPreguntaEvaluacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		

		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PreguntaEvaluacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PreguntaEvaluacionBaseDesign.jrxml";
			
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
			
			this.generarReportePreguntaEvaluacions("Todos",preguntaevaluacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_egunta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_egunta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_egunta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_egunta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					sNombreCampoCategoria="pregunta";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION:
					sNombreCampoCategoria="calificacion";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					sNombreCampoCategoriaValor="pregunta";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION:
					sNombreCampoCategoriaValor="calificacion";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pregunta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pregunta");
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Calificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"calificacion");
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaevaluacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PreguntaEvaluacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getpregunta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getcalificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEvaluacionConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(PreguntaEvaluacion preguntaevaluacion:preguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaevaluacion.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPreguntaEvaluacion(row);				
			//	iRow++;
			//}				
			
			//for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPreguntaEvaluacion(preguntaevaluacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaEvaluacion(false);
			
			//SI ES MANUAL
			if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaEvaluacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaEvaluacion(false);
			
			//SI ES MANUAL
			if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPreguntaEvaluacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaEvaluacion(false);
			
			//SI ES MANUAL
			if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPreguntaEvaluacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPreguntaEvaluacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPreguntaEvaluacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPreguntaEvaluacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPreguntaEvaluacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPreguntaEvaluacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPreguntaEvaluacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosPreguntaEvaluacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosPreguntaEvaluacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPreguntaEvaluacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPreguntaEvaluacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPreguntaEvaluacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPreguntaEvaluacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPreguntaEvaluacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPreguntaEvaluacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaEvaluacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPreguntaEvaluacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPreguntaEvaluacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPreguntaEvaluacion();
		
		this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPreguntaEvaluacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaEvaluacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaEvaluacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaEvaluacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPreguntaEvaluacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePreguntaEvaluacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPreguntaEvaluacion.jCheckBoxPostAccionNuevoPreguntaEvaluacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPreguntaEvaluacion.jCheckBoxPostAccionSinCerrarPreguntaEvaluacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPreguntaEvaluacion.jCheckBoxPostAccionSinMensajePreguntaEvaluacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPreguntaEvaluacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePreguntaEvaluacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jCheckBoxPostAccionNuevoPreguntaEvaluacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jCheckBoxPostAccionSinCerrarPreguntaEvaluacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jCheckBoxPostAccionSinMensajePreguntaEvaluacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPreguntaEvaluacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPreguntaEvaluacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPreguntaEvaluacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPreguntaEvaluacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPreguntaEvaluacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPreguntaEvaluacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPreguntaEvaluacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPreguntaEvaluacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPreguntaEvaluacion(Boolean esInicializar) throws Exception {
		try	{	
			if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaEvaluacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaEvaluacion() throws Exception {
		try	{
			if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPreguntaEvaluacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePreguntaEvaluacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPreguntaEvaluacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPreguntaEvaluacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPreguntaEvaluacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPreguntaEvaluacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPreguntaEvaluacion.addItem(reporte);
			}
			
			
			if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPreguntaEvaluacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPreguntaEvaluacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPreguntaEvaluacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPreguntaEvaluacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPreguntaEvaluacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPreguntaEvaluacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaEvaluacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaEvaluacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PreguntaEvaluacionConstantesFunciones.getTiposSeleccionarPreguntaEvaluacion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PreguntaEvaluacionConstantesFunciones.getTiposSeleccionarPreguntaEvaluacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PreguntaEvaluacionConstantesFunciones.getTiposSeleccionarPreguntaEvaluacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPreguntaEvaluacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.getSelectedItem()!=null){this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo=((Ejercicio)this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.getSelectedItem()!=null){this.id_periodoBusquedaPorIdEjercicioPorIdPeriodo=((Periodo)this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.getSelectedItem()).getId();}
		this.preguntaBusquedaPorPregunta=this.jTextAreapreguntaBusquedaPorPreguntaPreguntaEvaluacion.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPreguntaEvaluacion(Boolean esInicializar) throws Exception {				
		if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPreguntaEvaluacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPreguntaEvaluacion() throws Exception {
		this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPreguntaEvaluacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPreguntaEvaluacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPreguntaEvaluacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=preguntaevaluacionLogic.getPreguntaEvaluacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=preguntaevaluacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPreguntaEvaluacion.setModel(new PreguntaEvaluacionModel(this.preguntaevaluacionLogic.getPreguntaEvaluacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPreguntaEvaluacion.setModel(new PreguntaEvaluacionModel(this.preguntaevaluacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPreguntaEvaluacion!=null && this.jInternalFrameOrderByPreguntaEvaluacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPreguntaEvaluacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,preguntaevaluacionConstantesFunciones.resaltarSeleccionarPreguntaEvaluacion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,preguntaevaluacionConstantesFunciones.resaltarSeleccionarPreguntaEvaluacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_ID));

		if(this.preguntaevaluacionConstantesFunciones.mostraridPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntaevaluacionConstantesFunciones.resaltaridPreguntaEvaluacion,this.preguntaevaluacionConstantesFunciones.activaridPreguntaEvaluacion,iSizeTabla,this,true,"idPreguntaEvaluacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaevaluacionConstantesFunciones.resaltaridPreguntaEvaluacion,this.preguntaevaluacionConstantesFunciones.activaridPreguntaEvaluacion,this,true,"idPreguntaEvaluacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.preguntaevaluacionConstantesFunciones.mostrarid_empresaPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_empresaPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_empresaPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_empresaPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_empresaPreguntaEvaluacion,false,"id_empresaPreguntaEvaluacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.preguntaevaluacionConstantesFunciones.mostrarid_sucursalPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_sucursalPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_sucursalPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_sucursalPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_sucursalPreguntaEvaluacion,false,"id_sucursalPreguntaEvaluacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.preguntaevaluacionConstantesFunciones.mostrarid_ejercicioPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_ejercicioPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_ejercicioPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_ejercicioPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_ejercicioPreguntaEvaluacion,true,"id_ejercicioPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO));

		if(this.preguntaevaluacionConstantesFunciones.mostrarid_periodoPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_periodoPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_periodoPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_periodoPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_periodoPreguntaEvaluacion,true,"id_periodoPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA));

		if(this.preguntaevaluacionConstantesFunciones.mostrarpreguntaPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.preguntaevaluacionConstantesFunciones.resaltarpreguntaPreguntaEvaluacion,this.preguntaevaluacionConstantesFunciones.activarpreguntaPreguntaEvaluacion,iSizeTabla,this,true,"preguntaPreguntaEvaluacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaevaluacionConstantesFunciones.resaltarpreguntaPreguntaEvaluacion,this.preguntaevaluacionConstantesFunciones.activarpreguntaPreguntaEvaluacion,this,true,"preguntaPreguntaEvaluacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION));

		if(this.preguntaevaluacionConstantesFunciones.mostrarcalificacionPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntaevaluacionConstantesFunciones.resaltarcalificacionPreguntaEvaluacion,this.preguntaevaluacionConstantesFunciones.activarcalificacionPreguntaEvaluacion,iSizeTabla,this,true,"calificacionPreguntaEvaluacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaevaluacionConstantesFunciones.resaltarcalificacionPreguntaEvaluacion,this.preguntaevaluacionConstantesFunciones.activarcalificacionPreguntaEvaluacion,this,true,"calificacionPreguntaEvaluacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN));

		if(this.preguntaevaluacionConstantesFunciones.mostrarordenPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntaevaluacionConstantesFunciones.resaltarordenPreguntaEvaluacion,this.preguntaevaluacionConstantesFunciones.activarordenPreguntaEvaluacion,iSizeTabla,this,true,"ordenPreguntaEvaluacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaevaluacionConstantesFunciones.resaltarordenPreguntaEvaluacion,this.preguntaevaluacionConstantesFunciones.activarordenPreguntaEvaluacion,this,true,"ordenPreguntaEvaluacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO));

		if(this.preguntaevaluacionConstantesFunciones.mostrarid_anioPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_anioPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_anioPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_anioPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_anioPreguntaEvaluacion,true,"id_anioPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,PreguntaEvaluacionConstantesFunciones.LABEL_IDMES));

		if(this.preguntaevaluacionConstantesFunciones.mostrarid_mesPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEvaluacionConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_mesPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_mesPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.preguntaevaluacionConstantesFunciones.resaltarid_mesPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarid_mesPreguntaEvaluacion,true,"id_mesPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleEvaluacionProveedor && this.preguntaevaluacionConstantesFunciones.mostrarDetalleEvaluacionProveedorPreguntaEvaluacion && !PreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Evaluacion Proveedores");
				tableColumn.setHeaderValue("Detalle Evaluacion Proveedores");
				tableColumn.setCellRenderer(new DetalleEvaluacionProveedorTableCell(preguntaevaluacionConstantesFunciones.resaltarDetalleEvaluacionProveedorPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarDetalleEvaluacionProveedorPreguntaEvaluacion));
				tableColumn.setCellEditor(new DetalleEvaluacionProveedorTableCell(preguntaevaluacionConstantesFunciones.resaltarDetalleEvaluacionProveedorPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarDetalleEvaluacionProveedorPreguntaEvaluacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPreguntaEvaluacion.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubPreguntaEvaluacion && this.preguntaevaluacionConstantesFunciones.mostrarSubPreguntaEvaluacionPreguntaEvaluacion && !PreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sub Pregunta Evaluaciones");
				tableColumn.setHeaderValue("Sub Pregunta Evaluaciones");
				tableColumn.setCellRenderer(new SubPreguntaEvaluacionTableCell(preguntaevaluacionConstantesFunciones.resaltarSubPreguntaEvaluacionPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarSubPreguntaEvaluacionPreguntaEvaluacion));
				tableColumn.setCellEditor(new SubPreguntaEvaluacionTableCell(preguntaevaluacionConstantesFunciones.resaltarSubPreguntaEvaluacionPreguntaEvaluacion,this,this.preguntaevaluacionConstantesFunciones.activarSubPreguntaEvaluacionPreguntaEvaluacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPreguntaEvaluacion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPreguntaEvaluacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPreguntaEvaluacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPreguntaEvaluacion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPreguntaEvaluacion.addColumn(tableColumn);
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
			
			this.jTableDatosPreguntaEvaluacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPreguntaEvaluacion.moveColumn(this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPreguntaEvaluacion.moveColumn(this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPreguntaEvaluacion.moveColumn(this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPreguntaEvaluacion.moveColumn(this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPreguntaEvaluacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPreguntaEvaluacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPreguntaEvaluacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPreguntaEvaluacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPreguntaEvaluacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPreguntaEvaluacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=preguntaevaluacionLogic.getPreguntaEvaluacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=preguntaevaluacions.size()-1;
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
		//this.jTableDatosPreguntaEvaluacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPreguntaEvaluacion();
			
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
				
				//this.isEsNuevoPreguntaEvaluacion=false;
					
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
				if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPreguntaEvaluacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPreguntaEvaluacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.preguntaevaluacion.getsType().equals("DUPLICADO")
				   || this.preguntaevaluacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPreguntaEvaluacion=true;
				
				} else {
					this.isEsNuevoPreguntaEvaluacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					if(this.preguntaevaluacion.getId()>=0 && !this.preguntaevaluacion.getIsNew()) {						
						this.isEsNuevoPreguntaEvaluacion=false;
						
					} else {
						this.isEsNuevoPreguntaEvaluacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPreguntaEvaluacion(esRelaciones);						
				
				this.seleccionarPreguntaEvaluacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.preguntaevaluacion.getId()<0) {
					this.isEsNuevoPreguntaEvaluacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPreguntaEvaluacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPreguntaEvaluacion(evt,rowIndex);
				}	
				
				if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PreguntaEvaluacion: " + this.dDif); 
					}
				}								
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPreguntaEvaluacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.preguntaevaluacion)) {
					if(this.preguntaevaluacion.getId()>0) {
						this.preguntaevaluacion.setIsDeleted(true);
						
						this.preguntaevaluacionsEliminados.add(this.preguntaevaluacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.preguntaevaluacionLogic.getPreguntaEvaluacions().remove(this.preguntaevaluacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacions.remove(this.preguntaevaluacion);				
					}
					
					
					((PreguntaEvaluacionModel) this.jTableDatosPreguntaEvaluacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPreguntaEvaluacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPreguntaEvaluacion) {
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPreguntaEvaluacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPreguntaEvaluacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPreguntaEvaluacion(this.preguntaevaluacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.preguntaevaluacionConstantesFunciones.cargarid_empresaPreguntaEvaluacion || this.preguntaevaluacionConstantesFunciones.event_dependid_empresaPreguntaEvaluacion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.preguntaevaluacion.getid_empresa());
									//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(preguntaevaluacion.getEmpresa()!=null) {
							this.empresasForeignKey.add(preguntaevaluacion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.preguntaevaluacion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.preguntaevaluacionConstantesFunciones.cargarid_sucursalPreguntaEvaluacion || this.preguntaevaluacionConstantesFunciones.event_dependid_sucursalPreguntaEvaluacion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.preguntaevaluacion.getid_sucursal());
									//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(preguntaevaluacion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(preguntaevaluacion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.preguntaevaluacion.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.preguntaevaluacionConstantesFunciones.cargarid_ejercicioPreguntaEvaluacion || this.preguntaevaluacionConstantesFunciones.event_dependid_ejercicioPreguntaEvaluacion) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.preguntaevaluacion.getid_ejercicio());
									//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(preguntaevaluacion.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(preguntaevaluacion.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.preguntaevaluacion.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.preguntaevaluacionConstantesFunciones.cargarid_periodoPreguntaEvaluacion || this.preguntaevaluacionConstantesFunciones.event_dependid_periodoPreguntaEvaluacion) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.preguntaevaluacion.getid_periodo());
									//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(preguntaevaluacion.getPeriodo()!=null) {
							this.periodosForeignKey.add(preguntaevaluacion.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.preguntaevaluacion.getid_periodo(),false,"Formulario");

					//Anio
					if(!this.preguntaevaluacionConstantesFunciones.cargarid_anioPreguntaEvaluacion || this.preguntaevaluacionConstantesFunciones.event_dependid_anioPreguntaEvaluacion) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.preguntaevaluacion.getid_anio());
									//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(preguntaevaluacion.getAnio()!=null) {
							this.aniosForeignKey.add(preguntaevaluacion.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.preguntaevaluacion.getid_anio(),false,"Formulario");

					//Mes
					if(!this.preguntaevaluacionConstantesFunciones.cargarid_mesPreguntaEvaluacion || this.preguntaevaluacionConstantesFunciones.event_dependid_mesPreguntaEvaluacion) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.preguntaevaluacion.getid_mes());
									//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(preguntaevaluacion.getMes()!=null) {
							this.messForeignKey.add(preguntaevaluacion.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.preguntaevaluacion.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPreguntaEvaluacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPreguntaEvaluacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPreguntaEvaluacion(preguntaevaluacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPreguntaEvaluacion(preguntaevaluacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPreguntaEvaluacion(preguntaevaluacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPreguntaEvaluacion(preguntaevaluacion);
	}
	
	public void setVariablesObjetoActualToFormularioPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.setText(preguntaevaluacion.getId().toString());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextAreapreguntaPreguntaEvaluacion.setText(preguntaevaluacion.getpregunta());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldcalificacionPreguntaEvaluacion.setText(preguntaevaluacion.getcalificacion().toString());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldordenPreguntaEvaluacion.setText(preguntaevaluacion.getorden().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PreguntaEvaluacion preguntaevaluacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,preguntaevaluacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PreguntaEvaluacion preguntaevaluacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				preguntaevaluacionLocal=this.preguntaevaluacion;
			} else {
				preguntaevaluacionLocal=this.preguntaevaluacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(preguntaevaluacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPreguntaEvaluacion(preguntaevaluacionLocal,true);
					
					if(preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(preguntaevaluacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(preguntaevaluacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(preguntaevaluacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(preguntaevaluacion);
	}
	
	public void setVariablesFormularioToObjetoActualPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(preguntaevaluacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.getText()==null || this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.getText()=="" || this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.getText()=="Id") {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.setText("0");
			}

			if(conColumnasBase) {preguntaevaluacion.setId(Long.parseLong(this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEvaluacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelIdPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntaevaluacion.setpregunta(this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextAreapreguntaPreguntaEvaluacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelpreguntaPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntaevaluacion.setcalificacion(Double.parseDouble(this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldcalificacionPreguntaEvaluacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelcalificacionPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntaevaluacion.setorden(Integer.parseInt(this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldordenPreguntaEvaluacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelordenPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacionBean,PreguntaEvaluacion preguntaevaluacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacionOrigen,PreguntaEvaluacion preguntaevaluacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && preguntaevaluacionOrigen.getId()!=null && !preguntaevaluacionOrigen.getId().equals(0L))) {preguntaevaluacion.setId(preguntaevaluacionOrigen.getId());}}
			if(conDefault || (!conDefault && preguntaevaluacionOrigen.getpregunta()!=null && !preguntaevaluacionOrigen.getpregunta().equals(""))) {preguntaevaluacion.setpregunta(preguntaevaluacionOrigen.getpregunta());}
			if(conDefault || (!conDefault && preguntaevaluacionOrigen.getcalificacion()!=null && !preguntaevaluacionOrigen.getcalificacion().equals(0.0))) {preguntaevaluacion.setcalificacion(preguntaevaluacionOrigen.getcalificacion());}
			if(conDefault || (!conDefault && preguntaevaluacionOrigen.getorden()!=null && !preguntaevaluacionOrigen.getorden().equals(0))) {preguntaevaluacion.setorden(preguntaevaluacionOrigen.getorden());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.setText(preguntaevaluacion.getId().toString());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextAreapreguntaPreguntaEvaluacion.setText(preguntaevaluacion.getpregunta());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldcalificacionPreguntaEvaluacion.setText(preguntaevaluacion.getcalificacion().toString());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldordenPreguntaEvaluacion.setText(preguntaevaluacion.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPreguntaEvaluacion(PreguntaEvaluacionBean preguntaevaluacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.setText(preguntaevaluacionBean.getId().toString());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextAreapreguntaPreguntaEvaluacion.setText(preguntaevaluacionBean.getpregunta());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldcalificacionPreguntaEvaluacion.setText(preguntaevaluacionBean.getcalificacion().toString());
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldordenPreguntaEvaluacion.setText(preguntaevaluacionBean.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPreguntaEvaluacion(PreguntaEvaluacionParameterReturnGeneral preguntaevaluacionReturnGeneral,PreguntaEvaluacionBean preguntaevaluacionBean,Boolean conDefault) throws Exception { 
		try {
			PreguntaEvaluacion preguntaevaluacionLocal=new PreguntaEvaluacion();
			
			preguntaevaluacionLocal=preguntaevaluacionReturnGeneral.getPreguntaEvaluacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && preguntaevaluacionLocal.getId()!=null && !preguntaevaluacionLocal.getId().equals(0L))) {preguntaevaluacionBean.setId(preguntaevaluacionLocal.getId());}}
			if(conDefault || (!conDefault && preguntaevaluacionLocal.getpregunta()!=null && !preguntaevaluacionLocal.getpregunta().equals(""))) {preguntaevaluacionBean.setpregunta(preguntaevaluacionLocal.getpregunta());}
			if(conDefault || (!conDefault && preguntaevaluacionLocal.getcalificacion()!=null && !preguntaevaluacionLocal.getcalificacion().equals(0.0))) {preguntaevaluacionBean.setcalificacion(preguntaevaluacionLocal.getcalificacion());}
			if(conDefault || (!conDefault && preguntaevaluacionLocal.getorden()!=null && !preguntaevaluacionLocal.getorden().equals(0))) {preguntaevaluacionBean.setorden(preguntaevaluacionLocal.getorden());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPreguntaEvaluacionGenerico(Long idPreguntaEvaluacionSeleccionado,JComboBox jComboBoxPreguntaEvaluacion,List<PreguntaEvaluacion> preguntaevaluacionsLocal)throws Exception {
		try {
			PreguntaEvaluacion  preguntaevaluacionTemp=null;

			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsLocal) {
				if(preguntaevaluacionAux.getId()!=null && preguntaevaluacionAux.getId().equals(idPreguntaEvaluacionSeleccionado)) {
					preguntaevaluacionTemp=preguntaevaluacionAux;
					break;
				}
			}

			jComboBoxPreguntaEvaluacion.setSelectedItem(preguntaevaluacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPreguntaEvaluacionGenerico(JComboBox jComboBoxPreguntaEvaluacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPreguntaEvaluacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPreguntaEvaluacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPreguntaEvaluacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPreguntaEvaluacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
		 else if(sTipo.equals("SubPreguntaEvaluacion")) {
			jButtonSubPreguntaEvaluacionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntaevaluacion=(PreguntaEvaluacion) preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			preguntaevaluacion =(PreguntaEvaluacion) preguntaevaluacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!preguntaevaluacion.getIsNew() && !preguntaevaluacion.getIsChanged() && !preguntaevaluacion.getIsDeleted()) {
				sDescripcion=preguntaevaluacion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaevaluacion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!preguntaevaluacion.getIsNew() && !preguntaevaluacion.getIsChanged() && !preguntaevaluacion.getIsDeleted()) {
				sDescripcion=preguntaevaluacion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaevaluacion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!preguntaevaluacion.getIsNew() && !preguntaevaluacion.getIsChanged() && !preguntaevaluacion.getIsDeleted()) {
				sDescripcion=preguntaevaluacion.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaevaluacion.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!preguntaevaluacion.getIsNew() && !preguntaevaluacion.getIsChanged() && !preguntaevaluacion.getIsDeleted()) {
				sDescripcion=preguntaevaluacion.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaevaluacion.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!preguntaevaluacion.getIsNew() && !preguntaevaluacion.getIsChanged() && !preguntaevaluacion.getIsDeleted()) {
				sDescripcion=preguntaevaluacion.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaevaluacion.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!preguntaevaluacion.getIsNew() && !preguntaevaluacion.getIsChanged() && !preguntaevaluacion.getIsDeleted()) {
				sDescripcion=preguntaevaluacion.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaevaluacion.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PreguntaEvaluacion preguntaevaluacionRow=new PreguntaEvaluacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntaevaluacionRow=(PreguntaEvaluacion) preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			preguntaevaluacionRow=(PreguntaEvaluacion) preguntaevaluacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleEvaluacionProveedorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PreguntaEvaluacion preguntaevaluacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion = (PreguntaEvaluacion)this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.preguntaevaluacion = (PreguntaEvaluacion)this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(preguntaevaluacion!=null) {
						this.preguntaevaluacion = preguntaevaluacion;
					} else {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}
				}

				if(this.isTienePermisosDetalleEvaluacionProveedor && this.permiteMantenimiento(this.preguntaevaluacion)) {
					DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleevaluacionproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup;
					} else {
						detalleevaluacionproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame;
					}

					List<PreguntaEvaluacion> preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
					preguntaevaluacions.add(this.preguntaevaluacion);
					if(!esRelacionado) {
						//detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(false);
						//detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleevaluacionproveedorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPreguntaEvaluacion.cargarDetalleEvaluacionProveedorBeanSwingJInternalFrame(preguntaevaluacions,this.preguntaevaluacion,detalleevaluacionproveedorBeanSwingJInternalFrame,/*conInicializar,*/detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones(),detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
					detalleevaluacionproveedorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionProveedor("no_relacionado");

						detalleevaluacionproveedorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleEvaluacionProveedorConstantesFunciones.ITAMANIOFILATABLA + (DetalleEvaluacionProveedorConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleevaluacionproveedorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosPreguntaEvaluacion.getBorder();
						TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();

						titledBorderDetalleEvaluacionProveedor.setTitle(titledBorderPreguntaEvaluacion.getTitle() + " -> Detalle Evaluacion Proveedor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleevaluacionproveedorBeanSwingJInternalFrame);
						}

						detalleevaluacionproveedorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleevaluacionproveedorBeanSwingJInternalFrame);

						detalleevaluacionproveedorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Evaluacion Proveedor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSubPreguntaEvaluacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PreguntaEvaluacion preguntaevaluacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion = (PreguntaEvaluacion)this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.preguntaevaluacion = (PreguntaEvaluacion)this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(preguntaevaluacion!=null) {
						this.preguntaevaluacion = preguntaevaluacion;
					} else {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}
				}

				if(this.isTienePermisosSubPreguntaEvaluacion && this.permiteMantenimiento(this.preguntaevaluacion)) {
					SubPreguntaEvaluacionBeanSwingJInternalFrame subpreguntaevaluacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFramePopup=new SubPreguntaEvaluacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subpreguntaevaluacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFramePopup;
					} else {
						subpreguntaevaluacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame;
					}

					List<PreguntaEvaluacion> preguntaevaluacions=new ArrayList<PreguntaEvaluacion>();
					preguntaevaluacions.add(this.preguntaevaluacion);
					if(!esRelacionado) {
						//subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.setConGuardarRelaciones(false);
						//subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subpreguntaevaluacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPreguntaEvaluacion.cargarSubPreguntaEvaluacionBeanSwingJInternalFrame(preguntaevaluacions,this.preguntaevaluacion,subpreguntaevaluacionBeanSwingJInternalFrame,/*conInicializar,*/subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.getConGuardarRelaciones(),subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());
					subpreguntaevaluacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subpreguntaevaluacionBeanSwingJInternalFrame.actualizarEstadoPanelsSubPreguntaEvaluacion("no_relacionado");

						subpreguntaevaluacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubPreguntaEvaluacionConstantesFunciones.ITAMANIOFILATABLA + (SubPreguntaEvaluacionConstantesFunciones.ITAMANIOFILATABLA/2));

						subpreguntaevaluacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosPreguntaEvaluacion.getBorder();
						TitledBorder titledBorderSubPreguntaEvaluacion=(TitledBorder)subpreguntaevaluacionBeanSwingJInternalFrame.jScrollPanelDatosSubPreguntaEvaluacion.getBorder();

						titledBorderSubPreguntaEvaluacion.setTitle(titledBorderPreguntaEvaluacion.getTitle() + " -> Sub Pregunta Evaluacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subpreguntaevaluacionBeanSwingJInternalFrame);
						}

						subpreguntaevaluacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subpreguntaevaluacionBeanSwingJInternalFrame);

						subpreguntaevaluacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Pregunta Evaluacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPreguntaEvaluacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion));			
			this.jButtonDuplicarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaDuplicarPreguntaEvaluacion && this.isPermisoDuplicarPreguntaEvaluacion));			
			this.jButtonCopiarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaCopiarPreguntaEvaluacion && this.isPermisoCopiarPreguntaEvaluacion));
			this.jButtonVerFormPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaVerFormPreguntaEvaluacion && this.isPermisoVerFormPreguntaEvaluacion));
			
			this.jButtonAbrirOrderByPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenPreguntaEvaluacion && this.isPermisoOrdenPreguntaEvaluacion));			
			
			this.jButtonNuevoRelacionesPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion));			
			this.jButtonNuevoGuardarCambiosPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaModificarPreguntaEvaluacion && this.isPermisoActualizarPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaActualizarPreguntaEvaluacion && this.isPermisoActualizarPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaEliminarPreguntaEvaluacion && this.isPermisoEliminarPreguntaEvaluacion));
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarPreguntaEvaluacion);							
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion));						
			this.jButtonDuplicarToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaDuplicarPreguntaEvaluacion && this.isPermisoDuplicarPreguntaEvaluacion));						
			this.jButtonCopiarToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaCopiarPreguntaEvaluacion && this.isPermisoCopiarPreguntaEvaluacion));			
			this.jButtonVerFormToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaVerFormPreguntaEvaluacion && this.isPermisoVerFormPreguntaEvaluacion));			
			this.jButtonAbrirOrderByToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenPreguntaEvaluacion && this.isPermisoOrdenPreguntaEvaluacion));
			this.jButtonNuevoRelacionesToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion));			
			this.jButtonNuevoGuardarCambiosToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));			
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaModificarPreguntaEvaluacion && this.isPermisoActualizarPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaActualizarPreguntaEvaluacion  && this.isPermisoActualizarPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaEliminarPreguntaEvaluacion && this.isPermisoEliminarPreguntaEvaluacion));
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarToolBarPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarPreguntaEvaluacion);				
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion));			
			this.jMenuItemDuplicarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaDuplicarPreguntaEvaluacion && this.isPermisoDuplicarPreguntaEvaluacion));			
			this.jMenuItemCopiarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaCopiarPreguntaEvaluacion && this.isPermisoCopiarPreguntaEvaluacion));			
			this.jMenuItemVerFormPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaVerFormPreguntaEvaluacion && this.isPermisoVerFormPreguntaEvaluacion));			
			this.jMenuItemAbrirOrderByPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenPreguntaEvaluacion && this.isPermisoOrdenPreguntaEvaluacion));			
			//this.jMenuItemMostrarOcultarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenPreguntaEvaluacion && this.isPermisoOrdenPreguntaEvaluacion));
			this.jMenuItemDetalleAbrirOrderByPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenPreguntaEvaluacion && this.isPermisoOrdenPreguntaEvaluacion));			
			//this.jMenuItemDetalleMostrarOcultarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenPreguntaEvaluacion && this.isPermisoOrdenPreguntaEvaluacion));			
			this.jMenuItemNuevoRelacionesPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion));			
			this.jMenuItemNuevoGuardarCambiosPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoPreguntaEvaluacion && this.isPermisoNuevoPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));									
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemModificarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaModificarPreguntaEvaluacion && this.isPermisoActualizarPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemActualizarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaActualizarPreguntaEvaluacion && this.isPermisoActualizarPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemEliminarPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaEliminarPreguntaEvaluacion && this.isPermisoEliminarPreguntaEvaluacion));
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemCancelarPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarPreguntaEvaluacion);				
			}
			
			this.jMenuItemGuardarCambiosPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));						
			this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=this.jButtonNuevoPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaDuplicarPreguntaEvaluacion=this.jButtonDuplicarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaCopiarPreguntaEvaluacion=this.jButtonCopiarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaVerFormPreguntaEvaluacion=this.jButtonVerFormPreguntaEvaluacion.isVisible();
			
			this.isVisibilidadCeldaOrdenPreguntaEvaluacion=this.jButtonAbrirOrderByPreguntaEvaluacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=this.jButtonNuevoRelacionesPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=this.jButtonModificarPreguntaEvaluacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaGuardarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosPreguntaEvaluacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=this.jButtonGuardarCambiosTablaPreguntaEvaluacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=this.jButtonNuevoToolBarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=this.jButtonNuevoRelacionesToolBarPreguntaEvaluacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarToolBarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarToolBarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarToolBarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarToolBarPreguntaEvaluacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPreguntaEvaluacion=this.jButtonGuardarCambiosToolBarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=this.jButtonGuardarCambiosTablaToolBarPreguntaEvaluacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=this.jMenuItemNuevoPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=this.jMenuItemNuevoRelacionesPreguntaEvaluacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemModificarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemActualizarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemEliminarPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemCancelarPreguntaEvaluacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPreguntaEvaluacion=this.jMenuItemGuardarCambiosPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPreguntaEvaluacion(Boolean esInicializar) {
		if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				//if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPreguntaEvaluacion();
			}
			
			this.inicializarActualizarBindingBotonesManualPreguntaEvaluacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPreguntaEvaluacion() {
		this.jButtonNuevoPreguntaEvaluacion.setVisible(this.isPermisoNuevoPreguntaEvaluacion);			
		this.jButtonDuplicarPreguntaEvaluacion.setVisible(this.isPermisoDuplicarPreguntaEvaluacion);			
		this.jButtonCopiarPreguntaEvaluacion.setVisible(this.isPermisoCopiarPreguntaEvaluacion);			
		this.jButtonVerFormPreguntaEvaluacion.setVisible(this.isPermisoVerFormPreguntaEvaluacion);			
		
		this.jButtonAbrirOrderByPreguntaEvaluacion.setVisible(this.isPermisoOrdenPreguntaEvaluacion);					
		
		this.jButtonNuevoRelacionesPreguntaEvaluacion.setVisible(this.isPermisoNuevoPreguntaEvaluacion);			
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarPreguntaEvaluacion.setVisible(this.isPermisoActualizarPreguntaEvaluacion);	
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarPreguntaEvaluacion.setVisible(this.isPermisoActualizarPreguntaEvaluacion);	
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarPreguntaEvaluacion.setVisible(this.isPermisoEliminarPreguntaEvaluacion);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarPreguntaEvaluacion);						
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosPreguntaEvaluacion.setVisible(this.isPermisoGuardarCambiosPreguntaEvaluacion);							
		}
		
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.setVisible(this.isPermisoActualizarPreguntaEvaluacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePreguntaEvaluacion() {
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarPreguntaEvaluacion.setVisible(this.isPermisoActualizarPreguntaEvaluacion);	
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarPreguntaEvaluacion.setVisible(this.isPermisoActualizarPreguntaEvaluacion);	
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarPreguntaEvaluacion.setVisible(this.isPermisoEliminarPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarPreguntaEvaluacion);							
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarPreguntaEvaluacion && this.isPermisoGuardarCambiosPreguntaEvaluacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPreguntaEvaluacion() {
		if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPreguntaEvaluacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPreguntaEvaluacion() {
	}
	
	public void jTableDatosPreguntaEvaluacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPreguntaEvaluacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.preguntaevaluacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPreguntaEvaluacion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.preguntaevaluacionLogic.getConnexion());

				if(this.preguntaevaluacion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.preguntaevaluacion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosPreguntaEvaluacion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPreguntaEvaluacion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.preguntaevaluacion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPreguntaEvaluacion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.preguntaevaluacionLogic.getConnexion());

				if(this.preguntaevaluacion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.preguntaevaluacion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosPreguntaEvaluacion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPreguntaEvaluacion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.preguntaevaluacion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPreguntaEvaluacion(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.preguntaevaluacionLogic.getConnexion());

				if(this.preguntaevaluacion.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.preguntaevaluacion.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosPreguntaEvaluacion.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPreguntaEvaluacion.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.preguntaevaluacion.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPreguntaEvaluacion(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.preguntaevaluacionLogic.getConnexion());

				if(this.preguntaevaluacion.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.preguntaevaluacion.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosPreguntaEvaluacion.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPreguntaEvaluacion.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.preguntaevaluacion.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpreguntaPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getpregunta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pregunta like '%"+this.preguntaevaluacion.getpregunta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncalificacionPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getcalificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where calificacion = "+this.preguntaevaluacion.getcalificacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.preguntaevaluacion.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebPreguntaEvaluacion(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.preguntaevaluacionLogic.getConnexion());

				if(this.preguntaevaluacion.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.preguntaevaluacion.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosPreguntaEvaluacion.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderPreguntaEvaluacion.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.preguntaevaluacion.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebPreguntaEvaluacion(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.preguntaevaluacionLogic.getConnexion());

				if(this.preguntaevaluacion.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.preguntaevaluacion.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosPreguntaEvaluacion.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderPreguntaEvaluacion.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.getpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaevaluacion==null) {
						this.preguntaevaluacion = new PreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);
				}

				if(this.preguntaevaluacion.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.preguntaevaluacion.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);

			this.getPreguntaEvaluacionsBusquedaPorIdEjercicioPorIdPeriodo();

			this.inicializarActualizarBindingPreguntaEvaluacion(false);

			//if(PreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorPreguntaPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);

			this.getPreguntaEvaluacionsBusquedaPorPregunta();

			this.inicializarActualizarBindingPreguntaEvaluacion(false);

			//if(PreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);

			this.getPreguntaEvaluacionsFK_IdAnio();

			this.inicializarActualizarBindingPreguntaEvaluacion(false);

			//if(PreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);

			this.getPreguntaEvaluacionsFK_IdEjercicio();

			this.inicializarActualizarBindingPreguntaEvaluacion(false);

			//if(PreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);

			this.getPreguntaEvaluacionsFK_IdEmpresa();

			this.inicializarActualizarBindingPreguntaEvaluacion(false);

			//if(PreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);

			this.getPreguntaEvaluacionsFK_IdMes();

			this.inicializarActualizarBindingPreguntaEvaluacion(false);

			//if(PreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);

			this.getPreguntaEvaluacionsFK_IdPeriodo();

			this.inicializarActualizarBindingPreguntaEvaluacion(false);

			//if(PreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);

			this.getPreguntaEvaluacionsFK_IdSucursal();

			this.inicializarActualizarBindingPreguntaEvaluacion(false);

			//if(PreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePreguntaEvaluacion() {
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
		

		if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormPreguntaEvaluacion.dispose();
			this.jInternalFrameDetalleFormPreguntaEvaluacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
			this.jInternalFrameReporteDinamicoPreguntaEvaluacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPreguntaEvaluacion.dispose();
			this.jInternalFrameReporteDinamicoPreguntaEvaluacion=null;
		}
		
		if(this.jInternalFrameImportacionPreguntaEvaluacion!=null) {
			this.jInternalFrameImportacionPreguntaEvaluacion.setVisible(false);	    			
			this.jInternalFrameImportacionPreguntaEvaluacion.dispose();
			this.jInternalFrameImportacionPreguntaEvaluacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPreguntaEvaluacion();
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoPreguntaEvaluacion")) {
				jButtonNuevoPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPreguntaEvaluacion")) {
				jButtonDuplicarPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPreguntaEvaluacion")) {
				jButtonCopiarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormPreguntaEvaluacion")) {
				jButtonVerFormPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPreguntaEvaluacion")) {
				jButtonNuevoPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPreguntaEvaluacion")) {
				jButtonDuplicarPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPreguntaEvaluacion")) {
				jButtonNuevoPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPreguntaEvaluacion")) {
				jButtonDuplicarPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPreguntaEvaluacion")) {
				jButtonNuevoPreguntaEvaluacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPreguntaEvaluacion")) {
				jButtonNuevoPreguntaEvaluacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPreguntaEvaluacion")) {
				jButtonNuevoPreguntaEvaluacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPreguntaEvaluacion")) {
				jButtonModificarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPreguntaEvaluacion")) {
				jButtonModificarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPreguntaEvaluacion")) {
				jButtonModificarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPreguntaEvaluacion")) {
				jButtonActualizarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPreguntaEvaluacion")) {
				jButtonActualizarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPreguntaEvaluacion")) {
				jButtonActualizarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarPreguntaEvaluacion")) {
				jButtonEliminarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPreguntaEvaluacion")) {
				jButtonEliminarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPreguntaEvaluacion")) {
				jButtonEliminarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarPreguntaEvaluacion")) {
				jButtonCancelarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPreguntaEvaluacion")) {
				jButtonCancelarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPreguntaEvaluacion")) {
				jButtonCancelarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarPreguntaEvaluacion")) {
				jButtonCerrarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPreguntaEvaluacion")) {
				jButtonCerrarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPreguntaEvaluacion")) {
				jButtonCerrarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPreguntaEvaluacion")) {
				jButtonMostrarOcultarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPreguntaEvaluacion")) {
				jButtonCancelarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPreguntaEvaluacion")) {
				jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPreguntaEvaluacion")) {
				jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPreguntaEvaluacion")) {
				jButtonCopiarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPreguntaEvaluacion")) {
				jButtonVerFormPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPreguntaEvaluacion")) {
				jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPreguntaEvaluacion")) {
				jButtonCopiarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPreguntaEvaluacion")) {
				jButtonVerFormPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPreguntaEvaluacion")) {
				jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPreguntaEvaluacion")) {
				jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPreguntaEvaluacion")) {
				jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPreguntaEvaluacion")) {
				jButtonRecargarInformacionPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPreguntaEvaluacion")) {
				jButtonRecargarInformacionPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPreguntaEvaluacion")) {
				jButtonRecargarInformacionPreguntaEvaluacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPreguntaEvaluacion")) {
				jButtonAnterioresPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPreguntaEvaluacion")) {
				jButtonAnterioresPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePreguntaEvaluacion")) {
				jButtonAnterioresPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPreguntaEvaluacion")) {
				jButtonSiguientesPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPreguntaEvaluacion")) {
				jButtonSiguientesPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPreguntaEvaluacion")) {
				jButtonSiguientesPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPreguntaEvaluacion") || sTipo.equals("MenuItemDetalleAbrirOrderByPreguntaEvaluacion")) {
				jButtonAbrirOrderByPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPreguntaEvaluacion") || sTipo.equals("MenuItemDetalleMostrarOcultarPreguntaEvaluacion")) {
				jButtonMostrarOcultarPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPreguntaEvaluacion")) {
				jButtonNuevoGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPreguntaEvaluacion")) {
				jButtonNuevoGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPreguntaEvaluacion")) {
				jButtonNuevoGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPreguntaEvaluacion")) {
				jButtonCerrarReporteDinamicoPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPreguntaEvaluacion")) {
				jButtonGenerarReporteDinamicoPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPreguntaEvaluacion")) {
				
				jButtonGenerarExcelReporteDinamicoPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPreguntaEvaluacion")) {
				jButtonCerrarImportacionPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPreguntaEvaluacion")) {
				
				jButtonGenerarImportacionPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPreguntaEvaluacion")) {
				
				jButtonAbrirImportacionPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPreguntaEvaluacion")) {
				jComboBoxTiposAccionesPreguntaEvaluacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPreguntaEvaluacion")) {
				jComboBoxTiposRelacionesPreguntaEvaluacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPreguntaEvaluacion")) {
				jComboBoxTiposAccionesPreguntaEvaluacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPreguntaEvaluacion")) {
				
				jComboBoxTiposSeleccionarPreguntaEvaluacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPreguntaEvaluacion")) {
				jTextFieldValorCampoGeneralPreguntaEvaluacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPreguntaEvaluacion")) {
				jButtonAbrirOrderByPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPreguntaEvaluacion")) {
				jButtonAbrirOrderByPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPreguntaEvaluacion")) {
				jButtonCerrarOrderByPreguntaEvaluacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPreguntaEvaluacionBusqueda")) {
				this.jButtonidPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPreguntaEvaluacionUpdate")) {
				this.jButtonid_empresaPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPreguntaEvaluacionBusqueda")) {
				this.jButtonid_empresaPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPreguntaEvaluacionUpdate")) {
				this.jButtonid_sucursalPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPreguntaEvaluacionBusqueda")) {
				this.jButtonid_sucursalPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPreguntaEvaluacionUpdate")) {
				this.jButtonid_ejercicioPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPreguntaEvaluacionBusqueda")) {
				this.jButtonid_ejercicioPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPreguntaEvaluacionUpdate")) {
				this.jButtonid_periodoPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPreguntaEvaluacionBusqueda")) {
				this.jButtonid_periodoPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("preguntaPreguntaEvaluacionBusqueda")) {
				this.jButtonpreguntaPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("calificacionPreguntaEvaluacionBusqueda")) {
				this.jButtoncalificacionPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPreguntaEvaluacionBusqueda")) {
				this.jButtonordenPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPreguntaEvaluacionUpdate")) {
				this.jButtonid_anioPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPreguntaEvaluacionBusqueda")) {
				this.jButtonid_anioPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPreguntaEvaluacionUpdate")) {
				this.jButtonid_mesPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPreguntaEvaluacionBusqueda")) {
				this.jButtonid_mesPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion")) {
				this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorPreguntaPreguntaEvaluacion")) {
				this.jButtonBusquedaPorPreguntaPreguntaEvaluacionActionPerformed(evt);
			}
			
			;
			
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPreguntaEvaluacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				


				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PreguntaEvaluacion preguntaevaluacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				preguntaevaluacionLocal=this.preguntaevaluacion;
			} else {
				preguntaevaluacionLocal=this.preguntaevaluacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
							
				
				


				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
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
			
			


			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEvaluacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
								
						
				


				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
								
				
				


				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
							
				
				


				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
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
			
			


			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
								
				
				


				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEvaluacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPreguntaEvaluacion")) {
					jCheckBoxSeleccionarTodosPreguntaEvaluacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPreguntaEvaluacion")) {
					jCheckBoxSeleccionadosPreguntaEvaluacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPreguntaEvaluacion")) {
					
				}
				
				


				
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
												
				
				


				
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEvaluacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
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
			
			


			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaevaluacion);
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
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
				
				


				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEvaluacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaevaluacionAnterior =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPreguntaEvaluacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPreguntaEvaluacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPreguntaEvaluacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.preguntaevaluacion =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.preguntaevaluacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPreguntaEvaluacion")) {
				
				}
				
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPreguntaEvaluacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPreguntaEvaluacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPreguntaEvaluacion")) {
			
			}
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPreguntaEvaluacion();
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
			if(sTipo.equals("NuevoPreguntaEvaluacion")) {
				jButtonNuevoPreguntaEvaluacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPreguntaEvaluacion")) {
				jButtonDuplicarPreguntaEvaluacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPreguntaEvaluacion")) {
				jButtonCopiarPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPreguntaEvaluacion")) {
				jButtonVerFormPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPreguntaEvaluacion")) {
				jButtonNuevoPreguntaEvaluacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPreguntaEvaluacion")) {
				jButtonModificarPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPreguntaEvaluacion")) {
				jButtonActualizarPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPreguntaEvaluacion")) {
				jButtonEliminarPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPreguntaEvaluacion")) {
				jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPreguntaEvaluacion")) {
				jButtonCancelarPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPreguntaEvaluacion")) {
				jButtonCerrarPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPreguntaEvaluacion")) {
				jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPreguntaEvaluacion")) {
				jButtonNuevoGuardarCambiosPreguntaEvaluacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPreguntaEvaluacion")) {
				jButtonAbrirOrderByPreguntaEvaluacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPreguntaEvaluacion")) {
				jButtonRecargarInformacionPreguntaEvaluacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPreguntaEvaluacion")) {
				jButtonAnterioresPreguntaEvaluacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPreguntaEvaluacion")) {
				jButtonSiguientesPreguntaEvaluacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPreguntaEvaluacionBusqueda")) {
				this.jButtonidPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPreguntaEvaluacionUpdate")) {
				this.jButtonid_empresaPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPreguntaEvaluacionBusqueda")) {
				this.jButtonid_empresaPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPreguntaEvaluacionUpdate")) {
				this.jButtonid_sucursalPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPreguntaEvaluacionBusqueda")) {
				this.jButtonid_sucursalPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPreguntaEvaluacionUpdate")) {
				this.jButtonid_ejercicioPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPreguntaEvaluacionBusqueda")) {
				this.jButtonid_ejercicioPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPreguntaEvaluacionUpdate")) {
				this.jButtonid_periodoPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPreguntaEvaluacionBusqueda")) {
				this.jButtonid_periodoPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("preguntaPreguntaEvaluacionBusqueda")) {
				this.jButtonpreguntaPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("calificacionPreguntaEvaluacionBusqueda")) {
				this.jButtoncalificacionPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPreguntaEvaluacionBusqueda")) {
				this.jButtonordenPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPreguntaEvaluacionUpdate")) {
				this.jButtonid_anioPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPreguntaEvaluacionBusqueda")) {
				this.jButtonid_anioPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPreguntaEvaluacionUpdate")) {
				this.jButtonid_mesPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPreguntaEvaluacionBusqueda")) {
				this.jButtonid_mesPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPreguntaEvaluacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePreguntaEvaluacion")) {
				closingInternalFramePreguntaEvaluacion();
				
			} else if(sTipo.equals("jButtonCancelarPreguntaEvaluacion")) {
				JInternalFrameBase jInternalFrameDetalleFormPreguntaEvaluacion = (JInternalFrameBase)evt.getSource();
	            	
	            PreguntaEvaluacionBeanSwingJInternalFrame jInternalFrameParent=(PreguntaEvaluacionBeanSwingJInternalFrame)jInternalFrameDetalleFormPreguntaEvaluacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPreguntaEvaluacionActionPerformed(null);
			}
			
			PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.preguntaevaluacion,new Object(),this.preguntaevaluacionParameterGeneral,this.preguntaevaluacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPreguntaEvaluacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPreguntaEvaluacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPreguntaEvaluacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.preguntaevaluacion)) {
			if(!esControlTabla) {
				if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);			
				}
				
				if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.preguntaevaluacionReturnGeneral=preguntaevaluacionLogic.procesarEventosPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntaevaluacionLogic.getPreguntaEvaluacions(),this.preguntaevaluacion,this.preguntaevaluacionParameterGeneral,this.isEsNuevoPreguntaEvaluacion,classes);//this.preguntaevaluacionLogic.getPreguntaEvaluacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral,this.preguntaevaluacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPreguntaEvaluacion(classes,this.preguntaevaluacionReturnGeneral,this.preguntaevaluacionBean,false);
					}
						
					if(this.preguntaevaluacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion());	
					}
						
					if(this.preguntaevaluacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion(),classes);//this.preguntaevaluacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPreguntaEvaluacion(this.preguntaevaluacion,classes);//this.preguntaevaluacionBean);									
				}
			
				if(PreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPreguntaEvaluacion(this.preguntaevaluacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEvaluacion(this.preguntaevaluacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.preguntaevaluacionAnterior!=null) {
						this.preguntaevaluacion=this.preguntaevaluacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.preguntaevaluacionReturnGeneral=preguntaevaluacionLogic.procesarEventosPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntaevaluacionLogic.getPreguntaEvaluacions(),this.preguntaevaluacion,this.preguntaevaluacionParameterGeneral,this.isEsNuevoPreguntaEvaluacion,classes);//this.preguntaevaluacionLogic.getPreguntaEvaluacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.preguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion(),preguntaevaluacionLogic.getPreguntaEvaluacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion(),this.preguntaevaluacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPreguntaEvaluacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosPreguntaEvaluacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPreguntaEvaluacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosPreguntaEvaluacion() throws Exception {
		
		PreguntaEvaluacionModel preguntaevaluacionModel=(PreguntaEvaluacionModel)this.jTableDatosPreguntaEvaluacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntaevaluacionModel.preguntaevaluacions=this.preguntaevaluacionLogic.getPreguntaEvaluacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			preguntaevaluacionModel.preguntaevaluacions=this.preguntaevaluacions;
		}
		
		
		((PreguntaEvaluacionModel) this.jTableDatosPreguntaEvaluacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPreguntaEvaluacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpreguntaevaluacionAnterior(),this.preguntaevaluacionLogic.getPreguntaEvaluacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpreguntaevaluacionAnterior(),this.preguntaevaluacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPreguntaEvaluacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(preguntaevaluacion.getDetalleEvaluacionProveedors());
					this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubPreguntaEvaluacion.class)) {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(preguntaevaluacion.getSubPreguntaEvaluacions());
					this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
										
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntaevaluacion,new Object(),generalEntityParameterGeneral,this.preguntaevaluacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PreguntaEvaluacionConstantesFunciones.getClassesRelationshipsOfPreguntaEvaluacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PreguntaEvaluacionConstantesFunciones.getClassesRelationshipsFromStringsOfPreguntaEvaluacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPreguntaEvaluacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntaevaluacion,new Object(),generalEntityParameterGeneral,this.preguntaevaluacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPreguntaEvaluacion(PreguntaEvaluacionBean preguntaevaluacionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(preguntaevaluacion.getDetalleEvaluacionProveedors());
					this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubPreguntaEvaluacion.class)) {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(preguntaevaluacion.getSubPreguntaEvaluacions());
					this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPreguntaEvaluacion(ArrayList<Classe> classes,PreguntaEvaluacionReturnGeneral preguntaevaluacionReturnGeneral,PreguntaEvaluacionBean preguntaevaluacionBean,Boolean conDefault) throws Exception {
		
			this.preguntaevaluacionBean.setDetalleEvaluacionProveedors(preguntaevaluacionReturnGeneral.getPreguntaEvaluacion().getDetalleEvaluacionProveedors());
			this.preguntaevaluacionBean.setSubPreguntaEvaluacions(preguntaevaluacionReturnGeneral.getPreguntaEvaluacion().getSubPreguntaEvaluacions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					preguntaevaluacion.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubPreguntaEvaluacion.class)) {
					preguntaevaluacion.setSubPreguntaEvaluacions(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.preguntaevaluacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion = new PreguntaEvaluacionDetalleFormJInternalFrame(jDesktopPane,this.preguntaevaluacionSessionBean.getConGuardarRelaciones(),this.preguntaevaluacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.setVisible(false);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.preguntaevaluacionLogic=this.preguntaevaluacionLogic;
		
		this.cargarCombosFrameForeignKeyPreguntaEvaluacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePreguntaEvaluacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePreguntaEvaluacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPreguntaEvaluacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPreguntaEvaluacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPreguntaEvaluacion"));
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ModificarPreguntaEvaluacion"));

		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarToolBarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPreguntaEvaluacion"));
					
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemModificarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPreguntaEvaluacion"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"ActualizarPreguntaEvaluacion"));
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarToolBarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPreguntaEvaluacion"));
						
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemActualizarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPreguntaEvaluacion"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"EliminarPreguntaEvaluacion"));
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPreguntaEvaluacion"));
								
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemEliminarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPreguntaEvaluacion"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CancelarPreguntaEvaluacion"));
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPreguntaEvaluacion"));
					
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemCancelarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPreguntaEvaluacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemDetalleCerrarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPreguntaEvaluacion"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaEvaluacion"));
		
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaEvaluacion"));
		
		
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPreguntaEvaluacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonidPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_empresaPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_empresaPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_sucursalPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_sucursalPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_ejercicioPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_ejercicioPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_periodoPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_periodoPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonpreguntaPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"preguntaPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtoncalificacionPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"calificacionPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonordenPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_anioPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_anioPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_mesPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_mesPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEvaluacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPreguntaEvaluacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePreguntaEvaluacion"));
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPreguntaEvaluacion"));
		}
		
		this.jTableDatosPreguntaEvaluacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPreguntaEvaluacion"));
		
		this.jTableDatosPreguntaEvaluacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPreguntaEvaluacion"));
		
		this.jButtonNuevoPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"NuevoPreguntaEvaluacion"));
		
		this.jButtonDuplicarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"DuplicarPreguntaEvaluacion"));
		
		this.jButtonCopiarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"CopiarPreguntaEvaluacion"));
		
		this.jButtonVerFormPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"VerFormPreguntaEvaluacion"));
		
		
		this.jButtonNuevoToolBarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarPreguntaEvaluacion"));
			
		this.jButtonDuplicarToolBarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPreguntaEvaluacion"));
			
		this.jMenuItemNuevoPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPreguntaEvaluacion"));
			
		this.jMenuItemDuplicarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPreguntaEvaluacion"));		
		
		
		this.jButtonNuevoRelacionesPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPreguntaEvaluacion"));
		
		
		this.jButtonNuevoRelacionesToolBarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPreguntaEvaluacion"));
			
		this.jMenuItemNuevoRelacionesPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPreguntaEvaluacion"));		
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ModificarPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonModificarToolBarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPreguntaEvaluacion"));
			
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemModificarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPreguntaEvaluacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"ActualizarPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonActualizarToolBarPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPreguntaEvaluacion"));
				
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemActualizarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPreguntaEvaluacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"EliminarPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonEliminarToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPreguntaEvaluacion"));
						
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemEliminarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPreguntaEvaluacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CancelarPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonCancelarToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPreguntaEvaluacion"));
			
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemCancelarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPreguntaEvaluacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPreguntaEvaluacion"));		
		
		
		this.jButtonCerrarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CerrarPreguntaEvaluacion"));
		
		
		this.jButtonCerrarToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarPreguntaEvaluacion"));
			
		this.jMenuItemCerrarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPreguntaEvaluacion"));
			
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jMenuItemDetalleCerrarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPreguntaEvaluacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaEvaluacion"));
		}
		
		this.jButtonCopiarToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarPreguntaEvaluacion"));
			
		this.jButtonVerFormToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarPreguntaEvaluacion"));
		
		this.jMenuItemGuardarCambiosPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPreguntaEvaluacion"));
			
		this.jMenuItemCopiarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPreguntaEvaluacion"));		
		
		this.jMenuItemVerFormPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPreguntaEvaluacion"));		
		
		
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPreguntaEvaluacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPreguntaEvaluacion"));
			
		this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPreguntaEvaluacion"));		
		
		
		
		this.jButtonRecargarInformacionPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionPreguntaEvaluacion"));
					
		this.jButtonRecargarInformacionToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPreguntaEvaluacion"));
		
		this.jMenuItemRecargarInformacionPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPreguntaEvaluacion"));		
		
		
		
		this.jButtonAnterioresPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"AnterioresPreguntaEvaluacion"));
		
		
		this.jButtonAnterioresToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPreguntaEvaluacion"));
		
		this.jMenuItemAnterioresPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPreguntaEvaluacion"));		
		
		
		this.jButtonSiguientesPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"SiguientesPreguntaEvaluacion"));
		
		
		this.jButtonSiguientesToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPreguntaEvaluacion"));
			
		this.jMenuItemSiguientesPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPreguntaEvaluacion"));
			
		this.jMenuItemAbrirOrderByPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPreguntaEvaluacion"));
			
		this.jMenuItemMostrarOcultarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPreguntaEvaluacion"));
			
		this.jMenuItemDetalleAbrirOrderByPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPreguntaEvaluacion"));
			
		this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPreguntaEvaluacion"));		
		
		
		this.jButtonNuevoGuardarCambiosPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPreguntaEvaluacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPreguntaEvaluacion"));
			
		this.jMenuItemNuevoGuardarCambiosPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPreguntaEvaluacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPreguntaEvaluacion"));

		this.jCheckBoxSeleccionadosPreguntaEvaluacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPreguntaEvaluacion"));
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPreguntaEvaluacion"));
		}
		
		
		this.jComboBoxTiposRelacionesPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesPreguntaEvaluacion"));
			
		this.jComboBoxTiposAccionesPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposAccionesPreguntaEvaluacion"));
					
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPreguntaEvaluacion"));
			
		this.jTextFieldValorCampoGeneralPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPreguntaEvaluacion"));		
		
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonidPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_empresaPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_empresaPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_sucursalPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_sucursalPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_ejercicioPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_ejercicioPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_periodoPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_periodoPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonpreguntaPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"preguntaPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtoncalificacionPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"calificacionPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonordenPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_anioPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_anioPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_mesPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_mesPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEvaluacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion"));

			this.jButtonBusquedaPorPreguntaPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"BusquedaPorPreguntaPreguntaEvaluacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPreguntaEvaluacion!=null) {
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaEvaluacion"));
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaEvaluacion"));
				this.jInternalFrameReporteDinamicoPreguntaEvaluacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaEvaluacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaEvaluacion"));				
			//this.jButtonGenerarReporteDinamicoPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaEvaluacion"));
			//this.jButtonGenerarExcelReporteDinamicoPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaEvaluacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPreguntaEvaluacion!=null) {
				this.jInternalFrameImportacionPreguntaEvaluacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPreguntaEvaluacion"));
				this.jInternalFrameImportacionPreguntaEvaluacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPreguntaEvaluacion"));
				this.jInternalFrameImportacionPreguntaEvaluacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPreguntaEvaluacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByPreguntaEvaluacion"));
			
			this.jButtonAbrirOrderByToolBarPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPreguntaEvaluacion"));			
			
			if(this.jInternalFrameOrderByPreguntaEvaluacion!=null) {
				this.jInternalFrameOrderByPreguntaEvaluacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPreguntaEvaluacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEvaluacion.jTabbedPaneRelacionesPreguntaEvaluacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPreguntaEvaluacion"));
		
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
            		closingInternalFramePreguntaEvaluacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPreguntaEvaluacion = (JInternalFrameBase)event.getSource();
	            	
	            PreguntaEvaluacionBeanSwingJInternalFrame jInternalFrameParent=(PreguntaEvaluacionBeanSwingJInternalFrame)jInternalFrameDetalleFormPreguntaEvaluacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPreguntaEvaluacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPreguntaEvaluacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPreguntaEvaluacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPreguntaEvaluacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPreguntaEvaluacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEvaluacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEvaluacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEvaluacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPreguntaEvaluacion";
		inputMap = this.jButtonNuevoPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPreguntaEvaluacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEvaluacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEvaluacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEvaluacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPreguntaEvaluacion";
		inputMap = this.jButtonNuevoRelacionesPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPreguntaEvaluacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPreguntaEvaluacion";
		inputMap = this.jButtonModificarPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPreguntaEvaluacion";
		inputMap = this.jButtonActualizarPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPreguntaEvaluacion";
		inputMap = this.jButtonEliminarPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPreguntaEvaluacion";
		inputMap = this.jButtonCancelarPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPreguntaEvaluacion";
		inputMap = this.jButtonCerrarPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPreguntaEvaluacion";
		inputMap = this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonGuardarCambiosPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPreguntaEvaluacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPreguntaEvaluacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPreguntaEvaluacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPreguntaEvaluacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPreguntaEvaluacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPreguntaEvaluacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPreguntaEvaluacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPreguntaEvaluacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonidPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_empresaPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_empresaPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_sucursalPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_sucursalPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_ejercicioPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_ejercicioPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_periodoPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_periodoPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonpreguntaPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"preguntaPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtoncalificacionPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"calificacionPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonordenPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_anioPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_anioPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_mesPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jButtonid_mesPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEvaluacionBusqueda"));
		
		
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion"));

		this.jButtonBusquedaPorPreguntaPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"BusquedaPorPreguntaPreguntaEvaluacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPreguntaEvaluacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPreguntaEvaluacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPreguntaEvaluacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
					preguntaevaluacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacions) {
					preguntaevaluacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPreguntaEvaluacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
						preguntaevaluacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacions) {
						preguntaevaluacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPreguntaEvaluacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPreguntaEvaluacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPreguntaEvaluacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPreguntaEvaluacion.getSelectedRows();
			
			PreguntaEvaluacion preguntaevaluacionLocal=new PreguntaEvaluacion();
			
			//this.seleccionarTodosPreguntaEvaluacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLocal =(PreguntaEvaluacion) this.preguntaevaluacionLogic.getPreguntaEvaluacions().toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					preguntaevaluacionLocal =(PreguntaEvaluacion) this.preguntaevaluacions.toArray()[this.jTableDatosPreguntaEvaluacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				preguntaevaluacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
						preguntaevaluacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacions) {
						preguntaevaluacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPreguntaEvaluacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPreguntaEvaluacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEvaluacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPreguntaEvaluacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPreguntaEvaluacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPreguntaEvaluacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPreguntaEvaluacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacionLogic.getPreguntaEvaluacions()) {
				
						if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA)) {
							existe=true;
							preguntaevaluacionAux.setpregunta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION)) {
							existe=true;
							preguntaevaluacionAux.setcalificacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							preguntaevaluacionAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacions) {
					
						if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA)) {
							existe=true;
							preguntaevaluacionAux.setpregunta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION)) {
							existe=true;
							preguntaevaluacionAux.setcalificacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							preguntaevaluacionAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPreguntaEvaluacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPreguntaEvaluacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPreguntaEvaluacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePreguntaEvaluacion) {				
					conSplash=true;//false;										
					
					//this.startProcessPreguntaEvaluacion(conSplash);
				
					this.generarReportePreguntaEvaluacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPreguntaEvaluacionsSeleccionados();
				//this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreguntaEvaluacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreguntaEvaluacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPreguntaEvaluacion();
				
				this.exportarPreguntaEvaluacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPreguntaEvaluacions();
				//this.importarPreguntaEvaluacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPreguntaEvaluacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPreguntaEvaluacionsSeleccionados();
				//this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pregunta Evaluacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPreguntaEvaluacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPreguntaEvaluacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPreguntaEvaluacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setSelectedIndex(0);					
				}	
			} 			
			else if(PreguntaEvaluacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePreguntaEvaluacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPreguntaEvaluacion(conSplash);
					
						//this.actualizarParametrosGeneralPreguntaEvaluacion();
						
						this.generarReporteProcesoAccionPreguntaEvaluacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PreguntaEvaluacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pregunta EvaluacionS SELECCIONADOS?", "MANTENIMIENTO DE Pregunta Evaluacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPreguntaEvaluacion();
				
						this.actualizarParametrosGeneralPreguntaEvaluacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.preguntaevaluacionReturnGeneral=preguntaevaluacionLogic.procesarAccionPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.preguntaevaluacionLogic.getPreguntaEvaluacions(),this.preguntaevaluacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPreguntaEvaluacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPreguntaEvaluacion();
					
					PreguntaEvaluacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPreguntaEvaluacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPreguntaEvaluacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPreguntaEvaluacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPreguntaEvaluacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPreguntaEvaluacion();
			
			if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		
			PreguntaEvaluacion preguntaevaluacion=new PreguntaEvaluacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPreguntaEvaluacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPreguntaEvaluacion.getSelectedItem();
			
			
			
			
			preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(preguntaevaluacionsSeleccionados.size()==1) {
				for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsSeleccionados) {
					preguntaevaluacion=preguntaevaluacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Evaluacion Proveedor")) {
					jButtonDetalleEvaluacionProveedorActionPerformed(null,rowIndex,true,false,preguntaevaluacion);
				}
				else if(this.sTipoRelacion.equals("Sub Pregunta Evaluacion")) {
					jButtonSubPreguntaEvaluacionActionPerformed(null,rowIndex,true,false,preguntaevaluacion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPreguntaEvaluacion();
			
      		//this.finishProcessPreguntaEvaluacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPreguntaEvaluacionReturnGeneral() throws Exception {
		if(this.preguntaevaluacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.preguntaevaluacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.preguntaevaluacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.preguntaevaluacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.preguntaevaluacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.preguntaevaluacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPreguntaEvaluacion(false);
		}
		
		if(this.preguntaevaluacionReturnGeneral.getConRetornoLista() || this.preguntaevaluacionReturnGeneral.getConRetornoObjeto()) {
			if(this.preguntaevaluacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.preguntaevaluacionLogic.setPreguntaEvaluacions(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.preguntaevaluacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.preguntaevaluacionLogic.setPreguntaEvaluacion(this.preguntaevaluacionReturnGeneral.getPreguntaEvaluacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPreguntaEvaluacion(false);
		}
	}
	
	public void actualizarParametrosGeneralPreguntaEvaluacion() throws Exception {
		
		
	}
	
	public ArrayList<PreguntaEvaluacion> getPreguntaEvaluacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPreguntaEvaluacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionLogic.getPreguntaEvaluacions()) {
					if(preguntaevaluacionAux.getIsSelected()) {
						preguntaevaluacionsSeleccionados.add(preguntaevaluacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaEvaluacion preguntaevaluacionAux:this.preguntaevaluacions) {
					if(preguntaevaluacionAux.getIsSelected()) {
						preguntaevaluacionsSeleccionados.add(preguntaevaluacionAux);				
					}
				}
			}
			
			if(preguntaevaluacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						preguntaevaluacionsSeleccionados.addAll(this.preguntaevaluacionLogic.getPreguntaEvaluacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						preguntaevaluacionsSeleccionados.addAll(this.preguntaevaluacions);				
					}
				}
			}
		} else {
			preguntaevaluacionsSeleccionados.add(this.preguntaevaluacion);
		}
		
		return preguntaevaluacionsSeleccionados;
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
	
	public void generarReportePreguntaEvaluacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPreguntaEvaluacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPreguntaEvaluacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreguntaEvaluacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreguntaEvaluacionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPreguntaEvaluacionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pregunta Evaluacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePreguntaEvaluacions("Todos",preguntaevaluacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePreguntaEvaluacions("Todos",preguntaevaluacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPreguntaEvaluacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePreguntaEvaluacions("Todos",preguntaevaluacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPreguntaEvaluacion();
		
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPreguntaEvaluacion();
		
		
		//this.generarReportePreguntaEvaluacions("Todos",preguntaevaluacionsSeleccionados ,preguntaevaluacionImplementable,preguntaevaluacionImplementableHome);
	}
	
	public void mostrarImportacionPreguntaEvaluacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPreguntaEvaluacion();
		
		this.abrirFrameImportacionPreguntaEvaluacion();		
		
			
		//this.generarReportePreguntaEvaluacions("Todos",preguntaevaluacionsSeleccionados ,preguntaevaluacionImplementable,preguntaevaluacionImplementableHome);
	}
	
	public void importarPreguntaEvaluacions() throws Exception {		
	
	}
	
	public void exportarPreguntaEvaluacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPreguntaEvaluacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPreguntaEvaluacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPreguntaEvaluacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pregunta Evaluacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaevaluacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPreguntaEvaluacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPreguntaEvaluacion(preguntaevaluacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//preguntaevaluacionAux.setsDetalleGeneralEntityReporte(preguntaevaluacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPreguntaEvaluacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEvaluacionConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=preguntaevaluacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getpregunta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getcalificacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaevaluacion.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaevaluacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PreguntaEvaluacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPreguntaEvaluacion(row);				
				iRow++;
			}				
			
			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPreguntaEvaluacion(preguntaevaluacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();		
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaevaluacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("preguntaevaluacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("preguntaevaluacion");
			//elementRoot.appendChild(element);
		
			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsSeleccionados) {
				element = document.createElement("preguntaevaluacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPreguntaEvaluacion(preguntaevaluacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPreguntaEvaluacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEvaluacionConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getpregunta());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getcalificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaevaluacion.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPreguntaEvaluacion(PreguntaEvaluacion preguntaevaluacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PreguntaEvaluacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(preguntaevaluacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PreguntaEvaluacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(preguntaevaluacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PreguntaEvaluacionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(preguntaevaluacion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PreguntaEvaluacionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(preguntaevaluacion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PreguntaEvaluacionConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(preguntaevaluacion.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PreguntaEvaluacionConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(preguntaevaluacion.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementpregunta = document.createElement(PreguntaEvaluacionConstantesFunciones.PREGUNTA);
		elementpregunta.appendChild(document.createTextNode(preguntaevaluacion.getpregunta().trim()));
		element.appendChild(elementpregunta);

		Element elementcalificacion = document.createElement(PreguntaEvaluacionConstantesFunciones.CALIFICACION);
		elementcalificacion.appendChild(document.createTextNode(preguntaevaluacion.getcalificacion().toString().trim()));
		element.appendChild(elementcalificacion);

		Element elementorden = document.createElement(PreguntaEvaluacionConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(preguntaevaluacion.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementanio_descripcion = document.createElement(PreguntaEvaluacionConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(preguntaevaluacion.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(PreguntaEvaluacionConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(preguntaevaluacion.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoPreguntaEvaluacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados=new ArrayList<PreguntaEvaluacion>();
		
		preguntaevaluacionsSeleccionados=this.getPreguntaEvaluacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPreguntaEvaluacion(preguntaevaluacionsSeleccionados);
		
		this.generarReportePreguntaEvaluacions("Todos",preguntaevaluacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPreguntaEvaluacion(ArrayList<PreguntaEvaluacion> preguntaevaluacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsSeleccionados) {
				preguntaevaluacionAux.setsDetalleGeneralEntityReporte(preguntaevaluacionAux.toString());
			
				if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					preguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(preguntaevaluacionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					preguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(preguntaevaluacionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					preguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(preguntaevaluacionAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					preguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(preguntaevaluacionAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA)) {
					existe=true;
					preguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(preguntaevaluacionAux.getpregunta());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					preguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(preguntaevaluacionAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					preguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(preguntaevaluacionAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEvaluacionConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					preguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(preguntaevaluacionAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPreguntaEvaluacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPreguntaEvaluacion=true;
				this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=true;
				this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=true;
			}
			
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=true;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=true;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=true;
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=true;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=true;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=true;
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarPreguntaEvaluacion=true;
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarPreguntaEvaluacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEvaluacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=true;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=true;
		} else {
			this.actualizarEstadoPanelsPreguntaEvaluacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPreguntaEvaluacion=false;
			//this.isVisibilidadCeldaVerFormPreguntaEvaluacion=false;
			this.isVisibilidadCeldaDuplicarPreguntaEvaluacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
		} else {
			this.isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			if(!preguntaevaluacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;												
			}
			
			this.jButtonCerrarPreguntaEvaluacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEvaluacion=false;
		}
		
		if(!this.permiteMantenimiento(this.preguntaevaluacion)) {
			this.isVisibilidadCeldaActualizarPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarPreguntaEvaluacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPreguntaEvaluacion() {
		this.isVisibilidadCeldaNuevoPreguntaEvaluacion=false;
		this.isVisibilidadCeldaGuardarCambiosPreguntaEvaluacion=false;
	}
	
	public void actualizarEstadoPanelsPreguntaEvaluacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionPreguntaEvaluacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaEvaluacion!=null) {
				this.jPanelPaginacionPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionPreguntaEvaluacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaEvaluacion!=null) {
				this.jPanelPaginacionPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionPreguntaEvaluacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaEvaluacion!=null) {
				this.jPanelPaginacionPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionPreguntaEvaluacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaEvaluacion!=null) {
				this.jPanelPaginacionPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionPreguntaEvaluacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaEvaluacion!=null) {
				this.jPanelPaginacionPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionPreguntaEvaluacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaEvaluacion!=null) {
				this.jPanelPaginacionPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionPreguntaEvaluacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaEvaluacion!=null) {
				this.jPanelPaginacionPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
					this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesPreguntaEvaluacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);}

			this.isVisibilidadBusquedaPorPregunta=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorPregunta) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorPreguntaPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);}

			this.isVisibilidadBusquedaPorPregunta=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorPregunta) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorPreguntaPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaEjercicio;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);}

			this.isVisibilidadBusquedaPorPregunta=isParaEjercicioNegation;
			if(!this.isVisibilidadBusquedaPorPregunta) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorPreguntaPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaPeriodo;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);}

			this.isVisibilidadBusquedaPorPregunta=isParaPeriodoNegation;
			if(!this.isVisibilidadBusquedaPorPregunta) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorPreguntaPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaAnioNegation;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);}

			this.isVisibilidadBusquedaPorPregunta=isParaAnioNegation;
			if(!this.isVisibilidadBusquedaPorPregunta) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorPreguntaPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaMesNegation;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);}

			this.isVisibilidadBusquedaPorPregunta=isParaMesNegation;
			if(!this.isVisibilidadBusquedaPorPregunta) {this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(jPanelBusquedaPorPreguntaPreguntaEvaluacion);}
		}
		
	}
	
	

	public String registrarSesionPreguntaEvaluacionParaDetalleEvaluacionProveedores() throws Exception {
		Boolean isPaginaPopupDetalleEvaluacionProveedor=false;

		try {

			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean==null) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setsPathNavegacionActual(preguntaevaluacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionProveedor(true);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionProveedor(PreguntaEvaluacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setisBusquedaDesdeForeignKeySesionPreguntaEvaluacion(true);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setlidPreguntaEvaluacionActual(this.idPreguntaEvaluacionActual);

			preguntaevaluacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPreguntaEvaluacion(true);
			preguntaevaluacionSessionBean.setlIdPreguntaEvaluacionActualForeignKey(this.idPreguntaEvaluacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPreguntaEvaluacionParaSubPreguntaEvaluaciones() throws Exception {
		Boolean isPaginaPopupSubPreguntaEvaluacion=false;

		try {

			if(this.preguntaevaluacionSessionBean==null) {
				this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean==null) {
				this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			}

			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean.setsPathNavegacionActual(preguntaevaluacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubPreguntaEvaluacion=this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubPreguntaEvaluacion(true);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubPreguntaEvaluacion(PreguntaEvaluacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean.setisBusquedaDesdeForeignKeySesionPreguntaEvaluacion(true);
			this.jInternalFrameDetalleFormPreguntaEvaluacion.subpreguntaevaluacionSessionBean.setlidPreguntaEvaluacionActual(this.idPreguntaEvaluacionActual);

			preguntaevaluacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPreguntaEvaluacion(true);
			preguntaevaluacionSessionBean.setlIdPreguntaEvaluacionActualForeignKey(this.idPreguntaEvaluacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
		
		if(this.preguntaevaluacionSessionBean==null) {
			this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
		}
		
		this.preguntaevaluacionSessionBean.setsUltimaBusquedaPreguntaEvaluacion(this.getsAccionBusqueda());
		this.preguntaevaluacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.preguntaevaluacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdEjercicioPorIdPeriodo")) {
			preguntaevaluacionSessionBean.setid_ejercicio(this.getid_ejercicioBusquedaPorIdEjercicioPorIdPeriodo());	
			preguntaevaluacionSessionBean.setid_periodo(this.getid_periodoBusquedaPorIdEjercicioPorIdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorPregunta")) {
			preguntaevaluacionSessionBean.setpregunta(this.getpreguntaBusquedaPorPregunta());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			preguntaevaluacionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			preguntaevaluacionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
		
		if(this.preguntaevaluacionSessionBean==null) {
			this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
		}
		
		if(this.preguntaevaluacionSessionBean.getsUltimaBusquedaPreguntaEvaluacion()!=null&&!this.preguntaevaluacionSessionBean.getsUltimaBusquedaPreguntaEvaluacion().equals("")) {
			this.setsAccionBusqueda(preguntaevaluacionSessionBean.getsUltimaBusquedaPreguntaEvaluacion());
			this.setiNumeroPaginacion(preguntaevaluacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(preguntaevaluacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdEjercicioPorIdPeriodo")) {
				this.setid_ejercicioBusquedaPorIdEjercicioPorIdPeriodo(preguntaevaluacionSessionBean.getid_ejercicio());
				preguntaevaluacionSessionBean.setid_ejercicio(-1L);
				this.setid_periodoBusquedaPorIdEjercicioPorIdPeriodo(preguntaevaluacionSessionBean.getid_periodo());
				preguntaevaluacionSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorPregunta")) {
				this.setpreguntaBusquedaPorPregunta(preguntaevaluacionSessionBean.getpregunta());
				preguntaevaluacionSessionBean.setpregunta("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(preguntaevaluacionSessionBean.getid_empresa());
				preguntaevaluacionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(preguntaevaluacionSessionBean.getid_sucursal());
				preguntaevaluacionSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.preguntaevaluacionSessionBean.setsUltimaBusquedaPreguntaEvaluacion("");
		this.preguntaevaluacionSessionBean.setiNumeroPaginacion(PreguntaEvaluacionConstantesFunciones.INUMEROPAGINACION);
		this.preguntaevaluacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPreguntaEvaluacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPreguntaEvaluacion() {
		this.updateBorderResaltarBusquedasFormularioPreguntaEvaluacion();
		this.updateVisibilidadBusquedasFormularioPreguntaEvaluacion();
		this.updateHabilitarBusquedasFormularioPreguntaEvaluacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioPreguntaEvaluacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponents().length>0) {
	

		if(this.preguntaevaluacionConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion!=null) {
			index= this.jTabbedPaneBusquedasPreguntaEvaluacion.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponent(index);
				jPanel.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
			}
		}

		if(this.preguntaevaluacionConstantesFunciones.resaltarBusquedaPorPreguntaPreguntaEvaluacion!=null) {
			index= this.jTabbedPaneBusquedasPreguntaEvaluacion.indexOfComponent(this.jPanelBusquedaPorPreguntaPreguntaEvaluacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponent(index);
				jPanel.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarBusquedaPorPreguntaPreguntaEvaluacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPreguntaEvaluacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPreguntaEvaluacion.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
			if(!this.preguntaevaluacionConstantesFunciones.mostrarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion && index>-1) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPreguntaEvaluacion.indexOfComponent(this.jPanelBusquedaPorPreguntaPreguntaEvaluacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarBusquedaPorPreguntaPreguntaEvaluacion);
			if(!this.preguntaevaluacionConstantesFunciones.mostrarBusquedaPorPreguntaPreguntaEvaluacion && index>-1) {
				this.jTabbedPaneBusquedasPreguntaEvaluacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPreguntaEvaluacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPreguntaEvaluacion.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.preguntaevaluacionConstantesFunciones.activarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setEnabledAt(index,this.preguntaevaluacionConstantesFunciones.activarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
			}

			index= this.jTabbedPaneBusquedasPreguntaEvaluacion.indexOfComponent(this.jPanelBusquedaPorPreguntaPreguntaEvaluacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.preguntaevaluacionConstantesFunciones.activarBusquedaPorPreguntaPreguntaEvaluacion);
				this.jTabbedPaneBusquedasPreguntaEvaluacion.setEnabledAt(index,this.preguntaevaluacionConstantesFunciones.activarBusquedaPorPreguntaPreguntaEvaluacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPreguntaEvaluacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo")) {
			index= this.jTabbedPaneBusquedasPreguntaEvaluacion.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);

			this.jTabbedPaneBusquedasPreguntaEvaluacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponent(index);

			this.preguntaevaluacionConstantesFunciones.setResaltarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion(resaltar);

			jPanel.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEvaluacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorPregunta")) {
			index= this.jTabbedPaneBusquedasPreguntaEvaluacion.indexOfComponent(this.jPanelBusquedaPorPreguntaPreguntaEvaluacion);

			this.jTabbedPaneBusquedasPreguntaEvaluacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEvaluacion.getComponent(index);

			this.preguntaevaluacionConstantesFunciones.setResaltarBusquedaPorPreguntaPreguntaEvaluacion(resaltar);

			jPanel.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarBusquedaPorPreguntaPreguntaEvaluacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPreguntaEvaluacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPreguntaEvaluacion() throws Exception {

		if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPreguntaEvaluacion();
		this.updateVisibilidadResaltarControlesFormularioPreguntaEvaluacion();
		this.updateHabilitarResaltarControlesFormularioPreguntaEvaluacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioPreguntaEvaluacion() throws Exception {
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.preguntaevaluacionConstantesFunciones.resaltaridPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltaridPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarid_empresaPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarid_empresaPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarid_sucursalPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarid_sucursalPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarid_ejercicioPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarid_ejercicioPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarid_periodoPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarid_periodoPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarpreguntaPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextAreapreguntaPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarpreguntaPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarcalificacionPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldcalificacionPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarcalificacionPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarordenPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldordenPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarordenPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarid_anioPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarid_anioPreguntaEvaluacion);}
		if(this.preguntaevaluacionConstantesFunciones.resaltarid_mesPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setBorder(this.preguntaevaluacionConstantesFunciones.resaltarid_mesPreguntaEvaluacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPreguntaEvaluacion() throws Exception {		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
	
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostraridPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelidPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostraridPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_empresaPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelid_empresaPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_empresaPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_sucursalPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelid_sucursalPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_sucursalPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_ejercicioPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelid_ejercicioPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_ejercicioPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_periodoPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelid_periodoPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_periodoPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextAreapreguntaPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarpreguntaPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelpreguntaPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarpreguntaPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldcalificacionPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarcalificacionPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelcalificacionPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarcalificacionPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldordenPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarordenPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelordenPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarordenPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_anioPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelid_anioPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_anioPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_mesPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jPanelid_mesPreguntaEvaluacion.setVisible(this.preguntaevaluacionConstantesFunciones.mostrarid_mesPreguntaEvaluacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPreguntaEvaluacion() throws Exception {
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPreguntaEvaluacion!=null) {
	
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jLabelidPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activaridPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_empresaPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarid_empresaPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_sucursalPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarid_sucursalPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_ejercicioPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarid_ejercicioPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_periodoPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarid_periodoPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextAreapreguntaPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarpreguntaPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldcalificacionPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarcalificacionPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jTextFieldordenPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarordenPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_anioPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarid_anioPreguntaEvaluacion);
		this.jInternalFrameDetalleFormPreguntaEvaluacion.jComboBoxid_mesPreguntaEvaluacion.setEnabled(this.preguntaevaluacionConstantesFunciones.activarid_mesPreguntaEvaluacion);
		}
	}
	
		
}