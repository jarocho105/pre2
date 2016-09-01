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

import com.bydan.erp.nomina.util.ProvisionEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.ProvisionEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ProvisionEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ProvisionEmpleadoBean;
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
public class ProvisionEmpleadoBeanSwingJInternalFrame extends ProvisionEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProvisionEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProvisionEmpleado> provisionempleadoValidator = new ClassValidator<ProvisionEmpleado>(ProvisionEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProvisionEmpleado provisionempleado;	
	public ProvisionEmpleado provisionempleadoAux;
	public ProvisionEmpleado provisionempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProvisionEmpleado provisionempleadoTotales;
	public Long idProvisionEmpleadoActual;
	public Long iIdNuevoProvisionEmpleado=0L;
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

	public String sFinalQueryComboTipoProvisionEmpleado="";

	public List<TipoProvisionEmpleado> tipoprovisionempleadosForeignKey;

	public List<TipoProvisionEmpleado> gettipoprovisionempleadosForeignKey() {
		return tipoprovisionempleadosForeignKey;
	}

	public void settipoprovisionempleadosForeignKey(List<TipoProvisionEmpleado> tipoprovisionempleadosForeignKey) {
		this.tipoprovisionempleadosForeignKey = tipoprovisionempleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProvisionEmpleado tipoprovisionempleadoForeignKey;

	public TipoProvisionEmpleado gettipoprovisionempleadoForeignKey() {
		return tipoprovisionempleadoForeignKey;
	}

	public void settipoprovisionempleadoForeignKey(TipoProvisionEmpleado tipoprovisionempleadoForeignKey) {
		this.tipoprovisionempleadoForeignKey = tipoprovisionempleadoForeignKey;
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
	
	public Boolean isPermisoTodoProvisionEmpleado;
	public Boolean isPermisoNuevoProvisionEmpleado;
	public Boolean isPermisoActualizarProvisionEmpleado;
	public Boolean isPermisoActualizarOriginalProvisionEmpleado;
	public Boolean isPermisoEliminarProvisionEmpleado;
	public Boolean isPermisoGuardarCambiosProvisionEmpleado;
	public Boolean isPermisoConsultaProvisionEmpleado;
	public Boolean isPermisoBusquedaProvisionEmpleado;
	public Boolean isPermisoReporteProvisionEmpleado;
	public Boolean isPermisoPaginacionMedioProvisionEmpleado;
	public Boolean isPermisoPaginacionAltoProvisionEmpleado;
	public Boolean isPermisoPaginacionTodoProvisionEmpleado;
	public Boolean isPermisoCopiarProvisionEmpleado;
	public Boolean isPermisoVerFormProvisionEmpleado;
	public Boolean isPermisoDuplicarProvisionEmpleado;
	public Boolean isPermisoOrdenProvisionEmpleado;
	
	
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
	
	public ProvisionEmpleadoParameterReturnGeneral provisionempleadoReturnGeneral;
	public ProvisionEmpleadoParameterReturnGeneral provisionempleadoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProvisionEmpleado=false;
	public Boolean esParaAccionDesdeFormularioProvisionEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProvisionEmpleadoSessionBeanAdditional provisionempleadoSessionBeanAdditional=null;
	
	public ProvisionEmpleadoSessionBeanAdditional getProvisionEmpleadoSessionBeanAdditional() {
		return this.provisionempleadoSessionBeanAdditional;
	}
	
	public void setProvisionEmpleadoSessionBeanAdditional(ProvisionEmpleadoSessionBeanAdditional provisionempleadoSessionBeanAdditional) {
		try {
			this.provisionempleadoSessionBeanAdditional=provisionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProvisionEmpleadoBeanSwingJInternalFrameAdditional provisionempleadoBeanSwingJInternalFrameAdditional=null;
	//public class ProvisionEmpleadoBeanSwingJInternalFrame
	
	public ProvisionEmpleadoBeanSwingJInternalFrameAdditional getProvisionEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.provisionempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProvisionEmpleadoBeanSwingJInternalFrameAdditional(ProvisionEmpleadoBeanSwingJInternalFrameAdditional provisionempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.provisionempleadoBeanSwingJInternalFrameAdditional=provisionempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProvisionEmpleadoLogic provisionempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProvisionEmpleado provisionempleadoBean;
	public ProvisionEmpleadoConstantesFunciones provisionempleadoConstantesFunciones;
	//public ProvisionEmpleadoParameterReturnGeneral provisionempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public EstructuraLogic estructuraLogic;
	public TipoProvisionEmpleadoLogic tipoprovisionempleadoLogic;
	public DefiProvisionEmpleadoLogic defiprovisionempleadoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<ProvisionEmpleado> provisionempleados;	
	//public List<ProvisionEmpleado> provisionempleadosEliminados;
	//public List<ProvisionEmpleado> provisionempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaModificarProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarProvisionEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProvisionEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdDefiProvisionEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdTipoProvisionEmpleado=false;
	
	public Long getiIdNuevoProvisionEmpleado() {
		return this.iIdNuevoProvisionEmpleado;
	}

	public void setiIdNuevoProvisionEmpleado(Long iIdNuevoProvisionEmpleado) {
		this.iIdNuevoProvisionEmpleado = iIdNuevoProvisionEmpleado;
	}
	
	public Long getidProvisionEmpleadoActual() {
		return this.idProvisionEmpleadoActual;
	}

	public void setidProvisionEmpleadoActual(Long idProvisionEmpleadoActual) {
		this.idProvisionEmpleadoActual = idProvisionEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProvisionEmpleado getprovisionempleado() {
		return this.provisionempleado;
	}

	public void setprovisionempleado(ProvisionEmpleado provisionempleado) {
		this.provisionempleado = provisionempleado;
	}
	
	public ProvisionEmpleado getprovisionempleadoAux() {
		return this.provisionempleadoAux;
	}

	public void setprovisionempleadoAux(ProvisionEmpleado provisionempleadoAux) {
		this.provisionempleadoAux = provisionempleadoAux;
	}				
	
	public ProvisionEmpleado getprovisionempleadoAnterior() {
		return this.provisionempleadoAnterior;
	}

	public void setprovisionempleadoAnterior(ProvisionEmpleado provisionempleadoAnterior) {
		this.provisionempleadoAnterior = provisionempleadoAnterior;
	}	
	
	public ProvisionEmpleado getprovisionempleadoTotales() {
		return this.provisionempleadoTotales;
	}

	public void setprovisionempleadoTotales(ProvisionEmpleado provisionempleadoTotales) {
		this.provisionempleadoTotales = provisionempleadoTotales;
	}	
	
	public ProvisionEmpleado getprovisionempleadoBean() {
		return this.provisionempleadoBean;
	}

	public void setprovisionempleadoBean(ProvisionEmpleado provisionempleadoBean) {
		this.provisionempleadoBean = provisionempleadoBean;
	}	
	
	public ProvisionEmpleadoParameterReturnGeneral getprovisionempleadoReturnGeneral() {
		return this.provisionempleadoReturnGeneral;
	}

	public void setprovisionempleadoReturnGeneral(ProvisionEmpleadoParameterReturnGeneral provisionempleadoReturnGeneral) {
		this.provisionempleadoReturnGeneral = provisionempleadoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_defi_provision_empleadoFK_IdDefiProvisionEmpleado=-1L;

	public Long getid_defi_provision_empleadoFK_IdDefiProvisionEmpleado() {
		return this.id_defi_provision_empleadoFK_IdDefiProvisionEmpleado;
	}

	public void setid_defi_provision_empleadoFK_IdDefiProvisionEmpleado(Long id_defi_provision_empleadoFK_IdDefiProvisionEmpleado) {
		this.id_defi_provision_empleadoFK_IdDefiProvisionEmpleado = id_defi_provision_empleadoFK_IdDefiProvisionEmpleado;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado=-1L;

	public Long getid_tipo_provision_empleadoFK_IdTipoProvisionEmpleado() {
		return this.id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado;
	}

	public void setid_tipo_provision_empleadoFK_IdTipoProvisionEmpleado(Long id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado) {
		this.id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado = id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProvisionEmpleadoLogic getProvisionEmpleadoLogic()	{		
		return provisionempleadoLogic;
	}

	public void setProvisionEmpleadoLogic(ProvisionEmpleadoLogic provisionempleadoLogic) {
		this.provisionempleadoLogic = provisionempleadoLogic;
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
	
	public Boolean getIsEsNuevoProvisionEmpleado() {
		return isEsNuevoProvisionEmpleado;
	}

	public void setIsEsNuevoProvisionEmpleado(Boolean isEsNuevoProvisionEmpleado) {
		this.isEsNuevoProvisionEmpleado = isEsNuevoProvisionEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioProvisionEmpleado() {
		return esParaAccionDesdeFormularioProvisionEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioProvisionEmpleado(Boolean esParaAccionDesdeFormularioProvisionEmpleado) {
		this.esParaAccionDesdeFormularioProvisionEmpleado = esParaAccionDesdeFormularioProvisionEmpleado;
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

			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(provisionempleadoSessionBean.getlidEmpresaActual());
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

			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(provisionempleadoSessionBean.getlidEmpleadoActual());
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

			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(provisionempleadoSessionBean.getlidEstructuraActual());
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

	public void cargarCombosTipoProvisionEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprovisionempleadosForeignKey=new ArrayList<TipoProvisionEmpleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProvisionEmpleadoLogic tipoprovisionempleadoLogic=new TipoProvisionEmpleadoLogic();

			//tipoprovisionempleadoLogic.getTipoProvisionEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProvisionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprovisionempleadoLogic.getTipoProvisionEmpleadoDataAccess().setIsForForeingKeyData(true);

					tipoprovisionempleadoLogic.getTodosTipoProvisionEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.tipoprovisionempleadosForeignKey=tipoprovisionempleadoLogic.getTipoProvisionEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProvisionEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprovisionempleadoLogic.getEntityWithConnection(provisionempleadoSessionBean.getlidTipoProvisionEmpleadoActual());
					this.tipoprovisionempleadosForeignKey.add(tipoprovisionempleadoLogic.getTipoProvisionEmpleado());
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

			//defiprovisionempleadoLogic.getDefiProvisionEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//defiprovisionempleadoLogic.getDefiProvisionEmpleadoDataAccess().setIsForForeingKeyData(true);

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
					defiprovisionempleadoLogic.getEntityWithConnection(provisionempleadoSessionBean.getlidDefiProvisionEmpleadoActual());
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

			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(provisionempleadoSessionBean.getlidAnioActual());
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

			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(provisionempleadoSessionBean.getlidMesActual());
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

					if(this.provisionempleado!=null) {
						this.provisionempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProvisionEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProvisionEmpleadoGenerico)throws Exception
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
				jComboBoxid_empresaProvisionEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProvisionEmpleadoGenerico!=null && jComboBoxid_empresaProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaProvisionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.provisionempleado!=null) {
						this.provisionempleado.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoProvisionEmpleado.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoProvisionEmpleadoGenerico)throws Exception
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
				jComboBoxid_empleadoProvisionEmpleadoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoProvisionEmpleadoGenerico!=null && jComboBoxid_empleadoProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoProvisionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.provisionempleado!=null) {
						this.provisionempleado.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraProvisionEmpleado.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado!=null) {
						jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraProvisionEmpleadoGenerico)throws Exception
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
				jComboBoxid_estructuraProvisionEmpleadoGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraProvisionEmpleadoGenerico!=null && jComboBoxid_estructuraProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_estructuraProvisionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProvisionEmpleadoForeignKey(Long idTipoProvisionEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProvisionEmpleado  tipoprovisionempleadoTemp=null;

			for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosForeignKey) {
				if(tipoprovisionempleadoAux.getId()!=null && tipoprovisionempleadoAux.getId().equals(idTipoProvisionEmpleadoSeleccionado)) {
					tipoprovisionempleadoTemp=tipoprovisionempleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprovisionempleadoTemp!=null) {

					if(this.provisionempleado!=null) {
						this.provisionempleado.setTipoProvisionEmpleado(tipoprovisionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setSelectedItem(tipoprovisionempleadoTemp);
					}
				} else {
					//jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setSelectedItem(tipoprovisionempleadoTemp);
					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProvisionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprovisionempleadoTemp!=null && jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado!=null) {
						jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setSelectedItem(tipoprovisionempleadoTemp);
					} else {
						if(jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado!=null) {
							//jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setSelectedItem(tipoprovisionempleadoTemp);
							if(jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setSelectedIndex(0);
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

	public String getActualTipoProvisionEmpleadoForeignKeyDescripcion(Long idTipoProvisionEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProvisionEmpleado  tipoprovisionempleadoTemp=null;

			for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosForeignKey) {
				if(tipoprovisionempleadoAux.getId()!=null && tipoprovisionempleadoAux.getId().equals(idTipoProvisionEmpleadoSeleccionado)) {
					tipoprovisionempleadoTemp=tipoprovisionempleadoAux;
					break;
				}
			}


			sDescripcion=TipoProvisionEmpleadoConstantesFunciones.getTipoProvisionEmpleadoDescripcion(tipoprovisionempleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProvisionEmpleadoForeignKeyGenerico(Long idTipoProvisionEmpleadoSeleccionado,JComboBox jComboBoxid_tipo_provision_empleadoProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			TipoProvisionEmpleado  tipoprovisionempleadoTemp=null;

			for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosForeignKey) {
				if(tipoprovisionempleadoAux.getId()!=null && tipoprovisionempleadoAux.getId().equals(idTipoProvisionEmpleadoSeleccionado)) {
					tipoprovisionempleadoTemp=tipoprovisionempleadoAux;
					break;
				}
			}

			if(tipoprovisionempleadoTemp!=null) {
				jComboBoxid_tipo_provision_empleadoProvisionEmpleadoGenerico.setSelectedItem(tipoprovisionempleadoTemp);
			} else {
				if(jComboBoxid_tipo_provision_empleadoProvisionEmpleadoGenerico!=null && jComboBoxid_tipo_provision_empleadoProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_provision_empleadoProvisionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.provisionempleado!=null) {
						this.provisionempleado.setDefiProvisionEmpleado(defiprovisionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setSelectedItem(defiprovisionempleadoTemp);
					}
				} else {
					//jComboBoxid_defi_provision_empleadoProvisionEmpleado.setSelectedItem(defiprovisionempleadoTemp);
					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDefiProvisionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(defiprovisionempleadoTemp!=null && jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado!=null) {
						jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setSelectedItem(defiprovisionempleadoTemp);
					} else {
						if(jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado!=null) {
							//jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setSelectedItem(defiprovisionempleadoTemp);
							if(jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setSelectedIndex(0);
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
	public void setActualDefiProvisionEmpleadoForeignKeyGenerico(Long idDefiProvisionEmpleadoSeleccionado,JComboBox jComboBoxid_defi_provision_empleadoProvisionEmpleadoGenerico)throws Exception
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
				jComboBoxid_defi_provision_empleadoProvisionEmpleadoGenerico.setSelectedItem(defiprovisionempleadoTemp);
			} else {
				if(jComboBoxid_defi_provision_empleadoProvisionEmpleadoGenerico!=null && jComboBoxid_defi_provision_empleadoProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_defi_provision_empleadoProvisionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.provisionempleado!=null) {
						this.provisionempleado.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProvisionEmpleado.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioProvisionEmpleado!=null) {
						jComboBoxid_anioFK_IdAnioProvisionEmpleado.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioProvisionEmpleado!=null) {
							//jComboBoxid_anioFK_IdAnioProvisionEmpleado.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioProvisionEmpleado.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProvisionEmpleadoGenerico)throws Exception
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
				jComboBoxid_anioProvisionEmpleadoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProvisionEmpleadoGenerico!=null && jComboBoxid_anioProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_anioProvisionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.provisionempleado!=null) {
						this.provisionempleado.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesProvisionEmpleado.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesProvisionEmpleado!=null) {
						jComboBoxid_mesFK_IdMesProvisionEmpleado.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesProvisionEmpleado!=null) {
							//jComboBoxid_mesFK_IdMesProvisionEmpleado.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesProvisionEmpleado.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesProvisionEmpleado.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesProvisionEmpleadoGenerico)throws Exception
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
				jComboBoxid_mesProvisionEmpleadoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesProvisionEmpleadoGenerico!=null && jComboBoxid_mesProvisionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_mesProvisionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProvisionEmpleado provisionempleado,JComboBox jComboBoxid_empresaProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProvisionEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				provisionempleado.setid_empresa(empresaAux.getId());
				provisionempleado.setempresa_descripcion(ProvisionEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				provisionempleado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(ProvisionEmpleado provisionempleado,JComboBox jComboBoxid_empleadoProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoProvisionEmpleadoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				provisionempleado.setid_empleado(empleadoAux.getId());
				provisionempleado.setempleado_descripcion(ProvisionEmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				provisionempleado.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(ProvisionEmpleado provisionempleado,JComboBox jComboBoxid_estructuraProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraProvisionEmpleadoGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				provisionempleado.setid_estructura(estructuraAux.getId());
				provisionempleado.setestructura_descripcion(ProvisionEmpleadoConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				provisionempleado.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProvisionEmpleadoForeignKey(ProvisionEmpleado provisionempleado,JComboBox jComboBoxid_tipo_provision_empleadoProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			TipoProvisionEmpleado  tipoprovisionempleadoAux=new TipoProvisionEmpleado();

			if(jComboBoxid_tipo_provision_empleadoProvisionEmpleadoGenerico==null) {
				tipoprovisionempleadoAux=(TipoProvisionEmpleado)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getSelectedItem();
			} else {
				tipoprovisionempleadoAux=(TipoProvisionEmpleado)jComboBoxid_tipo_provision_empleadoProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(tipoprovisionempleadoAux!=null && tipoprovisionempleadoAux.getId()!=null) {
				provisionempleado.setid_tipo_provision_empleado(tipoprovisionempleadoAux.getId());
				provisionempleado.settipoprovisionempleado_descripcion(ProvisionEmpleadoConstantesFunciones.getTipoProvisionEmpleadoDescripcion(tipoprovisionempleadoAux));
				provisionempleado.setTipoProvisionEmpleado(tipoprovisionempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDefiProvisionEmpleadoForeignKey(ProvisionEmpleado provisionempleado,JComboBox jComboBoxid_defi_provision_empleadoProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoAux=new DefiProvisionEmpleado();

			if(jComboBoxid_defi_provision_empleadoProvisionEmpleadoGenerico==null) {
				defiprovisionempleadoAux=(DefiProvisionEmpleado)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.getSelectedItem();
			} else {
				defiprovisionempleadoAux=(DefiProvisionEmpleado)jComboBoxid_defi_provision_empleadoProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(defiprovisionempleadoAux!=null && defiprovisionempleadoAux.getId()!=null) {
				provisionempleado.setid_defi_provision_empleado(defiprovisionempleadoAux.getId());
				provisionempleado.setdefiprovisionempleado_descripcion(ProvisionEmpleadoConstantesFunciones.getDefiProvisionEmpleadoDescripcion(defiprovisionempleadoAux));
				provisionempleado.setDefiProvisionEmpleado(defiprovisionempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProvisionEmpleado provisionempleado,JComboBox jComboBoxid_anioProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProvisionEmpleadoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				provisionempleado.setid_anio(anioAux.getId());
				provisionempleado.setanio_descripcion(ProvisionEmpleadoConstantesFunciones.getAnioDescripcion(anioAux));
				provisionempleado.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(ProvisionEmpleado provisionempleado,JComboBox jComboBoxid_mesProvisionEmpleadoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesProvisionEmpleadoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesProvisionEmpleadoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				provisionempleado.setid_mes(mesAux.getId());
				provisionempleado.setmes_descripcion(ProvisionEmpleadoConstantesFunciones.getMesDescripcion(mesAux));
				provisionempleado.setMes(mesAux);			}
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

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
					}

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
					}

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.addItem(empleado);
							}
						}

						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
					}

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.addItem(estructura);
							}
						}

						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProvisionEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProvisionEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.removeAllItems();

							for(TipoProvisionEmpleado tipoprovisionempleado:this.tipoprovisionempleadosForeignKey) {
								this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.addItem(tipoprovisionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
					}

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProvisionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.removeAllItems();

							for(TipoProvisionEmpleado tipoprovisionempleado:this.tipoprovisionempleadosForeignKey) {
								this.jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.addItem(tipoprovisionempleado);
							}
						}

						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.removeAllItems();

							for(DefiProvisionEmpleado defiprovisionempleado:this.defiprovisionempleadosForeignKey) {
								this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.addItem(defiprovisionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
					}

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDefiProvisionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.removeAllItems();

							for(DefiProvisionEmpleado defiprovisionempleado:this.defiprovisionempleadosForeignKey) {
								this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.addItem(defiprovisionempleado);
							}
						}

						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
					}

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioProvisionEmpleado.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioProvisionEmpleado.addItem(anio);
							}
						}

						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { 
					}

					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesProvisionEmpleado.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesProvisionEmpleado.addItem(mes);
							}
						}

						if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProvisionEmpleadoForeignKey(TipoProvisionEmpleado tipoprovisionempleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setSelectedItem(tipoprovisionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setSelectedItem(tipoprovisionempleado);
						} else {
							this.jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setSelectedItem(defiprovisionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setSelectedItem(defiprovisionempleado);
						} else {
							this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioProvisionEmpleado.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesProvisionEmpleado.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesProvisionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProvisionEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProvisionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesProvisionEmpleado(this.provisionempleadoLogic.getProvisionEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProvisionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesProvisionEmpleado(this.provisionempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(TipoProvisionEmpleado.class));
		classes.add(new Classe(DefiProvisionEmpleado.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//provisionempleadoLogic.setProvisionEmpleados(this.provisionempleados);
			provisionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProvisionEmpleadoParameterReturnGeneral getProvisionEmpleadoParameterGeneral() {
		return this.provisionempleadoParameterGeneral;
	}
	
	public void setProvisionEmpleadoParameterGeneral(ProvisionEmpleadoParameterReturnGeneral provisionempleadoParameterGeneral) {
		this.provisionempleadoParameterGeneral = provisionempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProvisionEmpleado() {
		return isPermisoTodoProvisionEmpleado;
	}

	public void setIsPermisoTodoProvisionEmpleado(Boolean isPermisoTodoProvisionEmpleado) {
		this.isPermisoTodoProvisionEmpleado = isPermisoTodoProvisionEmpleado;
	}

	public Boolean getIsPermisoNuevoProvisionEmpleado() {
		return isPermisoNuevoProvisionEmpleado;
	}

	public void setIsPermisoNuevoProvisionEmpleado(Boolean isPermisoNuevoProvisionEmpleado) {
		this.isPermisoNuevoProvisionEmpleado = isPermisoNuevoProvisionEmpleado;
	}

	public Boolean getIsPermisoActualizarProvisionEmpleado() {
		return isPermisoActualizarProvisionEmpleado;
	}

	public void setIsPermisoActualizarProvisionEmpleado(Boolean isPermisoActualizarProvisionEmpleado) {
		this.isPermisoActualizarProvisionEmpleado = isPermisoActualizarProvisionEmpleado;
	}

	public Boolean getIsPermisoEliminarProvisionEmpleado() {
		return isPermisoEliminarProvisionEmpleado;
	}

	public void setIsPermisoEliminarProvisionEmpleado(Boolean isPermisoEliminarProvisionEmpleado) {
		this.isPermisoEliminarProvisionEmpleado = isPermisoEliminarProvisionEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosProvisionEmpleado() {
		return isPermisoGuardarCambiosProvisionEmpleado;
	}

	public void setIsPermisoGuardarCambiosProvisionEmpleado(Boolean isPermisoGuardarCambiosProvisionEmpleado) {
		this.isPermisoGuardarCambiosProvisionEmpleado = isPermisoGuardarCambiosProvisionEmpleado;
	}
	
	public Boolean getIsPermisoConsultaProvisionEmpleado() {
		return isPermisoConsultaProvisionEmpleado;
	}

	public void setIsPermisoConsultaProvisionEmpleado(Boolean isPermisoConsultaProvisionEmpleado) {
		this.isPermisoConsultaProvisionEmpleado = isPermisoConsultaProvisionEmpleado;
	}

	public Boolean getIsPermisoBusquedaProvisionEmpleado() {
		return isPermisoBusquedaProvisionEmpleado;
	}

	public void setIsPermisoBusquedaProvisionEmpleado(Boolean isPermisoBusquedaProvisionEmpleado) {
		this.isPermisoBusquedaProvisionEmpleado = isPermisoBusquedaProvisionEmpleado;
	}

	public Boolean getIsPermisoReporteProvisionEmpleado() {
		return isPermisoReporteProvisionEmpleado;
	}

	public void setIsPermisoReporteProvisionEmpleado(Boolean isPermisoReporteProvisionEmpleado) {
		this.isPermisoReporteProvisionEmpleado = isPermisoReporteProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioProvisionEmpleado() {
		return isPermisoPaginacionMedioProvisionEmpleado;
	}

	public void setIsPermisoPaginacionMedioProvisionEmpleado(Boolean isPermisoPaginacionMedioProvisionEmpleado) {
		this.isPermisoPaginacionMedioProvisionEmpleado = isPermisoPaginacionMedioProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoProvisionEmpleado() {
		return isPermisoPaginacionTodoProvisionEmpleado;
	}

	public void setIsPermisoPaginacionTodoProvisionEmpleado(Boolean isPermisoPaginacionTodoProvisionEmpleado) {
		this.isPermisoPaginacionTodoProvisionEmpleado = isPermisoPaginacionTodoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoProvisionEmpleado() {
		return isPermisoPaginacionAltoProvisionEmpleado;
	}

	public void setIsPermisoPaginacionAltoProvisionEmpleado(Boolean isPermisoPaginacionAltoProvisionEmpleado) {
		this.isPermisoPaginacionAltoProvisionEmpleado = isPermisoPaginacionAltoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoCopiarProvisionEmpleado() {
		return isPermisoCopiarProvisionEmpleado;
	}

	public void setIsPermisoCopiarProvisionEmpleado(Boolean isPermisoCopiarProvisionEmpleado) {
		this.isPermisoCopiarProvisionEmpleado = isPermisoCopiarProvisionEmpleado;
	}
	
	public Boolean getIsPermisoVerFormProvisionEmpleado() {
		return isPermisoVerFormProvisionEmpleado;
	}

	public void setIsPermisoVerFormProvisionEmpleado(Boolean isPermisoVerFormProvisionEmpleado) {
		this.isPermisoVerFormProvisionEmpleado = isPermisoVerFormProvisionEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarProvisionEmpleado() {
		return isPermisoDuplicarProvisionEmpleado;
	}

	public void setIsPermisoDuplicarProvisionEmpleado(Boolean isPermisoDuplicarProvisionEmpleado) {
		this.isPermisoDuplicarProvisionEmpleado = isPermisoDuplicarProvisionEmpleado;
	}
	
	public Boolean getIsPermisoOrdenProvisionEmpleado() {
		return isPermisoOrdenProvisionEmpleado;
	}

	public void setIsPermisoOrdenProvisionEmpleado(Boolean isPermisoOrdenProvisionEmpleado) {
		this.isPermisoOrdenProvisionEmpleado = isPermisoOrdenProvisionEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProvisionEmpleado() {
		return isVisibilidadCeldaNuevoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoProvisionEmpleado(Boolean isVisibilidadCeldaNuevoProvisionEmpleado) {
		this.isVisibilidadCeldaNuevoProvisionEmpleado = isVisibilidadCeldaNuevoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProvisionEmpleado() {
		return isVisibilidadCeldaDuplicarProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarProvisionEmpleado(Boolean isVisibilidadCeldaDuplicarProvisionEmpleado) {
		this.isVisibilidadCeldaDuplicarProvisionEmpleado = isVisibilidadCeldaDuplicarProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProvisionEmpleado() {
		return isVisibilidadCeldaCopiarProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarProvisionEmpleado(Boolean isVisibilidadCeldaCopiarProvisionEmpleado) {
		this.isVisibilidadCeldaCopiarProvisionEmpleado = isVisibilidadCeldaCopiarProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProvisionEmpleado() {
		return isVisibilidadCeldaVerFormProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormProvisionEmpleado(Boolean isVisibilidadCeldaVerFormProvisionEmpleado) {
		this.isVisibilidadCeldaVerFormProvisionEmpleado = isVisibilidadCeldaVerFormProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProvisionEmpleado() {
		return isVisibilidadCeldaOrdenProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenProvisionEmpleado(Boolean isVisibilidadCeldaOrdenProvisionEmpleado) {
		this.isVisibilidadCeldaOrdenProvisionEmpleado = isVisibilidadCeldaOrdenProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProvisionEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProvisionEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesProvisionEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado = isVisibilidadCeldaNuevoRelacionesProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProvisionEmpleado() {
		return isVisibilidadCeldaModificarProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaModificarProvisionEmpleado(Boolean isVisibilidadCeldaModificarProvisionEmpleado) {
		this.isVisibilidadCeldaModificarProvisionEmpleado = isVisibilidadCeldaModificarProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProvisionEmpleado() {
		return isVisibilidadCeldaActualizarProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarProvisionEmpleado(Boolean isVisibilidadCeldaActualizarProvisionEmpleado) {
		this.isVisibilidadCeldaActualizarProvisionEmpleado = isVisibilidadCeldaActualizarProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarProvisionEmpleado() {
		return isVisibilidadCeldaEliminarProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarProvisionEmpleado(Boolean isVisibilidadCeldaEliminarProvisionEmpleado) {
		this.isVisibilidadCeldaEliminarProvisionEmpleado = isVisibilidadCeldaEliminarProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarProvisionEmpleado() {
		return isVisibilidadCeldaCancelarProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarProvisionEmpleado(Boolean isVisibilidadCeldaCancelarProvisionEmpleado) {
		this.isVisibilidadCeldaCancelarProvisionEmpleado = isVisibilidadCeldaCancelarProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarProvisionEmpleado() {
		return isVisibilidadCeldaGuardarProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarProvisionEmpleado(Boolean isVisibilidadCeldaGuardarProvisionEmpleado) {
		this.isVisibilidadCeldaGuardarProvisionEmpleado = isVisibilidadCeldaGuardarProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProvisionEmpleado() {
		return isVisibilidadCeldaGuardarCambiosProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProvisionEmpleado(Boolean isVisibilidadCeldaGuardarCambiosProvisionEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado = isVisibilidadCeldaGuardarCambiosProvisionEmpleado;
	}
		
	public ProvisionEmpleadoSessionBean getprovisionempleadoSessionBean() {
		return this.provisionempleadoSessionBean;
	}
	
	public void setprovisionempleadoSessionBean(ProvisionEmpleadoSessionBean provisionempleadoSessionBean) {
		this.provisionempleadoSessionBean=provisionempleadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdDefiProvisionEmpleado() {
		return this.isVisibilidadFK_IdDefiProvisionEmpleado;
	}

	public void setisVisibilidadFK_IdDefiProvisionEmpleado(Boolean isVisibilidadFK_IdDefiProvisionEmpleado) {
		this.isVisibilidadFK_IdDefiProvisionEmpleado=isVisibilidadFK_IdDefiProvisionEmpleado;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdTipoProvisionEmpleado() {
		return this.isVisibilidadFK_IdTipoProvisionEmpleado;
	}

	public void setisVisibilidadFK_IdTipoProvisionEmpleado(Boolean isVisibilidadFK_IdTipoProvisionEmpleado) {
		this.isVisibilidadFK_IdTipoProvisionEmpleado=isVisibilidadFK_IdTipoProvisionEmpleado;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(ProvisionEmpleado provisionempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(provisionempleado,null);
				this.setActualParaGuardarEmpleadoForeignKey(provisionempleado,null);
				this.setActualParaGuardarEstructuraForeignKey(provisionempleado,null);
				this.setActualParaGuardarTipoProvisionEmpleadoForeignKey(provisionempleado,null);
				this.setActualParaGuardarDefiProvisionEmpleadoForeignKey(provisionempleado,null);
				this.setActualParaGuardarAnioForeignKey(provisionempleado,null);
				this.setActualParaGuardarMesForeignKey(provisionempleado,null);
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
	
	public void bugActualizarReferenciaActual(ProvisionEmpleado provisionempleado,ProvisionEmpleado provisionempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProvisionEmpleado(provisionempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		provisionempleadoAux.setId(provisionempleado.getId());
		provisionempleadoAux.setVersionRow(provisionempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProvisionEmpleado();
		
			int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = provisionempleadoValidator.getInvalidValues(this.provisionempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			provisionempleadoLogic.setDatosCliente(datosCliente);
			provisionempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				provisionempleadoAux=new  ProvisionEmpleado();
				
				provisionempleadoAux.setIsNew(true);
				provisionempleadoAux.setIsChanged(true);
				
				provisionempleadoAux.setProvisionEmpleadoOriginal(this.provisionempleado);
				
				provisionempleadoAux.setId(this.provisionempleado.getId());	
				provisionempleadoAux.setVersionRow(this.provisionempleado.getVersionRow());	
				provisionempleadoAux.setid_empresa(this.provisionempleado.getid_empresa());	
				provisionempleadoAux.setid_empleado(this.provisionempleado.getid_empleado());	
				provisionempleadoAux.setid_estructura(this.provisionempleado.getid_estructura());	
				provisionempleadoAux.setid_tipo_provision_empleado(this.provisionempleado.getid_tipo_provision_empleado());	
				provisionempleadoAux.setid_defi_provision_empleado(this.provisionempleado.getid_defi_provision_empleado());	
				provisionempleadoAux.setid_anio(this.provisionempleado.getid_anio());	
				provisionempleadoAux.setid_mes(this.provisionempleado.getid_mes());	
				provisionempleadoAux.setfecha(this.provisionempleado.getfecha());	
				provisionempleadoAux.setfecha_liquidacion(this.provisionempleado.getfecha_liquidacion());	
				provisionempleadoAux.setvalor_mes(this.provisionempleado.getvalor_mes());	
				provisionempleadoAux.setvalor_paga(this.provisionempleado.getvalor_paga());	
				provisionempleadoAux.setvalor_vacacion(this.provisionempleado.getvalor_vacacion());	
				provisionempleadoAux.setvalor_liquidacion(this.provisionempleado.getvalor_liquidacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.provisionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(provisionempleadoAux,provisionempleadoLogic.getProvisionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(provisionempleadoAux,provisionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.provisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.saveProvisionEmpleados();//WithConnection
						//provisionempleadoLogic.getSetVersionRowProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.provisionempleado,provisionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesProvisionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								provisionempleadoLogic.saveProvisionEmpleadoRelaciones(provisionempleadoAux);//WithConnection
								//provisionempleadoLogic.getSetVersionRowProvisionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.provisionempleado,provisionempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.provisionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(provisionempleadoAux,provisionempleadoLogic.getProvisionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(provisionempleadoAux,provisionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.provisionempleado,provisionempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				provisionempleadoAux=new  ProvisionEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.provisionempleadoSessionBean.getEsGuardarRelacionado() && this.provisionempleado.getId()>=0)) {
						
					provisionempleadoAux.setIsNew(false);
				}
				
				provisionempleadoAux.setIsDeleted(false);
			
				provisionempleadoAux.setId(this.provisionempleado.getId());	
				provisionempleadoAux.setVersionRow(this.provisionempleado.getVersionRow());	
				provisionempleadoAux.setid_empresa(this.provisionempleado.getid_empresa());	
				provisionempleadoAux.setid_empleado(this.provisionempleado.getid_empleado());	
				provisionempleadoAux.setid_estructura(this.provisionempleado.getid_estructura());	
				provisionempleadoAux.setid_tipo_provision_empleado(this.provisionempleado.getid_tipo_provision_empleado());	
				provisionempleadoAux.setid_defi_provision_empleado(this.provisionempleado.getid_defi_provision_empleado());	
				provisionempleadoAux.setid_anio(this.provisionempleado.getid_anio());	
				provisionempleadoAux.setid_mes(this.provisionempleado.getid_mes());	
				provisionempleadoAux.setfecha(this.provisionempleado.getfecha());	
				provisionempleadoAux.setfecha_liquidacion(this.provisionempleado.getfecha_liquidacion());	
				provisionempleadoAux.setvalor_mes(this.provisionempleado.getvalor_mes());	
				provisionempleadoAux.setvalor_paga(this.provisionempleado.getvalor_paga());	
				provisionempleadoAux.setvalor_vacacion(this.provisionempleado.getvalor_vacacion());	
				provisionempleadoAux.setvalor_liquidacion(this.provisionempleado.getvalor_liquidacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(provisionempleadoAux,provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(provisionempleadoAux,provisionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.provisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.saveProvisionEmpleados();//WithConnection
						//provisionempleadoLogic.getSetVersionRowProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.provisionempleado,provisionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesProvisionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								provisionempleadoLogic.saveProvisionEmpleadoRelaciones(provisionempleadoAux);//WithConnection
								//provisionempleadoLogic.getSetVersionRowProvisionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.provisionempleado,provisionempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.provisionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(provisionempleadoAux,provisionempleadoLogic.getProvisionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(provisionempleadoAux,provisionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.provisionempleado,provisionempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				provisionempleadoAux=new  ProvisionEmpleado();
				
				provisionempleadoAux.setIsNew(false);
				provisionempleadoAux.setIsChanged(false);
				
				provisionempleadoAux.setIsDeleted(true);
				
				provisionempleadoAux.setId(this.provisionempleado.getId());	
				provisionempleadoAux.setVersionRow(this.provisionempleado.getVersionRow());	
				provisionempleadoAux.setid_empresa(this.provisionempleado.getid_empresa());	
				provisionempleadoAux.setid_empleado(this.provisionempleado.getid_empleado());	
				provisionempleadoAux.setid_estructura(this.provisionempleado.getid_estructura());	
				provisionempleadoAux.setid_tipo_provision_empleado(this.provisionempleado.getid_tipo_provision_empleado());	
				provisionempleadoAux.setid_defi_provision_empleado(this.provisionempleado.getid_defi_provision_empleado());	
				provisionempleadoAux.setid_anio(this.provisionempleado.getid_anio());	
				provisionempleadoAux.setid_mes(this.provisionempleado.getid_mes());	
				provisionempleadoAux.setfecha(this.provisionempleado.getfecha());	
				provisionempleadoAux.setfecha_liquidacion(this.provisionempleado.getfecha_liquidacion());	
				provisionempleadoAux.setvalor_mes(this.provisionempleado.getvalor_mes());	
				provisionempleadoAux.setvalor_paga(this.provisionempleado.getvalor_paga());	
				provisionempleadoAux.setvalor_vacacion(this.provisionempleado.getvalor_vacacion());	
				provisionempleadoAux.setvalor_liquidacion(this.provisionempleado.getvalor_liquidacion());	
				
				if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.provisionempleadoAux.getId()>=0) {	
						this.provisionempleadosEliminados.add(provisionempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(provisionempleadoAux,provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(provisionempleadoAux,provisionempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.provisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.saveProvisionEmpleados();//WithConnection
						//provisionempleadoLogic.getSetVersionRowProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								provisionempleadoLogic.saveProvisionEmpleadoRelaciones(provisionempleadoAux);//WithConnection
								//provisionempleadoLogic.getSetVersionRowProvisionEmpleados();//WithConnection
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
							if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.provisionempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(provisionempleadoAux,provisionempleadoLogic.getProvisionEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(provisionempleadoAux,provisionempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getProvisionEmpleados().addAll(this.provisionempleadosEliminados);
					
					provisionempleadoLogic.saveProvisionEmpleados();//WithConnection
					//provisionempleadoLogic.getSetVersionRowProvisionEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProvisionEmpleado();
				
				this.provisionempleadosEliminados= new ArrayList<ProvisionEmpleado>();		
			}
			
			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Provision Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.provisionempleado=provisionempleadoAux;
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
      		//this.finishProcessProvisionEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(ProvisionEmpleado provisionempleadoLocal) throws Exception {
		
		if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProvisionEmpleado provisionempleadoLocal) throws Exception {	
		if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				provisionempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				provisionempleadoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				provisionempleadoLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProvisionEmpleadoDetalleFormJInternalFrame.class)) {
				TipoProvisionEmpleadoBeanSwingJInternalFrame tipoprovisionempleadoBeanSwingJInternalFrameLocal=(TipoProvisionEmpleadoBeanSwingJInternalFrame) ((TipoProvisionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprovisionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProvisionEmpleado(tipoprovisionempleadoBeanSwingJInternalFrameLocal.gettipoprovisionempleado(),true);
				tipoprovisionempleadoBeanSwingJInternalFrameLocal.actualizarLista(tipoprovisionempleadoBeanSwingJInternalFrameLocal.tipoprovisionempleado,this.tipoprovisionempleadosForeignKey);

				tipoprovisionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprovisionempleadoBeanSwingJInternalFrameLocal.tipoprovisionempleado);

				provisionempleadoLocal.setTipoProvisionEmpleado(tipoprovisionempleadoBeanSwingJInternalFrameLocal.tipoprovisionempleado);

				this.addItemDefectoCombosForeignKeyTipoProvisionEmpleado();
				this.cargarCombosFrameTipoProvisionEmpleadosForeignKey("Formulario");
				this.setActualTipoProvisionEmpleadoForeignKey(tipoprovisionempleadoBeanSwingJInternalFrameLocal.tipoprovisionempleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DefiProvisionEmpleadoDetalleFormJInternalFrame.class)) {
				DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrameLocal=(DefiProvisionEmpleadoBeanSwingJInternalFrame) ((DefiProvisionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				defiprovisionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDefiProvisionEmpleado(defiprovisionempleadoBeanSwingJInternalFrameLocal.getdefiprovisionempleado(),true);
				defiprovisionempleadoBeanSwingJInternalFrameLocal.actualizarLista(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado,this.defiprovisionempleadosForeignKey);

				defiprovisionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado);

				provisionempleadoLocal.setDefiProvisionEmpleado(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado);

				this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
				this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Formulario");
				this.setActualDefiProvisionEmpleadoForeignKey(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				provisionempleadoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				provisionempleadoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProvisionEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = provisionempleadoValidator.getInvalidValues(this.provisionempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProvisionEmpleado provisionempleado,List<ProvisionEmpleado> provisionempleados) throws Exception {
		try	{		
			ProvisionEmpleadoConstantesFunciones.actualizarLista(provisionempleado,provisionempleados,this.provisionempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProvisionEmpleado provisionempleado,List<ProvisionEmpleado> provisionempleados) throws Exception {
		try	{			
			ProvisionEmpleadoConstantesFunciones.actualizarSelectedLista(provisionempleado,provisionempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProvisionEmpleado> provisionempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				provisionempleadosLocal=this.provisionempleadoLogic.getProvisionEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				provisionempleadosLocal=this.provisionempleados;
			}
			//ARCHITECTURE
		
			for(ProvisionEmpleado provisionempleadoLocal:provisionempleadosLocal) {
				if(this.permiteMantenimiento(provisionempleadoLocal) && provisionempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProvisionEmpleadoConstantesFunciones.getProvisionEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_empresaProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_empleadoProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_estructuraProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.IDTIPOPROVISIONEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_tipo_provision_empleadoProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.IDDEFIPROVISIONEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_defi_provision_empleadoProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_anioProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_mesProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelfechaProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.FECHALIQUIDACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelfecha_liquidacionProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.VALORMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_mesProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.VALORPAGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_pagaProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.VALORVACACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_vacacionProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvisionEmpleadoConstantesFunciones.VALORLIQUIDACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_liquidacionProvisionEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_empresaProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_empleadoProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_estructuraProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_tipo_provision_empleadoProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_defi_provision_empleadoProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_anioProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelid_mesProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelfechaProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelfecha_liquidacionProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_mesProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_pagaProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_vacacionProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_liquidacionProvisionEmpleado,"");
		
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
		this.iIdNuevoProvisionEmpleado--;	
		
		
		this.provisionempleadoAux=new ProvisionEmpleado();
		
		this.provisionempleadoAux.setId(this.iIdNuevoProvisionEmpleado);
		this.provisionempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.provisionempleadoLogic.getProvisionEmpleados().add(this.provisionempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.provisionempleados.add(this.provisionempleadoAux);
		}
		//ARCHITECTURE
		
		this.provisionempleado=this.provisionempleadoAux;
		
		if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProvisionEmpleado(this.provisionempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyProvisionEmpleado(this.provisionempleado);
		}
				
		//this.setDefaultControlesProvisionEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProvisionEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProvisionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProvisionEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProvisionEmpleado(this.provisionempleadoBean,this.provisionempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
			classes=ProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.provisionempleadoReturnGeneral=provisionempleadoLogic.procesarEventosProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.provisionempleadoLogic.getProvisionEmpleados(),this.provisionempleado,this.provisionempleadoParameterGeneral,this.isEsNuevoProvisionEmpleado,classes);//this.provisionempleadoLogic.getProvisionEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProvisionEmpleado(this.provisionempleadoReturnGeneral,this.provisionempleadoBean,false);
		
		if(this.provisionempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProvisionEmpleado(this.provisionempleadoReturnGeneral.getProvisionEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProvisionEmpleado(this.provisionempleadoReturnGeneral.getProvisionEmpleado());
		}
		
		if(this.provisionempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProvisionEmpleado(this.provisionempleadoReturnGeneral.getProvisionEmpleado(),classes);//this.provisionempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProvisionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProvisionEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormProvisionEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProvisionEmpleado(false);
						
			if(provisionempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProvisionEmpleado();
			}
			
			this.actualizarVisualTableDatosProvisionEmpleado();
			
			this.jTableDatosProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoProvisionEmpleado(), this.getIndiceNuevoProvisionEmpleado());
			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesProvisionEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProvisionEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfechaProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarfechaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfecha_liquidacionProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarfecha_liquidacionProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_mesProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarvalor_mesProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_pagaProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarvalor_pagaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_vacacionProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarvalor_vacacionProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_liquidacionProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarvalor_liquidacionProvisionEmpleado);	
		//
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarid_empresaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarid_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarid_estructuraProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarid_tipo_provision_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarid_defi_provision_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarid_anioProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setEnabled(isHabilitar && this.provisionempleadoConstantesFunciones.activarid_mesProvisionEmpleado);
	};
	
	public void setDefaultControlesProvisionEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProvisionEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.provisionempleadoSessionBean.setConGuardarRelaciones(true);			
			this.provisionempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.setVisible(true);
			
					
		} else {
			//this.provisionempleadoSessionBean.setConGuardarRelaciones(false);			
			this.provisionempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProvisionEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
				if(provisionempleadoAux.getId().equals(this.iIdNuevoProvisionEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProvisionEmpleado provisionempleadoAux:this.provisionempleados) {
				if(provisionempleadoAux.getId().equals(this.iIdNuevoProvisionEmpleado)) {
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
	
	public int getIndiceActualProvisionEmpleado(ProvisionEmpleado provisionempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
				if(provisionempleadoAux.getId().equals(provisionempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProvisionEmpleado provisionempleadoAux:this.provisionempleados) {
				if(provisionempleadoAux.getId().equals(provisionempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProvisionEmpleado(ProvisionEmpleado provisionempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
				if(provisionempleadoAux.getProvisionEmpleadoOriginal().getId().equals(provisionempleadoOriginal.getId())) {
					existe=true;
					provisionempleadoOriginal.setId(provisionempleadoAux.getId());
					provisionempleadoOriginal.setVersionRow(provisionempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProvisionEmpleado provisionempleadoAux:this.provisionempleados) {
				if(provisionempleadoAux.getProvisionEmpleadoOriginal().getId().equals(provisionempleadoOriginal.getId())) {
					existe=true;
					provisionempleadoOriginal.setId(provisionempleadoAux.getId());
					provisionempleadoOriginal.setVersionRow(provisionempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProvisionEmpleado(Boolean esParaCancelar) throws Exception {
		provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
		provisionempleadoAux=new ProvisionEmpleado();
		
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
					if(provisionempleadoAux.getId()<0) {
						provisionempleadosAux.add(provisionempleadoAux);
					}		
				}
				this.iIdNuevoProvisionEmpleado=0L;
				this.provisionempleadoLogic.getProvisionEmpleados().removeAll(provisionempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProvisionEmpleado provisionempleadoAux:this.provisionempleados) {
					if(provisionempleadoAux.getId()<0) {
						provisionempleadosAux.add(provisionempleadoAux);
					}		
				}
				this.iIdNuevoProvisionEmpleado=0L;
				this.provisionempleados.removeAll(provisionempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProvisionEmpleado 
					&& this.provisionempleadoLogic.getProvisionEmpleados().size()>0
					) {
					provisionempleadoAux=this.provisionempleadoLogic.getProvisionEmpleados().get(this.provisionempleadoLogic.getProvisionEmpleados().size() - 1);
				
					if(provisionempleadoAux.getId()<0) {
						this.provisionempleadoLogic.getProvisionEmpleados().remove(provisionempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProvisionEmpleado && this.provisionempleados.size()>0) {
					provisionempleadoAux=this.provisionempleados.get(this.provisionempleados.size() - 1);
				
					if(provisionempleadoAux.getId()<0) {
						this.provisionempleados.remove(provisionempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProvisionEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(provisionempleado.getId()<0) {
				this.provisionempleadoLogic.getProvisionEmpleados().remove(this.provisionempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(provisionempleado.getId()<0) {
				this.provisionempleados.remove(this.provisionempleado);
			}
		}			
	}
	
	public void setEstadosInicialesProvisionEmpleado(List<ProvisionEmpleado> provisionempleadosAux) throws Exception {
		ProvisionEmpleadoConstantesFunciones.setEstadosInicialesProvisionEmpleado(provisionempleadosAux);
	}
	
	public void setEstadosInicialesProvisionEmpleado(ProvisionEmpleado provisionempleadoAux) throws Exception {
		ProvisionEmpleadoConstantesFunciones.setEstadosInicialesProvisionEmpleado(provisionempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProvisionEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProvisionEmpleadoActual()) {
				if(!this.isEsNuevoProvisionEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProvisionEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProvisionEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Provision Empleado ?", "MANTENIMIENTO DE Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProvisionEmpleado provisionempleado) throws Exception {
		ProvisionEmpleadoConstantesFunciones.seleccionarAsignar(this.provisionempleado,provisionempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProvisionEmpleado=this.isPermisoActualizarOriginalProvisionEmpleado;
			
			
			this.seleccionarAsignar(provisionempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProvisionEmpleadoConstantesFunciones.quitarEspaciosProvisionEmpleado(this.provisionempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.provisionempleadoSessionBean.setsFuncionBusquedaRapida(this.provisionempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProvisionEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProvisionEmpleado(esParaCancelar);				
				this.cancelarNuevoProvisionEmpleado(esParaCancelar);								
			}
			
			this.provisionempleado=new ProvisionEmpleado();
			
			this.inicializarProvisionEmpleado();
			
			this.actualizarEstadoCeldasBotonesProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProvisionEmpleado() throws Exception {
		try {
			ProvisionEmpleadoConstantesFunciones.inicializarProvisionEmpleado(this.provisionempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.provisionempleadoLogic.getProvisionEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProvisionEmpleados(String sAccionBusqueda,List<ProvisionEmpleado> provisionempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="ProvisionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProvisionEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProvisionEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProvisionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Provision Empleados");		
		parameters.put("busquedapor", ProvisionEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProvisionEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProvisionEmpleado=new JRBeanArrayDataSource(ProvisionEmpleadoJInternalFrame.TraerProvisionEmpleadoBeans(provisionempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProvisionEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProvisionEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProvisionEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProvisionEmpleadoBean.TraerProvisionEmpleadoBeans(provisionempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,provisionempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,provisionempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProvisionEmpleadoActionPerformed(null);
					//this.generarExcelReporteProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,provisionempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,provisionempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,provisionempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,provisionempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<ProvisionEmpleado> provisionempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provisionempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProvisionEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProvisionEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProvisionEmpleado provisionempleado : provisionempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProvisionEmpleadoConstantesFunciones.generarExcelReporteDataProvisionEmpleado("NORMAL",row,workbook,provisionempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProvisionEmpleado(String sTipo,Row row,Workbook workbook) {
		
		ProvisionEmpleadoConstantesFunciones.generarExcelReporteHeaderProvisionEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<ProvisionEmpleado> provisionempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provisionempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProvisionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProvisionEmpleado provisionempleado : provisionempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProvisionEmpleadoConstantesFunciones.getProvisionEmpleadoDescripcion(provisionempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.gettipoprovisionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getdefiprovisionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getfecha_liquidacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getvalor_mes());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getvalor_paga());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getvalor_vacacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provisionempleado.getvalor_liquidacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<ProvisionEmpleado> provisionempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProvisionEmpleado> provisionempleadosRespaldo=null;
		
		classes=ProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.provisionempleadoLogic.setDatosCliente(this.datosCliente);
		this.provisionempleadoLogic.setDatosDeep(this.datosDeep);
		this.provisionempleadoLogic.setIsConDeep(true);
		
		provisionempleadosRespaldo=this.provisionempleadoLogic.getProvisionEmpleados();
		
		this.provisionempleadoLogic.setProvisionEmpleados(provisionempleadosParaReportes);	
		this.provisionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		provisionempleadosParaReportes=this.provisionempleadoLogic.getProvisionEmpleados();
		this.provisionempleadoLogic.setProvisionEmpleados(provisionempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provisionempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProvisionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProvisionEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProvisionEmpleado provisionempleado : provisionempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProvisionEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProvisionEmpleadoConstantesFunciones.generarExcelReporteDataProvisionEmpleado("NORMAL",row,workbook,provisionempleado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProvisionEmpleadoConstantesFunciones.getProvisionEmpleadoDescripcion(provisionempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProvisionEmpleado() throws Exception {		
		this.startProcessProvisionEmpleado(true);
	}
	
	public void startProcessProvisionEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProvisionEmpleado ,this.jPanelParametrosReportesProvisionEmpleado, this.jScrollPanelDatosProvisionEmpleado,this.jPanelPaginacionProvisionEmpleado, this.jScrollPanelDatosEdicionProvisionEmpleado, this.jPanelAccionesProvisionEmpleado,this.jPanelAccionesFormularioProvisionEmpleado,this.jmenuBarProvisionEmpleado,this.jmenuBarDetalleProvisionEmpleado,this.jTtoolBarProvisionEmpleado,this.jTtoolBarDetalleProvisionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasProvisionEmpleado=this.jTabbedPaneBusquedasProvisionEmpleado; 
		
		final JPanel jPanelParametrosReportesProvisionEmpleado=this.jPanelParametrosReportesProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosProvisionEmpleado=this.jScrollPanelDatosProvisionEmpleado;
		final JTable jTableDatosProvisionEmpleado=this.jTableDatosProvisionEmpleado;		
		final JPanel jPanelPaginacionProvisionEmpleado=this.jPanelPaginacionProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionProvisionEmpleado=this.jScrollPanelDatosEdicionProvisionEmpleado;
		final JPanel jPanelAccionesProvisionEmpleado=this.jPanelAccionesProvisionEmpleado;
		
		JPanel jPanelCamposAuxiliarProvisionEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProvisionEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			jPanelCamposAuxiliarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jPanelCamposProvisionEmpleado;
			jPanelAccionesFormularioAuxiliarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jPanelAccionesFormularioProvisionEmpleado;
		}
		
		final JPanel jPanelCamposProvisionEmpleado=jPanelCamposAuxiliarProvisionEmpleado;
		final JPanel jPanelAccionesFormularioProvisionEmpleado=jPanelAccionesFormularioAuxiliarProvisionEmpleado;
		
		
		final JMenuBar jmenuBarProvisionEmpleado=this.jmenuBarProvisionEmpleado;
		final JToolBar jTtoolBarProvisionEmpleado=this.jTtoolBarProvisionEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProvisionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProvisionEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			jmenuBarDetalleAuxiliarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jmenuBarDetalleProvisionEmpleado;
			jTtoolBarDetalleAuxiliarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jTtoolBarDetalleProvisionEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleProvisionEmpleado=jmenuBarDetalleAuxiliarProvisionEmpleado;
		final JToolBar jTtoolBarDetalleProvisionEmpleado=jTtoolBarDetalleAuxiliarProvisionEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProvisionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProvisionEmpleado;
			processRunnable.jTableDatos=jTableDatosProvisionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposProvisionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionProvisionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesProvisionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProvisionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarProvisionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProvisionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarProvisionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProvisionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProvisionEmpleado ,jPanelParametrosReportesProvisionEmpleado,jTableDatosProvisionEmpleado, /*jScrollPanelDatosProvisionEmpleado,*/jPanelCamposProvisionEmpleado,jPanelPaginacionProvisionEmpleado, /*jScrollPanelDatosEdicionProvisionEmpleado,*/ jPanelAccionesProvisionEmpleado,jPanelAccionesFormularioProvisionEmpleado,jmenuBarProvisionEmpleado,jmenuBarDetalleProvisionEmpleado,jTtoolBarProvisionEmpleado,jTtoolBarDetalleProvisionEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProvisionEmpleado ,jPanelParametrosReportesProvisionEmpleado, jScrollPanelDatosProvisionEmpleado,jPanelPaginacionProvisionEmpleado, jScrollPanelDatosEdicionProvisionEmpleado, jPanelAccionesProvisionEmpleado,jPanelAccionesFormularioProvisionEmpleado,jmenuBarProvisionEmpleado,jmenuBarDetalleProvisionEmpleado,jTtoolBarProvisionEmpleado,jTtoolBarDetalleProvisionEmpleado);
						
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
	
	public void finishProcessProvisionEmpleado() {// throws Exception 
		this.finishProcessProvisionEmpleado(true);
	}
	
	public void finishProcessProvisionEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProvisionEmpleado ,this.jPanelParametrosReportesProvisionEmpleado, this.jScrollPanelDatosProvisionEmpleado,this.jPanelPaginacionProvisionEmpleado, this.jScrollPanelDatosEdicionProvisionEmpleado, this.jPanelAccionesProvisionEmpleado,this.jPanelAccionesFormularioProvisionEmpleado,this.jmenuBarProvisionEmpleado,this.jmenuBarDetalleProvisionEmpleado,this.jTtoolBarProvisionEmpleado,this.jTtoolBarDetalleProvisionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasProvisionEmpleado=this.jTabbedPaneBusquedasProvisionEmpleado; 
		
		final JPanel jPanelParametrosReportesProvisionEmpleado=this.jPanelParametrosReportesProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosProvisionEmpleado=this.jScrollPanelDatosProvisionEmpleado;
		final JTable jTableDatosProvisionEmpleado=this.jTableDatosProvisionEmpleado;		
		final JPanel jPanelPaginacionProvisionEmpleado=this.jPanelPaginacionProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionProvisionEmpleado=this.jScrollPanelDatosEdicionProvisionEmpleado;
		final JPanel jPanelAccionesProvisionEmpleado=this.jPanelAccionesProvisionEmpleado;
		
		JPanel jPanelCamposAuxiliarProvisionEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProvisionEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			jPanelCamposAuxiliarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jPanelCamposProvisionEmpleado;
			jPanelAccionesFormularioAuxiliarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jPanelAccionesFormularioProvisionEmpleado;
		}
		
		final JPanel jPanelCamposProvisionEmpleado=jPanelCamposAuxiliarProvisionEmpleado;
		final JPanel jPanelAccionesFormularioProvisionEmpleado=jPanelAccionesFormularioAuxiliarProvisionEmpleado;
		
		
		final JMenuBar jmenuBarProvisionEmpleado=this.jmenuBarProvisionEmpleado;		
		final JToolBar jTtoolBarProvisionEmpleado=this.jTtoolBarProvisionEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarProvisionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProvisionEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			jmenuBarDetalleAuxiliarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jmenuBarDetalleProvisionEmpleado;
			jTtoolBarDetalleAuxiliarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jTtoolBarDetalleProvisionEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleProvisionEmpleado=jmenuBarDetalleAuxiliarProvisionEmpleado;
		final JToolBar jTtoolBarDetalleProvisionEmpleado=jTtoolBarDetalleAuxiliarProvisionEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProvisionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProvisionEmpleado;
			processRunnable.jTableDatos=jTableDatosProvisionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposProvisionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionProvisionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesProvisionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProvisionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarProvisionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProvisionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarProvisionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProvisionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProvisionEmpleado ,jPanelParametrosReportesProvisionEmpleado, jTableDatosProvisionEmpleado,/*jScrollPanelDatosProvisionEmpleado,*/jPanelCamposProvisionEmpleado,jPanelPaginacionProvisionEmpleado, /*jScrollPanelDatosEdicionProvisionEmpleado,*/ jPanelAccionesProvisionEmpleado,jPanelAccionesFormularioProvisionEmpleado,jmenuBarProvisionEmpleado,jmenuBarDetalleProvisionEmpleado,jTtoolBarProvisionEmpleado,jTtoolBarDetalleProvisionEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProvisionEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProvisionEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProvisionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProvisionEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProvisionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProvisionEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.provisionempleadoConstantesFunciones.getsFinalQueryProvisionEmpleado();
		String  finalQueryPaginacionTodos=this.provisionempleadoConstantesFunciones.getsFinalQueryProvisionEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoProvisionEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesProvisionEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProvisionEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.provisionempleadosEliminados= new ArrayList<ProvisionEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProvisionEmpleado();
		
				///*ProvisionEmpleadoSessionBean*/this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			
			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
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
					this.iNumeroPaginacion=ProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProvisionEmpleadoConstantesFunciones.getClassesForeignKeysOfProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/provisionempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			provisionempleadosAux= new ArrayList<ProvisionEmpleado>();
			
				
			provisionempleadoLogic.setDatosCliente(this.datosCliente);
			provisionempleadoLogic.setDatosDeep(this.datosDeep);
			provisionempleadoLogic.setIsConDeep(true);
			
			
			provisionempleadoLogic.getProvisionEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					provisionempleadoLogic.getTodosProvisionEmpleados(finalQueryGlobal,pagination);
					
					//provisionempleadoLogic.getTodosProvisionEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(provisionempleadoLogic.getProvisionEmpleados()==null|| provisionempleadoLogic.getProvisionEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							provisionempleadosAux= new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleadoLogic.getProvisionEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadosAux= new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							provisionempleadoLogic.getTodosProvisionEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//provisionempleadoLogic.getTodosProvisionEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProvisionEmpleados("Todos",provisionempleadoLogic.getProvisionEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());					
							provisionempleadoLogic.getProvisionEmpleados().addAll(provisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleados=new ArrayList<ProvisionEmpleado>();
							provisionempleados.addAll(provisionempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProvisionEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProvisionEmpleado=this.idActual;
				
				} else if(this.idProvisionEmpleadoActual!=null && this.idProvisionEmpleadoActual!=0L) {
					idProvisionEmpleado=idProvisionEmpleadoActual;
				}
				
					
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndicePorId(idProvisionEmpleado);
				
				this.provisionempleados=new ArrayList<ProvisionEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					provisionempleadoLogic.getEntity(idProvisionEmpleado);
					
					//provisionempleadoLogic.getEntityWithConnection(idProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
					provisionempleadoLogic.getProvisionEmpleados().add(provisionempleadoLogic.getProvisionEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleados=new ArrayList<ProvisionEmpleado>();
					this.provisionempleados.add(provisionempleado);
				}
				
				if(provisionempleadoLogic.getProvisionEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provisionempleadoLogic.getProvisionEmpleadosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provisionempleadoLogic.getProvisionEmpleados()==null||provisionempleadoLogic.getProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provisionempleados==null|| provisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
						provisionempleadosAux.addAll(provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provisionempleadoLogic.getProvisionEmpleadosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvisionEmpleados("FK_IdAnio",provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvisionEmpleados("FK_IdAnio",provisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
						provisionempleadoLogic.getProvisionEmpleados().addAll(provisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleados=new ArrayList<ProvisionEmpleado>();
							provisionempleados.addAll(provisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDefiProvisionEmpleado")) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provisionempleadoLogic.getProvisionEmpleadosFK_IdDefiProvisionEmpleado(finalQueryGlobal,pagination,id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provisionempleadoLogic.getProvisionEmpleados()==null||provisionempleadoLogic.getProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provisionempleados==null|| provisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
						provisionempleadosAux.addAll(provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provisionempleadoLogic.getProvisionEmpleadosFK_IdDefiProvisionEmpleado(finalQueryGlobal,pagination,id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdDefiProvisionEmpleado(id_defi_provision_empleadoFK_IdDefiProvisionEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvisionEmpleados("FK_IdDefiProvisionEmpleado",provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvisionEmpleados("FK_IdDefiProvisionEmpleado",provisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
						provisionempleadoLogic.getProvisionEmpleados().addAll(provisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleados=new ArrayList<ProvisionEmpleado>();
							provisionempleados.addAll(provisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provisionempleadoLogic.getProvisionEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provisionempleadoLogic.getProvisionEmpleados()==null||provisionempleadoLogic.getProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provisionempleados==null|| provisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
						provisionempleadosAux.addAll(provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provisionempleadoLogic.getProvisionEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvisionEmpleados("FK_IdEmpleado",provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvisionEmpleados("FK_IdEmpleado",provisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
						provisionempleadoLogic.getProvisionEmpleados().addAll(provisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleados=new ArrayList<ProvisionEmpleado>();
							provisionempleados.addAll(provisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provisionempleadoLogic.getProvisionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provisionempleadoLogic.getProvisionEmpleados()==null||provisionempleadoLogic.getProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provisionempleados==null|| provisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
						provisionempleadosAux.addAll(provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provisionempleadoLogic.getProvisionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvisionEmpleados("FK_IdEmpresa",provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvisionEmpleados("FK_IdEmpresa",provisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
						provisionempleadoLogic.getProvisionEmpleados().addAll(provisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleados=new ArrayList<ProvisionEmpleado>();
							provisionempleados.addAll(provisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provisionempleadoLogic.getProvisionEmpleadosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provisionempleadoLogic.getProvisionEmpleados()==null||provisionempleadoLogic.getProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provisionempleados==null|| provisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
						provisionempleadosAux.addAll(provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provisionempleadoLogic.getProvisionEmpleadosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvisionEmpleados("FK_IdEstructura",provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvisionEmpleados("FK_IdEstructura",provisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
						provisionempleadoLogic.getProvisionEmpleados().addAll(provisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleados=new ArrayList<ProvisionEmpleado>();
							provisionempleados.addAll(provisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provisionempleadoLogic.getProvisionEmpleadosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provisionempleadoLogic.getProvisionEmpleados()==null||provisionempleadoLogic.getProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provisionempleados==null|| provisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
						provisionempleadosAux.addAll(provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provisionempleadoLogic.getProvisionEmpleadosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvisionEmpleados("FK_IdMes",provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvisionEmpleados("FK_IdMes",provisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
						provisionempleadoLogic.getProvisionEmpleados().addAll(provisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleados=new ArrayList<ProvisionEmpleado>();
							provisionempleados.addAll(provisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProvisionEmpleado")) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoProvisionEmpleado(id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provisionempleadoLogic.getProvisionEmpleadosFK_IdTipoProvisionEmpleado(finalQueryGlobal,pagination,id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoProvisionEmpleado(id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoProvisionEmpleado(id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provisionempleadoLogic.getProvisionEmpleados()==null||provisionempleadoLogic.getProvisionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provisionempleados==null|| provisionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
						provisionempleadosAux.addAll(provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadosAux=new ArrayList<ProvisionEmpleado>();
							provisionempleadosAux.addAll(provisionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provisionempleadoLogic.getProvisionEmpleadosFK_IdTipoProvisionEmpleado(finalQueryGlobal,pagination,id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoProvisionEmpleado(id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvisionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoProvisionEmpleado(id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvisionEmpleados("FK_IdTipoProvisionEmpleado",provisionempleadoLogic.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvisionEmpleados("FK_IdTipoProvisionEmpleado",provisionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
						provisionempleadoLogic.getProvisionEmpleados().addAll(provisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleados=new ArrayList<ProvisionEmpleado>();
							provisionempleados.addAll(provisionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProvisionEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProvisionEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=provisionempleadoLogic.getProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=provisionempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=provisionempleadoLogic.getProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=provisionempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProvisionEmpleado provisionempleado) {
		Boolean permite=true;
		
		if(this.provisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProvisionEmpleadoConstantesFunciones.getOrderByListaProvisionEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProvisionEmpleadoConstantesFunciones.getOrderByListaProvisionEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProvisionEmpleado provisionempleado:provisionempleadoLogic.getProvisionEmpleados()) {
				if(provisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					provisionempleadoTotales=provisionempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProvisionEmpleado provisionempleado:this.provisionempleados) {
				if(provisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					provisionempleadoTotales=provisionempleado;
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
			this.provisionempleadoAux=new ProvisionEmpleado();
			this.provisionempleadoAux.setsType(Constantes2.S_TOTALES);
			this.provisionempleadoAux.setIsNew(false);
			this.provisionempleadoAux.setIsChanged(false);
			this.provisionempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaProvisionEmpleado(this.provisionempleadoLogic.getProvisionEmpleados(),this.provisionempleadoAux);
				
				this.provisionempleadoLogic.getProvisionEmpleados().add(this.provisionempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaProvisionEmpleado(this.provisionempleados,this.provisionempleadoAux);
				
				this.provisionempleados.add(this.provisionempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		provisionempleadoTotales=new ProvisionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.provisionempleadoLogic.getProvisionEmpleados().remove(provisionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.provisionempleados.remove(provisionempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		provisionempleadoTotales=new ProvisionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProvisionEmpleado provisionempleado:provisionempleadoLogic.getProvisionEmpleados()) {
				if(provisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					provisionempleadoTotales=provisionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaProvisionEmpleado(this.provisionempleadoLogic.getProvisionEmpleados(),provisionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProvisionEmpleado provisionempleado:this.provisionempleados) {
				if(provisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					provisionempleadoTotales=provisionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaProvisionEmpleado(this.provisionempleados,provisionempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProvisionEmpleadosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvisionEmpleadosFK_IdDefiProvisionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdDefiProvisionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvisionEmpleadosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvisionEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvisionEmpleadosFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvisionEmpleadosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvisionEmpleadosFK_IdTipoProvisionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProvisionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProvisionEmpleadosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLogic.getProvisionEmpleadosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvisionEmpleadosFK_IdDefiProvisionEmpleado(String sFinalQuery,Long id_defi_provision_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLogic.getProvisionEmpleadosFK_IdDefiProvisionEmpleado(sFinalQuery,this.pagination,id_defi_provision_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvisionEmpleadosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLogic.getProvisionEmpleadosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvisionEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLogic.getProvisionEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvisionEmpleadosFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLogic.getProvisionEmpleadosFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvisionEmpleadosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLogic.getProvisionEmpleadosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvisionEmpleadosFK_IdTipoProvisionEmpleado(String sFinalQuery,Long id_tipo_provision_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLogic.getProvisionEmpleadosFK_IdTipoProvisionEmpleado(sFinalQuery,this.pagination,id_tipo_provision_empleado);
				
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
	
	public void inicializarPermisosProvisionEmpleado() {
		this.isPermisoTodoProvisionEmpleado=false;
		this.isPermisoNuevoProvisionEmpleado=false;
		this.isPermisoActualizarProvisionEmpleado=false;
		this.isPermisoActualizarOriginalProvisionEmpleado=false;
		this.isPermisoEliminarProvisionEmpleado=false;
		this.isPermisoGuardarCambiosProvisionEmpleado=false;
		this.isPermisoConsultaProvisionEmpleado=false;
		this.isPermisoBusquedaProvisionEmpleado=false;
		this.isPermisoReporteProvisionEmpleado=false;		
		this.isPermisoOrdenProvisionEmpleado=false;		
		this.isPermisoPaginacionMedioProvisionEmpleado=false;		
		this.isPermisoPaginacionAltoProvisionEmpleado=false;
		this.isPermisoPaginacionTodoProvisionEmpleado=false;
		this.isPermisoCopiarProvisionEmpleado=false;		
		this.isPermisoVerFormProvisionEmpleado=false;		
		this.isPermisoDuplicarProvisionEmpleado=false;		
		this.isPermisoOrdenProvisionEmpleado=false;		
	}
	
	public void setPermisosUsuarioProvisionEmpleado(Boolean isPermiso) {
		this.isPermisoTodoProvisionEmpleado=isPermiso;
		this.isPermisoNuevoProvisionEmpleado=isPermiso;
		this.isPermisoActualizarProvisionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalProvisionEmpleado=isPermiso;
		this.isPermisoEliminarProvisionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosProvisionEmpleado=isPermiso;
		this.isPermisoConsultaProvisionEmpleado=isPermiso;
		this.isPermisoBusquedaProvisionEmpleado=isPermiso;
		this.isPermisoReporteProvisionEmpleado=isPermiso;
		this.isPermisoOrdenProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoProvisionEmpleado=isPermiso;		
		this.isPermisoCopiarProvisionEmpleado=isPermiso;		
		this.isPermisoVerFormProvisionEmpleado=isPermiso;		
		this.isPermisoDuplicarProvisionEmpleado=isPermiso;
		this.isPermisoOrdenProvisionEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProvisionEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoProvisionEmpleado=isPermiso;
		this.isPermisoNuevoProvisionEmpleado=isPermiso;
		this.isPermisoActualizarProvisionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalProvisionEmpleado=isPermiso;
		this.isPermisoEliminarProvisionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosProvisionEmpleado=isPermiso;
		//this.isPermisoConsultaProvisionEmpleado=isPermiso;
		//this.isPermisoBusquedaProvisionEmpleado=isPermiso;
		//this.isPermisoReporteProvisionEmpleado=isPermiso;
		//this.isPermisoOrdenProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoProvisionEmpleado=isPermiso;		
		//this.isPermisoCopiarProvisionEmpleado=isPermiso;		
		//this.isPermisoDuplicarProvisionEmpleado=isPermiso;
		//this.isPermisoOrdenProvisionEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProvisionEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProvisionEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProvisionEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProvisionEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProvisionEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProvisionEmpleadoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProvisionEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProvisionEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProvisionEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProvisionEmpleado=this.isPermisoActualizarProvisionEmpleado;
			this.isPermisoEliminarProvisionEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProvisionEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProvisionEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProvisionEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProvisionEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProvisionEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProvisionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProvisionEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProvisionEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProvisionEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProvisionEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProvisionEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProvisionEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProvisionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProvisionEmpleado.setToolTipText(this.jTableDatosProvisionEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProvisionEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProvisionEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProvisionEmpleado() throws Exception {
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
	public void inicializarCombosForeignKeyProvisionEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.tipoprovisionempleadosForeignKey=new ArrayList();
				this.defiprovisionempleadosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProvisionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProvisionEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProvisionEmpleadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProvisionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDefiProvisionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoProvisionEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprovisionempleadosForeignKey==null||this.tipoprovisionempleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoProvisionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProvisionEmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProvisionEmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProvisionEmpleadosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyProvisionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProvisionEmpleadoParameterReturnGeneral provisionempleadoReturnGeneral=new ProvisionEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.provisionempleadoConstantesFunciones.cargarid_empresaProvisionEmpleado)
					 || (this.esRecargarFks && this.provisionempleadoConstantesFunciones.cargarid_empresaProvisionEmpleado)) {

					if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+provisionempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.provisionempleadoConstantesFunciones.cargarid_empleadoProvisionEmpleado)
					 || (this.esRecargarFks && this.provisionempleadoConstantesFunciones.cargarid_empleadoProvisionEmpleado)) {

					if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+provisionempleadoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.provisionempleadoConstantesFunciones.cargarid_estructuraProvisionEmpleado)
					 || (this.esRecargarFks && this.provisionempleadoConstantesFunciones.cargarid_estructuraProvisionEmpleado)) {

					if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+provisionempleadoSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalTipoProvisionEmpleado="";

				if(((this.tipoprovisionempleadosForeignKey==null||this.tipoprovisionempleadosForeignKey.size()<=0) && this.provisionempleadoConstantesFunciones.cargarid_tipo_provision_empleadoProvisionEmpleado)
					 || (this.esRecargarFks && this.provisionempleadoConstantesFunciones.cargarid_tipo_provision_empleadoProvisionEmpleado)) {

					if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProvisionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoProvisionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProvisionEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProvisionEmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProvisionEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProvisionEmpleado, "");
						finalQueryGlobalTipoProvisionEmpleado+=TipoProvisionEmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProvisionEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProvisionEmpleado=" WHERE " + ConstantesSql.ID + "="+provisionempleadoSessionBean.getlidTipoProvisionEmpleadoActual();
					}
				} else {
					finalQueryGlobalTipoProvisionEmpleado="NONE";
				}


				String finalQueryGlobalDefiProvisionEmpleado="";

				if(((this.defiprovisionempleadosForeignKey==null||this.defiprovisionempleadosForeignKey.size()<=0) && this.provisionempleadoConstantesFunciones.cargarid_defi_provision_empleadoProvisionEmpleado)
					 || (this.esRecargarFks && this.provisionempleadoConstantesFunciones.cargarid_defi_provision_empleadoProvisionEmpleado)) {

					if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DefiProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesDefiProvisionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDefiProvisionEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DefiProvisionEmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalDefiProvisionEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalDefiProvisionEmpleado, "");
						finalQueryGlobalDefiProvisionEmpleado+=DefiProvisionEmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDefiProvisionEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDefiProvisionEmpleado=" WHERE " + ConstantesSql.ID + "="+provisionempleadoSessionBean.getlidDefiProvisionEmpleadoActual();
					}
				} else {
					finalQueryGlobalDefiProvisionEmpleado="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.provisionempleadoConstantesFunciones.cargarid_anioProvisionEmpleado)
					 || (this.esRecargarFks && this.provisionempleadoConstantesFunciones.cargarid_anioProvisionEmpleado)) {

					if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+provisionempleadoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.provisionempleadoConstantesFunciones.cargarid_mesProvisionEmpleado)
					 || (this.esRecargarFks && this.provisionempleadoConstantesFunciones.cargarid_mesProvisionEmpleado)) {

					if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+provisionempleadoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				provisionempleadoReturnGeneral=provisionempleadoLogic.cargarCombosLoteForeignKeyProvisionEmpleado(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalEstructura,finalQueryGlobalTipoProvisionEmpleado,finalQueryGlobalDefiProvisionEmpleado,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=provisionempleadoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=provisionempleadoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=provisionempleadoReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalTipoProvisionEmpleado.equals("NONE")) {
				this.tipoprovisionempleadosForeignKey=provisionempleadoReturnGeneral.gettipoprovisionempleadosForeignKey();
			}

			if(!finalQueryGlobalDefiProvisionEmpleado.equals("NONE")) {
				this.defiprovisionempleadosForeignKey=provisionempleadoReturnGeneral.getdefiprovisionempleadosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=provisionempleadoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=provisionempleadoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProvisionEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyTipoProvisionEmpleado();
			this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.provisionempleadoSessionBean==null) {
				this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyTipoProvisionEmpleado()throws Exception {
		try {

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProvisionEmpleado()) {
				TipoProvisionEmpleado tipoprovisionempleado=new TipoProvisionEmpleado();
				TipoProvisionEmpleadoConstantesFunciones.setTipoProvisionEmpleadoDescripcion(tipoprovisionempleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprovisionempleado.setId(null);

				if(!TipoProvisionEmpleadoConstantesFunciones.ExisteEnLista(this.tipoprovisionempleadosForeignKey,tipoprovisionempleado,true)) {

					this.tipoprovisionempleadosForeignKey.add(0,tipoprovisionempleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDefiProvisionEmpleado()throws Exception {
		try {

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.provisionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyProvisionEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProvisionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProvisionEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.provisionempleado.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
				this.provisionempleado.setfecha_liquidacion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProvisionEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProvisionEmpleado(ProvisionEmpleado provisionempleado)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(provisionempleado.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(provisionempleado.getid_estructura(),false,"Formulario");
			this.setActualTipoProvisionEmpleadoForeignKey(provisionempleado.getid_tipo_provision_empleado(),false,"Formulario");
			this.setActualDefiProvisionEmpleadoForeignKey(provisionempleado.getid_defi_provision_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProvisionEmpleado(ProvisionEmpleado provisionempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProvisionEmpleado()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.provisionempleadoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.provisionempleadoConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualTipoProvisionEmpleadoForeignKey(this.provisionempleadoConstantesFunciones.getid_tipo_provision_empleado(),false,"Formulario");
			this.setActualDefiProvisionEmpleadoForeignKey(this.provisionempleadoConstantesFunciones.getid_defi_provision_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProvisionEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProvisionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProvisionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProvisionEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProvisionEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameTipoProvisionEmpleadosForeignKey("Todos");
			this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProvisionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProvisionEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDefiProvisionEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProvisionEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public ProvisionEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProvisionEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProvisionEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean(); 
		this.provisionempleadoConstantesFunciones=new ProvisionEmpleadoConstantesFunciones(); 
		this.provisionempleadoBean=new ProvisionEmpleado();//(this.provisionempleadoConstantesFunciones); 		
		this.provisionempleadoReturnGeneral=new ProvisionEmpleadoParameterReturnGeneral(); 
		
		this.provisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.provisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProvisionEmpleado(true);
			
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
			
			this.provisionempleadoConstantesFunciones=new ProvisionEmpleadoConstantesFunciones(); 
			this.provisionempleadoBean=new ProvisionEmpleado();//this.provisionempleadoConstantesFunciones); 			
			this.provisionempleadoReturnGeneral=new ProvisionEmpleadoParameterReturnGeneral(); 
		
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Provision Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.provisionempleado=new ProvisionEmpleado();
			this.provisionempleados = new ArrayList<ProvisionEmpleado>();
			this.provisionempleadosAux = new ArrayList<ProvisionEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic=new ProvisionEmpleadoLogic();
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.provisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.provisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProvisionEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProvisionEmpleado);	
					}
					
					if(this.jInternalFrameImportacionProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProvisionEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProvisionEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProvisionEmpleado);
				this.jInternalFrameDetalleFormProvisionEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormProvisionEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProvisionEmpleado);
					this.jInternalFrameReporteDinamicoProvisionEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoProvisionEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProvisionEmpleado);
					this.jInternalFrameImportacionProvisionEmpleado.setVisible(false);
					this.jInternalFrameImportacionProvisionEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProvisionEmpleado);
					this.jInternalFrameOrderByProvisionEmpleado.setVisible(false);
					this.jInternalFrameOrderByProvisionEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProvisionEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.provisionempleadoReturnGeneral=new ProvisionEmpleadoParameterReturnGeneral();
			
			this.provisionempleadoParameterGeneral=new ProvisionEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.provisionempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.provisionempleadoSessionBean.getEsGuardarRelacionado(),this.provisionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.provisionempleadoSessionBean.getEsGuardarRelacionado(),this.provisionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProvisionEmpleado=false;
			this.isVisibilidadCeldaDuplicarProvisionEmpleado=true;
			this.isVisibilidadCeldaCopiarProvisionEmpleado=true;
			this.isVisibilidadCeldaVerFormProvisionEmpleado=true;
			this.isVisibilidadCeldaOrdenProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdDefiProvisionEmpleado=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdTipoProvisionEmpleado=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProvisionEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProvisionEmpleado(false);
			
			this.setPermisosUsuarioProvisionEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.provisionempleadoSessionBean.getEsGuardarRelacionado() && this.provisionempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProvisionEmpleadoClasesRelacionadas();
			}
			
			if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProvisionEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProvisionEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProvisionEmpleado();
			}
			
			if(!this.isPermisoBusquedaProvisionEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProvisionEmpleado,this.isPermisoPaginacionMedioProvisionEmpleado,this.isPermisoPaginacionTodoProvisionEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProvisionEmpleadoConstantesFunciones.getTiposSeleccionarProvisionEmpleado());
				
				this.tiposColumnasSelect=ProvisionEmpleadoConstantesFunciones.getTiposSeleccionarProvisionEmpleado(true);
				
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
			//if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProvisionEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProvisionEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProvisionEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProvisionEmpleado() ;
			
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
			this.tipoprovisionempleadoLogic=new TipoProvisionEmpleadoLogic();
			this.defiprovisionempleadoLogic=new DefiProvisionEmpleadoLogic();
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
				provisionempleadoImplementable= (ProvisionEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProvisionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				provisionempleadoImplementableHome= (ProvisionEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProvisionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.provisionempleados= new ArrayList<ProvisionEmpleado>();
			this.provisionempleadosEliminados= new ArrayList<ProvisionEmpleado>();
						
			this.isEsNuevoProvisionEmpleado=false;
			this.esParaAccionDesdeFormularioProvisionEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.tipoprovisionempleadosForeignKey=new ArrayList<TipoProvisionEmpleado>() ;
			this.defiprovisionempleadosForeignKey=new ArrayList<DefiProvisionEmpleado>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProvisionEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProvisionEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProvisionEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProvisionEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProvisionEmpleado();
			}
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProvisionEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProvisionEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProvisionEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProvisionEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProvisionEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProvisionEmpleado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProvisionEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProvisionEmpleado();	
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
	
	public void cargarCombosForeignKeyProvisionEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProvisionEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProvisionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProvisionEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProvisionEmpleado();
		
		this.cargarCombosFrameForeignKeyProvisionEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProvisionEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProvisionEmpleado();
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

	public void cargarCombosForeignKeyTipoProvisionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProvisionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProvisionEmpleado();
				this.cargarCombosFrameTipoProvisionEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProvisionEmpleado(this.tipoprovisionempleadosForeignKey);

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
	
	public void jButtonNuevoProvisionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
			
			if(jTableDatosProvisionEmpleado.getRowCount()>=1) {
				jTableDatosProvisionEmpleado.removeRowSelectionInterval(0, jTableDatosProvisionEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoProvisionEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProvisionEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProvisionEmpleado(true);			
			//this.provisionempleado=new ProvisionEmpleado();
			//this.provisionempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProvisionEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProvisionEmpleado() ;
			
			if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProvisionEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.provisionempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);				
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
			if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProvisionEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProvisionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProvisionEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProvisionEmpleado.getSelectedRows().length;			
			}
			
			provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProvisionEmpleado--;			
				//ProvisionEmpleado provisionempleadoAux= new ProvisionEmpleado();			
				//provisionempleadoAux.setId(this.iIdNuevoProvisionEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProvisionEmpleado provisionempleadoOrigen=new ProvisionEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProvisionEmpleado provisionempleadoOrigen : provisionempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							provisionempleadoOrigen =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provisionempleadoOrigen =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProvisionEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.provisionempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProvisionEmpleado(provisionempleadoOrigen,this.provisionempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.provisionempleadoLogic.getProvisionEmpleados().add(this.provisionempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.provisionempleados.add(this.provisionempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProvisionEmpleado(false);
				
				this.jTableDatosProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoProvisionEmpleado(), this.getIndiceNuevoProvisionEmpleado());
				
				int iLastRow =  this.jTableDatosProvisionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProvisionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProvisionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProvisionEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();									
		
			ProvisionEmpleado provisionempleadoOrigen=new ProvisionEmpleado();
			ProvisionEmpleado provisionempleadoDestino=new ProvisionEmpleado();
				
			provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProvisionEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || provisionempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProvisionEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoOrigen =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						provisionempleadoOrigen =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provisionempleadoDestino =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						provisionempleadoDestino =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				provisionempleadoOrigen =provisionempleadosSeleccionados.get(0);
				provisionempleadoDestino =provisionempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProvisionEmpleado(provisionempleadoOrigen,provisionempleadoDestino,true,false);
				
				provisionempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(provisionempleadoDestino,provisionempleadoLogic.getProvisionEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(provisionempleadoDestino,provisionempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProvisionEmpleado(false);
				
				//this.jTableDatosProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoProvisionEmpleado(), this.getIndiceNuevoProvisionEmpleado());
				
				int iLastRow =  this.jTableDatosProvisionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProvisionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProvisionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProvisionEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProvisionEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProvisionEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProvisionEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionProvisionEmpleado.setVisible(!isVisible);
			this.jPanelAccionesProvisionEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProvisionEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProvisionEmpleado();
			
			this.abrirFrameOrderByProvisionEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProvisionEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProvisionEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProvisionEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormProvisionEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProvisionEmpleado.setSize(this.jInternalFrameDetalleFormProvisionEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormProvisionEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProvisionEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProvisionEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProvisionEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormProvisionEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProvisionEmpleado.jContentPaneDetalleProvisionEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProvisionEmpleado.jContentPaneDetalleProvisionEmpleado.getWidth(),ProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProvisionEmpleado.jContentPaneDetalleProvisionEmpleado.getWidth(),ProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProvisionEmpleado.jContentPaneDetalleProvisionEmpleado.getWidth(),ProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProvisionEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormProvisionEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProvisionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProvisionEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProvisionEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProvisionEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProvisionEmpleado);
				this.jInternalFrameOrderByProvisionEmpleado.setVisible(false);
				this.jInternalFrameOrderByProvisionEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByProvisionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProvisionEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByProvisionEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProvisionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProvisionEmpleado==null) {
				
				this.jInternalFrameImportacionProvisionEmpleado=new ImportacionJInternalFrame(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProvisionEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProvisionEmpleado);
				this.jInternalFrameImportacionProvisionEmpleado.setVisible(false);
				this.jInternalFrameImportacionProvisionEmpleado.setSelected(false);


				this.jInternalFrameImportacionProvisionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProvisionEmpleado"));
				this.jInternalFrameImportacionProvisionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProvisionEmpleado"));
				this.jInternalFrameImportacionProvisionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProvisionEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProvisionEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProvisionEmpleado==null) {
				this.jInternalFrameReporteDinamicoProvisionEmpleado=new ReporteDinamicoJInternalFrame(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProvisionEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProvisionEmpleado);
				this.jInternalFrameReporteDinamicoProvisionEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoProvisionEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProvisionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoProvisionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoProvisionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProvisionEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProvisionEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProvisionEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProvisionEmpleado);
			
	       	this.jInternalFrameDetalleFormProvisionEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormProvisionEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormProvisionEmpleado.dispose();
			//this.jInternalFrameDetalleFormProvisionEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProvisionEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProvisionEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProvisionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProvisionEmpleado.setVisible(true);
	        this.jInternalFrameImportacionProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProvisionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProvisionEmpleado.setVisible(true);
	        this.jInternalFrameOrderByProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProvisionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProvisionEmpleado.setVisible(false);
	        this.jInternalFrameOrderByProvisionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProvisionEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProvisionEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoProvisionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProvisionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProvisionEmpleado.setVisible(false);
	        this.jInternalFrameImportacionProvisionEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosProvisionEmpleado.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderProvisionEmpleado.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProvisionEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProvisionEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProvisionEmpleado(true);
			//this.isEsNuevoProvisionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProvisionEmpleado(false) ;
			
			if(provisionempleadoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProvisionEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProvisionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProvisionEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProvisionEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProvisionEmpleado(true);
			//this.isEsNuevoProvisionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.provisionempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProvisionEmpleado(false) ;
			
			if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProvisionEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProvisionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProvisionEmpleado.getSelectedRow();

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
		TableColumn tableColumnEstructura=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProvisionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProvisionEmpleado(List<TipoProvisionEmpleado> tipoprovisionempleadosForeignKey)throws Exception{
		TableColumn tableColumnTipoProvisionEmpleado=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO));
		TableCellEditor tableCellEditorTipoProvisionEmpleado =tableColumnTipoProvisionEmpleado.getCellEditor();

		TipoProvisionEmpleadoTableCell tipoprovisionempleadoTableCellFk=(TipoProvisionEmpleadoTableCell)tableCellEditorTipoProvisionEmpleado;

		if(tipoprovisionempleadoTableCellFk!=null) {
			tipoprovisionempleadoTableCellFk.settipoprovisionempleadosForeignKey(tipoprovisionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProvisionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprovisionempleadoTableCellFk.setRowActual(intSelectedRow);
			//tipoprovisionempleadoTableCellFk.settipoprovisionempleadosForeignKeyActual(tipoprovisionempleadosForeignKey);
		//}


		if(tipoprovisionempleadoTableCellFk!=null) {
			tipoprovisionempleadoTableCellFk.RecargarTipoProvisionEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDefiProvisionEmpleado(List<DefiProvisionEmpleado> defiprovisionempleadosForeignKey)throws Exception{
		TableColumn tableColumnDefiProvisionEmpleado=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO));
		TableCellEditor tableCellEditorDefiProvisionEmpleado =tableColumnDefiProvisionEmpleado.getCellEditor();

		DefiProvisionEmpleadoTableCell defiprovisionempleadoTableCellFk=(DefiProvisionEmpleadoTableCell)tableCellEditorDefiProvisionEmpleado;

		if(defiprovisionempleadoTableCellFk!=null) {
			defiprovisionempleadoTableCellFk.setdefiprovisionempleadosForeignKey(defiprovisionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProvisionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//defiprovisionempleadoTableCellFk.setRowActual(intSelectedRow);
			//defiprovisionempleadoTableCellFk.setdefiprovisionempleadosForeignKeyActual(defiprovisionempleadosForeignKey);
		//}


		if(defiprovisionempleadoTableCellFk!=null) {
			defiprovisionempleadoTableCellFk.RecargarDefiProvisionEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProvisionEmpleado.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProvisionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProvisionEmpleado(false);
			
			//if(!this.isEsNuevoProvisionEmpleado) {								
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				
			}
			
			if(this.permiteMantenimiento(this.provisionempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProvisionEmpleado=true;
					this.inicializarActualizarBindingTablaProvisionEmpleado(false);
					this.isEsNuevoProvisionEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProvisionEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProvisionEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProvisionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProvisionEmpleado(false);
				
				this.habilitarDeshabilitarControlesProvisionEmpleado(false);
			
												
				
				if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProvisionEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProvisionEmpleadoActionPerformed(evt,provisionempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProvisionEmpleado(this.provisionempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProvisionEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,provisionempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.provisionempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.provisionempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.provisionempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.provisionempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProvisionEmpleadoModel) this.jTableDatosProvisionEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProvisionEmpleado=true;
				this.inicializarActualizarBindingTablaProvisionEmpleado(false);
				this.isEsNuevoProvisionEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProvisionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProvisionEmpleado(false);
				
				this.habilitarDeshabilitarControlesProvisionEmpleado(false);
				
				
				
				if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProvisionEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProvisionEmpleado.getRowCount()>=1) {
				jTableDatosProvisionEmpleado.removeRowSelectionInterval(0, jTableDatosProvisionEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProvisionEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProvisionEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProvisionEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProvisionEmpleado(false) ;
			
			this.isEsNuevoProvisionEmpleado=false;
			
			if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProvisionEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProvisionEmpleado(false);
				
				//SI ES MANUAL
				if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProvisionEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProvisionEmpleado--;			
			//ProvisionEmpleado provisionempleadoAux= new ProvisionEmpleado();			
			//provisionempleadoAux.setId(this.iIdNuevoProvisionEmpleado);
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProvisionEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
			
			this.provisionempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.provisionempleadoLogic.getProvisionEmpleados().add(this.provisionempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.provisionempleados.add(this.provisionempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProvisionEmpleado(false);
			
			this.jTableDatosProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoProvisionEmpleado(), this.getIndiceNuevoProvisionEmpleado());
			
			int iLastRow =  this.jTableDatosProvisionEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProvisionEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProvisionEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProvisionEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProvisionEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProvisionEmpleado();
			}
			
			//this.abrirFrameTreeProvisionEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Provision EmpleadoS ?", "MANTENIMIENTO DE Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProvisionEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProvisionEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.provisionempleadoReturnGeneral=provisionempleadoLogic.procesarImportacionProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.provisionempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProvisionEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProvisionEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProvisionEmpleado.setFileImportacion(this.jInternalFrameImportacionProvisionEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProvisionEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProvisionEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProvisionEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProvisionEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		

		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProvisionEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProvisionEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteProvisionEmpleados("Todos",provisionempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProvisionEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProvisionEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProvisionEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProvisionEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DefiProvisionEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DefiProvisionEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DefiProvisionEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DefiProvisionEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaLiquidacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaLiquidacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaLiquidacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaLiquidacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorMes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorMes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorMes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorMes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPaga_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPaga_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPaga_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPaga_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorVacacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorVacacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorVacacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorVacacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorLiquidacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorLiquidacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorLiquidacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorLiquidacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProvisionEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO:
					sNombreCampoCategoria="id_tipo_provision_empleado";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					sNombreCampoCategoria="id_defi_provision_empleado";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoria="fecha_liquidacion";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES:
					sNombreCampoCategoria="valor_mes";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA:
					sNombreCampoCategoria="valor_paga";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION:
					sNombreCampoCategoria="valor_vacacion";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION:
					sNombreCampoCategoria="valor_liquidacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO:
					sNombreCampoCategoriaValor="id_tipo_provision_empleado";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					sNombreCampoCategoriaValor="id_defi_provision_empleado";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoriaValor="fecha_liquidacion";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES:
					sNombreCampoCategoriaValor="valor_mes";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA:
					sNombreCampoCategoriaValor="valor_paga";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION:
					sNombreCampoCategoriaValor="valor_vacacion";
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION:
					sNombreCampoCategoriaValor="valor_liquidacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Provision Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_provision_empleado");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Defi Provision Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_defi_provision_empleado");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Liquacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_liquidacion");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_mes");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Paga",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_paga");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Vacacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_vacacion");
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Liquacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_liquidacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provisionempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProvisionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.gettipoprovisionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getdefiprovisionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getfecha_liquidacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getvalor_mes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getvalor_paga());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getvalor_vacacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION);
					iRow++;

					for(ProvisionEmpleado provisionempleado:provisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provisionempleado.getvalor_liquidacion());
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
			//	this.getFilaCabeceraExportarExcelProvisionEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(ProvisionEmpleado provisionempleadoAux:provisionempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProvisionEmpleado(provisionempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProvisionEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProvisionEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProvisionEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProvisionEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProvisionEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProvisionEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProvisionEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProvisionEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProvisionEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosProvisionEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosProvisionEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProvisionEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProvisionEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProvisionEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProvisionEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProvisionEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProvisionEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProvisionEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProvisionEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProvisionEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProvisionEmpleado();
		
		this.inicializarActualizarBindingBotonesManualProvisionEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProvisionEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProvisionEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProvisionEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProvisionEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProvisionEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProvisionEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProvisionEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProvisionEmpleado.jCheckBoxPostAccionNuevoProvisionEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProvisionEmpleado.jCheckBoxPostAccionSinCerrarProvisionEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProvisionEmpleado.jCheckBoxPostAccionSinMensajeProvisionEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProvisionEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProvisionEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProvisionEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jCheckBoxPostAccionNuevoProvisionEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProvisionEmpleado.jCheckBoxPostAccionSinCerrarProvisionEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProvisionEmpleado.jCheckBoxPostAccionSinMensajeProvisionEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProvisionEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProvisionEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProvisionEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProvisionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProvisionEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProvisionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProvisionEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProvisionEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProvisionEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProvisionEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProvisionEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProvisionEmpleado() throws Exception {
		try	{
			if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProvisionEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProvisionEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProvisionEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProvisionEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProvisionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProvisionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProvisionEmpleado.addItem(reporte);
			}
			
			
			if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProvisionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProvisionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProvisionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProvisionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProvisionEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProvisionEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProvisionEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProvisionEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProvisionEmpleadoConstantesFunciones.getTiposSeleccionarProvisionEmpleado(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProvisionEmpleadoConstantesFunciones.getTiposSeleccionarProvisionEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProvisionEmpleadoConstantesFunciones.getTiposSeleccionarProvisionEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProvisionEmpleado.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProvisionEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioProvisionEmpleado.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioProvisionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.getSelectedItem()!=null){this.id_defi_provision_empleadoFK_IdDefiProvisionEmpleado=((DefiProvisionEmpleado)this.jComboBoxid_defi_provision_empleadoFK_IdDefiProvisionEmpleadoProvisionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoProvisionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraProvisionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesProvisionEmpleado.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesProvisionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.getSelectedItem()!=null){this.id_tipo_provision_empleadoFK_IdTipoProvisionEmpleado=((TipoProvisionEmpleado)this.jComboBoxid_tipo_provision_empleadoFK_IdTipoProvisionEmpleadoProvisionEmpleado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProvisionEmpleado(Boolean esInicializar) throws Exception {				
		if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProvisionEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProvisionEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaProvisionEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProvisionEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProvisionEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProvisionEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=provisionempleadoLogic.getProvisionEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=provisionempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProvisionEmpleado.setModel(new ProvisionEmpleadoModel(this.provisionempleadoLogic.getProvisionEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProvisionEmpleado.setModel(new ProvisionEmpleadoModel(this.provisionempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProvisionEmpleado!=null && this.jInternalFrameOrderByProvisionEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProvisionEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,provisionempleadoConstantesFunciones.resaltarSeleccionarProvisionEmpleado,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,provisionempleadoConstantesFunciones.resaltarSeleccionarProvisionEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_ID));

		if(this.provisionempleadoConstantesFunciones.mostraridProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.provisionempleadoConstantesFunciones.resaltaridProvisionEmpleado,this.provisionempleadoConstantesFunciones.activaridProvisionEmpleado,iSizeTabla,this,true,"idProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.provisionempleadoConstantesFunciones.resaltaridProvisionEmpleado,this.provisionempleadoConstantesFunciones.activaridProvisionEmpleado,this,true,"idProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.provisionempleadoConstantesFunciones.mostrarid_empresaProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_empresaProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_empresaProvisionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_empresaProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_empresaProvisionEmpleado,false,"id_empresaProvisionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.provisionempleadoConstantesFunciones.mostrarid_empleadoProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_empleadoProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_empleadoProvisionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_empleadoProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_empleadoProvisionEmpleado,true,"id_empleadoProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.provisionempleadoConstantesFunciones.mostrarid_estructuraProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_estructuraProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_estructuraProvisionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_estructuraProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_estructuraProvisionEmpleado,true,"id_estructuraProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO));

		if(this.provisionempleadoConstantesFunciones.mostrarid_tipo_provision_empleadoProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProvisionEmpleadoTableCell(this.tipoprovisionempleadosForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_tipo_provision_empleadoProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_tipo_provision_empleadoProvisionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new TipoProvisionEmpleadoTableCell(this.tipoprovisionempleadosForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_tipo_provision_empleadoProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_tipo_provision_empleadoProvisionEmpleado,true,"id_tipo_provision_empleadoProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO));

		if(this.provisionempleadoConstantesFunciones.mostrarid_defi_provision_empleadoProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DefiProvisionEmpleadoTableCell(this.defiprovisionempleadosForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_defi_provision_empleadoProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_defi_provision_empleadoProvisionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new DefiProvisionEmpleadoTableCell(this.defiprovisionempleadosForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_defi_provision_empleadoProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_defi_provision_empleadoProvisionEmpleado,true,"id_defi_provision_empleadoProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO));

		if(this.provisionempleadoConstantesFunciones.mostrarid_anioProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_anioProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_anioProvisionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_anioProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_anioProvisionEmpleado,true,"id_anioProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_IDMES));

		if(this.provisionempleadoConstantesFunciones.mostrarid_mesProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_mesProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_mesProvisionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.provisionempleadoConstantesFunciones.resaltarid_mesProvisionEmpleado,this,this.provisionempleadoConstantesFunciones.activarid_mesProvisionEmpleado,true,"id_mesProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_FECHA));

		if(this.provisionempleadoConstantesFunciones.mostrarfechaProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.provisionempleadoConstantesFunciones.resaltarfechaProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarfechaProvisionEmpleado,iSizeTabla,this,true,"fechaProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.provisionempleadoConstantesFunciones.resaltarfechaProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarfechaProvisionEmpleado,this,true,"fechaProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION));

		if(this.provisionempleadoConstantesFunciones.mostrarfecha_liquidacionProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.provisionempleadoConstantesFunciones.resaltarfecha_liquidacionProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarfecha_liquidacionProvisionEmpleado,iSizeTabla,this,true,"fecha_liquidacionProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.provisionempleadoConstantesFunciones.resaltarfecha_liquidacionProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarfecha_liquidacionProvisionEmpleado,this,true,"fecha_liquidacionProvisionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES));

		if(this.provisionempleadoConstantesFunciones.mostrarvalor_mesProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.provisionempleadoConstantesFunciones.resaltarvalor_mesProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarvalor_mesProvisionEmpleado,iSizeTabla,this,true,"valor_mesProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.provisionempleadoConstantesFunciones.resaltarvalor_mesProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarvalor_mesProvisionEmpleado,this,true,"valor_mesProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA));

		if(this.provisionempleadoConstantesFunciones.mostrarvalor_pagaProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.provisionempleadoConstantesFunciones.resaltarvalor_pagaProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarvalor_pagaProvisionEmpleado,iSizeTabla,this,true,"valor_pagaProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.provisionempleadoConstantesFunciones.resaltarvalor_pagaProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarvalor_pagaProvisionEmpleado,this,true,"valor_pagaProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION));

		if(this.provisionempleadoConstantesFunciones.mostrarvalor_vacacionProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.provisionempleadoConstantesFunciones.resaltarvalor_vacacionProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarvalor_vacacionProvisionEmpleado,iSizeTabla,this,true,"valor_vacacionProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.provisionempleadoConstantesFunciones.resaltarvalor_vacacionProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarvalor_vacacionProvisionEmpleado,this,true,"valor_vacacionProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION));

		if(this.provisionempleadoConstantesFunciones.mostrarvalor_liquidacionProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.provisionempleadoConstantesFunciones.resaltarvalor_liquidacionProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarvalor_liquidacionProvisionEmpleado,iSizeTabla,this,true,"valor_liquidacionProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.provisionempleadoConstantesFunciones.resaltarvalor_liquidacionProvisionEmpleado,this.provisionempleadoConstantesFunciones.activarvalor_liquidacionProvisionEmpleado,this,true,"valor_liquidacionProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.provisionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.provisionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProvisionEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.provisionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.provisionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProvisionEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.provisionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.provisionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProvisionEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosProvisionEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProvisionEmpleado.moveColumn(this.jTableDatosProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProvisionEmpleado.moveColumn(this.jTableDatosProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProvisionEmpleado.moveColumn(this.jTableDatosProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProvisionEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProvisionEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProvisionEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProvisionEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProvisionEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProvisionEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProvisionEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=provisionempleadoLogic.getProvisionEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=provisionempleados.size()-1;
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
		//this.jTableDatosProvisionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProvisionEmpleado();
			
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
				
				//this.isEsNuevoProvisionEmpleado=false;
					
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
				if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProvisionEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProvisionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProvisionEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.provisionempleado.getsType().equals("DUPLICADO")
				   || this.provisionempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProvisionEmpleado=true;
				
				} else {
					this.isEsNuevoProvisionEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.provisionempleado.getId()>=0 && !this.provisionempleado.getIsNew()) {						
						this.isEsNuevoProvisionEmpleado=false;
						
					} else {
						this.isEsNuevoProvisionEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProvisionEmpleado(esRelaciones);						
				
				this.seleccionarProvisionEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.provisionempleado.getId()<0) {
					this.isEsNuevoProvisionEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProvisionEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProvisionEmpleado(evt,rowIndex);
				}	
				
				if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProvisionEmpleado: " + this.dDif); 
					}
				}								
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProvisionEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.provisionempleado)) {
					if(this.provisionempleado.getId()>0) {
						this.provisionempleado.setIsDeleted(true);
						
						this.provisionempleadosEliminados.add(this.provisionempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.provisionempleadoLogic.getProvisionEmpleados().remove(this.provisionempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.provisionempleados.remove(this.provisionempleado);				
					}
					
					
					((ProvisionEmpleadoModel) this.jTableDatosProvisionEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProvisionEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProvisionEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProvisionEmpleado) {
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProvisionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProvisionEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProvisionEmpleado(this.provisionempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.provisionempleadoConstantesFunciones.cargarid_empresaProvisionEmpleado || this.provisionempleadoConstantesFunciones.event_dependid_empresaProvisionEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.provisionempleado.getid_empresa());
									//this.inicializarActualizarBindingProvisionEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(provisionempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(provisionempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.provisionempleado.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.provisionempleadoConstantesFunciones.cargarid_empleadoProvisionEmpleado || this.provisionempleadoConstantesFunciones.event_dependid_empleadoProvisionEmpleado) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.provisionempleado.getid_empleado());
									//this.inicializarActualizarBindingProvisionEmpleado(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(provisionempleado.getEmpleado()!=null) {
							this.empleadosForeignKey.add(provisionempleado.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.provisionempleado.getid_empleado(),false,"Formulario");

					//Estructura
					if(!this.provisionempleadoConstantesFunciones.cargarid_estructuraProvisionEmpleado || this.provisionempleadoConstantesFunciones.event_dependid_estructuraProvisionEmpleado) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.provisionempleado.getid_estructura());
									//this.inicializarActualizarBindingProvisionEmpleado(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(provisionempleado.getEstructura()!=null) {
							this.estructurasForeignKey.add(provisionempleado.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.provisionempleado.getid_estructura(),false,"Formulario");

					//TipoProvisionEmpleado
					if(!this.provisionempleadoConstantesFunciones.cargarid_tipo_provision_empleadoProvisionEmpleado || this.provisionempleadoConstantesFunciones.event_dependid_tipo_provision_empleadoProvisionEmpleado) {
						//this.cargarCombosTipoProvisionEmpleadosForeignKeyLista(" where id="+this.provisionempleado.getid_tipo_provision_empleado());
									//this.inicializarActualizarBindingProvisionEmpleado(false,false);
						this.tipoprovisionempleadosForeignKey=new ArrayList<TipoProvisionEmpleado>();

						if(provisionempleado.getTipoProvisionEmpleado()!=null) {
							this.tipoprovisionempleadosForeignKey.add(provisionempleado.getTipoProvisionEmpleado());
						}

						this.addItemDefectoCombosForeignKeyTipoProvisionEmpleado();
						this.cargarCombosFrameTipoProvisionEmpleadosForeignKey("Todos");
					}
					this.setActualTipoProvisionEmpleadoForeignKey(this.provisionempleado.getid_tipo_provision_empleado(),false,"Formulario");

					//DefiProvisionEmpleado
					if(!this.provisionempleadoConstantesFunciones.cargarid_defi_provision_empleadoProvisionEmpleado || this.provisionempleadoConstantesFunciones.event_dependid_defi_provision_empleadoProvisionEmpleado) {
						//this.cargarCombosDefiProvisionEmpleadosForeignKeyLista(" where id="+this.provisionempleado.getid_defi_provision_empleado());
									//this.inicializarActualizarBindingProvisionEmpleado(false,false);
						this.defiprovisionempleadosForeignKey=new ArrayList<DefiProvisionEmpleado>();

						if(provisionempleado.getDefiProvisionEmpleado()!=null) {
							this.defiprovisionempleadosForeignKey.add(provisionempleado.getDefiProvisionEmpleado());
						}

						this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
						this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Todos");
					}
					this.setActualDefiProvisionEmpleadoForeignKey(this.provisionempleado.getid_defi_provision_empleado(),false,"Formulario");

					//Anio
					if(!this.provisionempleadoConstantesFunciones.cargarid_anioProvisionEmpleado || this.provisionempleadoConstantesFunciones.event_dependid_anioProvisionEmpleado) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.provisionempleado.getid_anio());
									//this.inicializarActualizarBindingProvisionEmpleado(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(provisionempleado.getAnio()!=null) {
							this.aniosForeignKey.add(provisionempleado.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.provisionempleado.getid_anio(),false,"Formulario");

					//Mes
					if(!this.provisionempleadoConstantesFunciones.cargarid_mesProvisionEmpleado || this.provisionempleadoConstantesFunciones.event_dependid_mesProvisionEmpleado) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.provisionempleado.getid_mes());
									//this.inicializarActualizarBindingProvisionEmpleado(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(provisionempleado.getMes()!=null) {
							this.messForeignKey.add(provisionempleado.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.provisionempleado.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProvisionEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProvisionEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProvisionEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProvisionEmpleado(ProvisionEmpleado provisionempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProvisionEmpleado(provisionempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProvisionEmpleado(ProvisionEmpleado provisionempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProvisionEmpleado(provisionempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProvisionEmpleado(provisionempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProvisionEmpleado(provisionempleado);
	}
	
	public void setVariablesObjetoActualToFormularioProvisionEmpleado(ProvisionEmpleado provisionempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.setText(provisionempleado.getId().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfechaProvisionEmpleado.setDate(provisionempleado.getfecha());
			this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfecha_liquidacionProvisionEmpleado.setDate(provisionempleado.getfecha_liquidacion());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_mesProvisionEmpleado.setText(provisionempleado.getvalor_mes().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_pagaProvisionEmpleado.setText(provisionempleado.getvalor_paga().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_vacacionProvisionEmpleado.setText(provisionempleado.getvalor_vacacion().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_liquidacionProvisionEmpleado.setText(provisionempleado.getvalor_liquidacion().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProvisionEmpleado provisionempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,provisionempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProvisionEmpleado provisionempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				provisionempleadoLocal=this.provisionempleado;
			} else {
				provisionempleadoLocal=this.provisionempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(provisionempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProvisionEmpleado(provisionempleadoLocal,true);
					
					if(provisionempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(provisionempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(provisionempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProvisionEmpleado(ProvisionEmpleado provisionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProvisionEmpleado(provisionempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(provisionempleado);
	}
	
	public void setVariablesFormularioToObjetoActualProvisionEmpleado(ProvisionEmpleado provisionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProvisionEmpleado(provisionempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProvisionEmpleado(ProvisionEmpleado provisionempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.getText()==null || this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.getText()=="" || this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.setText("0");
			}

			if(conColumnasBase) {provisionempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvisionEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelIdProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			provisionempleado.setfecha(this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfechaProvisionEmpleado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvisionEmpleadoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelfechaProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			provisionempleado.setfecha_liquidacion(this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfecha_liquidacionProvisionEmpleado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelfecha_liquidacionProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			provisionempleado.setvalor_mes(Double.parseDouble(this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_mesProvisionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_mesProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			provisionempleado.setvalor_paga(Double.parseDouble(this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_pagaProvisionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_pagaProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			provisionempleado.setvalor_vacacion(Double.parseDouble(this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_vacacionProvisionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_vacacionProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			provisionempleado.setvalor_liquidacion(Double.parseDouble(this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_liquidacionProvisionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvisionEmpleado.jLabelvalor_liquidacionProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProvisionEmpleado(ProvisionEmpleado provisionempleadoBean,ProvisionEmpleado provisionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProvisionEmpleado(ProvisionEmpleado provisionempleadoOrigen,ProvisionEmpleado provisionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && provisionempleadoOrigen.getId()!=null && !provisionempleadoOrigen.getId().equals(0L))) {provisionempleado.setId(provisionempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && provisionempleadoOrigen.getfecha()!=null && !provisionempleadoOrigen.getfecha().equals(new Date()))) {provisionempleado.setfecha(provisionempleadoOrigen.getfecha());}
			if(conDefault || (!conDefault && provisionempleadoOrigen.getfecha_liquidacion()!=null && !provisionempleadoOrigen.getfecha_liquidacion().equals(new Date()))) {provisionempleado.setfecha_liquidacion(provisionempleadoOrigen.getfecha_liquidacion());}
			if(conDefault || (!conDefault && provisionempleadoOrigen.getvalor_mes()!=null && !provisionempleadoOrigen.getvalor_mes().equals(0.0))) {provisionempleado.setvalor_mes(provisionempleadoOrigen.getvalor_mes());}
			if(conDefault || (!conDefault && provisionempleadoOrigen.getvalor_paga()!=null && !provisionempleadoOrigen.getvalor_paga().equals(0.0))) {provisionempleado.setvalor_paga(provisionempleadoOrigen.getvalor_paga());}
			if(conDefault || (!conDefault && provisionempleadoOrigen.getvalor_vacacion()!=null && !provisionempleadoOrigen.getvalor_vacacion().equals(0.0))) {provisionempleado.setvalor_vacacion(provisionempleadoOrigen.getvalor_vacacion());}
			if(conDefault || (!conDefault && provisionempleadoOrigen.getvalor_liquidacion()!=null && !provisionempleadoOrigen.getvalor_liquidacion().equals(0.0))) {provisionempleado.setvalor_liquidacion(provisionempleadoOrigen.getvalor_liquidacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProvisionEmpleado(ProvisionEmpleado provisionempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.setText(provisionempleado.getId().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfechaProvisionEmpleado.setDate(provisionempleado.getfecha());
			this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfecha_liquidacionProvisionEmpleado.setDate(provisionempleado.getfecha_liquidacion());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_mesProvisionEmpleado.setText(provisionempleado.getvalor_mes().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_pagaProvisionEmpleado.setText(provisionempleado.getvalor_paga().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_vacacionProvisionEmpleado.setText(provisionempleado.getvalor_vacacion().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_liquidacionProvisionEmpleado.setText(provisionempleado.getvalor_liquidacion().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProvisionEmpleado(ProvisionEmpleadoBean provisionempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.setText(provisionempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfechaProvisionEmpleado.setDate(provisionempleadoBean.getfecha());
			this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfecha_liquidacionProvisionEmpleado.setDate(provisionempleadoBean.getfecha_liquidacion());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_mesProvisionEmpleado.setText(provisionempleadoBean.getvalor_mes().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_pagaProvisionEmpleado.setText(provisionempleadoBean.getvalor_paga().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_vacacionProvisionEmpleado.setText(provisionempleadoBean.getvalor_vacacion().toString());
			this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_liquidacionProvisionEmpleado.setText(provisionempleadoBean.getvalor_liquidacion().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProvisionEmpleado(ProvisionEmpleadoParameterReturnGeneral provisionempleadoReturnGeneral,ProvisionEmpleadoBean provisionempleadoBean,Boolean conDefault) throws Exception { 
		try {
			ProvisionEmpleado provisionempleadoLocal=new ProvisionEmpleado();
			
			provisionempleadoLocal=provisionempleadoReturnGeneral.getProvisionEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && provisionempleadoLocal.getId()!=null && !provisionempleadoLocal.getId().equals(0L))) {provisionempleadoBean.setId(provisionempleadoLocal.getId());}}
			if(conDefault || (!conDefault && provisionempleadoLocal.getfecha()!=null && !provisionempleadoLocal.getfecha().equals(new Date()))) {provisionempleadoBean.setfecha(provisionempleadoLocal.getfecha());}
			if(conDefault || (!conDefault && provisionempleadoLocal.getfecha_liquidacion()!=null && !provisionempleadoLocal.getfecha_liquidacion().equals(new Date()))) {provisionempleadoBean.setfecha_liquidacion(provisionempleadoLocal.getfecha_liquidacion());}
			if(conDefault || (!conDefault && provisionempleadoLocal.getvalor_mes()!=null && !provisionempleadoLocal.getvalor_mes().equals(0.0))) {provisionempleadoBean.setvalor_mes(provisionempleadoLocal.getvalor_mes());}
			if(conDefault || (!conDefault && provisionempleadoLocal.getvalor_paga()!=null && !provisionempleadoLocal.getvalor_paga().equals(0.0))) {provisionempleadoBean.setvalor_paga(provisionempleadoLocal.getvalor_paga());}
			if(conDefault || (!conDefault && provisionempleadoLocal.getvalor_vacacion()!=null && !provisionempleadoLocal.getvalor_vacacion().equals(0.0))) {provisionempleadoBean.setvalor_vacacion(provisionempleadoLocal.getvalor_vacacion());}
			if(conDefault || (!conDefault && provisionempleadoLocal.getvalor_liquidacion()!=null && !provisionempleadoLocal.getvalor_liquidacion().equals(0.0))) {provisionempleadoBean.setvalor_liquidacion(provisionempleadoLocal.getvalor_liquidacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProvisionEmpleadoGenerico(Long idProvisionEmpleadoSeleccionado,JComboBox jComboBoxProvisionEmpleado,List<ProvisionEmpleado> provisionempleadosLocal)throws Exception {
		try {
			ProvisionEmpleado  provisionempleadoTemp=null;

			for(ProvisionEmpleado provisionempleadoAux:provisionempleadosLocal) {
				if(provisionempleadoAux.getId()!=null && provisionempleadoAux.getId().equals(idProvisionEmpleadoSeleccionado)) {
					provisionempleadoTemp=provisionempleadoAux;
					break;
				}
			}

			jComboBoxProvisionEmpleado.setSelectedItem(provisionempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProvisionEmpleadoGenerico(JComboBox jComboBoxProvisionEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProvisionEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProvisionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProvisionEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProvisionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			provisionempleado=(ProvisionEmpleado) provisionempleadoLogic.getProvisionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			provisionempleado =(ProvisionEmpleado) provisionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!provisionempleado.getIsNew() && !provisionempleado.getIsChanged() && !provisionempleado.getIsDeleted()) {
				sDescripcion=provisionempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=provisionempleado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!provisionempleado.getIsNew() && !provisionempleado.getIsChanged() && !provisionempleado.getIsDeleted()) {
				sDescripcion=provisionempleado.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=provisionempleado.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!provisionempleado.getIsNew() && !provisionempleado.getIsChanged() && !provisionempleado.getIsDeleted()) {
				sDescripcion=provisionempleado.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=provisionempleado.getestructura_descripcion();
			}
		}

		if(sTipo.equals("TipoProvisionEmpleado")) {
			//sDescripcion=this.getActualTipoProvisionEmpleadoForeignKeyDescripcion((Long)value);
			if(!provisionempleado.getIsNew() && !provisionempleado.getIsChanged() && !provisionempleado.getIsDeleted()) {
				sDescripcion=provisionempleado.gettipoprovisionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProvisionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=provisionempleado.gettipoprovisionempleado_descripcion();
			}
		}

		if(sTipo.equals("DefiProvisionEmpleado")) {
			//sDescripcion=this.getActualDefiProvisionEmpleadoForeignKeyDescripcion((Long)value);
			if(!provisionempleado.getIsNew() && !provisionempleado.getIsChanged() && !provisionempleado.getIsDeleted()) {
				sDescripcion=provisionempleado.getdefiprovisionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualDefiProvisionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=provisionempleado.getdefiprovisionempleado_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!provisionempleado.getIsNew() && !provisionempleado.getIsChanged() && !provisionempleado.getIsDeleted()) {
				sDescripcion=provisionempleado.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=provisionempleado.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!provisionempleado.getIsNew() && !provisionempleado.getIsChanged() && !provisionempleado.getIsDeleted()) {
				sDescripcion=provisionempleado.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=provisionempleado.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProvisionEmpleado provisionempleadoRow=new ProvisionEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			provisionempleadoRow=(ProvisionEmpleado) provisionempleadoLogic.getProvisionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			provisionempleadoRow=(ProvisionEmpleado) provisionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProvisionEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado));			
			this.jButtonDuplicarProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarProvisionEmpleado && this.isPermisoDuplicarProvisionEmpleado));			
			this.jButtonCopiarProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarProvisionEmpleado && this.isPermisoCopiarProvisionEmpleado));
			this.jButtonVerFormProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormProvisionEmpleado && this.isPermisoVerFormProvisionEmpleado));
			
			this.jButtonAbrirOrderByProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenProvisionEmpleado && this.isPermisoOrdenProvisionEmpleado));			
			
			this.jButtonNuevoRelacionesProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado));			
			this.jButtonNuevoGuardarCambiosProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarProvisionEmpleado && this.isPermisoActualizarProvisionEmpleado));	
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarProvisionEmpleado && this.isPermisoActualizarProvisionEmpleado));	
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarProvisionEmpleado && this.isPermisoEliminarProvisionEmpleado));
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarProvisionEmpleado);							
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado));						
			this.jButtonDuplicarToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarProvisionEmpleado && this.isPermisoDuplicarProvisionEmpleado));						
			this.jButtonCopiarToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarProvisionEmpleado && this.isPermisoCopiarProvisionEmpleado));			
			this.jButtonVerFormToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormProvisionEmpleado && this.isPermisoVerFormProvisionEmpleado));			
			this.jButtonAbrirOrderByToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenProvisionEmpleado && this.isPermisoOrdenProvisionEmpleado));
			this.jButtonNuevoRelacionesToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));			
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarProvisionEmpleado && this.isPermisoActualizarProvisionEmpleado));	
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarProvisionEmpleado  && this.isPermisoActualizarProvisionEmpleado));	
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarProvisionEmpleado && this.isPermisoEliminarProvisionEmpleado));
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarToolBarProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarProvisionEmpleado);				
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado));			
			this.jMenuItemDuplicarProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarProvisionEmpleado && this.isPermisoDuplicarProvisionEmpleado));			
			this.jMenuItemCopiarProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarProvisionEmpleado && this.isPermisoCopiarProvisionEmpleado));			
			this.jMenuItemVerFormProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormProvisionEmpleado && this.isPermisoVerFormProvisionEmpleado));			
			this.jMenuItemAbrirOrderByProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenProvisionEmpleado && this.isPermisoOrdenProvisionEmpleado));			
			//this.jMenuItemMostrarOcultarProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenProvisionEmpleado && this.isPermisoOrdenProvisionEmpleado));
			this.jMenuItemDetalleAbrirOrderByProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenProvisionEmpleado && this.isPermisoOrdenProvisionEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenProvisionEmpleado && this.isPermisoOrdenProvisionEmpleado));			
			this.jMenuItemNuevoRelacionesProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado));			
			this.jMenuItemNuevoGuardarCambiosProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoProvisionEmpleado && this.isPermisoNuevoProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));									
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemModificarProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarProvisionEmpleado && this.isPermisoActualizarProvisionEmpleado));	
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemActualizarProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarProvisionEmpleado && this.isPermisoActualizarProvisionEmpleado));	
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemEliminarProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarProvisionEmpleado && this.isPermisoEliminarProvisionEmpleado));
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemCancelarProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarProvisionEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));						
			this.jMenuItemGuardarCambiosTablaProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProvisionEmpleado=this.jButtonNuevoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarProvisionEmpleado=this.jButtonDuplicarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarProvisionEmpleado=this.jButtonCopiarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormProvisionEmpleado=this.jButtonVerFormProvisionEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenProvisionEmpleado=this.jButtonAbrirOrderByProvisionEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=this.jButtonNuevoRelacionesProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaModificarProvisionEmpleado=this.jButtonModificarProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			this.isVisibilidadCeldaActualizarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosProvisionEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=this.jButtonGuardarCambiosTablaProvisionEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProvisionEmpleado=this.jButtonNuevoToolBarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=this.jButtonNuevoRelacionesToolBarProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			this.isVisibilidadCeldaModificarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarToolBarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarToolBarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarToolBarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarToolBarProvisionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProvisionEmpleado=this.jButtonGuardarCambiosToolBarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=this.jButtonGuardarCambiosTablaToolBarProvisionEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProvisionEmpleado=this.jMenuItemNuevoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=this.jMenuItemNuevoRelacionesProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			this.isVisibilidadCeldaModificarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemModificarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemActualizarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemEliminarProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarProvisionEmpleado=this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemCancelarProvisionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProvisionEmpleado=this.jMenuItemGuardarCambiosProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=this.jMenuItemGuardarCambiosTablaProvisionEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProvisionEmpleado(Boolean esInicializar) {
		if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProvisionEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualProvisionEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProvisionEmpleado() {
		this.jButtonNuevoProvisionEmpleado.setVisible(this.isPermisoNuevoProvisionEmpleado);			
		this.jButtonDuplicarProvisionEmpleado.setVisible(this.isPermisoDuplicarProvisionEmpleado);			
		this.jButtonCopiarProvisionEmpleado.setVisible(this.isPermisoCopiarProvisionEmpleado);			
		this.jButtonVerFormProvisionEmpleado.setVisible(this.isPermisoVerFormProvisionEmpleado);			
		
		this.jButtonAbrirOrderByProvisionEmpleado.setVisible(this.isPermisoOrdenProvisionEmpleado);					
		
		this.jButtonNuevoRelacionesProvisionEmpleado.setVisible(this.isPermisoNuevoProvisionEmpleado);			
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarProvisionEmpleado.setVisible(this.isPermisoActualizarProvisionEmpleado);	
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarProvisionEmpleado.setVisible(this.isPermisoActualizarProvisionEmpleado);	
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarProvisionEmpleado.setVisible(this.isPermisoEliminarProvisionEmpleado);
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarProvisionEmpleado);						
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosProvisionEmpleado.setVisible(this.isPermisoGuardarCambiosProvisionEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaProvisionEmpleado.setVisible(this.isPermisoActualizarProvisionEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProvisionEmpleado() {
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarProvisionEmpleado.setVisible(this.isPermisoActualizarProvisionEmpleado);	
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarProvisionEmpleado.setVisible(this.isPermisoActualizarProvisionEmpleado);	
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarProvisionEmpleado.setVisible(this.isPermisoEliminarProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarProvisionEmpleado);							
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarProvisionEmpleado && this.isPermisoGuardarCambiosProvisionEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProvisionEmpleado() {
		if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProvisionEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProvisionEmpleado() {
	}
	
	public void jTableDatosProvisionEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProvisionEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.provisionempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProvisionEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.provisionempleadoLogic.getConnexion());

				if(this.provisionempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.provisionempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosProvisionEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProvisionEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.provisionempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebProvisionEmpleado(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.provisionempleadoLogic.getConnexion());

				if(this.provisionempleado.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.provisionempleado.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosProvisionEmpleado.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderProvisionEmpleado.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.provisionempleado.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebProvisionEmpleado(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.provisionempleadoLogic.getConnexion());

				if(this.provisionempleado.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.provisionempleado.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosProvisionEmpleado.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderProvisionEmpleado.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.provisionempleado.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprovisionempleado=true;

			idTienePermisotipoprovisionempleado=this.tienePermisosUsuarioEnPaginaWebProvisionEmpleado(TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprovisionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);

				this.tipoprovisionempleadoBeanSwingJInternalFrame=new TipoProvisionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprovisionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprovisionempleadoBeanSwingJInternalFrame.getTipoProvisionEmpleadoLogic().setConnexion(this.provisionempleadoLogic.getConnexion());

				if(this.provisionempleado.getid_tipo_provision_empleado()!=null) {
					this.tipoprovisionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprovisionempleadoBeanSwingJInternalFrame.setIdActual(this.provisionempleado.getid_tipo_provision_empleado());
					this.tipoprovisionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprovisionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprovisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProvisionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.tipoprovisionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosProvisionEmpleado.getBorder();
				TitledBorder titledBordertipoprovisionempleado=(TitledBorder)this.tipoprovisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosTipoProvisionEmpleado.getBorder();

				titledBordertipoprovisionempleado.setTitle(titledBorderProvisionEmpleado.getTitle() + " -> Tipo Provision Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_provision_empleadoProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getid_tipo_provision_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_provision_empleado = "+this.provisionempleado.getid_tipo_provision_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_defi_provision_empleadoProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodefiprovisionempleado=true;

			idTienePermisodefiprovisionempleado=this.tienePermisosUsuarioEnPaginaWebProvisionEmpleado(DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisodefiprovisionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);

				this.defiprovisionempleadoBeanSwingJInternalFrame=new DefiProvisionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.defiprovisionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.defiprovisionempleadoBeanSwingJInternalFrame.getDefiProvisionEmpleadoLogic().setConnexion(this.provisionempleadoLogic.getConnexion());

				if(this.provisionempleado.getid_defi_provision_empleado()!=null) {
					this.defiprovisionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.defiprovisionempleadoBeanSwingJInternalFrame.setIdActual(this.provisionempleado.getid_defi_provision_empleado());
					this.defiprovisionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.defiprovisionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.defiprovisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefiProvisionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.defiprovisionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosProvisionEmpleado.getBorder();
				TitledBorder titledBorderdefiprovisionempleado=(TitledBorder)this.defiprovisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosDefiProvisionEmpleado.getBorder();

				titledBorderdefiprovisionempleado.setTitle(titledBorderProvisionEmpleado.getTitle() + " -> Defi Provision Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_defi_provision_empleadoProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getid_defi_provision_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_defi_provision_empleado = "+this.provisionempleado.getid_defi_provision_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProvisionEmpleado(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.provisionempleadoLogic.getConnexion());

				if(this.provisionempleado.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.provisionempleado.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosProvisionEmpleado.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProvisionEmpleado.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.provisionempleado.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesProvisionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebProvisionEmpleado(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvisionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvisionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.provisionempleadoLogic.getConnexion());

				if(this.provisionempleado.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.provisionempleado.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosProvisionEmpleado.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderProvisionEmpleado.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.provisionempleado.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.provisionempleado.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_liquidacionProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getfecha_liquidacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_liquidacion = '"+Funciones2.getStringPostgresDate(this.provisionempleado.getfecha_liquidacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_mesProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getvalor_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_mes = "+this.provisionempleado.getvalor_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_pagaProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getvalor_paga()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_paga = "+this.provisionempleado.getvalor_paga().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_vacacionProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getvalor_vacacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_vacacion = "+this.provisionempleado.getvalor_vacacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_liquidacionProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.getprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provisionempleado==null) {
						this.provisionempleado = new ProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);
				}

				if(this.provisionempleado.getvalor_liquidacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_liquidacion = "+this.provisionempleado.getvalor_liquidacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvisionEmpleado(false,false);

			this.getProvisionEmpleadosFK_IdAnio();

			this.inicializarActualizarBindingProvisionEmpleado(false);

			//if(ProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvisionEmpleado(false,false);

			this.getProvisionEmpleadosFK_IdDefiProvisionEmpleado();

			this.inicializarActualizarBindingProvisionEmpleado(false);

			//if(ProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvisionEmpleado(false,false);

			this.getProvisionEmpleadosFK_IdEmpleado();

			this.inicializarActualizarBindingProvisionEmpleado(false);

			//if(ProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvisionEmpleado(false,false);

			this.getProvisionEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingProvisionEmpleado(false);

			//if(ProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvisionEmpleado(false,false);

			this.getProvisionEmpleadosFK_IdEstructura();

			this.inicializarActualizarBindingProvisionEmpleado(false);

			//if(ProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvisionEmpleado(false,false);

			this.getProvisionEmpleadosFK_IdMes();

			this.inicializarActualizarBindingProvisionEmpleado(false);

			//if(ProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvisionEmpleado(false,false);

			this.getProvisionEmpleadosFK_IdTipoProvisionEmpleado();

			this.inicializarActualizarBindingProvisionEmpleado(false);

			//if(ProvisionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvisionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProvisionEmpleado() {
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormProvisionEmpleado.dispose();
			this.jInternalFrameDetalleFormProvisionEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
			this.jInternalFrameReporteDinamicoProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProvisionEmpleado.dispose();
			this.jInternalFrameReporteDinamicoProvisionEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionProvisionEmpleado!=null) {
			this.jInternalFrameImportacionProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionProvisionEmpleado.dispose();
			this.jInternalFrameImportacionProvisionEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProvisionEmpleado();
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProvisionEmpleado")) {
				jButtonNuevoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProvisionEmpleado")) {
				jButtonDuplicarProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProvisionEmpleado")) {
				jButtonCopiarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProvisionEmpleado")) {
				jButtonVerFormProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProvisionEmpleado")) {
				jButtonNuevoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProvisionEmpleado")) {
				jButtonDuplicarProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProvisionEmpleado")) {
				jButtonNuevoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProvisionEmpleado")) {
				jButtonDuplicarProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProvisionEmpleado")) {
				jButtonNuevoProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProvisionEmpleado")) {
				jButtonNuevoProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProvisionEmpleado")) {
				jButtonNuevoProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProvisionEmpleado")) {
				jButtonModificarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProvisionEmpleado")) {
				jButtonModificarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProvisionEmpleado")) {
				jButtonModificarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProvisionEmpleado")) {
				jButtonActualizarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProvisionEmpleado")) {
				jButtonActualizarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProvisionEmpleado")) {
				jButtonActualizarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProvisionEmpleado")) {
				jButtonEliminarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProvisionEmpleado")) {
				jButtonEliminarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProvisionEmpleado")) {
				jButtonEliminarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProvisionEmpleado")) {
				jButtonCancelarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProvisionEmpleado")) {
				jButtonCancelarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProvisionEmpleado")) {
				jButtonCancelarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProvisionEmpleado")) {
				jButtonCerrarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProvisionEmpleado")) {
				jButtonCerrarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProvisionEmpleado")) {
				jButtonCerrarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProvisionEmpleado")) {
				jButtonMostrarOcultarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProvisionEmpleado")) {
				jButtonCancelarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProvisionEmpleado")) {
				jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProvisionEmpleado")) {
				jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProvisionEmpleado")) {
				jButtonCopiarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProvisionEmpleado")) {
				jButtonVerFormProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProvisionEmpleado")) {
				jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProvisionEmpleado")) {
				jButtonCopiarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProvisionEmpleado")) {
				jButtonVerFormProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProvisionEmpleado")) {
				jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProvisionEmpleado")) {
				jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProvisionEmpleado")) {
				jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProvisionEmpleado")) {
				jButtonRecargarInformacionProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProvisionEmpleado")) {
				jButtonRecargarInformacionProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProvisionEmpleado")) {
				jButtonRecargarInformacionProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProvisionEmpleado")) {
				jButtonAnterioresProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProvisionEmpleado")) {
				jButtonAnterioresProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProvisionEmpleado")) {
				jButtonAnterioresProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProvisionEmpleado")) {
				jButtonSiguientesProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProvisionEmpleado")) {
				jButtonSiguientesProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProvisionEmpleado")) {
				jButtonSiguientesProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProvisionEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByProvisionEmpleado")) {
				jButtonAbrirOrderByProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProvisionEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarProvisionEmpleado")) {
				jButtonMostrarOcultarProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProvisionEmpleado")) {
				jButtonCerrarReporteDinamicoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProvisionEmpleado")) {
				jButtonGenerarReporteDinamicoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProvisionEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProvisionEmpleado")) {
				jButtonCerrarImportacionProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProvisionEmpleado")) {
				
				jButtonGenerarImportacionProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProvisionEmpleado")) {
				
				jButtonAbrirImportacionProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProvisionEmpleado")) {
				jComboBoxTiposAccionesProvisionEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProvisionEmpleado")) {
				jComboBoxTiposRelacionesProvisionEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProvisionEmpleado")) {
				jComboBoxTiposAccionesProvisionEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProvisionEmpleado")) {
				
				jComboBoxTiposSeleccionarProvisionEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProvisionEmpleado")) {
				jTextFieldValorCampoGeneralProvisionEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProvisionEmpleado")) {
				jButtonAbrirOrderByProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProvisionEmpleado")) {
				jButtonAbrirOrderByProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProvisionEmpleado")) {
				jButtonCerrarOrderByProvisionEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProvisionEmpleadoBusqueda")) {
				this.jButtonidProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProvisionEmpleadoUpdate")) {
				this.jButtonid_empresaProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProvisionEmpleadoBusqueda")) {
				this.jButtonid_empresaProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoProvisionEmpleadoUpdate")) {
				this.jButtonid_empleadoProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoProvisionEmpleadoBusqueda")) {
				this.jButtonid_empleadoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraProvisionEmpleadoUpdate")) {
				this.jButtonid_estructuraProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraProvisionEmpleadoBusqueda")) {
				this.jButtonid_estructuraProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_provision_empleadoProvisionEmpleadoUpdate")) {
				this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_provision_empleadoProvisionEmpleadoBusqueda")) {
				this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoProvisionEmpleadoUpdate")) {
				this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoProvisionEmpleadoBusqueda")) {
				this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProvisionEmpleadoUpdate")) {
				this.jButtonid_anioProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProvisionEmpleadoBusqueda")) {
				this.jButtonid_anioProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProvisionEmpleadoUpdate")) {
				this.jButtonid_mesProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProvisionEmpleadoBusqueda")) {
				this.jButtonid_mesProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProvisionEmpleadoBusqueda")) {
				this.jButtonfechaProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionProvisionEmpleadoBusqueda")) {
				this.jButtonfecha_liquidacionProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_mesProvisionEmpleadoBusqueda")) {
				this.jButtonvalor_mesProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagaProvisionEmpleadoBusqueda")) {
				this.jButtonvalor_pagaProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_vacacionProvisionEmpleadoBusqueda")) {
				this.jButtonvalor_vacacionProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_liquidacionProvisionEmpleadoBusqueda")) {
				this.jButtonvalor_liquidacionProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioProvisionEmpleado")) {
				this.jButtonFK_IdAnioProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDefiProvisionEmpleadoProvisionEmpleado")) {
				this.jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoProvisionEmpleado")) {
				this.jButtonFK_IdEmpleadoProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraProvisionEmpleado")) {
				this.jButtonFK_IdEstructuraProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesProvisionEmpleado")) {
				this.jButtonFK_IdMesProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProvisionEmpleadoProvisionEmpleado")) {
				this.jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleadoActionPerformed(evt);
			}
			
			;
			
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProvisionEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvisionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				


				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProvisionEmpleado provisionempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				provisionempleadoLocal=this.provisionempleado;
			} else {
				provisionempleadoLocal=this.provisionempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
							
				
				


				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
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
			
			


			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvisionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
								
						
				


				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
								
				
				


				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
							
				
				


				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvisionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
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
			
			


			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
								
				
				


				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvisionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProvisionEmpleado")) {
					jCheckBoxSeleccionarTodosProvisionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProvisionEmpleado")) {
					jCheckBoxSeleccionadosProvisionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProvisionEmpleado")) {
					
				}
				
				


				
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
												
				
				


				
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvisionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvisionEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
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
			
			


			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvisionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provisionempleado);
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
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
				
				


				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProvisionEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provisionempleadoAnterior =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProvisionEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProvisionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProvisionEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.provisionempleado =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.provisionempleado =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.provisionempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProvisionEmpleado")) {
				
				}
				
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProvisionEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProvisionEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProvisionEmpleado")) {
			
			}
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProvisionEmpleado();
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoProvisionEmpleado")) {
				jButtonNuevoProvisionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProvisionEmpleado")) {
				jButtonDuplicarProvisionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProvisionEmpleado")) {
				jButtonCopiarProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProvisionEmpleado")) {
				jButtonVerFormProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProvisionEmpleado")) {
				jButtonNuevoProvisionEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProvisionEmpleado")) {
				jButtonModificarProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProvisionEmpleado")) {
				jButtonActualizarProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProvisionEmpleado")) {
				jButtonEliminarProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProvisionEmpleado")) {
				jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProvisionEmpleado")) {
				jButtonCancelarProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProvisionEmpleado")) {
				jButtonCerrarProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProvisionEmpleado")) {
				jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProvisionEmpleado")) {
				jButtonAbrirOrderByProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProvisionEmpleado")) {
				jButtonRecargarInformacionProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProvisionEmpleado")) {
				jButtonAnterioresProvisionEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProvisionEmpleado")) {
				jButtonSiguientesProvisionEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProvisionEmpleadoBusqueda")) {
				this.jButtonidProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProvisionEmpleadoUpdate")) {
				this.jButtonid_empresaProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProvisionEmpleadoBusqueda")) {
				this.jButtonid_empresaProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoProvisionEmpleadoUpdate")) {
				this.jButtonid_empleadoProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoProvisionEmpleadoBusqueda")) {
				this.jButtonid_empleadoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraProvisionEmpleadoUpdate")) {
				this.jButtonid_estructuraProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraProvisionEmpleadoBusqueda")) {
				this.jButtonid_estructuraProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_provision_empleadoProvisionEmpleadoUpdate")) {
				this.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_provision_empleadoProvisionEmpleadoBusqueda")) {
				this.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoProvisionEmpleadoUpdate")) {
				this.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoProvisionEmpleadoBusqueda")) {
				this.jButtonid_defi_provision_empleadoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProvisionEmpleadoUpdate")) {
				this.jButtonid_anioProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProvisionEmpleadoBusqueda")) {
				this.jButtonid_anioProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProvisionEmpleadoUpdate")) {
				this.jButtonid_mesProvisionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProvisionEmpleadoBusqueda")) {
				this.jButtonid_mesProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProvisionEmpleadoBusqueda")) {
				this.jButtonfechaProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionProvisionEmpleadoBusqueda")) {
				this.jButtonfecha_liquidacionProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_mesProvisionEmpleadoBusqueda")) {
				this.jButtonvalor_mesProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagaProvisionEmpleadoBusqueda")) {
				this.jButtonvalor_pagaProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_vacacionProvisionEmpleadoBusqueda")) {
				this.jButtonvalor_vacacionProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_liquidacionProvisionEmpleadoBusqueda")) {
				this.jButtonvalor_liquidacionProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProvisionEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProvisionEmpleado")) {
				closingInternalFrameProvisionEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarProvisionEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormProvisionEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            ProvisionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(ProvisionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormProvisionEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProvisionEmpleadoActionPerformed(null);
			}
			
			ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.provisionempleado,new Object(),this.provisionempleadoParameterGeneral,this.provisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProvisionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProvisionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProvisionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.provisionempleado)) {
			if(!esControlTabla) {
				if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);			
				}
				
				if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProvisionEmpleado(this.provisionempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.provisionempleadoReturnGeneral=provisionempleadoLogic.procesarEventosProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.provisionempleadoLogic.getProvisionEmpleados(),this.provisionempleado,this.provisionempleadoParameterGeneral,this.isEsNuevoProvisionEmpleado,classes);//this.provisionempleadoLogic.getProvisionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProvisionEmpleado(this.provisionempleadoReturnGeneral,this.provisionempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProvisionEmpleado(classes,this.provisionempleadoReturnGeneral,this.provisionempleadoBean,false);
					}
						
					if(this.provisionempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProvisionEmpleado(this.provisionempleadoReturnGeneral.getProvisionEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProvisionEmpleado(this.provisionempleadoReturnGeneral.getProvisionEmpleado());	
					}
						
					if(this.provisionempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProvisionEmpleado(this.provisionempleadoReturnGeneral.getProvisionEmpleado(),classes);//this.provisionempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProvisionEmpleado(this.provisionempleado,classes);//this.provisionempleadoBean);									
				}
			
				if(ProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProvisionEmpleado(this.provisionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProvisionEmpleado(this.provisionempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.provisionempleadoAnterior!=null) {
						this.provisionempleado=this.provisionempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.provisionempleadoReturnGeneral=provisionempleadoLogic.procesarEventosProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.provisionempleadoLogic.getProvisionEmpleados(),this.provisionempleado,this.provisionempleadoParameterGeneral,this.isEsNuevoProvisionEmpleado,classes);//this.provisionempleadoLogic.getProvisionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.provisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.provisionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.provisionempleadoReturnGeneral.getProvisionEmpleado(),provisionempleadoLogic.getProvisionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.provisionempleadoReturnGeneral.getProvisionEmpleado(),this.provisionempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProvisionEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosProvisionEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProvisionEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosProvisionEmpleado() throws Exception {
		
		ProvisionEmpleadoModel provisionempleadoModel=(ProvisionEmpleadoModel)this.jTableDatosProvisionEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			provisionempleadoModel.provisionempleados=this.provisionempleadoLogic.getProvisionEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			provisionempleadoModel.provisionempleados=this.provisionempleados;
		}
		
		
		((ProvisionEmpleadoModel) this.jTableDatosProvisionEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProvisionEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprovisionempleadoAnterior(),this.provisionempleadoLogic.getProvisionEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprovisionempleadoAnterior(),this.provisionempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProvisionEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProvisionEmpleado(ProvisionEmpleado provisionempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
										
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.provisionempleado,new Object(),generalEntityParameterGeneral,this.provisionempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.provisionempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProvisionEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfProvisionEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProvisionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.provisionempleado,new Object(),generalEntityParameterGeneral,this.provisionempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProvisionEmpleado(ProvisionEmpleadoBean provisionempleadoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProvisionEmpleado(ArrayList<Classe> classes,ProvisionEmpleadoReturnGeneral provisionempleadoReturnGeneral,ProvisionEmpleadoBean provisionempleadoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProvisionEmpleado(ProvisionEmpleado provisionempleado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.provisionempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProvisionEmpleado = new ProvisionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.provisionempleadoSessionBean.getConGuardarRelaciones(),this.provisionempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormProvisionEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormProvisionEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProvisionEmpleado.provisionempleadoLogic=this.provisionempleadoLogic;
		
		this.cargarCombosFrameForeignKeyProvisionEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProvisionEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProvisionEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProvisionEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProvisionEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProvisionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProvisionEmpleado"));
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarProvisionEmpleado"));

		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarToolBarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarProvisionEmpleado"));
					
		this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemModificarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarToolBarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProvisionEmpleado"));
						
		this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemActualizarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarProvisionEmpleado"));
								
		this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemEliminarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarProvisionEmpleado"));
					
		this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemCancelarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProvisionEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemDetalleCerrarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProvisionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProvisionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProvisionEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonidProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empresaProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empresaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_estructuraProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_estructuraProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_provision_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_provision_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_anioProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_anioProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_mesProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_mesProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonfechaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fechaProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_mesProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_mesProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_pagaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagaProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_vacacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_vacacionProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_liquidacionProvisionEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProvisionEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProvisionEmpleado"));
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProvisionEmpleado"));
		}
		
		this.jTableDatosProvisionEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProvisionEmpleado"));
		
		this.jTableDatosProvisionEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProvisionEmpleado"));
		
		this.jButtonNuevoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoProvisionEmpleado"));
		
		this.jButtonDuplicarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarProvisionEmpleado"));
		
		this.jButtonCopiarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"CopiarProvisionEmpleado"));
		
		this.jButtonVerFormProvisionEmpleado.addActionListener(new ButtonActionListener(this,"VerFormProvisionEmpleado"));
		
		
		this.jButtonNuevoToolBarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarProvisionEmpleado"));
			
		this.jButtonDuplicarToolBarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProvisionEmpleado"));
			
		this.jMenuItemNuevoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProvisionEmpleado"));
			
		this.jMenuItemDuplicarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProvisionEmpleado"));		
		
		
		this.jButtonNuevoRelacionesProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProvisionEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProvisionEmpleado"));
			
		this.jMenuItemNuevoRelacionesProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProvisionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonModificarToolBarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarProvisionEmpleado"));
			
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemModificarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonActualizarToolBarProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProvisionEmpleado"));
				
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemActualizarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonEliminarToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarProvisionEmpleado"));
						
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemEliminarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonCancelarToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarProvisionEmpleado"));
			
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemCancelarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProvisionEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProvisionEmpleado"));		
		
		
		this.jButtonCerrarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarProvisionEmpleado"));
		
		
		this.jButtonCerrarToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarProvisionEmpleado"));
			
		this.jMenuItemCerrarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProvisionEmpleado"));
			
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jMenuItemDetalleCerrarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProvisionEmpleado"));
		}
		
		this.jButtonCopiarToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarProvisionEmpleado"));
			
		this.jButtonVerFormToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarProvisionEmpleado"));
		
		this.jMenuItemGuardarCambiosProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProvisionEmpleado"));
			
		this.jMenuItemCopiarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProvisionEmpleado"));		
		
		this.jMenuItemVerFormProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProvisionEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProvisionEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProvisionEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProvisionEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionProvisionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionProvisionEmpleado"));
					
		this.jButtonRecargarInformacionToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProvisionEmpleado"));
		
		this.jMenuItemRecargarInformacionProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProvisionEmpleado"));		
		
		
		
		this.jButtonAnterioresProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresProvisionEmpleado"));
		
		
		this.jButtonAnterioresToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProvisionEmpleado"));
		
		this.jMenuItemAnterioresProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProvisionEmpleado"));		
		
		
		this.jButtonSiguientesProvisionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesProvisionEmpleado"));
		
		
		this.jButtonSiguientesToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProvisionEmpleado"));
			
		this.jMenuItemSiguientesProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProvisionEmpleado"));
			
		this.jMenuItemAbrirOrderByProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProvisionEmpleado"));
			
		this.jMenuItemMostrarOcultarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProvisionEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProvisionEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProvisionEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProvisionEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProvisionEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProvisionEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProvisionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProvisionEmpleado"));

		this.jCheckBoxSeleccionadosProvisionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProvisionEmpleado"));
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProvisionEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesProvisionEmpleado"));
			
		this.jComboBoxTiposAccionesProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesProvisionEmpleado"));
					
		this.jComboBoxTiposSeleccionarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProvisionEmpleado"));
			
		this.jTextFieldValorCampoGeneralProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProvisionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonidProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empresaProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empresaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_estructuraProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_estructuraProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_provision_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_provision_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_anioProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_anioProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_mesProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_mesProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonfechaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fechaProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_mesProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_mesProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_pagaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagaProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_vacacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_vacacionProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_liquidacionProvisionEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdAnioProvisionEmpleado"));

			this.jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdDefiProvisionEmpleadoProvisionEmpleado"));

			this.jButtonFK_IdEmpleadoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoProvisionEmpleado"));

			this.jButtonFK_IdEstructuraProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraProvisionEmpleado"));

			this.jButtonFK_IdMesProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdMesProvisionEmpleado"));

			this.jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdTipoProvisionEmpleadoProvisionEmpleado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoProvisionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoProvisionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoProvisionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProvisionEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProvisionEmpleado"));				
			//this.jButtonGenerarReporteDinamicoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProvisionEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProvisionEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProvisionEmpleado!=null) {
				this.jInternalFrameImportacionProvisionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProvisionEmpleado"));
				this.jInternalFrameImportacionProvisionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProvisionEmpleado"));
				this.jInternalFrameImportacionProvisionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProvisionEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByProvisionEmpleado"));
			
			this.jButtonAbrirOrderByToolBarProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProvisionEmpleado"));			
			
			if(this.jInternalFrameOrderByProvisionEmpleado!=null) {
				this.jInternalFrameOrderByProvisionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProvisionEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvisionEmpleado.jTabbedPaneRelacionesProvisionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProvisionEmpleado"));
		
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
            		closingInternalFrameProvisionEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProvisionEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProvisionEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            ProvisionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(ProvisionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormProvisionEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProvisionEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProvisionEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProvisionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProvisionEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProvisionEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProvisionEmpleado";
		inputMap = this.jButtonNuevoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProvisionEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProvisionEmpleado";
		inputMap = this.jButtonNuevoRelacionesProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProvisionEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProvisionEmpleado";
		inputMap = this.jButtonModificarProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProvisionEmpleado";
		inputMap = this.jButtonActualizarProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProvisionEmpleado";
		inputMap = this.jButtonEliminarProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProvisionEmpleado";
		inputMap = this.jButtonCancelarProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProvisionEmpleado";
		inputMap = this.jButtonCerrarProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProvisionEmpleado";
		inputMap = this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonGuardarCambiosProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProvisionEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProvisionEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonidProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empresaProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empresaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_estructuraProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_estructuraProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_tipo_provision_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_provision_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_tipo_provision_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_provision_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_defi_provision_empleadoProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_defi_provision_empleadoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_anioProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_anioProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProvisionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_mesProvisionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_mesProvisionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonid_mesProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonfechaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fechaProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonfecha_liquidacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_mesProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_mesProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_pagaProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagaProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_vacacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_vacacionProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvisionEmpleado.jButtonvalor_liquidacionProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_liquidacionProvisionEmpleadoBusqueda"));
		
		
		this.jButtonFK_IdAnioProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdAnioProvisionEmpleado"));

		this.jButtonFK_IdDefiProvisionEmpleadoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdDefiProvisionEmpleadoProvisionEmpleado"));

		this.jButtonFK_IdEmpleadoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoProvisionEmpleado"));

		this.jButtonFK_IdEstructuraProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraProvisionEmpleado"));

		this.jButtonFK_IdMesProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdMesProvisionEmpleado"));

		this.jButtonFK_IdTipoProvisionEmpleadoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdTipoProvisionEmpleadoProvisionEmpleado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProvisionEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProvisionEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
					provisionempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProvisionEmpleado provisionempleadoAux:provisionempleados) {
					provisionempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProvisionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProvisionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
						provisionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProvisionEmpleado provisionempleadoAux:provisionempleados) {
						provisionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProvisionEmpleado provisionempleadoAux:provisionempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProvisionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProvisionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProvisionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProvisionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProvisionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProvisionEmpleado.getSelectedRows();
			
			ProvisionEmpleado provisionempleadoLocal=new ProvisionEmpleado();
			
			//this.seleccionarTodosProvisionEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provisionempleadoLocal =(ProvisionEmpleado) this.provisionempleadoLogic.getProvisionEmpleados().toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					provisionempleadoLocal =(ProvisionEmpleado) this.provisionempleados.toArray()[this.jTableDatosProvisionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				provisionempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
						provisionempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProvisionEmpleado provisionempleadoAux:provisionempleados) {
						provisionempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProvisionEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProvisionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProvisionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProvisionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProvisionEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProvisionEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProvisionEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProvisionEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProvisionEmpleado provisionempleadoAux:this.provisionempleadoLogic.getProvisionEmpleados()) {
				
						if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							provisionempleadoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							provisionempleadoAux.setfecha_liquidacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES)) {
							existe=true;
							provisionempleadoAux.setvalor_mes(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA)) {
							existe=true;
							provisionempleadoAux.setvalor_paga(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION)) {
							existe=true;
							provisionempleadoAux.setvalor_vacacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION)) {
							existe=true;
							provisionempleadoAux.setvalor_liquidacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProvisionEmpleado provisionempleadoAux:provisionempleados) {
					
						if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							provisionempleadoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							provisionempleadoAux.setfecha_liquidacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES)) {
							existe=true;
							provisionempleadoAux.setvalor_mes(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA)) {
							existe=true;
							provisionempleadoAux.setvalor_paga(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION)) {
							existe=true;
							provisionempleadoAux.setvalor_vacacion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION)) {
							existe=true;
							provisionempleadoAux.setvalor_liquidacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProvisionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProvisionEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProvisionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProvisionEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProvisionEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProvisionEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessProvisionEmpleado(conSplash);
				
					this.generarReporteProvisionEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProvisionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProvisionEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProvisionEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProvisionEmpleado();
				
				this.exportarProvisionEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProvisionEmpleados();
				//this.importarProvisionEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProvisionEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProvisionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProvisionEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProvisionEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProvisionEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(ProvisionEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProvisionEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProvisionEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralProvisionEmpleado();
						
						this.generarReporteProcesoAccionProvisionEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProvisionEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Provision EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProvisionEmpleado();
				
						this.actualizarParametrosGeneralProvisionEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.provisionempleadoReturnGeneral=provisionempleadoLogic.procesarAccionProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.provisionempleadoLogic.getProvisionEmpleados(),this.provisionempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProvisionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProvisionEmpleado();
					
					ProvisionEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProvisionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProvisionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxTiposAccionesFormularioProvisionEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProvisionEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProvisionEmpleado();
			
			if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		
			ProvisionEmpleado provisionempleado=new ProvisionEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProvisionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProvisionEmpleado.getSelectedItem();
			
			
			
			
			provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(provisionempleadosSeleccionados.size()==1) {
				for(ProvisionEmpleado provisionempleadoAux:provisionempleadosSeleccionados) {
					provisionempleado=provisionempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProvisionEmpleado();
			
      		//this.finishProcessProvisionEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProvisionEmpleadoReturnGeneral() throws Exception {
		if(this.provisionempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.provisionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.provisionempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.provisionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.provisionempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.provisionempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProvisionEmpleado(false);
		}
		
		if(this.provisionempleadoReturnGeneral.getConRetornoLista() || this.provisionempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.provisionempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.provisionempleadoLogic.setProvisionEmpleados(this.provisionempleadoReturnGeneral.getProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.provisionempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.provisionempleadoLogic.setProvisionEmpleado(this.provisionempleadoReturnGeneral.getProvisionEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProvisionEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralProvisionEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<ProvisionEmpleado> getProvisionEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProvisionEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProvisionEmpleado provisionempleadoAux:provisionempleadoLogic.getProvisionEmpleados()) {
					if(provisionempleadoAux.getIsSelected()) {
						provisionempleadosSeleccionados.add(provisionempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProvisionEmpleado provisionempleadoAux:this.provisionempleados) {
					if(provisionempleadoAux.getIsSelected()) {
						provisionempleadosSeleccionados.add(provisionempleadoAux);				
					}
				}
			}
			
			if(provisionempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						provisionempleadosSeleccionados.addAll(this.provisionempleadoLogic.getProvisionEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						provisionempleadosSeleccionados.addAll(this.provisionempleados);				
					}
				}
			}
		} else {
			provisionempleadosSeleccionados.add(this.provisionempleado);
		}
		
		return provisionempleadosSeleccionados;
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
	
	public void generarReporteProvisionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProvisionEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProvisionEmpleadosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Provision Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProvisionEmpleados("Todos",provisionempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProvisionEmpleados("Todos",provisionempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProvisionEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProvisionEmpleados("Todos",provisionempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProvisionEmpleado();
		
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProvisionEmpleado();
		
		
		//this.generarReporteProvisionEmpleados("Todos",provisionempleadosSeleccionados ,provisionempleadoImplementable,provisionempleadoImplementableHome);
	}
	
	public void mostrarImportacionProvisionEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProvisionEmpleado();
		
		this.abrirFrameImportacionProvisionEmpleado();		
		
			
		//this.generarReporteProvisionEmpleados("Todos",provisionempleadosSeleccionados ,provisionempleadoImplementable,provisionempleadoImplementableHome);
	}
	
	public void importarProvisionEmpleados() throws Exception {		
	
	}
	
	public void exportarProvisionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProvisionEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProvisionEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Provision Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provisionempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProvisionEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProvisionEmpleado provisionempleadoAux:provisionempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProvisionEmpleado(provisionempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//provisionempleadoAux.setsDetalleGeneralEntityReporte(provisionempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProvisionEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProvisionEmpleado(ProvisionEmpleado provisionempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=provisionempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.gettipoprovisionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getdefiprovisionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getfecha_liquidacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getvalor_mes().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getvalor_paga().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getvalor_vacacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provisionempleado.getvalor_liquidacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provisionempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProvisionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProvisionEmpleado(row);				
				iRow++;
			}				
			
			for(ProvisionEmpleado provisionempleadoAux:provisionempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProvisionEmpleado(provisionempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();		
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provisionempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("provisionempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("provisionempleado");
			//elementRoot.appendChild(element);
		
			for(ProvisionEmpleado provisionempleadoAux:provisionempleadosSeleccionados) {
				element = document.createElement("provisionempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProvisionEmpleado(provisionempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProvisionEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORMES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORPAGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORVACACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvisionEmpleadoConstantesFunciones.LABEL_VALORLIQUIDACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProvisionEmpleado(ProvisionEmpleado provisionempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.gettipoprovisionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getdefiprovisionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getfecha_liquidacion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getvalor_mes());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getvalor_paga());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getvalor_vacacion());
		cell = row.createCell(iColumn++);cell.setCellValue(provisionempleado.getvalor_liquidacion());				
	}
	
	public void setFilaDatosExportarXmlProvisionEmpleado(ProvisionEmpleado provisionempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProvisionEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(provisionempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProvisionEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(provisionempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProvisionEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(provisionempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(ProvisionEmpleadoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(provisionempleado.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestructura_descripcion = document.createElement(ProvisionEmpleadoConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(provisionempleado.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementtipoprovisionempleado_descripcion = document.createElement(ProvisionEmpleadoConstantesFunciones.IDTIPOPROVISIONEMPLEADO);
		elementtipoprovisionempleado_descripcion.appendChild(document.createTextNode(provisionempleado.gettipoprovisionempleado_descripcion()));
		element.appendChild(elementtipoprovisionempleado_descripcion);

		Element elementdefiprovisionempleado_descripcion = document.createElement(ProvisionEmpleadoConstantesFunciones.IDDEFIPROVISIONEMPLEADO);
		elementdefiprovisionempleado_descripcion.appendChild(document.createTextNode(provisionempleado.getdefiprovisionempleado_descripcion()));
		element.appendChild(elementdefiprovisionempleado_descripcion);

		Element elementanio_descripcion = document.createElement(ProvisionEmpleadoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(provisionempleado.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(ProvisionEmpleadoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(provisionempleado.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementfecha = document.createElement(ProvisionEmpleadoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(provisionempleado.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementfecha_liquidacion = document.createElement(ProvisionEmpleadoConstantesFunciones.FECHALIQUIDACION);
		elementfecha_liquidacion.appendChild(document.createTextNode(provisionempleado.getfecha_liquidacion().toString().trim()));
		element.appendChild(elementfecha_liquidacion);

		Element elementvalor_mes = document.createElement(ProvisionEmpleadoConstantesFunciones.VALORMES);
		elementvalor_mes.appendChild(document.createTextNode(provisionempleado.getvalor_mes().toString().trim()));
		element.appendChild(elementvalor_mes);

		Element elementvalor_paga = document.createElement(ProvisionEmpleadoConstantesFunciones.VALORPAGA);
		elementvalor_paga.appendChild(document.createTextNode(provisionempleado.getvalor_paga().toString().trim()));
		element.appendChild(elementvalor_paga);

		Element elementvalor_vacacion = document.createElement(ProvisionEmpleadoConstantesFunciones.VALORVACACION);
		elementvalor_vacacion.appendChild(document.createTextNode(provisionempleado.getvalor_vacacion().toString().trim()));
		element.appendChild(elementvalor_vacacion);

		Element elementvalor_liquidacion = document.createElement(ProvisionEmpleadoConstantesFunciones.VALORLIQUIDACION);
		elementvalor_liquidacion.appendChild(document.createTextNode(provisionempleado.getvalor_liquidacion().toString().trim()));
		element.appendChild(elementvalor_liquidacion);
	}
	
	public void generarReporteGroupGenericoProvisionEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados=new ArrayList<ProvisionEmpleado>();
		
		provisionempleadosSeleccionados=this.getProvisionEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProvisionEmpleado(provisionempleadosSeleccionados);
		
		this.generarReporteProvisionEmpleados("Todos",provisionempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProvisionEmpleado(ArrayList<ProvisionEmpleado> provisionempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProvisionEmpleado provisionempleadoAux:provisionempleadosSeleccionados) {
				provisionempleadoAux.setsDetalleGeneralEntityReporte(provisionempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(provisionempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(provisionempleadoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(provisionempleadoAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_IDTIPOPROVISIONEMPLEADO)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(provisionempleadoAux.gettipoprovisionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(provisionempleadoAux.getdefiprovisionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(provisionempleadoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(provisionempleadoAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(provisionempleadoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ProvisionEmpleadoConstantesFunciones.LABEL_FECHALIQUIDACION)) {
					existe=true;
					provisionempleadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(provisionempleadoAux.getfecha_liquidacion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProvisionEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProvisionEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=true;
			this.isVisibilidadCeldaCancelarProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=true;
			this.isVisibilidadCeldaModificarProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarProvisionEmpleado=true;
			this.isVisibilidadCeldaActualizarProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarProvisionEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=true;
		} else {
			this.actualizarEstadoPanelsProvisionEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProvisionEmpleado=false;
			//this.isVisibilidadCeldaVerFormProvisionEmpleado=false;
			this.isVisibilidadCeldaDuplicarProvisionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!provisionempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosProvisionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!provisionempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;												
			}
			
			this.jButtonCerrarProvisionEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProvisionEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.provisionempleado)) {
			this.isVisibilidadCeldaActualizarProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarProvisionEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProvisionEmpleado() {
	}
	
	public void actualizarEstadoPanelsProvisionEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionProvisionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProvisionEmpleado!=null) {
				this.jScrollPanelDatosProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionProvisionEmpleado!=null) {
				this.jPanelPaginacionProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionProvisionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProvisionEmpleado!=null) {
				this.jScrollPanelDatosProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionProvisionEmpleado!=null) {
				this.jPanelPaginacionProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionProvisionEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProvisionEmpleado!=null) {
				this.jScrollPanelDatosProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionProvisionEmpleado!=null) {
				this.jPanelPaginacionProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionProvisionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProvisionEmpleado!=null) {
				this.jScrollPanelDatosProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionProvisionEmpleado!=null) {
				this.jPanelPaginacionProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionProvisionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProvisionEmpleado!=null) {
				this.jScrollPanelDatosProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionProvisionEmpleado!=null) {
				this.jPanelPaginacionProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionProvisionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProvisionEmpleado!=null) {
				this.jScrollPanelDatosProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionProvisionEmpleado!=null) {
				this.jPanelPaginacionProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionProvisionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProvisionEmpleado!=null) {
				this.jScrollPanelDatosProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionProvisionEmpleado!=null) {
				this.jPanelPaginacionProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
					this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvisionEmpleado!=null) {
				this.jTabbedPaneBusquedasProvisionEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProvisionEmpleado!=null) {
				this.jPanelParametrosReportesProvisionEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdAnioProvisionEmpleado);}

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEstructuraProvisionEmpleado);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdMesProvisionEmpleado);}

			this.isVisibilidadFK_IdTipoProvisionEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAnio=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdAnioProvisionEmpleado);}

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEstructuraProvisionEmpleado);}

			this.isVisibilidadFK_IdMes=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdMesProvisionEmpleado);}

			this.isVisibilidadFK_IdTipoProvisionEmpleado=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdAnio=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdAnioProvisionEmpleado);}

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEstructuraProvisionEmpleado);}

			this.isVisibilidadFK_IdMes=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdMesProvisionEmpleado);}

			this.isVisibilidadFK_IdTipoProvisionEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdTipoProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProvisionEmpleado(Boolean isParaTipoProvisionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProvisionEmpleadoNegation=!isParaTipoProvisionEmpleado;

			this.isVisibilidadFK_IdAnio=isParaTipoProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdAnioProvisionEmpleado);}

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaTipoProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaTipoProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEstructura=isParaTipoProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEstructuraProvisionEmpleado);}

			this.isVisibilidadFK_IdMes=isParaTipoProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdMesProvisionEmpleado);}

			this.isVisibilidadFK_IdTipoProvisionEmpleado=isParaTipoProvisionEmpleado;
			if(!this.isVisibilidadFK_IdTipoProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaDefiProvisionEmpleado(Boolean isParaDefiProvisionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDefiProvisionEmpleadoNegation=!isParaDefiProvisionEmpleado;

			this.isVisibilidadFK_IdAnio=isParaDefiProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdAnioProvisionEmpleado);}

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaDefiProvisionEmpleado;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaDefiProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEstructura=isParaDefiProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEstructuraProvisionEmpleado);}

			this.isVisibilidadFK_IdMes=isParaDefiProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdMesProvisionEmpleado);}

			this.isVisibilidadFK_IdTipoProvisionEmpleado=isParaDefiProvisionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdAnioProvisionEmpleado);}

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEstructura=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEstructuraProvisionEmpleado);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdMesProvisionEmpleado);}

			this.isVisibilidadFK_IdTipoProvisionEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdAnioProvisionEmpleado);}

			this.isVisibilidadFK_IdDefiProvisionEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdDefiProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEmpleadoProvisionEmpleado);}

			this.isVisibilidadFK_IdEstructura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdEstructuraProvisionEmpleado);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdMesProvisionEmpleado);}

			this.isVisibilidadFK_IdTipoProvisionEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoProvisionEmpleado) {this.jTabbedPaneBusquedasProvisionEmpleado.remove(jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProvisionEmpleadoSessionBean provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		
		if(this.provisionempleadoSessionBean==null) {
			this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		}
		
		this.provisionempleadoSessionBean.setsUltimaBusquedaProvisionEmpleado(this.getsAccionBusqueda());
		this.provisionempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.provisionempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			provisionempleadoSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDefiProvisionEmpleado")) {
			provisionempleadoSessionBean.setid_defi_provision_empleado(this.getid_defi_provision_empleadoFK_IdDefiProvisionEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			provisionempleadoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			provisionempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			provisionempleadoSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			provisionempleadoSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProvisionEmpleado")) {
			provisionempleadoSessionBean.setid_tipo_provision_empleado(this.getid_tipo_provision_empleadoFK_IdTipoProvisionEmpleado());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProvisionEmpleadoSessionBean provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		
		if(this.provisionempleadoSessionBean==null) {
			this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		}
		
		if(this.provisionempleadoSessionBean.getsUltimaBusquedaProvisionEmpleado()!=null&&!this.provisionempleadoSessionBean.getsUltimaBusquedaProvisionEmpleado().equals("")) {
			this.setsAccionBusqueda(provisionempleadoSessionBean.getsUltimaBusquedaProvisionEmpleado());
			this.setiNumeroPaginacion(provisionempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(provisionempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(provisionempleadoSessionBean.getid_anio());
				provisionempleadoSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDefiProvisionEmpleado")) {
				this.setid_defi_provision_empleadoFK_IdDefiProvisionEmpleado(provisionempleadoSessionBean.getid_defi_provision_empleado());
				provisionempleadoSessionBean.setid_defi_provision_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(provisionempleadoSessionBean.getid_empleado());
				provisionempleadoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(provisionempleadoSessionBean.getid_empresa());
				provisionempleadoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(provisionempleadoSessionBean.getid_estructura());
				provisionempleadoSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(provisionempleadoSessionBean.getid_mes());
				provisionempleadoSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProvisionEmpleado")) {
				this.setid_tipo_provision_empleadoFK_IdTipoProvisionEmpleado(provisionempleadoSessionBean.getid_tipo_provision_empleado());
				provisionempleadoSessionBean.setid_tipo_provision_empleado(-1L);
			}
		}
		
		this.provisionempleadoSessionBean.setsUltimaBusquedaProvisionEmpleado("");
		this.provisionempleadoSessionBean.setiNumeroPaginacion(ProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.provisionempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProvisionEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProvisionEmpleado() {
		this.updateBorderResaltarBusquedasFormularioProvisionEmpleado();
		this.updateVisibilidadBusquedasFormularioProvisionEmpleado();
		this.updateHabilitarBusquedasFormularioProvisionEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioProvisionEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProvisionEmpleado.getComponents().length>0) {
	

		if(this.provisionempleadoConstantesFunciones.resaltarFK_IdAnioProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdAnioProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdAnioProvisionEmpleado);
			}
		}

		if(this.provisionempleadoConstantesFunciones.resaltarFK_IdDefiProvisionEmpleadoProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdDefiProvisionEmpleadoProvisionEmpleado);
			}
		}

		if(this.provisionempleadoConstantesFunciones.resaltarFK_IdEmpleadoProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdEmpleadoProvisionEmpleado);
			}
		}

		if(this.provisionempleadoConstantesFunciones.resaltarFK_IdEstructuraProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdEstructuraProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdEstructuraProvisionEmpleado);
			}
		}

		if(this.provisionempleadoConstantesFunciones.resaltarFK_IdMesProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdMesProvisionEmpleado);
			}
		}

		if(this.provisionempleadoConstantesFunciones.resaltarFK_IdTipoProvisionEmpleadoProvisionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdTipoProvisionEmpleadoProvisionEmpleado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProvisionEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProvisionEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdAnioProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.provisionempleadoConstantesFunciones.mostrarFK_IdAnioProvisionEmpleado);
			if(!this.provisionempleadoConstantesFunciones.mostrarFK_IdAnioProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasProvisionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.provisionempleadoConstantesFunciones.mostrarFK_IdDefiProvisionEmpleadoProvisionEmpleado);
			if(!this.provisionempleadoConstantesFunciones.mostrarFK_IdDefiProvisionEmpleadoProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasProvisionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.provisionempleadoConstantesFunciones.mostrarFK_IdEmpleadoProvisionEmpleado);
			if(!this.provisionempleadoConstantesFunciones.mostrarFK_IdEmpleadoProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasProvisionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdEstructuraProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.provisionempleadoConstantesFunciones.mostrarFK_IdEstructuraProvisionEmpleado);
			if(!this.provisionempleadoConstantesFunciones.mostrarFK_IdEstructuraProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasProvisionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.provisionempleadoConstantesFunciones.mostrarFK_IdMesProvisionEmpleado);
			if(!this.provisionempleadoConstantesFunciones.mostrarFK_IdMesProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasProvisionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.provisionempleadoConstantesFunciones.mostrarFK_IdTipoProvisionEmpleadoProvisionEmpleado);
			if(!this.provisionempleadoConstantesFunciones.mostrarFK_IdTipoProvisionEmpleadoProvisionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasProvisionEmpleado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProvisionEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProvisionEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdAnioProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.provisionempleadoConstantesFunciones.activarFK_IdAnioProvisionEmpleado);
				this.jTabbedPaneBusquedasProvisionEmpleado.setEnabledAt(index,this.provisionempleadoConstantesFunciones.activarFK_IdAnioProvisionEmpleado);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.provisionempleadoConstantesFunciones.activarFK_IdDefiProvisionEmpleadoProvisionEmpleado);
				this.jTabbedPaneBusquedasProvisionEmpleado.setEnabledAt(index,this.provisionempleadoConstantesFunciones.activarFK_IdDefiProvisionEmpleadoProvisionEmpleado);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.provisionempleadoConstantesFunciones.activarFK_IdEmpleadoProvisionEmpleado);
				this.jTabbedPaneBusquedasProvisionEmpleado.setEnabledAt(index,this.provisionempleadoConstantesFunciones.activarFK_IdEmpleadoProvisionEmpleado);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdEstructuraProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.provisionempleadoConstantesFunciones.activarFK_IdEstructuraProvisionEmpleado);
				this.jTabbedPaneBusquedasProvisionEmpleado.setEnabledAt(index,this.provisionempleadoConstantesFunciones.activarFK_IdEstructuraProvisionEmpleado);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.provisionempleadoConstantesFunciones.activarFK_IdMesProvisionEmpleado);
				this.jTabbedPaneBusquedasProvisionEmpleado.setEnabledAt(index,this.provisionempleadoConstantesFunciones.activarFK_IdMesProvisionEmpleado);
			}

			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.provisionempleadoConstantesFunciones.activarFK_IdTipoProvisionEmpleadoProvisionEmpleado);
				this.jTabbedPaneBusquedasProvisionEmpleado.setEnabledAt(index,this.provisionempleadoConstantesFunciones.activarFK_IdTipoProvisionEmpleadoProvisionEmpleado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProvisionEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdAnioProvisionEmpleado);

			this.jTabbedPaneBusquedasProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);

			this.provisionempleadoConstantesFunciones.setResaltarFK_IdAnioProvisionEmpleado(resaltar);

			jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdAnioProvisionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDefiProvisionEmpleado")) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdDefiProvisionEmpleadoProvisionEmpleado);

			this.jTabbedPaneBusquedasProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);

			this.provisionempleadoConstantesFunciones.setResaltarFK_IdDefiProvisionEmpleadoProvisionEmpleado(resaltar);

			jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdDefiProvisionEmpleadoProvisionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoProvisionEmpleado);

			this.jTabbedPaneBusquedasProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);

			this.provisionempleadoConstantesFunciones.setResaltarFK_IdEmpleadoProvisionEmpleado(resaltar);

			jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdEmpleadoProvisionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdEstructuraProvisionEmpleado);

			this.jTabbedPaneBusquedasProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);

			this.provisionempleadoConstantesFunciones.setResaltarFK_IdEstructuraProvisionEmpleado(resaltar);

			jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdEstructuraProvisionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdMesProvisionEmpleado);

			this.jTabbedPaneBusquedasProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);

			this.provisionempleadoConstantesFunciones.setResaltarFK_IdMesProvisionEmpleado(resaltar);

			jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdMesProvisionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProvisionEmpleado")) {
			index= this.jTabbedPaneBusquedasProvisionEmpleado.indexOfComponent(this.jPanelFK_IdTipoProvisionEmpleadoProvisionEmpleado);

			this.jTabbedPaneBusquedasProvisionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvisionEmpleado.getComponent(index);

			this.provisionempleadoConstantesFunciones.setResaltarFK_IdTipoProvisionEmpleadoProvisionEmpleado(resaltar);

			jPanel.setBorder(this.provisionempleadoConstantesFunciones.resaltarFK_IdTipoProvisionEmpleadoProvisionEmpleado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProvisionEmpleado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProvisionEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProvisionEmpleado();
		this.updateVisibilidadResaltarControlesFormularioProvisionEmpleado();
		this.updateHabilitarResaltarControlesFormularioProvisionEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioProvisionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.provisionempleadoConstantesFunciones.resaltaridProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltaridProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarid_empresaProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarid_empresaProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarid_empleadoProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarid_empleadoProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarid_estructuraProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarid_estructuraProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarid_tipo_provision_empleadoProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarid_tipo_provision_empleadoProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarid_defi_provision_empleadoProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarid_defi_provision_empleadoProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarid_anioProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarid_anioProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarid_mesProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarid_mesProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarfechaProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfechaProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarfechaProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarfecha_liquidacionProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfecha_liquidacionProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarfecha_liquidacionProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarvalor_mesProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_mesProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarvalor_mesProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarvalor_pagaProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_pagaProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarvalor_pagaProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarvalor_vacacionProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_vacacionProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarvalor_vacacionProvisionEmpleado);}
		if(this.provisionempleadoConstantesFunciones.resaltarvalor_liquidacionProvisionEmpleado!=null && this.jInternalFrameDetalleFormProvisionEmpleado!=null) {this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_liquidacionProvisionEmpleado.setBorder(this.provisionempleadoConstantesFunciones.resaltarvalor_liquidacionProvisionEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProvisionEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostraridProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelidProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostraridProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_empresaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelid_empresaProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_empresaProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelid_empleadoProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_empleadoProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_estructuraProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelid_estructuraProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_estructuraProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_tipo_provision_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelid_tipo_provision_empleadoProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_tipo_provision_empleadoProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_defi_provision_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelid_defi_provision_empleadoProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_defi_provision_empleadoProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_anioProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelid_anioProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_anioProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_mesProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelid_mesProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarid_mesProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfechaProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarfechaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelfechaProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarfechaProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfecha_liquidacionProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarfecha_liquidacionProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelfecha_liquidacionProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarfecha_liquidacionProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_mesProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarvalor_mesProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelvalor_mesProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarvalor_mesProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_pagaProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarvalor_pagaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelvalor_pagaProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarvalor_pagaProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_vacacionProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarvalor_vacacionProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelvalor_vacacionProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarvalor_vacacionProvisionEmpleado);
		//this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_liquidacionProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarvalor_liquidacionProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jPanelvalor_liquidacionProvisionEmpleado.setVisible(this.provisionempleadoConstantesFunciones.mostrarvalor_liquidacionProvisionEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProvisionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProvisionEmpleado!=null) {
	
		this.jInternalFrameDetalleFormProvisionEmpleado.jLabelidProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activaridProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empresaProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarid_empresaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_empleadoProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarid_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_estructuraProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarid_estructuraProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_tipo_provision_empleadoProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarid_tipo_provision_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_defi_provision_empleadoProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarid_defi_provision_empleadoProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_anioProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarid_anioProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jComboBoxid_mesProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarid_mesProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfechaProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarfechaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jDateChooserfecha_liquidacionProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarfecha_liquidacionProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_mesProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarvalor_mesProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_pagaProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarvalor_pagaProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_vacacionProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarvalor_vacacionProvisionEmpleado);
		this.jInternalFrameDetalleFormProvisionEmpleado.jTextFieldvalor_liquidacionProvisionEmpleado.setEnabled(this.provisionempleadoConstantesFunciones.activarvalor_liquidacionProvisionEmpleado);
		}
	}
	
		
}