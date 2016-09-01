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


import java.sql.Time;


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

import com.bydan.erp.nomina.util.AsistenciaDiariaConstantesFunciones;
import com.bydan.erp.nomina.util.AsistenciaDiariaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.AsistenciaDiariaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.AsistenciaDiariaBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class AsistenciaDiariaBeanSwingJInternalFrame extends AsistenciaDiariaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AsistenciaDiariaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AsistenciaDiaria> asistenciadiariaValidator = new ClassValidator<AsistenciaDiaria>(AsistenciaDiaria.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AsistenciaDiaria asistenciadiaria;	
	public AsistenciaDiaria asistenciadiariaAux;
	public AsistenciaDiaria asistenciadiariaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AsistenciaDiaria asistenciadiariaTotales;
	public Long idAsistenciaDiariaActual;
	public Long iIdNuevoAsistenciaDiaria=0L;
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

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
	}

	public String sFinalQueryComboEstructuraSeccion="";

	public List<Estructura> estructuraseccionsForeignKey;

	public List<Estructura> getestructuraseccionsForeignKey() {
		return estructuraseccionsForeignKey;
	}

	public void setestructuraseccionsForeignKey(List<Estructura> estructuraseccionsForeignKey) {
		this.estructuraseccionsForeignKey = estructuraseccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraseccionForeignKey;

	public Estructura getestructuraseccionForeignKey() {
		return estructuraseccionForeignKey;
	}

	public void setestructuraseccionForeignKey(Estructura estructuraseccionForeignKey) {
		this.estructuraseccionForeignKey = estructuraseccionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
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
	
	public Boolean isPermisoTodoAsistenciaDiaria;
	public Boolean isPermisoNuevoAsistenciaDiaria;
	public Boolean isPermisoActualizarAsistenciaDiaria;
	public Boolean isPermisoActualizarOriginalAsistenciaDiaria;
	public Boolean isPermisoEliminarAsistenciaDiaria;
	public Boolean isPermisoGuardarCambiosAsistenciaDiaria;
	public Boolean isPermisoConsultaAsistenciaDiaria;
	public Boolean isPermisoBusquedaAsistenciaDiaria;
	public Boolean isPermisoReporteAsistenciaDiaria;
	public Boolean isPermisoPaginacionMedioAsistenciaDiaria;
	public Boolean isPermisoPaginacionAltoAsistenciaDiaria;
	public Boolean isPermisoPaginacionTodoAsistenciaDiaria;
	public Boolean isPermisoCopiarAsistenciaDiaria;
	public Boolean isPermisoVerFormAsistenciaDiaria;
	public Boolean isPermisoDuplicarAsistenciaDiaria;
	public Boolean isPermisoOrdenAsistenciaDiaria;
	
	
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
	
	public AsistenciaDiariaParameterReturnGeneral asistenciadiariaReturnGeneral;
	public AsistenciaDiariaParameterReturnGeneral asistenciadiariaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAsistenciaDiaria=false;
	public Boolean esParaAccionDesdeFormularioAsistenciaDiaria=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AsistenciaDiariaSessionBeanAdditional asistenciadiariaSessionBeanAdditional=null;
	
	public AsistenciaDiariaSessionBeanAdditional getAsistenciaDiariaSessionBeanAdditional() {
		return this.asistenciadiariaSessionBeanAdditional;
	}
	
	public void setAsistenciaDiariaSessionBeanAdditional(AsistenciaDiariaSessionBeanAdditional asistenciadiariaSessionBeanAdditional) {
		try {
			this.asistenciadiariaSessionBeanAdditional=asistenciadiariaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AsistenciaDiariaBeanSwingJInternalFrameAdditional asistenciadiariaBeanSwingJInternalFrameAdditional=null;
	//public class AsistenciaDiariaBeanSwingJInternalFrame
	
	public AsistenciaDiariaBeanSwingJInternalFrameAdditional getAsistenciaDiariaBeanSwingJInternalFrameAdditional() {
		return this.asistenciadiariaBeanSwingJInternalFrameAdditional;
	}
	
	public void setAsistenciaDiariaBeanSwingJInternalFrameAdditional(AsistenciaDiariaBeanSwingJInternalFrameAdditional asistenciadiariaBeanSwingJInternalFrameAdditional) {
		try {
			this.asistenciadiariaBeanSwingJInternalFrameAdditional=asistenciadiariaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AsistenciaDiariaLogic asistenciadiariaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AsistenciaDiaria asistenciadiariaBean;
	public AsistenciaDiariaConstantesFunciones asistenciadiariaConstantesFunciones;
	//public AsistenciaDiariaParameterReturnGeneral asistenciadiariaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public EstructuraLogic estructuraLogic;
	public EstructuraLogic estructuraseccionLogic;
	
	//PARAMETROS
	
	
	//public List<AsistenciaDiaria> asistenciadiarias;	
	//public List<AsistenciaDiaria> asistenciadiariasEliminados;
	//public List<AsistenciaDiaria> asistenciadiariasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAsistenciaDiaria=false;
	public Boolean isVisibilidadCeldaDuplicarAsistenciaDiaria=true;
	public Boolean isVisibilidadCeldaCopiarAsistenciaDiaria=true;
	public Boolean isVisibilidadCeldaVerFormAsistenciaDiaria=true;
	public Boolean isVisibilidadCeldaOrdenAsistenciaDiaria=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
	public Boolean isVisibilidadCeldaModificarAsistenciaDiaria=false;
	public Boolean isVisibilidadCeldaActualizarAsistenciaDiaria=false;
	public Boolean isVisibilidadCeldaEliminarAsistenciaDiaria=false;
	public Boolean isVisibilidadCeldaCancelarAsistenciaDiaria=false;
	public Boolean isVisibilidadCeldaGuardarAsistenciaDiaria=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdEstructuraSeccion=false;
	
	public Long getiIdNuevoAsistenciaDiaria() {
		return this.iIdNuevoAsistenciaDiaria;
	}

	public void setiIdNuevoAsistenciaDiaria(Long iIdNuevoAsistenciaDiaria) {
		this.iIdNuevoAsistenciaDiaria = iIdNuevoAsistenciaDiaria;
	}
	
	public Long getidAsistenciaDiariaActual() {
		return this.idAsistenciaDiariaActual;
	}

	public void setidAsistenciaDiariaActual(Long idAsistenciaDiariaActual) {
		this.idAsistenciaDiariaActual = idAsistenciaDiariaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AsistenciaDiaria getasistenciadiaria() {
		return this.asistenciadiaria;
	}

	public void setasistenciadiaria(AsistenciaDiaria asistenciadiaria) {
		this.asistenciadiaria = asistenciadiaria;
	}
	
	public AsistenciaDiaria getasistenciadiariaAux() {
		return this.asistenciadiariaAux;
	}

	public void setasistenciadiariaAux(AsistenciaDiaria asistenciadiariaAux) {
		this.asistenciadiariaAux = asistenciadiariaAux;
	}				
	
	public AsistenciaDiaria getasistenciadiariaAnterior() {
		return this.asistenciadiariaAnterior;
	}

	public void setasistenciadiariaAnterior(AsistenciaDiaria asistenciadiariaAnterior) {
		this.asistenciadiariaAnterior = asistenciadiariaAnterior;
	}	
	
	public AsistenciaDiaria getasistenciadiariaTotales() {
		return this.asistenciadiariaTotales;
	}

	public void setasistenciadiariaTotales(AsistenciaDiaria asistenciadiariaTotales) {
		this.asistenciadiariaTotales = asistenciadiariaTotales;
	}	
	
	public AsistenciaDiaria getasistenciadiariaBean() {
		return this.asistenciadiariaBean;
	}

	public void setasistenciadiariaBean(AsistenciaDiaria asistenciadiariaBean) {
		this.asistenciadiariaBean = asistenciadiariaBean;
	}	
	
	public AsistenciaDiariaParameterReturnGeneral getasistenciadiariaReturnGeneral() {
		return this.asistenciadiariaReturnGeneral;
	}

	public void setasistenciadiariaReturnGeneral(AsistenciaDiariaParameterReturnGeneral asistenciadiariaReturnGeneral) {
		this.asistenciadiariaReturnGeneral = asistenciadiariaReturnGeneral;
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

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_estructura_seccionFK_IdEstructuraSeccion=-1L;

	public Long getid_estructura_seccionFK_IdEstructuraSeccion() {
		return this.id_estructura_seccionFK_IdEstructuraSeccion;
	}

	public void setid_estructura_seccionFK_IdEstructuraSeccion(Long id_estructura_seccionFK_IdEstructuraSeccion) {
		this.id_estructura_seccionFK_IdEstructuraSeccion = id_estructura_seccionFK_IdEstructuraSeccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AsistenciaDiariaLogic getAsistenciaDiariaLogic()	{		
		return asistenciadiariaLogic;
	}

	public void setAsistenciaDiariaLogic(AsistenciaDiariaLogic asistenciadiariaLogic) {
		this.asistenciadiariaLogic = asistenciadiariaLogic;
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
	
	public Boolean getIsEsNuevoAsistenciaDiaria() {
		return isEsNuevoAsistenciaDiaria;
	}

	public void setIsEsNuevoAsistenciaDiaria(Boolean isEsNuevoAsistenciaDiaria) {
		this.isEsNuevoAsistenciaDiaria = isEsNuevoAsistenciaDiaria;
	}

	public Boolean getEsParaAccionDesdeFormularioAsistenciaDiaria() {
		return esParaAccionDesdeFormularioAsistenciaDiaria;
	}
	
	public void setEsParaAccionDesdeFormularioAsistenciaDiaria(Boolean esParaAccionDesdeFormularioAsistenciaDiaria) {
		this.esParaAccionDesdeFormularioAsistenciaDiaria = esParaAccionDesdeFormularioAsistenciaDiaria;
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

			if(this.asistenciadiariaSessionBean==null) {
				this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
			}

			if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(asistenciadiariaSessionBean.getlidEmpresaActual());
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

			if(this.asistenciadiariaSessionBean==null) {
				this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
			}

			if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(asistenciadiariaSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.asistenciadiariaSessionBean==null) {
				this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
			}

			if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(asistenciadiariaSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

	public void cargarCombosEstructuraSeccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructuraseccionsForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.asistenciadiariaSessionBean==null) {
				this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
			}

			if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraSeccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraseccionLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructuraseccionsForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructuraSeccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(asistenciadiariaSessionBean.getlidEstructuraSeccionActual());
					this.estructuraseccionsForeignKey.add(estructuraLogic.getEstructura());
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

					if(this.asistenciadiaria!=null) {
						this.asistenciadiaria.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
						this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAsistenciaDiaria.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAsistenciaDiariaGenerico)throws Exception
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
				jComboBoxid_empresaAsistenciaDiariaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAsistenciaDiariaGenerico!=null && jComboBoxid_empresaAsistenciaDiariaGenerico.getItemCount()>0) {
					jComboBoxid_empresaAsistenciaDiariaGenerico.setSelectedIndex(0);
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

					if(this.asistenciadiaria!=null) {
						this.asistenciadiaria.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
						this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoAsistenciaDiaria.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoAsistenciaDiariaGenerico)throws Exception
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
				jComboBoxid_empleadoAsistenciaDiariaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoAsistenciaDiariaGenerico!=null && jComboBoxid_empleadoAsistenciaDiariaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoAsistenciaDiariaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.asistenciadiaria!=null) {
						this.asistenciadiaria.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
						this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraAsistenciaDiaria.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria!=null) {
						jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraAsistenciaDiariaGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraAsistenciaDiariaGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraAsistenciaDiariaGenerico!=null && jComboBoxid_estructuraAsistenciaDiariaGenerico.getItemCount()>0) {
					jComboBoxid_estructuraAsistenciaDiariaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraSeccionForeignKey(Long idEstructuraSeccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraseccionTemp=null;

			for(Estructura estructuraseccionAux:estructuraseccionsForeignKey) {
				if(estructuraseccionAux.getId()!=null && estructuraseccionAux.getId().equals(idEstructuraSeccionSeleccionado)) {
					estructuraseccionTemp=estructuraseccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraseccionTemp!=null) {

					if(this.asistenciadiaria!=null) {
						this.asistenciadiaria.setEstructuraSeccion(estructuraseccionTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
						this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setSelectedItem(estructuraseccionTemp);
					}
				} else {
					//jComboBoxid_estructura_seccionAsistenciaDiaria.setSelectedItem(estructuraseccionTemp);
					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructuraSeccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraseccionTemp!=null && jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria!=null) {
						jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setSelectedItem(estructuraseccionTemp);
					} else {
						if(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria!=null) {
							//jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setSelectedItem(estructuraseccionTemp);
							if(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.getItemCount()>0) {
								jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setSelectedIndex(0);
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

	public String getActualEstructuraSeccionForeignKeyDescripcion(Long idEstructuraSeccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraseccionTemp=null;

			for(Estructura estructuraseccionAux:estructuraseccionsForeignKey) {
				if(estructuraseccionAux.getId()!=null && estructuraseccionAux.getId().equals(idEstructuraSeccionSeleccionado)) {
					estructuraseccionTemp=estructuraseccionAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraseccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraSeccionForeignKeyGenerico(Long idEstructuraSeccionSeleccionado,JComboBox jComboBoxid_estructura_seccionAsistenciaDiariaGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraseccionTemp=null;

			for(Estructura estructuraseccionAux:estructuraseccionsForeignKey) {
				if(estructuraseccionAux.getId()!=null && estructuraseccionAux.getId().equals(idEstructuraSeccionSeleccionado)) {
					estructuraseccionTemp=estructuraseccionAux;
					break;
				}
			}

			if(estructuraseccionTemp!=null) {
				jComboBoxid_estructura_seccionAsistenciaDiariaGenerico.setSelectedItem(estructuraseccionTemp);
			} else {
				if(jComboBoxid_estructura_seccionAsistenciaDiariaGenerico!=null && jComboBoxid_estructura_seccionAsistenciaDiariaGenerico.getItemCount()>0) {
					jComboBoxid_estructura_seccionAsistenciaDiariaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AsistenciaDiaria asistenciadiaria,JComboBox jComboBoxid_empresaAsistenciaDiariaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAsistenciaDiariaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAsistenciaDiariaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				asistenciadiaria.setid_empresa(empresaAux.getId());
				asistenciadiaria.setempresa_descripcion(AsistenciaDiariaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				asistenciadiaria.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(AsistenciaDiaria asistenciadiaria,JComboBox jComboBoxid_empleadoAsistenciaDiariaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoAsistenciaDiariaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoAsistenciaDiariaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				asistenciadiaria.setid_empleado(empleadoAux.getId());
				asistenciadiaria.setempleado_descripcion(AsistenciaDiariaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				asistenciadiaria.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(AsistenciaDiaria asistenciadiaria,JComboBox jComboBoxid_estructuraAsistenciaDiariaGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraAsistenciaDiariaGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraAsistenciaDiariaGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				asistenciadiaria.setid_estructura(estructuraAux.getId());
				asistenciadiaria.setestructura_descripcion(AsistenciaDiariaConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				asistenciadiaria.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraSeccionForeignKey(AsistenciaDiaria asistenciadiaria,JComboBox jComboBoxid_estructura_seccionAsistenciaDiariaGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructura_seccionAsistenciaDiariaGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructura_seccionAsistenciaDiariaGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				asistenciadiaria.setid_estructura_seccion(estructuraAux.getId());
				asistenciadiaria.setestructuraseccion_descripcion(AsistenciaDiariaConstantesFunciones.getEstructuraSeccionDescripcion(estructuraAux));
				asistenciadiaria.setEstructuraSeccion(estructuraAux);			}
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

					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { 
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { 
					}

					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { 
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { 
					}

					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.addItem(empleado);
							}
						}

						if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { 
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { 
					}

					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.addItem(estructura);
							}
						}

						if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructuraSeccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { 
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.removeAllItems();

							for(Estructura estructuraseccion:this.estructuraseccionsForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.addItem(estructuraseccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { 
					}

					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructuraSeccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.removeAllItems();

							for(Estructura estructuraseccion:this.estructuraseccionsForeignKey) {
								this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.addItem(estructuraseccion);
							}
						}

						if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstructuraSeccionForeignKey(Estructura estructuraseccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setSelectedItem(estructuraseccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setSelectedItem(estructuraseccion);
						} else {
							this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAsistenciaDiaria() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AsistenciaDiariaConstantesFunciones.refrescarForeignKeysDescripcionesAsistenciaDiaria(this.asistenciadiariaLogic.getAsistenciaDiarias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AsistenciaDiariaConstantesFunciones.refrescarForeignKeysDescripcionesAsistenciaDiaria(this.asistenciadiarias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Estructura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//asistenciadiariaLogic.setAsistenciaDiarias(this.asistenciadiarias);
			asistenciadiariaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AsistenciaDiariaParameterReturnGeneral getAsistenciaDiariaParameterGeneral() {
		return this.asistenciadiariaParameterGeneral;
	}
	
	public void setAsistenciaDiariaParameterGeneral(AsistenciaDiariaParameterReturnGeneral asistenciadiariaParameterGeneral) {
		this.asistenciadiariaParameterGeneral = asistenciadiariaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAsistenciaDiaria() {
		return isPermisoTodoAsistenciaDiaria;
	}

	public void setIsPermisoTodoAsistenciaDiaria(Boolean isPermisoTodoAsistenciaDiaria) {
		this.isPermisoTodoAsistenciaDiaria = isPermisoTodoAsistenciaDiaria;
	}

	public Boolean getIsPermisoNuevoAsistenciaDiaria() {
		return isPermisoNuevoAsistenciaDiaria;
	}

	public void setIsPermisoNuevoAsistenciaDiaria(Boolean isPermisoNuevoAsistenciaDiaria) {
		this.isPermisoNuevoAsistenciaDiaria = isPermisoNuevoAsistenciaDiaria;
	}

	public Boolean getIsPermisoActualizarAsistenciaDiaria() {
		return isPermisoActualizarAsistenciaDiaria;
	}

	public void setIsPermisoActualizarAsistenciaDiaria(Boolean isPermisoActualizarAsistenciaDiaria) {
		this.isPermisoActualizarAsistenciaDiaria = isPermisoActualizarAsistenciaDiaria;
	}

	public Boolean getIsPermisoEliminarAsistenciaDiaria() {
		return isPermisoEliminarAsistenciaDiaria;
	}

	public void setIsPermisoEliminarAsistenciaDiaria(Boolean isPermisoEliminarAsistenciaDiaria) {
		this.isPermisoEliminarAsistenciaDiaria = isPermisoEliminarAsistenciaDiaria;
	}

	public Boolean getIsPermisoGuardarCambiosAsistenciaDiaria() {
		return isPermisoGuardarCambiosAsistenciaDiaria;
	}

	public void setIsPermisoGuardarCambiosAsistenciaDiaria(Boolean isPermisoGuardarCambiosAsistenciaDiaria) {
		this.isPermisoGuardarCambiosAsistenciaDiaria = isPermisoGuardarCambiosAsistenciaDiaria;
	}
	
	public Boolean getIsPermisoConsultaAsistenciaDiaria() {
		return isPermisoConsultaAsistenciaDiaria;
	}

	public void setIsPermisoConsultaAsistenciaDiaria(Boolean isPermisoConsultaAsistenciaDiaria) {
		this.isPermisoConsultaAsistenciaDiaria = isPermisoConsultaAsistenciaDiaria;
	}

	public Boolean getIsPermisoBusquedaAsistenciaDiaria() {
		return isPermisoBusquedaAsistenciaDiaria;
	}

	public void setIsPermisoBusquedaAsistenciaDiaria(Boolean isPermisoBusquedaAsistenciaDiaria) {
		this.isPermisoBusquedaAsistenciaDiaria = isPermisoBusquedaAsistenciaDiaria;
	}

	public Boolean getIsPermisoReporteAsistenciaDiaria() {
		return isPermisoReporteAsistenciaDiaria;
	}

	public void setIsPermisoReporteAsistenciaDiaria(Boolean isPermisoReporteAsistenciaDiaria) {
		this.isPermisoReporteAsistenciaDiaria = isPermisoReporteAsistenciaDiaria;
	}
	
	public Boolean getIsPermisoPaginacionMedioAsistenciaDiaria() {
		return isPermisoPaginacionMedioAsistenciaDiaria;
	}

	public void setIsPermisoPaginacionMedioAsistenciaDiaria(Boolean isPermisoPaginacionMedioAsistenciaDiaria) {
		this.isPermisoPaginacionMedioAsistenciaDiaria = isPermisoPaginacionMedioAsistenciaDiaria;
	}
	
	public Boolean getIsPermisoPaginacionTodoAsistenciaDiaria() {
		return isPermisoPaginacionTodoAsistenciaDiaria;
	}

	public void setIsPermisoPaginacionTodoAsistenciaDiaria(Boolean isPermisoPaginacionTodoAsistenciaDiaria) {
		this.isPermisoPaginacionTodoAsistenciaDiaria = isPermisoPaginacionTodoAsistenciaDiaria;
	}
	
	public Boolean getIsPermisoPaginacionAltoAsistenciaDiaria() {
		return isPermisoPaginacionAltoAsistenciaDiaria;
	}

	public void setIsPermisoPaginacionAltoAsistenciaDiaria(Boolean isPermisoPaginacionAltoAsistenciaDiaria) {
		this.isPermisoPaginacionAltoAsistenciaDiaria = isPermisoPaginacionAltoAsistenciaDiaria;
	}
	
	public Boolean getIsPermisoCopiarAsistenciaDiaria() {
		return isPermisoCopiarAsistenciaDiaria;
	}

	public void setIsPermisoCopiarAsistenciaDiaria(Boolean isPermisoCopiarAsistenciaDiaria) {
		this.isPermisoCopiarAsistenciaDiaria = isPermisoCopiarAsistenciaDiaria;
	}
	
	public Boolean getIsPermisoVerFormAsistenciaDiaria() {
		return isPermisoVerFormAsistenciaDiaria;
	}

	public void setIsPermisoVerFormAsistenciaDiaria(Boolean isPermisoVerFormAsistenciaDiaria) {
		this.isPermisoVerFormAsistenciaDiaria = isPermisoVerFormAsistenciaDiaria;
	}
	
	public Boolean getIsPermisoDuplicarAsistenciaDiaria() {
		return isPermisoDuplicarAsistenciaDiaria;
	}

	public void setIsPermisoDuplicarAsistenciaDiaria(Boolean isPermisoDuplicarAsistenciaDiaria) {
		this.isPermisoDuplicarAsistenciaDiaria = isPermisoDuplicarAsistenciaDiaria;
	}
	
	public Boolean getIsPermisoOrdenAsistenciaDiaria() {
		return isPermisoOrdenAsistenciaDiaria;
	}

	public void setIsPermisoOrdenAsistenciaDiaria(Boolean isPermisoOrdenAsistenciaDiaria) {
		this.isPermisoOrdenAsistenciaDiaria = isPermisoOrdenAsistenciaDiaria;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAsistenciaDiaria() {
		return isVisibilidadCeldaNuevoAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaNuevoAsistenciaDiaria(Boolean isVisibilidadCeldaNuevoAsistenciaDiaria) {
		this.isVisibilidadCeldaNuevoAsistenciaDiaria = isVisibilidadCeldaNuevoAsistenciaDiaria;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAsistenciaDiaria() {
		return isVisibilidadCeldaDuplicarAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaDuplicarAsistenciaDiaria(Boolean isVisibilidadCeldaDuplicarAsistenciaDiaria) {
		this.isVisibilidadCeldaDuplicarAsistenciaDiaria = isVisibilidadCeldaDuplicarAsistenciaDiaria;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAsistenciaDiaria() {
		return isVisibilidadCeldaCopiarAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaCopiarAsistenciaDiaria(Boolean isVisibilidadCeldaCopiarAsistenciaDiaria) {
		this.isVisibilidadCeldaCopiarAsistenciaDiaria = isVisibilidadCeldaCopiarAsistenciaDiaria;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAsistenciaDiaria() {
		return isVisibilidadCeldaVerFormAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaVerFormAsistenciaDiaria(Boolean isVisibilidadCeldaVerFormAsistenciaDiaria) {
		this.isVisibilidadCeldaVerFormAsistenciaDiaria = isVisibilidadCeldaVerFormAsistenciaDiaria;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAsistenciaDiaria() {
		return isVisibilidadCeldaOrdenAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaOrdenAsistenciaDiaria(Boolean isVisibilidadCeldaOrdenAsistenciaDiaria) {
		this.isVisibilidadCeldaOrdenAsistenciaDiaria = isVisibilidadCeldaOrdenAsistenciaDiaria;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAsistenciaDiaria() {
		return isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAsistenciaDiaria(Boolean isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria) {
		this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria = isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAsistenciaDiaria() {
		return isVisibilidadCeldaModificarAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaModificarAsistenciaDiaria(Boolean isVisibilidadCeldaModificarAsistenciaDiaria) {
		this.isVisibilidadCeldaModificarAsistenciaDiaria = isVisibilidadCeldaModificarAsistenciaDiaria;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAsistenciaDiaria() {
		return isVisibilidadCeldaActualizarAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaActualizarAsistenciaDiaria(Boolean isVisibilidadCeldaActualizarAsistenciaDiaria) {
		this.isVisibilidadCeldaActualizarAsistenciaDiaria = isVisibilidadCeldaActualizarAsistenciaDiaria;
	}

	public Boolean getIsVisibilidadCeldaEliminarAsistenciaDiaria() {
		return isVisibilidadCeldaEliminarAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaEliminarAsistenciaDiaria(Boolean isVisibilidadCeldaEliminarAsistenciaDiaria) {
		this.isVisibilidadCeldaEliminarAsistenciaDiaria = isVisibilidadCeldaEliminarAsistenciaDiaria;
	}

	public Boolean getIsVisibilidadCeldaCancelarAsistenciaDiaria() {
		return isVisibilidadCeldaCancelarAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaCancelarAsistenciaDiaria(Boolean isVisibilidadCeldaCancelarAsistenciaDiaria) {
		this.isVisibilidadCeldaCancelarAsistenciaDiaria = isVisibilidadCeldaCancelarAsistenciaDiaria;
	}

	public Boolean getIsVisibilidadCeldaGuardarAsistenciaDiaria() {
		return isVisibilidadCeldaGuardarAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaGuardarAsistenciaDiaria(Boolean isVisibilidadCeldaGuardarAsistenciaDiaria) {
		this.isVisibilidadCeldaGuardarAsistenciaDiaria = isVisibilidadCeldaGuardarAsistenciaDiaria;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAsistenciaDiaria() {
		return isVisibilidadCeldaGuardarCambiosAsistenciaDiaria;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAsistenciaDiaria(Boolean isVisibilidadCeldaGuardarCambiosAsistenciaDiaria) {
		this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria = isVisibilidadCeldaGuardarCambiosAsistenciaDiaria;
	}
		
	public AsistenciaDiariaSessionBean getasistenciadiariaSessionBean() {
		return this.asistenciadiariaSessionBean;
	}
	
	public void setasistenciadiariaSessionBean(AsistenciaDiariaSessionBean asistenciadiariaSessionBean) {
		this.asistenciadiariaSessionBean=asistenciadiariaSessionBean;
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

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdEstructuraSeccion() {
		return this.isVisibilidadFK_IdEstructuraSeccion;
	}

	public void setisVisibilidadFK_IdEstructuraSeccion(Boolean isVisibilidadFK_IdEstructuraSeccion) {
		this.isVisibilidadFK_IdEstructuraSeccion=isVisibilidadFK_IdEstructuraSeccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(AsistenciaDiaria asistenciadiaria)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(asistenciadiaria,null);
				this.setActualParaGuardarEmpleadoForeignKey(asistenciadiaria,null);
				this.setActualParaGuardarEstructuraForeignKey(asistenciadiaria,null);
				this.setActualParaGuardarEstructuraSeccionForeignKey(asistenciadiaria,null);
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
	
	public void bugActualizarReferenciaActual(AsistenciaDiaria asistenciadiaria,AsistenciaDiaria asistenciadiariaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAsistenciaDiaria(asistenciadiaria);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		asistenciadiariaAux.setId(asistenciadiaria.getId());
		asistenciadiariaAux.setVersionRow(asistenciadiaria.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAsistenciaDiaria();
		
			int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = asistenciadiariaValidator.getInvalidValues(this.asistenciadiaria);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			asistenciadiariaLogic.setDatosCliente(datosCliente);
			asistenciadiariaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				asistenciadiariaAux=new  AsistenciaDiaria();
				
				asistenciadiariaAux.setIsNew(true);
				asistenciadiariaAux.setIsChanged(true);
				
				asistenciadiariaAux.setAsistenciaDiariaOriginal(this.asistenciadiaria);
				
				asistenciadiariaAux.setId(this.asistenciadiaria.getId());	
				asistenciadiariaAux.setVersionRow(this.asistenciadiaria.getVersionRow());	
				asistenciadiariaAux.setid_empresa(this.asistenciadiaria.getid_empresa());	
				asistenciadiariaAux.setid_empleado(this.asistenciadiaria.getid_empleado());	
				asistenciadiariaAux.setid_estructura(this.asistenciadiaria.getid_estructura());	
				asistenciadiariaAux.setid_estructura_seccion(this.asistenciadiaria.getid_estructura_seccion());	
				asistenciadiariaAux.setfecha(this.asistenciadiaria.getfecha());	
				asistenciadiariaAux.sethora(this.asistenciadiaria.gethora());	
				asistenciadiariaAux.sethoras_atraso(this.asistenciadiaria.gethoras_atraso());	
				asistenciadiariaAux.sethoras_falta(this.asistenciadiaria.gethoras_falta());	
				asistenciadiariaAux.sethoras_permiso(this.asistenciadiaria.gethoras_permiso());	
				asistenciadiariaAux.sethoras_extra25(this.asistenciadiaria.gethoras_extra25());	
				asistenciadiariaAux.sethoras_extra50(this.asistenciadiaria.gethoras_extra50());	
				asistenciadiariaAux.sethoras_extra100(this.asistenciadiaria.gethoras_extra100());	
				asistenciadiariaAux.setdescripcion(this.asistenciadiaria.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.asistenciadiariaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(asistenciadiariaAux,asistenciadiariaLogic.getAsistenciaDiarias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciadiariaAux,asistenciadiarias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciadiariaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaLogic.saveAsistenciaDiarias();//WithConnection
						//asistenciadiariaLogic.getSetVersionRowAsistenciaDiarias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.asistenciadiaria,asistenciadiariaAux);
					
					this.refrescarForeignKeysDescripcionesAsistenciaDiaria();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciadiariaLogic.saveAsistenciaDiariaRelaciones(asistenciadiariaAux);//WithConnection
								//asistenciadiariaLogic.getSetVersionRowAsistenciaDiarias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.asistenciadiaria,asistenciadiariaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.asistenciadiariaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(asistenciadiariaAux,asistenciadiariaLogic.getAsistenciaDiarias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(asistenciadiariaAux,asistenciadiarias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.asistenciadiaria,asistenciadiariaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				asistenciadiariaAux=new  AsistenciaDiaria();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado() 
					|| (this.asistenciadiariaSessionBean.getEsGuardarRelacionado() && this.asistenciadiaria.getId()>=0)) {
						
					asistenciadiariaAux.setIsNew(false);
				}
				
				asistenciadiariaAux.setIsDeleted(false);
			
				asistenciadiariaAux.setId(this.asistenciadiaria.getId());	
				asistenciadiariaAux.setVersionRow(this.asistenciadiaria.getVersionRow());	
				asistenciadiariaAux.setid_empresa(this.asistenciadiaria.getid_empresa());	
				asistenciadiariaAux.setid_empleado(this.asistenciadiaria.getid_empleado());	
				asistenciadiariaAux.setid_estructura(this.asistenciadiaria.getid_estructura());	
				asistenciadiariaAux.setid_estructura_seccion(this.asistenciadiaria.getid_estructura_seccion());	
				asistenciadiariaAux.setfecha(this.asistenciadiaria.getfecha());	
				asistenciadiariaAux.sethora(this.asistenciadiaria.gethora());	
				asistenciadiariaAux.sethoras_atraso(this.asistenciadiaria.gethoras_atraso());	
				asistenciadiariaAux.sethoras_falta(this.asistenciadiaria.gethoras_falta());	
				asistenciadiariaAux.sethoras_permiso(this.asistenciadiaria.gethoras_permiso());	
				asistenciadiariaAux.sethoras_extra25(this.asistenciadiaria.gethoras_extra25());	
				asistenciadiariaAux.sethoras_extra50(this.asistenciadiaria.gethoras_extra50());	
				asistenciadiariaAux.sethoras_extra100(this.asistenciadiaria.gethoras_extra100());	
				asistenciadiariaAux.setdescripcion(this.asistenciadiaria.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(asistenciadiariaAux,asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciadiariaAux,asistenciadiarias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciadiariaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaLogic.saveAsistenciaDiarias();//WithConnection
						//asistenciadiariaLogic.getSetVersionRowAsistenciaDiarias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.asistenciadiaria,asistenciadiariaAux);
					
					this.refrescarForeignKeysDescripcionesAsistenciaDiaria();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciadiariaLogic.saveAsistenciaDiariaRelaciones(asistenciadiariaAux);//WithConnection
								//asistenciadiariaLogic.getSetVersionRowAsistenciaDiarias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.asistenciadiaria,asistenciadiariaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.asistenciadiariaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(asistenciadiariaAux,asistenciadiariaLogic.getAsistenciaDiarias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(asistenciadiariaAux,asistenciadiarias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.asistenciadiaria,asistenciadiariaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				asistenciadiariaAux=new  AsistenciaDiaria();
				
				asistenciadiariaAux.setIsNew(false);
				asistenciadiariaAux.setIsChanged(false);
				
				asistenciadiariaAux.setIsDeleted(true);
				
				asistenciadiariaAux.setId(this.asistenciadiaria.getId());	
				asistenciadiariaAux.setVersionRow(this.asistenciadiaria.getVersionRow());	
				asistenciadiariaAux.setid_empresa(this.asistenciadiaria.getid_empresa());	
				asistenciadiariaAux.setid_empleado(this.asistenciadiaria.getid_empleado());	
				asistenciadiariaAux.setid_estructura(this.asistenciadiaria.getid_estructura());	
				asistenciadiariaAux.setid_estructura_seccion(this.asistenciadiaria.getid_estructura_seccion());	
				asistenciadiariaAux.setfecha(this.asistenciadiaria.getfecha());	
				asistenciadiariaAux.sethora(this.asistenciadiaria.gethora());	
				asistenciadiariaAux.sethoras_atraso(this.asistenciadiaria.gethoras_atraso());	
				asistenciadiariaAux.sethoras_falta(this.asistenciadiaria.gethoras_falta());	
				asistenciadiariaAux.sethoras_permiso(this.asistenciadiaria.gethoras_permiso());	
				asistenciadiariaAux.sethoras_extra25(this.asistenciadiaria.gethoras_extra25());	
				asistenciadiariaAux.sethoras_extra50(this.asistenciadiaria.gethoras_extra50());	
				asistenciadiariaAux.sethoras_extra100(this.asistenciadiaria.gethoras_extra100());	
				asistenciadiariaAux.setdescripcion(this.asistenciadiaria.getdescripcion());	
				
				if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.asistenciadiariaAux.getId()>=0) {	
						this.asistenciadiariasEliminados.add(asistenciadiariaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(asistenciadiariaAux,asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciadiariaAux,asistenciadiarias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciadiariaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaLogic.saveAsistenciaDiarias();//WithConnection
						//asistenciadiariaLogic.getSetVersionRowAsistenciaDiarias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciadiariaLogic.saveAsistenciaDiariaRelaciones(asistenciadiariaAux);//WithConnection
								//asistenciadiariaLogic.getSetVersionRowAsistenciaDiarias();//WithConnection
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
							if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.asistenciadiariaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(asistenciadiariaAux,asistenciadiariaLogic.getAsistenciaDiarias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(asistenciadiariaAux,asistenciadiarias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getAsistenciaDiarias().addAll(this.asistenciadiariasEliminados);
					
					asistenciadiariaLogic.saveAsistenciaDiarias();//WithConnection
					//asistenciadiariaLogic.getSetVersionRowAsistenciaDiarias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAsistenciaDiaria();
				
				this.asistenciadiariasEliminados= new ArrayList<AsistenciaDiaria>();		
			}
			
			if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Asistencia Diaria GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.asistenciadiaria=asistenciadiariaAux;
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
      		//this.finishProcessAsistenciaDiaria();
      	}
		
	}	
	
	public void actualizarRelaciones(AsistenciaDiaria asistenciadiariaLocal) throws Exception {
		
		if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AsistenciaDiaria asistenciadiariaLocal) throws Exception {	
		if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				asistenciadiariaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				asistenciadiariaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				asistenciadiariaLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraseccionBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraseccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraseccionBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraseccionBeanSwingJInternalFrameLocal.actualizarLista(estructuraseccionBeanSwingJInternalFrameLocal.estructura,this.estructuraseccionsForeignKey);

				estructuraseccionBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraseccionBeanSwingJInternalFrameLocal.estructura);

				asistenciadiariaLocal.setEstructuraSeccion(estructuraseccionBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructuraSeccion();
				this.cargarCombosFrameEstructuraSeccionsForeignKey("Formulario");
				this.setActualEstructuraSeccionForeignKey(estructuraseccionBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAsistenciaDiariaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = asistenciadiariaValidator.getInvalidValues(this.asistenciadiaria);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AsistenciaDiaria asistenciadiaria,List<AsistenciaDiaria> asistenciadiarias) throws Exception {
		try	{		
			AsistenciaDiariaConstantesFunciones.actualizarLista(asistenciadiaria,asistenciadiarias,this.asistenciadiariaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AsistenciaDiaria asistenciadiaria,List<AsistenciaDiaria> asistenciadiarias) throws Exception {
		try	{			
			AsistenciaDiariaConstantesFunciones.actualizarSelectedLista(asistenciadiaria,asistenciadiarias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AsistenciaDiaria> asistenciadiariasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				asistenciadiariasLocal=this.asistenciadiariaLogic.getAsistenciaDiarias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				asistenciadiariasLocal=this.asistenciadiarias;
			}
			//ARCHITECTURE
		
			for(AsistenciaDiaria asistenciadiariaLocal:asistenciadiariasLocal) {
				if(this.permiteMantenimiento(asistenciadiariaLocal) && asistenciadiariaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AsistenciaDiariaConstantesFunciones.getAsistenciaDiariaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelid_empresaAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelid_empleadoAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelid_estructuraAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.IDESTRUCTURASECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelid_estructura_seccionAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelfechaAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.HORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoraAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.HORASATRASO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_atrasoAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.HORASFALTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_faltaAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.HORASPERMISO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_permisoAsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.HORASEXTRA25)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra25AsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.HORASEXTRA50)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra50AsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.HORASEXTRA100)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra100AsistenciaDiaria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaDiariaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabeldescripcionAsistenciaDiaria,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelid_empresaAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelid_empleadoAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelid_estructuraAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelid_estructura_seccionAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelfechaAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoraAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_atrasoAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_faltaAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_permisoAsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra25AsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra50AsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra100AsistenciaDiaria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabeldescripcionAsistenciaDiaria,"");
		
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
		this.iIdNuevoAsistenciaDiaria--;	
		
		
		this.asistenciadiariaAux=new AsistenciaDiaria();
		
		this.asistenciadiariaAux.setId(this.iIdNuevoAsistenciaDiaria);
		this.asistenciadiariaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.asistenciadiariaLogic.getAsistenciaDiarias().add(this.asistenciadiariaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.asistenciadiarias.add(this.asistenciadiariaAux);
		}
		//ARCHITECTURE
		
		this.asistenciadiaria=this.asistenciadiariaAux;
		
		if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAsistenciaDiaria(this.asistenciadiaria);
			this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaDiaria(this.asistenciadiaria);
		}
				
		//this.setDefaultControlesAsistenciaDiaria();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAsistenciaDiaria();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAsistenciaDiaria();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaDiaria();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAsistenciaDiaria(this.asistenciadiariaBean,this.asistenciadiaria,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
			classes=AsistenciaDiariaConstantesFunciones.getClassesRelationshipsOfAsistenciaDiaria(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.asistenciadiariaReturnGeneral=asistenciadiariaLogic.procesarEventosAsistenciaDiariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciadiariaLogic.getAsistenciaDiarias(),this.asistenciadiaria,this.asistenciadiariaParameterGeneral,this.isEsNuevoAsistenciaDiaria,classes);//this.asistenciadiariaLogic.getAsistenciaDiaria()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAsistenciaDiaria(this.asistenciadiariaReturnGeneral,this.asistenciadiariaBean,false);
		
		if(this.asistenciadiariaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaDiaria(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAsistenciaDiaria(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria());
		}
		
		if(this.asistenciadiariaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAsistenciaDiaria(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria(),classes);//this.asistenciadiariaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAsistenciaDiaria();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAsistenciaDiaria();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.RecargarFormAsistenciaDiaria(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAsistenciaDiaria(false);
						
			if(asistenciadiariaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaDiaria();
			}
			
			this.actualizarVisualTableDatosAsistenciaDiaria();
			
			this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(this.getIndiceNuevoAsistenciaDiaria(), this.getIndiceNuevoAsistenciaDiaria());
			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
						
			this.actualizarEstadoCeldasBotonesAsistenciaDiaria("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAsistenciaDiaria(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jDateChooserfechaAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarfechaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jSpinnerhoraAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarhoraAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_atrasoAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarhoras_atrasoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_faltaAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarhoras_faltaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_permisoAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarhoras_permisoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra25AsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarhoras_extra25AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra50AsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarhoras_extra50AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra100AsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarhoras_extra100AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFielddescripcionAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activardescripcionAsistenciaDiaria);	
		//
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarid_empresaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarid_empleadoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarid_estructuraAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setEnabled(isHabilitar && this.asistenciadiariaConstantesFunciones.activarid_estructura_seccionAsistenciaDiaria);
	};
	
	public void setDefaultControlesAsistenciaDiaria() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAsistenciaDiaria(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.asistenciadiariaSessionBean.setConGuardarRelaciones(true);			
			this.asistenciadiariaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.setVisible(true);
			
					
		} else {
			//this.asistenciadiariaSessionBean.setConGuardarRelaciones(false);			
			this.asistenciadiariaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAsistenciaDiaria() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
				if(asistenciadiariaAux.getId().equals(this.iIdNuevoAsistenciaDiaria)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiarias) {
				if(asistenciadiariaAux.getId().equals(this.iIdNuevoAsistenciaDiaria)) {
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
	
	public int getIndiceActualAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
				if(asistenciadiariaAux.getId().equals(asistenciadiaria.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiarias) {
				if(asistenciadiariaAux.getId().equals(asistenciadiaria.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAsistenciaDiaria(AsistenciaDiaria asistenciadiariaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
				if(asistenciadiariaAux.getAsistenciaDiariaOriginal().getId().equals(asistenciadiariaOriginal.getId())) {
					existe=true;
					asistenciadiariaOriginal.setId(asistenciadiariaAux.getId());
					asistenciadiariaOriginal.setVersionRow(asistenciadiariaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiarias) {
				if(asistenciadiariaAux.getAsistenciaDiariaOriginal().getId().equals(asistenciadiariaOriginal.getId())) {
					existe=true;
					asistenciadiariaOriginal.setId(asistenciadiariaAux.getId());
					asistenciadiariaOriginal.setVersionRow(asistenciadiariaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAsistenciaDiaria(Boolean esParaCancelar) throws Exception {
		asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
		asistenciadiariaAux=new AsistenciaDiaria();
		
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
					if(asistenciadiariaAux.getId()<0) {
						asistenciadiariasAux.add(asistenciadiariaAux);
					}		
				}
				this.iIdNuevoAsistenciaDiaria=0L;
				this.asistenciadiariaLogic.getAsistenciaDiarias().removeAll(asistenciadiariasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiarias) {
					if(asistenciadiariaAux.getId()<0) {
						asistenciadiariasAux.add(asistenciadiariaAux);
					}		
				}
				this.iIdNuevoAsistenciaDiaria=0L;
				this.asistenciadiarias.removeAll(asistenciadiariasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAsistenciaDiaria 
					&& this.asistenciadiariaLogic.getAsistenciaDiarias().size()>0
					) {
					asistenciadiariaAux=this.asistenciadiariaLogic.getAsistenciaDiarias().get(this.asistenciadiariaLogic.getAsistenciaDiarias().size() - 1);
				
					if(asistenciadiariaAux.getId()<0) {
						this.asistenciadiariaLogic.getAsistenciaDiarias().remove(asistenciadiariaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAsistenciaDiaria && this.asistenciadiarias.size()>0) {
					asistenciadiariaAux=this.asistenciadiarias.get(this.asistenciadiarias.size() - 1);
				
					if(asistenciadiariaAux.getId()<0) {
						this.asistenciadiarias.remove(asistenciadiariaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAsistenciaDiaria(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(asistenciadiaria.getId()<0) {
				this.asistenciadiariaLogic.getAsistenciaDiarias().remove(this.asistenciadiaria);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(asistenciadiaria.getId()<0) {
				this.asistenciadiarias.remove(this.asistenciadiaria);
			}
		}			
	}
	
	public void setEstadosInicialesAsistenciaDiaria(List<AsistenciaDiaria> asistenciadiariasAux) throws Exception {
		AsistenciaDiariaConstantesFunciones.setEstadosInicialesAsistenciaDiaria(asistenciadiariasAux);
	}
	
	public void setEstadosInicialesAsistenciaDiaria(AsistenciaDiaria asistenciadiariaAux) throws Exception {
		AsistenciaDiariaConstantesFunciones.setEstadosInicialesAsistenciaDiaria(asistenciadiariaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAsistenciaDiariaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAsistenciaDiaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAsistenciaDiariaActual()) {
				if(!this.isEsNuevoAsistenciaDiaria) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAsistenciaDiaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAsistenciaDiaria=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAsistenciaDiariaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Asistencia Diaria ?", "MANTENIMIENTO DE Asistencia Diaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAsistenciaDiaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AsistenciaDiaria asistenciadiaria) throws Exception {
		AsistenciaDiariaConstantesFunciones.seleccionarAsignar(this.asistenciadiaria,asistenciadiaria);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAsistenciaDiaria=this.isPermisoActualizarOriginalAsistenciaDiaria;
			
			
			this.seleccionarAsignar(asistenciadiaria);
			
			

			idEmpleadoActual=asistenciadiaria.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AsistenciaDiariaConstantesFunciones.quitarEspaciosAsistenciaDiaria(this.asistenciadiaria,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAsistenciaDiaria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.asistenciadiariaSessionBean.setsFuncionBusquedaRapida(this.asistenciadiariaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAsistenciaDiaria) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAsistenciaDiaria(esParaCancelar);				
				this.cancelarNuevoAsistenciaDiaria(esParaCancelar);								
			}
			
			this.asistenciadiaria=new AsistenciaDiaria();
			
			this.inicializarAsistenciaDiaria();
			
			this.actualizarEstadoCeldasBotonesAsistenciaDiaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAsistenciaDiaria() throws Exception {
		try {
			AsistenciaDiariaConstantesFunciones.inicializarAsistenciaDiaria(this.asistenciadiaria);
			
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
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.asistenciadiariaLogic.getAsistenciaDiarias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAsistenciaDiarias(String sAccionBusqueda,List<AsistenciaDiaria> asistenciadiariasParaReportes) throws Exception {
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
					sPathReporteFinal="AsistenciaDiaria"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AsistenciaDiariaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AsistenciaDiariaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AsistenciaDiaria"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Asistencia Diarias");		
		parameters.put("busquedapor", AsistenciaDiariaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAsistenciaDiaria=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AsistenciaDiariaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AsistenciaDiariaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAsistenciaDiaria=new JRBeanArrayDataSource(AsistenciaDiariaJInternalFrame.TraerAsistenciaDiariaBeans(asistenciadiariasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAsistenciaDiaria);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AsistenciaDiariaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AsistenciaDiariaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AsistenciaDiariaBean.TraerAsistenciaDiariaBeans(asistenciadiariasParaReportes).toArray()));
							
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
				this.generarExcelReporteAsistenciaDiarias(sAccionBusqueda,sTipoArchivoReporte,asistenciadiariasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAsistenciaDiarias(sAccionBusqueda,sTipoArchivoReporte,asistenciadiariasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAsistenciaDiariaActionPerformed(null);
					//this.generarExcelReporteAsistenciaDiarias(sAccionBusqueda,sTipoArchivoReporte,asistenciadiariasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAsistenciaDiarias(sAccionBusqueda,sTipoArchivoReporte,asistenciadiariasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAsistenciaDiarias(sAccionBusqueda,sTipoArchivoReporte,asistenciadiariasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAsistenciaDiarias(sAccionBusqueda,sTipoArchivoReporte,asistenciadiariasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAsistenciaDiarias(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaDiaria> asistenciadiariasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciadiaria";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaDiarias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAsistenciaDiaria("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AsistenciaDiaria asistenciadiaria : asistenciadiariasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AsistenciaDiariaConstantesFunciones.generarExcelReporteDataAsistenciaDiaria("NORMAL",row,workbook,asistenciadiaria,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAsistenciaDiaria(String sTipo,Row row,Workbook workbook) {
		
		AsistenciaDiariaConstantesFunciones.generarExcelReporteHeaderAsistenciaDiaria(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAsistenciaDiarias(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaDiaria> asistenciadiariasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciadiaria_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaDiarias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AsistenciaDiaria asistenciadiaria : asistenciadiariasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AsistenciaDiariaConstantesFunciones.getAsistenciaDiariaDescripcion(asistenciadiaria));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.getestructuraseccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_HORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.gethora());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.gethoras_atraso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.gethoras_falta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.gethoras_permiso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.gethoras_extra25());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.gethoras_extra50());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.gethoras_extra100());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciadiaria.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAsistenciaDiarias(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaDiaria> asistenciadiariasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AsistenciaDiaria> asistenciadiariasRespaldo=null;
		
		classes=AsistenciaDiariaConstantesFunciones.getClassesRelationshipsOfAsistenciaDiaria(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.asistenciadiariaLogic.setDatosCliente(this.datosCliente);
		this.asistenciadiariaLogic.setDatosDeep(this.datosDeep);
		this.asistenciadiariaLogic.setIsConDeep(true);
		
		asistenciadiariasRespaldo=this.asistenciadiariaLogic.getAsistenciaDiarias();
		
		this.asistenciadiariaLogic.setAsistenciaDiarias(asistenciadiariasParaReportes);	
		this.asistenciadiariaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		asistenciadiariasParaReportes=this.asistenciadiariaLogic.getAsistenciaDiarias();
		this.asistenciadiariaLogic.setAsistenciaDiarias(asistenciadiariasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciadiaria_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaDiarias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAsistenciaDiaria("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AsistenciaDiaria asistenciadiaria : asistenciadiariasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAsistenciaDiaria("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AsistenciaDiariaConstantesFunciones.generarExcelReporteDataAsistenciaDiaria("NORMAL",row,workbook,asistenciadiaria,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AsistenciaDiariaConstantesFunciones.getAsistenciaDiariaDescripcion(asistenciadiaria));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAsistenciaDiaria() throws Exception {		
		this.startProcessAsistenciaDiaria(true);
	}
	
	public void startProcessAsistenciaDiaria(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAsistenciaDiaria ,this.jPanelParametrosReportesAsistenciaDiaria, this.jScrollPanelDatosAsistenciaDiaria,this.jPanelPaginacionAsistenciaDiaria, this.jScrollPanelDatosEdicionAsistenciaDiaria, this.jPanelAccionesAsistenciaDiaria,this.jPanelAccionesFormularioAsistenciaDiaria,this.jmenuBarAsistenciaDiaria,this.jmenuBarDetalleAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,this.jTtoolBarDetalleAsistenciaDiaria);		
		
		final JTabbedPane jTabbedPaneBusquedasAsistenciaDiaria=this.jTabbedPaneBusquedasAsistenciaDiaria; 
		
		final JPanel jPanelParametrosReportesAsistenciaDiaria=this.jPanelParametrosReportesAsistenciaDiaria;
		//final JScrollPane jScrollPanelDatosAsistenciaDiaria=this.jScrollPanelDatosAsistenciaDiaria;
		final JTable jTableDatosAsistenciaDiaria=this.jTableDatosAsistenciaDiaria;		
		final JPanel jPanelPaginacionAsistenciaDiaria=this.jPanelPaginacionAsistenciaDiaria;
		//final JScrollPane jScrollPanelDatosEdicionAsistenciaDiaria=this.jScrollPanelDatosEdicionAsistenciaDiaria;
		final JPanel jPanelAccionesAsistenciaDiaria=this.jPanelAccionesAsistenciaDiaria;
		
		JPanel jPanelCamposAuxiliarAsistenciaDiaria=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAsistenciaDiaria=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			jPanelCamposAuxiliarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelCamposAsistenciaDiaria;
			jPanelAccionesFormularioAuxiliarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelAccionesFormularioAsistenciaDiaria;
		}
		
		final JPanel jPanelCamposAsistenciaDiaria=jPanelCamposAuxiliarAsistenciaDiaria;
		final JPanel jPanelAccionesFormularioAsistenciaDiaria=jPanelAccionesFormularioAuxiliarAsistenciaDiaria;
		
		
		final JMenuBar jmenuBarAsistenciaDiaria=this.jmenuBarAsistenciaDiaria;
		final JToolBar jTtoolBarAsistenciaDiaria=this.jTtoolBarAsistenciaDiaria;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAsistenciaDiaria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAsistenciaDiaria=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			jmenuBarDetalleAuxiliarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jmenuBarDetalleAsistenciaDiaria;
			jTtoolBarDetalleAuxiliarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jTtoolBarDetalleAsistenciaDiaria;
		}
		
		final JMenuBar jmenuBarDetalleAsistenciaDiaria=jmenuBarDetalleAuxiliarAsistenciaDiaria;
		final JToolBar jTtoolBarDetalleAsistenciaDiaria=jTtoolBarDetalleAuxiliarAsistenciaDiaria;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAsistenciaDiaria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAsistenciaDiaria;
			processRunnable.jTableDatos=jTableDatosAsistenciaDiaria;
			processRunnable.jPanelCampos=jPanelCamposAsistenciaDiaria;
			processRunnable.jPanelPaginacion=jPanelPaginacionAsistenciaDiaria;
			processRunnable.jPanelAcciones=jPanelAccionesAsistenciaDiaria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAsistenciaDiaria;
			
			
			processRunnable.jmenuBar=jmenuBarAsistenciaDiaria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAsistenciaDiaria;
			processRunnable.jTtoolBar=jTtoolBarAsistenciaDiaria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAsistenciaDiaria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAsistenciaDiaria ,jPanelParametrosReportesAsistenciaDiaria,jTableDatosAsistenciaDiaria, /*jScrollPanelDatosAsistenciaDiaria,*/jPanelCamposAsistenciaDiaria,jPanelPaginacionAsistenciaDiaria, /*jScrollPanelDatosEdicionAsistenciaDiaria,*/ jPanelAccionesAsistenciaDiaria,jPanelAccionesFormularioAsistenciaDiaria,jmenuBarAsistenciaDiaria,jmenuBarDetalleAsistenciaDiaria,jTtoolBarAsistenciaDiaria,jTtoolBarDetalleAsistenciaDiaria);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAsistenciaDiaria ,jPanelParametrosReportesAsistenciaDiaria, jScrollPanelDatosAsistenciaDiaria,jPanelPaginacionAsistenciaDiaria, jScrollPanelDatosEdicionAsistenciaDiaria, jPanelAccionesAsistenciaDiaria,jPanelAccionesFormularioAsistenciaDiaria,jmenuBarAsistenciaDiaria,jmenuBarDetalleAsistenciaDiaria,jTtoolBarAsistenciaDiaria,jTtoolBarDetalleAsistenciaDiaria);
						
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
	
	public void finishProcessAsistenciaDiaria() {// throws Exception 
		this.finishProcessAsistenciaDiaria(true);
	}
	
	public void finishProcessAsistenciaDiaria(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAsistenciaDiaria ,this.jPanelParametrosReportesAsistenciaDiaria, this.jScrollPanelDatosAsistenciaDiaria,this.jPanelPaginacionAsistenciaDiaria, this.jScrollPanelDatosEdicionAsistenciaDiaria, this.jPanelAccionesAsistenciaDiaria,this.jPanelAccionesFormularioAsistenciaDiaria,this.jmenuBarAsistenciaDiaria,this.jmenuBarDetalleAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,this.jTtoolBarDetalleAsistenciaDiaria);		
		
		final JTabbedPane jTabbedPaneBusquedasAsistenciaDiaria=this.jTabbedPaneBusquedasAsistenciaDiaria; 
		
		final JPanel jPanelParametrosReportesAsistenciaDiaria=this.jPanelParametrosReportesAsistenciaDiaria;
		//final JScrollPane jScrollPanelDatosAsistenciaDiaria=this.jScrollPanelDatosAsistenciaDiaria;
		final JTable jTableDatosAsistenciaDiaria=this.jTableDatosAsistenciaDiaria;		
		final JPanel jPanelPaginacionAsistenciaDiaria=this.jPanelPaginacionAsistenciaDiaria;
		//final JScrollPane jScrollPanelDatosEdicionAsistenciaDiaria=this.jScrollPanelDatosEdicionAsistenciaDiaria;
		final JPanel jPanelAccionesAsistenciaDiaria=this.jPanelAccionesAsistenciaDiaria;
		
		JPanel jPanelCamposAuxiliarAsistenciaDiaria=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAsistenciaDiaria=new JPanel();
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			jPanelCamposAuxiliarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelCamposAsistenciaDiaria;
			jPanelAccionesFormularioAuxiliarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelAccionesFormularioAsistenciaDiaria;
		}
		
		final JPanel jPanelCamposAsistenciaDiaria=jPanelCamposAuxiliarAsistenciaDiaria;
		final JPanel jPanelAccionesFormularioAsistenciaDiaria=jPanelAccionesFormularioAuxiliarAsistenciaDiaria;
		
		
		final JMenuBar jmenuBarAsistenciaDiaria=this.jmenuBarAsistenciaDiaria;		
		final JToolBar jTtoolBarAsistenciaDiaria=this.jTtoolBarAsistenciaDiaria;
				
		JMenuBar jmenuBarDetalleAuxiliarAsistenciaDiaria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAsistenciaDiaria=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			jmenuBarDetalleAuxiliarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jmenuBarDetalleAsistenciaDiaria;
			jTtoolBarDetalleAuxiliarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jTtoolBarDetalleAsistenciaDiaria;		
		}
		
		final JMenuBar jmenuBarDetalleAsistenciaDiaria=jmenuBarDetalleAuxiliarAsistenciaDiaria;
		final JToolBar jTtoolBarDetalleAsistenciaDiaria=jTtoolBarDetalleAuxiliarAsistenciaDiaria;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAsistenciaDiaria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAsistenciaDiaria;
			processRunnable.jTableDatos=jTableDatosAsistenciaDiaria;
			processRunnable.jPanelCampos=jPanelCamposAsistenciaDiaria;
			processRunnable.jPanelPaginacion=jPanelPaginacionAsistenciaDiaria;
			processRunnable.jPanelAcciones=jPanelAccionesAsistenciaDiaria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAsistenciaDiaria;
			
			
			processRunnable.jmenuBar=jmenuBarAsistenciaDiaria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAsistenciaDiaria;
			processRunnable.jTtoolBar=jTtoolBarAsistenciaDiaria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAsistenciaDiaria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAsistenciaDiaria ,jPanelParametrosReportesAsistenciaDiaria, jTableDatosAsistenciaDiaria,/*jScrollPanelDatosAsistenciaDiaria,*/jPanelCamposAsistenciaDiaria,jPanelPaginacionAsistenciaDiaria, /*jScrollPanelDatosEdicionAsistenciaDiaria,*/ jPanelAccionesAsistenciaDiaria,jPanelAccionesFormularioAsistenciaDiaria,jmenuBarAsistenciaDiaria,jmenuBarDetalleAsistenciaDiaria,jTtoolBarAsistenciaDiaria,jTtoolBarDetalleAsistenciaDiaria));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAsistenciaDiaria(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAsistenciaDiaria(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAsistenciaDiaria(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAsistenciaDiaria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAsistenciaDiaria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAsistenciaDiaria,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAsistenciaDiaria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAsistenciaDiaria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAsistenciaDiaria,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.asistenciadiariaConstantesFunciones.getsFinalQueryAsistenciaDiaria();
		String  finalQueryPaginacionTodos=this.asistenciadiariaConstantesFunciones.getsFinalQueryAsistenciaDiaria();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AsistenciaDiariaConstantesFunciones.getArrayColumnasGlobalesNoAsistenciaDiaria(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AsistenciaDiariaConstantesFunciones.getArrayColumnasGlobalesAsistenciaDiaria(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AsistenciaDiariaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.asistenciadiariasEliminados= new ArrayList<AsistenciaDiaria>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAsistenciaDiaria();
		
				///*AsistenciaDiariaSessionBean*/this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
			
			if(this.asistenciadiariaSessionBean==null) {
				this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
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
					this.iNumeroPaginacion=AsistenciaDiariaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AsistenciaDiariaConstantesFunciones.getClassesForeignKeysOfAsistenciaDiaria(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/asistenciadiaria."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			asistenciadiariasAux= new ArrayList<AsistenciaDiaria>();
			
				
			asistenciadiariaLogic.setDatosCliente(this.datosCliente);
			asistenciadiariaLogic.setDatosDeep(this.datosDeep);
			asistenciadiariaLogic.setIsConDeep(true);
			
			
			asistenciadiariaLogic.getAsistenciaDiariaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					asistenciadiariaLogic.getTodosAsistenciaDiarias(finalQueryGlobal,pagination);
					
					//asistenciadiariaLogic.getTodosAsistenciaDiariasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(asistenciadiariaLogic.getAsistenciaDiarias()==null|| asistenciadiariaLogic.getAsistenciaDiarias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciadiariasAux= new ArrayList<AsistenciaDiaria>();
							asistenciadiariasAux.addAll(asistenciadiariaLogic.getAsistenciaDiarias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiariasAux= new ArrayList<AsistenciaDiaria>();
							asistenciadiariasAux.addAll(asistenciadiarias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciadiariaLogic.getTodosAsistenciaDiarias(finalQueryGlobal+"",this.pagination);												
							
							//asistenciadiariaLogic.getTodosAsistenciaDiariasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAsistenciaDiarias("Todos",asistenciadiariaLogic.getAsistenciaDiarias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciadiariaLogic.setAsistenciaDiarias(new ArrayList<AsistenciaDiaria>());					
							asistenciadiariaLogic.getAsistenciaDiarias().addAll(asistenciadiariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiarias=new ArrayList<AsistenciaDiaria>();
							asistenciadiarias.addAll(asistenciadiariasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAsistenciaDiaria=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAsistenciaDiaria=this.idActual;
				
				} else if(this.idAsistenciaDiariaActual!=null && this.idAsistenciaDiariaActual!=0L) {
					idAsistenciaDiaria=idAsistenciaDiariaActual;
				}
				
					
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndicePorId(idAsistenciaDiaria);
				
				this.asistenciadiarias=new ArrayList<AsistenciaDiaria>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					asistenciadiariaLogic.getEntity(idAsistenciaDiaria);
					
					//asistenciadiariaLogic.getEntityWithConnection(idAsistenciaDiaria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciadiariaLogic.setAsistenciaDiarias(new ArrayList<AsistenciaDiaria>());
					asistenciadiariaLogic.getAsistenciaDiarias().add(asistenciadiariaLogic.getAsistenciaDiaria());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciadiarias=new ArrayList<AsistenciaDiaria>();
					this.asistenciadiarias.add(asistenciadiaria);
				}
				
				if(asistenciadiariaLogic.getAsistenciaDiaria()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciadiariaLogic.getAsistenciaDiariasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciadiariaLogic.getAsistenciaDiarias()==null||asistenciadiariaLogic.getAsistenciaDiarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciadiarias==null|| asistenciadiarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
						asistenciadiariasAux.addAll(asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
							asistenciadiariasAux.addAll(asistenciadiarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciadiariaLogic.getAsistenciaDiariasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaDiarias("FK_IdEmpleado",asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaDiarias("FK_IdEmpleado",asistenciadiarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaLogic.setAsistenciaDiarias(new ArrayList<AsistenciaDiaria>());
						asistenciadiariaLogic.getAsistenciaDiarias().addAll(asistenciadiariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiarias=new ArrayList<AsistenciaDiaria>();
							asistenciadiarias.addAll(asistenciadiariasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciadiariaLogic.getAsistenciaDiariasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciadiariaLogic.getAsistenciaDiarias()==null||asistenciadiariaLogic.getAsistenciaDiarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciadiarias==null|| asistenciadiarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
						asistenciadiariasAux.addAll(asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
							asistenciadiariasAux.addAll(asistenciadiarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciadiariaLogic.getAsistenciaDiariasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaDiarias("FK_IdEmpresa",asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaDiarias("FK_IdEmpresa",asistenciadiarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaLogic.setAsistenciaDiarias(new ArrayList<AsistenciaDiaria>());
						asistenciadiariaLogic.getAsistenciaDiarias().addAll(asistenciadiariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiarias=new ArrayList<AsistenciaDiaria>();
							asistenciadiarias.addAll(asistenciadiariasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciadiariaLogic.getAsistenciaDiariasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciadiariaLogic.getAsistenciaDiarias()==null||asistenciadiariaLogic.getAsistenciaDiarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciadiarias==null|| asistenciadiarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
						asistenciadiariasAux.addAll(asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
							asistenciadiariasAux.addAll(asistenciadiarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciadiariaLogic.getAsistenciaDiariasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaDiarias("FK_IdEstructura",asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaDiarias("FK_IdEstructura",asistenciadiarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaLogic.setAsistenciaDiarias(new ArrayList<AsistenciaDiaria>());
						asistenciadiariaLogic.getAsistenciaDiarias().addAll(asistenciadiariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiarias=new ArrayList<AsistenciaDiaria>();
							asistenciadiarias.addAll(asistenciadiariasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructuraSeccion")) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciadiariaLogic.getAsistenciaDiariasFK_IdEstructuraSeccion(finalQueryGlobal,pagination,id_estructura_seccionFK_IdEstructuraSeccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciadiariaLogic.getAsistenciaDiarias()==null||asistenciadiariaLogic.getAsistenciaDiarias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciadiarias==null|| asistenciadiarias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
						asistenciadiariasAux.addAll(asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiariasAux=new ArrayList<AsistenciaDiaria>();
							asistenciadiariasAux.addAll(asistenciadiarias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciadiariaLogic.getAsistenciaDiariasFK_IdEstructuraSeccion(finalQueryGlobal,pagination,id_estructura_seccionFK_IdEstructuraSeccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaDiariaConstantesFunciones.getDetalleIndiceFK_IdEstructuraSeccion(id_estructura_seccionFK_IdEstructuraSeccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaDiarias("FK_IdEstructuraSeccion",asistenciadiariaLogic.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaDiarias("FK_IdEstructuraSeccion",asistenciadiarias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaLogic.setAsistenciaDiarias(new ArrayList<AsistenciaDiaria>());
						asistenciadiariaLogic.getAsistenciaDiarias().addAll(asistenciadiariasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiarias=new ArrayList<AsistenciaDiaria>();
							asistenciadiarias.addAll(asistenciadiariasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAsistenciaDiaria();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAsistenciaDiaria();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=asistenciadiariaLogic.getAsistenciaDiarias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciadiarias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=asistenciadiariaLogic.getAsistenciaDiarias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciadiarias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AsistenciaDiaria asistenciadiaria) {
		Boolean permite=true;
		
		if(this.asistenciadiaria.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AsistenciaDiariaConstantesFunciones.getOrderByListaAsistenciaDiaria();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AsistenciaDiariaConstantesFunciones.getOrderByListaAsistenciaDiaria();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaDiaria asistenciadiaria:asistenciadiariaLogic.getAsistenciaDiarias()) {
				if(asistenciadiaria.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciadiariaTotales=asistenciadiaria;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaDiaria asistenciadiaria:this.asistenciadiarias) {
				if(asistenciadiaria.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciadiariaTotales=asistenciadiaria;
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
			this.asistenciadiariaAux=new AsistenciaDiaria();
			this.asistenciadiariaAux.setsType(Constantes2.S_TOTALES);
			this.asistenciadiariaAux.setIsNew(false);
			this.asistenciadiariaAux.setIsChanged(false);
			this.asistenciadiariaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AsistenciaDiariaConstantesFunciones.TotalizarValoresFilaAsistenciaDiaria(this.asistenciadiariaLogic.getAsistenciaDiarias(),this.asistenciadiariaAux);
				
				this.asistenciadiariaLogic.getAsistenciaDiarias().add(this.asistenciadiariaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AsistenciaDiariaConstantesFunciones.TotalizarValoresFilaAsistenciaDiaria(this.asistenciadiarias,this.asistenciadiariaAux);
				
				this.asistenciadiarias.add(this.asistenciadiariaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		asistenciadiariaTotales=new AsistenciaDiaria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.asistenciadiariaLogic.getAsistenciaDiarias().remove(asistenciadiariaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.asistenciadiarias.remove(asistenciadiariaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		asistenciadiariaTotales=new AsistenciaDiaria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaDiaria asistenciadiaria:asistenciadiariaLogic.getAsistenciaDiarias()) {
				if(asistenciadiaria.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciadiariaTotales=asistenciadiaria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AsistenciaDiariaConstantesFunciones.TotalizarValoresFilaAsistenciaDiaria(this.asistenciadiariaLogic.getAsistenciaDiarias(),asistenciadiariaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaDiaria asistenciadiaria:this.asistenciadiarias) {
				if(asistenciadiaria.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciadiariaTotales=asistenciadiaria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AsistenciaDiariaConstantesFunciones.TotalizarValoresFilaAsistenciaDiaria(this.asistenciadiarias,asistenciadiariaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAsistenciaDiariasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaDiariasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaDiariasFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaDiariasFK_IdEstructuraSeccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructuraSeccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAsistenciaDiariasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciadiariaLogic.getAsistenciaDiariasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaDiariasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciadiariaLogic.getAsistenciaDiariasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaDiariasFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciadiariaLogic.getAsistenciaDiariasFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaDiariasFK_IdEstructuraSeccion(String sFinalQuery,Long id_estructura_seccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciadiariaLogic.getAsistenciaDiariasFK_IdEstructuraSeccion(sFinalQuery,this.pagination,id_estructura_seccion);
				
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
	
	public void inicializarPermisosAsistenciaDiaria() {
		this.isPermisoTodoAsistenciaDiaria=false;
		this.isPermisoNuevoAsistenciaDiaria=false;
		this.isPermisoActualizarAsistenciaDiaria=false;
		this.isPermisoActualizarOriginalAsistenciaDiaria=false;
		this.isPermisoEliminarAsistenciaDiaria=false;
		this.isPermisoGuardarCambiosAsistenciaDiaria=false;
		this.isPermisoConsultaAsistenciaDiaria=false;
		this.isPermisoBusquedaAsistenciaDiaria=false;
		this.isPermisoReporteAsistenciaDiaria=false;		
		this.isPermisoOrdenAsistenciaDiaria=false;		
		this.isPermisoPaginacionMedioAsistenciaDiaria=false;		
		this.isPermisoPaginacionAltoAsistenciaDiaria=false;
		this.isPermisoPaginacionTodoAsistenciaDiaria=false;
		this.isPermisoCopiarAsistenciaDiaria=false;		
		this.isPermisoVerFormAsistenciaDiaria=false;		
		this.isPermisoDuplicarAsistenciaDiaria=false;		
		this.isPermisoOrdenAsistenciaDiaria=false;		
	}
	
	public void setPermisosUsuarioAsistenciaDiaria(Boolean isPermiso) {
		this.isPermisoTodoAsistenciaDiaria=isPermiso;
		this.isPermisoNuevoAsistenciaDiaria=isPermiso;
		this.isPermisoActualizarAsistenciaDiaria=isPermiso;
		this.isPermisoActualizarOriginalAsistenciaDiaria=isPermiso;
		this.isPermisoEliminarAsistenciaDiaria=isPermiso;
		this.isPermisoGuardarCambiosAsistenciaDiaria=isPermiso;
		this.isPermisoConsultaAsistenciaDiaria=isPermiso;
		this.isPermisoBusquedaAsistenciaDiaria=isPermiso;
		this.isPermisoReporteAsistenciaDiaria=isPermiso;
		this.isPermisoOrdenAsistenciaDiaria=isPermiso;		
		this.isPermisoPaginacionMedioAsistenciaDiaria=isPermiso;		
		this.isPermisoPaginacionAltoAsistenciaDiaria=isPermiso;		
		this.isPermisoPaginacionTodoAsistenciaDiaria=isPermiso;		
		this.isPermisoCopiarAsistenciaDiaria=isPermiso;		
		this.isPermisoVerFormAsistenciaDiaria=isPermiso;		
		this.isPermisoDuplicarAsistenciaDiaria=isPermiso;
		this.isPermisoOrdenAsistenciaDiaria=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAsistenciaDiaria(Boolean isPermiso) {
		//this.isPermisoTodoAsistenciaDiaria=isPermiso;
		this.isPermisoNuevoAsistenciaDiaria=isPermiso;
		this.isPermisoActualizarAsistenciaDiaria=isPermiso;
		this.isPermisoActualizarOriginalAsistenciaDiaria=isPermiso;
		this.isPermisoEliminarAsistenciaDiaria=isPermiso;
		this.isPermisoGuardarCambiosAsistenciaDiaria=isPermiso;
		//this.isPermisoConsultaAsistenciaDiaria=isPermiso;
		//this.isPermisoBusquedaAsistenciaDiaria=isPermiso;
		//this.isPermisoReporteAsistenciaDiaria=isPermiso;
		//this.isPermisoOrdenAsistenciaDiaria=isPermiso;		
		//this.isPermisoPaginacionMedioAsistenciaDiaria=isPermiso;		
		//this.isPermisoPaginacionAltoAsistenciaDiaria=isPermiso;		
		//this.isPermisoPaginacionTodoAsistenciaDiaria=isPermiso;		
		//this.isPermisoCopiarAsistenciaDiaria=isPermiso;		
		//this.isPermisoDuplicarAsistenciaDiaria=isPermiso;
		//this.isPermisoOrdenAsistenciaDiaria=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAsistenciaDiariaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AsistenciaDiariaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAsistenciaDiaria(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAsistenciaDiariaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAsistenciaDiariaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAsistenciaDiariaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAsistenciaDiariaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAsistenciaDiaria() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AsistenciaDiariaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AsistenciaDiariaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAsistenciaDiaria=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAsistenciaDiaria=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAsistenciaDiaria=this.isPermisoActualizarAsistenciaDiaria;
			this.isPermisoEliminarAsistenciaDiaria=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAsistenciaDiaria=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAsistenciaDiaria=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAsistenciaDiaria=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAsistenciaDiaria=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAsistenciaDiaria=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAsistenciaDiaria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAsistenciaDiaria=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAsistenciaDiaria=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAsistenciaDiaria=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAsistenciaDiaria=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAsistenciaDiaria=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAsistenciaDiaria=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAsistenciaDiaria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAsistenciaDiaria.setToolTipText(this.jTableDatosAsistenciaDiaria.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAsistenciaDiaria(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAsistenciaDiaria(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AsistenciaDiariaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AsistenciaDiariaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAsistenciaDiaria() throws Exception {
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
	public void inicializarCombosForeignKeyAsistenciaDiariaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.estructuraseccionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAsistenciaDiariaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AsistenciaDiariaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAsistenciaDiariaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraSeccionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraSeccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructuraseccionsForeignKey==null||this.estructuraseccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructuraSeccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAsistenciaDiariaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AsistenciaDiariaParameterReturnGeneral asistenciadiariaReturnGeneral=new AsistenciaDiariaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.asistenciadiariaConstantesFunciones.cargarid_empresaAsistenciaDiaria)
					 || (this.esRecargarFks && this.asistenciadiariaConstantesFunciones.cargarid_empresaAsistenciaDiaria)) {

					if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+asistenciadiariaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.asistenciadiariaConstantesFunciones.cargarid_empleadoAsistenciaDiaria)
					 || (this.esRecargarFks && this.asistenciadiariaConstantesFunciones.cargarid_empleadoAsistenciaDiaria)) {

					if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+asistenciadiariaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.asistenciadiariaConstantesFunciones.cargarid_estructuraAsistenciaDiaria)
					 || (this.esRecargarFks && this.asistenciadiariaConstantesFunciones.cargarid_estructuraAsistenciaDiaria)) {

					if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+asistenciadiariaSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEstructuraSeccion="";

				if(((this.estructuraseccionsForeignKey==null||this.estructuraseccionsForeignKey.size()<=0) && this.asistenciadiariaConstantesFunciones.cargarid_estructura_seccionAsistenciaDiaria)
					 || (this.esRecargarFks && this.asistenciadiariaConstantesFunciones.cargarid_estructura_seccionAsistenciaDiaria)) {

					if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraSeccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructuraSeccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructuraSeccion=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructuraSeccion, "");
						finalQueryGlobalEstructuraSeccion+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructuraSeccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructuraSeccion=" WHERE " + ConstantesSql.ID + "="+asistenciadiariaSessionBean.getlidEstructuraSeccionActual();
					}
				} else {
					finalQueryGlobalEstructuraSeccion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				asistenciadiariaReturnGeneral=asistenciadiariaLogic.cargarCombosLoteForeignKeyAsistenciaDiaria(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalEstructura,finalQueryGlobalEstructuraSeccion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=asistenciadiariaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=asistenciadiariaReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=asistenciadiariaReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEstructuraSeccion.equals("NONE")) {
				this.estructuraseccionsForeignKey=asistenciadiariaReturnGeneral.getestructuraseccionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAsistenciaDiaria()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEstructuraSeccion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.asistenciadiariaSessionBean==null) {
				this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
			}

			if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructuraSeccion()throws Exception {
		try {

			if(!this.asistenciadiariaSessionBean.getisBusquedaDesdeForeignKeySesionEstructuraSeccion()) {
				Estructura estructuraseccion=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructuraseccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructuraseccion.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructuraseccionsForeignKey,estructuraseccion,true)) {

					this.estructuraseccionsForeignKey.add(0,estructuraseccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAsistenciaDiaria()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAsistenciaDiaria(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAsistenciaDiaria()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.asistenciadiaria.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaDiaria();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAsistenciaDiaria(AsistenciaDiaria asistenciadiaria)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(asistenciadiaria.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(asistenciadiaria.getid_estructura(),false,"Formulario");
			this.setActualEstructuraSeccionForeignKey(asistenciadiaria.getid_estructura_seccion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,String sTipoEvento)throws Exception {	
		try {
			
			

				if(asistenciadiaria.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoAsistenciaDiaria")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(asistenciadiaria.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAsistenciaDiaria()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.asistenciadiariaConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.asistenciadiariaConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEstructuraSeccionForeignKey(this.asistenciadiariaConstantesFunciones.getid_estructura_seccion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaDiaria()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAsistenciaDiaria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAsistenciaDiaria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAsistenciaDiaria()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAsistenciaDiaria()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEstructuraSeccionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAsistenciaDiaria(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructuraSeccionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAsistenciaDiaria()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public AsistenciaDiariaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AsistenciaDiariaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AsistenciaDiariaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean(); 
		this.asistenciadiariaConstantesFunciones=new AsistenciaDiariaConstantesFunciones(); 
		this.asistenciadiariaBean=new AsistenciaDiaria();//(this.asistenciadiariaConstantesFunciones); 		
		this.asistenciadiariaReturnGeneral=new AsistenciaDiariaParameterReturnGeneral(); 
		
		this.asistenciadiariaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciadiariaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AsistenciaDiariaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AsistenciaDiariaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AsistenciaDiariaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAsistenciaDiaria(true);
			
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
			
			this.asistenciadiariaConstantesFunciones=new AsistenciaDiariaConstantesFunciones(); 
			this.asistenciadiariaBean=new AsistenciaDiaria();//this.asistenciadiariaConstantesFunciones); 			
			this.asistenciadiariaReturnGeneral=new AsistenciaDiariaParameterReturnGeneral(); 
		
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asistencia Diaria Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.asistenciadiaria=new AsistenciaDiaria();
			this.asistenciadiarias = new ArrayList<AsistenciaDiaria>();
			this.asistenciadiariasAux = new ArrayList<AsistenciaDiaria>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic=new AsistenciaDiariaLogic();
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}
			
			//this.asistenciadiariaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.asistenciadiariaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAsistenciaDiaria);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAsistenciaDiaria);	
					}
					
					if(this.jInternalFrameImportacionAsistenciaDiaria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAsistenciaDiaria);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAsistenciaDiaria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAsistenciaDiaria);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAsistenciaDiaria);
				this.jInternalFrameDetalleFormAsistenciaDiaria.setVisible(false);
				this.jInternalFrameDetalleFormAsistenciaDiaria.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAsistenciaDiaria);
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.setVisible(false);
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAsistenciaDiaria!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAsistenciaDiaria);
					this.jInternalFrameImportacionAsistenciaDiaria.setVisible(false);
					this.jInternalFrameImportacionAsistenciaDiaria.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAsistenciaDiaria!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAsistenciaDiaria);
					this.jInternalFrameOrderByAsistenciaDiaria.setVisible(false);
					this.jInternalFrameOrderByAsistenciaDiaria.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAsistenciaDiariaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AsistenciaDiariaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.asistenciadiariaReturnGeneral=new AsistenciaDiariaParameterReturnGeneral();
			
			this.asistenciadiariaParameterGeneral=new AsistenciaDiariaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.asistenciadiariaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AsistenciaDiariaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AsistenciaDiariaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),this.asistenciadiariaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AsistenciaDiariaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),this.asistenciadiariaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=false;
			this.isVisibilidadCeldaDuplicarAsistenciaDiaria=true;
			this.isVisibilidadCeldaCopiarAsistenciaDiaria=true;
			this.isVisibilidadCeldaVerFormAsistenciaDiaria=true;
			this.isVisibilidadCeldaOrdenAsistenciaDiaria=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
			this.isVisibilidadCeldaModificarAsistenciaDiaria=false;
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=false;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=false;
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=false;
			this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdEstructuraSeccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAsistenciaDiaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAsistenciaDiaria();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAsistenciaDiaria(false);
			
			this.setPermisosUsuarioAsistenciaDiaria();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado() 
				|| (this.asistenciadiariaSessionBean.getEsGuardarRelacionado() && this.asistenciadiariaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAsistenciaDiariaClasesRelacionadas();
			}
			
			if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAsistenciaDiariaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAsistenciaDiaria();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAsistenciaDiaria();
			}
			
			if(!this.isPermisoBusquedaAsistenciaDiaria) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAsistenciaDiaria,this.isPermisoPaginacionMedioAsistenciaDiaria,this.isPermisoPaginacionTodoAsistenciaDiaria);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AsistenciaDiariaConstantesFunciones.getTiposSeleccionarAsistenciaDiaria());
				
				this.tiposColumnasSelect=AsistenciaDiariaConstantesFunciones.getTiposSeleccionarAsistenciaDiaria(true);
				
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
			//if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAsistenciaDiaria();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioAsistenciaDiaria(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioAsistenciaDiaria(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaDiaria() ;
			
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
			this.empleadoLogic=new EmpleadoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.estructuraseccionLogic=new EstructuraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				asistenciadiariaImplementable= (AsistenciaDiariaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AsistenciaDiariaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				asistenciadiariaImplementableHome= (AsistenciaDiariaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AsistenciaDiariaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.asistenciadiarias= new ArrayList<AsistenciaDiaria>();
			this.asistenciadiariasEliminados= new ArrayList<AsistenciaDiaria>();
						
			this.isEsNuevoAsistenciaDiaria=false;
			this.esParaAccionDesdeFormularioAsistenciaDiaria=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.estructuraseccionsForeignKey=new ArrayList<Estructura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAsistenciaDiaria(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAsistenciaDiaria();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AsistenciaDiariaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAsistenciaDiaria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAsistenciaDiaria(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAsistenciaDiaria();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAsistenciaDiaria();
			}
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAsistenciaDiaria.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAsistenciaDiaria.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAsistenciaDiaria.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAsistenciaDiaria(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AsistenciaDiaria: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAsistenciaDiaria() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAsistenciaDiaria")) {
				iIndex=this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAsistenciaDiaria();	
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
	
	public void cargarCombosForeignKeyAsistenciaDiaria(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAsistenciaDiaria(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAsistenciaDiaria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAsistenciaDiariaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAsistenciaDiaria();
		
		this.cargarCombosFrameForeignKeyAsistenciaDiaria();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAsistenciaDiaria();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAsistenciaDiaria();
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

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraSeccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraSeccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructuraSeccion();
				this.cargarCombosFrameEstructuraSeccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructuraSeccion(this.estructuraseccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAsistenciaDiariaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
			
			if(jTableDatosAsistenciaDiaria.getRowCount()>=1) {
				jTableDatosAsistenciaDiaria.removeRowSelectionInterval(0, jTableDatosAsistenciaDiaria.getRowCount()-1);						
			}
			
			this.isEsNuevoAsistenciaDiaria=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAsistenciaDiaria(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAsistenciaDiaria(true);			
			//this.asistenciadiaria=new AsistenciaDiaria();
			//this.asistenciadiaria.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaDiaria(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaDiaria() ;
			
			if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaDiaria(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.asistenciadiaria);	
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);				
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
			if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AsistenciaDiaria: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAsistenciaDiariaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAsistenciaDiaria.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAsistenciaDiaria.getSelectedRows().length;			
			}
			
			asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAsistenciaDiaria--;			
				//AsistenciaDiaria asistenciadiariaAux= new AsistenciaDiaria();			
				//asistenciadiariaAux.setId(this.iIdNuevoAsistenciaDiaria);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AsistenciaDiaria asistenciadiariaOrigen=new AsistenciaDiaria();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AsistenciaDiaria asistenciadiariaOrigen : asistenciadiariasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							asistenciadiariaOrigen =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciadiariaOrigen =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAsistenciaDiaria();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.asistenciadiaria.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAsistenciaDiaria(asistenciadiariaOrigen,this.asistenciadiaria,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.asistenciadiariaLogic.getAsistenciaDiarias().add(this.asistenciadiariaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.asistenciadiarias.add(this.asistenciadiariaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
				
				this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(this.getIndiceNuevoAsistenciaDiaria(), this.getIndiceNuevoAsistenciaDiaria());
				
				int iLastRow =  this.jTableDatosAsistenciaDiaria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAsistenciaDiaria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAsistenciaDiaria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();									
		
			AsistenciaDiaria asistenciadiariaOrigen=new AsistenciaDiaria();
			AsistenciaDiaria asistenciadiariaDestino=new AsistenciaDiaria();
				
			asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAsistenciaDiaria.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || asistenciadiariasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAsistenciaDiaria.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaOrigen =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						asistenciadiariaOrigen =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciadiariaDestino =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						asistenciadiariaDestino =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				asistenciadiariaOrigen =asistenciadiariasSeleccionados.get(0);
				asistenciadiariaDestino =asistenciadiariasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAsistenciaDiaria(asistenciadiariaOrigen,asistenciadiariaDestino,true,false);
				
				asistenciadiariaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(asistenciadiariaDestino,asistenciadiariaLogic.getAsistenciaDiarias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciadiariaDestino,asistenciadiarias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
				
				//this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(this.getIndiceNuevoAsistenciaDiaria(), this.getIndiceNuevoAsistenciaDiaria());
				
				int iLastRow =  this.jTableDatosAsistenciaDiaria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAsistenciaDiaria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAsistenciaDiaria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAsistenciaDiaria.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAsistenciaDiaria.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAsistenciaDiaria.setVisible(!isVisible);
			this.jPanelPaginacionAsistenciaDiaria.setVisible(!isVisible);
			this.jPanelAccionesAsistenciaDiaria.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAsistenciaDiaria();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAsistenciaDiaria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAsistenciaDiaria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAsistenciaDiaria();
			
			this.abrirFrameOrderByAsistenciaDiaria();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAsistenciaDiaria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAsistenciaDiaria(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAsistenciaDiaria);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAsistenciaDiaria.isMaximum()) {
					this.jInternalFrameDetalleFormAsistenciaDiaria.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAsistenciaDiaria.setSize(this.jInternalFrameDetalleFormAsistenciaDiaria.iWidthFormulario,this.jInternalFrameDetalleFormAsistenciaDiaria.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAsistenciaDiaria.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAsistenciaDiaria.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAsistenciaDiaria.isMaximum()) {
						this.jInternalFrameDetalleFormAsistenciaDiaria.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAsistenciaDiaria.jContentPaneDetalleAsistenciaDiaria.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaDiaria.jContentPaneDetalleAsistenciaDiaria.getWidth(),AsistenciaDiariaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaDiaria.jContentPaneDetalleAsistenciaDiaria.getWidth(),AsistenciaDiariaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaDiaria.jContentPaneDetalleAsistenciaDiaria.getWidth(),AsistenciaDiariaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAsistenciaDiaria.setVisible(true);
	        this.jInternalFrameDetalleFormAsistenciaDiaria.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAsistenciaDiaria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAsistenciaDiaria==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAsistenciaDiaria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaDiaria,false,this);
				} else {
					this.jInternalFrameOrderByAsistenciaDiaria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaDiaria,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAsistenciaDiaria);
				this.jInternalFrameOrderByAsistenciaDiaria.setVisible(false);
				this.jInternalFrameOrderByAsistenciaDiaria.setSelected(false);
				
				this.jInternalFrameOrderByAsistenciaDiaria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAsistenciaDiaria"));
				
				this.inicializarActualizarBindingTablaOrderByAsistenciaDiaria();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAsistenciaDiaria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAsistenciaDiaria==null) {
				
				this.jInternalFrameImportacionAsistenciaDiaria=new ImportacionJInternalFrame(AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAsistenciaDiaria);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAsistenciaDiaria);
				this.jInternalFrameImportacionAsistenciaDiaria.setVisible(false);
				this.jInternalFrameImportacionAsistenciaDiaria.setSelected(false);


				this.jInternalFrameImportacionAsistenciaDiaria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAsistenciaDiaria"));
				this.jInternalFrameImportacionAsistenciaDiaria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAsistenciaDiaria"));
				this.jInternalFrameImportacionAsistenciaDiaria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAsistenciaDiaria"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAsistenciaDiaria() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAsistenciaDiaria==null) {
				this.jInternalFrameReporteDinamicoAsistenciaDiaria=new ReporteDinamicoJInternalFrame(AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAsistenciaDiaria);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAsistenciaDiaria);
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.setVisible(false);
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaDiaria"));
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaDiaria"));
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaDiaria"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaDiaria();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAsistenciaDiaria() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAsistenciaDiaria);
			
	       	this.jInternalFrameDetalleFormAsistenciaDiaria.setVisible(false);
	        this.jInternalFrameDetalleFormAsistenciaDiaria.setSelected(false);
			
			//this.jInternalFrameDetalleFormAsistenciaDiaria.dispose();
			//this.jInternalFrameDetalleFormAsistenciaDiaria=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAsistenciaDiaria() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAsistenciaDiaria.setVisible(true);
	        this.jInternalFrameReporteDinamicoAsistenciaDiaria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAsistenciaDiaria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAsistenciaDiaria.setVisible(true);
	        this.jInternalFrameImportacionAsistenciaDiaria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAsistenciaDiaria() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAsistenciaDiaria.setVisible(true);
	        this.jInternalFrameOrderByAsistenciaDiaria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAsistenciaDiaria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAsistenciaDiaria.setVisible(false);
	        this.jInternalFrameOrderByAsistenciaDiaria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAsistenciaDiaria() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAsistenciaDiaria.setVisible(false);
	        this.jInternalFrameReporteDinamicoAsistenciaDiaria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAsistenciaDiaria() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAsistenciaDiaria.setVisible(false);
	        this.jInternalFrameImportacionAsistenciaDiaria.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderAsistenciaDiaria=(TitledBorder)this.jScrollPanelDatosAsistenciaDiaria.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderAsistenciaDiaria.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeEstructuraSeccion(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="EstructuraSeccion";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderAsistenciaDiaria=(TitledBorder)this.jScrollPanelDatosAsistenciaDiaria.getBorder();
						TitledBorder titledBorderEstructuraSeccion=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructuraSeccion.setTitle(titledBorderAsistenciaDiaria.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructuraSeccion(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAsistenciaDiaria(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAsistenciaDiaria(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAsistenciaDiaria(true);
			//this.isEsNuevoAsistenciaDiaria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAsistenciaDiaria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaDiaria(false) ;
			
			if(asistenciadiariaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaDiaria(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaDiaria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAsistenciaDiariaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAsistenciaDiaria(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAsistenciaDiaria(true);
			//this.isEsNuevoAsistenciaDiaria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.asistenciadiaria.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAsistenciaDiaria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAsistenciaDiaria(false) ;
			
			if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaDiaria(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaDiaria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.asistenciadiariaConstantesFunciones.cargarid_empleadoAsistenciaDiaria) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaDiaria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaDiaria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructuraSeccion(List<Estructura> estructuraseccionsForeignKey)throws Exception{
		TableColumn tableColumnEstructuraSeccion=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION));
		TableCellEditor tableCellEditorEstructuraSeccion =tableColumnEstructuraSeccion.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructuraSeccion;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructuraseccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaDiaria.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructuraseccionsForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAsistenciaDiaria(false);
			
			//if(!this.isEsNuevoAsistenciaDiaria) {								
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				
			}
			
			if(this.permiteMantenimiento(this.asistenciadiaria)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAsistenciaDiaria=true;
					this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
					this.isEsNuevoAsistenciaDiaria=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAsistenciaDiaria=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAsistenciaDiaria=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAsistenciaDiaria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaDiaria(false);
				
				this.habilitarDeshabilitarControlesAsistenciaDiaria(false);
			
												
				
				if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAsistenciaDiaria();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAsistenciaDiariaActionPerformed(evt,asistenciadiariaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAsistenciaDiaria(this.asistenciadiaria,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,asistenciadiariaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.asistenciadiaria.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				this.asistenciadiaria.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				this.asistenciadiaria.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.asistenciadiaria)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AsistenciaDiariaModel) this.jTableDatosAsistenciaDiaria.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAsistenciaDiaria=true;
				this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
				this.isEsNuevoAsistenciaDiaria=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAsistenciaDiaria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaDiaria(false);
				
				this.habilitarDeshabilitarControlesAsistenciaDiaria(false);
				
				
				
				if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAsistenciaDiaria();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAsistenciaDiaria.getRowCount()>=1) {
				jTableDatosAsistenciaDiaria.removeRowSelectionInterval(0, jTableDatosAsistenciaDiaria.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAsistenciaDiaria(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaDiaria(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaDiaria(false) ;
			
			this.isEsNuevoAsistenciaDiaria=false;
			
			if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAsistenciaDiaria();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAsistenciaDiaria(false);
				
				//SI ES MANUAL
				if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAsistenciaDiaria();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAsistenciaDiaria--;			
			//AsistenciaDiaria asistenciadiariaAux= new AsistenciaDiaria();			
			//asistenciadiariaAux.setId(this.iIdNuevoAsistenciaDiaria);
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAsistenciaDiaria();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
			
			this.asistenciadiaria.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.asistenciadiariaLogic.getAsistenciaDiarias().add(this.asistenciadiariaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.asistenciadiarias.add(this.asistenciadiariaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
			
			this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(this.getIndiceNuevoAsistenciaDiaria(), this.getIndiceNuevoAsistenciaDiaria());
			
			int iLastRow =  this.jTableDatosAsistenciaDiaria.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAsistenciaDiaria.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAsistenciaDiaria.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaDiaria(false);
			
			//SI ES MANUAL
			if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaDiaria();
			}
			
			//this.abrirFrameTreeAsistenciaDiaria();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Asistencia DiariaS ?", "MANTENIMIENTO DE Asistencia Diaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAsistenciaDiaria.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAsistenciaDiaria();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.asistenciadiariaReturnGeneral=asistenciadiariaLogic.procesarImportacionAsistenciaDiariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.asistenciadiariaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAsistenciaDiariaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAsistenciaDiaria.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAsistenciaDiaria.setFileImportacion(this.jInternalFrameImportacionAsistenciaDiaria.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAsistenciaDiaria.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAsistenciaDiaria.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAsistenciaDiaria.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAsistenciaDiaria.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		

		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AsistenciaDiariaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AsistenciaDiariaBaseDesign.jrxml";
			
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
			
			this.generarReporteAsistenciaDiarias("Todos",asistenciadiariasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstructuraSeccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstructuraSeccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstructuraSeccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstructuraSeccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasAtraso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasAtraso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasAtraso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasAtraso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasFalta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasFalta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasFalta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasFalta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasPermiso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasPermiso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasPermiso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasPermiso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasExtra25_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasExtra25_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasExtra25_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasExtra25_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasExtra50_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasExtra50_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasExtra50_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasExtra50_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasExtra100_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasExtra100_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasExtra100_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasExtra100_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					sNombreCampoCategoria="id_estructura_seccion";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoria="hora";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO:
					sNombreCampoCategoria="horas_atraso";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA:
					sNombreCampoCategoria="horas_falta";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO:
					sNombreCampoCategoria="horas_permiso";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25:
					sNombreCampoCategoria="horas_extra25";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50:
					sNombreCampoCategoria="horas_extra50";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100:
					sNombreCampoCategoria="horas_extra100";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					sNombreCampoCategoriaValor="id_estructura_seccion";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoriaValor="hora";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO:
					sNombreCampoCategoriaValor="horas_atraso";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA:
					sNombreCampoCategoriaValor="horas_falta";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO:
					sNombreCampoCategoriaValor="horas_permiso";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25:
					sNombreCampoCategoriaValor="horas_extra25";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50:
					sNombreCampoCategoriaValor="horas_extra50";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100:
					sNombreCampoCategoriaValor="horas_extra100";
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura Seccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura_seccion");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Atraso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_atraso");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Falta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_falta");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Permiso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_permiso");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Extra25",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_extra25");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Extra50",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_extra50");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Extra100",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_extra100");
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciadiaria";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AsistenciaDiarias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.getestructuraseccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORA);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.gethora());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.gethoras_atraso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.gethoras_falta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.gethoras_permiso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.gethoras_extra25());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.gethoras_extra50());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.gethoras_extra100());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(AsistenciaDiaria asistenciadiaria:asistenciadiariasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciadiaria.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelAsistenciaDiaria(row);				
			//	iRow++;
			//}				
			
			//for(AsistenciaDiaria asistenciadiariaAux:asistenciadiariasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAsistenciaDiaria(asistenciadiariaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
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
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaDiaria(false);
			
			//SI ES MANUAL
			if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaDiaria();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaDiaria(false);
			
			//SI ES MANUAL
			if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAsistenciaDiaria();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaDiaria(false);
			
			//SI ES MANUAL
			if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAsistenciaDiaria();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAsistenciaDiaria() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAsistenciaDiaria.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAsistenciaDiaria.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAsistenciaDiaria.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAsistenciaDiaria.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAsistenciaDiaria.setMinimumSize(dimensionMinimum);
		this.jTableDatosAsistenciaDiaria.setMaximumSize(dimensionMaximum);
		this.jTableDatosAsistenciaDiaria.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAsistenciaDiaria(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAsistenciaDiaria(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAsistenciaDiaria(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAsistenciaDiaria(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAsistenciaDiaria(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAsistenciaDiaria(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaDiaria(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAsistenciaDiaria(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAsistenciaDiaria() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAsistenciaDiaria();
		
		this.inicializarActualizarBindingBotonesManualAsistenciaDiaria(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAsistenciaDiaria();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaDiaria() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaDiaria(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaDiaria(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAsistenciaDiaria.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAsistenciaDiaria.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAsistenciaDiaria.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAsistenciaDiaria.jCheckBoxPostAccionNuevoAsistenciaDiaria.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAsistenciaDiaria.jCheckBoxPostAccionSinCerrarAsistenciaDiaria.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAsistenciaDiaria.jCheckBoxPostAccionSinMensajeAsistenciaDiaria.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAsistenciaDiaria.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAsistenciaDiaria.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAsistenciaDiaria.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
				this.jInternalFrameDetalleFormAsistenciaDiaria.jCheckBoxPostAccionNuevoAsistenciaDiaria.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAsistenciaDiaria.jCheckBoxPostAccionSinCerrarAsistenciaDiaria.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAsistenciaDiaria.jCheckBoxPostAccionSinMensajeAsistenciaDiaria.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAsistenciaDiaria.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAsistenciaDiaria.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAsistenciaDiaria.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAsistenciaDiaria.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAsistenciaDiaria.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAsistenciaDiaria.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAsistenciaDiaria.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAsistenciaDiaria.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAsistenciaDiaria.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAsistenciaDiaria(Boolean esInicializar) throws Exception {
		try	{	
			if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaDiaria(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaDiaria() throws Exception {
		try	{
			if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAsistenciaDiaria();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAsistenciaDiaria() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAsistenciaDiaria() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAsistenciaDiaria.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAsistenciaDiaria.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAsistenciaDiaria.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAsistenciaDiaria.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAsistenciaDiaria.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAsistenciaDiaria.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAsistenciaDiaria.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAsistenciaDiaria.addItem(reporte);
			}
			
			
			if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAsistenciaDiaria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAsistenciaDiaria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAsistenciaDiaria.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAsistenciaDiaria.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAsistenciaDiaria.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAsistenciaDiaria.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAsistenciaDiaria.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAsistenciaDiaria.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAsistenciaDiaria.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaDiaria();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaDiaria() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
				
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=AsistenciaDiariaConstantesFunciones.getTiposSeleccionarAsistenciaDiaria(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=AsistenciaDiariaConstantesFunciones.getTiposSeleccionarAsistenciaDiaria(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=AsistenciaDiariaConstantesFunciones.getTiposSeleccionarAsistenciaDiaria(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAsistenciaDiaria()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.getSelectedItem()!=null){this.id_estructura_seccionFK_IdEstructuraSeccion=((Estructura)this.jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAsistenciaDiaria(Boolean esInicializar) throws Exception {				
		if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAsistenciaDiaria();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAsistenciaDiaria() throws Exception {
		this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAsistenciaDiaria() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAsistenciaDiariaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiariaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAsistenciaDiaria(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=asistenciadiariaLogic.getAsistenciaDiarias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=asistenciadiarias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAsistenciaDiaria.setModel(new AsistenciaDiariaModel(this.asistenciadiariaLogic.getAsistenciaDiarias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAsistenciaDiaria.setModel(new AsistenciaDiariaModel(this.asistenciadiarias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAsistenciaDiaria!=null && this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAsistenciaDiaria();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO,asistenciadiariaConstantesFunciones.resaltarSeleccionarAsistenciaDiaria,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO,asistenciadiariaConstantesFunciones.resaltarSeleccionarAsistenciaDiaria,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_ID));

		if(this.asistenciadiariaConstantesFunciones.mostraridAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciadiariaConstantesFunciones.resaltaridAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activaridAsistenciaDiaria,iSizeTabla,this,true,"idAsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltaridAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activaridAsistenciaDiaria,this,true,"idAsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.asistenciadiariaConstantesFunciones.mostrarid_empresaAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.asistenciadiariaConstantesFunciones.resaltarid_empresaAsistenciaDiaria,this,this.asistenciadiariaConstantesFunciones.activarid_empresaAsistenciaDiaria,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.asistenciadiariaConstantesFunciones.resaltarid_empresaAsistenciaDiaria,this,this.asistenciadiariaConstantesFunciones.activarid_empresaAsistenciaDiaria,false,"id_empresaAsistenciaDiaria","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.asistenciadiariaConstantesFunciones.mostrarid_empleadoAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.asistenciadiariaConstantesFunciones.resaltarid_empleadoAsistenciaDiaria,this,this.asistenciadiariaConstantesFunciones.activarid_empleadoAsistenciaDiaria,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.asistenciadiariaConstantesFunciones.resaltarid_empleadoAsistenciaDiaria,this,this.asistenciadiariaConstantesFunciones.activarid_empleadoAsistenciaDiaria,true,"id_empleadoAsistenciaDiaria","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.asistenciadiariaConstantesFunciones.mostrarid_estructuraAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.asistenciadiariaConstantesFunciones.resaltarid_estructuraAsistenciaDiaria,this,this.asistenciadiariaConstantesFunciones.activarid_estructuraAsistenciaDiaria,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.asistenciadiariaConstantesFunciones.resaltarid_estructuraAsistenciaDiaria,this,this.asistenciadiariaConstantesFunciones.activarid_estructuraAsistenciaDiaria,true,"id_estructuraAsistenciaDiaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION));

		if(this.asistenciadiariaConstantesFunciones.mostrarid_estructura_seccionAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructuraseccionsForeignKey,this.asistenciadiariaConstantesFunciones.resaltarid_estructura_seccionAsistenciaDiaria,this,this.asistenciadiariaConstantesFunciones.activarid_estructura_seccionAsistenciaDiaria,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructuraseccionsForeignKey,this.asistenciadiariaConstantesFunciones.resaltarid_estructura_seccionAsistenciaDiaria,this,this.asistenciadiariaConstantesFunciones.activarid_estructura_seccionAsistenciaDiaria,true,"id_estructura_seccionAsistenciaDiaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_FECHA));

		if(this.asistenciadiariaConstantesFunciones.mostrarfechaAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.asistenciadiariaConstantesFunciones.resaltarfechaAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarfechaAsistenciaDiaria,iSizeTabla,this,true,"fechaAsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltarfechaAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarfechaAsistenciaDiaria,this,true,"fechaAsistenciaDiaria","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_HORA));

		if(this.asistenciadiariaConstantesFunciones.mostrarhoraAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_HORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoraAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoraAsistenciaDiaria,iSizeTabla,this,true,"horaAsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoraAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoraAsistenciaDiaria,iSizeTabla,this,true,"horaAsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO));

		if(this.asistenciadiariaConstantesFunciones.mostrarhoras_atrasoAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_atrasoAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_atrasoAsistenciaDiaria,iSizeTabla,this,true,"horas_atrasoAsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_atrasoAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_atrasoAsistenciaDiaria,this,true,"horas_atrasoAsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA));

		if(this.asistenciadiariaConstantesFunciones.mostrarhoras_faltaAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_faltaAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_faltaAsistenciaDiaria,iSizeTabla,this,true,"horas_faltaAsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_faltaAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_faltaAsistenciaDiaria,this,true,"horas_faltaAsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO));

		if(this.asistenciadiariaConstantesFunciones.mostrarhoras_permisoAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_permisoAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_permisoAsistenciaDiaria,iSizeTabla,this,true,"horas_permisoAsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_permisoAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_permisoAsistenciaDiaria,this,true,"horas_permisoAsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25));

		if(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra25AsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra25AsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_extra25AsistenciaDiaria,iSizeTabla,this,true,"horas_extra25AsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra25AsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_extra25AsistenciaDiaria,this,true,"horas_extra25AsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50));

		if(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra50AsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra50AsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_extra50AsistenciaDiaria,iSizeTabla,this,true,"horas_extra50AsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra50AsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_extra50AsistenciaDiaria,this,true,"horas_extra50AsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100));

		if(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra100AsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra100AsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_extra100AsistenciaDiaria,iSizeTabla,this,true,"horas_extra100AsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra100AsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activarhoras_extra100AsistenciaDiaria,this,true,"horas_extra100AsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.asistenciadiariaConstantesFunciones.mostrardescripcionAsistenciaDiaria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.asistenciadiariaConstantesFunciones.resaltardescripcionAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activardescripcionAsistenciaDiaria,iSizeTabla,this,true,"descripcionAsistenciaDiaria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciadiariaConstantesFunciones.resaltardescripcionAsistenciaDiaria,this.asistenciadiariaConstantesFunciones.activardescripcionAsistenciaDiaria,this,true,"descripcionAsistenciaDiaria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaDiariaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAsistenciaDiaria.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAsistenciaDiaria.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAsistenciaDiaria.addColumn(tableColumn);
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
			
			this.jTableDatosAsistenciaDiaria.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAsistenciaDiaria.moveColumn(this.jTableDatosAsistenciaDiaria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAsistenciaDiaria.moveColumn(this.jTableDatosAsistenciaDiaria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAsistenciaDiaria.moveColumn(this.jTableDatosAsistenciaDiaria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAsistenciaDiaria.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAsistenciaDiaria.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAsistenciaDiaria,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAsistenciaDiaria.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAsistenciaDiaria.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAsistenciaDiaria.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAsistenciaDiaria.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=asistenciadiariaLogic.getAsistenciaDiarias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=asistenciadiarias.size()-1;
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
		//this.jTableDatosAsistenciaDiaria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAsistenciaDiaria();
			
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
				
				//this.isEsNuevoAsistenciaDiaria=false;
					
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
				if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAsistenciaDiaria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAsistenciaDiaria.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.asistenciadiaria.getsType().equals("DUPLICADO")
				   || this.asistenciadiaria.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAsistenciaDiaria=true;
				
				} else {
					this.isEsNuevoAsistenciaDiaria=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
					if(this.asistenciadiaria.getId()>=0 && !this.asistenciadiaria.getIsNew()) {						
						this.isEsNuevoAsistenciaDiaria=false;
						
					} else {
						this.isEsNuevoAsistenciaDiaria=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAsistenciaDiaria(esRelaciones);						
				
				this.seleccionarAsistenciaDiaria(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.asistenciadiaria.getId()<0) {
					this.isEsNuevoAsistenciaDiaria=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAsistenciaDiaria(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAsistenciaDiaria(evt,rowIndex);
				}	
				
				if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AsistenciaDiaria: " + this.dDif); 
					}
				}								
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAsistenciaDiaria(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.asistenciadiaria)) {
					if(this.asistenciadiaria.getId()>0) {
						this.asistenciadiaria.setIsDeleted(true);
						
						this.asistenciadiariasEliminados.add(this.asistenciadiaria);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.asistenciadiariaLogic.getAsistenciaDiarias().remove(this.asistenciadiaria);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.asistenciadiarias.remove(this.asistenciadiaria);				
					}
					
					
					((AsistenciaDiariaModel) this.jTableDatosAsistenciaDiaria.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaDiaria(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAsistenciaDiaria(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAsistenciaDiaria) {
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAsistenciaDiaria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAsistenciaDiaria.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAsistenciaDiaria(this.asistenciadiaria);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.asistenciadiariaConstantesFunciones.cargarid_empresaAsistenciaDiaria || this.asistenciadiariaConstantesFunciones.event_dependid_empresaAsistenciaDiaria) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.asistenciadiaria.getid_empresa());
									//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(asistenciadiaria.getEmpresa()!=null) {
							this.empresasForeignKey.add(asistenciadiaria.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.asistenciadiaria.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.asistenciadiariaConstantesFunciones.cargarid_empleadoAsistenciaDiaria || this.asistenciadiariaConstantesFunciones.event_dependid_empleadoAsistenciaDiaria) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.asistenciadiaria.getid_empleado());
									//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(asistenciadiaria.getEmpleado()!=null) {
							this.empleadosForeignKey.add(asistenciadiaria.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.asistenciadiaria.getid_empleado(),false,"Formulario");

					//Estructura
					if(!this.asistenciadiariaConstantesFunciones.cargarid_estructuraAsistenciaDiaria || this.asistenciadiariaConstantesFunciones.event_dependid_estructuraAsistenciaDiaria) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.asistenciadiaria.getid_estructura());
									//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(asistenciadiaria.getEstructura()!=null) {
							this.estructurasForeignKey.add(asistenciadiaria.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.asistenciadiaria.getid_estructura(),false,"Formulario");

					//EstructuraSeccion
					if(!this.asistenciadiariaConstantesFunciones.cargarid_estructura_seccionAsistenciaDiaria || this.asistenciadiariaConstantesFunciones.event_dependid_estructura_seccionAsistenciaDiaria) {
						//this.cargarCombosEstructuraSeccionsForeignKeyLista(" where id="+this.asistenciadiaria.getid_estructura_seccion());
									//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
						this.estructuraseccionsForeignKey=new ArrayList<Estructura>();

						if(asistenciadiaria.getEstructuraSeccion()!=null) {
							this.estructuraseccionsForeignKey.add(asistenciadiaria.getEstructuraSeccion());
						}

						this.addItemDefectoCombosForeignKeyEstructuraSeccion();
						this.cargarCombosFrameEstructuraSeccionsForeignKey("Todos");
					}
					this.setActualEstructuraSeccionForeignKey(this.asistenciadiaria.getid_estructura_seccion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAsistenciaDiaria("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAsistenciaDiaria(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaDiaria() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAsistenciaDiaria(AsistenciaDiaria asistenciadiaria) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAsistenciaDiaria(asistenciadiaria,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAsistenciaDiaria(asistenciadiaria);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAsistenciaDiaria(asistenciadiaria,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaDiaria(asistenciadiaria);
	}
	
	public void setVariablesObjetoActualToFormularioAsistenciaDiaria(AsistenciaDiaria asistenciadiaria) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.setText(asistenciadiaria.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jDateChooserfechaAsistenciaDiaria.setDate(asistenciadiaria.getfecha());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jSpinnerhoraAsistenciaDiaria.setValue(asistenciadiaria.gethora());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_atrasoAsistenciaDiaria.setText(asistenciadiaria.gethoras_atraso().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_faltaAsistenciaDiaria.setText(asistenciadiaria.gethoras_falta().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_permisoAsistenciaDiaria.setText(asistenciadiaria.gethoras_permiso().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra25AsistenciaDiaria.setText(asistenciadiaria.gethoras_extra25().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra50AsistenciaDiaria.setText(asistenciadiaria.gethoras_extra50().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra100AsistenciaDiaria.setText(asistenciadiaria.gethoras_extra100().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFielddescripcionAsistenciaDiaria.setText(asistenciadiaria.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AsistenciaDiaria asistenciadiariaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,asistenciadiariaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AsistenciaDiaria asistenciadiariaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				asistenciadiariaLocal=this.asistenciadiaria;
			} else {
				asistenciadiariaLocal=this.asistenciadiariaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(asistenciadiariaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAsistenciaDiaria(asistenciadiariaLocal,true);
					
					if(asistenciadiariaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(asistenciadiariaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(asistenciadiariaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAsistenciaDiaria(asistenciadiaria,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(asistenciadiaria);
	}
	
	public void setVariablesFormularioToObjetoActualAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAsistenciaDiaria(asistenciadiaria,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.getText()==null || this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.getText()=="" || this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.getText()=="Id") {
				this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.setText("0");
			}

			if(conColumnasBase) {asistenciadiaria.setId(Long.parseLong(this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelIdAsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.setfecha(this.jInternalFrameDetalleFormAsistenciaDiaria.jDateChooserfechaAsistenciaDiaria.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelfechaAsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.sethora(new Time(((Date)this.jInternalFrameDetalleFormAsistenciaDiaria.jSpinnerhoraAsistenciaDiaria.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_HORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoraAsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.sethoras_atraso(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_atrasoAsistenciaDiaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_atrasoAsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.sethoras_falta(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_faltaAsistenciaDiaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_faltaAsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.sethoras_permiso(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_permisoAsistenciaDiaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_permisoAsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.sethoras_extra25(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra25AsistenciaDiaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra25AsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.sethoras_extra50(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra50AsistenciaDiaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra50AsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.sethoras_extra100(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra100AsistenciaDiaria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelhoras_extra100AsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciadiaria.setdescripcion(this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFielddescripcionAsistenciaDiaria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaDiaria.jLabeldescripcionAsistenciaDiaria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAsistenciaDiaria(AsistenciaDiaria asistenciadiariaBean,AsistenciaDiaria asistenciadiaria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && asistenciadiariaBean.getid_empleado()!=null && !asistenciadiariaBean.getid_empleado().equals(-1L))) {asistenciadiaria.setid_empleado(asistenciadiariaBean.getid_empleado());}
			if(conDefault || (!conDefault && asistenciadiariaBean.getid_estructura()!=null && !asistenciadiariaBean.getid_estructura().equals(-1L))) {asistenciadiaria.setid_estructura(asistenciadiariaBean.getid_estructura());}
			if(conDefault || (!conDefault && asistenciadiariaBean.getid_estructura_seccion()!=null && !asistenciadiariaBean.getid_estructura_seccion().equals(-1L))) {asistenciadiaria.setid_estructura_seccion(asistenciadiariaBean.getid_estructura_seccion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAsistenciaDiaria(AsistenciaDiaria asistenciadiariaOrigen,AsistenciaDiaria asistenciadiaria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && asistenciadiariaOrigen.getId()!=null && !asistenciadiariaOrigen.getId().equals(0L))) {asistenciadiaria.setId(asistenciadiariaOrigen.getId());}}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.getid_empleado()!=null && !asistenciadiariaOrigen.getid_empleado().equals(-1L))) {asistenciadiaria.setid_empleado(asistenciadiariaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.getid_estructura()!=null && !asistenciadiariaOrigen.getid_estructura().equals(-1L))) {asistenciadiaria.setid_estructura(asistenciadiariaOrigen.getid_estructura());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.getid_estructura_seccion()!=null && !asistenciadiariaOrigen.getid_estructura_seccion().equals(-1L))) {asistenciadiaria.setid_estructura_seccion(asistenciadiariaOrigen.getid_estructura_seccion());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.getfecha()!=null && !asistenciadiariaOrigen.getfecha().equals(new Date()))) {asistenciadiaria.setfecha(asistenciadiariaOrigen.getfecha());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.gethora()!=null && !asistenciadiariaOrigen.gethora().equals(new Time((new Date()).getTime())))) {asistenciadiaria.sethora(asistenciadiariaOrigen.gethora());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.gethoras_atraso()!=null && !asistenciadiariaOrigen.gethoras_atraso().equals(0.0))) {asistenciadiaria.sethoras_atraso(asistenciadiariaOrigen.gethoras_atraso());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.gethoras_falta()!=null && !asistenciadiariaOrigen.gethoras_falta().equals(0.0))) {asistenciadiaria.sethoras_falta(asistenciadiariaOrigen.gethoras_falta());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.gethoras_permiso()!=null && !asistenciadiariaOrigen.gethoras_permiso().equals(0.0))) {asistenciadiaria.sethoras_permiso(asistenciadiariaOrigen.gethoras_permiso());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.gethoras_extra25()!=null && !asistenciadiariaOrigen.gethoras_extra25().equals(0.0))) {asistenciadiaria.sethoras_extra25(asistenciadiariaOrigen.gethoras_extra25());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.gethoras_extra50()!=null && !asistenciadiariaOrigen.gethoras_extra50().equals(0.0))) {asistenciadiaria.sethoras_extra50(asistenciadiariaOrigen.gethoras_extra50());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.gethoras_extra100()!=null && !asistenciadiariaOrigen.gethoras_extra100().equals(0.0))) {asistenciadiaria.sethoras_extra100(asistenciadiariaOrigen.gethoras_extra100());}
			if(conDefault || (!conDefault && asistenciadiariaOrigen.getdescripcion()!=null && !asistenciadiariaOrigen.getdescripcion().equals(""))) {asistenciadiaria.setdescripcion(asistenciadiariaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAsistenciaDiaria(AsistenciaDiaria asistenciadiaria) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.setText(asistenciadiaria.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jDateChooserfechaAsistenciaDiaria.setDate(asistenciadiaria.getfecha());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jSpinnerhoraAsistenciaDiaria.setValue(asistenciadiaria.gethora());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_atrasoAsistenciaDiaria.setText(asistenciadiaria.gethoras_atraso().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_faltaAsistenciaDiaria.setText(asistenciadiaria.gethoras_falta().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_permisoAsistenciaDiaria.setText(asistenciadiaria.gethoras_permiso().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra25AsistenciaDiaria.setText(asistenciadiaria.gethoras_extra25().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra50AsistenciaDiaria.setText(asistenciadiaria.gethoras_extra50().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra100AsistenciaDiaria.setText(asistenciadiaria.gethoras_extra100().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFielddescripcionAsistenciaDiaria.setText(asistenciadiaria.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAsistenciaDiaria(AsistenciaDiariaBean asistenciadiariaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.setText(asistenciadiariaBean.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jDateChooserfechaAsistenciaDiaria.setDate(asistenciadiariaBean.getfecha());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jSpinnerhoraAsistenciaDiaria.setValue(asistenciadiariaBean.gethora());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_atrasoAsistenciaDiaria.setText(asistenciadiariaBean.gethoras_atraso().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_faltaAsistenciaDiaria.setText(asistenciadiariaBean.gethoras_falta().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_permisoAsistenciaDiaria.setText(asistenciadiariaBean.gethoras_permiso().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra25AsistenciaDiaria.setText(asistenciadiariaBean.gethoras_extra25().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra50AsistenciaDiaria.setText(asistenciadiariaBean.gethoras_extra50().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra100AsistenciaDiaria.setText(asistenciadiariaBean.gethoras_extra100().toString());
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFielddescripcionAsistenciaDiaria.setText(asistenciadiariaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAsistenciaDiaria(AsistenciaDiariaParameterReturnGeneral asistenciadiariaReturnGeneral,AsistenciaDiariaBean asistenciadiariaBean,Boolean conDefault) throws Exception { 
		try {
			AsistenciaDiaria asistenciadiariaLocal=new AsistenciaDiaria();
			
			asistenciadiariaLocal=asistenciadiariaReturnGeneral.getAsistenciaDiaria();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && asistenciadiariaLocal.getId()!=null && !asistenciadiariaLocal.getId().equals(0L))) {asistenciadiariaBean.setId(asistenciadiariaLocal.getId());}}
			if(conDefault || (!conDefault && asistenciadiariaLocal.getid_empleado()!=null && !asistenciadiariaLocal.getid_empleado().equals(-1L))) {asistenciadiariaBean.setid_empleado(asistenciadiariaLocal.getid_empleado());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.getid_estructura()!=null && !asistenciadiariaLocal.getid_estructura().equals(-1L))) {asistenciadiariaBean.setid_estructura(asistenciadiariaLocal.getid_estructura());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.getid_estructura_seccion()!=null && !asistenciadiariaLocal.getid_estructura_seccion().equals(-1L))) {asistenciadiariaBean.setid_estructura_seccion(asistenciadiariaLocal.getid_estructura_seccion());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.getfecha()!=null && !asistenciadiariaLocal.getfecha().equals(new Date()))) {asistenciadiariaBean.setfecha(asistenciadiariaLocal.getfecha());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.gethora()!=null && !asistenciadiariaLocal.gethora().equals(new Time((new Date()).getTime())))) {asistenciadiariaBean.sethora(asistenciadiariaLocal.gethora());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.gethoras_atraso()!=null && !asistenciadiariaLocal.gethoras_atraso().equals(0.0))) {asistenciadiariaBean.sethoras_atraso(asistenciadiariaLocal.gethoras_atraso());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.gethoras_falta()!=null && !asistenciadiariaLocal.gethoras_falta().equals(0.0))) {asistenciadiariaBean.sethoras_falta(asistenciadiariaLocal.gethoras_falta());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.gethoras_permiso()!=null && !asistenciadiariaLocal.gethoras_permiso().equals(0.0))) {asistenciadiariaBean.sethoras_permiso(asistenciadiariaLocal.gethoras_permiso());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.gethoras_extra25()!=null && !asistenciadiariaLocal.gethoras_extra25().equals(0.0))) {asistenciadiariaBean.sethoras_extra25(asistenciadiariaLocal.gethoras_extra25());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.gethoras_extra50()!=null && !asistenciadiariaLocal.gethoras_extra50().equals(0.0))) {asistenciadiariaBean.sethoras_extra50(asistenciadiariaLocal.gethoras_extra50());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.gethoras_extra100()!=null && !asistenciadiariaLocal.gethoras_extra100().equals(0.0))) {asistenciadiariaBean.sethoras_extra100(asistenciadiariaLocal.gethoras_extra100());}
			if(conDefault || (!conDefault && asistenciadiariaLocal.getdescripcion()!=null && !asistenciadiariaLocal.getdescripcion().equals(""))) {asistenciadiariaBean.setdescripcion(asistenciadiariaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAsistenciaDiariaGenerico(Long idAsistenciaDiariaSeleccionado,JComboBox jComboBoxAsistenciaDiaria,List<AsistenciaDiaria> asistenciadiariasLocal)throws Exception {
		try {
			AsistenciaDiaria  asistenciadiariaTemp=null;

			for(AsistenciaDiaria asistenciadiariaAux:asistenciadiariasLocal) {
				if(asistenciadiariaAux.getId()!=null && asistenciadiariaAux.getId().equals(idAsistenciaDiariaSeleccionado)) {
					asistenciadiariaTemp=asistenciadiariaAux;
					break;
				}
			}

			jComboBoxAsistenciaDiaria.setSelectedItem(asistenciadiariaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAsistenciaDiariaGenerico(JComboBox jComboBoxAsistenciaDiaria,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAsistenciaDiaria.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAsistenciaDiaria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAsistenciaDiaria.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAsistenciaDiaria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAsistenciaDiaria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAsistenciaDiaria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciadiaria=(AsistenciaDiaria) asistenciadiariaLogic.getAsistenciaDiarias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			asistenciadiaria =(AsistenciaDiaria) asistenciadiarias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!asistenciadiaria.getIsNew() && !asistenciadiaria.getIsChanged() && !asistenciadiaria.getIsDeleted()) {
				sDescripcion=asistenciadiaria.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciadiaria.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!asistenciadiaria.getIsNew() && !asistenciadiaria.getIsChanged() && !asistenciadiaria.getIsDeleted()) {
				sDescripcion=asistenciadiaria.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciadiaria.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!asistenciadiaria.getIsNew() && !asistenciadiaria.getIsChanged() && !asistenciadiaria.getIsDeleted()) {
				sDescripcion=asistenciadiaria.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciadiaria.getestructura_descripcion();
			}
		}

		if(sTipo.equals("EstructuraSeccion")) {
			//sDescripcion=this.getActualEstructuraSeccionForeignKeyDescripcion((Long)value);
			if(!asistenciadiaria.getIsNew() && !asistenciadiaria.getIsChanged() && !asistenciadiaria.getIsDeleted()) {
				sDescripcion=asistenciadiaria.getestructuraseccion_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraSeccionForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciadiaria.getestructuraseccion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AsistenciaDiaria asistenciadiariaRow=new AsistenciaDiaria();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciadiariaRow=(AsistenciaDiaria) asistenciadiariaLogic.getAsistenciaDiarias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			asistenciadiariaRow=(AsistenciaDiaria) asistenciadiarias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAsistenciaDiaria(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria));			
			this.jButtonDuplicarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaDiaria && this.isPermisoDuplicarAsistenciaDiaria));			
			this.jButtonCopiarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaCopiarAsistenciaDiaria && this.isPermisoCopiarAsistenciaDiaria));
			this.jButtonVerFormAsistenciaDiaria.setVisible((this.isVisibilidadCeldaVerFormAsistenciaDiaria && this.isPermisoVerFormAsistenciaDiaria));
			
			this.jButtonAbrirOrderByAsistenciaDiaria.setVisible((this.isVisibilidadCeldaOrdenAsistenciaDiaria && this.isPermisoOrdenAsistenciaDiaria));			
			
			this.jButtonNuevoRelacionesAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria));			
			this.jButtonNuevoGuardarCambiosAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaModificarAsistenciaDiaria && this.isPermisoActualizarAsistenciaDiaria));	
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaActualizarAsistenciaDiaria && this.isPermisoActualizarAsistenciaDiaria));	
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaEliminarAsistenciaDiaria && this.isPermisoEliminarAsistenciaDiaria));
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarAsistenciaDiaria.setVisible(this.isVisibilidadCeldaCancelarAsistenciaDiaria);							
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosAsistenciaDiaria.setVisible((this.isVisibilidadCeldaGuardarAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));			
			
			}
						
			this.jButtonGuardarCambiosTablaAsistenciaDiaria.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria));						
			this.jButtonDuplicarToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaDiaria && this.isPermisoDuplicarAsistenciaDiaria));						
			this.jButtonCopiarToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaCopiarAsistenciaDiaria && this.isPermisoCopiarAsistenciaDiaria));			
			this.jButtonVerFormToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaVerFormAsistenciaDiaria && this.isPermisoVerFormAsistenciaDiaria));			
			this.jButtonAbrirOrderByToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaOrdenAsistenciaDiaria && this.isPermisoOrdenAsistenciaDiaria));
			this.jButtonNuevoRelacionesToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria));			
			this.jButtonNuevoGuardarCambiosToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));			
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaModificarAsistenciaDiaria && this.isPermisoActualizarAsistenciaDiaria));	
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaActualizarAsistenciaDiaria  && this.isPermisoActualizarAsistenciaDiaria));	
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaEliminarAsistenciaDiaria && this.isPermisoEliminarAsistenciaDiaria));
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarToolBarAsistenciaDiaria.setVisible(this.isVisibilidadCeldaCancelarAsistenciaDiaria);				
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaGuardarAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria));			
			this.jMenuItemDuplicarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaDiaria && this.isPermisoDuplicarAsistenciaDiaria));			
			this.jMenuItemCopiarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaCopiarAsistenciaDiaria && this.isPermisoCopiarAsistenciaDiaria));			
			this.jMenuItemVerFormAsistenciaDiaria.setVisible((this.isVisibilidadCeldaVerFormAsistenciaDiaria && this.isPermisoVerFormAsistenciaDiaria));			
			this.jMenuItemAbrirOrderByAsistenciaDiaria.setVisible((this.isVisibilidadCeldaOrdenAsistenciaDiaria && this.isPermisoOrdenAsistenciaDiaria));			
			//this.jMenuItemMostrarOcultarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaOrdenAsistenciaDiaria && this.isPermisoOrdenAsistenciaDiaria));
			this.jMenuItemDetalleAbrirOrderByAsistenciaDiaria.setVisible((this.isVisibilidadCeldaOrdenAsistenciaDiaria && this.isPermisoOrdenAsistenciaDiaria));			
			//this.jMenuItemDetalleMostrarOcultarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaOrdenAsistenciaDiaria && this.isPermisoOrdenAsistenciaDiaria));			
			this.jMenuItemNuevoRelacionesAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria));			
			this.jMenuItemNuevoGuardarCambiosAsistenciaDiaria.setVisible((this.isVisibilidadCeldaNuevoAsistenciaDiaria && this.isPermisoNuevoAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));									
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemModificarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaModificarAsistenciaDiaria && this.isPermisoActualizarAsistenciaDiaria));	
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemActualizarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaActualizarAsistenciaDiaria && this.isPermisoActualizarAsistenciaDiaria));	
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemEliminarAsistenciaDiaria.setVisible((this.isVisibilidadCeldaEliminarAsistenciaDiaria && this.isPermisoEliminarAsistenciaDiaria));
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemCancelarAsistenciaDiaria.setVisible(this.isVisibilidadCeldaCancelarAsistenciaDiaria);				
			}
			
			this.jMenuItemGuardarCambiosAsistenciaDiaria.setVisible((this.isVisibilidadCeldaGuardarAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));						
			this.jMenuItemGuardarCambiosTablaAsistenciaDiaria.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=this.jButtonNuevoAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaDuplicarAsistenciaDiaria=this.jButtonDuplicarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaCopiarAsistenciaDiaria=this.jButtonCopiarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaVerFormAsistenciaDiaria=this.jButtonVerFormAsistenciaDiaria.isVisible();
			
			this.isVisibilidadCeldaOrdenAsistenciaDiaria=this.jButtonAbrirOrderByAsistenciaDiaria.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=this.jButtonNuevoRelacionesAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaModificarAsistenciaDiaria=this.jButtonModificarAsistenciaDiaria.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaGuardarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosAsistenciaDiaria.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=this.jButtonGuardarCambiosTablaAsistenciaDiaria.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=this.jButtonNuevoToolBarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=this.jButtonNuevoRelacionesToolBarAsistenciaDiaria.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			this.isVisibilidadCeldaModificarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarToolBarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarToolBarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarToolBarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarToolBarAsistenciaDiaria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAsistenciaDiaria=this.jButtonGuardarCambiosToolBarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=this.jButtonGuardarCambiosTablaToolBarAsistenciaDiaria.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=this.jMenuItemNuevoAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=this.jMenuItemNuevoRelacionesAsistenciaDiaria.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			this.isVisibilidadCeldaModificarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemModificarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemActualizarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemEliminarAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemCancelarAsistenciaDiaria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAsistenciaDiaria=this.jMenuItemGuardarCambiosAsistenciaDiaria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=this.jMenuItemGuardarCambiosTablaAsistenciaDiaria.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAsistenciaDiaria(Boolean esInicializar) {
		if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
				//if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAsistenciaDiaria();
			}
			
			this.inicializarActualizarBindingBotonesManualAsistenciaDiaria(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAsistenciaDiaria() {
		this.jButtonNuevoAsistenciaDiaria.setVisible(this.isPermisoNuevoAsistenciaDiaria);			
		this.jButtonDuplicarAsistenciaDiaria.setVisible(this.isPermisoDuplicarAsistenciaDiaria);			
		this.jButtonCopiarAsistenciaDiaria.setVisible(this.isPermisoCopiarAsistenciaDiaria);			
		this.jButtonVerFormAsistenciaDiaria.setVisible(this.isPermisoVerFormAsistenciaDiaria);			
		
		this.jButtonAbrirOrderByAsistenciaDiaria.setVisible(this.isPermisoOrdenAsistenciaDiaria);					
		
		this.jButtonNuevoRelacionesAsistenciaDiaria.setVisible(this.isPermisoNuevoAsistenciaDiaria);			
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarAsistenciaDiaria.setVisible(this.isPermisoActualizarAsistenciaDiaria);	
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarAsistenciaDiaria.setVisible(this.isPermisoActualizarAsistenciaDiaria);	
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarAsistenciaDiaria.setVisible(this.isPermisoEliminarAsistenciaDiaria);
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarAsistenciaDiaria.setVisible(this.isVisibilidadCeldaCancelarAsistenciaDiaria);						
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosAsistenciaDiaria.setVisible(this.isPermisoGuardarCambiosAsistenciaDiaria);							
		}
		
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.setVisible(this.isPermisoActualizarAsistenciaDiaria);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAsistenciaDiaria() {
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarAsistenciaDiaria.setVisible(this.isPermisoActualizarAsistenciaDiaria);	
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarAsistenciaDiaria.setVisible(this.isPermisoActualizarAsistenciaDiaria);	
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarAsistenciaDiaria.setVisible(this.isPermisoEliminarAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarAsistenciaDiaria.setVisible(this.isVisibilidadCeldaCancelarAsistenciaDiaria);							
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosAsistenciaDiaria.setVisible((this.isVisibilidadCeldaGuardarAsistenciaDiaria && this.isPermisoGuardarCambiosAsistenciaDiaria));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAsistenciaDiaria() {
		if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAsistenciaDiaria();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAsistenciaDiaria() {
	}
	
	public void jTableDatosAsistenciaDiariaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAsistenciaDiaria(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.asistenciadiaria.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAsistenciaDiariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAsistenciaDiaria(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaDiaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.asistenciadiariaLogic.getConnexion());

				if(this.asistenciadiaria.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.asistenciadiaria.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaDiaria=(TitledBorder)this.jScrollPanelDatosAsistenciaDiaria.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAsistenciaDiaria.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.asistenciadiaria.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoAsistenciaDiariaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderAsistenciaDiaria=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosAsistenciaDiaria.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderAsistenciaDiaria=(TitledBorder)this.jScrollPanelDatosAsistenciaDiaria.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAsistenciaDiaria.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoAsistenciaDiariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebAsistenciaDiaria(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaDiaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.asistenciadiariaLogic.getConnexion());

				if(this.asistenciadiaria.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.asistenciadiaria.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaDiaria=(TitledBorder)this.jScrollPanelDatosAsistenciaDiaria.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAsistenciaDiaria.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.asistenciadiaria.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraAsistenciaDiariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebAsistenciaDiaria(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaDiaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.asistenciadiariaLogic.getConnexion());

				if(this.asistenciadiaria.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.asistenciadiaria.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaDiaria=(TitledBorder)this.jScrollPanelDatosAsistenciaDiaria.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderAsistenciaDiaria.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.asistenciadiaria.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructura_seccionAsistenciaDiariaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructuraseccion=true;

			idTienePermisoestructuraseccion=this.tienePermisosUsuarioEnPaginaWebAsistenciaDiaria(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructuraseccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaDiaria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaDiaria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);

				this.estructuraseccionBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraseccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraseccionBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.asistenciadiariaLogic.getConnexion());

				if(this.asistenciadiaria.getid_estructura_seccion()!=null) {
					this.estructuraseccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraseccionBeanSwingJInternalFrame.setIdActual(this.asistenciadiaria.getid_estructura_seccion());
					this.estructuraseccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraseccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraseccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraseccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaDiaria=(TitledBorder)this.jScrollPanelDatosAsistenciaDiaria.getBorder();
				TitledBorder titledBorderestructuraseccion=(TitledBorder)this.estructuraseccionBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructuraseccion.setTitle(titledBorderAsistenciaDiaria.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructura_seccionAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.getid_estructura_seccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura_seccion = "+this.asistenciadiaria.getid_estructura_seccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.asistenciadiaria.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoraAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.gethora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora = "+this.asistenciadiaria.gethora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_atrasoAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.gethoras_atraso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_atraso = "+this.asistenciadiaria.gethoras_atraso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_faltaAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.gethoras_falta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_falta = "+this.asistenciadiaria.gethoras_falta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_permisoAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.gethoras_permiso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_permiso = "+this.asistenciadiaria.gethoras_permiso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_extra25AsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.gethoras_extra25()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_extra25 = "+this.asistenciadiaria.gethoras_extra25().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_extra50AsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.gethoras_extra50()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_extra50 = "+this.asistenciadiaria.gethoras_extra50().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_extra100AsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.gethoras_extra100()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_extra100 = "+this.asistenciadiaria.gethoras_extra100().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionAsistenciaDiariaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.getasistenciadiaria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciadiaria==null) {
						this.asistenciadiaria = new AsistenciaDiaria();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);
				}

				if(this.asistenciadiaria.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.asistenciadiaria.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaDiaria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);

			this.getAsistenciaDiariasFK_IdEmpleado();

			this.inicializarActualizarBindingAsistenciaDiaria(false);

			//if(AsistenciaDiariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);

			this.getAsistenciaDiariasFK_IdEmpresa();

			this.inicializarActualizarBindingAsistenciaDiaria(false);

			//if(AsistenciaDiariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);

			this.getAsistenciaDiariasFK_IdEstructura();

			this.inicializarActualizarBindingAsistenciaDiaria(false);

			//if(AsistenciaDiariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraSeccionAsistenciaDiariaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);

			this.getAsistenciaDiariasFK_IdEstructuraSeccion();

			this.inicializarActualizarBindingAsistenciaDiaria(false);

			//if(AsistenciaDiariaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciadiariaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAsistenciaDiaria() {
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.setVisible(false);	    			
			this.jInternalFrameDetalleFormAsistenciaDiaria.dispose();
			this.jInternalFrameDetalleFormAsistenciaDiaria=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
			this.jInternalFrameReporteDinamicoAsistenciaDiaria.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAsistenciaDiaria.dispose();
			this.jInternalFrameReporteDinamicoAsistenciaDiaria=null;
		}
		
		if(this.jInternalFrameImportacionAsistenciaDiaria!=null) {
			this.jInternalFrameImportacionAsistenciaDiaria.setVisible(false);	    			
			this.jInternalFrameImportacionAsistenciaDiaria.dispose();
			this.jInternalFrameImportacionAsistenciaDiaria=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAsistenciaDiaria();
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
			
			if(sTipo.equals("NuevoAsistenciaDiaria")) {
				jButtonNuevoAsistenciaDiariaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAsistenciaDiaria")) {
				jButtonDuplicarAsistenciaDiariaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAsistenciaDiaria")) {
				jButtonCopiarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("VerFormAsistenciaDiaria")) {
				jButtonVerFormAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAsistenciaDiaria")) {
				jButtonNuevoAsistenciaDiariaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAsistenciaDiaria")) {
				jButtonDuplicarAsistenciaDiariaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAsistenciaDiaria")) {
				jButtonNuevoAsistenciaDiariaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAsistenciaDiaria")) {
				jButtonDuplicarAsistenciaDiariaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAsistenciaDiaria")) {
				jButtonNuevoAsistenciaDiariaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAsistenciaDiaria")) {
				jButtonNuevoAsistenciaDiariaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAsistenciaDiaria")) {
				jButtonNuevoAsistenciaDiariaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAsistenciaDiaria")) {
				jButtonModificarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAsistenciaDiaria")) {
				jButtonModificarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAsistenciaDiaria")) {
				jButtonModificarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAsistenciaDiaria")) {
				jButtonActualizarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAsistenciaDiaria")) {
				jButtonActualizarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAsistenciaDiaria")) {
				jButtonActualizarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("EliminarAsistenciaDiaria")) {
				jButtonEliminarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAsistenciaDiaria")) {
				jButtonEliminarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAsistenciaDiaria")) {
				jButtonEliminarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("CancelarAsistenciaDiaria")) {
				jButtonCancelarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAsistenciaDiaria")) {
				jButtonCancelarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAsistenciaDiaria")) {
				jButtonCancelarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("CerrarAsistenciaDiaria")) {
				jButtonCerrarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAsistenciaDiaria")) {
				jButtonCerrarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAsistenciaDiaria")) {
				jButtonCerrarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAsistenciaDiaria")) {
				jButtonMostrarOcultarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAsistenciaDiaria")) {
				jButtonCancelarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAsistenciaDiaria")) {
				jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAsistenciaDiaria")) {
				jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAsistenciaDiaria")) {
				jButtonCopiarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAsistenciaDiaria")) {
				jButtonVerFormAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAsistenciaDiaria")) {
				jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAsistenciaDiaria")) {
				jButtonCopiarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAsistenciaDiaria")) {
				jButtonVerFormAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAsistenciaDiaria")) {
				jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAsistenciaDiaria")) {
				jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAsistenciaDiaria")) {
				jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAsistenciaDiaria")) {
				jButtonRecargarInformacionAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAsistenciaDiaria")) {
				jButtonRecargarInformacionAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAsistenciaDiaria")) {
				jButtonRecargarInformacionAsistenciaDiariaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAsistenciaDiaria")) {
				jButtonAnterioresAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAsistenciaDiaria")) {
				jButtonAnterioresAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAsistenciaDiaria")) {
				jButtonAnterioresAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAsistenciaDiaria")) {
				jButtonSiguientesAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAsistenciaDiaria")) {
				jButtonSiguientesAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAsistenciaDiaria")) {
				jButtonSiguientesAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAsistenciaDiaria") || sTipo.equals("MenuItemDetalleAbrirOrderByAsistenciaDiaria")) {
				jButtonAbrirOrderByAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAsistenciaDiaria") || sTipo.equals("MenuItemDetalleMostrarOcultarAsistenciaDiaria")) {
				jButtonMostrarOcultarAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAsistenciaDiaria")) {
				jButtonNuevoGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAsistenciaDiaria")) {
				jButtonNuevoGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAsistenciaDiaria")) {
				jButtonNuevoGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAsistenciaDiaria")) {
				jButtonCerrarReporteDinamicoAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAsistenciaDiaria")) {
				jButtonGenerarReporteDinamicoAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAsistenciaDiaria")) {
				
				jButtonGenerarExcelReporteDinamicoAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAsistenciaDiaria")) {
				jButtonCerrarImportacionAsistenciaDiariaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAsistenciaDiaria")) {
				
				jButtonGenerarImportacionAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAsistenciaDiaria")) {
				
				jButtonAbrirImportacionAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAsistenciaDiaria")) {
				jComboBoxTiposAccionesAsistenciaDiariaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAsistenciaDiaria")) {
				jComboBoxTiposRelacionesAsistenciaDiariaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAsistenciaDiaria")) {
				jComboBoxTiposAccionesAsistenciaDiariaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAsistenciaDiaria")) {
				
				jComboBoxTiposSeleccionarAsistenciaDiariaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAsistenciaDiaria")) {
				jTextFieldValorCampoGeneralAsistenciaDiariaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAsistenciaDiaria")) {
				jButtonAbrirOrderByAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAsistenciaDiaria")) {
				jButtonAbrirOrderByAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAsistenciaDiaria")) {
				jButtonCerrarOrderByAsistenciaDiariaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAsistenciaDiariaBusqueda")) {
				this.jButtonidAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAsistenciaDiariaUpdate")) {
				this.jButtonid_empresaAsistenciaDiariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAsistenciaDiariaBusqueda")) {
				this.jButtonid_empresaAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaDiaria")) {
				this.jButtonid_empleadoAsistenciaDiariaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaDiariaUpdate")) {
				this.jButtonid_empleadoAsistenciaDiariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaDiariaBusqueda")) {
				this.jButtonid_empleadoAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraAsistenciaDiariaUpdate")) {
				this.jButtonid_estructuraAsistenciaDiariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraAsistenciaDiariaBusqueda")) {
				this.jButtonid_estructuraAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructura_seccionAsistenciaDiariaUpdate")) {
				this.jButtonid_estructura_seccionAsistenciaDiariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructura_seccionAsistenciaDiariaBusqueda")) {
				this.jButtonid_estructura_seccionAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAsistenciaDiariaBusqueda")) {
				this.jButtonfechaAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaAsistenciaDiariaBusqueda")) {
				this.jButtonhoraAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_atrasoAsistenciaDiariaBusqueda")) {
				this.jButtonhoras_atrasoAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_faltaAsistenciaDiariaBusqueda")) {
				this.jButtonhoras_faltaAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_permisoAsistenciaDiariaBusqueda")) {
				this.jButtonhoras_permisoAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra25AsistenciaDiariaBusqueda")) {
				this.jButtonhoras_extra25AsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra50AsistenciaDiariaBusqueda")) {
				this.jButtonhoras_extra50AsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra100AsistenciaDiariaBusqueda")) {
				this.jButtonhoras_extra100AsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionAsistenciaDiariaBusqueda")) {
				this.jButtondescripcionAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoAsistenciaDiaria")) {
				this.jButtonid_empleadoAsistenciaDiariaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoAsistenciaDiaria")) {
				this.jButtonFK_IdEmpleadoAsistenciaDiariaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraAsistenciaDiaria")) {
				this.jButtonFK_IdEstructuraAsistenciaDiariaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraSeccionAsistenciaDiaria")) {
				this.jButtonFK_IdEstructuraSeccionAsistenciaDiariaActionPerformed(evt);
			}
			
			;
			
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAsistenciaDiaria();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaDiariaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				


				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AsistenciaDiaria asistenciadiariaLocal=null;
			
			if(!this.getEsControlTabla()) {
				asistenciadiariaLocal=this.asistenciadiaria;
			} else {
				asistenciadiariaLocal=this.asistenciadiariaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
							
				
				


				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
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
			
			


			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaDiariaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
								
						
				


				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
								
				
				


				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
							
				
				


				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaDiariaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
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
			
			


			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
								
				
				


				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaDiariaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAsistenciaDiaria")) {
					jCheckBoxSeleccionarTodosAsistenciaDiariaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAsistenciaDiaria")) {
					jCheckBoxSeleccionadosAsistenciaDiariaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAsistenciaDiaria")) {
					
				}
				
				


				
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
												
				
				


				
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaDiariaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaDiariaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
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
			
			


			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaDiariaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciadiaria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciadiaria);
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
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
				
				


				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaDiaria.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaDiaria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaDiariaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciadiariaAnterior =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAsistenciaDiaria")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAsistenciaDiariaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAsistenciaDiaria.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.asistenciadiaria =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.asistenciadiaria);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAsistenciaDiaria")) {
				
				}
				
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAsistenciaDiaria")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAsistenciaDiaria.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAsistenciaDiaria")) {
			
			}
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAsistenciaDiaria();
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
			if(sTipo.equals("NuevoAsistenciaDiaria")) {
				jButtonNuevoAsistenciaDiariaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAsistenciaDiaria")) {
				jButtonDuplicarAsistenciaDiariaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAsistenciaDiaria")) {
				jButtonCopiarAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAsistenciaDiaria")) {
				jButtonVerFormAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAsistenciaDiaria")) {
				jButtonNuevoAsistenciaDiariaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAsistenciaDiaria")) {
				jButtonModificarAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAsistenciaDiaria")) {
				jButtonActualizarAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAsistenciaDiaria")) {
				jButtonEliminarAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAsistenciaDiaria")) {
				jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAsistenciaDiaria")) {
				jButtonCancelarAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAsistenciaDiaria")) {
				jButtonCerrarAsistenciaDiariaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAsistenciaDiaria")) {
				jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAsistenciaDiaria")) {
				jButtonNuevoGuardarCambiosAsistenciaDiariaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAsistenciaDiaria")) {
				jButtonAbrirOrderByAsistenciaDiariaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAsistenciaDiaria")) {
				jButtonRecargarInformacionAsistenciaDiariaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAsistenciaDiaria")) {
				jButtonAnterioresAsistenciaDiariaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAsistenciaDiaria")) {
				jButtonSiguientesAsistenciaDiariaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAsistenciaDiariaBusqueda")) {
				this.jButtonidAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAsistenciaDiariaUpdate")) {
				this.jButtonid_empresaAsistenciaDiariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAsistenciaDiariaBusqueda")) {
				this.jButtonid_empresaAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaDiaria")) {
				this.jButtonid_empleadoAsistenciaDiariaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaDiariaUpdate")) {
				this.jButtonid_empleadoAsistenciaDiariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaDiariaBusqueda")) {
				this.jButtonid_empleadoAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraAsistenciaDiariaUpdate")) {
				this.jButtonid_estructuraAsistenciaDiariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraAsistenciaDiariaBusqueda")) {
				this.jButtonid_estructuraAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructura_seccionAsistenciaDiariaUpdate")) {
				this.jButtonid_estructura_seccionAsistenciaDiariaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructura_seccionAsistenciaDiariaBusqueda")) {
				this.jButtonid_estructura_seccionAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAsistenciaDiariaBusqueda")) {
				this.jButtonfechaAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaAsistenciaDiariaBusqueda")) {
				this.jButtonhoraAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_atrasoAsistenciaDiariaBusqueda")) {
				this.jButtonhoras_atrasoAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_faltaAsistenciaDiariaBusqueda")) {
				this.jButtonhoras_faltaAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_permisoAsistenciaDiariaBusqueda")) {
				this.jButtonhoras_permisoAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra25AsistenciaDiariaBusqueda")) {
				this.jButtonhoras_extra25AsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra50AsistenciaDiariaBusqueda")) {
				this.jButtonhoras_extra50AsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_extra100AsistenciaDiariaBusqueda")) {
				this.jButtonhoras_extra100AsistenciaDiariaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionAsistenciaDiariaBusqueda")) {
				this.jButtondescripcionAsistenciaDiariaBusquedaActionPerformed(evt);
			}
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAsistenciaDiaria();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAsistenciaDiaria")) {
				closingInternalFrameAsistenciaDiaria();
				
			} else if(sTipo.equals("jButtonCancelarAsistenciaDiaria")) {
				JInternalFrameBase jInternalFrameDetalleFormAsistenciaDiaria = (JInternalFrameBase)evt.getSource();
	            	
	            AsistenciaDiariaBeanSwingJInternalFrame jInternalFrameParent=(AsistenciaDiariaBeanSwingJInternalFrame)jInternalFrameDetalleFormAsistenciaDiaria.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAsistenciaDiariaActionPerformed(null);
			}
			
			AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.asistenciadiaria,new Object(),this.asistenciadiariaParameterGeneral,this.asistenciadiariaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAsistenciaDiaria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAsistenciaDiaria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAsistenciaDiaria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.asistenciadiaria)) {
			if(!esControlTabla) {
				if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);			
				}
				
				if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAsistenciaDiaria(this.asistenciadiaria,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.asistenciadiariaReturnGeneral=asistenciadiariaLogic.procesarEventosAsistenciaDiariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciadiariaLogic.getAsistenciaDiarias(),this.asistenciadiaria,this.asistenciadiariaParameterGeneral,this.isEsNuevoAsistenciaDiaria,classes);//this.asistenciadiariaLogic.getAsistenciaDiaria()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAsistenciaDiaria(this.asistenciadiariaReturnGeneral,this.asistenciadiariaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAsistenciaDiaria(classes,this.asistenciadiariaReturnGeneral,this.asistenciadiariaBean,false);
					}
						
					if(this.asistenciadiariaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaDiaria(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAsistenciaDiaria(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria());	
					}
						
					if(this.asistenciadiariaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAsistenciaDiaria(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria(),classes);//this.asistenciadiariaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAsistenciaDiaria(this.asistenciadiaria,classes);//this.asistenciadiariaBean);									
				}
			
				if(AsistenciaDiariaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAsistenciaDiaria(this.asistenciadiaria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaDiaria(this.asistenciadiaria);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.asistenciadiariaAnterior!=null) {
						this.asistenciadiaria=this.asistenciadiariaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.asistenciadiariaReturnGeneral=asistenciadiariaLogic.procesarEventosAsistenciaDiariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciadiariaLogic.getAsistenciaDiarias(),this.asistenciadiaria,this.asistenciadiariaParameterGeneral,this.isEsNuevoAsistenciaDiaria,classes);//this.asistenciadiariaLogic.getAsistenciaDiaria()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.asistenciadiariaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.asistenciadiariaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria(),asistenciadiariaLogic.getAsistenciaDiarias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria(),this.asistenciadiarias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAsistenciaDiaria.repaint();
				
				//((AbstractTableModel) this.jTableDatosAsistenciaDiaria.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAsistenciaDiaria();
			}
		}
	}
	
	public void actualizarVisualTableDatosAsistenciaDiaria() throws Exception {
		
		AsistenciaDiariaModel asistenciadiariaModel=(AsistenciaDiariaModel)this.jTableDatosAsistenciaDiaria.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciadiariaModel.asistenciadiarias=this.asistenciadiariaLogic.getAsistenciaDiarias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			asistenciadiariaModel.asistenciadiarias=this.asistenciadiarias;
		}
		
		
		((AsistenciaDiariaModel) this.jTableDatosAsistenciaDiaria.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAsistenciaDiaria() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getasistenciadiariaAnterior(),this.asistenciadiariaLogic.getAsistenciaDiarias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getasistenciadiariaAnterior(),this.asistenciadiarias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAsistenciaDiaria();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
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
										
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciadiaria,new Object(),generalEntityParameterGeneral,this.asistenciadiariaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.asistenciadiariaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AsistenciaDiariaConstantesFunciones.getClassesRelationshipsOfAsistenciaDiaria(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AsistenciaDiariaConstantesFunciones.getClassesRelationshipsFromStringsOfAsistenciaDiaria(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAsistenciaDiaria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AsistenciaDiariaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciadiaria,new Object(),generalEntityParameterGeneral,this.asistenciadiariaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAsistenciaDiaria(AsistenciaDiariaBean asistenciadiariaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAsistenciaDiaria(ArrayList<Classe> classes,AsistenciaDiariaReturnGeneral asistenciadiariaReturnGeneral,AsistenciaDiariaBean asistenciadiariaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.asistenciadiaria)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAsistenciaDiaria = new AsistenciaDiariaDetalleFormJInternalFrame(jDesktopPane,this.asistenciadiariaSessionBean.getConGuardarRelaciones(),this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.setVisible(false);
		this.jInternalFrameDetalleFormAsistenciaDiaria.setSelected(false);						
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.asistenciadiariaLogic=this.asistenciadiariaLogic;
		
		this.cargarCombosFrameForeignKeyAsistenciaDiaria("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAsistenciaDiaria();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAsistenciaDiaria();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAsistenciaDiaria("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAsistenciaDiaria();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAsistenciaDiaria"));
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"ModificarAsistenciaDiaria"));

		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarToolBarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"ModificarToolBarAsistenciaDiaria"));
					
		this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemModificarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"MenuItemModificarAsistenciaDiaria"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"ActualizarAsistenciaDiaria"));
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarToolBarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAsistenciaDiaria"));
						
		this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemActualizarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAsistenciaDiaria"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"EliminarAsistenciaDiaria"));
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"EliminarToolBarAsistenciaDiaria"));
								
		this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemEliminarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAsistenciaDiaria"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"CancelarAsistenciaDiaria"));
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"CancelarToolBarAsistenciaDiaria"));
					
		this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemCancelarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAsistenciaDiaria"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemDetalleCerrarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAsistenciaDiaria"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaDiaria"));
		
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaDiaria"));
		
		
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAsistenciaDiaria"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonidAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empresaAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empresaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaDiariaBusqueda"));
		//jButtonid_empleadoAsistenciaDiaria.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAsistenciaDiariaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiaria"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructuraAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructuraAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructura_seccionAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_seccionAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_seccionAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonfechaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoraAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_atrasoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_atrasoAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_faltaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_faltaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_permisoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_permisoAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra25AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra25AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra50AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra50AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra100AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra100AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtondescripcionAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAsistenciaDiariaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAsistenciaDiaria"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAsistenciaDiaria"));
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAsistenciaDiaria"));
		}
		
		this.jTableDatosAsistenciaDiaria.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAsistenciaDiaria"));
		
		this.jTableDatosAsistenciaDiaria.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAsistenciaDiaria"));
		
		this.jButtonNuevoAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"NuevoAsistenciaDiaria"));
		
		this.jButtonDuplicarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"DuplicarAsistenciaDiaria"));
		
		this.jButtonCopiarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"CopiarAsistenciaDiaria"));
		
		this.jButtonVerFormAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"VerFormAsistenciaDiaria"));
		
		
		this.jButtonNuevoToolBarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"NuevoToolBarAsistenciaDiaria"));
			
		this.jButtonDuplicarToolBarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAsistenciaDiaria"));
			
		this.jMenuItemNuevoAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAsistenciaDiaria"));
			
		this.jMenuItemDuplicarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAsistenciaDiaria"));		
		
		
		this.jButtonNuevoRelacionesAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAsistenciaDiaria"));
		
		
		this.jButtonNuevoRelacionesToolBarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAsistenciaDiaria"));
			
		this.jMenuItemNuevoRelacionesAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAsistenciaDiaria"));		
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"ModificarAsistenciaDiaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonModificarToolBarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"ModificarToolBarAsistenciaDiaria"));
			
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemModificarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"MenuItemModificarAsistenciaDiaria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"ActualizarAsistenciaDiaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonActualizarToolBarAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAsistenciaDiaria"));
				
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemActualizarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAsistenciaDiaria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"EliminarAsistenciaDiaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonEliminarToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"EliminarToolBarAsistenciaDiaria"));
						
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemEliminarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAsistenciaDiaria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"CancelarAsistenciaDiaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonCancelarToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"CancelarToolBarAsistenciaDiaria"));
			
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemCancelarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAsistenciaDiaria"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAsistenciaDiaria"));		
		
		
		this.jButtonCerrarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"CerrarAsistenciaDiaria"));
		
		
		this.jButtonCerrarToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"CerrarToolBarAsistenciaDiaria"));
			
		this.jMenuItemCerrarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAsistenciaDiaria"));
			
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jMenuItemDetalleCerrarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAsistenciaDiaria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosAsistenciaDiaria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaDiaria"));
		}
		
		this.jButtonCopiarToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"CopiarToolBarAsistenciaDiaria"));
			
		this.jButtonVerFormToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"VerFormToolBarAsistenciaDiaria"));
		
		this.jMenuItemGuardarCambiosAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAsistenciaDiaria"));
			
		this.jMenuItemCopiarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAsistenciaDiaria"));		
		
		this.jMenuItemVerFormAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAsistenciaDiaria"));		
		
		
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAsistenciaDiaria"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAsistenciaDiaria"));
			
		this.jMenuItemGuardarCambiosTablaAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAsistenciaDiaria"));		
		
		
		
		this.jButtonRecargarInformacionAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"RecargarInformacionAsistenciaDiaria"));
					
		this.jButtonRecargarInformacionToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAsistenciaDiaria"));
		
		this.jMenuItemRecargarInformacionAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAsistenciaDiaria"));		
		
		
		
		this.jButtonAnterioresAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"AnterioresAsistenciaDiaria"));
		
		
		this.jButtonAnterioresToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAsistenciaDiaria"));
		
		this.jMenuItemAnterioresAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAsistenciaDiaria"));		
		
		
		this.jButtonSiguientesAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"SiguientesAsistenciaDiaria"));
		
		
		this.jButtonSiguientesToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAsistenciaDiaria"));
			
		this.jMenuItemSiguientesAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAsistenciaDiaria"));
			
		this.jMenuItemAbrirOrderByAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAsistenciaDiaria"));
			
		this.jMenuItemMostrarOcultarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAsistenciaDiaria"));
			
		this.jMenuItemDetalleAbrirOrderByAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAsistenciaDiaria"));
			
		this.jMenuItemDetalleMostarOcultarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAsistenciaDiaria"));		
		
		
		this.jButtonNuevoGuardarCambiosAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAsistenciaDiaria"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAsistenciaDiaria"));
			
		this.jMenuItemNuevoGuardarCambiosAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAsistenciaDiaria"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAsistenciaDiaria.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAsistenciaDiaria"));

		this.jCheckBoxSeleccionadosAsistenciaDiaria.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAsistenciaDiaria"));
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAsistenciaDiaria"));
		}
		
		
		this.jComboBoxTiposRelacionesAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"TiposRelacionesAsistenciaDiaria"));
			
		this.jComboBoxTiposAccionesAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"TiposAccionesAsistenciaDiaria"));
					
		this.jComboBoxTiposSeleccionarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAsistenciaDiaria"));
			
		this.jTextFieldValorCampoGeneralAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAsistenciaDiaria"));		
		
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonidAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empresaAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empresaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaDiariaBusqueda"));
		//jButtonid_empleadoAsistenciaDiaria.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAsistenciaDiariaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiaria"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructuraAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructuraAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructura_seccionAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_seccionAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_seccionAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonfechaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoraAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_atrasoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_atrasoAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_faltaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_faltaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_permisoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_permisoAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra25AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra25AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra50AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra50AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra100AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra100AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtondescripcionAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAsistenciaDiariaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAsistenciaDiaria"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiaria"));

			this.jButtonFK_IdEstructuraAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraAsistenciaDiaria"));

			this.jButtonFK_IdEstructuraSeccionAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSeccionAsistenciaDiaria"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAsistenciaDiaria!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaDiaria"));
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaDiaria"));
				this.jInternalFrameReporteDinamicoAsistenciaDiaria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaDiaria"));
			}
			
			//this.jButtonCerrarReporteDinamicoAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaDiaria"));				
			//this.jButtonGenerarReporteDinamicoAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaDiaria"));
			//this.jButtonGenerarExcelReporteDinamicoAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaDiaria"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAsistenciaDiaria!=null) {
				this.jInternalFrameImportacionAsistenciaDiaria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAsistenciaDiaria"));
				this.jInternalFrameImportacionAsistenciaDiaria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAsistenciaDiaria"));
				this.jInternalFrameImportacionAsistenciaDiaria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAsistenciaDiaria"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"AbrirOrderByAsistenciaDiaria"));
			
			this.jButtonAbrirOrderByToolBarAsistenciaDiaria.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAsistenciaDiaria"));			
			
			if(this.jInternalFrameOrderByAsistenciaDiaria!=null) {
				this.jInternalFrameOrderByAsistenciaDiaria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAsistenciaDiaria"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaDiaria.jTabbedPaneRelacionesAsistenciaDiaria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAsistenciaDiaria"));
		
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
            		closingInternalFrameAsistenciaDiaria();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAsistenciaDiaria = (JInternalFrameBase)event.getSource();
	            	
	            AsistenciaDiariaBeanSwingJInternalFrame jInternalFrameParent=(AsistenciaDiariaBeanSwingJInternalFrame)jInternalFrameDetalleFormAsistenciaDiaria.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAsistenciaDiariaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAsistenciaDiaria.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAsistenciaDiariaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAsistenciaDiaria.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAsistenciaDiaria.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaDiariaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaDiariaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaDiariaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAsistenciaDiaria";
		inputMap = this.jButtonNuevoAsistenciaDiaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAsistenciaDiaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAsistenciaDiariaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaDiariaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaDiariaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaDiariaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAsistenciaDiaria";
		inputMap = this.jButtonNuevoRelacionesAsistenciaDiaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAsistenciaDiaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAsistenciaDiariaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAsistenciaDiaria";
		inputMap = this.jButtonModificarAsistenciaDiaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAsistenciaDiaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAsistenciaDiariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAsistenciaDiaria";
		inputMap = this.jButtonActualizarAsistenciaDiaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAsistenciaDiaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAsistenciaDiariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAsistenciaDiaria";
		inputMap = this.jButtonEliminarAsistenciaDiaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAsistenciaDiaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAsistenciaDiariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAsistenciaDiaria";
		inputMap = this.jButtonCancelarAsistenciaDiaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAsistenciaDiaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAsistenciaDiariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAsistenciaDiaria";
		inputMap = this.jButtonCerrarAsistenciaDiaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAsistenciaDiaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAsistenciaDiariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAsistenciaDiaria";
		inputMap = this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosAsistenciaDiaria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonGuardarCambiosAsistenciaDiaria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAsistenciaDiariaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAsistenciaDiaria.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAsistenciaDiariaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAsistenciaDiaria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAsistenciaDiariaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAsistenciaDiaria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAsistenciaDiariaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAsistenciaDiaria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAsistenciaDiariaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonidAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empresaAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empresaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaDiariaBusqueda"));
		//jButtonid_empleadoAsistenciaDiaria.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAsistenciaDiariaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiaria"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructuraAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructuraAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraAsistenciaDiariaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructura_seccionAsistenciaDiariaUpdate.addActionListener(new ButtonActionListener(this,"id_estructura_seccionAsistenciaDiariaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_estructura_seccionAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructura_seccionAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonfechaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoraAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_atrasoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_atrasoAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_faltaAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_faltaAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_permisoAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_permisoAsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra25AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra25AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra50AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra50AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonhoras_extra100AsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"horas_extra100AsistenciaDiariaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaDiaria.jButtondescripcionAsistenciaDiariaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionAsistenciaDiariaBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAsistenciaDiaria"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaDiaria"));

		this.jButtonFK_IdEstructuraAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraAsistenciaDiaria"));

		this.jButtonFK_IdEstructuraSeccionAsistenciaDiaria.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSeccionAsistenciaDiaria"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAsistenciaDiaria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAsistenciaDiariaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAsistenciaDiariaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAsistenciaDiaria.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAsistenciaDiaria(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
					asistenciadiariaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaDiaria asistenciadiariaAux:asistenciadiarias) {
					asistenciadiariaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAsistenciaDiariaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
						asistenciadiariaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaDiaria asistenciadiariaAux:asistenciadiarias) {
						asistenciadiariaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaDiaria asistenciadiariaAux:asistenciadiarias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAsistenciaDiaria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAsistenciaDiaria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAsistenciaDiariaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAsistenciaDiaria.getSelectedRows();
			
			AsistenciaDiaria asistenciadiariaLocal=new AsistenciaDiaria();
			
			//this.seleccionarTodosAsistenciaDiaria(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciadiariaLocal =(AsistenciaDiaria) this.asistenciadiariaLogic.getAsistenciaDiarias().toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					asistenciadiariaLocal =(AsistenciaDiaria) this.asistenciadiarias.toArray()[this.jTableDatosAsistenciaDiaria.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				asistenciadiariaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
						asistenciadiariaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaDiaria asistenciadiariaAux:asistenciadiarias) {
						asistenciadiariaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAsistenciaDiaria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAsistenciaDiaria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaDiaria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAsistenciaDiariaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAsistenciaDiariaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAsistenciaDiariaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAsistenciaDiaria.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiariaLogic.getAsistenciaDiarias()) {
				
						if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							asistenciadiariaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORA)) {
							existe=true;
							asistenciadiariaAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO)) {
							existe=true;
							asistenciadiariaAux.sethoras_atraso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA)) {
							existe=true;
							asistenciadiariaAux.sethoras_falta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO)) {
							existe=true;
							asistenciadiariaAux.sethoras_permiso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25)) {
							existe=true;
							asistenciadiariaAux.sethoras_extra25(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50)) {
							existe=true;
							asistenciadiariaAux.sethoras_extra50(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100)) {
							existe=true;
							asistenciadiariaAux.sethoras_extra100(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							asistenciadiariaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaDiaria asistenciadiariaAux:asistenciadiarias) {
					
						if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							asistenciadiariaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORA)) {
							existe=true;
							asistenciadiariaAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO)) {
							existe=true;
							asistenciadiariaAux.sethoras_atraso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA)) {
							existe=true;
							asistenciadiariaAux.sethoras_falta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO)) {
							existe=true;
							asistenciadiariaAux.sethoras_permiso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25)) {
							existe=true;
							asistenciadiariaAux.sethoras_extra25(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50)) {
							existe=true;
							asistenciadiariaAux.sethoras_extra50(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100)) {
							existe=true;
							asistenciadiariaAux.sethoras_extra100(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							asistenciadiariaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAsistenciaDiariaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAsistenciaDiaria=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAsistenciaDiaria.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAsistenciaDiaria) {				
					conSplash=true;//false;										
					
					//this.startProcessAsistenciaDiaria(conSplash);
				
					this.generarReporteAsistenciaDiariasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAsistenciaDiariasSeleccionados();
				//this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAsistenciaDiariasSeleccionados(false);
				//this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAsistenciaDiariasSeleccionados(true);
				//this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAsistenciaDiaria();
				
				this.exportarAsistenciaDiariasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAsistenciaDiarias();
				//this.importarAsistenciaDiarias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAsistenciaDiaria();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAsistenciaDiariasSeleccionados();
				//this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Asistencia Diaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAsistenciaDiaria();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAsistenciaDiaria)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAsistenciaDiaria(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setSelectedIndex(0);					
				}	
			} 			
			else if(AsistenciaDiariaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAsistenciaDiaria) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAsistenciaDiaria(conSplash);
					
						//this.actualizarParametrosGeneralAsistenciaDiaria();
						
						this.generarReporteProcesoAccionAsistenciaDiariasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AsistenciaDiariaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Asistencia DiariaS SELECCIONADOS?", "MANTENIMIENTO DE Asistencia Diaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAsistenciaDiaria();
				
						this.actualizarParametrosGeneralAsistenciaDiaria();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.asistenciadiariaReturnGeneral=asistenciadiariaLogic.procesarAccionAsistenciaDiariasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.asistenciadiariaLogic.getAsistenciaDiarias(),this.asistenciadiariaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAsistenciaDiariaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAsistenciaDiaria();
					
					AsistenciaDiariaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAsistenciaDiariaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAsistenciaDiaria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxTiposAccionesFormularioAsistenciaDiaria.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAsistenciaDiaria(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAsistenciaDiariaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAsistenciaDiaria();
			
			if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		
			AsistenciaDiaria asistenciadiaria=new AsistenciaDiaria();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAsistenciaDiaria(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAsistenciaDiaria.getSelectedItem();
			
			
			
			
			asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
			//this.sTipoAccion;
			
			if(asistenciadiariasSeleccionados.size()==1) {
				for(AsistenciaDiaria asistenciadiariaAux:asistenciadiariasSeleccionados) {
					asistenciadiaria=asistenciadiariaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAsistenciaDiaria();
			
      		//this.finishProcessAsistenciaDiaria(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAsistenciaDiariaReturnGeneral() throws Exception {
		if(this.asistenciadiariaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.asistenciadiariaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.asistenciadiariaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.asistenciadiariaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.asistenciadiariaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.asistenciadiariaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAsistenciaDiaria(false);
		}
		
		if(this.asistenciadiariaReturnGeneral.getConRetornoLista() || this.asistenciadiariaReturnGeneral.getConRetornoObjeto()) {
			if(this.asistenciadiariaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.asistenciadiariaLogic.setAsistenciaDiarias(this.asistenciadiariaReturnGeneral.getAsistenciaDiarias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.asistenciadiariaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.asistenciadiariaLogic.setAsistenciaDiaria(this.asistenciadiariaReturnGeneral.getAsistenciaDiaria());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAsistenciaDiaria(false);
		}
	}
	
	public void actualizarParametrosGeneralAsistenciaDiaria() throws Exception {
		
		
	}
	
	public ArrayList<AsistenciaDiaria> getAsistenciaDiariasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAsistenciaDiaria) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AsistenciaDiaria asistenciadiariaAux:asistenciadiariaLogic.getAsistenciaDiarias()) {
					if(asistenciadiariaAux.getIsSelected()) {
						asistenciadiariasSeleccionados.add(asistenciadiariaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaDiaria asistenciadiariaAux:this.asistenciadiarias) {
					if(asistenciadiariaAux.getIsSelected()) {
						asistenciadiariasSeleccionados.add(asistenciadiariaAux);				
					}
				}
			}
			
			if(asistenciadiariasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						asistenciadiariasSeleccionados.addAll(this.asistenciadiariaLogic.getAsistenciaDiarias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						asistenciadiariasSeleccionados.addAll(this.asistenciadiarias);				
					}
				}
			}
		} else {
			asistenciadiariasSeleccionados.add(this.asistenciadiaria);
		}
		
		return asistenciadiariasSeleccionados;
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
	
	public void generarReporteAsistenciaDiariasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAsistenciaDiariasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAsistenciaDiariasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAsistenciaDiariasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAsistenciaDiariasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Asistencia Diaria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAsistenciaDiariasSeleccionados() throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAsistenciaDiarias("Todos",asistenciadiariasSeleccionados);
		
	}	
	
	public void generarReporteNormalAsistenciaDiariasSeleccionados() throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAsistenciaDiarias("Todos",asistenciadiariasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAsistenciaDiariasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAsistenciaDiarias("Todos",asistenciadiariasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAsistenciaDiariasSeleccionados() throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAsistenciaDiaria();
		
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAsistenciaDiaria();
		
		
		//this.generarReporteAsistenciaDiarias("Todos",asistenciadiariasSeleccionados ,asistenciadiariaImplementable,asistenciadiariaImplementableHome);
	}
	
	public void mostrarImportacionAsistenciaDiarias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAsistenciaDiaria();
		
		this.abrirFrameImportacionAsistenciaDiaria();		
		
			
		//this.generarReporteAsistenciaDiarias("Todos",asistenciadiariasSeleccionados ,asistenciadiariaImplementable,asistenciadiariaImplementableHome);
	}
	
	public void importarAsistenciaDiarias() throws Exception {		
	
	}
	
	public void exportarAsistenciaDiariasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAsistenciaDiariasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAsistenciaDiariasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAsistenciaDiariasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Asistencia Diaria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAsistenciaDiariasSeleccionados() throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciadiaria."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAsistenciaDiaria(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AsistenciaDiaria asistenciadiariaAux:asistenciadiariasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAsistenciaDiaria(asistenciadiariaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//asistenciadiariaAux.setsDetalleGeneralEntityReporte(asistenciadiariaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAsistenciaDiaria(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_HORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=asistenciadiaria.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.getestructuraseccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.gethora().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.gethoras_atraso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.gethoras_falta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.gethoras_permiso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.gethoras_extra25().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.gethoras_extra50().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.gethoras_extra100().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciadiaria.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAsistenciaDiariasSeleccionados() throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciadiaria.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AsistenciaDiarias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAsistenciaDiaria(row);				
				iRow++;
			}				
			
			for(AsistenciaDiaria asistenciadiariaAux:asistenciadiariasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAsistenciaDiaria(asistenciadiariaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAsistenciaDiariasSeleccionados() throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();		
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciadiaria.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("asistenciadiarias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("asistenciadiaria");
			//elementRoot.appendChild(element);
		
			for(AsistenciaDiaria asistenciadiariaAux:asistenciadiariasSeleccionados) {
				element = document.createElement("asistenciadiaria");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAsistenciaDiaria(asistenciadiariaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Diaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAsistenciaDiaria(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASATRASO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASFALTA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASPERMISO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA25);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA50);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_HORASEXTRA100);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.getestructuraseccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.gethora());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.gethoras_atraso());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.gethoras_falta());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.gethoras_permiso());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.gethoras_extra25());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.gethoras_extra50());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.gethoras_extra100());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciadiaria.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlAsistenciaDiaria(AsistenciaDiaria asistenciadiaria,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AsistenciaDiariaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(asistenciadiaria.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AsistenciaDiariaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(asistenciadiaria.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AsistenciaDiariaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(asistenciadiaria.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(AsistenciaDiariaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(asistenciadiaria.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestructura_descripcion = document.createElement(AsistenciaDiariaConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(asistenciadiaria.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementestructuraseccion_descripcion = document.createElement(AsistenciaDiariaConstantesFunciones.IDESTRUCTURASECCION);
		elementestructuraseccion_descripcion.appendChild(document.createTextNode(asistenciadiaria.getestructuraseccion_descripcion()));
		element.appendChild(elementestructuraseccion_descripcion);

		Element elementfecha = document.createElement(AsistenciaDiariaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(asistenciadiaria.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementhora = document.createElement(AsistenciaDiariaConstantesFunciones.HORA);
		elementhora.appendChild(document.createTextNode(asistenciadiaria.gethora().toString().trim()));
		element.appendChild(elementhora);

		Element elementhoras_atraso = document.createElement(AsistenciaDiariaConstantesFunciones.HORASATRASO);
		elementhoras_atraso.appendChild(document.createTextNode(asistenciadiaria.gethoras_atraso().toString().trim()));
		element.appendChild(elementhoras_atraso);

		Element elementhoras_falta = document.createElement(AsistenciaDiariaConstantesFunciones.HORASFALTA);
		elementhoras_falta.appendChild(document.createTextNode(asistenciadiaria.gethoras_falta().toString().trim()));
		element.appendChild(elementhoras_falta);

		Element elementhoras_permiso = document.createElement(AsistenciaDiariaConstantesFunciones.HORASPERMISO);
		elementhoras_permiso.appendChild(document.createTextNode(asistenciadiaria.gethoras_permiso().toString().trim()));
		element.appendChild(elementhoras_permiso);

		Element elementhoras_extra25 = document.createElement(AsistenciaDiariaConstantesFunciones.HORASEXTRA25);
		elementhoras_extra25.appendChild(document.createTextNode(asistenciadiaria.gethoras_extra25().toString().trim()));
		element.appendChild(elementhoras_extra25);

		Element elementhoras_extra50 = document.createElement(AsistenciaDiariaConstantesFunciones.HORASEXTRA50);
		elementhoras_extra50.appendChild(document.createTextNode(asistenciadiaria.gethoras_extra50().toString().trim()));
		element.appendChild(elementhoras_extra50);

		Element elementhoras_extra100 = document.createElement(AsistenciaDiariaConstantesFunciones.HORASEXTRA100);
		elementhoras_extra100.appendChild(document.createTextNode(asistenciadiaria.gethoras_extra100().toString().trim()));
		element.appendChild(elementhoras_extra100);

		Element elementdescripcion = document.createElement(AsistenciaDiariaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(asistenciadiaria.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoAsistenciaDiariasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados=new ArrayList<AsistenciaDiaria>();
		
		asistenciadiariasSeleccionados=this.getAsistenciaDiariasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAsistenciaDiaria(asistenciadiariasSeleccionados);
		
		this.generarReporteAsistenciaDiarias("Todos",asistenciadiariasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAsistenciaDiaria(ArrayList<AsistenciaDiaria> asistenciadiariasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AsistenciaDiaria asistenciadiariaAux:asistenciadiariasSeleccionados) {
				asistenciadiariaAux.setsDetalleGeneralEntityReporte(asistenciadiariaAux.toString());
			
				if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					asistenciadiariaAux.setsDescripcionGeneralEntityReporte1(asistenciadiariaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					asistenciadiariaAux.setsDescripcionGeneralEntityReporte1(asistenciadiariaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					asistenciadiariaAux.setsDescripcionGeneralEntityReporte1(asistenciadiariaAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_IDESTRUCTURASECCION)) {
					existe=true;
					asistenciadiariaAux.setsDescripcionGeneralEntityReporte1(asistenciadiariaAux.getestructuraseccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					asistenciadiariaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(asistenciadiariaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_HORA)) {
					existe=true;
					asistenciadiariaAux.setsDescripcionGeneralEntityReporte1(asistenciadiariaAux.gethora().toString());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaDiariaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					asistenciadiariaAux.setsDescripcionGeneralEntityReporte1(asistenciadiariaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaDiariaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAsistenciaDiaria(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAsistenciaDiaria=true;
				this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=true;
				this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=true;
			}
			
			this.isVisibilidadCeldaModificarAsistenciaDiaria=false;
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=false;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=false;
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=false;
			this.isVisibilidadCeldaModificarAsistenciaDiaria=false;
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=true;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=false;
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=false;
			this.isVisibilidadCeldaModificarAsistenciaDiaria=false;
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=true;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=true;
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=false;
			this.isVisibilidadCeldaModificarAsistenciaDiaria=false;
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=true;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=false;
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=true;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=true;
			this.isVisibilidadCeldaModificarAsistenciaDiaria=false;
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=false;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=false;
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=false;
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=false;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=false;
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=false;
			this.isVisibilidadCeldaModificarAsistenciaDiaria=true;
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=false;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=false;
			this.isVisibilidadCeldaCancelarAsistenciaDiaria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaDiaria=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=true;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=true;
		} else {
			this.actualizarEstadoPanelsAsistenciaDiaria(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAsistenciaDiaria=false;
			//this.isVisibilidadCeldaVerFormAsistenciaDiaria=false;
			this.isVisibilidadCeldaDuplicarAsistenciaDiaria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!asistenciadiariaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
		} else {
			this.isVisibilidadCeldaNuevoAsistenciaDiaria=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaDiaria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			if(!asistenciadiariaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;												
			}
			
			this.jButtonCerrarAsistenciaDiaria.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaDiaria=false;
		}
		
		if(!this.permiteMantenimiento(this.asistenciadiaria)) {
			this.isVisibilidadCeldaActualizarAsistenciaDiaria=false;
			this.isVisibilidadCeldaEliminarAsistenciaDiaria=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAsistenciaDiaria() {
	}
	
	public void actualizarEstadoPanelsAsistenciaDiaria(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAsistenciaDiaria!=null) {
				this.jScrollPanelDatosEdicionAsistenciaDiaria.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaDiaria!=null) {
				this.jScrollPanelDatosAsistenciaDiaria.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaDiaria!=null) {
				this.jPanelPaginacionAsistenciaDiaria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAsistenciaDiaria!=null) {
				this.jScrollPanelDatosEdicionAsistenciaDiaria.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAsistenciaDiaria!=null) {
				this.jScrollPanelDatosAsistenciaDiaria.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaDiaria!=null) {
				this.jPanelPaginacionAsistenciaDiaria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAsistenciaDiaria!=null) {
				this.jScrollPanelDatosEdicionAsistenciaDiaria.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaDiaria!=null) {
				this.jScrollPanelDatosAsistenciaDiaria.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaDiaria!=null) {
				this.jPanelPaginacionAsistenciaDiaria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAsistenciaDiaria!=null) {
				this.jScrollPanelDatosEdicionAsistenciaDiaria.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaDiaria!=null) {
				this.jScrollPanelDatosAsistenciaDiaria.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaDiaria!=null) {
				this.jPanelPaginacionAsistenciaDiaria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAsistenciaDiaria!=null) {
				this.jScrollPanelDatosEdicionAsistenciaDiaria.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaDiaria!=null) {
				this.jScrollPanelDatosAsistenciaDiaria.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaDiaria!=null) {
				this.jPanelPaginacionAsistenciaDiaria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAsistenciaDiaria!=null) {
				this.jScrollPanelDatosEdicionAsistenciaDiaria.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaDiaria!=null) {
				this.jScrollPanelDatosAsistenciaDiaria.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaDiaria!=null) {
				this.jPanelPaginacionAsistenciaDiaria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAsistenciaDiaria!=null) {
				this.jScrollPanelDatosEdicionAsistenciaDiaria.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaDiaria!=null) {
				this.jScrollPanelDatosAsistenciaDiaria.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaDiaria!=null) {
				this.jPanelPaginacionAsistenciaDiaria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
					this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaDiaria!=null) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAsistenciaDiaria!=null) {
				this.jPanelParametrosReportesAsistenciaDiaria.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEmpleadoAsistenciaDiaria);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEstructuraAsistenciaDiaria);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEstructuraSeccionAsistenciaDiaria);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEmpleadoAsistenciaDiaria);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEstructuraAsistenciaDiaria);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEstructuraSeccionAsistenciaDiaria);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEmpleadoAsistenciaDiaria);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEstructuraAsistenciaDiaria);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEstructuraSeccionAsistenciaDiaria);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructuraSeccion(Boolean isParaEstructuraSeccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraSeccionNegation=!isParaEstructuraSeccion;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraSeccionNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEmpleadoAsistenciaDiaria);}

			this.isVisibilidadFK_IdEstructura=isParaEstructuraSeccionNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEstructuraAsistenciaDiaria);}

			this.isVisibilidadFK_IdEstructuraSeccion=isParaEstructuraSeccion;
			if(!this.isVisibilidadFK_IdEstructuraSeccion) {this.jTabbedPaneBusquedasAsistenciaDiaria.remove(jPanelFK_IdEstructuraSeccionAsistenciaDiaria);}
		}
		
	}
	
	
	
	

	public String registrarSesionAsistenciaDiariaParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(asistenciadiariaSessionBean==null) {
				asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(asistenciadiariaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.asistenciadiariaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(AsistenciaDiariaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionAsistenciaDiaria(true);
			//empleadoSessionBean.setlidAsistenciaDiariaActual(this.idAsistenciaDiariaActual);

			asistenciadiariaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAsistenciaDiaria(true);
			asistenciadiariaSessionBean.setlIdAsistenciaDiariaActualForeignKey(this.idAsistenciaDiariaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AsistenciaDiariaSessionBean asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
		
		if(this.asistenciadiariaSessionBean==null) {
			this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
		}
		
		this.asistenciadiariaSessionBean.setsUltimaBusquedaAsistenciaDiaria(this.getsAccionBusqueda());
		this.asistenciadiariaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.asistenciadiariaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			asistenciadiariaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			asistenciadiariaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			asistenciadiariaSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructuraSeccion")) {
			asistenciadiariaSessionBean.setid_estructura_seccion(this.getid_estructura_seccionFK_IdEstructuraSeccion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AsistenciaDiariaSessionBean asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
		
		if(this.asistenciadiariaSessionBean==null) {
			this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
		}
		
		if(this.asistenciadiariaSessionBean.getsUltimaBusquedaAsistenciaDiaria()!=null&&!this.asistenciadiariaSessionBean.getsUltimaBusquedaAsistenciaDiaria().equals("")) {
			this.setsAccionBusqueda(asistenciadiariaSessionBean.getsUltimaBusquedaAsistenciaDiaria());
			this.setiNumeroPaginacion(asistenciadiariaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(asistenciadiariaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(asistenciadiariaSessionBean.getid_empleado());
				asistenciadiariaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(asistenciadiariaSessionBean.getid_empresa());
				asistenciadiariaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(asistenciadiariaSessionBean.getid_estructura());
				asistenciadiariaSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructuraSeccion")) {
				this.setid_estructura_seccionFK_IdEstructuraSeccion(asistenciadiariaSessionBean.getid_estructura_seccion());
				asistenciadiariaSessionBean.setid_estructura_seccion(-1L);
			}
		}
		
		this.asistenciadiariaSessionBean.setsUltimaBusquedaAsistenciaDiaria("");
		this.asistenciadiariaSessionBean.setiNumeroPaginacion(AsistenciaDiariaConstantesFunciones.INUMEROPAGINACION);
		this.asistenciadiariaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAsistenciaDiaria(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAsistenciaDiaria() {
		this.updateBorderResaltarBusquedasFormularioAsistenciaDiaria();
		this.updateVisibilidadBusquedasFormularioAsistenciaDiaria();
		this.updateHabilitarBusquedasFormularioAsistenciaDiaria();
	}
	
	public void updateBorderResaltarBusquedasFormularioAsistenciaDiaria() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAsistenciaDiaria.getComponents().length>0) {
	

		if(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaDiaria!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaDiaria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
				jPanel.setBorder(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaDiaria);
			}
		}

		if(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEstructuraAsistenciaDiaria!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEstructuraAsistenciaDiaria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
				jPanel.setBorder(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEstructuraAsistenciaDiaria);
			}
		}

		if(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEstructuraSeccionAsistenciaDiaria!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEstructuraSeccionAsistenciaDiaria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
				jPanel.setBorder(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEstructuraSeccionAsistenciaDiaria);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAsistenciaDiaria() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAsistenciaDiaria.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaDiaria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciadiariaConstantesFunciones.mostrarFK_IdEmpleadoAsistenciaDiaria);
			if(!this.asistenciadiariaConstantesFunciones.mostrarFK_IdEmpleadoAsistenciaDiaria && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEstructuraAsistenciaDiaria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciadiariaConstantesFunciones.mostrarFK_IdEstructuraAsistenciaDiaria);
			if(!this.asistenciadiariaConstantesFunciones.mostrarFK_IdEstructuraAsistenciaDiaria && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEstructuraSeccionAsistenciaDiaria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciadiariaConstantesFunciones.mostrarFK_IdEstructuraSeccionAsistenciaDiaria);
			if(!this.asistenciadiariaConstantesFunciones.mostrarFK_IdEstructuraSeccionAsistenciaDiaria && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaDiaria.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAsistenciaDiaria() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAsistenciaDiaria.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaDiaria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciadiariaConstantesFunciones.activarFK_IdEmpleadoAsistenciaDiaria);
				this.jTabbedPaneBusquedasAsistenciaDiaria.setEnabledAt(index,this.asistenciadiariaConstantesFunciones.activarFK_IdEmpleadoAsistenciaDiaria);
			}

			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEstructuraAsistenciaDiaria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciadiariaConstantesFunciones.activarFK_IdEstructuraAsistenciaDiaria);
				this.jTabbedPaneBusquedasAsistenciaDiaria.setEnabledAt(index,this.asistenciadiariaConstantesFunciones.activarFK_IdEstructuraAsistenciaDiaria);
			}

			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEstructuraSeccionAsistenciaDiaria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciadiariaConstantesFunciones.activarFK_IdEstructuraSeccionAsistenciaDiaria);
				this.jTabbedPaneBusquedasAsistenciaDiaria.setEnabledAt(index,this.asistenciadiariaConstantesFunciones.activarFK_IdEstructuraSeccionAsistenciaDiaria);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAsistenciaDiaria(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaDiaria);

			this.jTabbedPaneBusquedasAsistenciaDiaria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);

			this.asistenciadiariaConstantesFunciones.setResaltarFK_IdEmpleadoAsistenciaDiaria(resaltar);

			jPanel.setBorder(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaDiaria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEstructuraAsistenciaDiaria);

			this.jTabbedPaneBusquedasAsistenciaDiaria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);

			this.asistenciadiariaConstantesFunciones.setResaltarFK_IdEstructuraAsistenciaDiaria(resaltar);

			jPanel.setBorder(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEstructuraAsistenciaDiaria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructuraSeccion")) {
			index= this.jTabbedPaneBusquedasAsistenciaDiaria.indexOfComponent(this.jPanelFK_IdEstructuraSeccionAsistenciaDiaria);

			this.jTabbedPaneBusquedasAsistenciaDiaria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaDiaria.getComponent(index);

			this.asistenciadiariaConstantesFunciones.setResaltarFK_IdEstructuraSeccionAsistenciaDiaria(resaltar);

			jPanel.setBorder(this.asistenciadiariaConstantesFunciones.resaltarFK_IdEstructuraSeccionAsistenciaDiaria);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAsistenciaDiaria.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAsistenciaDiaria() throws Exception {

		if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAsistenciaDiaria();
		this.updateVisibilidadResaltarControlesFormularioAsistenciaDiaria();
		this.updateHabilitarResaltarControlesFormularioAsistenciaDiaria();
		
	}
	
	public void updateBorderResaltarControlesFormularioAsistenciaDiaria() throws Exception {
		if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.asistenciadiariaConstantesFunciones.resaltaridAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltaridAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarid_empresaAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarid_empresaAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarid_empleadoAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarid_empleadoAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarid_estructuraAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarid_estructuraAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarid_estructura_seccionAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarid_estructura_seccionAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarfechaAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jDateChooserfechaAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarfechaAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarhoraAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jSpinnerhoraAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarhoraAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarhoras_atrasoAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_atrasoAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarhoras_atrasoAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarhoras_faltaAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_faltaAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarhoras_faltaAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarhoras_permisoAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_permisoAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarhoras_permisoAsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra25AsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra25AsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra25AsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra50AsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra50AsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra50AsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra100AsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra100AsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltarhoras_extra100AsistenciaDiaria);}
		if(this.asistenciadiariaConstantesFunciones.resaltardescripcionAsistenciaDiaria!=null && this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFielddescripcionAsistenciaDiaria.setBorder(this.asistenciadiariaConstantesFunciones.resaltardescripcionAsistenciaDiaria);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAsistenciaDiaria() throws Exception {		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
	
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostraridAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelidAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostraridAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_empresaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelid_empresaAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_empresaAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_empleadoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelid_empleadoAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_empleadoAsistenciaDiaria);
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_empleadoAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_estructuraAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelid_estructuraAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_estructuraAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_estructura_seccionAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelid_estructura_seccionAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarid_estructura_seccionAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jDateChooserfechaAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarfechaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelfechaAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarfechaAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jSpinnerhoraAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoraAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelhoraAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoraAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_atrasoAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_atrasoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelhoras_atrasoAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_atrasoAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_faltaAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_faltaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelhoras_faltaAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_faltaAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_permisoAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_permisoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelhoras_permisoAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_permisoAsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra25AsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra25AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelhoras_extra25AsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra25AsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra50AsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra50AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelhoras_extra50AsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra50AsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra100AsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra100AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPanelhoras_extra100AsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrarhoras_extra100AsistenciaDiaria);
		//this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFielddescripcionAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrardescripcionAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jPaneldescripcionAsistenciaDiaria.setVisible(this.asistenciadiariaConstantesFunciones.mostrardescripcionAsistenciaDiaria);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAsistenciaDiaria() throws Exception {
		if(this.jInternalFrameDetalleFormAsistenciaDiaria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaDiaria!=null) {
	
		this.jInternalFrameDetalleFormAsistenciaDiaria.jLabelidAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activaridAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empresaAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarid_empresaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_empleadoAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarid_empleadoAsistenciaDiaria);
			this.jInternalFrameDetalleFormAsistenciaDiaria.jButtonid_empleadoAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarid_empleadoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructuraAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarid_estructuraAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jComboBoxid_estructura_seccionAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarid_estructura_seccionAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jDateChooserfechaAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarfechaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jSpinnerhoraAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarhoraAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_atrasoAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarhoras_atrasoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_faltaAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarhoras_faltaAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_permisoAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarhoras_permisoAsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra25AsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarhoras_extra25AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra50AsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarhoras_extra50AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFieldhoras_extra100AsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activarhoras_extra100AsistenciaDiaria);
		this.jInternalFrameDetalleFormAsistenciaDiaria.jTextFielddescripcionAsistenciaDiaria.setEnabled(this.asistenciadiariaConstantesFunciones.activardescripcionAsistenciaDiaria);
		}
	}
	
		
}