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

import com.bydan.erp.nomina.util.TallaVestidoConstantesFunciones;
import com.bydan.erp.nomina.util.TallaVestidoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TallaVestidoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TallaVestidoBean;
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
public class TallaVestidoBeanSwingJInternalFrame extends TallaVestidoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TallaVestidoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TallaVestido> tallavestidoValidator = new ClassValidator<TallaVestido>(TallaVestido.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TallaVestido tallavestido;	
	public TallaVestido tallavestidoAux;
	public TallaVestido tallavestidoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TallaVestido tallavestidoTotales;
	public Long idTallaVestidoActual;
	public Long iIdNuevoTallaVestido=0L;
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

	public String sFinalQueryComboVestimenta="";

	public List<Vestimenta> vestimentasForeignKey;

	public List<Vestimenta> getvestimentasForeignKey() {
		return vestimentasForeignKey;
	}

	public void setvestimentasForeignKey(List<Vestimenta> vestimentasForeignKey) {
		this.vestimentasForeignKey = vestimentasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vestimenta vestimentaForeignKey;

	public Vestimenta getvestimentaForeignKey() {
		return vestimentaForeignKey;
	}

	public void setvestimentaForeignKey(Vestimenta vestimentaForeignKey) {
		this.vestimentaForeignKey = vestimentaForeignKey;
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
	
	public Boolean isPermisoTodoTallaVestido;
	public Boolean isPermisoNuevoTallaVestido;
	public Boolean isPermisoActualizarTallaVestido;
	public Boolean isPermisoActualizarOriginalTallaVestido;
	public Boolean isPermisoEliminarTallaVestido;
	public Boolean isPermisoGuardarCambiosTallaVestido;
	public Boolean isPermisoConsultaTallaVestido;
	public Boolean isPermisoBusquedaTallaVestido;
	public Boolean isPermisoReporteTallaVestido;
	public Boolean isPermisoPaginacionMedioTallaVestido;
	public Boolean isPermisoPaginacionAltoTallaVestido;
	public Boolean isPermisoPaginacionTodoTallaVestido;
	public Boolean isPermisoCopiarTallaVestido;
	public Boolean isPermisoVerFormTallaVestido;
	public Boolean isPermisoDuplicarTallaVestido;
	public Boolean isPermisoOrdenTallaVestido;
	
	
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
	
	public TallaVestidoParameterReturnGeneral tallavestidoReturnGeneral;
	public TallaVestidoParameterReturnGeneral tallavestidoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTallaVestido=false;
	public Boolean esParaAccionDesdeFormularioTallaVestido=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TallaVestidoSessionBeanAdditional tallavestidoSessionBeanAdditional=null;
	
	public TallaVestidoSessionBeanAdditional getTallaVestidoSessionBeanAdditional() {
		return this.tallavestidoSessionBeanAdditional;
	}
	
	public void setTallaVestidoSessionBeanAdditional(TallaVestidoSessionBeanAdditional tallavestidoSessionBeanAdditional) {
		try {
			this.tallavestidoSessionBeanAdditional=tallavestidoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TallaVestidoBeanSwingJInternalFrameAdditional tallavestidoBeanSwingJInternalFrameAdditional=null;
	//public class TallaVestidoBeanSwingJInternalFrame
	
	public TallaVestidoBeanSwingJInternalFrameAdditional getTallaVestidoBeanSwingJInternalFrameAdditional() {
		return this.tallavestidoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTallaVestidoBeanSwingJInternalFrameAdditional(TallaVestidoBeanSwingJInternalFrameAdditional tallavestidoBeanSwingJInternalFrameAdditional) {
		try {
			this.tallavestidoBeanSwingJInternalFrameAdditional=tallavestidoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TallaVestidoLogic tallavestidoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TallaVestido tallavestidoBean;
	public TallaVestidoConstantesFunciones tallavestidoConstantesFunciones;
	//public TallaVestidoParameterReturnGeneral tallavestidoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public VestimentaLogic vestimentaLogic;
	
	//PARAMETROS
	
	
	//public List<TallaVestido> tallavestidos;	
	//public List<TallaVestido> tallavestidosEliminados;
	//public List<TallaVestido> tallavestidosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTallaVestido=false;
	public Boolean isVisibilidadCeldaDuplicarTallaVestido=true;
	public Boolean isVisibilidadCeldaCopiarTallaVestido=true;
	public Boolean isVisibilidadCeldaVerFormTallaVestido=true;
	public Boolean isVisibilidadCeldaOrdenTallaVestido=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
	public Boolean isVisibilidadCeldaModificarTallaVestido=false;
	public Boolean isVisibilidadCeldaActualizarTallaVestido=false;
	public Boolean isVisibilidadCeldaEliminarTallaVestido=false;
	public Boolean isVisibilidadCeldaCancelarTallaVestido=false;
	public Boolean isVisibilidadCeldaGuardarTallaVestido=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTallaVestido=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdVestimenta=false;
	
	public Long getiIdNuevoTallaVestido() {
		return this.iIdNuevoTallaVestido;
	}

	public void setiIdNuevoTallaVestido(Long iIdNuevoTallaVestido) {
		this.iIdNuevoTallaVestido = iIdNuevoTallaVestido;
	}
	
	public Long getidTallaVestidoActual() {
		return this.idTallaVestidoActual;
	}

	public void setidTallaVestidoActual(Long idTallaVestidoActual) {
		this.idTallaVestidoActual = idTallaVestidoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TallaVestido gettallavestido() {
		return this.tallavestido;
	}

	public void settallavestido(TallaVestido tallavestido) {
		this.tallavestido = tallavestido;
	}
	
	public TallaVestido gettallavestidoAux() {
		return this.tallavestidoAux;
	}

	public void settallavestidoAux(TallaVestido tallavestidoAux) {
		this.tallavestidoAux = tallavestidoAux;
	}				
	
	public TallaVestido gettallavestidoAnterior() {
		return this.tallavestidoAnterior;
	}

	public void settallavestidoAnterior(TallaVestido tallavestidoAnterior) {
		this.tallavestidoAnterior = tallavestidoAnterior;
	}	
	
	public TallaVestido gettallavestidoTotales() {
		return this.tallavestidoTotales;
	}

	public void settallavestidoTotales(TallaVestido tallavestidoTotales) {
		this.tallavestidoTotales = tallavestidoTotales;
	}	
	
	public TallaVestido gettallavestidoBean() {
		return this.tallavestidoBean;
	}

	public void settallavestidoBean(TallaVestido tallavestidoBean) {
		this.tallavestidoBean = tallavestidoBean;
	}	
	
	public TallaVestidoParameterReturnGeneral gettallavestidoReturnGeneral() {
		return this.tallavestidoReturnGeneral;
	}

	public void settallavestidoReturnGeneral(TallaVestidoParameterReturnGeneral tallavestidoReturnGeneral) {
		this.tallavestidoReturnGeneral = tallavestidoReturnGeneral;
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

	public Long id_vestimentaFK_IdVestimenta=-1L;

	public Long getid_vestimentaFK_IdVestimenta() {
		return this.id_vestimentaFK_IdVestimenta;
	}

	public void setid_vestimentaFK_IdVestimenta(Long id_vestimentaFK_IdVestimenta) {
		this.id_vestimentaFK_IdVestimenta = id_vestimentaFK_IdVestimenta;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TallaVestidoLogic getTallaVestidoLogic()	{		
		return tallavestidoLogic;
	}

	public void setTallaVestidoLogic(TallaVestidoLogic tallavestidoLogic) {
		this.tallavestidoLogic = tallavestidoLogic;
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
	
	public Boolean getIsEsNuevoTallaVestido() {
		return isEsNuevoTallaVestido;
	}

	public void setIsEsNuevoTallaVestido(Boolean isEsNuevoTallaVestido) {
		this.isEsNuevoTallaVestido = isEsNuevoTallaVestido;
	}

	public Boolean getEsParaAccionDesdeFormularioTallaVestido() {
		return esParaAccionDesdeFormularioTallaVestido;
	}
	
	public void setEsParaAccionDesdeFormularioTallaVestido(Boolean esParaAccionDesdeFormularioTallaVestido) {
		this.esParaAccionDesdeFormularioTallaVestido = esParaAccionDesdeFormularioTallaVestido;
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

			if(this.tallavestidoSessionBean==null) {
				this.tallavestidoSessionBean=new TallaVestidoSessionBean();
			}

			if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tallavestidoSessionBean.getlidEmpresaActual());
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

			if(this.tallavestidoSessionBean==null) {
				this.tallavestidoSessionBean=new TallaVestidoSessionBean();
			}

			if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(tallavestidoSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosVestimentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vestimentasForeignKey=new ArrayList<Vestimenta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VestimentaLogic vestimentaLogic=new VestimentaLogic();

			//vestimentaLogic.getVestimentaDataAccess().setIsForForeingKeyData(true);

			if(this.tallavestidoSessionBean==null) {
				this.tallavestidoSessionBean=new TallaVestidoSessionBean();
			}

			if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionVestimenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vestimentaLogic.getVestimentaDataAccess().setIsForForeingKeyData(true);

					vestimentaLogic.getTodosVestimentasWithConnection(sFinalQuery,new Pagination());

					this.vestimentasForeignKey=vestimentaLogic.getVestimentas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVestimenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vestimentaLogic.getEntityWithConnection(tallavestidoSessionBean.getlidVestimentaActual());
					this.vestimentasForeignKey.add(vestimentaLogic.getVestimenta());
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

					if(this.tallavestido!=null) {
						this.tallavestido.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTallaVestido!=null) {
						this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTallaVestido.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTallaVestido!=null) {
						if(this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.getItemCount()>0) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTallaVestidoGenerico)throws Exception
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
				jComboBoxid_empresaTallaVestidoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTallaVestidoGenerico!=null && jComboBoxid_empresaTallaVestidoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTallaVestidoGenerico.setSelectedIndex(0);
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

					if(this.tallavestido!=null) {
						this.tallavestido.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormTallaVestido!=null) {
						this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoTallaVestido.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormTallaVestido!=null) {
						if(this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.getItemCount()>0) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoTallaVestido!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoTallaVestido!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoTallaVestidoGenerico)throws Exception
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
				jComboBoxid_empleadoTallaVestidoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoTallaVestidoGenerico!=null && jComboBoxid_empleadoTallaVestidoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoTallaVestidoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVestimentaForeignKey(Long idVestimentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vestimenta  vestimentaTemp=null;

			for(Vestimenta vestimentaAux:vestimentasForeignKey) {
				if(vestimentaAux.getId()!=null && vestimentaAux.getId().equals(idVestimentaSeleccionado)) {
					vestimentaTemp=vestimentaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vestimentaTemp!=null) {

					if(this.tallavestido!=null) {
						this.tallavestido.setVestimenta(vestimentaTemp);
					}

					if(this.jInternalFrameDetalleFormTallaVestido!=null) {
						this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setSelectedItem(vestimentaTemp);
					}
				} else {
					//jComboBoxid_vestimentaTallaVestido.setSelectedItem(vestimentaTemp);
					if(this.jInternalFrameDetalleFormTallaVestido!=null) {
						if(this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.getItemCount()>0) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdVestimenta") || sFormularioTipoBusqueda.equals("Todos")){
					if(vestimentaTemp!=null && jComboBoxid_vestimentaFK_IdVestimentaTallaVestido!=null) {
						jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.setSelectedItem(vestimentaTemp);
					} else {
						if(jComboBoxid_vestimentaFK_IdVestimentaTallaVestido!=null) {
							//jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.setSelectedItem(vestimentaTemp);
							if(jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.getItemCount()>0) {
								jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.setSelectedIndex(0);
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

	public String getActualVestimentaForeignKeyDescripcion(Long idVestimentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vestimenta  vestimentaTemp=null;

			for(Vestimenta vestimentaAux:vestimentasForeignKey) {
				if(vestimentaAux.getId()!=null && vestimentaAux.getId().equals(idVestimentaSeleccionado)) {
					vestimentaTemp=vestimentaAux;
					break;
				}
			}


			sDescripcion=VestimentaConstantesFunciones.getVestimentaDescripcion(vestimentaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVestimentaForeignKeyGenerico(Long idVestimentaSeleccionado,JComboBox jComboBoxid_vestimentaTallaVestidoGenerico)throws Exception
	{
		try
		{
			Vestimenta  vestimentaTemp=null;

			for(Vestimenta vestimentaAux:vestimentasForeignKey) {
				if(vestimentaAux.getId()!=null && vestimentaAux.getId().equals(idVestimentaSeleccionado)) {
					vestimentaTemp=vestimentaAux;
					break;
				}
			}

			if(vestimentaTemp!=null) {
				jComboBoxid_vestimentaTallaVestidoGenerico.setSelectedItem(vestimentaTemp);
			} else {
				if(jComboBoxid_vestimentaTallaVestidoGenerico!=null && jComboBoxid_vestimentaTallaVestidoGenerico.getItemCount()>0) {
					jComboBoxid_vestimentaTallaVestidoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TallaVestido tallavestido,JComboBox jComboBoxid_empresaTallaVestidoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTallaVestidoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTallaVestidoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tallavestido.setid_empresa(empresaAux.getId());
				tallavestido.setempresa_descripcion(TallaVestidoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tallavestido.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(TallaVestido tallavestido,JComboBox jComboBoxid_empleadoTallaVestidoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoTallaVestidoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoTallaVestidoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				tallavestido.setid_empleado(empleadoAux.getId());
				tallavestido.setempleado_descripcion(TallaVestidoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				tallavestido.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVestimentaForeignKey(TallaVestido tallavestido,JComboBox jComboBoxid_vestimentaTallaVestidoGenerico)throws Exception
	{
		try
		{
			Vestimenta  vestimentaAux=new Vestimenta();

			if(jComboBoxid_vestimentaTallaVestidoGenerico==null) {
				vestimentaAux=(Vestimenta)this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.getSelectedItem();
			} else {
				vestimentaAux=(Vestimenta)jComboBoxid_vestimentaTallaVestidoGenerico.getSelectedItem();
			}

			if(vestimentaAux!=null && vestimentaAux.getId()!=null) {
				tallavestido.setid_vestimenta(vestimentaAux.getId());
				tallavestido.setvestimenta_descripcion(TallaVestidoConstantesFunciones.getVestimentaDescripcion(vestimentaAux));
				tallavestido.setVestimenta(vestimentaAux);			}
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

					if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTallaVestido!=null) { 
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTallaVestido!=null) { 
					}

					if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTallaVestido!=null) { 
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTallaVestido!=null) { 
					}

					if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.addItem(empleado);
							}
						}

						if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVestimentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVestimenta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTallaVestido!=null) { 
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.removeAllItems();

							for(Vestimenta vestimenta:this.vestimentasForeignKey) {
								this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.addItem(vestimenta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTallaVestido!=null) { 
					}

					if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdVestimenta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.removeAllItems();

							for(Vestimenta vestimenta:this.vestimentasForeignKey) {
								this.jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.addItem(vestimenta);
							}
						}

						if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTallaVestido!=null) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTallaVestido!=null) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTallaVestido!=null) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormTallaVestido!=null) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameVestimentaForeignKey(Vestimenta vestimenta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTallaVestido!=null) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setSelectedItem(vestimenta);
						}
					} else {
						if(this.jInternalFrameDetalleFormTallaVestido!=null) {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.setSelectedItem(vestimenta);
						} else {
							this.jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTallaVestido() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TallaVestidoConstantesFunciones.refrescarForeignKeysDescripcionesTallaVestido(this.tallavestidoLogic.getTallaVestidos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TallaVestidoConstantesFunciones.refrescarForeignKeysDescripcionesTallaVestido(this.tallavestidos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Vestimenta.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tallavestidoLogic.setTallaVestidos(this.tallavestidos);
			tallavestidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TallaVestidoParameterReturnGeneral getTallaVestidoParameterGeneral() {
		return this.tallavestidoParameterGeneral;
	}
	
	public void setTallaVestidoParameterGeneral(TallaVestidoParameterReturnGeneral tallavestidoParameterGeneral) {
		this.tallavestidoParameterGeneral = tallavestidoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTallaVestido() {
		return isPermisoTodoTallaVestido;
	}

	public void setIsPermisoTodoTallaVestido(Boolean isPermisoTodoTallaVestido) {
		this.isPermisoTodoTallaVestido = isPermisoTodoTallaVestido;
	}

	public Boolean getIsPermisoNuevoTallaVestido() {
		return isPermisoNuevoTallaVestido;
	}

	public void setIsPermisoNuevoTallaVestido(Boolean isPermisoNuevoTallaVestido) {
		this.isPermisoNuevoTallaVestido = isPermisoNuevoTallaVestido;
	}

	public Boolean getIsPermisoActualizarTallaVestido() {
		return isPermisoActualizarTallaVestido;
	}

	public void setIsPermisoActualizarTallaVestido(Boolean isPermisoActualizarTallaVestido) {
		this.isPermisoActualizarTallaVestido = isPermisoActualizarTallaVestido;
	}

	public Boolean getIsPermisoEliminarTallaVestido() {
		return isPermisoEliminarTallaVestido;
	}

	public void setIsPermisoEliminarTallaVestido(Boolean isPermisoEliminarTallaVestido) {
		this.isPermisoEliminarTallaVestido = isPermisoEliminarTallaVestido;
	}

	public Boolean getIsPermisoGuardarCambiosTallaVestido() {
		return isPermisoGuardarCambiosTallaVestido;
	}

	public void setIsPermisoGuardarCambiosTallaVestido(Boolean isPermisoGuardarCambiosTallaVestido) {
		this.isPermisoGuardarCambiosTallaVestido = isPermisoGuardarCambiosTallaVestido;
	}
	
	public Boolean getIsPermisoConsultaTallaVestido() {
		return isPermisoConsultaTallaVestido;
	}

	public void setIsPermisoConsultaTallaVestido(Boolean isPermisoConsultaTallaVestido) {
		this.isPermisoConsultaTallaVestido = isPermisoConsultaTallaVestido;
	}

	public Boolean getIsPermisoBusquedaTallaVestido() {
		return isPermisoBusquedaTallaVestido;
	}

	public void setIsPermisoBusquedaTallaVestido(Boolean isPermisoBusquedaTallaVestido) {
		this.isPermisoBusquedaTallaVestido = isPermisoBusquedaTallaVestido;
	}

	public Boolean getIsPermisoReporteTallaVestido() {
		return isPermisoReporteTallaVestido;
	}

	public void setIsPermisoReporteTallaVestido(Boolean isPermisoReporteTallaVestido) {
		this.isPermisoReporteTallaVestido = isPermisoReporteTallaVestido;
	}
	
	public Boolean getIsPermisoPaginacionMedioTallaVestido() {
		return isPermisoPaginacionMedioTallaVestido;
	}

	public void setIsPermisoPaginacionMedioTallaVestido(Boolean isPermisoPaginacionMedioTallaVestido) {
		this.isPermisoPaginacionMedioTallaVestido = isPermisoPaginacionMedioTallaVestido;
	}
	
	public Boolean getIsPermisoPaginacionTodoTallaVestido() {
		return isPermisoPaginacionTodoTallaVestido;
	}

	public void setIsPermisoPaginacionTodoTallaVestido(Boolean isPermisoPaginacionTodoTallaVestido) {
		this.isPermisoPaginacionTodoTallaVestido = isPermisoPaginacionTodoTallaVestido;
	}
	
	public Boolean getIsPermisoPaginacionAltoTallaVestido() {
		return isPermisoPaginacionAltoTallaVestido;
	}

	public void setIsPermisoPaginacionAltoTallaVestido(Boolean isPermisoPaginacionAltoTallaVestido) {
		this.isPermisoPaginacionAltoTallaVestido = isPermisoPaginacionAltoTallaVestido;
	}
	
	public Boolean getIsPermisoCopiarTallaVestido() {
		return isPermisoCopiarTallaVestido;
	}

	public void setIsPermisoCopiarTallaVestido(Boolean isPermisoCopiarTallaVestido) {
		this.isPermisoCopiarTallaVestido = isPermisoCopiarTallaVestido;
	}
	
	public Boolean getIsPermisoVerFormTallaVestido() {
		return isPermisoVerFormTallaVestido;
	}

	public void setIsPermisoVerFormTallaVestido(Boolean isPermisoVerFormTallaVestido) {
		this.isPermisoVerFormTallaVestido = isPermisoVerFormTallaVestido;
	}
	
	public Boolean getIsPermisoDuplicarTallaVestido() {
		return isPermisoDuplicarTallaVestido;
	}

	public void setIsPermisoDuplicarTallaVestido(Boolean isPermisoDuplicarTallaVestido) {
		this.isPermisoDuplicarTallaVestido = isPermisoDuplicarTallaVestido;
	}
	
	public Boolean getIsPermisoOrdenTallaVestido() {
		return isPermisoOrdenTallaVestido;
	}

	public void setIsPermisoOrdenTallaVestido(Boolean isPermisoOrdenTallaVestido) {
		this.isPermisoOrdenTallaVestido = isPermisoOrdenTallaVestido;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTallaVestido() {
		return isVisibilidadCeldaNuevoTallaVestido;
	}

	public void setIsVisibilidadCeldaNuevoTallaVestido(Boolean isVisibilidadCeldaNuevoTallaVestido) {
		this.isVisibilidadCeldaNuevoTallaVestido = isVisibilidadCeldaNuevoTallaVestido;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTallaVestido() {
		return isVisibilidadCeldaDuplicarTallaVestido;
	}

	public void setIsVisibilidadCeldaDuplicarTallaVestido(Boolean isVisibilidadCeldaDuplicarTallaVestido) {
		this.isVisibilidadCeldaDuplicarTallaVestido = isVisibilidadCeldaDuplicarTallaVestido;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTallaVestido() {
		return isVisibilidadCeldaCopiarTallaVestido;
	}

	public void setIsVisibilidadCeldaCopiarTallaVestido(Boolean isVisibilidadCeldaCopiarTallaVestido) {
		this.isVisibilidadCeldaCopiarTallaVestido = isVisibilidadCeldaCopiarTallaVestido;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTallaVestido() {
		return isVisibilidadCeldaVerFormTallaVestido;
	}

	public void setIsVisibilidadCeldaVerFormTallaVestido(Boolean isVisibilidadCeldaVerFormTallaVestido) {
		this.isVisibilidadCeldaVerFormTallaVestido = isVisibilidadCeldaVerFormTallaVestido;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTallaVestido() {
		return isVisibilidadCeldaOrdenTallaVestido;
	}

	public void setIsVisibilidadCeldaOrdenTallaVestido(Boolean isVisibilidadCeldaOrdenTallaVestido) {
		this.isVisibilidadCeldaOrdenTallaVestido = isVisibilidadCeldaOrdenTallaVestido;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTallaVestido() {
		return isVisibilidadCeldaNuevoRelacionesTallaVestido;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTallaVestido(Boolean isVisibilidadCeldaNuevoRelacionesTallaVestido) {
		this.isVisibilidadCeldaNuevoRelacionesTallaVestido = isVisibilidadCeldaNuevoRelacionesTallaVestido;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTallaVestido() {
		return isVisibilidadCeldaModificarTallaVestido;
	}

	public void setIsVisibilidadCeldaModificarTallaVestido(Boolean isVisibilidadCeldaModificarTallaVestido) {
		this.isVisibilidadCeldaModificarTallaVestido = isVisibilidadCeldaModificarTallaVestido;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTallaVestido() {
		return isVisibilidadCeldaActualizarTallaVestido;
	}

	public void setIsVisibilidadCeldaActualizarTallaVestido(Boolean isVisibilidadCeldaActualizarTallaVestido) {
		this.isVisibilidadCeldaActualizarTallaVestido = isVisibilidadCeldaActualizarTallaVestido;
	}

	public Boolean getIsVisibilidadCeldaEliminarTallaVestido() {
		return isVisibilidadCeldaEliminarTallaVestido;
	}

	public void setIsVisibilidadCeldaEliminarTallaVestido(Boolean isVisibilidadCeldaEliminarTallaVestido) {
		this.isVisibilidadCeldaEliminarTallaVestido = isVisibilidadCeldaEliminarTallaVestido;
	}

	public Boolean getIsVisibilidadCeldaCancelarTallaVestido() {
		return isVisibilidadCeldaCancelarTallaVestido;
	}

	public void setIsVisibilidadCeldaCancelarTallaVestido(Boolean isVisibilidadCeldaCancelarTallaVestido) {
		this.isVisibilidadCeldaCancelarTallaVestido = isVisibilidadCeldaCancelarTallaVestido;
	}

	public Boolean getIsVisibilidadCeldaGuardarTallaVestido() {
		return isVisibilidadCeldaGuardarTallaVestido;
	}

	public void setIsVisibilidadCeldaGuardarTallaVestido(Boolean isVisibilidadCeldaGuardarTallaVestido) {
		this.isVisibilidadCeldaGuardarTallaVestido = isVisibilidadCeldaGuardarTallaVestido;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTallaVestido() {
		return isVisibilidadCeldaGuardarCambiosTallaVestido;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTallaVestido(Boolean isVisibilidadCeldaGuardarCambiosTallaVestido) {
		this.isVisibilidadCeldaGuardarCambiosTallaVestido = isVisibilidadCeldaGuardarCambiosTallaVestido;
	}
		
	public TallaVestidoSessionBean gettallavestidoSessionBean() {
		return this.tallavestidoSessionBean;
	}
	
	public void settallavestidoSessionBean(TallaVestidoSessionBean tallavestidoSessionBean) {
		this.tallavestidoSessionBean=tallavestidoSessionBean;
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

	public Boolean getisVisibilidadFK_IdVestimenta() {
		return this.isVisibilidadFK_IdVestimenta;
	}

	public void setisVisibilidadFK_IdVestimenta(Boolean isVisibilidadFK_IdVestimenta) {
		this.isVisibilidadFK_IdVestimenta=isVisibilidadFK_IdVestimenta;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTallaVestido(TallaVestido tallavestido)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tallavestido,null);
				this.setActualParaGuardarEmpleadoForeignKey(tallavestido,null);
				this.setActualParaGuardarVestimentaForeignKey(tallavestido,null);
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
	
	public void bugActualizarReferenciaActual(TallaVestido tallavestido,TallaVestido tallavestidoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTallaVestido(tallavestido);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tallavestidoAux.setId(tallavestido.getId());
		tallavestidoAux.setVersionRow(tallavestido.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTallaVestido();
		
			int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tallavestidoValidator.getInvalidValues(this.tallavestido);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tallavestidoLogic.setDatosCliente(datosCliente);
			tallavestidoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tallavestidoAux=new  TallaVestido();
				
				tallavestidoAux.setIsNew(true);
				tallavestidoAux.setIsChanged(true);
				
				tallavestidoAux.setTallaVestidoOriginal(this.tallavestido);
				
				tallavestidoAux.setId(this.tallavestido.getId());	
				tallavestidoAux.setVersionRow(this.tallavestido.getVersionRow());	
				tallavestidoAux.setid_empresa(this.tallavestido.getid_empresa());	
				tallavestidoAux.setid_empleado(this.tallavestido.getid_empleado());	
				tallavestidoAux.setid_vestimenta(this.tallavestido.getid_vestimenta());	
				tallavestidoAux.settalla(this.tallavestido.gettalla());	
				tallavestidoAux.setcantidad(this.tallavestido.getcantidad());	
				tallavestidoAux.setdescripcion(this.tallavestido.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tallavestidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tallavestidoAux,tallavestidoLogic.getTallaVestidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tallavestidoAux,tallavestidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tallavestidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tallavestidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidoLogic.saveTallaVestidos();//WithConnection
						//tallavestidoLogic.getSetVersionRowTallaVestidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tallavestido,tallavestidoAux);
					
					this.refrescarForeignKeysDescripcionesTallaVestido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tallavestidoLogic.saveTallaVestidoRelaciones(tallavestidoAux);//WithConnection
								//tallavestidoLogic.getSetVersionRowTallaVestidos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tallavestido,tallavestidoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tallavestidoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tallavestidoAux,tallavestidoLogic.getTallaVestidos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tallavestidoAux,tallavestidos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tallavestido,tallavestidoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tallavestidoAux=new  TallaVestido();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tallavestidoSessionBean.getEsGuardarRelacionado() 
					|| (this.tallavestidoSessionBean.getEsGuardarRelacionado() && this.tallavestido.getId()>=0)) {
						
					tallavestidoAux.setIsNew(false);
				}
				
				tallavestidoAux.setIsDeleted(false);
			
				tallavestidoAux.setId(this.tallavestido.getId());	
				tallavestidoAux.setVersionRow(this.tallavestido.getVersionRow());	
				tallavestidoAux.setid_empresa(this.tallavestido.getid_empresa());	
				tallavestidoAux.setid_empleado(this.tallavestido.getid_empleado());	
				tallavestidoAux.setid_vestimenta(this.tallavestido.getid_vestimenta());	
				tallavestidoAux.settalla(this.tallavestido.gettalla());	
				tallavestidoAux.setcantidad(this.tallavestido.getcantidad());	
				tallavestidoAux.setdescripcion(this.tallavestido.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tallavestidoAux,tallavestidoLogic.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tallavestidoAux,tallavestidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tallavestidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tallavestidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidoLogic.saveTallaVestidos();//WithConnection
						//tallavestidoLogic.getSetVersionRowTallaVestidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tallavestido,tallavestidoAux);
					
					this.refrescarForeignKeysDescripcionesTallaVestido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tallavestidoLogic.saveTallaVestidoRelaciones(tallavestidoAux);//WithConnection
								//tallavestidoLogic.getSetVersionRowTallaVestidos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tallavestido,tallavestidoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tallavestidoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tallavestidoAux,tallavestidoLogic.getTallaVestidos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tallavestidoAux,tallavestidos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tallavestido,tallavestidoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tallavestidoAux=new  TallaVestido();
				
				tallavestidoAux.setIsNew(false);
				tallavestidoAux.setIsChanged(false);
				
				tallavestidoAux.setIsDeleted(true);
				
				tallavestidoAux.setId(this.tallavestido.getId());	
				tallavestidoAux.setVersionRow(this.tallavestido.getVersionRow());	
				tallavestidoAux.setid_empresa(this.tallavestido.getid_empresa());	
				tallavestidoAux.setid_empleado(this.tallavestido.getid_empleado());	
				tallavestidoAux.setid_vestimenta(this.tallavestido.getid_vestimenta());	
				tallavestidoAux.settalla(this.tallavestido.gettalla());	
				tallavestidoAux.setcantidad(this.tallavestido.getcantidad());	
				tallavestidoAux.setdescripcion(this.tallavestido.getdescripcion());	
				
				if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tallavestidoAux.getId()>=0) {	
						this.tallavestidosEliminados.add(tallavestidoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tallavestidoAux,tallavestidoLogic.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tallavestidoAux,tallavestidos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tallavestidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tallavestidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidoLogic.saveTallaVestidos();//WithConnection
						//tallavestidoLogic.getSetVersionRowTallaVestidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tallavestidoLogic.saveTallaVestidoRelaciones(tallavestidoAux);//WithConnection
								//tallavestidoLogic.getSetVersionRowTallaVestidos();//WithConnection
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
							if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tallavestidoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tallavestidoAux,tallavestidoLogic.getTallaVestidos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tallavestidoAux,tallavestidos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.getTallaVestidos().addAll(this.tallavestidosEliminados);
					
					tallavestidoLogic.saveTallaVestidos();//WithConnection
					//tallavestidoLogic.getSetVersionRowTallaVestidos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTallaVestido();
				
				this.tallavestidosEliminados= new ArrayList<TallaVestido>();		
			}
			
			if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Talla Vestido GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tallavestido=tallavestidoAux;
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
      		//this.finishProcessTallaVestido();
      	}
		
	}	
	
	public void actualizarRelaciones(TallaVestido tallavestidoLocal) throws Exception {
		
		if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TallaVestido tallavestidoLocal) throws Exception {	
		if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tallavestidoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				tallavestidoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VestimentaDetalleFormJInternalFrame.class)) {
				VestimentaBeanSwingJInternalFrame vestimentaBeanSwingJInternalFrameLocal=(VestimentaBeanSwingJInternalFrame) ((VestimentaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vestimentaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVestimenta(vestimentaBeanSwingJInternalFrameLocal.getvestimenta(),true);
				vestimentaBeanSwingJInternalFrameLocal.actualizarLista(vestimentaBeanSwingJInternalFrameLocal.vestimenta,this.vestimentasForeignKey);

				vestimentaBeanSwingJInternalFrameLocal.actualizarRelaciones(vestimentaBeanSwingJInternalFrameLocal.vestimenta);

				tallavestidoLocal.setVestimenta(vestimentaBeanSwingJInternalFrameLocal.vestimenta);

				this.addItemDefectoCombosForeignKeyVestimenta();
				this.cargarCombosFrameVestimentasForeignKey("Formulario");
				this.setActualVestimentaForeignKey(vestimentaBeanSwingJInternalFrameLocal.vestimenta.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTallaVestidoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tallavestidoValidator.getInvalidValues(this.tallavestido);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TallaVestido tallavestido,List<TallaVestido> tallavestidos) throws Exception {
		try	{		
			TallaVestidoConstantesFunciones.actualizarLista(tallavestido,tallavestidos,this.tallavestidoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TallaVestido tallavestido,List<TallaVestido> tallavestidos) throws Exception {
		try	{			
			TallaVestidoConstantesFunciones.actualizarSelectedLista(tallavestido,tallavestidos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TallaVestido> tallavestidosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tallavestidosLocal=this.tallavestidoLogic.getTallaVestidos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tallavestidosLocal=this.tallavestidos;
			}
			//ARCHITECTURE
		
			for(TallaVestido tallavestidoLocal:tallavestidosLocal) {
				if(this.permiteMantenimiento(tallavestidoLocal) && tallavestidoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TallaVestidoConstantesFunciones.getTallaVestidoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TallaVestidoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabelid_empresaTallaVestido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TallaVestidoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabelid_empleadoTallaVestido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TallaVestidoConstantesFunciones.IDVESTIMENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabelid_vestimentaTallaVestido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TallaVestidoConstantesFunciones.TALLA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabeltallaTallaVestido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TallaVestidoConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabelcantidadTallaVestido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TallaVestidoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabeldescripcionTallaVestido,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaVestido.jLabelid_empresaTallaVestido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaVestido.jLabelid_empleadoTallaVestido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaVestido.jLabelid_vestimentaTallaVestido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaVestido.jLabeltallaTallaVestido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaVestido.jLabelcantidadTallaVestido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaVestido.jLabeldescripcionTallaVestido,"");
		
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
		this.iIdNuevoTallaVestido--;	
		
		
		this.tallavestidoAux=new TallaVestido();
		
		this.tallavestidoAux.setId(this.iIdNuevoTallaVestido);
		this.tallavestidoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tallavestidoLogic.getTallaVestidos().add(this.tallavestidoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tallavestidos.add(this.tallavestidoAux);
		}
		//ARCHITECTURE
		
		this.tallavestido=this.tallavestidoAux;
		
		if(TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTallaVestido(this.tallavestido);
			this.setVariablesObjetoActualToFormularioForeignKeyTallaVestido(this.tallavestido);
		}
				
		//this.setDefaultControlesTallaVestido();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTallaVestido();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTallaVestido();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTallaVestido();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTallaVestido(this.tallavestidoBean,this.tallavestido,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TallaVestidoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
			classes=TallaVestidoConstantesFunciones.getClassesRelationshipsOfTallaVestido(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tallavestidoReturnGeneral=tallavestidoLogic.procesarEventosTallaVestidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tallavestidoLogic.getTallaVestidos(),this.tallavestido,this.tallavestidoParameterGeneral,this.isEsNuevoTallaVestido,classes);//this.tallavestidoLogic.getTallaVestido()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTallaVestido(this.tallavestidoReturnGeneral,this.tallavestidoBean,false);
		
		if(this.tallavestidoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTallaVestido(this.tallavestidoReturnGeneral.getTallaVestido());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTallaVestido(this.tallavestidoReturnGeneral.getTallaVestido());
		}
		
		if(this.tallavestidoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTallaVestido(this.tallavestidoReturnGeneral.getTallaVestido(),classes);//this.tallavestidoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTallaVestido();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTallaVestido();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TallaVestidoBeanSwingJInternalFrameAdditional.RecargarFormTallaVestido(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTallaVestido(false);
						
			if(tallavestidoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTallaVestido();
			}
			
			this.actualizarVisualTableDatosTallaVestido();
			
			this.jTableDatosTallaVestido.setRowSelectionInterval(this.getIndiceNuevoTallaVestido(), this.getIndiceNuevoTallaVestido());
			
			this.seleccionarFilaTablaTallaVestidoActual();
						
			this.actualizarEstadoCeldasBotonesTallaVestido("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTallaVestido(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTallaVestido.jTextFieldtallaTallaVestido.setEnabled(isHabilitar && this.tallavestidoConstantesFunciones.activartallaTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jTextFieldcantidadTallaVestido.setEnabled(isHabilitar && this.tallavestidoConstantesFunciones.activarcantidadTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jTextAreadescripcionTallaVestido.setEnabled(isHabilitar && this.tallavestidoConstantesFunciones.activardescripcionTallaVestido);	
		//
		this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setEnabled(isHabilitar && this.tallavestidoConstantesFunciones.activarid_empresaTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setEnabled(isHabilitar && this.tallavestidoConstantesFunciones.activarid_empleadoTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setEnabled(isHabilitar && this.tallavestidoConstantesFunciones.activarid_vestimentaTallaVestido);
	};
	
	public void setDefaultControlesTallaVestido() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTallaVestido(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tallavestidoSessionBean.setConGuardarRelaciones(true);			
			this.tallavestidoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.setVisible(true);
			
					
		} else {
			//this.tallavestidoSessionBean.setConGuardarRelaciones(false);			
			this.tallavestidoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTallaVestido() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
				if(tallavestidoAux.getId().equals(this.iIdNuevoTallaVestido)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaVestido tallavestidoAux:this.tallavestidos) {
				if(tallavestidoAux.getId().equals(this.iIdNuevoTallaVestido)) {
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
	
	public int getIndiceActualTallaVestido(TallaVestido tallavestido,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
				if(tallavestidoAux.getId().equals(tallavestido.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaVestido tallavestidoAux:this.tallavestidos) {
				if(tallavestidoAux.getId().equals(tallavestido.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTallaVestido(TallaVestido tallavestidoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
				if(tallavestidoAux.getTallaVestidoOriginal().getId().equals(tallavestidoOriginal.getId())) {
					existe=true;
					tallavestidoOriginal.setId(tallavestidoAux.getId());
					tallavestidoOriginal.setVersionRow(tallavestidoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaVestido tallavestidoAux:this.tallavestidos) {
				if(tallavestidoAux.getTallaVestidoOriginal().getId().equals(tallavestidoOriginal.getId())) {
					existe=true;
					tallavestidoOriginal.setId(tallavestidoAux.getId());
					tallavestidoOriginal.setVersionRow(tallavestidoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTallaVestido(Boolean esParaCancelar) throws Exception {
		tallavestidosAux=new ArrayList<TallaVestido>();
		tallavestidoAux=new TallaVestido();
		
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
					if(tallavestidoAux.getId()<0) {
						tallavestidosAux.add(tallavestidoAux);
					}		
				}
				this.iIdNuevoTallaVestido=0L;
				this.tallavestidoLogic.getTallaVestidos().removeAll(tallavestidosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TallaVestido tallavestidoAux:this.tallavestidos) {
					if(tallavestidoAux.getId()<0) {
						tallavestidosAux.add(tallavestidoAux);
					}		
				}
				this.iIdNuevoTallaVestido=0L;
				this.tallavestidos.removeAll(tallavestidosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTallaVestido 
					&& this.tallavestidoLogic.getTallaVestidos().size()>0
					) {
					tallavestidoAux=this.tallavestidoLogic.getTallaVestidos().get(this.tallavestidoLogic.getTallaVestidos().size() - 1);
				
					if(tallavestidoAux.getId()<0) {
						this.tallavestidoLogic.getTallaVestidos().remove(tallavestidoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTallaVestido && this.tallavestidos.size()>0) {
					tallavestidoAux=this.tallavestidos.get(this.tallavestidos.size() - 1);
				
					if(tallavestidoAux.getId()<0) {
						this.tallavestidos.remove(tallavestidoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTallaVestido(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tallavestido.getId()<0) {
				this.tallavestidoLogic.getTallaVestidos().remove(this.tallavestido);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tallavestido.getId()<0) {
				this.tallavestidos.remove(this.tallavestido);
			}
		}			
	}
	
	public void setEstadosInicialesTallaVestido(List<TallaVestido> tallavestidosAux) throws Exception {
		TallaVestidoConstantesFunciones.setEstadosInicialesTallaVestido(tallavestidosAux);
	}
	
	public void setEstadosInicialesTallaVestido(TallaVestido tallavestidoAux) throws Exception {
		TallaVestidoConstantesFunciones.setEstadosInicialesTallaVestido(tallavestidoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTallaVestidoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTallaVestido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTallaVestidoActual()) {
				if(!this.isEsNuevoTallaVestido) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTallaVestido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTallaVestido=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTallaVestidoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Talla Vestido ?", "MANTENIMIENTO DE Talla Vestido", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTallaVestido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TallaVestido tallavestido) throws Exception {
		TallaVestidoConstantesFunciones.seleccionarAsignar(this.tallavestido,tallavestido);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTallaVestido=this.isPermisoActualizarOriginalTallaVestido;
			
			
			this.seleccionarAsignar(tallavestido);
			
			

			idEmpleadoActual=tallavestido.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TallaVestidoConstantesFunciones.quitarEspaciosTallaVestido(this.tallavestido,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTallaVestido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tallavestidoSessionBean.setsFuncionBusquedaRapida(this.tallavestidoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoTallaVestido) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTallaVestido(esParaCancelar);				
				this.cancelarNuevoTallaVestido(esParaCancelar);								
			}
			
			this.tallavestido=new TallaVestido();
			
			this.inicializarTallaVestido();
			
			this.actualizarEstadoCeldasBotonesTallaVestido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTallaVestido() throws Exception {
		try {
			TallaVestidoConstantesFunciones.inicializarTallaVestido(this.tallavestido);
			
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
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tallavestidoLogic.getTallaVestidos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTallaVestidos(String sAccionBusqueda,List<TallaVestido> tallavestidosParaReportes) throws Exception {
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
					sPathReporteFinal="TallaVestido"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TallaVestidoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TallaVestidoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TallaVestido"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Talla Vestidos");		
		parameters.put("busquedapor", TallaVestidoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTallaVestido=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TallaVestidoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TallaVestidoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTallaVestido=new JRBeanArrayDataSource(TallaVestidoJInternalFrame.TraerTallaVestidoBeans(tallavestidosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTallaVestido);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TallaVestidoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TallaVestidoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TallaVestidoBean.TraerTallaVestidoBeans(tallavestidosParaReportes).toArray()));
							
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
				this.generarExcelReporteTallaVestidos(sAccionBusqueda,sTipoArchivoReporte,tallavestidosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTallaVestidos(sAccionBusqueda,sTipoArchivoReporte,tallavestidosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTallaVestidoActionPerformed(null);
					//this.generarExcelReporteTallaVestidos(sAccionBusqueda,sTipoArchivoReporte,tallavestidosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTallaVestidos(sAccionBusqueda,sTipoArchivoReporte,tallavestidosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTallaVestidos(sAccionBusqueda,sTipoArchivoReporte,tallavestidosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTallaVestidos(sAccionBusqueda,sTipoArchivoReporte,tallavestidosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTallaVestidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TallaVestido> tallavestidosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallavestido";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TallaVestidos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTallaVestido("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TallaVestido tallavestido : tallavestidosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TallaVestidoConstantesFunciones.generarExcelReporteDataTallaVestido("NORMAL",row,workbook,tallavestido,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTallaVestido(String sTipo,Row row,Workbook workbook) {
		
		TallaVestidoConstantesFunciones.generarExcelReporteHeaderTallaVestido(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTallaVestidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TallaVestido> tallavestidosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallavestido_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TallaVestidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TallaVestido tallavestido : tallavestidosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TallaVestidoConstantesFunciones.getTallaVestidoDescripcion(tallavestido));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaVestidoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallavestido.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallavestido.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallavestido.getvestimenta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaVestidoConstantesFunciones.LABEL_TALLA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_TALLA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallavestido.gettalla());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaVestidoConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallavestido.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaVestidoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallavestido.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTallaVestidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TallaVestido> tallavestidosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TallaVestido> tallavestidosRespaldo=null;
		
		classes=TallaVestidoConstantesFunciones.getClassesRelationshipsOfTallaVestido(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tallavestidoLogic.setDatosCliente(this.datosCliente);
		this.tallavestidoLogic.setDatosDeep(this.datosDeep);
		this.tallavestidoLogic.setIsConDeep(true);
		
		tallavestidosRespaldo=this.tallavestidoLogic.getTallaVestidos();
		
		this.tallavestidoLogic.setTallaVestidos(tallavestidosParaReportes);	
		this.tallavestidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tallavestidosParaReportes=this.tallavestidoLogic.getTallaVestidos();
		this.tallavestidoLogic.setTallaVestidos(tallavestidosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallavestido_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TallaVestidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTallaVestido("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TallaVestido tallavestido : tallavestidosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTallaVestido("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TallaVestidoConstantesFunciones.generarExcelReporteDataTallaVestido("NORMAL",row,workbook,tallavestido,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TallaVestidoConstantesFunciones.getTallaVestidoDescripcion(tallavestido));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTallaVestido.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTallaVestido() throws Exception {		
		this.startProcessTallaVestido(true);
	}
	
	public void startProcessTallaVestido(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTallaVestido ,this.jPanelParametrosReportesTallaVestido, this.jScrollPanelDatosTallaVestido,this.jPanelPaginacionTallaVestido, this.jScrollPanelDatosEdicionTallaVestido, this.jPanelAccionesTallaVestido,this.jPanelAccionesFormularioTallaVestido,this.jmenuBarTallaVestido,this.jmenuBarDetalleTallaVestido,this.jTtoolBarTallaVestido,this.jTtoolBarDetalleTallaVestido);		
		
		final JTabbedPane jTabbedPaneBusquedasTallaVestido=this.jTabbedPaneBusquedasTallaVestido; 
		
		final JPanel jPanelParametrosReportesTallaVestido=this.jPanelParametrosReportesTallaVestido;
		//final JScrollPane jScrollPanelDatosTallaVestido=this.jScrollPanelDatosTallaVestido;
		final JTable jTableDatosTallaVestido=this.jTableDatosTallaVestido;		
		final JPanel jPanelPaginacionTallaVestido=this.jPanelPaginacionTallaVestido;
		//final JScrollPane jScrollPanelDatosEdicionTallaVestido=this.jScrollPanelDatosEdicionTallaVestido;
		final JPanel jPanelAccionesTallaVestido=this.jPanelAccionesTallaVestido;
		
		JPanel jPanelCamposAuxiliarTallaVestido=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTallaVestido=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			jPanelCamposAuxiliarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jPanelCamposTallaVestido;
			jPanelAccionesFormularioAuxiliarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jPanelAccionesFormularioTallaVestido;
		}
		
		final JPanel jPanelCamposTallaVestido=jPanelCamposAuxiliarTallaVestido;
		final JPanel jPanelAccionesFormularioTallaVestido=jPanelAccionesFormularioAuxiliarTallaVestido;
		
		
		final JMenuBar jmenuBarTallaVestido=this.jmenuBarTallaVestido;
		final JToolBar jTtoolBarTallaVestido=this.jTtoolBarTallaVestido;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTallaVestido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTallaVestido=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			jmenuBarDetalleAuxiliarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jmenuBarDetalleTallaVestido;
			jTtoolBarDetalleAuxiliarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jTtoolBarDetalleTallaVestido;
		}
		
		final JMenuBar jmenuBarDetalleTallaVestido=jmenuBarDetalleAuxiliarTallaVestido;
		final JToolBar jTtoolBarDetalleTallaVestido=jTtoolBarDetalleAuxiliarTallaVestido;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTallaVestido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTallaVestido;
			processRunnable.jTableDatos=jTableDatosTallaVestido;
			processRunnable.jPanelCampos=jPanelCamposTallaVestido;
			processRunnable.jPanelPaginacion=jPanelPaginacionTallaVestido;
			processRunnable.jPanelAcciones=jPanelAccionesTallaVestido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTallaVestido;
			
			
			processRunnable.jmenuBar=jmenuBarTallaVestido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTallaVestido;
			processRunnable.jTtoolBar=jTtoolBarTallaVestido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTallaVestido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTallaVestido ,jPanelParametrosReportesTallaVestido,jTableDatosTallaVestido, /*jScrollPanelDatosTallaVestido,*/jPanelCamposTallaVestido,jPanelPaginacionTallaVestido, /*jScrollPanelDatosEdicionTallaVestido,*/ jPanelAccionesTallaVestido,jPanelAccionesFormularioTallaVestido,jmenuBarTallaVestido,jmenuBarDetalleTallaVestido,jTtoolBarTallaVestido,jTtoolBarDetalleTallaVestido);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTallaVestido ,jPanelParametrosReportesTallaVestido, jScrollPanelDatosTallaVestido,jPanelPaginacionTallaVestido, jScrollPanelDatosEdicionTallaVestido, jPanelAccionesTallaVestido,jPanelAccionesFormularioTallaVestido,jmenuBarTallaVestido,jmenuBarDetalleTallaVestido,jTtoolBarTallaVestido,jTtoolBarDetalleTallaVestido);
						
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
	
	public void finishProcessTallaVestido() {// throws Exception 
		this.finishProcessTallaVestido(true);
	}
	
	public void finishProcessTallaVestido(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTallaVestido ,this.jPanelParametrosReportesTallaVestido, this.jScrollPanelDatosTallaVestido,this.jPanelPaginacionTallaVestido, this.jScrollPanelDatosEdicionTallaVestido, this.jPanelAccionesTallaVestido,this.jPanelAccionesFormularioTallaVestido,this.jmenuBarTallaVestido,this.jmenuBarDetalleTallaVestido,this.jTtoolBarTallaVestido,this.jTtoolBarDetalleTallaVestido);		
		
		final JTabbedPane jTabbedPaneBusquedasTallaVestido=this.jTabbedPaneBusquedasTallaVestido; 
		
		final JPanel jPanelParametrosReportesTallaVestido=this.jPanelParametrosReportesTallaVestido;
		//final JScrollPane jScrollPanelDatosTallaVestido=this.jScrollPanelDatosTallaVestido;
		final JTable jTableDatosTallaVestido=this.jTableDatosTallaVestido;		
		final JPanel jPanelPaginacionTallaVestido=this.jPanelPaginacionTallaVestido;
		//final JScrollPane jScrollPanelDatosEdicionTallaVestido=this.jScrollPanelDatosEdicionTallaVestido;
		final JPanel jPanelAccionesTallaVestido=this.jPanelAccionesTallaVestido;
		
		JPanel jPanelCamposAuxiliarTallaVestido=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTallaVestido=new JPanel();
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			jPanelCamposAuxiliarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jPanelCamposTallaVestido;
			jPanelAccionesFormularioAuxiliarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jPanelAccionesFormularioTallaVestido;
		}
		
		final JPanel jPanelCamposTallaVestido=jPanelCamposAuxiliarTallaVestido;
		final JPanel jPanelAccionesFormularioTallaVestido=jPanelAccionesFormularioAuxiliarTallaVestido;
		
		
		final JMenuBar jmenuBarTallaVestido=this.jmenuBarTallaVestido;		
		final JToolBar jTtoolBarTallaVestido=this.jTtoolBarTallaVestido;
				
		JMenuBar jmenuBarDetalleAuxiliarTallaVestido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTallaVestido=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			jmenuBarDetalleAuxiliarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jmenuBarDetalleTallaVestido;
			jTtoolBarDetalleAuxiliarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jTtoolBarDetalleTallaVestido;		
		}
		
		final JMenuBar jmenuBarDetalleTallaVestido=jmenuBarDetalleAuxiliarTallaVestido;
		final JToolBar jTtoolBarDetalleTallaVestido=jTtoolBarDetalleAuxiliarTallaVestido;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTallaVestido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTallaVestido;
			processRunnable.jTableDatos=jTableDatosTallaVestido;
			processRunnable.jPanelCampos=jPanelCamposTallaVestido;
			processRunnable.jPanelPaginacion=jPanelPaginacionTallaVestido;
			processRunnable.jPanelAcciones=jPanelAccionesTallaVestido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTallaVestido;
			
			
			processRunnable.jmenuBar=jmenuBarTallaVestido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTallaVestido;
			processRunnable.jTtoolBar=jTtoolBarTallaVestido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTallaVestido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTallaVestido ,jPanelParametrosReportesTallaVestido, jTableDatosTallaVestido,/*jScrollPanelDatosTallaVestido,*/jPanelCamposTallaVestido,jPanelPaginacionTallaVestido, /*jScrollPanelDatosEdicionTallaVestido,*/ jPanelAccionesTallaVestido,jPanelAccionesFormularioTallaVestido,jmenuBarTallaVestido,jmenuBarDetalleTallaVestido,jTtoolBarTallaVestido,jTtoolBarDetalleTallaVestido));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTallaVestido(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTallaVestido(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTallaVestido(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTallaVestido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTallaVestido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTallaVestido,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTallaVestido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTallaVestido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTallaVestido,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tallavestidoConstantesFunciones.getsFinalQueryTallaVestido();
		String  finalQueryPaginacionTodos=this.tallavestidoConstantesFunciones.getsFinalQueryTallaVestido();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TallaVestidoConstantesFunciones.getArrayColumnasGlobalesNoTallaVestido(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TallaVestidoConstantesFunciones.getArrayColumnasGlobalesTallaVestido(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TallaVestidoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tallavestidosEliminados= new ArrayList<TallaVestido>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTallaVestido();
		
				///*TallaVestidoSessionBean*/this.tallavestidoSessionBean=new TallaVestidoSessionBean();
			
			if(this.tallavestidoSessionBean==null) {
				this.tallavestidoSessionBean=new TallaVestidoSessionBean();
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
					this.iNumeroPaginacion=TallaVestidoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TallaVestidoConstantesFunciones.getClassesForeignKeysOfTallaVestido(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tallavestido."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tallavestidosAux= new ArrayList<TallaVestido>();
			
				
			tallavestidoLogic.setDatosCliente(this.datosCliente);
			tallavestidoLogic.setDatosDeep(this.datosDeep);
			tallavestidoLogic.setIsConDeep(true);
			
			
			tallavestidoLogic.getTallaVestidoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tallavestidoLogic.getTodosTallaVestidos(finalQueryGlobal,pagination);
					
					//tallavestidoLogic.getTodosTallaVestidosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tallavestidoLogic.getTallaVestidos()==null|| tallavestidoLogic.getTallaVestidos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tallavestidosAux= new ArrayList<TallaVestido>();
							tallavestidosAux.addAll(tallavestidoLogic.getTallaVestidos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidosAux= new ArrayList<TallaVestido>();
							tallavestidosAux.addAll(tallavestidos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tallavestidoLogic.getTodosTallaVestidos(finalQueryGlobal+"",this.pagination);												
							
							//tallavestidoLogic.getTodosTallaVestidosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTallaVestidos("Todos",tallavestidoLogic.getTallaVestidos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tallavestidoLogic.setTallaVestidos(new ArrayList<TallaVestido>());					
							tallavestidoLogic.getTallaVestidos().addAll(tallavestidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidos=new ArrayList<TallaVestido>();
							tallavestidos.addAll(tallavestidosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTallaVestido=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTallaVestido=this.idActual;
				
				} else if(this.idTallaVestidoActual!=null && this.idTallaVestidoActual!=0L) {
					idTallaVestido=idTallaVestidoActual;
				}
				
					
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndicePorId(idTallaVestido);
				
				this.tallavestidos=new ArrayList<TallaVestido>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tallavestidoLogic.getEntity(idTallaVestido);
					
					//tallavestidoLogic.getEntityWithConnection(idTallaVestido);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallavestidoLogic.setTallaVestidos(new ArrayList<TallaVestido>());
					tallavestidoLogic.getTallaVestidos().add(tallavestidoLogic.getTallaVestido());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallavestidos=new ArrayList<TallaVestido>();
					this.tallavestidos.add(tallavestido);
				}
				
				if(tallavestidoLogic.getTallaVestido()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tallavestidoLogic.getTallaVestidosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tallavestidoLogic.getTallaVestidos()==null||tallavestidoLogic.getTallaVestidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tallavestidos==null|| tallavestidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidosAux=new ArrayList<TallaVestido>();
						tallavestidosAux.addAll(tallavestidoLogic.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidosAux=new ArrayList<TallaVestido>();
							tallavestidosAux.addAll(tallavestidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tallavestidoLogic.getTallaVestidosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTallaVestidos("FK_IdEmpleado",tallavestidoLogic.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTallaVestidos("FK_IdEmpleado",tallavestidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidoLogic.setTallaVestidos(new ArrayList<TallaVestido>());
						tallavestidoLogic.getTallaVestidos().addAll(tallavestidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidos=new ArrayList<TallaVestido>();
							tallavestidos.addAll(tallavestidosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tallavestidoLogic.getTallaVestidosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tallavestidoLogic.getTallaVestidos()==null||tallavestidoLogic.getTallaVestidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tallavestidos==null|| tallavestidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidosAux=new ArrayList<TallaVestido>();
						tallavestidosAux.addAll(tallavestidoLogic.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidosAux=new ArrayList<TallaVestido>();
							tallavestidosAux.addAll(tallavestidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tallavestidoLogic.getTallaVestidosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTallaVestidos("FK_IdEmpresa",tallavestidoLogic.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTallaVestidos("FK_IdEmpresa",tallavestidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidoLogic.setTallaVestidos(new ArrayList<TallaVestido>());
						tallavestidoLogic.getTallaVestidos().addAll(tallavestidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidos=new ArrayList<TallaVestido>();
							tallavestidos.addAll(tallavestidosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdVestimenta")) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdVestimenta(id_vestimentaFK_IdVestimenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tallavestidoLogic.getTallaVestidosFK_IdVestimenta(finalQueryGlobal,pagination,id_vestimentaFK_IdVestimenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdVestimenta(id_vestimentaFK_IdVestimenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdVestimenta(id_vestimentaFK_IdVestimenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tallavestidoLogic.getTallaVestidos()==null||tallavestidoLogic.getTallaVestidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tallavestidos==null|| tallavestidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidosAux=new ArrayList<TallaVestido>();
						tallavestidosAux.addAll(tallavestidoLogic.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidosAux=new ArrayList<TallaVestido>();
							tallavestidosAux.addAll(tallavestidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tallavestidoLogic.getTallaVestidosFK_IdVestimenta(finalQueryGlobal,pagination,id_vestimentaFK_IdVestimenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdVestimenta(id_vestimentaFK_IdVestimenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaVestidoConstantesFunciones.getDetalleIndiceFK_IdVestimenta(id_vestimentaFK_IdVestimenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTallaVestidos("FK_IdVestimenta",tallavestidoLogic.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTallaVestidos("FK_IdVestimenta",tallavestidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidoLogic.setTallaVestidos(new ArrayList<TallaVestido>());
						tallavestidoLogic.getTallaVestidos().addAll(tallavestidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidos=new ArrayList<TallaVestido>();
							tallavestidos.addAll(tallavestidosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTallaVestido();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTallaVestido();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tallavestidoLogic.getTallaVestidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tallavestidos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tallavestidoLogic.getTallaVestidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tallavestidos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TallaVestido tallavestido) {
		Boolean permite=true;
		
		if(this.tallavestido.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TallaVestidoConstantesFunciones.getOrderByListaTallaVestido();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TallaVestidoConstantesFunciones.getOrderByListaTallaVestido();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaVestido tallavestido:tallavestidoLogic.getTallaVestidos()) {
				if(tallavestido.getsType().equals(Constantes2.S_TOTALES)) {
					tallavestidoTotales=tallavestido;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaVestido tallavestido:this.tallavestidos) {
				if(tallavestido.getsType().equals(Constantes2.S_TOTALES)) {
					tallavestidoTotales=tallavestido;
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
			this.tallavestidoAux=new TallaVestido();
			this.tallavestidoAux.setsType(Constantes2.S_TOTALES);
			this.tallavestidoAux.setIsNew(false);
			this.tallavestidoAux.setIsChanged(false);
			this.tallavestidoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TallaVestidoConstantesFunciones.TotalizarValoresFilaTallaVestido(this.tallavestidoLogic.getTallaVestidos(),this.tallavestidoAux);
				
				this.tallavestidoLogic.getTallaVestidos().add(this.tallavestidoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TallaVestidoConstantesFunciones.TotalizarValoresFilaTallaVestido(this.tallavestidos,this.tallavestidoAux);
				
				this.tallavestidos.add(this.tallavestidoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tallavestidoTotales=new TallaVestido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tallavestidoLogic.getTallaVestidos().remove(tallavestidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tallavestidos.remove(tallavestidoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tallavestidoTotales=new TallaVestido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaVestido tallavestido:tallavestidoLogic.getTallaVestidos()) {
				if(tallavestido.getsType().equals(Constantes2.S_TOTALES)) {
					tallavestidoTotales=tallavestido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TallaVestidoConstantesFunciones.TotalizarValoresFilaTallaVestido(this.tallavestidoLogic.getTallaVestidos(),tallavestidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaVestido tallavestido:this.tallavestidos) {
				if(tallavestido.getsType().equals(Constantes2.S_TOTALES)) {
					tallavestidoTotales=tallavestido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TallaVestidoConstantesFunciones.TotalizarValoresFilaTallaVestido(this.tallavestidos,tallavestidoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTallaVestidosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTallaVestidosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTallaVestidosFK_IdVestimenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdVestimenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTallaVestidosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallavestidoLogic.getTallaVestidosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTallaVestidosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallavestidoLogic.getTallaVestidosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTallaVestidosFK_IdVestimenta(String sFinalQuery,Long id_vestimenta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallavestidoLogic.getTallaVestidosFK_IdVestimenta(sFinalQuery,this.pagination,id_vestimenta);
				
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
	
	public void inicializarPermisosTallaVestido() {
		this.isPermisoTodoTallaVestido=false;
		this.isPermisoNuevoTallaVestido=false;
		this.isPermisoActualizarTallaVestido=false;
		this.isPermisoActualizarOriginalTallaVestido=false;
		this.isPermisoEliminarTallaVestido=false;
		this.isPermisoGuardarCambiosTallaVestido=false;
		this.isPermisoConsultaTallaVestido=false;
		this.isPermisoBusquedaTallaVestido=false;
		this.isPermisoReporteTallaVestido=false;		
		this.isPermisoOrdenTallaVestido=false;		
		this.isPermisoPaginacionMedioTallaVestido=false;		
		this.isPermisoPaginacionAltoTallaVestido=false;
		this.isPermisoPaginacionTodoTallaVestido=false;
		this.isPermisoCopiarTallaVestido=false;		
		this.isPermisoVerFormTallaVestido=false;		
		this.isPermisoDuplicarTallaVestido=false;		
		this.isPermisoOrdenTallaVestido=false;		
	}
	
	public void setPermisosUsuarioTallaVestido(Boolean isPermiso) {
		this.isPermisoTodoTallaVestido=isPermiso;
		this.isPermisoNuevoTallaVestido=isPermiso;
		this.isPermisoActualizarTallaVestido=isPermiso;
		this.isPermisoActualizarOriginalTallaVestido=isPermiso;
		this.isPermisoEliminarTallaVestido=isPermiso;
		this.isPermisoGuardarCambiosTallaVestido=isPermiso;
		this.isPermisoConsultaTallaVestido=isPermiso;
		this.isPermisoBusquedaTallaVestido=isPermiso;
		this.isPermisoReporteTallaVestido=isPermiso;
		this.isPermisoOrdenTallaVestido=isPermiso;		
		this.isPermisoPaginacionMedioTallaVestido=isPermiso;		
		this.isPermisoPaginacionAltoTallaVestido=isPermiso;		
		this.isPermisoPaginacionTodoTallaVestido=isPermiso;		
		this.isPermisoCopiarTallaVestido=isPermiso;		
		this.isPermisoVerFormTallaVestido=isPermiso;		
		this.isPermisoDuplicarTallaVestido=isPermiso;
		this.isPermisoOrdenTallaVestido=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTallaVestido(Boolean isPermiso) {
		//this.isPermisoTodoTallaVestido=isPermiso;
		this.isPermisoNuevoTallaVestido=isPermiso;
		this.isPermisoActualizarTallaVestido=isPermiso;
		this.isPermisoActualizarOriginalTallaVestido=isPermiso;
		this.isPermisoEliminarTallaVestido=isPermiso;
		this.isPermisoGuardarCambiosTallaVestido=isPermiso;
		//this.isPermisoConsultaTallaVestido=isPermiso;
		//this.isPermisoBusquedaTallaVestido=isPermiso;
		//this.isPermisoReporteTallaVestido=isPermiso;
		//this.isPermisoOrdenTallaVestido=isPermiso;		
		//this.isPermisoPaginacionMedioTallaVestido=isPermiso;		
		//this.isPermisoPaginacionAltoTallaVestido=isPermiso;		
		//this.isPermisoPaginacionTodoTallaVestido=isPermiso;		
		//this.isPermisoCopiarTallaVestido=isPermiso;		
		//this.isPermisoDuplicarTallaVestido=isPermiso;
		//this.isPermisoOrdenTallaVestido=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTallaVestidoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TallaVestidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTallaVestido(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTallaVestidoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTallaVestidoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTallaVestidoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTallaVestidoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTallaVestido() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TallaVestidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TallaVestidoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTallaVestido=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTallaVestido=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTallaVestido=this.isPermisoActualizarTallaVestido;
			this.isPermisoEliminarTallaVestido=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTallaVestido=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTallaVestido=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTallaVestido=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTallaVestido=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTallaVestido=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTallaVestido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTallaVestido=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTallaVestido=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTallaVestido=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTallaVestido=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTallaVestido=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTallaVestido=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTallaVestido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTallaVestido.setToolTipText(this.jTableDatosTallaVestido.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTallaVestido(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTallaVestido(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TallaVestidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TallaVestidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTallaVestido() throws Exception {
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
	public void inicializarCombosForeignKeyTallaVestidoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.vestimentasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTallaVestidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TallaVestidoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTallaVestidoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVestimentaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyVestimentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vestimentasForeignKey==null||this.vestimentasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VestimentaConstantesFunciones.getArrayColumnasGlobalesVestimenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VestimentaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VestimentaConstantesFunciones.SFINALQUERY;

				this.cargarCombosVestimentasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTallaVestidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TallaVestidoParameterReturnGeneral tallavestidoReturnGeneral=new TallaVestidoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tallavestidoConstantesFunciones.cargarid_empresaTallaVestido)
					 || (this.esRecargarFks && this.tallavestidoConstantesFunciones.cargarid_empresaTallaVestido)) {

					if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tallavestidoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.tallavestidoConstantesFunciones.cargarid_empleadoTallaVestido)
					 || (this.esRecargarFks && this.tallavestidoConstantesFunciones.cargarid_empleadoTallaVestido)) {

					if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+tallavestidoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalVestimenta="";

				if(((this.vestimentasForeignKey==null||this.vestimentasForeignKey.size()<=0) && this.tallavestidoConstantesFunciones.cargarid_vestimentaTallaVestido)
					 || (this.esRecargarFks && this.tallavestidoConstantesFunciones.cargarid_vestimentaTallaVestido)) {

					if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionVestimenta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VestimentaConstantesFunciones.getArrayColumnasGlobalesVestimenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVestimenta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VestimentaConstantesFunciones.TABLENAME);

						finalQueryGlobalVestimenta=Funciones.GetFinalQueryAppend(finalQueryGlobalVestimenta, "");
						finalQueryGlobalVestimenta+=VestimentaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVestimentasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVestimenta=" WHERE " + ConstantesSql.ID + "="+tallavestidoSessionBean.getlidVestimentaActual();
					}
				} else {
					finalQueryGlobalVestimenta="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tallavestidoReturnGeneral=tallavestidoLogic.cargarCombosLoteForeignKeyTallaVestido(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalVestimenta);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tallavestidoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=tallavestidoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalVestimenta.equals("NONE")) {
				this.vestimentasForeignKey=tallavestidoReturnGeneral.getvestimentasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTallaVestido()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyVestimenta();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tallavestidoSessionBean==null) {
				this.tallavestidoSessionBean=new TallaVestidoSessionBean();
			}

			if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyVestimenta()throws Exception {
		try {

			if(!this.tallavestidoSessionBean.getisBusquedaDesdeForeignKeySesionVestimenta()) {
				Vestimenta vestimenta=new Vestimenta();
				VestimentaConstantesFunciones.setVestimentaDescripcion(vestimenta,Constantes.SMENSAJE_ESCOJA_OPCION);
				vestimenta.setId(null);

				if(!VestimentaConstantesFunciones.ExisteEnLista(this.vestimentasForeignKey,vestimenta,true)) {

					this.vestimentasForeignKey.add(0,vestimenta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTallaVestido()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTallaVestido(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTallaVestido()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTallaVestido();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTallaVestido(TallaVestido tallavestido)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(tallavestido.getid_empleado(),false,"Formulario");
			this.setActualVestimentaForeignKey(tallavestido.getid_vestimenta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTallaVestido(TallaVestido tallavestido,String sTipoEvento)throws Exception {	
		try {
			
			

				if(tallavestido.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoTallaVestido")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(tallavestido.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTallaVestido()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.tallavestidoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualVestimentaForeignKey(this.tallavestidoConstantesFunciones.getid_vestimenta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTallaVestido()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTallaVestido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTallaVestido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTallaVestido()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTallaVestido()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameVestimentasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTallaVestido(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVestimentasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTallaVestido()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.getItemCount()>0) {
				this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.getItemCount()>0) {
				this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.getItemCount()>0) {
				this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TallaVestidoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TallaVestidoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TallaVestidoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tallavestidoSessionBean=new TallaVestidoSessionBean(); 
		this.tallavestidoConstantesFunciones=new TallaVestidoConstantesFunciones(); 
		this.tallavestidoBean=new TallaVestido();//(this.tallavestidoConstantesFunciones); 		
		this.tallavestidoReturnGeneral=new TallaVestidoParameterReturnGeneral(); 
		
		this.tallavestidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tallavestidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TallaVestidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TallaVestidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TallaVestidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTallaVestido(true);
			
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
			
			this.tallavestidoConstantesFunciones=new TallaVestidoConstantesFunciones(); 
			this.tallavestidoBean=new TallaVestido();//this.tallavestidoConstantesFunciones); 			
			this.tallavestidoReturnGeneral=new TallaVestidoParameterReturnGeneral(); 
		
			TallaVestidoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Talla Vestido Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tallavestido=new TallaVestido();
			this.tallavestidos = new ArrayList<TallaVestido>();
			this.tallavestidosAux = new ArrayList<TallaVestido>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic=new TallaVestidoLogic();
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}
			
			//this.tallavestidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tallavestidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTallaVestido);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTallaVestido);	
					}
					
					if(this.jInternalFrameImportacionTallaVestido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTallaVestido);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTallaVestido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTallaVestido);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTallaVestido!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTallaVestido);
				this.jInternalFrameDetalleFormTallaVestido.setVisible(false);
				this.jInternalFrameDetalleFormTallaVestido.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTallaVestido);
					this.jInternalFrameReporteDinamicoTallaVestido.setVisible(false);
					this.jInternalFrameReporteDinamicoTallaVestido.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTallaVestido!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTallaVestido);
					this.jInternalFrameImportacionTallaVestido.setVisible(false);
					this.jInternalFrameImportacionTallaVestido.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTallaVestido!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTallaVestido);
					this.jInternalFrameOrderByTallaVestido.setVisible(false);
					this.jInternalFrameOrderByTallaVestido.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTallaVestidoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TallaVestidoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tallavestidoReturnGeneral=new TallaVestidoParameterReturnGeneral();
			
			this.tallavestidoParameterGeneral=new TallaVestidoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tallavestidoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TallaVestidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TallaVestidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tallavestidoSessionBean.getEsGuardarRelacionado(),this.tallavestidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TallaVestidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tallavestidoSessionBean.getEsGuardarRelacionado(),this.tallavestidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTallaVestido=false;
			this.isVisibilidadCeldaDuplicarTallaVestido=true;
			this.isVisibilidadCeldaCopiarTallaVestido=true;
			this.isVisibilidadCeldaVerFormTallaVestido=true;
			this.isVisibilidadCeldaOrdenTallaVestido=true;
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
			this.isVisibilidadCeldaModificarTallaVestido=false;
			this.isVisibilidadCeldaActualizarTallaVestido=false;
			this.isVisibilidadCeldaEliminarTallaVestido=false;
			this.isVisibilidadCeldaCancelarTallaVestido=false;
			this.isVisibilidadCeldaGuardarTallaVestido=false;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdVestimenta=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTallaVestido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTallaVestido();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTallaVestido(false);
			
			this.setPermisosUsuarioTallaVestido();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tallavestidoSessionBean.getEsGuardarRelacionado() 
				|| (this.tallavestidoSessionBean.getEsGuardarRelacionado() && this.tallavestidoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTallaVestidoClasesRelacionadas();
			}
			
			if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTallaVestidoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTallaVestido();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTallaVestido();
			}
			
			if(!this.isPermisoBusquedaTallaVestido) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTallaVestido.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTallaVestido,this.isPermisoPaginacionMedioTallaVestido,this.isPermisoPaginacionTodoTallaVestido);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TallaVestidoConstantesFunciones.getTiposSeleccionarTallaVestido());
				
				this.tiposColumnasSelect=TallaVestidoConstantesFunciones.getTiposSeleccionarTallaVestido(true);
				
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
			//if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTallaVestido();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTallaVestido(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTallaVestido(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTallaVestido() ;
			
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
			this.vestimentaLogic=new VestimentaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tallavestidoImplementable= (TallaVestidoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TallaVestidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tallavestidoImplementableHome= (TallaVestidoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TallaVestidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tallavestidos= new ArrayList<TallaVestido>();
			this.tallavestidosEliminados= new ArrayList<TallaVestido>();
						
			this.isEsNuevoTallaVestido=false;
			this.esParaAccionDesdeFormularioTallaVestido=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.vestimentasForeignKey=new ArrayList<Vestimenta>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTallaVestido(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTallaVestido();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TallaVestidoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TallaVestidoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTallaVestido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTallaVestido(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTallaVestido!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTallaVestido();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTallaVestido();
			}
			
			TallaVestidoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTallaVestido.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTallaVestido.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTallaVestido.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTallaVestido(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TallaVestido: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTallaVestido() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTallaVestido")) {
				iIndex=this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTallaVestido();	
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
	
	public void cargarCombosForeignKeyTallaVestido(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTallaVestido(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTallaVestido(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTallaVestidoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTallaVestido();
		
		this.cargarCombosFrameForeignKeyTallaVestido();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTallaVestido();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTallaVestido();
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

	public void cargarCombosForeignKeyVestimenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVestimentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVestimenta();
				this.cargarCombosFrameVestimentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVestimenta(this.vestimentasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTallaVestidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
			
			if(jTableDatosTallaVestido.getRowCount()>=1) {
				jTableDatosTallaVestido.removeRowSelectionInterval(0, jTableDatosTallaVestido.getRowCount()-1);						
			}
			
			this.isEsNuevoTallaVestido=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTallaVestido(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTallaVestido(true);			
			//this.tallavestido=new TallaVestido();
			//this.tallavestido.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTallaVestido(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTallaVestido() ;
			
			if(TallaVestidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTallaVestido(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tallavestido);	
			this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);				
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
			if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TallaVestido: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTallaVestidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTallaVestido.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTallaVestido.getSelectedRows().length;			
			}
			
			tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTallaVestido--;			
				//TallaVestido tallavestidoAux= new TallaVestido();			
				//tallavestidoAux.setId(this.iIdNuevoTallaVestido);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TallaVestido tallavestidoOrigen=new TallaVestido();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TallaVestido tallavestidoOrigen : tallavestidosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tallavestidoOrigen =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallavestidoOrigen =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTallaVestido();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tallavestido.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTallaVestido(tallavestidoOrigen,this.tallavestido,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tallavestidoLogic.getTallaVestidos().add(this.tallavestidoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tallavestidos.add(this.tallavestidoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTallaVestido(false);
				
				this.jTableDatosTallaVestido.setRowSelectionInterval(this.getIndiceNuevoTallaVestido(), this.getIndiceNuevoTallaVestido());
				
				int iLastRow =  this.jTableDatosTallaVestido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTallaVestido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTallaVestido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTallaVestido(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();									
		
			TallaVestido tallavestidoOrigen=new TallaVestido();
			TallaVestido tallavestidoDestino=new TallaVestido();
				
			tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTallaVestido.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tallavestidosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTallaVestido.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidoOrigen =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tallavestidoOrigen =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallavestidoDestino =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tallavestidoDestino =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tallavestidoOrigen =tallavestidosSeleccionados.get(0);
				tallavestidoDestino =tallavestidosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTallaVestido(tallavestidoOrigen,tallavestidoDestino,true,false);
				
				tallavestidoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tallavestidoDestino,tallavestidoLogic.getTallaVestidos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tallavestidoDestino,tallavestidos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTallaVestido(false);
				
				//this.jTableDatosTallaVestido.setRowSelectionInterval(this.getIndiceNuevoTallaVestido(), this.getIndiceNuevoTallaVestido());
				
				int iLastRow =  this.jTableDatosTallaVestido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTallaVestido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTallaVestido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTallaVestido(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTallaVestido.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTallaVestido.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTallaVestido.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTallaVestido.setVisible(!isVisible);
			this.jPanelPaginacionTallaVestido.setVisible(!isVisible);
			this.jPanelAccionesTallaVestido.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTallaVestido();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTallaVestido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTallaVestido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTallaVestido();
			
			this.abrirFrameOrderByTallaVestido();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTallaVestido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTallaVestido(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTallaVestido);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTallaVestido.isMaximum()) {
					this.jInternalFrameDetalleFormTallaVestido.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTallaVestido.setSize(this.jInternalFrameDetalleFormTallaVestido.iWidthFormulario,this.jInternalFrameDetalleFormTallaVestido.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTallaVestido.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTallaVestido.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTallaVestido.isMaximum()) {
						this.jInternalFrameDetalleFormTallaVestido.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTallaVestido.jContentPaneDetalleTallaVestido.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTallaVestido.jContentPaneDetalleTallaVestido.getWidth(),TallaVestidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTallaVestido.jContentPaneDetalleTallaVestido.getWidth(),TallaVestidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTallaVestido.jContentPaneDetalleTallaVestido.getWidth(),TallaVestidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTallaVestido.setVisible(true);
	        this.jInternalFrameDetalleFormTallaVestido.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTallaVestido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTallaVestido==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTallaVestido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTallaVestido,false,this);
				} else {
					this.jInternalFrameOrderByTallaVestido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTallaVestido,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTallaVestido);
				this.jInternalFrameOrderByTallaVestido.setVisible(false);
				this.jInternalFrameOrderByTallaVestido.setSelected(false);
				
				this.jInternalFrameOrderByTallaVestido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTallaVestido"));
				
				this.inicializarActualizarBindingTablaOrderByTallaVestido();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTallaVestido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTallaVestido==null) {
				
				this.jInternalFrameImportacionTallaVestido=new ImportacionJInternalFrame(TallaVestidoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTallaVestido);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTallaVestido);
				this.jInternalFrameImportacionTallaVestido.setVisible(false);
				this.jInternalFrameImportacionTallaVestido.setSelected(false);


				this.jInternalFrameImportacionTallaVestido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTallaVestido"));
				this.jInternalFrameImportacionTallaVestido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTallaVestido"));
				this.jInternalFrameImportacionTallaVestido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTallaVestido"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTallaVestido() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTallaVestido==null) {
				this.jInternalFrameReporteDinamicoTallaVestido=new ReporteDinamicoJInternalFrame(TallaVestidoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTallaVestido);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTallaVestido);
				this.jInternalFrameReporteDinamicoTallaVestido.setVisible(false);
				this.jInternalFrameReporteDinamicoTallaVestido.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTallaVestido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTallaVestido"));
				this.jInternalFrameReporteDinamicoTallaVestido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTallaVestido"));
				this.jInternalFrameReporteDinamicoTallaVestido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTallaVestido"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTallaVestido();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTallaVestido() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTallaVestido);
			
	       	this.jInternalFrameDetalleFormTallaVestido.setVisible(false);
	        this.jInternalFrameDetalleFormTallaVestido.setSelected(false);
			
			//this.jInternalFrameDetalleFormTallaVestido.dispose();
			//this.jInternalFrameDetalleFormTallaVestido=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTallaVestido() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTallaVestido.setVisible(true);
	        this.jInternalFrameReporteDinamicoTallaVestido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTallaVestido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTallaVestido.setVisible(true);
	        this.jInternalFrameImportacionTallaVestido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTallaVestido() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTallaVestido.setVisible(true);
	        this.jInternalFrameOrderByTallaVestido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTallaVestido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTallaVestido.setVisible(false);
	        this.jInternalFrameOrderByTallaVestido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTallaVestido() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTallaVestido.setVisible(false);
	        this.jInternalFrameReporteDinamicoTallaVestido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTallaVestido() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTallaVestido.setVisible(false);
	        this.jInternalFrameImportacionTallaVestido.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTallaVestido(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTallaVestido(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTallaVestido(true);
			//this.isEsNuevoTallaVestido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTallaVestido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTallaVestido(false) ;
			
			if(tallavestidoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TallaVestidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTallaVestido(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTallaVestido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTallaVestidoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTallaVestido(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTallaVestido(true);
			//this.isEsNuevoTallaVestido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tallavestido.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTallaVestido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTallaVestido(false) ;
			
			if(TallaVestidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTallaVestido(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTallaVestido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.tallavestidoConstantesFunciones.cargarid_empleadoTallaVestido) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTallaVestido(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTallaVestido.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaVestimenta(List<Vestimenta> vestimentasForeignKey)throws Exception{
		TableColumn tableColumnVestimenta=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA));
		TableCellEditor tableCellEditorVestimenta =tableColumnVestimenta.getCellEditor();

		VestimentaTableCell vestimentaTableCellFk=(VestimentaTableCell)tableCellEditorVestimenta;

		if(vestimentaTableCellFk!=null) {
			vestimentaTableCellFk.setvestimentasForeignKey(vestimentasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTallaVestido.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vestimentaTableCellFk.setRowActual(intSelectedRow);
			//vestimentaTableCellFk.setvestimentasForeignKeyActual(vestimentasForeignKey);
		//}


		if(vestimentaTableCellFk!=null) {
			vestimentaTableCellFk.RecargarVestimentasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTallaVestido(false);
			
			//if(!this.isEsNuevoTallaVestido) {								
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				
			}
			
			if(this.permiteMantenimiento(this.tallavestido)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTallaVestido=true;
					this.inicializarActualizarBindingTablaTallaVestido(false);
					this.isEsNuevoTallaVestido=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTallaVestido=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTallaVestido=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTallaVestido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTallaVestido(false);
				
				this.habilitarDeshabilitarControlesTallaVestido(false);
			
												
				
				if(TallaVestidoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTallaVestido();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTallaVestidoActionPerformed(evt,tallavestidoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTallaVestido(this.tallavestido,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTallaVestido.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tallavestidoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tallavestido.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTallaVestidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				this.tallavestido.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				this.tallavestido.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tallavestido)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TallaVestidoModel) this.jTableDatosTallaVestido.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTallaVestido=true;
				this.inicializarActualizarBindingTablaTallaVestido(false);
				this.isEsNuevoTallaVestido=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTallaVestido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTallaVestido(false);
				
				this.habilitarDeshabilitarControlesTallaVestido(false);
				
				
				
				if(TallaVestidoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTallaVestido();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTallaVestidoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTallaVestido.getRowCount()>=1) {
				jTableDatosTallaVestido.removeRowSelectionInterval(0, jTableDatosTallaVestido.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTallaVestido(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTallaVestido(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTallaVestido(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTallaVestido(false) ;
			
			this.isEsNuevoTallaVestido=false;
			
			if(TallaVestidoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTallaVestido();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTallaVestidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTallaVestido(false);
				
				//SI ES MANUAL
				if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTallaVestido();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTallaVestidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTallaVestido--;			
			//TallaVestido tallavestidoAux= new TallaVestido();			
			//tallavestidoAux.setId(this.iIdNuevoTallaVestido);
			
			if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTallaVestido();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
			
			this.tallavestido.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tallavestidoLogic.getTallaVestidos().add(this.tallavestidoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tallavestidos.add(this.tallavestidoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTallaVestido(false);
			
			this.jTableDatosTallaVestido.setRowSelectionInterval(this.getIndiceNuevoTallaVestido(), this.getIndiceNuevoTallaVestido());
			
			int iLastRow =  this.jTableDatosTallaVestido.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTallaVestido.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTallaVestido.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTallaVestido(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTallaVestidoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTallaVestido(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTallaVestido(false);
			
			//SI ES MANUAL
			if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTallaVestido();
			}
			
			//this.abrirFrameTreeTallaVestido();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTallaVestidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Talla VestidoS ?", "MANTENIMIENTO DE Talla Vestido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTallaVestido.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTallaVestido();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tallavestidoReturnGeneral=tallavestidoLogic.procesarImportacionTallaVestidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tallavestidoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTallaVestidoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTallaVestidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTallaVestido.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTallaVestido.setFileImportacion(this.jInternalFrameImportacionTallaVestido.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTallaVestido.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTallaVestido.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTallaVestido.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTallaVestido.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTallaVestidoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		

		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TallaVestidoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TallaVestidoBaseDesign.jrxml";
			
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
			
			this.generarReporteTallaVestidos("Todos",tallavestidosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TallaVestidoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vestimenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vestimenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vestimenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vestimenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TallaVestidoConstantesFunciones.LABEL_TALLA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lla_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lla_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lla_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lla_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TallaVestidoConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TallaVestidoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTallaVestido.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TallaVestidoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA:
					sNombreCampoCategoria="id_vestimenta";
					break;

				case TallaVestidoConstantesFunciones.LABEL_TALLA:
					sNombreCampoCategoria="talla";
					break;

				case TallaVestidoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case TallaVestidoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TallaVestidoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA:
					sNombreCampoCategoriaValor="id_vestimenta";
					break;

				case TallaVestidoConstantesFunciones.LABEL_TALLA:
					sNombreCampoCategoriaValor="talla";
					break;

				case TallaVestidoConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case TallaVestidoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TallaVestidoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vestimenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vestimenta");
					break;

				case TallaVestidoConstantesFunciones.LABEL_TALLA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Talla",sNombreCampoCategoria,sNombreCampoCategoriaValor,"talla");
					break;

				case TallaVestidoConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case TallaVestidoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTallaVestidoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallavestido";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TallaVestidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TallaVestidoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TallaVestido tallavestido:tallavestidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallavestido.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(TallaVestido tallavestido:tallavestidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallavestido.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA);
					iRow++;

					for(TallaVestido tallavestido:tallavestidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallavestido.getvestimenta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TallaVestidoConstantesFunciones.LABEL_TALLA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_TALLA);
					iRow++;

					for(TallaVestido tallavestido:tallavestidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallavestido.gettalla());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TallaVestidoConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(TallaVestido tallavestido:tallavestidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallavestido.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TallaVestidoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TallaVestido tallavestido:tallavestidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallavestido.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTallaVestido(row);				
			//	iRow++;
			//}				
			
			//for(TallaVestido tallavestidoAux:tallavestidosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTallaVestido(tallavestidoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
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
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTallaVestido(false);
			
			//SI ES MANUAL
			if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTallaVestido();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTallaVestidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTallaVestido(false);
			
			//SI ES MANUAL
			if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTallaVestido();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTallaVestidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTallaVestido(false);
			
			//SI ES MANUAL
			if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTallaVestido();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTallaVestido() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTallaVestido.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTallaVestido.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTallaVestido.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTallaVestido.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTallaVestido.setMinimumSize(dimensionMinimum);
		this.jTableDatosTallaVestido.setMaximumSize(dimensionMaximum);
		this.jTableDatosTallaVestido.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTallaVestido(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTallaVestido(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTallaVestido(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTallaVestido(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTallaVestido(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTallaVestido(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTallaVestido(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTallaVestido(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTallaVestido() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTallaVestido();
		
		this.inicializarActualizarBindingBotonesManualTallaVestido(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTallaVestido();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTallaVestido() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTallaVestido(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTallaVestido(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTallaVestido.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTallaVestido.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTallaVestido.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTallaVestido!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTallaVestido.jCheckBoxPostAccionNuevoTallaVestido.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTallaVestido.jCheckBoxPostAccionSinCerrarTallaVestido.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTallaVestido.jCheckBoxPostAccionSinMensajeTallaVestido.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTallaVestido.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTallaVestido.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTallaVestido.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTallaVestido!=null) {
				this.jInternalFrameDetalleFormTallaVestido.jCheckBoxPostAccionNuevoTallaVestido.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTallaVestido.jCheckBoxPostAccionSinCerrarTallaVestido.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTallaVestido.jCheckBoxPostAccionSinMensajeTallaVestido.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTallaVestido.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTallaVestido.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTallaVestido.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTallaVestido.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTallaVestido.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTallaVestido.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTallaVestido.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTallaVestido.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTallaVestido.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTallaVestido(Boolean esInicializar) throws Exception {
		try	{	
			if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTallaVestido(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTallaVestido() throws Exception {
		try	{
			if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTallaVestido();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTallaVestido() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTallaVestido() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTallaVestido.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTallaVestido.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTallaVestido.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTallaVestido.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTallaVestido.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTallaVestido.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTallaVestido.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTallaVestido.addItem(reporte);
			}
			
			
			if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTallaVestido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTallaVestido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTallaVestido.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTallaVestido.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTallaVestido.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTallaVestido.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTallaVestido.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTallaVestido.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTallaVestido.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTallaVestido();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTallaVestido() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
				this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
				this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
				
				if(this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTallaVestido.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTallaVestido.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTallaVestido.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TallaVestidoConstantesFunciones.getTiposSeleccionarTallaVestido(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TallaVestidoConstantesFunciones.getTiposSeleccionarTallaVestido(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TallaVestidoConstantesFunciones.getTiposSeleccionarTallaVestido(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTallaVestido.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTallaVestido.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTallaVestido()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoTallaVestido.getSelectedItem()).getId();}
		if(this.jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.getSelectedItem()!=null){this.id_vestimentaFK_IdVestimenta=((Vestimenta)this.jComboBoxid_vestimentaFK_IdVestimentaTallaVestido.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTallaVestido(Boolean esInicializar) throws Exception {				
		if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTallaVestido();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTallaVestido() throws Exception {
		this.inicializarActualizarBindingTablaTallaVestido(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTallaVestido() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTallaVestidoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestidoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTallaVestido(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tallavestidoLogic.getTallaVestidos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tallavestidos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTallaVestido.setModel(new TallaVestidoModel(this.tallavestidoLogic.getTallaVestidos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTallaVestido.setModel(new TallaVestidoModel(this.tallavestidos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTallaVestido!=null && this.jInternalFrameOrderByTallaVestido.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTallaVestido();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO,tallavestidoConstantesFunciones.resaltarSeleccionarTallaVestido,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO,tallavestidoConstantesFunciones.resaltarSeleccionarTallaVestido,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_ID));

		if(this.tallavestidoConstantesFunciones.mostraridTallaVestido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaVestidoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tallavestidoConstantesFunciones.resaltaridTallaVestido,this.tallavestidoConstantesFunciones.activaridTallaVestido,iSizeTabla,this,true,"idTallaVestido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tallavestidoConstantesFunciones.resaltaridTallaVestido,this.tallavestidoConstantesFunciones.activaridTallaVestido,this,true,"idTallaVestido","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tallavestidoConstantesFunciones.mostrarid_empresaTallaVestido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaVestidoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tallavestidoConstantesFunciones.resaltarid_empresaTallaVestido,this,this.tallavestidoConstantesFunciones.activarid_empresaTallaVestido,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tallavestidoConstantesFunciones.resaltarid_empresaTallaVestido,this,this.tallavestidoConstantesFunciones.activarid_empresaTallaVestido,false,"id_empresaTallaVestido","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.tallavestidoConstantesFunciones.mostrarid_empleadoTallaVestido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.tallavestidoConstantesFunciones.resaltarid_empleadoTallaVestido,this,this.tallavestidoConstantesFunciones.activarid_empleadoTallaVestido,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.tallavestidoConstantesFunciones.resaltarid_empleadoTallaVestido,this,this.tallavestidoConstantesFunciones.activarid_empleadoTallaVestido,true,"id_empleadoTallaVestido","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA));

		if(this.tallavestidoConstantesFunciones.mostrarid_vestimentaTallaVestido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VestimentaTableCell(this.vestimentasForeignKey,this.tallavestidoConstantesFunciones.resaltarid_vestimentaTallaVestido,this,this.tallavestidoConstantesFunciones.activarid_vestimentaTallaVestido,iSizeTabla));
			tableColumn.setCellEditor(new VestimentaTableCell(this.vestimentasForeignKey,this.tallavestidoConstantesFunciones.resaltarid_vestimentaTallaVestido,this,this.tallavestidoConstantesFunciones.activarid_vestimentaTallaVestido,true,"id_vestimentaTallaVestido","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_TALLA));

		if(this.tallavestidoConstantesFunciones.mostrartallaTallaVestido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaVestidoConstantesFunciones.LABEL_TALLA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tallavestidoConstantesFunciones.resaltartallaTallaVestido,this.tallavestidoConstantesFunciones.activartallaTallaVestido,iSizeTabla,this,true,"tallaTallaVestido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tallavestidoConstantesFunciones.resaltartallaTallaVestido,this.tallavestidoConstantesFunciones.activartallaTallaVestido,this,true,"tallaTallaVestido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_CANTIDAD));

		if(this.tallavestidoConstantesFunciones.mostrarcantidadTallaVestido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaVestidoConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tallavestidoConstantesFunciones.resaltarcantidadTallaVestido,this.tallavestidoConstantesFunciones.activarcantidadTallaVestido,iSizeTabla,this,true,"cantidadTallaVestido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tallavestidoConstantesFunciones.resaltarcantidadTallaVestido,this.tallavestidoConstantesFunciones.activarcantidadTallaVestido,this,true,"cantidadTallaVestido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,TallaVestidoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tallavestidoConstantesFunciones.mostrardescripcionTallaVestido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaVestidoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tallavestidoConstantesFunciones.resaltardescripcionTallaVestido,this.tallavestidoConstantesFunciones.activardescripcionTallaVestido,iSizeTabla,this,true,"descripcionTallaVestido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tallavestidoConstantesFunciones.resaltardescripcionTallaVestido,this.tallavestidoConstantesFunciones.activardescripcionTallaVestido,this,true,"descripcionTallaVestido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TallaVestidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tallavestidoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tallavestidoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTallaVestido.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tallavestidoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tallavestidoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTallaVestido.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTallaVestido && this.isPermisoGuardarCambiosTallaVestido) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tallavestidoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tallavestidoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTallaVestido.addColumn(tableColumn);
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
			
			this.jTableDatosTallaVestido.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTallaVestido && this.isPermisoGuardarCambiosTallaVestido) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTallaVestido && this.isPermisoGuardarCambiosTallaVestido) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTallaVestido.moveColumn(this.jTableDatosTallaVestido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTallaVestido.moveColumn(this.jTableDatosTallaVestido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTallaVestido.moveColumn(this.jTableDatosTallaVestido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTallaVestido.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTallaVestido.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTallaVestido,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTallaVestido.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTallaVestido.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTallaVestido.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTallaVestido.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTallaVestido.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tallavestidoLogic.getTallaVestidos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tallavestidos.size()-1;
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
		//this.jTableDatosTallaVestido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTallaVestido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTallaVestido();
			
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
				
				//this.isEsNuevoTallaVestido=false;
					
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
				if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTallaVestido==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTallaVestido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTallaVestido.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tallavestido.getsType().equals("DUPLICADO")
				   || this.tallavestido.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTallaVestido=true;
				
				} else {
					this.isEsNuevoTallaVestido=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
					if(this.tallavestido.getId()>=0 && !this.tallavestido.getIsNew()) {						
						this.isEsNuevoTallaVestido=false;
						
					} else {
						this.isEsNuevoTallaVestido=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTallaVestido(esRelaciones);						
				
				this.seleccionarTallaVestido(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tallavestido.getId()<0) {
					this.isEsNuevoTallaVestido=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTallaVestido(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTallaVestido(evt,rowIndex);
				}	
				
				if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TallaVestido: " + this.dDif); 
					}
				}								
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTallaVestido(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tallavestido)) {
					if(this.tallavestido.getId()>0) {
						this.tallavestido.setIsDeleted(true);
						
						this.tallavestidosEliminados.add(this.tallavestido);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tallavestidoLogic.getTallaVestidos().remove(this.tallavestido);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tallavestidos.remove(this.tallavestido);				
					}
					
					
					((TallaVestidoModel) this.jTableDatosTallaVestido.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTallaVestido(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTallaVestido(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTallaVestido) {
			
			if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTallaVestido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTallaVestido.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTallaVestido(this.tallavestido);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tallavestidoConstantesFunciones.cargarid_empresaTallaVestido || this.tallavestidoConstantesFunciones.event_dependid_empresaTallaVestido) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tallavestido.getid_empresa());
									//this.inicializarActualizarBindingTallaVestido(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tallavestido.getEmpresa()!=null) {
							this.empresasForeignKey.add(tallavestido.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tallavestido.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.tallavestidoConstantesFunciones.cargarid_empleadoTallaVestido || this.tallavestidoConstantesFunciones.event_dependid_empleadoTallaVestido) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.tallavestido.getid_empleado());
									//this.inicializarActualizarBindingTallaVestido(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(tallavestido.getEmpleado()!=null) {
							this.empleadosForeignKey.add(tallavestido.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.tallavestido.getid_empleado(),false,"Formulario");

					//Vestimenta
					if(!this.tallavestidoConstantesFunciones.cargarid_vestimentaTallaVestido || this.tallavestidoConstantesFunciones.event_dependid_vestimentaTallaVestido) {
						//this.cargarCombosVestimentasForeignKeyLista(" where id="+this.tallavestido.getid_vestimenta());
									//this.inicializarActualizarBindingTallaVestido(false,false);
						this.vestimentasForeignKey=new ArrayList<Vestimenta>();

						if(tallavestido.getVestimenta()!=null) {
							this.vestimentasForeignKey.add(tallavestido.getVestimenta());
						}

						this.addItemDefectoCombosForeignKeyVestimenta();
						this.cargarCombosFrameVestimentasForeignKey("Todos");
					}
					this.setActualVestimentaForeignKey(this.tallavestido.getid_vestimenta(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTallaVestido("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTallaVestido(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTallaVestido() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTallaVestido(TallaVestido tallavestido) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTallaVestido(tallavestido,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTallaVestido(TallaVestido tallavestido,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTallaVestido(tallavestido);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTallaVestido(tallavestido,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTallaVestido(tallavestido);
	}
	
	public void setVariablesObjetoActualToFormularioTallaVestido(TallaVestido tallavestido) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.setText(tallavestido.getId().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextFieldtallaTallaVestido.setText(tallavestido.gettalla().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextFieldcantidadTallaVestido.setText(tallavestido.getcantidad().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextAreadescripcionTallaVestido.setText(tallavestido.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TallaVestido tallavestidoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tallavestidoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TallaVestido tallavestidoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tallavestidoLocal=this.tallavestido;
			} else {
				tallavestidoLocal=this.tallavestidoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tallavestidoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTallaVestido(tallavestidoLocal,true);
					
					if(tallavestidoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tallavestidoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tallavestidoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTallaVestido(TallaVestido tallavestido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTallaVestido(tallavestido,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(tallavestido);
	}
	
	public void setVariablesFormularioToObjetoActualTallaVestido(TallaVestido tallavestido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTallaVestido(tallavestido,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTallaVestido(TallaVestido tallavestido,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.getText()==null || this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.getText()=="" || this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.getText()=="Id") {
				this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.setText("0");
			}

			if(conColumnasBase) {tallavestido.setId(Long.parseLong(this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TallaVestidoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabelIdTallaVestido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tallavestido.settalla(Double.parseDouble(this.jInternalFrameDetalleFormTallaVestido.jTextFieldtallaTallaVestido.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TallaVestidoConstantesFunciones.LABEL_TALLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabeltallaTallaVestido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tallavestido.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormTallaVestido.jTextFieldcantidadTallaVestido.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TallaVestidoConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabelcantidadTallaVestido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tallavestido.setdescripcion(this.jInternalFrameDetalleFormTallaVestido.jTextAreadescripcionTallaVestido.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TallaVestidoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaVestido.jLabeldescripcionTallaVestido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTallaVestido(TallaVestido tallavestidoBean,TallaVestido tallavestido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tallavestidoBean.getid_empleado()!=null && !tallavestidoBean.getid_empleado().equals(-1L))) {tallavestido.setid_empleado(tallavestidoBean.getid_empleado());}
			if(conDefault || (!conDefault && tallavestidoBean.getid_vestimenta()!=null && !tallavestidoBean.getid_vestimenta().equals(-1L))) {tallavestido.setid_vestimenta(tallavestidoBean.getid_vestimenta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTallaVestido(TallaVestido tallavestidoOrigen,TallaVestido tallavestido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tallavestidoOrigen.getId()!=null && !tallavestidoOrigen.getId().equals(0L))) {tallavestido.setId(tallavestidoOrigen.getId());}}
			if(conDefault || (!conDefault && tallavestidoOrigen.getid_empleado()!=null && !tallavestidoOrigen.getid_empleado().equals(-1L))) {tallavestido.setid_empleado(tallavestidoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && tallavestidoOrigen.getid_vestimenta()!=null && !tallavestidoOrigen.getid_vestimenta().equals(-1L))) {tallavestido.setid_vestimenta(tallavestidoOrigen.getid_vestimenta());}
			if(conDefault || (!conDefault && tallavestidoOrigen.gettalla()!=null && !tallavestidoOrigen.gettalla().equals(0.0))) {tallavestido.settalla(tallavestidoOrigen.gettalla());}
			if(conDefault || (!conDefault && tallavestidoOrigen.getcantidad()!=null && !tallavestidoOrigen.getcantidad().equals(0))) {tallavestido.setcantidad(tallavestidoOrigen.getcantidad());}
			if(conDefault || (!conDefault && tallavestidoOrigen.getdescripcion()!=null && !tallavestidoOrigen.getdescripcion().equals(""))) {tallavestido.setdescripcion(tallavestidoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTallaVestido(TallaVestido tallavestido) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.setText(tallavestido.getId().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextFieldtallaTallaVestido.setText(tallavestido.gettalla().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextFieldcantidadTallaVestido.setText(tallavestido.getcantidad().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextAreadescripcionTallaVestido.setText(tallavestido.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTallaVestido(TallaVestidoBean tallavestidoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.setText(tallavestidoBean.getId().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextFieldtallaTallaVestido.setText(tallavestidoBean.gettalla().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextFieldcantidadTallaVestido.setText(tallavestidoBean.getcantidad().toString());
			this.jInternalFrameDetalleFormTallaVestido.jTextAreadescripcionTallaVestido.setText(tallavestidoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTallaVestido(TallaVestidoParameterReturnGeneral tallavestidoReturnGeneral,TallaVestidoBean tallavestidoBean,Boolean conDefault) throws Exception { 
		try {
			TallaVestido tallavestidoLocal=new TallaVestido();
			
			tallavestidoLocal=tallavestidoReturnGeneral.getTallaVestido();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tallavestidoLocal.getId()!=null && !tallavestidoLocal.getId().equals(0L))) {tallavestidoBean.setId(tallavestidoLocal.getId());}}
			if(conDefault || (!conDefault && tallavestidoLocal.getid_empleado()!=null && !tallavestidoLocal.getid_empleado().equals(-1L))) {tallavestidoBean.setid_empleado(tallavestidoLocal.getid_empleado());}
			if(conDefault || (!conDefault && tallavestidoLocal.getid_vestimenta()!=null && !tallavestidoLocal.getid_vestimenta().equals(-1L))) {tallavestidoBean.setid_vestimenta(tallavestidoLocal.getid_vestimenta());}
			if(conDefault || (!conDefault && tallavestidoLocal.gettalla()!=null && !tallavestidoLocal.gettalla().equals(0.0))) {tallavestidoBean.settalla(tallavestidoLocal.gettalla());}
			if(conDefault || (!conDefault && tallavestidoLocal.getcantidad()!=null && !tallavestidoLocal.getcantidad().equals(0))) {tallavestidoBean.setcantidad(tallavestidoLocal.getcantidad());}
			if(conDefault || (!conDefault && tallavestidoLocal.getdescripcion()!=null && !tallavestidoLocal.getdescripcion().equals(""))) {tallavestidoBean.setdescripcion(tallavestidoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTallaVestidoGenerico(Long idTallaVestidoSeleccionado,JComboBox jComboBoxTallaVestido,List<TallaVestido> tallavestidosLocal)throws Exception {
		try {
			TallaVestido  tallavestidoTemp=null;

			for(TallaVestido tallavestidoAux:tallavestidosLocal) {
				if(tallavestidoAux.getId()!=null && tallavestidoAux.getId().equals(idTallaVestidoSeleccionado)) {
					tallavestidoTemp=tallavestidoAux;
					break;
				}
			}

			jComboBoxTallaVestido.setSelectedItem(tallavestidoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTallaVestidoGenerico(JComboBox jComboBoxTallaVestido,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTallaVestido.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTallaVestido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTallaVestido.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTallaVestido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tallavestido=(TallaVestido) tallavestidoLogic.getTallaVestidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tallavestido =(TallaVestido) tallavestidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tallavestido.getIsNew() && !tallavestido.getIsChanged() && !tallavestido.getIsDeleted()) {
				sDescripcion=tallavestido.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tallavestido.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!tallavestido.getIsNew() && !tallavestido.getIsChanged() && !tallavestido.getIsDeleted()) {
				sDescripcion=tallavestido.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=tallavestido.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Vestimenta")) {
			//sDescripcion=this.getActualVestimentaForeignKeyDescripcion((Long)value);
			if(!tallavestido.getIsNew() && !tallavestido.getIsChanged() && !tallavestido.getIsDeleted()) {
				sDescripcion=tallavestido.getvestimenta_descripcion();
			} else {
				//sDescripcion=this.getActualVestimentaForeignKeyDescripcion((Long)value);
				sDescripcion=tallavestido.getvestimenta_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TallaVestido tallavestidoRow=new TallaVestido();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tallavestidoRow=(TallaVestido) tallavestidoLogic.getTallaVestidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tallavestidoRow=(TallaVestido) tallavestidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTallaVestido(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTallaVestido.setVisible((this.isVisibilidadCeldaNuevoTallaVestido && this.isPermisoNuevoTallaVestido));			
			this.jButtonDuplicarTallaVestido.setVisible((this.isVisibilidadCeldaDuplicarTallaVestido && this.isPermisoDuplicarTallaVestido));			
			this.jButtonCopiarTallaVestido.setVisible((this.isVisibilidadCeldaCopiarTallaVestido && this.isPermisoCopiarTallaVestido));
			this.jButtonVerFormTallaVestido.setVisible((this.isVisibilidadCeldaVerFormTallaVestido && this.isPermisoVerFormTallaVestido));
			
			this.jButtonAbrirOrderByTallaVestido.setVisible((this.isVisibilidadCeldaOrdenTallaVestido && this.isPermisoOrdenTallaVestido));			
			
			this.jButtonNuevoRelacionesTallaVestido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTallaVestido && this.isPermisoNuevoTallaVestido));			
			this.jButtonNuevoGuardarCambiosTallaVestido.setVisible((this.isVisibilidadCeldaNuevoTallaVestido && this.isPermisoNuevoTallaVestido && this.isPermisoGuardarCambiosTallaVestido));
			
			if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonModificarTallaVestido.setVisible((this.isVisibilidadCeldaModificarTallaVestido && this.isPermisoActualizarTallaVestido));	
			this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarTallaVestido.setVisible((this.isVisibilidadCeldaActualizarTallaVestido && this.isPermisoActualizarTallaVestido));	
			this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarTallaVestido.setVisible((this.isVisibilidadCeldaEliminarTallaVestido && this.isPermisoEliminarTallaVestido));
			this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarTallaVestido.setVisible(this.isVisibilidadCeldaCancelarTallaVestido);							
			this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosTallaVestido.setVisible((this.isVisibilidadCeldaGuardarTallaVestido && this.isPermisoGuardarCambiosTallaVestido));			
			
			}
						
			this.jButtonGuardarCambiosTablaTallaVestido.setVisible((this.isVisibilidadCeldaGuardarCambiosTallaVestido && this.isPermisoGuardarCambiosTallaVestido));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTallaVestido.setVisible((this.isVisibilidadCeldaNuevoTallaVestido && this.isPermisoNuevoTallaVestido));						
			this.jButtonDuplicarToolBarTallaVestido.setVisible((this.isVisibilidadCeldaDuplicarTallaVestido && this.isPermisoDuplicarTallaVestido));						
			this.jButtonCopiarToolBarTallaVestido.setVisible((this.isVisibilidadCeldaCopiarTallaVestido && this.isPermisoCopiarTallaVestido));			
			this.jButtonVerFormToolBarTallaVestido.setVisible((this.isVisibilidadCeldaVerFormTallaVestido && this.isPermisoVerFormTallaVestido));			
			this.jButtonAbrirOrderByToolBarTallaVestido.setVisible((this.isVisibilidadCeldaOrdenTallaVestido && this.isPermisoOrdenTallaVestido));
			this.jButtonNuevoRelacionesToolBarTallaVestido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTallaVestido && this.isPermisoNuevoTallaVestido));			
			this.jButtonNuevoGuardarCambiosToolBarTallaVestido.setVisible((this.isVisibilidadCeldaNuevoTallaVestido && this.isPermisoNuevoTallaVestido && this.isPermisoGuardarCambiosTallaVestido));			
			
			if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonModificarToolBarTallaVestido.setVisible((this.isVisibilidadCeldaModificarTallaVestido && this.isPermisoActualizarTallaVestido));	
			this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarToolBarTallaVestido.setVisible((this.isVisibilidadCeldaActualizarTallaVestido  && this.isPermisoActualizarTallaVestido));	
			this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarToolBarTallaVestido.setVisible((this.isVisibilidadCeldaEliminarTallaVestido && this.isPermisoEliminarTallaVestido));
			this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarToolBarTallaVestido.setVisible(this.isVisibilidadCeldaCancelarTallaVestido);				
			this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosToolBarTallaVestido.setVisible((this.isVisibilidadCeldaGuardarTallaVestido && this.isPermisoGuardarCambiosTallaVestido));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTallaVestido.setVisible((this.isVisibilidadCeldaGuardarCambiosTallaVestido && this.isPermisoGuardarCambiosTallaVestido));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTallaVestido.setVisible((this.isVisibilidadCeldaNuevoTallaVestido && this.isPermisoNuevoTallaVestido));			
			this.jMenuItemDuplicarTallaVestido.setVisible((this.isVisibilidadCeldaDuplicarTallaVestido && this.isPermisoDuplicarTallaVestido));			
			this.jMenuItemCopiarTallaVestido.setVisible((this.isVisibilidadCeldaCopiarTallaVestido && this.isPermisoCopiarTallaVestido));			
			this.jMenuItemVerFormTallaVestido.setVisible((this.isVisibilidadCeldaVerFormTallaVestido && this.isPermisoVerFormTallaVestido));			
			this.jMenuItemAbrirOrderByTallaVestido.setVisible((this.isVisibilidadCeldaOrdenTallaVestido && this.isPermisoOrdenTallaVestido));			
			//this.jMenuItemMostrarOcultarTallaVestido.setVisible((this.isVisibilidadCeldaOrdenTallaVestido && this.isPermisoOrdenTallaVestido));
			this.jMenuItemDetalleAbrirOrderByTallaVestido.setVisible((this.isVisibilidadCeldaOrdenTallaVestido && this.isPermisoOrdenTallaVestido));			
			//this.jMenuItemDetalleMostrarOcultarTallaVestido.setVisible((this.isVisibilidadCeldaOrdenTallaVestido && this.isPermisoOrdenTallaVestido));			
			this.jMenuItemNuevoRelacionesTallaVestido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTallaVestido && this.isPermisoNuevoTallaVestido));			
			this.jMenuItemNuevoGuardarCambiosTallaVestido.setVisible((this.isVisibilidadCeldaNuevoTallaVestido && this.isPermisoNuevoTallaVestido && this.isPermisoGuardarCambiosTallaVestido));									
			
			if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemModificarTallaVestido.setVisible((this.isVisibilidadCeldaModificarTallaVestido && this.isPermisoActualizarTallaVestido));	
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemActualizarTallaVestido.setVisible((this.isVisibilidadCeldaActualizarTallaVestido && this.isPermisoActualizarTallaVestido));	
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemEliminarTallaVestido.setVisible((this.isVisibilidadCeldaEliminarTallaVestido && this.isPermisoEliminarTallaVestido));
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemCancelarTallaVestido.setVisible(this.isVisibilidadCeldaCancelarTallaVestido);				
			}
			
			this.jMenuItemGuardarCambiosTallaVestido.setVisible((this.isVisibilidadCeldaGuardarTallaVestido && this.isPermisoGuardarCambiosTallaVestido));						
			this.jMenuItemGuardarCambiosTablaTallaVestido.setVisible((this.isVisibilidadCeldaGuardarCambiosTallaVestido && this.isPermisoGuardarCambiosTallaVestido));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTallaVestido=this.jButtonNuevoTallaVestido.isVisible();
			this.isVisibilidadCeldaDuplicarTallaVestido=this.jButtonDuplicarTallaVestido.isVisible();
			this.isVisibilidadCeldaCopiarTallaVestido=this.jButtonCopiarTallaVestido.isVisible();
			this.isVisibilidadCeldaVerFormTallaVestido=this.jButtonVerFormTallaVestido.isVisible();
			
			this.isVisibilidadCeldaOrdenTallaVestido=this.jButtonAbrirOrderByTallaVestido.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=this.jButtonNuevoRelacionesTallaVestido.isVisible();
			this.isVisibilidadCeldaModificarTallaVestido=this.jButtonModificarTallaVestido.isVisible();
			
			if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			this.isVisibilidadCeldaActualizarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarTallaVestido.isVisible();
			this.isVisibilidadCeldaEliminarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarTallaVestido.isVisible();
			this.isVisibilidadCeldaCancelarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarTallaVestido.isVisible();
			this.isVisibilidadCeldaGuardarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosTallaVestido.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=this.jButtonGuardarCambiosTablaTallaVestido.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTallaVestido=this.jButtonNuevoToolBarTallaVestido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=this.jButtonNuevoRelacionesToolBarTallaVestido.isVisible();
			
			if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			this.isVisibilidadCeldaModificarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jButtonModificarToolBarTallaVestido.isVisible();
			this.isVisibilidadCeldaActualizarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarToolBarTallaVestido.isVisible();
			this.isVisibilidadCeldaEliminarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarToolBarTallaVestido.isVisible();
			this.isVisibilidadCeldaCancelarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarToolBarTallaVestido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTallaVestido=this.jButtonGuardarCambiosToolBarTallaVestido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=this.jButtonGuardarCambiosTablaToolBarTallaVestido.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTallaVestido=this.jMenuItemNuevoTallaVestido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=this.jMenuItemNuevoRelacionesTallaVestido.isVisible();
			
			if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			this.isVisibilidadCeldaModificarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jMenuItemModificarTallaVestido.isVisible();
			this.isVisibilidadCeldaActualizarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jMenuItemActualizarTallaVestido.isVisible();
			this.isVisibilidadCeldaEliminarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jMenuItemEliminarTallaVestido.isVisible();
			this.isVisibilidadCeldaCancelarTallaVestido=this.jInternalFrameDetalleFormTallaVestido.jMenuItemCancelarTallaVestido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTallaVestido=this.jMenuItemGuardarCambiosTallaVestido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=this.jMenuItemGuardarCambiosTablaTallaVestido.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTallaVestido(Boolean esInicializar) {
		if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
				//if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTallaVestido();
			}
			
			this.inicializarActualizarBindingBotonesManualTallaVestido(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTallaVestido() {
		this.jButtonNuevoTallaVestido.setVisible(this.isPermisoNuevoTallaVestido);			
		this.jButtonDuplicarTallaVestido.setVisible(this.isPermisoDuplicarTallaVestido);			
		this.jButtonCopiarTallaVestido.setVisible(this.isPermisoCopiarTallaVestido);			
		this.jButtonVerFormTallaVestido.setVisible(this.isPermisoVerFormTallaVestido);			
		
		this.jButtonAbrirOrderByTallaVestido.setVisible(this.isPermisoOrdenTallaVestido);					
		
		this.jButtonNuevoRelacionesTallaVestido.setVisible(this.isPermisoNuevoTallaVestido);			
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonModificarTallaVestido.setVisible(this.isPermisoActualizarTallaVestido);	
			this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarTallaVestido.setVisible(this.isPermisoActualizarTallaVestido);	
			this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarTallaVestido.setVisible(this.isPermisoEliminarTallaVestido);
			this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarTallaVestido.setVisible(this.isVisibilidadCeldaCancelarTallaVestido);						
			this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosTallaVestido.setVisible(this.isPermisoGuardarCambiosTallaVestido);							
		}
		
		this.jButtonGuardarCambiosTablaTallaVestido.setVisible(this.isPermisoActualizarTallaVestido);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTallaVestido() {
		this.jInternalFrameDetalleFormTallaVestido.jButtonModificarTallaVestido.setVisible(this.isPermisoActualizarTallaVestido);	
		this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarTallaVestido.setVisible(this.isPermisoActualizarTallaVestido);	
		this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarTallaVestido.setVisible(this.isPermisoEliminarTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarTallaVestido.setVisible(this.isVisibilidadCeldaCancelarTallaVestido);							
		this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosTallaVestido.setVisible((this.isVisibilidadCeldaGuardarTallaVestido && this.isPermisoGuardarCambiosTallaVestido));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTallaVestido() {
		if(TallaVestidoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTallaVestido();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTallaVestido() {
	}
	
	public void jTableDatosTallaVestidoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTallaVestido(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTallaVestidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallavestido==null) {
						this.tallavestido = new TallaVestido();
					}

					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				}

				if(this.tallavestido.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tallavestido.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaVestido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTallaVestidoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTallaVestido(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTallaVestido.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTallaVestido.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tallavestidoLogic.getConnexion());

				if(this.tallavestido.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tallavestido.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTallaVestido=(TitledBorder)this.jScrollPanelDatosTallaVestido.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTallaVestido.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTallaVestidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallavestido==null) {
						this.tallavestido = new TallaVestido();
					}

					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				}

				if(this.tallavestido.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tallavestido.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaVestido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoTallaVestidoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTallaVestido=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosTallaVestido.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTallaVestido=(TitledBorder)this.jScrollPanelDatosTallaVestido.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderTallaVestido.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoTallaVestidoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebTallaVestido(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTallaVestido.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTallaVestido.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.tallavestidoLogic.getConnexion());

				if(this.tallavestido.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.tallavestido.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTallaVestido=(TitledBorder)this.jScrollPanelDatosTallaVestido.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderTallaVestido.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoTallaVestidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallavestido==null) {
						this.tallavestido = new TallaVestido();
					}

					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				}

				if(this.tallavestido.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.tallavestido.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaVestido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vestimentaTallaVestidoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovestimenta=true;

			idTienePermisovestimenta=this.tienePermisosUsuarioEnPaginaWebTallaVestido(VestimentaConstantesFunciones.CLASSNAME);

			if(idTienePermisovestimenta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTallaVestido.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTallaVestido.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);

				this.vestimentaBeanSwingJInternalFrame=new VestimentaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vestimentaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vestimentaBeanSwingJInternalFrame.getVestimentaLogic().setConnexion(this.tallavestidoLogic.getConnexion());

				if(this.tallavestido.getid_vestimenta()!=null) {
					this.vestimentaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vestimentaBeanSwingJInternalFrame.setIdActual(this.tallavestido.getid_vestimenta());
					this.vestimentaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vestimentaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vestimentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaVestimenta();
				}

				JInternalFrameBase jinternalFrame =this.vestimentaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTallaVestido=(TitledBorder)this.jScrollPanelDatosTallaVestido.getBorder();
				TitledBorder titledBordervestimenta=(TitledBorder)this.vestimentaBeanSwingJInternalFrame.jScrollPanelDatosVestimenta.getBorder();

				titledBordervestimenta.setTitle(titledBorderTallaVestido.getTitle() + " -> Vestimenta");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vestimentaTallaVestidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallavestido==null) {
						this.tallavestido = new TallaVestido();
					}

					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				}

				if(this.tallavestido.getid_vestimenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vestimenta = "+this.tallavestido.getid_vestimenta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaVestido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontallaTallaVestidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallavestido==null) {
						this.tallavestido = new TallaVestido();
					}

					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				}

				if(this.tallavestido.gettalla()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where talla = "+this.tallavestido.gettalla().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaVestido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadTallaVestidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallavestido==null) {
						this.tallavestido = new TallaVestido();
					}

					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				}

				if(this.tallavestido.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.tallavestido.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaVestido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTallaVestidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaVestido(this.gettallavestido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallavestido==null) {
						this.tallavestido = new TallaVestido();
					}

					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);
				}

				if(this.tallavestido.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tallavestido.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaVestido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoTallaVestidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTallaVestido(false,false);

			this.getTallaVestidosFK_IdEmpleado();

			this.inicializarActualizarBindingTallaVestido(false);

			//if(TallaVestidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTallaVestido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTallaVestidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTallaVestido(false,false);

			this.getTallaVestidosFK_IdEmpresa();

			this.inicializarActualizarBindingTallaVestido(false);

			//if(TallaVestidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTallaVestido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVestimentaTallaVestidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTallaVestido(false,false);

			this.getTallaVestidosFK_IdVestimenta();

			this.inicializarActualizarBindingTallaVestido(false);

			//if(TallaVestidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTallaVestido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallavestidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTallaVestido() {
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
			this.jInternalFrameDetalleFormTallaVestido.setVisible(false);	    			
			this.jInternalFrameDetalleFormTallaVestido.dispose();
			this.jInternalFrameDetalleFormTallaVestido=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
			this.jInternalFrameReporteDinamicoTallaVestido.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTallaVestido.dispose();
			this.jInternalFrameReporteDinamicoTallaVestido=null;
		}
		
		if(this.jInternalFrameImportacionTallaVestido!=null) {
			this.jInternalFrameImportacionTallaVestido.setVisible(false);	    			
			this.jInternalFrameImportacionTallaVestido.dispose();
			this.jInternalFrameImportacionTallaVestido=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTallaVestido();
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTallaVestido")) {
				jButtonNuevoTallaVestidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTallaVestido")) {
				jButtonDuplicarTallaVestidoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTallaVestido")) {
				jButtonCopiarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTallaVestido")) {
				jButtonVerFormTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTallaVestido")) {
				jButtonNuevoTallaVestidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTallaVestido")) {
				jButtonDuplicarTallaVestidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTallaVestido")) {
				jButtonNuevoTallaVestidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTallaVestido")) {
				jButtonDuplicarTallaVestidoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTallaVestido")) {
				jButtonNuevoTallaVestidoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTallaVestido")) {
				jButtonNuevoTallaVestidoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTallaVestido")) {
				jButtonNuevoTallaVestidoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTallaVestido")) {
				jButtonModificarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTallaVestido")) {
				jButtonModificarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTallaVestido")) {
				jButtonModificarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTallaVestido")) {
				jButtonActualizarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTallaVestido")) {
				jButtonActualizarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTallaVestido")) {
				jButtonActualizarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTallaVestido")) {
				jButtonEliminarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTallaVestido")) {
				jButtonEliminarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTallaVestido")) {
				jButtonEliminarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTallaVestido")) {
				jButtonCancelarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTallaVestido")) {
				jButtonCancelarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTallaVestido")) {
				jButtonCancelarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTallaVestido")) {
				jButtonCerrarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTallaVestido")) {
				jButtonCerrarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTallaVestido")) {
				jButtonCerrarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTallaVestido")) {
				jButtonMostrarOcultarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTallaVestido")) {
				jButtonCancelarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTallaVestido")) {
				jButtonGuardarCambiosTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTallaVestido")) {
				jButtonGuardarCambiosTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTallaVestido")) {
				jButtonCopiarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTallaVestido")) {
				jButtonVerFormTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTallaVestido")) {
				jButtonGuardarCambiosTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTallaVestido")) {
				jButtonCopiarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTallaVestido")) {
				jButtonVerFormTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTallaVestido")) {
				jButtonGuardarCambiosTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTallaVestido")) {
				jButtonGuardarCambiosTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTallaVestido")) {
				jButtonGuardarCambiosTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTallaVestido")) {
				jButtonRecargarInformacionTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTallaVestido")) {
				jButtonRecargarInformacionTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTallaVestido")) {
				jButtonRecargarInformacionTallaVestidoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTallaVestido")) {
				jButtonAnterioresTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTallaVestido")) {
				jButtonAnterioresTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTallaVestido")) {
				jButtonAnterioresTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTallaVestido")) {
				jButtonSiguientesTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTallaVestido")) {
				jButtonSiguientesTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTallaVestido")) {
				jButtonSiguientesTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTallaVestido") || sTipo.equals("MenuItemDetalleAbrirOrderByTallaVestido")) {
				jButtonAbrirOrderByTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTallaVestido") || sTipo.equals("MenuItemDetalleMostrarOcultarTallaVestido")) {
				jButtonMostrarOcultarTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTallaVestido")) {
				jButtonNuevoGuardarCambiosTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTallaVestido")) {
				jButtonNuevoGuardarCambiosTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTallaVestido")) {
				jButtonNuevoGuardarCambiosTallaVestidoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTallaVestido")) {
				jButtonCerrarReporteDinamicoTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTallaVestido")) {
				jButtonGenerarReporteDinamicoTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTallaVestido")) {
				
				jButtonGenerarExcelReporteDinamicoTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTallaVestido")) {
				jButtonCerrarImportacionTallaVestidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTallaVestido")) {
				
				jButtonGenerarImportacionTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTallaVestido")) {
				
				jButtonAbrirImportacionTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTallaVestido")) {
				jComboBoxTiposAccionesTallaVestidoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTallaVestido")) {
				jComboBoxTiposRelacionesTallaVestidoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTallaVestido")) {
				jComboBoxTiposAccionesTallaVestidoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTallaVestido")) {
				
				jComboBoxTiposSeleccionarTallaVestidoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTallaVestido")) {
				jTextFieldValorCampoGeneralTallaVestidoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTallaVestido")) {
				jButtonAbrirOrderByTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTallaVestido")) {
				jButtonAbrirOrderByTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTallaVestido")) {
				jButtonCerrarOrderByTallaVestidoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTallaVestidoBusqueda")) {
				this.jButtonidTallaVestidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTallaVestidoUpdate")) {
				this.jButtonid_empresaTallaVestidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTallaVestidoBusqueda")) {
				this.jButtonid_empresaTallaVestidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoTallaVestido")) {
				this.jButtonid_empleadoTallaVestidoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoTallaVestidoUpdate")) {
				this.jButtonid_empleadoTallaVestidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoTallaVestidoBusqueda")) {
				this.jButtonid_empleadoTallaVestidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vestimentaTallaVestidoUpdate")) {
				this.jButtonid_vestimentaTallaVestidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vestimentaTallaVestidoBusqueda")) {
				this.jButtonid_vestimentaTallaVestidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tallaTallaVestidoBusqueda")) {
				this.jButtontallaTallaVestidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadTallaVestidoBusqueda")) {
				this.jButtoncantidadTallaVestidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTallaVestidoBusqueda")) {
				this.jButtondescripcionTallaVestidoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoTallaVestido")) {
				this.jButtonid_empleadoTallaVestidoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoTallaVestido")) {
				this.jButtonFK_IdEmpleadoTallaVestidoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdVestimentaTallaVestido")) {
				this.jButtonFK_IdVestimentaTallaVestidoActionPerformed(evt);
			}
			
			;
			
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTallaVestido();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaVestidoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				


				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TallaVestido tallavestidoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tallavestidoLocal=this.tallavestido;
			} else {
				tallavestidoLocal=this.tallavestidoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
							
				
				


				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaVestidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
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
			
			


			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaVestidoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
								
						
				


				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
								
				
				


				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaVestidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaVestidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaVestidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
							
				
				


				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaVestidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestidoAnterior =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tallavestidoAnterior =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
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
			
			


			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaVestidoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
								
				
				


				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaVestidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaVestidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaVestidoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTallaVestido")) {
					jCheckBoxSeleccionarTodosTallaVestidoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTallaVestido")) {
					jCheckBoxSeleccionadosTallaVestidoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTallaVestido")) {
					
				}
				
				


				
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
												
				
				


				
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaVestidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallavestidoAnterior =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tallavestidoAnterior =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaVestidoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
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
			
			


			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaVestidoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallavestido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallavestido);
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
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
				
				


				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaVestido.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaVestido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaVestidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallavestidoAnterior =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTallaVestido")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTallaVestidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTallaVestido.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tallavestido =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tallavestido =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tallavestido);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTallaVestido")) {
				
				}
				
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTallaVestido")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTallaVestido.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTallaVestido")) {
			
			}
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTallaVestido();
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
			if(sTipo.equals("NuevoTallaVestido")) {
				jButtonNuevoTallaVestidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTallaVestido")) {
				jButtonDuplicarTallaVestidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTallaVestido")) {
				jButtonCopiarTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTallaVestido")) {
				jButtonVerFormTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTallaVestido")) {
				jButtonNuevoTallaVestidoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTallaVestido")) {
				jButtonModificarTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTallaVestido")) {
				jButtonActualizarTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTallaVestido")) {
				jButtonEliminarTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTallaVestido")) {
				jButtonGuardarCambiosTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTallaVestido")) {
				jButtonCancelarTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTallaVestido")) {
				jButtonCerrarTallaVestidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTallaVestido")) {
				jButtonGuardarCambiosTallaVestidoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTallaVestido")) {
				jButtonNuevoGuardarCambiosTallaVestidoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTallaVestido")) {
				jButtonAbrirOrderByTallaVestidoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTallaVestido")) {
				jButtonRecargarInformacionTallaVestidoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTallaVestido")) {
				jButtonAnterioresTallaVestidoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTallaVestido")) {
				jButtonSiguientesTallaVestidoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTallaVestidoBusqueda")) {
				this.jButtonidTallaVestidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTallaVestidoUpdate")) {
				this.jButtonid_empresaTallaVestidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTallaVestidoBusqueda")) {
				this.jButtonid_empresaTallaVestidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoTallaVestido")) {
				this.jButtonid_empleadoTallaVestidoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoTallaVestidoUpdate")) {
				this.jButtonid_empleadoTallaVestidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoTallaVestidoBusqueda")) {
				this.jButtonid_empleadoTallaVestidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vestimentaTallaVestidoUpdate")) {
				this.jButtonid_vestimentaTallaVestidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vestimentaTallaVestidoBusqueda")) {
				this.jButtonid_vestimentaTallaVestidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tallaTallaVestidoBusqueda")) {
				this.jButtontallaTallaVestidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadTallaVestidoBusqueda")) {
				this.jButtoncantidadTallaVestidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTallaVestidoBusqueda")) {
				this.jButtondescripcionTallaVestidoBusquedaActionPerformed(evt);
			}
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTallaVestido();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTallaVestido")) {
				closingInternalFrameTallaVestido();
				
			} else if(sTipo.equals("jButtonCancelarTallaVestido")) {
				JInternalFrameBase jInternalFrameDetalleFormTallaVestido = (JInternalFrameBase)evt.getSource();
	            	
	            TallaVestidoBeanSwingJInternalFrame jInternalFrameParent=(TallaVestidoBeanSwingJInternalFrame)jInternalFrameDetalleFormTallaVestido.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTallaVestidoActionPerformed(null);
			}
			
			TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tallavestido,new Object(),this.tallavestidoParameterGeneral,this.tallavestidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTallaVestido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTallaVestido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTallaVestido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tallavestido)) {
			if(!esControlTabla) {
				if(TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);			
				}
				
				if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTallaVestido(this.tallavestido,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tallavestidoReturnGeneral=tallavestidoLogic.procesarEventosTallaVestidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tallavestidoLogic.getTallaVestidos(),this.tallavestido,this.tallavestidoParameterGeneral,this.isEsNuevoTallaVestido,classes);//this.tallavestidoLogic.getTallaVestido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTallaVestido(this.tallavestidoReturnGeneral,this.tallavestidoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTallaVestido(classes,this.tallavestidoReturnGeneral,this.tallavestidoBean,false);
					}
						
					if(this.tallavestidoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTallaVestido(this.tallavestidoReturnGeneral.getTallaVestido());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTallaVestido(this.tallavestidoReturnGeneral.getTallaVestido());	
					}
						
					if(this.tallavestidoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTallaVestido(this.tallavestidoReturnGeneral.getTallaVestido(),classes);//this.tallavestidoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTallaVestido(this.tallavestido,classes);//this.tallavestidoBean);									
				}
			
				if(TallaVestidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTallaVestido(this.tallavestido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaVestido(this.tallavestido);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tallavestidoAnterior!=null) {
						this.tallavestido=this.tallavestidoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tallavestidoReturnGeneral=tallavestidoLogic.procesarEventosTallaVestidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tallavestidoLogic.getTallaVestidos(),this.tallavestido,this.tallavestidoParameterGeneral,this.isEsNuevoTallaVestido,classes);//this.tallavestidoLogic.getTallaVestido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tallavestidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tallavestidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tallavestidoReturnGeneral.getTallaVestido(),tallavestidoLogic.getTallaVestidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tallavestidoReturnGeneral.getTallaVestido(),this.tallavestidos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTallaVestido.repaint();
				
				//((AbstractTableModel) this.jTableDatosTallaVestido.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTallaVestido();
			}
		}
	}
	
	public void actualizarVisualTableDatosTallaVestido() throws Exception {
		
		TallaVestidoModel tallavestidoModel=(TallaVestidoModel)this.jTableDatosTallaVestido.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tallavestidoModel.tallavestidos=this.tallavestidoLogic.getTallaVestidos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tallavestidoModel.tallavestidos=this.tallavestidos;
		}
		
		
		((TallaVestidoModel) this.jTableDatosTallaVestido.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTallaVestido() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettallavestidoAnterior(),this.tallavestidoLogic.getTallaVestidos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettallavestidoAnterior(),this.tallavestidos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTallaVestido();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTallaVestido(TallaVestido tallavestido,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
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
										
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tallavestido,new Object(),generalEntityParameterGeneral,this.tallavestidoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TallaVestidoConstantesFunciones.getClassesRelationshipsOfTallaVestido(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TallaVestidoConstantesFunciones.getClassesRelationshipsFromStringsOfTallaVestido(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTallaVestido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TallaVestidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tallavestido,new Object(),generalEntityParameterGeneral,this.tallavestidoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTallaVestido(TallaVestidoBean tallavestidoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTallaVestido(ArrayList<Classe> classes,TallaVestidoReturnGeneral tallavestidoReturnGeneral,TallaVestidoBean tallavestidoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTallaVestido(TallaVestido tallavestido,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tallavestido)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTallaVestido = new TallaVestidoDetalleFormJInternalFrame(jDesktopPane,this.tallavestidoSessionBean.getConGuardarRelaciones(),this.tallavestidoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.setVisible(false);
		this.jInternalFrameDetalleFormTallaVestido.setSelected(false);						
		
		this.jInternalFrameDetalleFormTallaVestido.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTallaVestido.tallavestidoLogic=this.tallavestidoLogic;
		
		this.cargarCombosFrameForeignKeyTallaVestido("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTallaVestido();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTallaVestido();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTallaVestido("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTallaVestido();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTallaVestido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTallaVestido"));
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonModificarTallaVestido.addActionListener(new ButtonActionListener(this,"ModificarTallaVestido"));

		
		this.jInternalFrameDetalleFormTallaVestido.jButtonModificarToolBarTallaVestido.addActionListener(new ButtonActionListener(this,"ModificarToolBarTallaVestido"));
					
		this.jInternalFrameDetalleFormTallaVestido.jMenuItemModificarTallaVestido.addActionListener(new ButtonActionListener(this,"MenuItemModificarTallaVestido"));		
		
		
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarTallaVestido.addActionListener (new ButtonActionListener(this,"ActualizarTallaVestido"));
		
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarToolBarTallaVestido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTallaVestido"));
						
		this.jInternalFrameDetalleFormTallaVestido.jMenuItemActualizarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTallaVestido"));		
		
		
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarTallaVestido.addActionListener (new ButtonActionListener(this,"EliminarTallaVestido"));
		
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"EliminarToolBarTallaVestido"));
								
		this.jInternalFrameDetalleFormTallaVestido.jMenuItemEliminarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTallaVestido"));		
		
		
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarTallaVestido.addActionListener (new ButtonActionListener(this,"CancelarTallaVestido"));
		
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"CancelarToolBarTallaVestido"));
					
		this.jInternalFrameDetalleFormTallaVestido.jMenuItemCancelarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTallaVestido"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTallaVestido.jMenuItemDetalleCerrarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTallaVestido"));		
		
		
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTallaVestido"));
		
		
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTallaVestido"));
		
		
		
		this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTallaVestido"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonidTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"idTallaVestidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empresaTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empresaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTallaVestidoBusqueda"));
		//jButtonid_empleadoTallaVestido.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoTallaVestidoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestido.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestido"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_vestimentaTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_vestimentaTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_vestimentaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_vestimentaTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtontallaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"tallaTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtoncantidadTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtondescripcionTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTallaVestidoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTallaVestido"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTallaVestido"));
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTallaVestido"));
		}
		
		this.jTableDatosTallaVestido.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTallaVestido"));
		
		this.jTableDatosTallaVestido.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTallaVestido"));
		
		this.jButtonNuevoTallaVestido.addActionListener(new ButtonActionListener(this,"NuevoTallaVestido"));
		
		this.jButtonDuplicarTallaVestido.addActionListener(new ButtonActionListener(this,"DuplicarTallaVestido"));
		
		this.jButtonCopiarTallaVestido.addActionListener(new ButtonActionListener(this,"CopiarTallaVestido"));
		
		this.jButtonVerFormTallaVestido.addActionListener(new ButtonActionListener(this,"VerFormTallaVestido"));
		
		
		this.jButtonNuevoToolBarTallaVestido.addActionListener(new ButtonActionListener(this,"NuevoToolBarTallaVestido"));
			
		this.jButtonDuplicarToolBarTallaVestido.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTallaVestido"));
			
		this.jMenuItemNuevoTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTallaVestido"));
			
		this.jMenuItemDuplicarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTallaVestido"));		
		
		
		this.jButtonNuevoRelacionesTallaVestido.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTallaVestido"));
		
		
		this.jButtonNuevoRelacionesToolBarTallaVestido.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTallaVestido"));
			
		this.jMenuItemNuevoRelacionesTallaVestido.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTallaVestido"));		
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonModificarTallaVestido.addActionListener(new ButtonActionListener(this,"ModificarTallaVestido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonModificarToolBarTallaVestido.addActionListener(new ButtonActionListener(this,"ModificarToolBarTallaVestido"));
			
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemModificarTallaVestido.addActionListener(new ButtonActionListener(this,"MenuItemModificarTallaVestido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarTallaVestido.addActionListener (new ButtonActionListener(this,"ActualizarTallaVestido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonActualizarToolBarTallaVestido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTallaVestido"));
				
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemActualizarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTallaVestido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarTallaVestido.addActionListener (new ButtonActionListener(this,"EliminarTallaVestido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonEliminarToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"EliminarToolBarTallaVestido"));
						
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemEliminarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTallaVestido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarTallaVestido.addActionListener (new ButtonActionListener(this,"CancelarTallaVestido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonCancelarToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"CancelarToolBarTallaVestido"));
			
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemCancelarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTallaVestido"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTallaVestido"));		
		
		
		this.jButtonCerrarTallaVestido.addActionListener (new ButtonActionListener(this,"CerrarTallaVestido"));
		
		
		this.jButtonCerrarToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"CerrarToolBarTallaVestido"));
			
		this.jMenuItemCerrarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTallaVestido"));
			
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jMenuItemDetalleCerrarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTallaVestido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosTallaVestido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTallaVestido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTallaVestido"));
		}
		
		this.jButtonCopiarToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"CopiarToolBarTallaVestido"));
			
		this.jButtonVerFormToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"VerFormToolBarTallaVestido"));
		
		this.jMenuItemGuardarCambiosTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTallaVestido"));
			
		this.jMenuItemCopiarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTallaVestido"));		
		
		this.jMenuItemVerFormTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTallaVestido"));		
		
		
		this.jButtonGuardarCambiosTablaTallaVestido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTallaVestido"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTallaVestido"));
			
		this.jMenuItemGuardarCambiosTablaTallaVestido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTallaVestido"));		
		
		
		
		this.jButtonRecargarInformacionTallaVestido.addActionListener (new ButtonActionListener(this,"RecargarInformacionTallaVestido"));
					
		this.jButtonRecargarInformacionToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTallaVestido"));
		
		this.jMenuItemRecargarInformacionTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTallaVestido"));		
		
		
		
		this.jButtonAnterioresTallaVestido.addActionListener (new ButtonActionListener(this,"AnterioresTallaVestido"));
		
		
		this.jButtonAnterioresToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTallaVestido"));
		
		this.jMenuItemAnterioresTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTallaVestido"));		
		
		
		this.jButtonSiguientesTallaVestido.addActionListener (new ButtonActionListener(this,"SiguientesTallaVestido"));
		
		
		this.jButtonSiguientesToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTallaVestido"));
			
		this.jMenuItemSiguientesTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTallaVestido"));
			
		this.jMenuItemAbrirOrderByTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTallaVestido"));
			
		this.jMenuItemMostrarOcultarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTallaVestido"));
			
		this.jMenuItemDetalleAbrirOrderByTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTallaVestido"));
			
		this.jMenuItemDetalleMostarOcultarTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTallaVestido"));		
		
		
		this.jButtonNuevoGuardarCambiosTallaVestido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTallaVestido"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTallaVestido"));
			
		this.jMenuItemNuevoGuardarCambiosTallaVestido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTallaVestido"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTallaVestido.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTallaVestido"));

		this.jCheckBoxSeleccionadosTallaVestido.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTallaVestido"));
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTallaVestido"));
		}
		
		
		this.jComboBoxTiposRelacionesTallaVestido.addActionListener (new ButtonActionListener(this,"TiposRelacionesTallaVestido"));
			
		this.jComboBoxTiposAccionesTallaVestido.addActionListener (new ButtonActionListener(this,"TiposAccionesTallaVestido"));
					
		this.jComboBoxTiposSeleccionarTallaVestido.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTallaVestido"));
			
		this.jTextFieldValorCampoGeneralTallaVestido.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTallaVestido"));		
		
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonidTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"idTallaVestidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empresaTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empresaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTallaVestidoBusqueda"));
		//jButtonid_empleadoTallaVestido.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoTallaVestidoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestido.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestido"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_vestimentaTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_vestimentaTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_vestimentaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_vestimentaTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtontallaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"tallaTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtoncantidadTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtondescripcionTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTallaVestidoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoTallaVestido.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoTallaVestido"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestido"));

			this.jButtonFK_IdVestimentaTallaVestido.addActionListener(new ButtonActionListener(this,"FK_IdVestimentaTallaVestido"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTallaVestido!=null) {
				this.jInternalFrameReporteDinamicoTallaVestido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTallaVestido"));
				this.jInternalFrameReporteDinamicoTallaVestido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTallaVestido"));
				this.jInternalFrameReporteDinamicoTallaVestido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTallaVestido"));
			}
			
			//this.jButtonCerrarReporteDinamicoTallaVestido.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTallaVestido"));				
			//this.jButtonGenerarReporteDinamicoTallaVestido.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTallaVestido"));
			//this.jButtonGenerarExcelReporteDinamicoTallaVestido.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTallaVestido"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTallaVestido!=null) {
				this.jInternalFrameImportacionTallaVestido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTallaVestido"));
				this.jInternalFrameImportacionTallaVestido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTallaVestido"));
				this.jInternalFrameImportacionTallaVestido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTallaVestido"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTallaVestido.addActionListener (new ButtonActionListener(this,"AbrirOrderByTallaVestido"));
			
			this.jButtonAbrirOrderByToolBarTallaVestido.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTallaVestido"));			
			
			if(this.jInternalFrameOrderByTallaVestido!=null) {
				this.jInternalFrameOrderByTallaVestido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTallaVestido"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTallaVestido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaVestido.jTabbedPaneRelacionesTallaVestido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTallaVestido"));
		
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
            		closingInternalFrameTallaVestido();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTallaVestido.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTallaVestido = (JInternalFrameBase)event.getSource();
	            	
	            TallaVestidoBeanSwingJInternalFrame jInternalFrameParent=(TallaVestidoBeanSwingJInternalFrame)jInternalFrameDetalleFormTallaVestido.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTallaVestidoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTallaVestido.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTallaVestidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTallaVestido.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTallaVestido.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaVestidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaVestidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaVestidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTallaVestido";
		inputMap = this.jButtonNuevoTallaVestido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTallaVestido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTallaVestidoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaVestidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaVestidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaVestidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTallaVestido";
		inputMap = this.jButtonNuevoRelacionesTallaVestido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTallaVestido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTallaVestidoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTallaVestido";
		inputMap = this.jButtonModificarTallaVestido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTallaVestido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTallaVestidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTallaVestido";
		inputMap = this.jButtonActualizarTallaVestido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTallaVestido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTallaVestidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTallaVestido";
		inputMap = this.jButtonEliminarTallaVestido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTallaVestido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTallaVestidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTallaVestido";
		inputMap = this.jButtonCancelarTallaVestido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTallaVestido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTallaVestidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTallaVestido";
		inputMap = this.jButtonCerrarTallaVestido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTallaVestido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTallaVestidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTallaVestido";
		inputMap = this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosTallaVestido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTallaVestido.jButtonGuardarCambiosTallaVestido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTallaVestidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTallaVestido.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTallaVestidoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTallaVestido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTallaVestidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTallaVestido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTallaVestidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTallaVestido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTallaVestidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonidTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"idTallaVestidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empresaTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empresaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTallaVestidoBusqueda"));
		//jButtonid_empleadoTallaVestido.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoTallaVestidoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestido.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestido"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_vestimentaTallaVestidoUpdate.addActionListener(new ButtonActionListener(this,"id_vestimentaTallaVestidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtonid_vestimentaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"id_vestimentaTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtontallaTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"tallaTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtoncantidadTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"cantidadTallaVestidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaVestido.jButtondescripcionTallaVestidoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTallaVestidoBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoTallaVestido.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoTallaVestido"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoTallaVestido.addActionListener(new ButtonActionListener(this,"id_empleadoTallaVestido"));

		this.jButtonFK_IdVestimentaTallaVestido.addActionListener(new ButtonActionListener(this,"FK_IdVestimentaTallaVestido"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTallaVestido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTallaVestidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTallaVestidoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTallaVestido.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTallaVestido(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
					tallavestidoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TallaVestido tallavestidoAux:tallavestidos) {
					tallavestidoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTallaVestidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTallaVestido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
						tallavestidoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TallaVestido tallavestidoAux:tallavestidos) {
						tallavestidoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TallaVestido tallavestidoAux:tallavestidos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTallaVestido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTallaVestido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTallaVestido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTallaVestidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTallaVestido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTallaVestido.getSelectedRows();
			
			TallaVestido tallavestidoLocal=new TallaVestido();
			
			//this.seleccionarTodosTallaVestido(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallavestidoLocal =(TallaVestido) this.tallavestidoLogic.getTallaVestidos().toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tallavestidoLocal =(TallaVestido) this.tallavestidos.toArray()[this.jTableDatosTallaVestido.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tallavestidoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
						tallavestidoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TallaVestido tallavestidoAux:tallavestidos) {
						tallavestidoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTallaVestido(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTallaVestido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTallaVestido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTallaVestido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTallaVestidoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTallaVestidoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTallaVestidoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTallaVestido(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTallaVestido.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TallaVestido tallavestidoAux:this.tallavestidoLogic.getTallaVestidos()) {
				
						if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_TALLA)) {
							existe=true;
							tallavestidoAux.settalla(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							tallavestidoAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tallavestidoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TallaVestido tallavestidoAux:tallavestidos) {
					
						if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_TALLA)) {
							existe=true;
							tallavestidoAux.settalla(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							tallavestidoAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tallavestidoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTallaVestido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTallaVestidoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTallaVestido(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTallaVestido=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTallaVestido.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTallaVestido) {				
					conSplash=true;//false;										
					
					//this.startProcessTallaVestido(conSplash);
				
					this.generarReporteTallaVestidosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTallaVestidosSeleccionados();
				//this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTallaVestidosSeleccionados(false);
				//this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTallaVestidosSeleccionados(true);
				//this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTallaVestido();
				
				this.exportarTallaVestidosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTallaVestidos();
				//this.importarTallaVestidos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTallaVestido();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTallaVestidosSeleccionados();
				//this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Talla Vestido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTallaVestido();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTallaVestido)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTallaVestido(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.setSelectedIndex(0);					
				}	
			} 			
			else if(TallaVestidoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTallaVestido) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTallaVestido(conSplash);
					
						//this.actualizarParametrosGeneralTallaVestido();
						
						this.generarReporteProcesoAccionTallaVestidosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TallaVestidoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Talla VestidoS SELECCIONADOS?", "MANTENIMIENTO DE Talla Vestido", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTallaVestido();
				
						this.actualizarParametrosGeneralTallaVestido();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tallavestidoReturnGeneral=tallavestidoLogic.procesarAccionTallaVestidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tallavestidoLogic.getTallaVestidos(),this.tallavestidoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTallaVestidoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTallaVestido();
					
					TallaVestidoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTallaVestidoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTallaVestido.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTallaVestido.jComboBoxTiposAccionesFormularioTallaVestido.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTallaVestido(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTallaVestidoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTallaVestido();
			
			if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		
			TallaVestido tallavestido=new TallaVestido();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTallaVestido(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTallaVestido.getSelectedItem();
			
			
			
			
			tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tallavestidosSeleccionados.size()==1) {
				for(TallaVestido tallavestidoAux:tallavestidosSeleccionados) {
					tallavestido=tallavestidoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTallaVestido();
			
      		//this.finishProcessTallaVestido(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTallaVestidoReturnGeneral() throws Exception {
		if(this.tallavestidoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tallavestidoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tallavestidoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tallavestidoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tallavestidoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tallavestidoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTallaVestido(false);
		}
		
		if(this.tallavestidoReturnGeneral.getConRetornoLista() || this.tallavestidoReturnGeneral.getConRetornoObjeto()) {
			if(this.tallavestidoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tallavestidoLogic.setTallaVestidos(this.tallavestidoReturnGeneral.getTallaVestidos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tallavestidoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tallavestidoLogic.setTallaVestido(this.tallavestidoReturnGeneral.getTallaVestido());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTallaVestido(false);
		}
	}
	
	public void actualizarParametrosGeneralTallaVestido() throws Exception {
		
		
	}
	
	public ArrayList<TallaVestido> getTallaVestidosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTallaVestido) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TallaVestido tallavestidoAux:tallavestidoLogic.getTallaVestidos()) {
					if(tallavestidoAux.getIsSelected()) {
						tallavestidosSeleccionados.add(tallavestidoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TallaVestido tallavestidoAux:this.tallavestidos) {
					if(tallavestidoAux.getIsSelected()) {
						tallavestidosSeleccionados.add(tallavestidoAux);				
					}
				}
			}
			
			if(tallavestidosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tallavestidosSeleccionados.addAll(this.tallavestidoLogic.getTallaVestidos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tallavestidosSeleccionados.addAll(this.tallavestidos);				
					}
				}
			}
		} else {
			tallavestidosSeleccionados.add(this.tallavestido);
		}
		
		return tallavestidosSeleccionados;
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
	
	public void generarReporteTallaVestidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTallaVestidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTallaVestidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTallaVestidosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTallaVestidosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Talla Vestido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTallaVestidosSeleccionados() throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTallaVestidos("Todos",tallavestidosSeleccionados);
		
	}	
	
	public void generarReporteNormalTallaVestidosSeleccionados() throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTallaVestidos("Todos",tallavestidosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTallaVestidosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTallaVestidos("Todos",tallavestidosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTallaVestidosSeleccionados() throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTallaVestido();
		
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTallaVestido();
		
		
		//this.generarReporteTallaVestidos("Todos",tallavestidosSeleccionados ,tallavestidoImplementable,tallavestidoImplementableHome);
	}
	
	public void mostrarImportacionTallaVestidos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTallaVestido();
		
		this.abrirFrameImportacionTallaVestido();		
		
			
		//this.generarReporteTallaVestidos("Todos",tallavestidosSeleccionados ,tallavestidoImplementable,tallavestidoImplementableHome);
	}
	
	public void importarTallaVestidos() throws Exception {		
	
	}
	
	public void exportarTallaVestidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTallaVestidosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTallaVestidosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTallaVestidosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Talla Vestido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTallaVestidosSeleccionados() throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallavestido."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTallaVestido(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TallaVestido tallavestidoAux:tallavestidosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTallaVestido(tallavestidoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tallavestidoAux.setsDetalleGeneralEntityReporte(tallavestidoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTallaVestido(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TallaVestidoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaVestidoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaVestidoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaVestidoConstantesFunciones.LABEL_TALLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaVestidoConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaVestidoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTallaVestido(TallaVestido tallavestido,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tallavestido.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tallavestido.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallavestido.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallavestido.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallavestido.getvestimenta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallavestido.gettalla().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallavestido.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallavestido.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTallaVestidosSeleccionados() throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallavestido.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TallaVestidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTallaVestido(row);				
				iRow++;
			}				
			
			for(TallaVestido tallavestidoAux:tallavestidosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTallaVestido(tallavestidoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTallaVestidosSeleccionados() throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();		
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallavestido.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tallavestidos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tallavestido");
			//elementRoot.appendChild(element);
		
			for(TallaVestido tallavestidoAux:tallavestidosSeleccionados) {
				element = document.createElement("tallavestido");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTallaVestido(tallavestidoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Vestido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTallaVestido(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_TALLA);
		cell = row.createCell(iColumn++);cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(TallaVestidoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTallaVestido(TallaVestido tallavestido,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tallavestido.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tallavestido.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tallavestido.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tallavestido.getvestimenta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tallavestido.gettalla());
		cell = row.createCell(iColumn++);cell.setCellValue(tallavestido.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(tallavestido.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTallaVestido(TallaVestido tallavestido,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TallaVestidoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tallavestido.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TallaVestidoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tallavestido.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TallaVestidoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tallavestido.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(TallaVestidoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(tallavestido.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementvestimenta_descripcion = document.createElement(TallaVestidoConstantesFunciones.IDVESTIMENTA);
		elementvestimenta_descripcion.appendChild(document.createTextNode(tallavestido.getvestimenta_descripcion()));
		element.appendChild(elementvestimenta_descripcion);

		Element elementtalla = document.createElement(TallaVestidoConstantesFunciones.TALLA);
		elementtalla.appendChild(document.createTextNode(tallavestido.gettalla().toString().trim()));
		element.appendChild(elementtalla);

		Element elementcantidad = document.createElement(TallaVestidoConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(tallavestido.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementdescripcion = document.createElement(TallaVestidoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tallavestido.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTallaVestidosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TallaVestido> tallavestidosSeleccionados=new ArrayList<TallaVestido>();
		
		tallavestidosSeleccionados=this.getTallaVestidosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTallaVestido(tallavestidosSeleccionados);
		
		this.generarReporteTallaVestidos("Todos",tallavestidosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTallaVestido(ArrayList<TallaVestido> tallavestidosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TallaVestido tallavestidoAux:tallavestidosSeleccionados) {
				tallavestidoAux.setsDetalleGeneralEntityReporte(tallavestidoAux.toString());
			
				if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tallavestidoAux.setsDescripcionGeneralEntityReporte1(tallavestidoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					tallavestidoAux.setsDescripcionGeneralEntityReporte1(tallavestidoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA)) {
					existe=true;
					tallavestidoAux.setsDescripcionGeneralEntityReporte1(tallavestidoAux.getvestimenta_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					tallavestidoAux.setsDescripcionGeneralEntityReporte1(tallavestidoAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(TallaVestidoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tallavestidoAux.setsDescripcionGeneralEntityReporte1(tallavestidoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaVestidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTallaVestido(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTallaVestido=true;
				this.isVisibilidadCeldaNuevoRelacionesTallaVestido=true;
				this.isVisibilidadCeldaGuardarCambiosTallaVestido=true;
			}
			
			this.isVisibilidadCeldaModificarTallaVestido=false;
			this.isVisibilidadCeldaActualizarTallaVestido=false;
			this.isVisibilidadCeldaEliminarTallaVestido=false;
			this.isVisibilidadCeldaCancelarTallaVestido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaVestido=true;
				} else {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTallaVestido=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=false;
			this.isVisibilidadCeldaModificarTallaVestido=false;
			this.isVisibilidadCeldaActualizarTallaVestido=true;
			this.isVisibilidadCeldaEliminarTallaVestido=false;
			this.isVisibilidadCeldaCancelarTallaVestido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaVestido=true;
				} else {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTallaVestido=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=false;
			this.isVisibilidadCeldaModificarTallaVestido=false;
			this.isVisibilidadCeldaActualizarTallaVestido=true;
			this.isVisibilidadCeldaEliminarTallaVestido=true;
			this.isVisibilidadCeldaCancelarTallaVestido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaVestido=true;
				} else {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTallaVestido=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=false;
			this.isVisibilidadCeldaModificarTallaVestido=false;
			this.isVisibilidadCeldaActualizarTallaVestido=true;
			this.isVisibilidadCeldaEliminarTallaVestido=false;
			this.isVisibilidadCeldaCancelarTallaVestido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				} else {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTallaVestido=true;
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=true;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=true;
			this.isVisibilidadCeldaModificarTallaVestido=false;
			this.isVisibilidadCeldaActualizarTallaVestido=false;
			this.isVisibilidadCeldaEliminarTallaVestido=false;
			this.isVisibilidadCeldaCancelarTallaVestido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaVestido=true;
				} else {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTallaVestido=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=false;
			this.isVisibilidadCeldaActualizarTallaVestido=false;
			this.isVisibilidadCeldaEliminarTallaVestido=false;
			this.isVisibilidadCeldaCancelarTallaVestido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				} else {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTallaVestido=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=false;
			this.isVisibilidadCeldaModificarTallaVestido=true;
			this.isVisibilidadCeldaActualizarTallaVestido=false;
			this.isVisibilidadCeldaEliminarTallaVestido=false;
			this.isVisibilidadCeldaCancelarTallaVestido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				} else {
					this.isVisibilidadCeldaGuardarTallaVestido=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TallaVestidoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTallaVestido=true;
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=true;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=true;
		} else {
			this.actualizarEstadoPanelsTallaVestido(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTallaVestido=false;
			//this.isVisibilidadCeldaVerFormTallaVestido=false;
			this.isVisibilidadCeldaDuplicarTallaVestido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tallavestidoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
		} else {
			this.isVisibilidadCeldaNuevoTallaVestido=false;
			this.isVisibilidadCeldaGuardarCambiosTallaVestido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tallavestidoSessionBean.getEsGuardarRelacionado()) {
			if(!tallavestidoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;												
			}
			
			this.jButtonCerrarTallaVestido.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTallaVestido=false;
		}
		
		if(!this.permiteMantenimiento(this.tallavestido)) {
			this.isVisibilidadCeldaActualizarTallaVestido=false;
			this.isVisibilidadCeldaEliminarTallaVestido=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTallaVestido() {
	}
	
	public void actualizarEstadoPanelsTallaVestido(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTallaVestido!=null) {
				this.jScrollPanelDatosEdicionTallaVestido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaVestido!=null) {
				this.jTabbedPaneBusquedasTallaVestido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTallaVestido!=null) {
				this.jScrollPanelDatosTallaVestido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTallaVestido!=null) {
				this.jPanelPaginacionTallaVestido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTallaVestido!=null) {
				this.jScrollPanelDatosEdicionTallaVestido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaVestido!=null) {
				this.jTabbedPaneBusquedasTallaVestido.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTallaVestido!=null) {
				this.jScrollPanelDatosTallaVestido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTallaVestido!=null) {
				this.jPanelPaginacionTallaVestido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTallaVestido!=null) {
				this.jScrollPanelDatosEdicionTallaVestido.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaVestido!=null) {
				this.jTabbedPaneBusquedasTallaVestido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTallaVestido!=null) {
				this.jScrollPanelDatosTallaVestido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTallaVestido!=null) {
				this.jPanelPaginacionTallaVestido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTallaVestido!=null) {
				this.jScrollPanelDatosEdicionTallaVestido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaVestido!=null) {
				this.jTabbedPaneBusquedasTallaVestido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTallaVestido!=null) {
				this.jScrollPanelDatosTallaVestido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTallaVestido!=null) {
				this.jPanelPaginacionTallaVestido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTallaVestido!=null) {
				this.jScrollPanelDatosEdicionTallaVestido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaVestido!=null) {
				this.jTabbedPaneBusquedasTallaVestido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTallaVestido!=null) {
				this.jScrollPanelDatosTallaVestido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTallaVestido!=null) {
				this.jPanelPaginacionTallaVestido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTallaVestido!=null) {
				this.jScrollPanelDatosEdicionTallaVestido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaVestido!=null) {
				this.jTabbedPaneBusquedasTallaVestido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTallaVestido!=null) {
				this.jScrollPanelDatosTallaVestido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTallaVestido!=null) {
				this.jPanelPaginacionTallaVestido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTallaVestido!=null) {
				this.jScrollPanelDatosEdicionTallaVestido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaVestido!=null) {
				this.jTabbedPaneBusquedasTallaVestido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTallaVestido!=null) {
				this.jScrollPanelDatosTallaVestido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTallaVestido!=null) {
				this.jPanelPaginacionTallaVestido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTallaVestido!=null) {
					this.jTabbedPaneBusquedasTallaVestido.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaVestido!=null) {
				this.jTabbedPaneBusquedasTallaVestido.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTallaVestido!=null) {
				this.jPanelParametrosReportesTallaVestido.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasTallaVestido.remove(jPanelFK_IdEmpleadoTallaVestido);}

			this.isVisibilidadFK_IdVestimenta=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdVestimenta) {this.jTabbedPaneBusquedasTallaVestido.remove(jPanelFK_IdVestimentaTallaVestido);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasTallaVestido.remove(jPanelFK_IdEmpleadoTallaVestido);}

			this.isVisibilidadFK_IdVestimenta=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdVestimenta) {this.jTabbedPaneBusquedasTallaVestido.remove(jPanelFK_IdVestimentaTallaVestido);}
		}
		
	}

	public void setVisibilidadBusquedasParaVestimenta(Boolean isParaVestimenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVestimentaNegation=!isParaVestimenta;

			this.isVisibilidadFK_IdEmpleado=isParaVestimentaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasTallaVestido.remove(jPanelFK_IdEmpleadoTallaVestido);}

			this.isVisibilidadFK_IdVestimenta=isParaVestimenta;
			if(!this.isVisibilidadFK_IdVestimenta) {this.jTabbedPaneBusquedasTallaVestido.remove(jPanelFK_IdVestimentaTallaVestido);}
		}
		
	}
	
	
	
	

	public String registrarSesionTallaVestidoParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(tallavestidoSessionBean==null) {
				tallavestidoSessionBean=new TallaVestidoSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(tallavestidoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.tallavestidoFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(TallaVestidoConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTallaVestido(true);
			//empleadoSessionBean.setlidTallaVestidoActual(this.idTallaVestidoActual);

			tallavestidoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTallaVestido(true);
			tallavestidoSessionBean.setlIdTallaVestidoActualForeignKey(this.idTallaVestidoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TallaVestidoSessionBean tallavestidoSessionBean=new TallaVestidoSessionBean();
		
		if(this.tallavestidoSessionBean==null) {
			this.tallavestidoSessionBean=new TallaVestidoSessionBean();
		}
		
		this.tallavestidoSessionBean.setsUltimaBusquedaTallaVestido(this.getsAccionBusqueda());
		this.tallavestidoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tallavestidoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			tallavestidoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tallavestidoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdVestimenta")) {
			tallavestidoSessionBean.setid_vestimenta(this.getid_vestimentaFK_IdVestimenta());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TallaVestidoSessionBean tallavestidoSessionBean=new TallaVestidoSessionBean();
		
		if(this.tallavestidoSessionBean==null) {
			this.tallavestidoSessionBean=new TallaVestidoSessionBean();
		}
		
		if(this.tallavestidoSessionBean.getsUltimaBusquedaTallaVestido()!=null&&!this.tallavestidoSessionBean.getsUltimaBusquedaTallaVestido().equals("")) {
			this.setsAccionBusqueda(tallavestidoSessionBean.getsUltimaBusquedaTallaVestido());
			this.setiNumeroPaginacion(tallavestidoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tallavestidoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(tallavestidoSessionBean.getid_empleado());
				tallavestidoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tallavestidoSessionBean.getid_empresa());
				tallavestidoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdVestimenta")) {
				this.setid_vestimentaFK_IdVestimenta(tallavestidoSessionBean.getid_vestimenta());
				tallavestidoSessionBean.setid_vestimenta(-1L);
			}
		}
		
		this.tallavestidoSessionBean.setsUltimaBusquedaTallaVestido("");
		this.tallavestidoSessionBean.setiNumeroPaginacion(TallaVestidoConstantesFunciones.INUMEROPAGINACION);
		this.tallavestidoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTallaVestido(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTallaVestido() {
		this.updateBorderResaltarBusquedasFormularioTallaVestido();
		this.updateVisibilidadBusquedasFormularioTallaVestido();
		this.updateHabilitarBusquedasFormularioTallaVestido();
	}
	
	public void updateBorderResaltarBusquedasFormularioTallaVestido() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTallaVestido.getComponents().length>0) {
	

		if(this.tallavestidoConstantesFunciones.resaltarFK_IdEmpleadoTallaVestido!=null) {
			index= this.jTabbedPaneBusquedasTallaVestido.indexOfComponent(this.jPanelFK_IdEmpleadoTallaVestido);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaVestido.getComponent(index);
				jPanel.setBorder(this.tallavestidoConstantesFunciones.resaltarFK_IdEmpleadoTallaVestido);
			}
		}

		if(this.tallavestidoConstantesFunciones.resaltarFK_IdVestimentaTallaVestido!=null) {
			index= this.jTabbedPaneBusquedasTallaVestido.indexOfComponent(this.jPanelFK_IdVestimentaTallaVestido);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaVestido.getComponent(index);
				jPanel.setBorder(this.tallavestidoConstantesFunciones.resaltarFK_IdVestimentaTallaVestido);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTallaVestido() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTallaVestido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTallaVestido.indexOfComponent(this.jPanelFK_IdEmpleadoTallaVestido);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTallaVestido.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tallavestidoConstantesFunciones.mostrarFK_IdEmpleadoTallaVestido);
			if(!this.tallavestidoConstantesFunciones.mostrarFK_IdEmpleadoTallaVestido && index>-1) {
				this.jTabbedPaneBusquedasTallaVestido.remove(index);
			}

			index= this.jTabbedPaneBusquedasTallaVestido.indexOfComponent(this.jPanelFK_IdVestimentaTallaVestido);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTallaVestido.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tallavestidoConstantesFunciones.mostrarFK_IdVestimentaTallaVestido);
			if(!this.tallavestidoConstantesFunciones.mostrarFK_IdVestimentaTallaVestido && index>-1) {
				this.jTabbedPaneBusquedasTallaVestido.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTallaVestido() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTallaVestido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTallaVestido.indexOfComponent(this.jPanelFK_IdEmpleadoTallaVestido);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTallaVestido.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tallavestidoConstantesFunciones.activarFK_IdEmpleadoTallaVestido);
				this.jTabbedPaneBusquedasTallaVestido.setEnabledAt(index,this.tallavestidoConstantesFunciones.activarFK_IdEmpleadoTallaVestido);
			}

			index= this.jTabbedPaneBusquedasTallaVestido.indexOfComponent(this.jPanelFK_IdVestimentaTallaVestido);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTallaVestido.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tallavestidoConstantesFunciones.activarFK_IdVestimentaTallaVestido);
				this.jTabbedPaneBusquedasTallaVestido.setEnabledAt(index,this.tallavestidoConstantesFunciones.activarFK_IdVestimentaTallaVestido);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTallaVestido(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasTallaVestido.indexOfComponent(this.jPanelFK_IdEmpleadoTallaVestido);

			this.jTabbedPaneBusquedasTallaVestido.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaVestido.getComponent(index);

			this.tallavestidoConstantesFunciones.setResaltarFK_IdEmpleadoTallaVestido(resaltar);

			jPanel.setBorder(this.tallavestidoConstantesFunciones.resaltarFK_IdEmpleadoTallaVestido);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdVestimenta")) {
			index= this.jTabbedPaneBusquedasTallaVestido.indexOfComponent(this.jPanelFK_IdVestimentaTallaVestido);

			this.jTabbedPaneBusquedasTallaVestido.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaVestido.getComponent(index);

			this.tallavestidoConstantesFunciones.setResaltarFK_IdVestimentaTallaVestido(resaltar);

			jPanel.setBorder(this.tallavestidoConstantesFunciones.resaltarFK_IdVestimentaTallaVestido);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTallaVestido.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTallaVestido() throws Exception {

		if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTallaVestido();
		this.updateVisibilidadResaltarControlesFormularioTallaVestido();
		this.updateHabilitarResaltarControlesFormularioTallaVestido();
		
	}
	
	public void updateBorderResaltarControlesFormularioTallaVestido() throws Exception {
		if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tallavestidoConstantesFunciones.resaltaridTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido!=null) {this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.setBorder(this.tallavestidoConstantesFunciones.resaltaridTallaVestido);}
		if(this.tallavestidoConstantesFunciones.resaltarid_empresaTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido!=null) {this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setBorder(this.tallavestidoConstantesFunciones.resaltarid_empresaTallaVestido);}
		if(this.tallavestidoConstantesFunciones.resaltarid_empleadoTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido!=null) {this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setBorder(this.tallavestidoConstantesFunciones.resaltarid_empleadoTallaVestido);}
		if(this.tallavestidoConstantesFunciones.resaltarid_vestimentaTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido!=null) {this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setBorder(this.tallavestidoConstantesFunciones.resaltarid_vestimentaTallaVestido);}
		if(this.tallavestidoConstantesFunciones.resaltartallaTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido!=null) {this.jInternalFrameDetalleFormTallaVestido.jTextFieldtallaTallaVestido.setBorder(this.tallavestidoConstantesFunciones.resaltartallaTallaVestido);}
		if(this.tallavestidoConstantesFunciones.resaltarcantidadTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido!=null) {this.jInternalFrameDetalleFormTallaVestido.jTextFieldcantidadTallaVestido.setBorder(this.tallavestidoConstantesFunciones.resaltarcantidadTallaVestido);}
		if(this.tallavestidoConstantesFunciones.resaltardescripcionTallaVestido!=null && this.jInternalFrameDetalleFormTallaVestido!=null) {this.jInternalFrameDetalleFormTallaVestido.jTextAreadescripcionTallaVestido.setBorder(this.tallavestidoConstantesFunciones.resaltardescripcionTallaVestido);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTallaVestido() throws Exception {		
		if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
	
		//this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostraridTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jPanelidTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostraridTallaVestido);
		//this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarid_empresaTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jPanelid_empresaTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarid_empresaTallaVestido);
		//this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarid_empleadoTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jPanelid_empleadoTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarid_empleadoTallaVestido);
			this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarid_empleadoTallaVestido);
		//this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarid_vestimentaTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jPanelid_vestimentaTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarid_vestimentaTallaVestido);
		//this.jInternalFrameDetalleFormTallaVestido.jTextFieldtallaTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrartallaTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jPaneltallaTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrartallaTallaVestido);
		//this.jInternalFrameDetalleFormTallaVestido.jTextFieldcantidadTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarcantidadTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jPanelcantidadTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrarcantidadTallaVestido);
		//this.jInternalFrameDetalleFormTallaVestido.jTextAreadescripcionTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrardescripcionTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jPaneldescripcionTallaVestido.setVisible(this.tallavestidoConstantesFunciones.mostrardescripcionTallaVestido);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTallaVestido() throws Exception {
		if(this.jInternalFrameDetalleFormTallaVestido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTallaVestido!=null) {
	
		this.jInternalFrameDetalleFormTallaVestido.jLabelidTallaVestido.setEnabled(this.tallavestidoConstantesFunciones.activaridTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empresaTallaVestido.setEnabled(this.tallavestidoConstantesFunciones.activarid_empresaTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_empleadoTallaVestido.setEnabled(this.tallavestidoConstantesFunciones.activarid_empleadoTallaVestido);
			this.jInternalFrameDetalleFormTallaVestido.jButtonid_empleadoTallaVestido.setEnabled(this.tallavestidoConstantesFunciones.activarid_empleadoTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jComboBoxid_vestimentaTallaVestido.setEnabled(this.tallavestidoConstantesFunciones.activarid_vestimentaTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jTextFieldtallaTallaVestido.setEnabled(this.tallavestidoConstantesFunciones.activartallaTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jTextFieldcantidadTallaVestido.setEnabled(this.tallavestidoConstantesFunciones.activarcantidadTallaVestido);
		this.jInternalFrameDetalleFormTallaVestido.jTextAreadescripcionTallaVestido.setEnabled(this.tallavestidoConstantesFunciones.activardescripcionTallaVestido);
		}
	}
	
		
}