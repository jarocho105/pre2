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

import com.bydan.erp.nomina.util.ValorRubroVariableConstantesFunciones;
import com.bydan.erp.nomina.util.ValorRubroVariableParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ValorRubroVariableParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ValorRubroVariableBean;
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
public class ValorRubroVariableBeanSwingJInternalFrame extends ValorRubroVariableJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ValorRubroVariableBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ValorRubroVariable> valorrubrovariableValidator = new ClassValidator<ValorRubroVariable>(ValorRubroVariable.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ValorRubroVariable valorrubrovariable;	
	public ValorRubroVariable valorrubrovariableAux;
	public ValorRubroVariable valorrubrovariableAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ValorRubroVariable valorrubrovariableTotales;
	public Long idValorRubroVariableActual;
	public Long iIdNuevoValorRubroVariable=0L;
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

	public String sFinalQueryComboRubroEmplea="";

	public List<RubroEmplea> rubroempleasForeignKey;

	public List<RubroEmplea> getrubroempleasForeignKey() {
		return rubroempleasForeignKey;
	}

	public void setrubroempleasForeignKey(List<RubroEmplea> rubroempleasForeignKey) {
		this.rubroempleasForeignKey = rubroempleasForeignKey;
	}

	//OBJETO FK ACTUAL
	public RubroEmplea rubroempleaForeignKey;

	public RubroEmplea getrubroempleaForeignKey() {
		return rubroempleaForeignKey;
	}

	public void setrubroempleaForeignKey(RubroEmplea rubroempleaForeignKey) {
		this.rubroempleaForeignKey = rubroempleaForeignKey;
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
	
	public Boolean isPermisoTodoValorRubroVariable;
	public Boolean isPermisoNuevoValorRubroVariable;
	public Boolean isPermisoActualizarValorRubroVariable;
	public Boolean isPermisoActualizarOriginalValorRubroVariable;
	public Boolean isPermisoEliminarValorRubroVariable;
	public Boolean isPermisoGuardarCambiosValorRubroVariable;
	public Boolean isPermisoConsultaValorRubroVariable;
	public Boolean isPermisoBusquedaValorRubroVariable;
	public Boolean isPermisoReporteValorRubroVariable;
	public Boolean isPermisoPaginacionMedioValorRubroVariable;
	public Boolean isPermisoPaginacionAltoValorRubroVariable;
	public Boolean isPermisoPaginacionTodoValorRubroVariable;
	public Boolean isPermisoCopiarValorRubroVariable;
	public Boolean isPermisoVerFormValorRubroVariable;
	public Boolean isPermisoDuplicarValorRubroVariable;
	public Boolean isPermisoOrdenValorRubroVariable;
	
	
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
	
	public ValorRubroVariableParameterReturnGeneral valorrubrovariableReturnGeneral;
	public ValorRubroVariableParameterReturnGeneral valorrubrovariableParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoValorRubroVariable=false;
	public Boolean esParaAccionDesdeFormularioValorRubroVariable=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ValorRubroVariableSessionBeanAdditional valorrubrovariableSessionBeanAdditional=null;
	
	public ValorRubroVariableSessionBeanAdditional getValorRubroVariableSessionBeanAdditional() {
		return this.valorrubrovariableSessionBeanAdditional;
	}
	
	public void setValorRubroVariableSessionBeanAdditional(ValorRubroVariableSessionBeanAdditional valorrubrovariableSessionBeanAdditional) {
		try {
			this.valorrubrovariableSessionBeanAdditional=valorrubrovariableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ValorRubroVariableBeanSwingJInternalFrameAdditional valorrubrovariableBeanSwingJInternalFrameAdditional=null;
	//public class ValorRubroVariableBeanSwingJInternalFrame
	
	public ValorRubroVariableBeanSwingJInternalFrameAdditional getValorRubroVariableBeanSwingJInternalFrameAdditional() {
		return this.valorrubrovariableBeanSwingJInternalFrameAdditional;
	}
	
	public void setValorRubroVariableBeanSwingJInternalFrameAdditional(ValorRubroVariableBeanSwingJInternalFrameAdditional valorrubrovariableBeanSwingJInternalFrameAdditional) {
		try {
			this.valorrubrovariableBeanSwingJInternalFrameAdditional=valorrubrovariableBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ValorRubroVariableLogic valorrubrovariableLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ValorRubroVariable valorrubrovariableBean;
	public ValorRubroVariableConstantesFunciones valorrubrovariableConstantesFunciones;
	//public ValorRubroVariableParameterReturnGeneral valorrubrovariableReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	
	//PARAMETROS
	
	
	//public List<ValorRubroVariable> valorrubrovariables;	
	//public List<ValorRubroVariable> valorrubrovariablesEliminados;
	//public List<ValorRubroVariable> valorrubrovariablesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoValorRubroVariable=false;
	public Boolean isVisibilidadCeldaDuplicarValorRubroVariable=true;
	public Boolean isVisibilidadCeldaCopiarValorRubroVariable=true;
	public Boolean isVisibilidadCeldaVerFormValorRubroVariable=true;
	public Boolean isVisibilidadCeldaOrdenValorRubroVariable=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
	public Boolean isVisibilidadCeldaModificarValorRubroVariable=false;
	public Boolean isVisibilidadCeldaActualizarValorRubroVariable=false;
	public Boolean isVisibilidadCeldaEliminarValorRubroVariable=false;
	public Boolean isVisibilidadCeldaCancelarValorRubroVariable=false;
	public Boolean isVisibilidadCeldaGuardarValorRubroVariable=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosValorRubroVariable=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	
	public Long getiIdNuevoValorRubroVariable() {
		return this.iIdNuevoValorRubroVariable;
	}

	public void setiIdNuevoValorRubroVariable(Long iIdNuevoValorRubroVariable) {
		this.iIdNuevoValorRubroVariable = iIdNuevoValorRubroVariable;
	}
	
	public Long getidValorRubroVariableActual() {
		return this.idValorRubroVariableActual;
	}

	public void setidValorRubroVariableActual(Long idValorRubroVariableActual) {
		this.idValorRubroVariableActual = idValorRubroVariableActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ValorRubroVariable getvalorrubrovariable() {
		return this.valorrubrovariable;
	}

	public void setvalorrubrovariable(ValorRubroVariable valorrubrovariable) {
		this.valorrubrovariable = valorrubrovariable;
	}
	
	public ValorRubroVariable getvalorrubrovariableAux() {
		return this.valorrubrovariableAux;
	}

	public void setvalorrubrovariableAux(ValorRubroVariable valorrubrovariableAux) {
		this.valorrubrovariableAux = valorrubrovariableAux;
	}				
	
	public ValorRubroVariable getvalorrubrovariableAnterior() {
		return this.valorrubrovariableAnterior;
	}

	public void setvalorrubrovariableAnterior(ValorRubroVariable valorrubrovariableAnterior) {
		this.valorrubrovariableAnterior = valorrubrovariableAnterior;
	}	
	
	public ValorRubroVariable getvalorrubrovariableTotales() {
		return this.valorrubrovariableTotales;
	}

	public void setvalorrubrovariableTotales(ValorRubroVariable valorrubrovariableTotales) {
		this.valorrubrovariableTotales = valorrubrovariableTotales;
	}	
	
	public ValorRubroVariable getvalorrubrovariableBean() {
		return this.valorrubrovariableBean;
	}

	public void setvalorrubrovariableBean(ValorRubroVariable valorrubrovariableBean) {
		this.valorrubrovariableBean = valorrubrovariableBean;
	}	
	
	public ValorRubroVariableParameterReturnGeneral getvalorrubrovariableReturnGeneral() {
		return this.valorrubrovariableReturnGeneral;
	}

	public void setvalorrubrovariableReturnGeneral(ValorRubroVariableParameterReturnGeneral valorrubrovariableReturnGeneral) {
		this.valorrubrovariableReturnGeneral = valorrubrovariableReturnGeneral;
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

	public Long id_rubro_empleaFK_IdRubroEmplea=-1L;

	public Long getid_rubro_empleaFK_IdRubroEmplea() {
		return this.id_rubro_empleaFK_IdRubroEmplea;
	}

	public void setid_rubro_empleaFK_IdRubroEmplea(Long id_rubro_empleaFK_IdRubroEmplea) {
		this.id_rubro_empleaFK_IdRubroEmplea = id_rubro_empleaFK_IdRubroEmplea;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ValorRubroVariableLogic getValorRubroVariableLogic()	{		
		return valorrubrovariableLogic;
	}

	public void setValorRubroVariableLogic(ValorRubroVariableLogic valorrubrovariableLogic) {
		this.valorrubrovariableLogic = valorrubrovariableLogic;
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
	
	public Boolean getIsEsNuevoValorRubroVariable() {
		return isEsNuevoValorRubroVariable;
	}

	public void setIsEsNuevoValorRubroVariable(Boolean isEsNuevoValorRubroVariable) {
		this.isEsNuevoValorRubroVariable = isEsNuevoValorRubroVariable;
	}

	public Boolean getEsParaAccionDesdeFormularioValorRubroVariable() {
		return esParaAccionDesdeFormularioValorRubroVariable;
	}
	
	public void setEsParaAccionDesdeFormularioValorRubroVariable(Boolean esParaAccionDesdeFormularioValorRubroVariable) {
		this.esParaAccionDesdeFormularioValorRubroVariable = esParaAccionDesdeFormularioValorRubroVariable;
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

			if(this.valorrubrovariableSessionBean==null) {
				this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
			}

			if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(valorrubrovariableSessionBean.getlidEmpresaActual());
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

			if(this.valorrubrovariableSessionBean==null) {
				this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
			}

			if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(valorrubrovariableSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosRubroEmpleasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RubroEmpleaLogic rubroempleaLogic=new RubroEmpleaLogic();

			//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

			if(this.valorrubrovariableSessionBean==null) {
				this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
			}

			if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

					rubroempleaLogic.getTodosRubroEmpleasWithConnection(sFinalQuery,new Pagination());

					this.rubroempleasForeignKey=rubroempleaLogic.getRubroEmpleas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRubroEmplea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleaLogic.getEntityWithConnection(valorrubrovariableSessionBean.getlidRubroEmpleaActual());
					this.rubroempleasForeignKey.add(rubroempleaLogic.getRubroEmplea());
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

					if(this.valorrubrovariable!=null) {
						this.valorrubrovariable.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
						this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaValorRubroVariable.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
						if(this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.getItemCount()>0) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaValorRubroVariableGenerico)throws Exception
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
				jComboBoxid_empresaValorRubroVariableGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaValorRubroVariableGenerico!=null && jComboBoxid_empresaValorRubroVariableGenerico.getItemCount()>0) {
					jComboBoxid_empresaValorRubroVariableGenerico.setSelectedIndex(0);
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

					if(this.valorrubrovariable!=null) {
						this.valorrubrovariable.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
						this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoValorRubroVariable.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
						if(this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.getItemCount()>0) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoValorRubroVariableGenerico)throws Exception
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
				jComboBoxid_empleadoValorRubroVariableGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoValorRubroVariableGenerico!=null && jComboBoxid_empleadoValorRubroVariableGenerico.getItemCount()>0) {
					jComboBoxid_empleadoValorRubroVariableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRubroEmpleaForeignKey(Long idRubroEmpleaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(rubroempleaTemp!=null) {

					if(this.valorrubrovariable!=null) {
						this.valorrubrovariable.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
						this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaValorRubroVariable.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
						if(this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.getItemCount()>0) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable!=null) {
						jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable!=null) {
							//jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setSelectedIndex(0);
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

	public String getActualRubroEmpleaForeignKeyDescripcion(Long idRubroEmpleaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}


			sDescripcion=RubroEmpleaConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaValorRubroVariableGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(rubroempleaTemp!=null) {
				jComboBoxid_rubro_empleaValorRubroVariableGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaValorRubroVariableGenerico!=null && jComboBoxid_rubro_empleaValorRubroVariableGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaValorRubroVariableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ValorRubroVariable valorrubrovariable,JComboBox jComboBoxid_empresaValorRubroVariableGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaValorRubroVariableGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaValorRubroVariableGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				valorrubrovariable.setid_empresa(empresaAux.getId());
				valorrubrovariable.setempresa_descripcion(ValorRubroVariableConstantesFunciones.getEmpresaDescripcion(empresaAux));
				valorrubrovariable.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(ValorRubroVariable valorrubrovariable,JComboBox jComboBoxid_empleadoValorRubroVariableGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoValorRubroVariableGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoValorRubroVariableGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				valorrubrovariable.setid_empleado(empleadoAux.getId());
				valorrubrovariable.setempleado_descripcion(ValorRubroVariableConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				valorrubrovariable.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(ValorRubroVariable valorrubrovariable,JComboBox jComboBoxid_rubro_empleaValorRubroVariableGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaValorRubroVariableGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaValorRubroVariableGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				valorrubrovariable.setid_rubro_emplea(rubroempleaAux.getId());
				valorrubrovariable.setrubroemplea_descripcion(ValorRubroVariableConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				valorrubrovariable.setRubroEmplea(rubroempleaAux);			}
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

					if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { 
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { 
					}

					if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { 
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { 
					}

					if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.addItem(empleado);
							}
						}

						if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRubroEmpleasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRubroEmplea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { 
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { 
					}

					if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.addItem(rubroemplea);
							}
						}

						if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameRubroEmpleaForeignKey(RubroEmplea rubroemplea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesValorRubroVariable() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ValorRubroVariableConstantesFunciones.refrescarForeignKeysDescripcionesValorRubroVariable(this.valorrubrovariableLogic.getValorRubroVariables());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ValorRubroVariableConstantesFunciones.refrescarForeignKeysDescripcionesValorRubroVariable(this.valorrubrovariables);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(RubroEmplea.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//valorrubrovariableLogic.setValorRubroVariables(this.valorrubrovariables);
			valorrubrovariableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ValorRubroVariableParameterReturnGeneral getValorRubroVariableParameterGeneral() {
		return this.valorrubrovariableParameterGeneral;
	}
	
	public void setValorRubroVariableParameterGeneral(ValorRubroVariableParameterReturnGeneral valorrubrovariableParameterGeneral) {
		this.valorrubrovariableParameterGeneral = valorrubrovariableParameterGeneral;
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
	
	public Boolean getIsPermisoTodoValorRubroVariable() {
		return isPermisoTodoValorRubroVariable;
	}

	public void setIsPermisoTodoValorRubroVariable(Boolean isPermisoTodoValorRubroVariable) {
		this.isPermisoTodoValorRubroVariable = isPermisoTodoValorRubroVariable;
	}

	public Boolean getIsPermisoNuevoValorRubroVariable() {
		return isPermisoNuevoValorRubroVariable;
	}

	public void setIsPermisoNuevoValorRubroVariable(Boolean isPermisoNuevoValorRubroVariable) {
		this.isPermisoNuevoValorRubroVariable = isPermisoNuevoValorRubroVariable;
	}

	public Boolean getIsPermisoActualizarValorRubroVariable() {
		return isPermisoActualizarValorRubroVariable;
	}

	public void setIsPermisoActualizarValorRubroVariable(Boolean isPermisoActualizarValorRubroVariable) {
		this.isPermisoActualizarValorRubroVariable = isPermisoActualizarValorRubroVariable;
	}

	public Boolean getIsPermisoEliminarValorRubroVariable() {
		return isPermisoEliminarValorRubroVariable;
	}

	public void setIsPermisoEliminarValorRubroVariable(Boolean isPermisoEliminarValorRubroVariable) {
		this.isPermisoEliminarValorRubroVariable = isPermisoEliminarValorRubroVariable;
	}

	public Boolean getIsPermisoGuardarCambiosValorRubroVariable() {
		return isPermisoGuardarCambiosValorRubroVariable;
	}

	public void setIsPermisoGuardarCambiosValorRubroVariable(Boolean isPermisoGuardarCambiosValorRubroVariable) {
		this.isPermisoGuardarCambiosValorRubroVariable = isPermisoGuardarCambiosValorRubroVariable;
	}
	
	public Boolean getIsPermisoConsultaValorRubroVariable() {
		return isPermisoConsultaValorRubroVariable;
	}

	public void setIsPermisoConsultaValorRubroVariable(Boolean isPermisoConsultaValorRubroVariable) {
		this.isPermisoConsultaValorRubroVariable = isPermisoConsultaValorRubroVariable;
	}

	public Boolean getIsPermisoBusquedaValorRubroVariable() {
		return isPermisoBusquedaValorRubroVariable;
	}

	public void setIsPermisoBusquedaValorRubroVariable(Boolean isPermisoBusquedaValorRubroVariable) {
		this.isPermisoBusquedaValorRubroVariable = isPermisoBusquedaValorRubroVariable;
	}

	public Boolean getIsPermisoReporteValorRubroVariable() {
		return isPermisoReporteValorRubroVariable;
	}

	public void setIsPermisoReporteValorRubroVariable(Boolean isPermisoReporteValorRubroVariable) {
		this.isPermisoReporteValorRubroVariable = isPermisoReporteValorRubroVariable;
	}
	
	public Boolean getIsPermisoPaginacionMedioValorRubroVariable() {
		return isPermisoPaginacionMedioValorRubroVariable;
	}

	public void setIsPermisoPaginacionMedioValorRubroVariable(Boolean isPermisoPaginacionMedioValorRubroVariable) {
		this.isPermisoPaginacionMedioValorRubroVariable = isPermisoPaginacionMedioValorRubroVariable;
	}
	
	public Boolean getIsPermisoPaginacionTodoValorRubroVariable() {
		return isPermisoPaginacionTodoValorRubroVariable;
	}

	public void setIsPermisoPaginacionTodoValorRubroVariable(Boolean isPermisoPaginacionTodoValorRubroVariable) {
		this.isPermisoPaginacionTodoValorRubroVariable = isPermisoPaginacionTodoValorRubroVariable;
	}
	
	public Boolean getIsPermisoPaginacionAltoValorRubroVariable() {
		return isPermisoPaginacionAltoValorRubroVariable;
	}

	public void setIsPermisoPaginacionAltoValorRubroVariable(Boolean isPermisoPaginacionAltoValorRubroVariable) {
		this.isPermisoPaginacionAltoValorRubroVariable = isPermisoPaginacionAltoValorRubroVariable;
	}
	
	public Boolean getIsPermisoCopiarValorRubroVariable() {
		return isPermisoCopiarValorRubroVariable;
	}

	public void setIsPermisoCopiarValorRubroVariable(Boolean isPermisoCopiarValorRubroVariable) {
		this.isPermisoCopiarValorRubroVariable = isPermisoCopiarValorRubroVariable;
	}
	
	public Boolean getIsPermisoVerFormValorRubroVariable() {
		return isPermisoVerFormValorRubroVariable;
	}

	public void setIsPermisoVerFormValorRubroVariable(Boolean isPermisoVerFormValorRubroVariable) {
		this.isPermisoVerFormValorRubroVariable = isPermisoVerFormValorRubroVariable;
	}
	
	public Boolean getIsPermisoDuplicarValorRubroVariable() {
		return isPermisoDuplicarValorRubroVariable;
	}

	public void setIsPermisoDuplicarValorRubroVariable(Boolean isPermisoDuplicarValorRubroVariable) {
		this.isPermisoDuplicarValorRubroVariable = isPermisoDuplicarValorRubroVariable;
	}
	
	public Boolean getIsPermisoOrdenValorRubroVariable() {
		return isPermisoOrdenValorRubroVariable;
	}

	public void setIsPermisoOrdenValorRubroVariable(Boolean isPermisoOrdenValorRubroVariable) {
		this.isPermisoOrdenValorRubroVariable = isPermisoOrdenValorRubroVariable;
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
	
	public Boolean getIsVisibilidadCeldaNuevoValorRubroVariable() {
		return isVisibilidadCeldaNuevoValorRubroVariable;
	}

	public void setIsVisibilidadCeldaNuevoValorRubroVariable(Boolean isVisibilidadCeldaNuevoValorRubroVariable) {
		this.isVisibilidadCeldaNuevoValorRubroVariable = isVisibilidadCeldaNuevoValorRubroVariable;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarValorRubroVariable() {
		return isVisibilidadCeldaDuplicarValorRubroVariable;
	}

	public void setIsVisibilidadCeldaDuplicarValorRubroVariable(Boolean isVisibilidadCeldaDuplicarValorRubroVariable) {
		this.isVisibilidadCeldaDuplicarValorRubroVariable = isVisibilidadCeldaDuplicarValorRubroVariable;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarValorRubroVariable() {
		return isVisibilidadCeldaCopiarValorRubroVariable;
	}

	public void setIsVisibilidadCeldaCopiarValorRubroVariable(Boolean isVisibilidadCeldaCopiarValorRubroVariable) {
		this.isVisibilidadCeldaCopiarValorRubroVariable = isVisibilidadCeldaCopiarValorRubroVariable;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormValorRubroVariable() {
		return isVisibilidadCeldaVerFormValorRubroVariable;
	}

	public void setIsVisibilidadCeldaVerFormValorRubroVariable(Boolean isVisibilidadCeldaVerFormValorRubroVariable) {
		this.isVisibilidadCeldaVerFormValorRubroVariable = isVisibilidadCeldaVerFormValorRubroVariable;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenValorRubroVariable() {
		return isVisibilidadCeldaOrdenValorRubroVariable;
	}

	public void setIsVisibilidadCeldaOrdenValorRubroVariable(Boolean isVisibilidadCeldaOrdenValorRubroVariable) {
		this.isVisibilidadCeldaOrdenValorRubroVariable = isVisibilidadCeldaOrdenValorRubroVariable;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesValorRubroVariable() {
		return isVisibilidadCeldaNuevoRelacionesValorRubroVariable;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesValorRubroVariable(Boolean isVisibilidadCeldaNuevoRelacionesValorRubroVariable) {
		this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable = isVisibilidadCeldaNuevoRelacionesValorRubroVariable;
	}
	
	public Boolean getIsVisibilidadCeldaModificarValorRubroVariable() {
		return isVisibilidadCeldaModificarValorRubroVariable;
	}

	public void setIsVisibilidadCeldaModificarValorRubroVariable(Boolean isVisibilidadCeldaModificarValorRubroVariable) {
		this.isVisibilidadCeldaModificarValorRubroVariable = isVisibilidadCeldaModificarValorRubroVariable;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarValorRubroVariable() {
		return isVisibilidadCeldaActualizarValorRubroVariable;
	}

	public void setIsVisibilidadCeldaActualizarValorRubroVariable(Boolean isVisibilidadCeldaActualizarValorRubroVariable) {
		this.isVisibilidadCeldaActualizarValorRubroVariable = isVisibilidadCeldaActualizarValorRubroVariable;
	}

	public Boolean getIsVisibilidadCeldaEliminarValorRubroVariable() {
		return isVisibilidadCeldaEliminarValorRubroVariable;
	}

	public void setIsVisibilidadCeldaEliminarValorRubroVariable(Boolean isVisibilidadCeldaEliminarValorRubroVariable) {
		this.isVisibilidadCeldaEliminarValorRubroVariable = isVisibilidadCeldaEliminarValorRubroVariable;
	}

	public Boolean getIsVisibilidadCeldaCancelarValorRubroVariable() {
		return isVisibilidadCeldaCancelarValorRubroVariable;
	}

	public void setIsVisibilidadCeldaCancelarValorRubroVariable(Boolean isVisibilidadCeldaCancelarValorRubroVariable) {
		this.isVisibilidadCeldaCancelarValorRubroVariable = isVisibilidadCeldaCancelarValorRubroVariable;
	}

	public Boolean getIsVisibilidadCeldaGuardarValorRubroVariable() {
		return isVisibilidadCeldaGuardarValorRubroVariable;
	}

	public void setIsVisibilidadCeldaGuardarValorRubroVariable(Boolean isVisibilidadCeldaGuardarValorRubroVariable) {
		this.isVisibilidadCeldaGuardarValorRubroVariable = isVisibilidadCeldaGuardarValorRubroVariable;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosValorRubroVariable() {
		return isVisibilidadCeldaGuardarCambiosValorRubroVariable;
	}

	public void setIsVisibilidadCeldaGuardarCambiosValorRubroVariable(Boolean isVisibilidadCeldaGuardarCambiosValorRubroVariable) {
		this.isVisibilidadCeldaGuardarCambiosValorRubroVariable = isVisibilidadCeldaGuardarCambiosValorRubroVariable;
	}
		
	public ValorRubroVariableSessionBean getvalorrubrovariableSessionBean() {
		return this.valorrubrovariableSessionBean;
	}
	
	public void setvalorrubrovariableSessionBean(ValorRubroVariableSessionBean valorrubrovariableSessionBean) {
		this.valorrubrovariableSessionBean=valorrubrovariableSessionBean;
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

	public Boolean getisVisibilidadFK_IdRubroEmplea() {
		return this.isVisibilidadFK_IdRubroEmplea;
	}

	public void setisVisibilidadFK_IdRubroEmplea(Boolean isVisibilidadFK_IdRubroEmplea) {
		this.isVisibilidadFK_IdRubroEmplea=isVisibilidadFK_IdRubroEmplea;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(ValorRubroVariable valorrubrovariable)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(valorrubrovariable,null);
				this.setActualParaGuardarEmpleadoForeignKey(valorrubrovariable,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(valorrubrovariable,null);
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
	
	public void bugActualizarReferenciaActual(ValorRubroVariable valorrubrovariable,ValorRubroVariable valorrubrovariableAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalValorRubroVariable(valorrubrovariable);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		valorrubrovariableAux.setId(valorrubrovariable.getId());
		valorrubrovariableAux.setVersionRow(valorrubrovariable.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessValorRubroVariable();
		
			int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = valorrubrovariableValidator.getInvalidValues(this.valorrubrovariable);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			valorrubrovariableLogic.setDatosCliente(datosCliente);
			valorrubrovariableLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				valorrubrovariableAux=new  ValorRubroVariable();
				
				valorrubrovariableAux.setIsNew(true);
				valorrubrovariableAux.setIsChanged(true);
				
				valorrubrovariableAux.setValorRubroVariableOriginal(this.valorrubrovariable);
				
				valorrubrovariableAux.setId(this.valorrubrovariable.getId());	
				valorrubrovariableAux.setVersionRow(this.valorrubrovariable.getVersionRow());	
				valorrubrovariableAux.setid_empresa(this.valorrubrovariable.getid_empresa());	
				valorrubrovariableAux.setid_empleado(this.valorrubrovariable.getid_empleado());	
				valorrubrovariableAux.setid_rubro_emplea(this.valorrubrovariable.getid_rubro_emplea());	
				valorrubrovariableAux.setfecha(this.valorrubrovariable.getfecha());	
				valorrubrovariableAux.setvalor(this.valorrubrovariable.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.valorrubrovariableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(valorrubrovariableAux,valorrubrovariableLogic.getValorRubroVariables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(valorrubrovariableAux,valorrubrovariables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.valorrubrovariableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariableLogic.saveValorRubroVariables();//WithConnection
						//valorrubrovariableLogic.getSetVersionRowValorRubroVariables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.valorrubrovariable,valorrubrovariableAux);
					
					this.refrescarForeignKeysDescripcionesValorRubroVariable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								valorrubrovariableLogic.saveValorRubroVariableRelaciones(valorrubrovariableAux);//WithConnection
								//valorrubrovariableLogic.getSetVersionRowValorRubroVariables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.valorrubrovariable,valorrubrovariableAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.valorrubrovariableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(valorrubrovariableAux,valorrubrovariableLogic.getValorRubroVariables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(valorrubrovariableAux,valorrubrovariables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.valorrubrovariable,valorrubrovariableAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				valorrubrovariableAux=new  ValorRubroVariable();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado() 
					|| (this.valorrubrovariableSessionBean.getEsGuardarRelacionado() && this.valorrubrovariable.getId()>=0)) {
						
					valorrubrovariableAux.setIsNew(false);
				}
				
				valorrubrovariableAux.setIsDeleted(false);
			
				valorrubrovariableAux.setId(this.valorrubrovariable.getId());	
				valorrubrovariableAux.setVersionRow(this.valorrubrovariable.getVersionRow());	
				valorrubrovariableAux.setid_empresa(this.valorrubrovariable.getid_empresa());	
				valorrubrovariableAux.setid_empleado(this.valorrubrovariable.getid_empleado());	
				valorrubrovariableAux.setid_rubro_emplea(this.valorrubrovariable.getid_rubro_emplea());	
				valorrubrovariableAux.setfecha(this.valorrubrovariable.getfecha());	
				valorrubrovariableAux.setvalor(this.valorrubrovariable.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(valorrubrovariableAux,valorrubrovariableLogic.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(valorrubrovariableAux,valorrubrovariables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.valorrubrovariableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariableLogic.saveValorRubroVariables();//WithConnection
						//valorrubrovariableLogic.getSetVersionRowValorRubroVariables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.valorrubrovariable,valorrubrovariableAux);
					
					this.refrescarForeignKeysDescripcionesValorRubroVariable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								valorrubrovariableLogic.saveValorRubroVariableRelaciones(valorrubrovariableAux);//WithConnection
								//valorrubrovariableLogic.getSetVersionRowValorRubroVariables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.valorrubrovariable,valorrubrovariableAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.valorrubrovariableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(valorrubrovariableAux,valorrubrovariableLogic.getValorRubroVariables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(valorrubrovariableAux,valorrubrovariables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.valorrubrovariable,valorrubrovariableAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				valorrubrovariableAux=new  ValorRubroVariable();
				
				valorrubrovariableAux.setIsNew(false);
				valorrubrovariableAux.setIsChanged(false);
				
				valorrubrovariableAux.setIsDeleted(true);
				
				valorrubrovariableAux.setId(this.valorrubrovariable.getId());	
				valorrubrovariableAux.setVersionRow(this.valorrubrovariable.getVersionRow());	
				valorrubrovariableAux.setid_empresa(this.valorrubrovariable.getid_empresa());	
				valorrubrovariableAux.setid_empleado(this.valorrubrovariable.getid_empleado());	
				valorrubrovariableAux.setid_rubro_emplea(this.valorrubrovariable.getid_rubro_emplea());	
				valorrubrovariableAux.setfecha(this.valorrubrovariable.getfecha());	
				valorrubrovariableAux.setvalor(this.valorrubrovariable.getvalor());	
				
				if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.valorrubrovariableAux.getId()>=0) {	
						this.valorrubrovariablesEliminados.add(valorrubrovariableAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(valorrubrovariableAux,valorrubrovariableLogic.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(valorrubrovariableAux,valorrubrovariables);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.valorrubrovariableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariableLogic.saveValorRubroVariables();//WithConnection
						//valorrubrovariableLogic.getSetVersionRowValorRubroVariables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								valorrubrovariableLogic.saveValorRubroVariableRelaciones(valorrubrovariableAux);//WithConnection
								//valorrubrovariableLogic.getSetVersionRowValorRubroVariables();//WithConnection
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
							if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones() 
								|| this.valorrubrovariableSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(valorrubrovariableAux,valorrubrovariableLogic.getValorRubroVariables());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(valorrubrovariableAux,valorrubrovariables);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.getValorRubroVariables().addAll(this.valorrubrovariablesEliminados);
					
					valorrubrovariableLogic.saveValorRubroVariables();//WithConnection
					//valorrubrovariableLogic.getSetVersionRowValorRubroVariables();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesValorRubroVariable();
				
				this.valorrubrovariablesEliminados= new ArrayList<ValorRubroVariable>();		
			}
			
			if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Valor Rubro Variable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.valorrubrovariable=valorrubrovariableAux;
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
      		//this.finishProcessValorRubroVariable();
      	}
		
	}	
	
	public void actualizarRelaciones(ValorRubroVariable valorrubrovariableLocal) throws Exception {
		
		if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ValorRubroVariable valorrubrovariableLocal) throws Exception {	
		if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				valorrubrovariableLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				valorrubrovariableLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				valorrubrovariableLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarValorRubroVariableActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = valorrubrovariableValidator.getInvalidValues(this.valorrubrovariable);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ValorRubroVariable valorrubrovariable,List<ValorRubroVariable> valorrubrovariables) throws Exception {
		try	{		
			ValorRubroVariableConstantesFunciones.actualizarLista(valorrubrovariable,valorrubrovariables,this.valorrubrovariableSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ValorRubroVariable valorrubrovariable,List<ValorRubroVariable> valorrubrovariables) throws Exception {
		try	{			
			ValorRubroVariableConstantesFunciones.actualizarSelectedLista(valorrubrovariable,valorrubrovariables);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ValorRubroVariable> valorrubrovariablesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				valorrubrovariablesLocal=this.valorrubrovariableLogic.getValorRubroVariables();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				valorrubrovariablesLocal=this.valorrubrovariables;
			}
			//ARCHITECTURE
		
			for(ValorRubroVariable valorrubrovariableLocal:valorrubrovariablesLocal) {
				if(this.permiteMantenimiento(valorrubrovariableLocal) && valorrubrovariableLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ValorRubroVariableConstantesFunciones.getValorRubroVariableLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ValorRubroVariableConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorRubroVariable.jLabelid_empresaValorRubroVariable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ValorRubroVariableConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorRubroVariable.jLabelid_empleadoValorRubroVariable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ValorRubroVariableConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorRubroVariable.jLabelid_rubro_empleaValorRubroVariable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ValorRubroVariableConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorRubroVariable.jLabelfechaValorRubroVariable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ValorRubroVariableConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorRubroVariable.jLabelvalorValorRubroVariable,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormValorRubroVariable.jLabelid_empresaValorRubroVariable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormValorRubroVariable.jLabelid_empleadoValorRubroVariable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormValorRubroVariable.jLabelid_rubro_empleaValorRubroVariable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormValorRubroVariable.jLabelfechaValorRubroVariable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormValorRubroVariable.jLabelvalorValorRubroVariable,"");
		
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
		this.iIdNuevoValorRubroVariable--;	
		
		
		this.valorrubrovariableAux=new ValorRubroVariable();
		
		this.valorrubrovariableAux.setId(this.iIdNuevoValorRubroVariable);
		this.valorrubrovariableAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.valorrubrovariableLogic.getValorRubroVariables().add(this.valorrubrovariableAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.valorrubrovariables.add(this.valorrubrovariableAux);
		}
		//ARCHITECTURE
		
		this.valorrubrovariable=this.valorrubrovariableAux;
		
		if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioValorRubroVariable(this.valorrubrovariable);
			this.setVariablesObjetoActualToFormularioForeignKeyValorRubroVariable(this.valorrubrovariable);
		}
				
		//this.setDefaultControlesValorRubroVariable();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyValorRubroVariable();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyValorRubroVariable();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyValorRubroVariable();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualValorRubroVariable(this.valorrubrovariableBean,this.valorrubrovariable,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ValorRubroVariableConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
			classes=ValorRubroVariableConstantesFunciones.getClassesRelationshipsOfValorRubroVariable(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.valorrubrovariableReturnGeneral=valorrubrovariableLogic.procesarEventosValorRubroVariablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.valorrubrovariableLogic.getValorRubroVariables(),this.valorrubrovariable,this.valorrubrovariableParameterGeneral,this.isEsNuevoValorRubroVariable,classes);//this.valorrubrovariableLogic.getValorRubroVariable()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanValorRubroVariable(this.valorrubrovariableReturnGeneral,this.valorrubrovariableBean,false);
		
		if(this.valorrubrovariableReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyValorRubroVariable(this.valorrubrovariableReturnGeneral.getValorRubroVariable());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioValorRubroVariable(this.valorrubrovariableReturnGeneral.getValorRubroVariable());
		}
		
		if(this.valorrubrovariableReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioValorRubroVariable(this.valorrubrovariableReturnGeneral.getValorRubroVariable(),classes);//this.valorrubrovariableBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyValorRubroVariable();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyValorRubroVariable();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.RecargarFormValorRubroVariable(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingValorRubroVariable(false);
						
			if(valorrubrovariableSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualValorRubroVariable();
			}
			
			this.actualizarVisualTableDatosValorRubroVariable();
			
			this.jTableDatosValorRubroVariable.setRowSelectionInterval(this.getIndiceNuevoValorRubroVariable(), this.getIndiceNuevoValorRubroVariable());
			
			this.seleccionarFilaTablaValorRubroVariableActual();
						
			this.actualizarEstadoCeldasBotonesValorRubroVariable("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesValorRubroVariable(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormValorRubroVariable.jDateChooserfechaValorRubroVariable.setEnabled(isHabilitar && this.valorrubrovariableConstantesFunciones.activarfechaValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jTextFieldvalorValorRubroVariable.setEnabled(isHabilitar && this.valorrubrovariableConstantesFunciones.activarvalorValorRubroVariable);	
		//
		this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setEnabled(isHabilitar && this.valorrubrovariableConstantesFunciones.activarid_empresaValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setEnabled(isHabilitar && this.valorrubrovariableConstantesFunciones.activarid_empleadoValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setEnabled(isHabilitar && this.valorrubrovariableConstantesFunciones.activarid_rubro_empleaValorRubroVariable);
	};
	
	public void setDefaultControlesValorRubroVariable() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoValorRubroVariable(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.valorrubrovariableSessionBean.setConGuardarRelaciones(true);			
			this.valorrubrovariableSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.setVisible(true);
			
					
		} else {
			//this.valorrubrovariableSessionBean.setConGuardarRelaciones(false);			
			this.valorrubrovariableSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoValorRubroVariable() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
				if(valorrubrovariableAux.getId().equals(this.iIdNuevoValorRubroVariable)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariables) {
				if(valorrubrovariableAux.getId().equals(this.iIdNuevoValorRubroVariable)) {
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
	
	public int getIndiceActualValorRubroVariable(ValorRubroVariable valorrubrovariable,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
				if(valorrubrovariableAux.getId().equals(valorrubrovariable.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariables) {
				if(valorrubrovariableAux.getId().equals(valorrubrovariable.getId())) {
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
	
	public void setCamposBaseDesdeOriginalValorRubroVariable(ValorRubroVariable valorrubrovariableOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
				if(valorrubrovariableAux.getValorRubroVariableOriginal().getId().equals(valorrubrovariableOriginal.getId())) {
					existe=true;
					valorrubrovariableOriginal.setId(valorrubrovariableAux.getId());
					valorrubrovariableOriginal.setVersionRow(valorrubrovariableAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariables) {
				if(valorrubrovariableAux.getValorRubroVariableOriginal().getId().equals(valorrubrovariableOriginal.getId())) {
					existe=true;
					valorrubrovariableOriginal.setId(valorrubrovariableAux.getId());
					valorrubrovariableOriginal.setVersionRow(valorrubrovariableAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosValorRubroVariable(Boolean esParaCancelar) throws Exception {
		valorrubrovariablesAux=new ArrayList<ValorRubroVariable>();
		valorrubrovariableAux=new ValorRubroVariable();
		
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
					if(valorrubrovariableAux.getId()<0) {
						valorrubrovariablesAux.add(valorrubrovariableAux);
					}		
				}
				this.iIdNuevoValorRubroVariable=0L;
				this.valorrubrovariableLogic.getValorRubroVariables().removeAll(valorrubrovariablesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariables) {
					if(valorrubrovariableAux.getId()<0) {
						valorrubrovariablesAux.add(valorrubrovariableAux);
					}		
				}
				this.iIdNuevoValorRubroVariable=0L;
				this.valorrubrovariables.removeAll(valorrubrovariablesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoValorRubroVariable 
					&& this.valorrubrovariableLogic.getValorRubroVariables().size()>0
					) {
					valorrubrovariableAux=this.valorrubrovariableLogic.getValorRubroVariables().get(this.valorrubrovariableLogic.getValorRubroVariables().size() - 1);
				
					if(valorrubrovariableAux.getId()<0) {
						this.valorrubrovariableLogic.getValorRubroVariables().remove(valorrubrovariableAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoValorRubroVariable && this.valorrubrovariables.size()>0) {
					valorrubrovariableAux=this.valorrubrovariables.get(this.valorrubrovariables.size() - 1);
				
					if(valorrubrovariableAux.getId()<0) {
						this.valorrubrovariables.remove(valorrubrovariableAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoValorRubroVariable(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(valorrubrovariable.getId()<0) {
				this.valorrubrovariableLogic.getValorRubroVariables().remove(this.valorrubrovariable);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(valorrubrovariable.getId()<0) {
				this.valorrubrovariables.remove(this.valorrubrovariable);
			}
		}			
	}
	
	public void setEstadosInicialesValorRubroVariable(List<ValorRubroVariable> valorrubrovariablesAux) throws Exception {
		ValorRubroVariableConstantesFunciones.setEstadosInicialesValorRubroVariable(valorrubrovariablesAux);
	}
	
	public void setEstadosInicialesValorRubroVariable(ValorRubroVariable valorrubrovariableAux) throws Exception {
		ValorRubroVariableConstantesFunciones.setEstadosInicialesValorRubroVariable(valorrubrovariableAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarValorRubroVariableActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesValorRubroVariable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarValorRubroVariableActual()) {
				if(!this.isEsNuevoValorRubroVariable) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesValorRubroVariable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoValorRubroVariable=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarValorRubroVariableActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Valor Rubro Variable ?", "MANTENIMIENTO DE Valor Rubro Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesValorRubroVariable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ValorRubroVariable valorrubrovariable) throws Exception {
		ValorRubroVariableConstantesFunciones.seleccionarAsignar(this.valorrubrovariable,valorrubrovariable);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarValorRubroVariable=this.isPermisoActualizarOriginalValorRubroVariable;
			
			
			this.seleccionarAsignar(valorrubrovariable);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ValorRubroVariableConstantesFunciones.quitarEspaciosValorRubroVariable(this.valorrubrovariable,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesValorRubroVariable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.valorrubrovariableSessionBean.setsFuncionBusquedaRapida(this.valorrubrovariableSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoValorRubroVariable) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosValorRubroVariable(esParaCancelar);				
				this.cancelarNuevoValorRubroVariable(esParaCancelar);								
			}
			
			this.valorrubrovariable=new ValorRubroVariable();
			
			this.inicializarValorRubroVariable();
			
			this.actualizarEstadoCeldasBotonesValorRubroVariable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarValorRubroVariable() throws Exception {
		try {
			ValorRubroVariableConstantesFunciones.inicializarValorRubroVariable(this.valorrubrovariable);
			
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
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.valorrubrovariableLogic.getValorRubroVariables().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteValorRubroVariables(String sAccionBusqueda,List<ValorRubroVariable> valorrubrovariablesParaReportes) throws Exception {
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
					sPathReporteFinal="ValorRubroVariable"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ValorRubroVariableMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ValorRubroVariableMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ValorRubroVariable"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Valor Rubro Variables");		
		parameters.put("busquedapor", ValorRubroVariableConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceValorRubroVariable=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ValorRubroVariableConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ValorRubroVariableConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceValorRubroVariable=new JRBeanArrayDataSource(ValorRubroVariableJInternalFrame.TraerValorRubroVariableBeans(valorrubrovariablesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceValorRubroVariable);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ValorRubroVariableConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ValorRubroVariableConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ValorRubroVariableBean.TraerValorRubroVariableBeans(valorrubrovariablesParaReportes).toArray()));
							
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
				this.generarExcelReporteValorRubroVariables(sAccionBusqueda,sTipoArchivoReporte,valorrubrovariablesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalValorRubroVariables(sAccionBusqueda,sTipoArchivoReporte,valorrubrovariablesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoValorRubroVariableActionPerformed(null);
					//this.generarExcelReporteValorRubroVariables(sAccionBusqueda,sTipoArchivoReporte,valorrubrovariablesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalValorRubroVariables(sAccionBusqueda,sTipoArchivoReporte,valorrubrovariablesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesValorRubroVariables(sAccionBusqueda,sTipoArchivoReporte,valorrubrovariablesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesValorRubroVariables(sAccionBusqueda,sTipoArchivoReporte,valorrubrovariablesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteValorRubroVariables(String sAccionBusqueda,String sTipoArchivoReporte,List<ValorRubroVariable> valorrubrovariablesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorrubrovariable";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ValorRubroVariables");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderValorRubroVariable("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ValorRubroVariable valorrubrovariable : valorrubrovariablesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ValorRubroVariableConstantesFunciones.generarExcelReporteDataValorRubroVariable("NORMAL",row,workbook,valorrubrovariable,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderValorRubroVariable(String sTipo,Row row,Workbook workbook) {
		
		ValorRubroVariableConstantesFunciones.generarExcelReporteHeaderValorRubroVariable(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalValorRubroVariables(String sAccionBusqueda,String sTipoArchivoReporte,List<ValorRubroVariable> valorrubrovariablesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorrubrovariable_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ValorRubroVariables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ValorRubroVariable valorrubrovariable : valorrubrovariablesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ValorRubroVariableConstantesFunciones.getValorRubroVariableDescripcion(valorrubrovariable));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(valorrubrovariable.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(valorrubrovariable.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(valorrubrovariable.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ValorRubroVariableConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(valorrubrovariable.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ValorRubroVariableConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(valorrubrovariable.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesValorRubroVariables(String sAccionBusqueda,String sTipoArchivoReporte,List<ValorRubroVariable> valorrubrovariablesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ValorRubroVariable> valorrubrovariablesRespaldo=null;
		
		classes=ValorRubroVariableConstantesFunciones.getClassesRelationshipsOfValorRubroVariable(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.valorrubrovariableLogic.setDatosCliente(this.datosCliente);
		this.valorrubrovariableLogic.setDatosDeep(this.datosDeep);
		this.valorrubrovariableLogic.setIsConDeep(true);
		
		valorrubrovariablesRespaldo=this.valorrubrovariableLogic.getValorRubroVariables();
		
		this.valorrubrovariableLogic.setValorRubroVariables(valorrubrovariablesParaReportes);	
		this.valorrubrovariableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		valorrubrovariablesParaReportes=this.valorrubrovariableLogic.getValorRubroVariables();
		this.valorrubrovariableLogic.setValorRubroVariables(valorrubrovariablesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorrubrovariable_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ValorRubroVariables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderValorRubroVariable("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ValorRubroVariable valorrubrovariable : valorrubrovariablesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderValorRubroVariable("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ValorRubroVariableConstantesFunciones.generarExcelReporteDataValorRubroVariable("NORMAL",row,workbook,valorrubrovariable,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ValorRubroVariableConstantesFunciones.getValorRubroVariableDescripcion(valorrubrovariable));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoValorRubroVariable.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessValorRubroVariable() throws Exception {		
		this.startProcessValorRubroVariable(true);
	}
	
	public void startProcessValorRubroVariable(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasValorRubroVariable ,this.jPanelParametrosReportesValorRubroVariable, this.jScrollPanelDatosValorRubroVariable,this.jPanelPaginacionValorRubroVariable, this.jScrollPanelDatosEdicionValorRubroVariable, this.jPanelAccionesValorRubroVariable,this.jPanelAccionesFormularioValorRubroVariable,this.jmenuBarValorRubroVariable,this.jmenuBarDetalleValorRubroVariable,this.jTtoolBarValorRubroVariable,this.jTtoolBarDetalleValorRubroVariable);		
		
		final JTabbedPane jTabbedPaneBusquedasValorRubroVariable=this.jTabbedPaneBusquedasValorRubroVariable; 
		
		final JPanel jPanelParametrosReportesValorRubroVariable=this.jPanelParametrosReportesValorRubroVariable;
		//final JScrollPane jScrollPanelDatosValorRubroVariable=this.jScrollPanelDatosValorRubroVariable;
		final JTable jTableDatosValorRubroVariable=this.jTableDatosValorRubroVariable;		
		final JPanel jPanelPaginacionValorRubroVariable=this.jPanelPaginacionValorRubroVariable;
		//final JScrollPane jScrollPanelDatosEdicionValorRubroVariable=this.jScrollPanelDatosEdicionValorRubroVariable;
		final JPanel jPanelAccionesValorRubroVariable=this.jPanelAccionesValorRubroVariable;
		
		JPanel jPanelCamposAuxiliarValorRubroVariable=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarValorRubroVariable=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			jPanelCamposAuxiliarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jPanelCamposValorRubroVariable;
			jPanelAccionesFormularioAuxiliarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jPanelAccionesFormularioValorRubroVariable;
		}
		
		final JPanel jPanelCamposValorRubroVariable=jPanelCamposAuxiliarValorRubroVariable;
		final JPanel jPanelAccionesFormularioValorRubroVariable=jPanelAccionesFormularioAuxiliarValorRubroVariable;
		
		
		final JMenuBar jmenuBarValorRubroVariable=this.jmenuBarValorRubroVariable;
		final JToolBar jTtoolBarValorRubroVariable=this.jTtoolBarValorRubroVariable;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarValorRubroVariable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarValorRubroVariable=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			jmenuBarDetalleAuxiliarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jmenuBarDetalleValorRubroVariable;
			jTtoolBarDetalleAuxiliarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jTtoolBarDetalleValorRubroVariable;
		}
		
		final JMenuBar jmenuBarDetalleValorRubroVariable=jmenuBarDetalleAuxiliarValorRubroVariable;
		final JToolBar jTtoolBarDetalleValorRubroVariable=jTtoolBarDetalleAuxiliarValorRubroVariable;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasValorRubroVariable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesValorRubroVariable;
			processRunnable.jTableDatos=jTableDatosValorRubroVariable;
			processRunnable.jPanelCampos=jPanelCamposValorRubroVariable;
			processRunnable.jPanelPaginacion=jPanelPaginacionValorRubroVariable;
			processRunnable.jPanelAcciones=jPanelAccionesValorRubroVariable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioValorRubroVariable;
			
			
			processRunnable.jmenuBar=jmenuBarValorRubroVariable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleValorRubroVariable;
			processRunnable.jTtoolBar=jTtoolBarValorRubroVariable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleValorRubroVariable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasValorRubroVariable ,jPanelParametrosReportesValorRubroVariable,jTableDatosValorRubroVariable, /*jScrollPanelDatosValorRubroVariable,*/jPanelCamposValorRubroVariable,jPanelPaginacionValorRubroVariable, /*jScrollPanelDatosEdicionValorRubroVariable,*/ jPanelAccionesValorRubroVariable,jPanelAccionesFormularioValorRubroVariable,jmenuBarValorRubroVariable,jmenuBarDetalleValorRubroVariable,jTtoolBarValorRubroVariable,jTtoolBarDetalleValorRubroVariable);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasValorRubroVariable ,jPanelParametrosReportesValorRubroVariable, jScrollPanelDatosValorRubroVariable,jPanelPaginacionValorRubroVariable, jScrollPanelDatosEdicionValorRubroVariable, jPanelAccionesValorRubroVariable,jPanelAccionesFormularioValorRubroVariable,jmenuBarValorRubroVariable,jmenuBarDetalleValorRubroVariable,jTtoolBarValorRubroVariable,jTtoolBarDetalleValorRubroVariable);
						
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
	
	public void finishProcessValorRubroVariable() {// throws Exception 
		this.finishProcessValorRubroVariable(true);
	}
	
	public void finishProcessValorRubroVariable(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasValorRubroVariable ,this.jPanelParametrosReportesValorRubroVariable, this.jScrollPanelDatosValorRubroVariable,this.jPanelPaginacionValorRubroVariable, this.jScrollPanelDatosEdicionValorRubroVariable, this.jPanelAccionesValorRubroVariable,this.jPanelAccionesFormularioValorRubroVariable,this.jmenuBarValorRubroVariable,this.jmenuBarDetalleValorRubroVariable,this.jTtoolBarValorRubroVariable,this.jTtoolBarDetalleValorRubroVariable);		
		
		final JTabbedPane jTabbedPaneBusquedasValorRubroVariable=this.jTabbedPaneBusquedasValorRubroVariable; 
		
		final JPanel jPanelParametrosReportesValorRubroVariable=this.jPanelParametrosReportesValorRubroVariable;
		//final JScrollPane jScrollPanelDatosValorRubroVariable=this.jScrollPanelDatosValorRubroVariable;
		final JTable jTableDatosValorRubroVariable=this.jTableDatosValorRubroVariable;		
		final JPanel jPanelPaginacionValorRubroVariable=this.jPanelPaginacionValorRubroVariable;
		//final JScrollPane jScrollPanelDatosEdicionValorRubroVariable=this.jScrollPanelDatosEdicionValorRubroVariable;
		final JPanel jPanelAccionesValorRubroVariable=this.jPanelAccionesValorRubroVariable;
		
		JPanel jPanelCamposAuxiliarValorRubroVariable=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarValorRubroVariable=new JPanel();
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			jPanelCamposAuxiliarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jPanelCamposValorRubroVariable;
			jPanelAccionesFormularioAuxiliarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jPanelAccionesFormularioValorRubroVariable;
		}
		
		final JPanel jPanelCamposValorRubroVariable=jPanelCamposAuxiliarValorRubroVariable;
		final JPanel jPanelAccionesFormularioValorRubroVariable=jPanelAccionesFormularioAuxiliarValorRubroVariable;
		
		
		final JMenuBar jmenuBarValorRubroVariable=this.jmenuBarValorRubroVariable;		
		final JToolBar jTtoolBarValorRubroVariable=this.jTtoolBarValorRubroVariable;
				
		JMenuBar jmenuBarDetalleAuxiliarValorRubroVariable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarValorRubroVariable=new JToolBar();
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			jmenuBarDetalleAuxiliarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jmenuBarDetalleValorRubroVariable;
			jTtoolBarDetalleAuxiliarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jTtoolBarDetalleValorRubroVariable;		
		}
		
		final JMenuBar jmenuBarDetalleValorRubroVariable=jmenuBarDetalleAuxiliarValorRubroVariable;
		final JToolBar jTtoolBarDetalleValorRubroVariable=jTtoolBarDetalleAuxiliarValorRubroVariable;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasValorRubroVariable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesValorRubroVariable;
			processRunnable.jTableDatos=jTableDatosValorRubroVariable;
			processRunnable.jPanelCampos=jPanelCamposValorRubroVariable;
			processRunnable.jPanelPaginacion=jPanelPaginacionValorRubroVariable;
			processRunnable.jPanelAcciones=jPanelAccionesValorRubroVariable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioValorRubroVariable;
			
			
			processRunnable.jmenuBar=jmenuBarValorRubroVariable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleValorRubroVariable;
			processRunnable.jTtoolBar=jTtoolBarValorRubroVariable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleValorRubroVariable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasValorRubroVariable ,jPanelParametrosReportesValorRubroVariable, jTableDatosValorRubroVariable,/*jScrollPanelDatosValorRubroVariable,*/jPanelCamposValorRubroVariable,jPanelPaginacionValorRubroVariable, /*jScrollPanelDatosEdicionValorRubroVariable,*/ jPanelAccionesValorRubroVariable,jPanelAccionesFormularioValorRubroVariable,jmenuBarValorRubroVariable,jmenuBarDetalleValorRubroVariable,jTtoolBarValorRubroVariable,jTtoolBarDetalleValorRubroVariable));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesValorRubroVariable(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarValorRubroVariable(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuValorRubroVariable(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarValorRubroVariable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarValorRubroVariable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleValorRubroVariable,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuValorRubroVariable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarValorRubroVariable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleValorRubroVariable,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.valorrubrovariableConstantesFunciones.getsFinalQueryValorRubroVariable();
		String  finalQueryPaginacionTodos=this.valorrubrovariableConstantesFunciones.getsFinalQueryValorRubroVariable();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ValorRubroVariableConstantesFunciones.getArrayColumnasGlobalesNoValorRubroVariable(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ValorRubroVariableConstantesFunciones.getArrayColumnasGlobalesValorRubroVariable(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ValorRubroVariableConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.valorrubrovariablesEliminados= new ArrayList<ValorRubroVariable>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessValorRubroVariable();
		
				///*ValorRubroVariableSessionBean*/this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
			
			if(this.valorrubrovariableSessionBean==null) {
				this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
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
					this.iNumeroPaginacion=ValorRubroVariableConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ValorRubroVariableConstantesFunciones.getClassesForeignKeysOfValorRubroVariable(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/valorrubrovariable."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			valorrubrovariablesAux= new ArrayList<ValorRubroVariable>();
			
				
			valorrubrovariableLogic.setDatosCliente(this.datosCliente);
			valorrubrovariableLogic.setDatosDeep(this.datosDeep);
			valorrubrovariableLogic.setIsConDeep(true);
			
			
			valorrubrovariableLogic.getValorRubroVariableDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					valorrubrovariableLogic.getTodosValorRubroVariables(finalQueryGlobal,pagination);
					
					//valorrubrovariableLogic.getTodosValorRubroVariablesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(valorrubrovariableLogic.getValorRubroVariables()==null|| valorrubrovariableLogic.getValorRubroVariables().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							valorrubrovariablesAux= new ArrayList<ValorRubroVariable>();
							valorrubrovariablesAux.addAll(valorrubrovariableLogic.getValorRubroVariables());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariablesAux= new ArrayList<ValorRubroVariable>();
							valorrubrovariablesAux.addAll(valorrubrovariables);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							valorrubrovariableLogic.getTodosValorRubroVariables(finalQueryGlobal+"",this.pagination);												
							
							//valorrubrovariableLogic.getTodosValorRubroVariablesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteValorRubroVariables("Todos",valorrubrovariableLogic.getValorRubroVariables() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							valorrubrovariableLogic.setValorRubroVariables(new ArrayList<ValorRubroVariable>());					
							valorrubrovariableLogic.getValorRubroVariables().addAll(valorrubrovariablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariables=new ArrayList<ValorRubroVariable>();
							valorrubrovariables.addAll(valorrubrovariablesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idValorRubroVariable=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idValorRubroVariable=this.idActual;
				
				} else if(this.idValorRubroVariableActual!=null && this.idValorRubroVariableActual!=0L) {
					idValorRubroVariable=idValorRubroVariableActual;
				}
				
					
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndicePorId(idValorRubroVariable);
				
				this.valorrubrovariables=new ArrayList<ValorRubroVariable>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					valorrubrovariableLogic.getEntity(idValorRubroVariable);
					
					//valorrubrovariableLogic.getEntityWithConnection(idValorRubroVariable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorrubrovariableLogic.setValorRubroVariables(new ArrayList<ValorRubroVariable>());
					valorrubrovariableLogic.getValorRubroVariables().add(valorrubrovariableLogic.getValorRubroVariable());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorrubrovariables=new ArrayList<ValorRubroVariable>();
					this.valorrubrovariables.add(valorrubrovariable);
				}
				
				if(valorrubrovariableLogic.getValorRubroVariable()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					valorrubrovariableLogic.getValorRubroVariablesFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=valorrubrovariableLogic.getValorRubroVariables()==null||valorrubrovariableLogic.getValorRubroVariables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=valorrubrovariables==null|| valorrubrovariables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariablesAux=new ArrayList<ValorRubroVariable>();
						valorrubrovariablesAux.addAll(valorrubrovariableLogic.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariablesAux=new ArrayList<ValorRubroVariable>();
							valorrubrovariablesAux.addAll(valorrubrovariables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							valorrubrovariableLogic.getValorRubroVariablesFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteValorRubroVariables("FK_IdEmpleado",valorrubrovariableLogic.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteValorRubroVariables("FK_IdEmpleado",valorrubrovariables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariableLogic.setValorRubroVariables(new ArrayList<ValorRubroVariable>());
						valorrubrovariableLogic.getValorRubroVariables().addAll(valorrubrovariablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariables=new ArrayList<ValorRubroVariable>();
							valorrubrovariables.addAll(valorrubrovariablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					valorrubrovariableLogic.getValorRubroVariablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=valorrubrovariableLogic.getValorRubroVariables()==null||valorrubrovariableLogic.getValorRubroVariables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=valorrubrovariables==null|| valorrubrovariables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariablesAux=new ArrayList<ValorRubroVariable>();
						valorrubrovariablesAux.addAll(valorrubrovariableLogic.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariablesAux=new ArrayList<ValorRubroVariable>();
							valorrubrovariablesAux.addAll(valorrubrovariables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							valorrubrovariableLogic.getValorRubroVariablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteValorRubroVariables("FK_IdEmpresa",valorrubrovariableLogic.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteValorRubroVariables("FK_IdEmpresa",valorrubrovariables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariableLogic.setValorRubroVariables(new ArrayList<ValorRubroVariable>());
						valorrubrovariableLogic.getValorRubroVariables().addAll(valorrubrovariablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariables=new ArrayList<ValorRubroVariable>();
							valorrubrovariables.addAll(valorrubrovariablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRubroEmplea")) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					valorrubrovariableLogic.getValorRubroVariablesFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=valorrubrovariableLogic.getValorRubroVariables()==null||valorrubrovariableLogic.getValorRubroVariables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=valorrubrovariables==null|| valorrubrovariables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariablesAux=new ArrayList<ValorRubroVariable>();
						valorrubrovariablesAux.addAll(valorrubrovariableLogic.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariablesAux=new ArrayList<ValorRubroVariable>();
							valorrubrovariablesAux.addAll(valorrubrovariables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							valorrubrovariableLogic.getValorRubroVariablesFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ValorRubroVariableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteValorRubroVariables("FK_IdRubroEmplea",valorrubrovariableLogic.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteValorRubroVariables("FK_IdRubroEmplea",valorrubrovariables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariableLogic.setValorRubroVariables(new ArrayList<ValorRubroVariable>());
						valorrubrovariableLogic.getValorRubroVariables().addAll(valorrubrovariablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariables=new ArrayList<ValorRubroVariable>();
							valorrubrovariables.addAll(valorrubrovariablesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesValorRubroVariable();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessValorRubroVariable();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=valorrubrovariableLogic.getValorRubroVariables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=valorrubrovariables.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=valorrubrovariableLogic.getValorRubroVariables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=valorrubrovariables.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ValorRubroVariable valorrubrovariable) {
		Boolean permite=true;
		
		if(this.valorrubrovariable.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ValorRubroVariableConstantesFunciones.getOrderByListaValorRubroVariable();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ValorRubroVariableConstantesFunciones.getOrderByListaValorRubroVariable();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorRubroVariable valorrubrovariable:valorrubrovariableLogic.getValorRubroVariables()) {
				if(valorrubrovariable.getsType().equals(Constantes2.S_TOTALES)) {
					valorrubrovariableTotales=valorrubrovariable;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorRubroVariable valorrubrovariable:this.valorrubrovariables) {
				if(valorrubrovariable.getsType().equals(Constantes2.S_TOTALES)) {
					valorrubrovariableTotales=valorrubrovariable;
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
			this.valorrubrovariableAux=new ValorRubroVariable();
			this.valorrubrovariableAux.setsType(Constantes2.S_TOTALES);
			this.valorrubrovariableAux.setIsNew(false);
			this.valorrubrovariableAux.setIsChanged(false);
			this.valorrubrovariableAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ValorRubroVariableConstantesFunciones.TotalizarValoresFilaValorRubroVariable(this.valorrubrovariableLogic.getValorRubroVariables(),this.valorrubrovariableAux);
				
				this.valorrubrovariableLogic.getValorRubroVariables().add(this.valorrubrovariableAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ValorRubroVariableConstantesFunciones.TotalizarValoresFilaValorRubroVariable(this.valorrubrovariables,this.valorrubrovariableAux);
				
				this.valorrubrovariables.add(this.valorrubrovariableAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		valorrubrovariableTotales=new ValorRubroVariable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.valorrubrovariableLogic.getValorRubroVariables().remove(valorrubrovariableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.valorrubrovariables.remove(valorrubrovariableTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		valorrubrovariableTotales=new ValorRubroVariable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ValorRubroVariable valorrubrovariable:valorrubrovariableLogic.getValorRubroVariables()) {
				if(valorrubrovariable.getsType().equals(Constantes2.S_TOTALES)) {
					valorrubrovariableTotales=valorrubrovariable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ValorRubroVariableConstantesFunciones.TotalizarValoresFilaValorRubroVariable(this.valorrubrovariableLogic.getValorRubroVariables(),valorrubrovariableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ValorRubroVariable valorrubrovariable:this.valorrubrovariables) {
				if(valorrubrovariable.getsType().equals(Constantes2.S_TOTALES)) {
					valorrubrovariableTotales=valorrubrovariable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ValorRubroVariableConstantesFunciones.TotalizarValoresFilaValorRubroVariable(this.valorrubrovariables,valorrubrovariableTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getValorRubroVariablesFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getValorRubroVariablesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getValorRubroVariablesFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getValorRubroVariablesFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorrubrovariableLogic.getValorRubroVariablesFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getValorRubroVariablesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorrubrovariableLogic.getValorRubroVariablesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getValorRubroVariablesFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorrubrovariableLogic.getValorRubroVariablesFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
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
	
	public void inicializarPermisosValorRubroVariable() {
		this.isPermisoTodoValorRubroVariable=false;
		this.isPermisoNuevoValorRubroVariable=false;
		this.isPermisoActualizarValorRubroVariable=false;
		this.isPermisoActualizarOriginalValorRubroVariable=false;
		this.isPermisoEliminarValorRubroVariable=false;
		this.isPermisoGuardarCambiosValorRubroVariable=false;
		this.isPermisoConsultaValorRubroVariable=false;
		this.isPermisoBusquedaValorRubroVariable=false;
		this.isPermisoReporteValorRubroVariable=false;		
		this.isPermisoOrdenValorRubroVariable=false;		
		this.isPermisoPaginacionMedioValorRubroVariable=false;		
		this.isPermisoPaginacionAltoValorRubroVariable=false;
		this.isPermisoPaginacionTodoValorRubroVariable=false;
		this.isPermisoCopiarValorRubroVariable=false;		
		this.isPermisoVerFormValorRubroVariable=false;		
		this.isPermisoDuplicarValorRubroVariable=false;		
		this.isPermisoOrdenValorRubroVariable=false;		
	}
	
	public void setPermisosUsuarioValorRubroVariable(Boolean isPermiso) {
		this.isPermisoTodoValorRubroVariable=isPermiso;
		this.isPermisoNuevoValorRubroVariable=isPermiso;
		this.isPermisoActualizarValorRubroVariable=isPermiso;
		this.isPermisoActualizarOriginalValorRubroVariable=isPermiso;
		this.isPermisoEliminarValorRubroVariable=isPermiso;
		this.isPermisoGuardarCambiosValorRubroVariable=isPermiso;
		this.isPermisoConsultaValorRubroVariable=isPermiso;
		this.isPermisoBusquedaValorRubroVariable=isPermiso;
		this.isPermisoReporteValorRubroVariable=isPermiso;
		this.isPermisoOrdenValorRubroVariable=isPermiso;		
		this.isPermisoPaginacionMedioValorRubroVariable=isPermiso;		
		this.isPermisoPaginacionAltoValorRubroVariable=isPermiso;		
		this.isPermisoPaginacionTodoValorRubroVariable=isPermiso;		
		this.isPermisoCopiarValorRubroVariable=isPermiso;		
		this.isPermisoVerFormValorRubroVariable=isPermiso;		
		this.isPermisoDuplicarValorRubroVariable=isPermiso;
		this.isPermisoOrdenValorRubroVariable=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioValorRubroVariable(Boolean isPermiso) {
		//this.isPermisoTodoValorRubroVariable=isPermiso;
		this.isPermisoNuevoValorRubroVariable=isPermiso;
		this.isPermisoActualizarValorRubroVariable=isPermiso;
		this.isPermisoActualizarOriginalValorRubroVariable=isPermiso;
		this.isPermisoEliminarValorRubroVariable=isPermiso;
		this.isPermisoGuardarCambiosValorRubroVariable=isPermiso;
		//this.isPermisoConsultaValorRubroVariable=isPermiso;
		//this.isPermisoBusquedaValorRubroVariable=isPermiso;
		//this.isPermisoReporteValorRubroVariable=isPermiso;
		//this.isPermisoOrdenValorRubroVariable=isPermiso;		
		//this.isPermisoPaginacionMedioValorRubroVariable=isPermiso;		
		//this.isPermisoPaginacionAltoValorRubroVariable=isPermiso;		
		//this.isPermisoPaginacionTodoValorRubroVariable=isPermiso;		
		//this.isPermisoCopiarValorRubroVariable=isPermiso;		
		//this.isPermisoDuplicarValorRubroVariable=isPermiso;
		//this.isPermisoOrdenValorRubroVariable=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioValorRubroVariableClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ValorRubroVariableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebValorRubroVariable(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioValorRubroVariableClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioValorRubroVariableClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionValorRubroVariableClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioValorRubroVariableClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioValorRubroVariable() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ValorRubroVariableJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ValorRubroVariableConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoValorRubroVariable=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarValorRubroVariable=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalValorRubroVariable=this.isPermisoActualizarValorRubroVariable;
			this.isPermisoEliminarValorRubroVariable=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosValorRubroVariable=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaValorRubroVariable=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaValorRubroVariable=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoValorRubroVariable=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteValorRubroVariable=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenValorRubroVariable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioValorRubroVariable=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoValorRubroVariable=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoValorRubroVariable=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarValorRubroVariable=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormValorRubroVariable=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarValorRubroVariable=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenValorRubroVariable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosValorRubroVariable.setToolTipText(this.jTableDatosValorRubroVariable.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioValorRubroVariable(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioValorRubroVariable(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ValorRubroVariableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ValorRubroVariableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioValorRubroVariable() throws Exception {
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
	public void inicializarCombosForeignKeyValorRubroVariableListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyValorRubroVariableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ValorRubroVariableJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyValorRubroVariableListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyRubroEmpleaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RubroEmpleaConstantesFunciones.SFINALQUERY;

				this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyValorRubroVariableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ValorRubroVariableParameterReturnGeneral valorrubrovariableReturnGeneral=new ValorRubroVariableParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.valorrubrovariableConstantesFunciones.cargarid_empresaValorRubroVariable)
					 || (this.esRecargarFks && this.valorrubrovariableConstantesFunciones.cargarid_empresaValorRubroVariable)) {

					if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+valorrubrovariableSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.valorrubrovariableConstantesFunciones.cargarid_empleadoValorRubroVariable)
					 || (this.esRecargarFks && this.valorrubrovariableConstantesFunciones.cargarid_empleadoValorRubroVariable)) {

					if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+valorrubrovariableSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.valorrubrovariableConstantesFunciones.cargarid_rubro_empleaValorRubroVariable)
					 || (this.esRecargarFks && this.valorrubrovariableConstantesFunciones.cargarid_rubro_empleaValorRubroVariable)) {

					if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+valorrubrovariableSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				valorrubrovariableReturnGeneral=valorrubrovariableLogic.cargarCombosLoteForeignKeyValorRubroVariable(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalRubroEmplea);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=valorrubrovariableReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=valorrubrovariableReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=valorrubrovariableReturnGeneral.getrubroempleasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyValorRubroVariable()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.valorrubrovariableSessionBean==null) {
				this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
			}

			if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyRubroEmplea()throws Exception {
		try {

			if(!this.valorrubrovariableSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				RubroEmplea rubroemplea=new RubroEmplea();
				RubroEmpleaConstantesFunciones.setRubroEmpleaDescripcion(rubroemplea,Constantes.SMENSAJE_ESCOJA_OPCION);
				rubroemplea.setId(null);

				if(!RubroEmpleaConstantesFunciones.ExisteEnLista(this.rubroempleasForeignKey,rubroemplea,true)) {

					this.rubroempleasForeignKey.add(0,rubroemplea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyValorRubroVariable()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyValorRubroVariable(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyValorRubroVariable()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.valorrubrovariable.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyValorRubroVariable();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyValorRubroVariable(ValorRubroVariable valorrubrovariable)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(valorrubrovariable.getid_empleado(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(valorrubrovariable.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyValorRubroVariable(ValorRubroVariable valorrubrovariable,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyValorRubroVariable()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.valorrubrovariableConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(this.valorrubrovariableConstantesFunciones.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyValorRubroVariable()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyValorRubroVariable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyValorRubroVariable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroValorRubroVariable()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyValorRubroVariable()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyValorRubroVariable(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyValorRubroVariable()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.getItemCount()>0) {
				this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.getItemCount()>0) {
				this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.getItemCount()>0) {
				this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ValorRubroVariableBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ValorRubroVariableBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ValorRubroVariableBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean(); 
		this.valorrubrovariableConstantesFunciones=new ValorRubroVariableConstantesFunciones(); 
		this.valorrubrovariableBean=new ValorRubroVariable();//(this.valorrubrovariableConstantesFunciones); 		
		this.valorrubrovariableReturnGeneral=new ValorRubroVariableParameterReturnGeneral(); 
		
		this.valorrubrovariableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.valorrubrovariableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ValorRubroVariableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ValorRubroVariableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ValorRubroVariableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessValorRubroVariable(true);
			
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
			
			this.valorrubrovariableConstantesFunciones=new ValorRubroVariableConstantesFunciones(); 
			this.valorrubrovariableBean=new ValorRubroVariable();//this.valorrubrovariableConstantesFunciones); 			
			this.valorrubrovariableReturnGeneral=new ValorRubroVariableParameterReturnGeneral(); 
		
			ValorRubroVariableBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Valor Rubro Variable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.valorrubrovariable=new ValorRubroVariable();
			this.valorrubrovariables = new ArrayList<ValorRubroVariable>();
			this.valorrubrovariablesAux = new ArrayList<ValorRubroVariable>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic=new ValorRubroVariableLogic();
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}
			
			//this.valorrubrovariableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.valorrubrovariableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormValorRubroVariable);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoValorRubroVariable);	
					}
					
					if(this.jInternalFrameImportacionValorRubroVariable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionValorRubroVariable);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByValorRubroVariable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByValorRubroVariable);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormValorRubroVariable);
				this.jInternalFrameDetalleFormValorRubroVariable.setVisible(false);
				this.jInternalFrameDetalleFormValorRubroVariable.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoValorRubroVariable);
					this.jInternalFrameReporteDinamicoValorRubroVariable.setVisible(false);
					this.jInternalFrameReporteDinamicoValorRubroVariable.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionValorRubroVariable!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionValorRubroVariable);
					this.jInternalFrameImportacionValorRubroVariable.setVisible(false);
					this.jInternalFrameImportacionValorRubroVariable.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByValorRubroVariable!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByValorRubroVariable);
					this.jInternalFrameOrderByValorRubroVariable.setVisible(false);
					this.jInternalFrameOrderByValorRubroVariable.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idValorRubroVariableActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ValorRubroVariableConstantesFunciones.INUMEROPAGINACION;
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
			
			this.valorrubrovariableReturnGeneral=new ValorRubroVariableParameterReturnGeneral();
			
			this.valorrubrovariableParameterGeneral=new ValorRubroVariableParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.valorrubrovariableLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ValorRubroVariableJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ValorRubroVariableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),this.valorrubrovariableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ValorRubroVariableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),this.valorrubrovariableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoValorRubroVariable=false;
			this.isVisibilidadCeldaDuplicarValorRubroVariable=true;
			this.isVisibilidadCeldaCopiarValorRubroVariable=true;
			this.isVisibilidadCeldaVerFormValorRubroVariable=true;
			this.isVisibilidadCeldaOrdenValorRubroVariable=true;
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
			this.isVisibilidadCeldaModificarValorRubroVariable=false;
			this.isVisibilidadCeldaActualizarValorRubroVariable=false;
			this.isVisibilidadCeldaEliminarValorRubroVariable=false;
			this.isVisibilidadCeldaCancelarValorRubroVariable=false;
			this.isVisibilidadCeldaGuardarValorRubroVariable=false;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesValorRubroVariable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosValorRubroVariable();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioValorRubroVariable(false);
			
			this.setPermisosUsuarioValorRubroVariable();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado() 
				|| (this.valorrubrovariableSessionBean.getEsGuardarRelacionado() && this.valorrubrovariableSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioValorRubroVariableClasesRelacionadas();
			}
			
			if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioValorRubroVariableClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosValorRubroVariable();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualValorRubroVariable();
			}
			
			if(!this.isPermisoBusquedaValorRubroVariable) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioValorRubroVariable,this.isPermisoPaginacionMedioValorRubroVariable,this.isPermisoPaginacionTodoValorRubroVariable);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ValorRubroVariableConstantesFunciones.getTiposSeleccionarValorRubroVariable());
				
				this.tiposColumnasSelect=ValorRubroVariableConstantesFunciones.getTiposSeleccionarValorRubroVariable(true);
				
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
			//if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioValorRubroVariable();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioValorRubroVariable(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioValorRubroVariable(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesValorRubroVariable() ;
			
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
			this.rubroempleaLogic=new RubroEmpleaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				valorrubrovariableImplementable= (ValorRubroVariableImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ValorRubroVariableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				valorrubrovariableImplementableHome= (ValorRubroVariableImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ValorRubroVariableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.valorrubrovariables= new ArrayList<ValorRubroVariable>();
			this.valorrubrovariablesEliminados= new ArrayList<ValorRubroVariable>();
						
			this.isEsNuevoValorRubroVariable=false;
			this.esParaAccionDesdeFormularioValorRubroVariable=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyValorRubroVariable(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroValorRubroVariable();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ValorRubroVariableBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ValorRubroVariableConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesValorRubroVariable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingValorRubroVariable(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioValorRubroVariable();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioValorRubroVariable();
			}
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasValorRubroVariable.getTabCount(); i++) {
					this.jTabbedPaneBusquedasValorRubroVariable.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasValorRubroVariable.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessValorRubroVariable(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ValorRubroVariable: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectValorRubroVariable() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesValorRubroVariable")) {
				iIndex=this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessValorRubroVariable();	
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
	
	public void cargarCombosForeignKeyValorRubroVariable(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyValorRubroVariable(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyValorRubroVariable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyValorRubroVariableListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyValorRubroVariable();
		
		this.cargarCombosFrameForeignKeyValorRubroVariable();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyValorRubroVariable();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyValorRubroVariable();
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

	public void cargarCombosForeignKeyRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRubroEmplea(this.rubroempleasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoValorRubroVariableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
			
			if(jTableDatosValorRubroVariable.getRowCount()>=1) {
				jTableDatosValorRubroVariable.removeRowSelectionInterval(0, jTableDatosValorRubroVariable.getRowCount()-1);						
			}
			
			this.isEsNuevoValorRubroVariable=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoValorRubroVariable(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesValorRubroVariable(true);			
			//this.valorrubrovariable=new ValorRubroVariable();
			//this.valorrubrovariable.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesValorRubroVariable(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualValorRubroVariable() ;
			
			if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleValorRubroVariable(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.valorrubrovariable);	
			this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);				
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
			if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ValorRubroVariable: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarValorRubroVariableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosValorRubroVariable.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosValorRubroVariable.getSelectedRows().length;			
			}
			
			valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoValorRubroVariable--;			
				//ValorRubroVariable valorrubrovariableAux= new ValorRubroVariable();			
				//valorrubrovariableAux.setId(this.iIdNuevoValorRubroVariable);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ValorRubroVariable valorrubrovariableOrigen=new ValorRubroVariable();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ValorRubroVariable valorrubrovariableOrigen : valorrubrovariablesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							valorrubrovariableOrigen =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							valorrubrovariableOrigen =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaValorRubroVariable();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.valorrubrovariable.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosValorRubroVariable(valorrubrovariableOrigen,this.valorrubrovariable,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.valorrubrovariableLogic.getValorRubroVariables().add(this.valorrubrovariableAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.valorrubrovariables.add(this.valorrubrovariableAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaValorRubroVariable(false);
				
				this.jTableDatosValorRubroVariable.setRowSelectionInterval(this.getIndiceNuevoValorRubroVariable(), this.getIndiceNuevoValorRubroVariable());
				
				int iLastRow =  this.jTableDatosValorRubroVariable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosValorRubroVariable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosValorRubroVariable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaValorRubroVariable(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();									
		
			ValorRubroVariable valorrubrovariableOrigen=new ValorRubroVariable();
			ValorRubroVariable valorrubrovariableDestino=new ValorRubroVariable();
				
			valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosValorRubroVariable.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || valorrubrovariablesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosValorRubroVariable.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariableOrigen =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						valorrubrovariableOrigen =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						valorrubrovariableDestino =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						valorrubrovariableDestino =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				valorrubrovariableOrigen =valorrubrovariablesSeleccionados.get(0);
				valorrubrovariableDestino =valorrubrovariablesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosValorRubroVariable(valorrubrovariableOrigen,valorrubrovariableDestino,true,false);
				
				valorrubrovariableDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(valorrubrovariableDestino,valorrubrovariableLogic.getValorRubroVariables());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(valorrubrovariableDestino,valorrubrovariables);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaValorRubroVariable(false);
				
				//this.jTableDatosValorRubroVariable.setRowSelectionInterval(this.getIndiceNuevoValorRubroVariable(), this.getIndiceNuevoValorRubroVariable());
				
				int iLastRow =  this.jTableDatosValorRubroVariable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosValorRubroVariable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosValorRubroVariable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaValorRubroVariable(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormValorRubroVariable.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesValorRubroVariable.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasValorRubroVariable.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesValorRubroVariable.setVisible(!isVisible);
			this.jPanelPaginacionValorRubroVariable.setVisible(!isVisible);
			this.jPanelAccionesValorRubroVariable.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameValorRubroVariable();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoValorRubroVariable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionValorRubroVariable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByValorRubroVariable();
			
			this.abrirFrameOrderByValorRubroVariable();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByValorRubroVariable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleValorRubroVariable(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormValorRubroVariable);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormValorRubroVariable.isMaximum()) {
					this.jInternalFrameDetalleFormValorRubroVariable.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormValorRubroVariable.setSize(this.jInternalFrameDetalleFormValorRubroVariable.iWidthFormulario,this.jInternalFrameDetalleFormValorRubroVariable.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormValorRubroVariable.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormValorRubroVariable.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormValorRubroVariable.isMaximum()) {
						this.jInternalFrameDetalleFormValorRubroVariable.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormValorRubroVariable.jContentPaneDetalleValorRubroVariable.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormValorRubroVariable.jContentPaneDetalleValorRubroVariable.getWidth(),ValorRubroVariableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormValorRubroVariable.jContentPaneDetalleValorRubroVariable.getWidth(),ValorRubroVariableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormValorRubroVariable.jContentPaneDetalleValorRubroVariable.getWidth(),ValorRubroVariableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormValorRubroVariable.setVisible(true);
	        this.jInternalFrameDetalleFormValorRubroVariable.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByValorRubroVariable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByValorRubroVariable==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByValorRubroVariable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByValorRubroVariable,false,this);
				} else {
					this.jInternalFrameOrderByValorRubroVariable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByValorRubroVariable,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByValorRubroVariable);
				this.jInternalFrameOrderByValorRubroVariable.setVisible(false);
				this.jInternalFrameOrderByValorRubroVariable.setSelected(false);
				
				this.jInternalFrameOrderByValorRubroVariable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByValorRubroVariable"));
				
				this.inicializarActualizarBindingTablaOrderByValorRubroVariable();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionValorRubroVariable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionValorRubroVariable==null) {
				
				this.jInternalFrameImportacionValorRubroVariable=new ImportacionJInternalFrame(ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionValorRubroVariable);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionValorRubroVariable);
				this.jInternalFrameImportacionValorRubroVariable.setVisible(false);
				this.jInternalFrameImportacionValorRubroVariable.setSelected(false);


				this.jInternalFrameImportacionValorRubroVariable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionValorRubroVariable"));
				this.jInternalFrameImportacionValorRubroVariable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionValorRubroVariable"));
				this.jInternalFrameImportacionValorRubroVariable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionValorRubroVariable"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoValorRubroVariable() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoValorRubroVariable==null) {
				this.jInternalFrameReporteDinamicoValorRubroVariable=new ReporteDinamicoJInternalFrame(ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoValorRubroVariable);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoValorRubroVariable);
				this.jInternalFrameReporteDinamicoValorRubroVariable.setVisible(false);
				this.jInternalFrameReporteDinamicoValorRubroVariable.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoValorRubroVariable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoValorRubroVariable"));
				this.jInternalFrameReporteDinamicoValorRubroVariable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoValorRubroVariable"));
				this.jInternalFrameReporteDinamicoValorRubroVariable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoValorRubroVariable"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualValorRubroVariable();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleValorRubroVariable() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormValorRubroVariable);
			
	       	this.jInternalFrameDetalleFormValorRubroVariable.setVisible(false);
	        this.jInternalFrameDetalleFormValorRubroVariable.setSelected(false);
			
			//this.jInternalFrameDetalleFormValorRubroVariable.dispose();
			//this.jInternalFrameDetalleFormValorRubroVariable=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoValorRubroVariable() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoValorRubroVariable.setVisible(true);
	        this.jInternalFrameReporteDinamicoValorRubroVariable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionValorRubroVariable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionValorRubroVariable.setVisible(true);
	        this.jInternalFrameImportacionValorRubroVariable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByValorRubroVariable() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByValorRubroVariable.setVisible(true);
	        this.jInternalFrameOrderByValorRubroVariable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByValorRubroVariable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByValorRubroVariable.setVisible(false);
	        this.jInternalFrameOrderByValorRubroVariable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoValorRubroVariable() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoValorRubroVariable.setVisible(false);
	        this.jInternalFrameReporteDinamicoValorRubroVariable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionValorRubroVariable() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionValorRubroVariable.setVisible(false);
	        this.jInternalFrameImportacionValorRubroVariable.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarValorRubroVariable(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarValorRubroVariable(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesValorRubroVariable(true);
			//this.isEsNuevoValorRubroVariable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesValorRubroVariable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesValorRubroVariable(false) ;
			
			if(valorrubrovariableSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleValorRubroVariable(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualValorRubroVariable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaValorRubroVariableActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarValorRubroVariable(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesValorRubroVariable(true);
			//this.isEsNuevoValorRubroVariable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.valorrubrovariable.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesValorRubroVariable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesValorRubroVariable(false) ;
			
			if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleValorRubroVariable(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualValorRubroVariable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosValorRubroVariable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaRubroEmplea(List<RubroEmplea> rubroempleasForeignKey)throws Exception{
		TableColumn tableColumnRubroEmplea=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosValorRubroVariable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesValorRubroVariable(false);
			
			//if(!this.isEsNuevoValorRubroVariable) {								
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true);
				this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
				
			}
			
			if(this.permiteMantenimiento(this.valorrubrovariable)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoValorRubroVariable=true;
					this.inicializarActualizarBindingTablaValorRubroVariable(false);
					this.isEsNuevoValorRubroVariable=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoValorRubroVariable=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoValorRubroVariable=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesValorRubroVariable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualValorRubroVariable(false);
				
				this.habilitarDeshabilitarControlesValorRubroVariable(false);
			
												
				
				if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleValorRubroVariable();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoValorRubroVariableActionPerformed(evt,valorrubrovariableSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualValorRubroVariable(this.valorrubrovariable,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosValorRubroVariable.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,valorrubrovariableSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.valorrubrovariable.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				this.valorrubrovariable.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				this.valorrubrovariable.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.valorrubrovariable)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ValorRubroVariableModel) this.jTableDatosValorRubroVariable.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoValorRubroVariable=true;
				this.inicializarActualizarBindingTablaValorRubroVariable(false);
				this.isEsNuevoValorRubroVariable=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesValorRubroVariable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualValorRubroVariable(false);
				
				this.habilitarDeshabilitarControlesValorRubroVariable(false);
				
				
				
				if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleValorRubroVariable();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosValorRubroVariable.getRowCount()>=1) {
				jTableDatosValorRubroVariable.removeRowSelectionInterval(0, jTableDatosValorRubroVariable.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesValorRubroVariable(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaValorRubroVariable(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesValorRubroVariable(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualValorRubroVariable(false) ;
			
			this.isEsNuevoValorRubroVariable=false;
			
			if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleValorRubroVariable();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingValorRubroVariable(false);
				
				//SI ES MANUAL
				if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualValorRubroVariable();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoValorRubroVariable--;			
			//ValorRubroVariable valorrubrovariableAux= new ValorRubroVariable();			
			//valorrubrovariableAux.setId(this.iIdNuevoValorRubroVariable);
			
			if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaValorRubroVariable();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
			
			this.valorrubrovariable.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.valorrubrovariableLogic.getValorRubroVariables().add(this.valorrubrovariableAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.valorrubrovariables.add(this.valorrubrovariableAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaValorRubroVariable(false);
			
			this.jTableDatosValorRubroVariable.setRowSelectionInterval(this.getIndiceNuevoValorRubroVariable(), this.getIndiceNuevoValorRubroVariable());
			
			int iLastRow =  this.jTableDatosValorRubroVariable.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosValorRubroVariable.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosValorRubroVariable.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaValorRubroVariable(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingValorRubroVariable(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingValorRubroVariable(false);
			
			//SI ES MANUAL
			if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualValorRubroVariable();
			}
			
			//this.abrirFrameTreeValorRubroVariable();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Valor Rubro VariableS ?", "MANTENIMIENTO DE Valor Rubro Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionValorRubroVariable.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralValorRubroVariable();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.valorrubrovariableReturnGeneral=valorrubrovariableLogic.procesarImportacionValorRubroVariablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.valorrubrovariableParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarValorRubroVariableReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionValorRubroVariable.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionValorRubroVariable.setFileImportacion(this.jInternalFrameImportacionValorRubroVariable.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionValorRubroVariable.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionValorRubroVariable.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionValorRubroVariable.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionValorRubroVariable.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		

		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ValorRubroVariableBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ValorRubroVariableBaseDesign.jrxml";
			
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
			
			this.generarReporteValorRubroVariables("Todos",valorrubrovariablesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ValorRubroVariableConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ValorRubroVariableConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoValorRubroVariable.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorrubrovariable";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ValorRubroVariables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ValorRubroVariable valorrubrovariable:valorrubrovariablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(valorrubrovariable.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(ValorRubroVariable valorrubrovariable:valorrubrovariablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(valorrubrovariable.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(ValorRubroVariable valorrubrovariable:valorrubrovariablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(valorrubrovariable.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ValorRubroVariable valorrubrovariable:valorrubrovariablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(valorrubrovariable.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ValorRubroVariableConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ValorRubroVariable valorrubrovariable:valorrubrovariablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(valorrubrovariable.getvalor());
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
			//	this.getFilaCabeceraExportarExcelValorRubroVariable(row);				
			//	iRow++;
			//}				
			
			//for(ValorRubroVariable valorrubrovariableAux:valorrubrovariablesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelValorRubroVariable(valorrubrovariableAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
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
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingValorRubroVariable(false);
			
			//SI ES MANUAL
			if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualValorRubroVariable();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingValorRubroVariable(false);
			
			//SI ES MANUAL
			if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualValorRubroVariable();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingValorRubroVariable(false);
			
			//SI ES MANUAL
			if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualValorRubroVariable();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaValorRubroVariable() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosValorRubroVariable.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosValorRubroVariable.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosValorRubroVariable.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosValorRubroVariable.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosValorRubroVariable.setMinimumSize(dimensionMinimum);
		this.jTableDatosValorRubroVariable.setMaximumSize(dimensionMaximum);
		this.jTableDatosValorRubroVariable.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingValorRubroVariable(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingValorRubroVariable(esInicializar,true);
	}
	
	public void inicializarActualizarBindingValorRubroVariable(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaValorRubroVariable(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesValorRubroVariable(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasValorRubroVariable(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesValorRubroVariable(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesValorRubroVariable(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualValorRubroVariable() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaValorRubroVariable();
		
		this.inicializarActualizarBindingBotonesManualValorRubroVariable(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualValorRubroVariable();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesValorRubroVariable() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualValorRubroVariable(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualValorRubroVariable(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosValorRubroVariable.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosValorRubroVariable.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteValorRubroVariable.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormValorRubroVariable.jCheckBoxPostAccionNuevoValorRubroVariable.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormValorRubroVariable.jCheckBoxPostAccionSinCerrarValorRubroVariable.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormValorRubroVariable.jCheckBoxPostAccionSinMensajeValorRubroVariable.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosValorRubroVariable.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosValorRubroVariable.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteValorRubroVariable.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
				this.jInternalFrameDetalleFormValorRubroVariable.jCheckBoxPostAccionNuevoValorRubroVariable.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormValorRubroVariable.jCheckBoxPostAccionSinCerrarValorRubroVariable.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormValorRubroVariable.jCheckBoxPostAccionSinMensajeValorRubroVariable.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionValorRubroVariable.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionValorRubroVariable.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesValorRubroVariable.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesValorRubroVariable.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesValorRubroVariable.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarValorRubroVariable.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesValorRubroVariable.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesValorRubroVariable.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralValorRubroVariable.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesValorRubroVariable(Boolean esInicializar) throws Exception {
		try	{	
			if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualValorRubroVariable(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesValorRubroVariable() throws Exception {
		try	{
			if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualValorRubroVariable();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleValorRubroVariable() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualValorRubroVariable() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesValorRubroVariable.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesValorRubroVariable.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesValorRubroVariable.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesValorRubroVariable.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesValorRubroVariable.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesValorRubroVariable.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionValorRubroVariable.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionValorRubroVariable.addItem(reporte);
			}
			
			
			if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionValorRubroVariable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionValorRubroVariable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesValorRubroVariable.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesValorRubroVariable.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesValorRubroVariable.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesValorRubroVariable.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarValorRubroVariable.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarValorRubroVariable.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarValorRubroVariable.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualValorRubroVariable();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualValorRubroVariable() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
				this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
				this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
				
				if(this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoValorRubroVariable.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ValorRubroVariableConstantesFunciones.getTiposSeleccionarValorRubroVariable(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ValorRubroVariableConstantesFunciones.getTiposSeleccionarValorRubroVariable(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ValorRubroVariableConstantesFunciones.getTiposSeleccionarValorRubroVariable(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoValorRubroVariable.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualValorRubroVariable()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoValorRubroVariable.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.getSelectedItem()!=null){this.id_rubro_empleaFK_IdRubroEmplea=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaValorRubroVariable.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasValorRubroVariable(Boolean esInicializar) throws Exception {				
		if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualValorRubroVariable();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaValorRubroVariable() throws Exception {
		this.inicializarActualizarBindingTablaValorRubroVariable(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByValorRubroVariable() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosValorRubroVariableOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariableOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaValorRubroVariable(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=valorrubrovariableLogic.getValorRubroVariables().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=valorrubrovariables.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosValorRubroVariable.setModel(new ValorRubroVariableModel(this.valorrubrovariableLogic.getValorRubroVariables(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosValorRubroVariable.setModel(new ValorRubroVariableModel(this.valorrubrovariables,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByValorRubroVariable!=null && this.jInternalFrameOrderByValorRubroVariable.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByValorRubroVariable();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO,valorrubrovariableConstantesFunciones.resaltarSeleccionarValorRubroVariable,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO,valorrubrovariableConstantesFunciones.resaltarSeleccionarValorRubroVariable,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,ValorRubroVariableConstantesFunciones.LABEL_ID));

		if(this.valorrubrovariableConstantesFunciones.mostraridValorRubroVariable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorRubroVariableConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.valorrubrovariableConstantesFunciones.resaltaridValorRubroVariable,this.valorrubrovariableConstantesFunciones.activaridValorRubroVariable,iSizeTabla,this,true,"idValorRubroVariable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.valorrubrovariableConstantesFunciones.resaltaridValorRubroVariable,this.valorrubrovariableConstantesFunciones.activaridValorRubroVariable,this,true,"idValorRubroVariable","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA));

		if(this.valorrubrovariableConstantesFunciones.mostrarid_empresaValorRubroVariable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.valorrubrovariableConstantesFunciones.resaltarid_empresaValorRubroVariable,this,this.valorrubrovariableConstantesFunciones.activarid_empresaValorRubroVariable,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.valorrubrovariableConstantesFunciones.resaltarid_empresaValorRubroVariable,this,this.valorrubrovariableConstantesFunciones.activarid_empresaValorRubroVariable,false,"id_empresaValorRubroVariable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.valorrubrovariableConstantesFunciones.mostrarid_empleadoValorRubroVariable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.valorrubrovariableConstantesFunciones.resaltarid_empleadoValorRubroVariable,this,this.valorrubrovariableConstantesFunciones.activarid_empleadoValorRubroVariable,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.valorrubrovariableConstantesFunciones.resaltarid_empleadoValorRubroVariable,this,this.valorrubrovariableConstantesFunciones.activarid_empleadoValorRubroVariable,true,"id_empleadoValorRubroVariable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.valorrubrovariableConstantesFunciones.mostrarid_rubro_empleaValorRubroVariable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.valorrubrovariableConstantesFunciones.resaltarid_rubro_empleaValorRubroVariable,this,this.valorrubrovariableConstantesFunciones.activarid_rubro_empleaValorRubroVariable,iSizeTabla));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.valorrubrovariableConstantesFunciones.resaltarid_rubro_empleaValorRubroVariable,this,this.valorrubrovariableConstantesFunciones.activarid_rubro_empleaValorRubroVariable,true,"id_rubro_empleaValorRubroVariable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,ValorRubroVariableConstantesFunciones.LABEL_FECHA));

		if(this.valorrubrovariableConstantesFunciones.mostrarfechaValorRubroVariable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorRubroVariableConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.valorrubrovariableConstantesFunciones.resaltarfechaValorRubroVariable,this.valorrubrovariableConstantesFunciones.activarfechaValorRubroVariable,iSizeTabla,this,true,"fechaValorRubroVariable","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.valorrubrovariableConstantesFunciones.resaltarfechaValorRubroVariable,this.valorrubrovariableConstantesFunciones.activarfechaValorRubroVariable,this,true,"fechaValorRubroVariable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,ValorRubroVariableConstantesFunciones.LABEL_VALOR));

		if(this.valorrubrovariableConstantesFunciones.mostrarvalorValorRubroVariable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ValorRubroVariableConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.valorrubrovariableConstantesFunciones.resaltarvalorValorRubroVariable,this.valorrubrovariableConstantesFunciones.activarvalorValorRubroVariable,iSizeTabla,this,true,"valorValorRubroVariable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.valorrubrovariableConstantesFunciones.resaltarvalorValorRubroVariable,this.valorrubrovariableConstantesFunciones.activarvalorValorRubroVariable,this,true,"valorValorRubroVariable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ValorRubroVariablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosValorRubroVariable.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosValorRubroVariable.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosValorRubroVariable.addColumn(tableColumn);
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
			
			this.jTableDatosValorRubroVariable.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosValorRubroVariable.moveColumn(this.jTableDatosValorRubroVariable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosValorRubroVariable.moveColumn(this.jTableDatosValorRubroVariable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosValorRubroVariable.moveColumn(this.jTableDatosValorRubroVariable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosValorRubroVariable.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosValorRubroVariable.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosValorRubroVariable,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosValorRubroVariable.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosValorRubroVariable.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosValorRubroVariable.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosValorRubroVariable.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosValorRubroVariable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=valorrubrovariableLogic.getValorRubroVariables().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=valorrubrovariables.size()-1;
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
		//this.jTableDatosValorRubroVariable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosValorRubroVariable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosValorRubroVariable();
			
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
				
				//this.isEsNuevoValorRubroVariable=false;
					
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
				if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormValorRubroVariable==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosValorRubroVariable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosValorRubroVariable.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.valorrubrovariable.getsType().equals("DUPLICADO")
				   || this.valorrubrovariable.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoValorRubroVariable=true;
				
				} else {
					this.isEsNuevoValorRubroVariable=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
					if(this.valorrubrovariable.getId()>=0 && !this.valorrubrovariable.getIsNew()) {						
						this.isEsNuevoValorRubroVariable=false;
						
					} else {
						this.isEsNuevoValorRubroVariable=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoValorRubroVariable(esRelaciones);						
				
				this.seleccionarValorRubroVariable(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.valorrubrovariable.getId()<0) {
					this.isEsNuevoValorRubroVariable=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarValorRubroVariable(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarValorRubroVariable(evt,rowIndex);
				}	
				
				if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ValorRubroVariable: " + this.dDif); 
					}
				}								
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarValorRubroVariable(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.valorrubrovariable)) {
					if(this.valorrubrovariable.getId()>0) {
						this.valorrubrovariable.setIsDeleted(true);
						
						this.valorrubrovariablesEliminados.add(this.valorrubrovariable);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.valorrubrovariableLogic.getValorRubroVariables().remove(this.valorrubrovariable);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.valorrubrovariables.remove(this.valorrubrovariable);				
					}
					
					
					((ValorRubroVariableModel) this.jTableDatosValorRubroVariable.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaValorRubroVariable(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarValorRubroVariable(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoValorRubroVariable) {
			
			if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosValorRubroVariable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosValorRubroVariable.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioValorRubroVariable(this.valorrubrovariable);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.valorrubrovariableConstantesFunciones.cargarid_empresaValorRubroVariable || this.valorrubrovariableConstantesFunciones.event_dependid_empresaValorRubroVariable) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.valorrubrovariable.getid_empresa());
									//this.inicializarActualizarBindingValorRubroVariable(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(valorrubrovariable.getEmpresa()!=null) {
							this.empresasForeignKey.add(valorrubrovariable.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.valorrubrovariable.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.valorrubrovariableConstantesFunciones.cargarid_empleadoValorRubroVariable || this.valorrubrovariableConstantesFunciones.event_dependid_empleadoValorRubroVariable) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.valorrubrovariable.getid_empleado());
									//this.inicializarActualizarBindingValorRubroVariable(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(valorrubrovariable.getEmpleado()!=null) {
							this.empleadosForeignKey.add(valorrubrovariable.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.valorrubrovariable.getid_empleado(),false,"Formulario");

					//RubroEmplea
					if(!this.valorrubrovariableConstantesFunciones.cargarid_rubro_empleaValorRubroVariable || this.valorrubrovariableConstantesFunciones.event_dependid_rubro_empleaValorRubroVariable) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.valorrubrovariable.getid_rubro_emplea());
									//this.inicializarActualizarBindingValorRubroVariable(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(valorrubrovariable.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(valorrubrovariable.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.valorrubrovariable.getid_rubro_emplea(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesValorRubroVariable("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesValorRubroVariable(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualValorRubroVariable() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoValorRubroVariable(ValorRubroVariable valorrubrovariable) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoValorRubroVariable(valorrubrovariable,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoValorRubroVariable(ValorRubroVariable valorrubrovariable,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioValorRubroVariable(valorrubrovariable);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyValorRubroVariable(valorrubrovariable,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyValorRubroVariable(valorrubrovariable);
	}
	
	public void setVariablesObjetoActualToFormularioValorRubroVariable(ValorRubroVariable valorrubrovariable) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.setText(valorrubrovariable.getId().toString());
			this.jInternalFrameDetalleFormValorRubroVariable.jDateChooserfechaValorRubroVariable.setDate(valorrubrovariable.getfecha());
			this.jInternalFrameDetalleFormValorRubroVariable.jTextFieldvalorValorRubroVariable.setText(valorrubrovariable.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ValorRubroVariable valorrubrovariableLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,valorrubrovariableLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ValorRubroVariable valorrubrovariableLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				valorrubrovariableLocal=this.valorrubrovariable;
			} else {
				valorrubrovariableLocal=this.valorrubrovariableAnterior;
			}
		}
		
		if(this.permiteMantenimiento(valorrubrovariableLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoValorRubroVariable(valorrubrovariableLocal,true);
					
					if(valorrubrovariableSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(valorrubrovariableLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(valorrubrovariableLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoValorRubroVariable(ValorRubroVariable valorrubrovariable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualValorRubroVariable(valorrubrovariable,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(valorrubrovariable);
	}
	
	public void setVariablesFormularioToObjetoActualValorRubroVariable(ValorRubroVariable valorrubrovariable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualValorRubroVariable(valorrubrovariable,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualValorRubroVariable(ValorRubroVariable valorrubrovariable,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.getText()==null || this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.getText()=="" || this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.getText()=="Id") {
				this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.setText("0");
			}

			if(conColumnasBase) {valorrubrovariable.setId(Long.parseLong(this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ValorRubroVariableConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorRubroVariable.jLabelIdValorRubroVariable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			valorrubrovariable.setfecha(this.jInternalFrameDetalleFormValorRubroVariable.jDateChooserfechaValorRubroVariable.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ValorRubroVariableConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorRubroVariable.jLabelfechaValorRubroVariable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			valorrubrovariable.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormValorRubroVariable.jTextFieldvalorValorRubroVariable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ValorRubroVariableConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormValorRubroVariable.jLabelvalorValorRubroVariable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualValorRubroVariable(ValorRubroVariable valorrubrovariableBean,ValorRubroVariable valorrubrovariable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && valorrubrovariableBean.getid_empleado()!=null && !valorrubrovariableBean.getid_empleado().equals(-1L))) {valorrubrovariable.setid_empleado(valorrubrovariableBean.getid_empleado());}
			if(conDefault || (!conDefault && valorrubrovariableBean.getid_rubro_emplea()!=null && !valorrubrovariableBean.getid_rubro_emplea().equals(-1L))) {valorrubrovariable.setid_rubro_emplea(valorrubrovariableBean.getid_rubro_emplea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosValorRubroVariable(ValorRubroVariable valorrubrovariableOrigen,ValorRubroVariable valorrubrovariable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && valorrubrovariableOrigen.getId()!=null && !valorrubrovariableOrigen.getId().equals(0L))) {valorrubrovariable.setId(valorrubrovariableOrigen.getId());}}
			if(conDefault || (!conDefault && valorrubrovariableOrigen.getid_empleado()!=null && !valorrubrovariableOrigen.getid_empleado().equals(-1L))) {valorrubrovariable.setid_empleado(valorrubrovariableOrigen.getid_empleado());}
			if(conDefault || (!conDefault && valorrubrovariableOrigen.getid_rubro_emplea()!=null && !valorrubrovariableOrigen.getid_rubro_emplea().equals(-1L))) {valorrubrovariable.setid_rubro_emplea(valorrubrovariableOrigen.getid_rubro_emplea());}
			if(conDefault || (!conDefault && valorrubrovariableOrigen.getfecha()!=null && !valorrubrovariableOrigen.getfecha().equals(new Date()))) {valorrubrovariable.setfecha(valorrubrovariableOrigen.getfecha());}
			if(conDefault || (!conDefault && valorrubrovariableOrigen.getvalor()!=null && !valorrubrovariableOrigen.getvalor().equals(0.0))) {valorrubrovariable.setvalor(valorrubrovariableOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioValorRubroVariable(ValorRubroVariable valorrubrovariable) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.setText(valorrubrovariable.getId().toString());
			this.jInternalFrameDetalleFormValorRubroVariable.jDateChooserfechaValorRubroVariable.setDate(valorrubrovariable.getfecha());
			this.jInternalFrameDetalleFormValorRubroVariable.jTextFieldvalorValorRubroVariable.setText(valorrubrovariable.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioValorRubroVariable(ValorRubroVariableBean valorrubrovariableBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.setText(valorrubrovariableBean.getId().toString());
			this.jInternalFrameDetalleFormValorRubroVariable.jDateChooserfechaValorRubroVariable.setDate(valorrubrovariableBean.getfecha());
			this.jInternalFrameDetalleFormValorRubroVariable.jTextFieldvalorValorRubroVariable.setText(valorrubrovariableBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanValorRubroVariable(ValorRubroVariableParameterReturnGeneral valorrubrovariableReturnGeneral,ValorRubroVariableBean valorrubrovariableBean,Boolean conDefault) throws Exception { 
		try {
			ValorRubroVariable valorrubrovariableLocal=new ValorRubroVariable();
			
			valorrubrovariableLocal=valorrubrovariableReturnGeneral.getValorRubroVariable();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && valorrubrovariableLocal.getId()!=null && !valorrubrovariableLocal.getId().equals(0L))) {valorrubrovariableBean.setId(valorrubrovariableLocal.getId());}}
			if(conDefault || (!conDefault && valorrubrovariableLocal.getid_empleado()!=null && !valorrubrovariableLocal.getid_empleado().equals(-1L))) {valorrubrovariableBean.setid_empleado(valorrubrovariableLocal.getid_empleado());}
			if(conDefault || (!conDefault && valorrubrovariableLocal.getid_rubro_emplea()!=null && !valorrubrovariableLocal.getid_rubro_emplea().equals(-1L))) {valorrubrovariableBean.setid_rubro_emplea(valorrubrovariableLocal.getid_rubro_emplea());}
			if(conDefault || (!conDefault && valorrubrovariableLocal.getfecha()!=null && !valorrubrovariableLocal.getfecha().equals(new Date()))) {valorrubrovariableBean.setfecha(valorrubrovariableLocal.getfecha());}
			if(conDefault || (!conDefault && valorrubrovariableLocal.getvalor()!=null && !valorrubrovariableLocal.getvalor().equals(0.0))) {valorrubrovariableBean.setvalor(valorrubrovariableLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxValorRubroVariableGenerico(Long idValorRubroVariableSeleccionado,JComboBox jComboBoxValorRubroVariable,List<ValorRubroVariable> valorrubrovariablesLocal)throws Exception {
		try {
			ValorRubroVariable  valorrubrovariableTemp=null;

			for(ValorRubroVariable valorrubrovariableAux:valorrubrovariablesLocal) {
				if(valorrubrovariableAux.getId()!=null && valorrubrovariableAux.getId().equals(idValorRubroVariableSeleccionado)) {
					valorrubrovariableTemp=valorrubrovariableAux;
					break;
				}
			}

			jComboBoxValorRubroVariable.setSelectedItem(valorrubrovariableTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxValorRubroVariableGenerico(JComboBox jComboBoxValorRubroVariable,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxValorRubroVariable.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxValorRubroVariable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxValorRubroVariable.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxValorRubroVariable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			valorrubrovariable=(ValorRubroVariable) valorrubrovariableLogic.getValorRubroVariables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			valorrubrovariable =(ValorRubroVariable) valorrubrovariables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!valorrubrovariable.getIsNew() && !valorrubrovariable.getIsChanged() && !valorrubrovariable.getIsDeleted()) {
				sDescripcion=valorrubrovariable.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=valorrubrovariable.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!valorrubrovariable.getIsNew() && !valorrubrovariable.getIsChanged() && !valorrubrovariable.getIsDeleted()) {
				sDescripcion=valorrubrovariable.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=valorrubrovariable.getempleado_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!valorrubrovariable.getIsNew() && !valorrubrovariable.getIsChanged() && !valorrubrovariable.getIsDeleted()) {
				sDescripcion=valorrubrovariable.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=valorrubrovariable.getrubroemplea_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ValorRubroVariable valorrubrovariableRow=new ValorRubroVariable();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			valorrubrovariableRow=(ValorRubroVariable) valorrubrovariableLogic.getValorRubroVariables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			valorrubrovariableRow=(ValorRubroVariable) valorrubrovariables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualValorRubroVariable(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoValorRubroVariable && this.isPermisoNuevoValorRubroVariable));			
			this.jButtonDuplicarValorRubroVariable.setVisible((this.isVisibilidadCeldaDuplicarValorRubroVariable && this.isPermisoDuplicarValorRubroVariable));			
			this.jButtonCopiarValorRubroVariable.setVisible((this.isVisibilidadCeldaCopiarValorRubroVariable && this.isPermisoCopiarValorRubroVariable));
			this.jButtonVerFormValorRubroVariable.setVisible((this.isVisibilidadCeldaVerFormValorRubroVariable && this.isPermisoVerFormValorRubroVariable));
			
			this.jButtonAbrirOrderByValorRubroVariable.setVisible((this.isVisibilidadCeldaOrdenValorRubroVariable && this.isPermisoOrdenValorRubroVariable));			
			
			this.jButtonNuevoRelacionesValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable && this.isPermisoNuevoValorRubroVariable));			
			this.jButtonNuevoGuardarCambiosValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoValorRubroVariable && this.isPermisoNuevoValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));
			
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarValorRubroVariable.setVisible((this.isVisibilidadCeldaModificarValorRubroVariable && this.isPermisoActualizarValorRubroVariable));	
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarValorRubroVariable.setVisible((this.isVisibilidadCeldaActualizarValorRubroVariable && this.isPermisoActualizarValorRubroVariable));	
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarValorRubroVariable.setVisible((this.isVisibilidadCeldaEliminarValorRubroVariable && this.isPermisoEliminarValorRubroVariable));
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarValorRubroVariable.setVisible(this.isVisibilidadCeldaCancelarValorRubroVariable);							
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosValorRubroVariable.setVisible((this.isVisibilidadCeldaGuardarValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));			
			
			}
						
			this.jButtonGuardarCambiosTablaValorRubroVariable.setVisible((this.isVisibilidadCeldaGuardarCambiosValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoValorRubroVariable && this.isPermisoNuevoValorRubroVariable));						
			this.jButtonDuplicarToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaDuplicarValorRubroVariable && this.isPermisoDuplicarValorRubroVariable));						
			this.jButtonCopiarToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaCopiarValorRubroVariable && this.isPermisoCopiarValorRubroVariable));			
			this.jButtonVerFormToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaVerFormValorRubroVariable && this.isPermisoVerFormValorRubroVariable));			
			this.jButtonAbrirOrderByToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaOrdenValorRubroVariable && this.isPermisoOrdenValorRubroVariable));
			this.jButtonNuevoRelacionesToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable && this.isPermisoNuevoValorRubroVariable));			
			this.jButtonNuevoGuardarCambiosToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoValorRubroVariable && this.isPermisoNuevoValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));			
			
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaModificarValorRubroVariable && this.isPermisoActualizarValorRubroVariable));	
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaActualizarValorRubroVariable  && this.isPermisoActualizarValorRubroVariable));	
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaEliminarValorRubroVariable && this.isPermisoEliminarValorRubroVariable));
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarToolBarValorRubroVariable.setVisible(this.isVisibilidadCeldaCancelarValorRubroVariable);				
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaGuardarValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarValorRubroVariable.setVisible((this.isVisibilidadCeldaGuardarCambiosValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoValorRubroVariable && this.isPermisoNuevoValorRubroVariable));			
			this.jMenuItemDuplicarValorRubroVariable.setVisible((this.isVisibilidadCeldaDuplicarValorRubroVariable && this.isPermisoDuplicarValorRubroVariable));			
			this.jMenuItemCopiarValorRubroVariable.setVisible((this.isVisibilidadCeldaCopiarValorRubroVariable && this.isPermisoCopiarValorRubroVariable));			
			this.jMenuItemVerFormValorRubroVariable.setVisible((this.isVisibilidadCeldaVerFormValorRubroVariable && this.isPermisoVerFormValorRubroVariable));			
			this.jMenuItemAbrirOrderByValorRubroVariable.setVisible((this.isVisibilidadCeldaOrdenValorRubroVariable && this.isPermisoOrdenValorRubroVariable));			
			//this.jMenuItemMostrarOcultarValorRubroVariable.setVisible((this.isVisibilidadCeldaOrdenValorRubroVariable && this.isPermisoOrdenValorRubroVariable));
			this.jMenuItemDetalleAbrirOrderByValorRubroVariable.setVisible((this.isVisibilidadCeldaOrdenValorRubroVariable && this.isPermisoOrdenValorRubroVariable));			
			//this.jMenuItemDetalleMostrarOcultarValorRubroVariable.setVisible((this.isVisibilidadCeldaOrdenValorRubroVariable && this.isPermisoOrdenValorRubroVariable));			
			this.jMenuItemNuevoRelacionesValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable && this.isPermisoNuevoValorRubroVariable));			
			this.jMenuItemNuevoGuardarCambiosValorRubroVariable.setVisible((this.isVisibilidadCeldaNuevoValorRubroVariable && this.isPermisoNuevoValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));									
			
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemModificarValorRubroVariable.setVisible((this.isVisibilidadCeldaModificarValorRubroVariable && this.isPermisoActualizarValorRubroVariable));	
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemActualizarValorRubroVariable.setVisible((this.isVisibilidadCeldaActualizarValorRubroVariable && this.isPermisoActualizarValorRubroVariable));	
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemEliminarValorRubroVariable.setVisible((this.isVisibilidadCeldaEliminarValorRubroVariable && this.isPermisoEliminarValorRubroVariable));
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemCancelarValorRubroVariable.setVisible(this.isVisibilidadCeldaCancelarValorRubroVariable);				
			}
			
			this.jMenuItemGuardarCambiosValorRubroVariable.setVisible((this.isVisibilidadCeldaGuardarValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));						
			this.jMenuItemGuardarCambiosTablaValorRubroVariable.setVisible((this.isVisibilidadCeldaGuardarCambiosValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoValorRubroVariable=this.jButtonNuevoValorRubroVariable.isVisible();
			this.isVisibilidadCeldaDuplicarValorRubroVariable=this.jButtonDuplicarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaCopiarValorRubroVariable=this.jButtonCopiarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaVerFormValorRubroVariable=this.jButtonVerFormValorRubroVariable.isVisible();
			
			this.isVisibilidadCeldaOrdenValorRubroVariable=this.jButtonAbrirOrderByValorRubroVariable.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=this.jButtonNuevoRelacionesValorRubroVariable.isVisible();
			this.isVisibilidadCeldaModificarValorRubroVariable=this.jButtonModificarValorRubroVariable.isVisible();
			
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			this.isVisibilidadCeldaActualizarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaEliminarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaCancelarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaGuardarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosValorRubroVariable.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=this.jButtonGuardarCambiosTablaValorRubroVariable.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoValorRubroVariable=this.jButtonNuevoToolBarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=this.jButtonNuevoRelacionesToolBarValorRubroVariable.isVisible();
			
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			this.isVisibilidadCeldaModificarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarToolBarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaActualizarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarToolBarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaEliminarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarToolBarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaCancelarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarToolBarValorRubroVariable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarValorRubroVariable=this.jButtonGuardarCambiosToolBarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=this.jButtonGuardarCambiosTablaToolBarValorRubroVariable.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoValorRubroVariable=this.jMenuItemNuevoValorRubroVariable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=this.jMenuItemNuevoRelacionesValorRubroVariable.isVisible();
			
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			this.isVisibilidadCeldaModificarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemModificarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaActualizarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemActualizarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaEliminarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemEliminarValorRubroVariable.isVisible();
			this.isVisibilidadCeldaCancelarValorRubroVariable=this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemCancelarValorRubroVariable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarValorRubroVariable=this.jMenuItemGuardarCambiosValorRubroVariable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=this.jMenuItemGuardarCambiosTablaValorRubroVariable.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesValorRubroVariable(Boolean esInicializar) {
		if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {			
			if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
				//if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesValorRubroVariable();
			}
			
			this.inicializarActualizarBindingBotonesManualValorRubroVariable(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualValorRubroVariable() {
		this.jButtonNuevoValorRubroVariable.setVisible(this.isPermisoNuevoValorRubroVariable);			
		this.jButtonDuplicarValorRubroVariable.setVisible(this.isPermisoDuplicarValorRubroVariable);			
		this.jButtonCopiarValorRubroVariable.setVisible(this.isPermisoCopiarValorRubroVariable);			
		this.jButtonVerFormValorRubroVariable.setVisible(this.isPermisoVerFormValorRubroVariable);			
		
		this.jButtonAbrirOrderByValorRubroVariable.setVisible(this.isPermisoOrdenValorRubroVariable);					
		
		this.jButtonNuevoRelacionesValorRubroVariable.setVisible(this.isPermisoNuevoValorRubroVariable);			
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarValorRubroVariable.setVisible(this.isPermisoActualizarValorRubroVariable);	
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarValorRubroVariable.setVisible(this.isPermisoActualizarValorRubroVariable);	
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarValorRubroVariable.setVisible(this.isPermisoEliminarValorRubroVariable);
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarValorRubroVariable.setVisible(this.isVisibilidadCeldaCancelarValorRubroVariable);						
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosValorRubroVariable.setVisible(this.isPermisoGuardarCambiosValorRubroVariable);							
		}
		
		this.jButtonGuardarCambiosTablaValorRubroVariable.setVisible(this.isPermisoActualizarValorRubroVariable);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleValorRubroVariable() {
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarValorRubroVariable.setVisible(this.isPermisoActualizarValorRubroVariable);	
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarValorRubroVariable.setVisible(this.isPermisoActualizarValorRubroVariable);	
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarValorRubroVariable.setVisible(this.isPermisoEliminarValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarValorRubroVariable.setVisible(this.isVisibilidadCeldaCancelarValorRubroVariable);							
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosValorRubroVariable.setVisible((this.isVisibilidadCeldaGuardarValorRubroVariable && this.isPermisoGuardarCambiosValorRubroVariable));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosValorRubroVariable() {
		if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualValorRubroVariable();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesValorRubroVariable() {
	}
	
	public void jTableDatosValorRubroVariableListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarValorRubroVariable(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidValorRubroVariableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorrubrovariable==null) {
						this.valorrubrovariable = new ValorRubroVariable();
					}

					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
				}

				if(this.valorrubrovariable.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.valorrubrovariable.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorRubroVariable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaValorRubroVariableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebValorRubroVariable(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosValorRubroVariable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosValorRubroVariable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.valorrubrovariableLogic.getConnexion());

				if(this.valorrubrovariable.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.valorrubrovariable.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderValorRubroVariable=(TitledBorder)this.jScrollPanelDatosValorRubroVariable.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderValorRubroVariable.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaValorRubroVariableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorrubrovariable==null) {
						this.valorrubrovariable = new ValorRubroVariable();
					}

					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
				}

				if(this.valorrubrovariable.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.valorrubrovariable.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorRubroVariable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoValorRubroVariableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebValorRubroVariable(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosValorRubroVariable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosValorRubroVariable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.valorrubrovariableLogic.getConnexion());

				if(this.valorrubrovariable.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.valorrubrovariable.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderValorRubroVariable=(TitledBorder)this.jScrollPanelDatosValorRubroVariable.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderValorRubroVariable.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoValorRubroVariableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorrubrovariable==null) {
						this.valorrubrovariable = new ValorRubroVariable();
					}

					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
				}

				if(this.valorrubrovariable.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.valorrubrovariable.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorRubroVariable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaValorRubroVariableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebValorRubroVariable(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosValorRubroVariable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosValorRubroVariable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.valorrubrovariableLogic.getConnexion());

				if(this.valorrubrovariable.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.valorrubrovariable.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderValorRubroVariable=(TitledBorder)this.jScrollPanelDatosValorRubroVariable.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderValorRubroVariable.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaValorRubroVariableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorrubrovariable==null) {
						this.valorrubrovariable = new ValorRubroVariable();
					}

					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
				}

				if(this.valorrubrovariable.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.valorrubrovariable.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorRubroVariable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaValorRubroVariableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorrubrovariable==null) {
						this.valorrubrovariable = new ValorRubroVariable();
					}

					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
				}

				if(this.valorrubrovariable.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.valorrubrovariable.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorRubroVariable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorValorRubroVariableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.getvalorrubrovariable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.valorrubrovariable==null) {
						this.valorrubrovariable = new ValorRubroVariable();
					}

					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);
				}

				if(this.valorrubrovariable.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.valorrubrovariable.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingValorRubroVariable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingValorRubroVariable(false,false);

			this.getValorRubroVariablesFK_IdEmpleado();

			this.inicializarActualizarBindingValorRubroVariable(false);

			//if(ValorRubroVariableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingValorRubroVariable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingValorRubroVariable(false,false);

			this.getValorRubroVariablesFK_IdEmpresa();

			this.inicializarActualizarBindingValorRubroVariable(false);

			//if(ValorRubroVariableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingValorRubroVariable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaValorRubroVariableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingValorRubroVariable(false,false);

			this.getValorRubroVariablesFK_IdRubroEmplea();

			this.inicializarActualizarBindingValorRubroVariable(false);

			//if(ValorRubroVariableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingValorRubroVariable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.valorrubrovariableLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameValorRubroVariable() {
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
			this.jInternalFrameDetalleFormValorRubroVariable.setVisible(false);	    			
			this.jInternalFrameDetalleFormValorRubroVariable.dispose();
			this.jInternalFrameDetalleFormValorRubroVariable=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
			this.jInternalFrameReporteDinamicoValorRubroVariable.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoValorRubroVariable.dispose();
			this.jInternalFrameReporteDinamicoValorRubroVariable=null;
		}
		
		if(this.jInternalFrameImportacionValorRubroVariable!=null) {
			this.jInternalFrameImportacionValorRubroVariable.setVisible(false);	    			
			this.jInternalFrameImportacionValorRubroVariable.dispose();
			this.jInternalFrameImportacionValorRubroVariable=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessValorRubroVariable();
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
			
			if(sTipo.equals("NuevoValorRubroVariable")) {
				jButtonNuevoValorRubroVariableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarValorRubroVariable")) {
				jButtonDuplicarValorRubroVariableActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarValorRubroVariable")) {
				jButtonCopiarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("VerFormValorRubroVariable")) {
				jButtonVerFormValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarValorRubroVariable")) {
				jButtonNuevoValorRubroVariableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarValorRubroVariable")) {
				jButtonDuplicarValorRubroVariableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoValorRubroVariable")) {
				jButtonNuevoValorRubroVariableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarValorRubroVariable")) {
				jButtonDuplicarValorRubroVariableActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesValorRubroVariable")) {
				jButtonNuevoValorRubroVariableActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarValorRubroVariable")) {
				jButtonNuevoValorRubroVariableActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesValorRubroVariable")) {
				jButtonNuevoValorRubroVariableActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarValorRubroVariable")) {
				jButtonModificarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarValorRubroVariable")) {
				jButtonModificarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarValorRubroVariable")) {
				jButtonModificarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarValorRubroVariable")) {
				jButtonActualizarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarValorRubroVariable")) {
				jButtonActualizarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarValorRubroVariable")) {
				jButtonActualizarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("EliminarValorRubroVariable")) {
				jButtonEliminarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarValorRubroVariable")) {
				jButtonEliminarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarValorRubroVariable")) {
				jButtonEliminarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("CancelarValorRubroVariable")) {
				jButtonCancelarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarValorRubroVariable")) {
				jButtonCancelarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarValorRubroVariable")) {
				jButtonCancelarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("CerrarValorRubroVariable")) {
				jButtonCerrarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarValorRubroVariable")) {
				jButtonCerrarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarValorRubroVariable")) {
				jButtonCerrarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarValorRubroVariable")) {
				jButtonMostrarOcultarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarValorRubroVariable")) {
				jButtonCancelarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosValorRubroVariable")) {
				jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarValorRubroVariable")) {
				jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarValorRubroVariable")) {
				jButtonCopiarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarValorRubroVariable")) {
				jButtonVerFormValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosValorRubroVariable")) {
				jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarValorRubroVariable")) {
				jButtonCopiarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormValorRubroVariable")) {
				jButtonVerFormValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaValorRubroVariable")) {
				jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarValorRubroVariable")) {
				jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaValorRubroVariable")) {
				jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionValorRubroVariable")) {
				jButtonRecargarInformacionValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarValorRubroVariable")) {
				jButtonRecargarInformacionValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionValorRubroVariable")) {
				jButtonRecargarInformacionValorRubroVariableActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresValorRubroVariable")) {
				jButtonAnterioresValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarValorRubroVariable")) {
				jButtonAnterioresValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreValorRubroVariable")) {
				jButtonAnterioresValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesValorRubroVariable")) {
				jButtonSiguientesValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarValorRubroVariable")) {
				jButtonSiguientesValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesValorRubroVariable")) {
				jButtonSiguientesValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByValorRubroVariable") || sTipo.equals("MenuItemDetalleAbrirOrderByValorRubroVariable")) {
				jButtonAbrirOrderByValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarValorRubroVariable") || sTipo.equals("MenuItemDetalleMostrarOcultarValorRubroVariable")) {
				jButtonMostrarOcultarValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosValorRubroVariable")) {
				jButtonNuevoGuardarCambiosValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarValorRubroVariable")) {
				jButtonNuevoGuardarCambiosValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosValorRubroVariable")) {
				jButtonNuevoGuardarCambiosValorRubroVariableActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoValorRubroVariable")) {
				jButtonCerrarReporteDinamicoValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoValorRubroVariable")) {
				jButtonGenerarReporteDinamicoValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoValorRubroVariable")) {
				
				jButtonGenerarExcelReporteDinamicoValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionValorRubroVariable")) {
				jButtonCerrarImportacionValorRubroVariableActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionValorRubroVariable")) {
				
				jButtonGenerarImportacionValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionValorRubroVariable")) {
				
				jButtonAbrirImportacionValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesValorRubroVariable")) {
				jComboBoxTiposAccionesValorRubroVariableActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesValorRubroVariable")) {
				jComboBoxTiposRelacionesValorRubroVariableActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioValorRubroVariable")) {
				jComboBoxTiposAccionesValorRubroVariableActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarValorRubroVariable")) {
				
				jComboBoxTiposSeleccionarValorRubroVariableActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralValorRubroVariable")) {
				jTextFieldValorCampoGeneralValorRubroVariableActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByValorRubroVariable")) {
				jButtonAbrirOrderByValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarValorRubroVariable")) {
				jButtonAbrirOrderByValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByValorRubroVariable")) {
				jButtonCerrarOrderByValorRubroVariableActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idValorRubroVariableBusqueda")) {
				this.jButtonidValorRubroVariableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaValorRubroVariableUpdate")) {
				this.jButtonid_empresaValorRubroVariableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaValorRubroVariableBusqueda")) {
				this.jButtonid_empresaValorRubroVariableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoValorRubroVariableUpdate")) {
				this.jButtonid_empleadoValorRubroVariableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoValorRubroVariableBusqueda")) {
				this.jButtonid_empleadoValorRubroVariableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaValorRubroVariableUpdate")) {
				this.jButtonid_rubro_empleaValorRubroVariableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaValorRubroVariableBusqueda")) {
				this.jButtonid_rubro_empleaValorRubroVariableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaValorRubroVariableBusqueda")) {
				this.jButtonfechaValorRubroVariableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorValorRubroVariableBusqueda")) {
				this.jButtonvalorValorRubroVariableBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoValorRubroVariable")) {
				this.jButtonFK_IdEmpleadoValorRubroVariableActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRubroEmpleaValorRubroVariable")) {
				this.jButtonFK_IdRubroEmpleaValorRubroVariableActionPerformed(evt);
			}
			
			;
			
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessValorRubroVariable();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorRubroVariableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				


				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ValorRubroVariable valorrubrovariableLocal=null;
			
			if(!this.getEsControlTabla()) {
				valorrubrovariableLocal=this.valorrubrovariable;
			} else {
				valorrubrovariableLocal=this.valorrubrovariableAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
							
				
				


				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorRubroVariableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
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
			
			


			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorRubroVariableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
								
						
				


				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
								
				
				


				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorRubroVariableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorRubroVariableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorRubroVariableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
							
				
				


				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorRubroVariableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
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
			
			


			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorRubroVariableActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
								
				
				


				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorRubroVariableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorRubroVariableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorRubroVariableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosValorRubroVariable")) {
					jCheckBoxSeleccionarTodosValorRubroVariableItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosValorRubroVariable")) {
					jCheckBoxSeleccionadosValorRubroVariableItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarValorRubroVariable")) {
					
				}
				
				


				
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
												
				
				


				
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorRubroVariableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorRubroVariableActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
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
			
			


			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaValorRubroVariableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.valorrubrovariable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.valorrubrovariable);
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
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
				
				


				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ValorRubroVariable.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ValorRubroVariable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaValorRubroVariableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.valorrubrovariableAnterior =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarValorRubroVariable")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosValorRubroVariableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosValorRubroVariable.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.valorrubrovariable =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.valorrubrovariable);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarValorRubroVariable")) {
				
				}
				
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarValorRubroVariable")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosValorRubroVariable.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarValorRubroVariable")) {
			
			}
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessValorRubroVariable();
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
			if(sTipo.equals("NuevoValorRubroVariable")) {
				jButtonNuevoValorRubroVariableActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarValorRubroVariable")) {
				jButtonDuplicarValorRubroVariableActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarValorRubroVariable")) {
				jButtonCopiarValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormValorRubroVariable")) {
				jButtonVerFormValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesValorRubroVariable")) {
				jButtonNuevoValorRubroVariableActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarValorRubroVariable")) {
				jButtonModificarValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarValorRubroVariable")) {
				jButtonActualizarValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarValorRubroVariable")) {
				jButtonEliminarValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaValorRubroVariable")) {
				jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarValorRubroVariable")) {
				jButtonCancelarValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarValorRubroVariable")) {
				jButtonCerrarValorRubroVariableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosValorRubroVariable")) {
				jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosValorRubroVariable")) {
				jButtonNuevoGuardarCambiosValorRubroVariableActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByValorRubroVariable")) {
				jButtonAbrirOrderByValorRubroVariableActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionValorRubroVariable")) {
				jButtonRecargarInformacionValorRubroVariableActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresValorRubroVariable")) {
				jButtonAnterioresValorRubroVariableActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesValorRubroVariable")) {
				jButtonSiguientesValorRubroVariableActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idValorRubroVariableBusqueda")) {
				this.jButtonidValorRubroVariableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaValorRubroVariableUpdate")) {
				this.jButtonid_empresaValorRubroVariableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaValorRubroVariableBusqueda")) {
				this.jButtonid_empresaValorRubroVariableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoValorRubroVariableUpdate")) {
				this.jButtonid_empleadoValorRubroVariableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoValorRubroVariableBusqueda")) {
				this.jButtonid_empleadoValorRubroVariableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaValorRubroVariableUpdate")) {
				this.jButtonid_rubro_empleaValorRubroVariableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaValorRubroVariableBusqueda")) {
				this.jButtonid_rubro_empleaValorRubroVariableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaValorRubroVariableBusqueda")) {
				this.jButtonfechaValorRubroVariableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorValorRubroVariableBusqueda")) {
				this.jButtonvalorValorRubroVariableBusquedaActionPerformed(evt);
			}
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessValorRubroVariable();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameValorRubroVariable")) {
				closingInternalFrameValorRubroVariable();
				
			} else if(sTipo.equals("jButtonCancelarValorRubroVariable")) {
				JInternalFrameBase jInternalFrameDetalleFormValorRubroVariable = (JInternalFrameBase)evt.getSource();
	            	
	            ValorRubroVariableBeanSwingJInternalFrame jInternalFrameParent=(ValorRubroVariableBeanSwingJInternalFrame)jInternalFrameDetalleFormValorRubroVariable.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarValorRubroVariableActionPerformed(null);
			}
			
			ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.valorrubrovariable,new Object(),this.valorrubrovariableParameterGeneral,this.valorrubrovariableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormValorRubroVariable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormValorRubroVariable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormValorRubroVariable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.valorrubrovariable)) {
			if(!esControlTabla) {
				if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);			
				}
				
				if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualValorRubroVariable(this.valorrubrovariable,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.valorrubrovariableReturnGeneral=valorrubrovariableLogic.procesarEventosValorRubroVariablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.valorrubrovariableLogic.getValorRubroVariables(),this.valorrubrovariable,this.valorrubrovariableParameterGeneral,this.isEsNuevoValorRubroVariable,classes);//this.valorrubrovariableLogic.getValorRubroVariable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanValorRubroVariable(this.valorrubrovariableReturnGeneral,this.valorrubrovariableBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanValorRubroVariable(classes,this.valorrubrovariableReturnGeneral,this.valorrubrovariableBean,false);
					}
						
					if(this.valorrubrovariableReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyValorRubroVariable(this.valorrubrovariableReturnGeneral.getValorRubroVariable());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioValorRubroVariable(this.valorrubrovariableReturnGeneral.getValorRubroVariable());	
					}
						
					if(this.valorrubrovariableReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioValorRubroVariable(this.valorrubrovariableReturnGeneral.getValorRubroVariable(),classes);//this.valorrubrovariableBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioValorRubroVariable(this.valorrubrovariable,classes);//this.valorrubrovariableBean);									
				}
			
				if(ValorRubroVariableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualValorRubroVariable(this.valorrubrovariable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysValorRubroVariable(this.valorrubrovariable);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.valorrubrovariableAnterior!=null) {
						this.valorrubrovariable=this.valorrubrovariableAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.valorrubrovariableReturnGeneral=valorrubrovariableLogic.procesarEventosValorRubroVariablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.valorrubrovariableLogic.getValorRubroVariables(),this.valorrubrovariable,this.valorrubrovariableParameterGeneral,this.isEsNuevoValorRubroVariable,classes);//this.valorrubrovariableLogic.getValorRubroVariable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.valorrubrovariableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.valorrubrovariableReturnGeneral.getValorRubroVariable(),valorrubrovariableLogic.getValorRubroVariables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.valorrubrovariableReturnGeneral.getValorRubroVariable(),this.valorrubrovariables);
				}
				//ARCHITECTURE
				
				//this.jTableDatosValorRubroVariable.repaint();
				
				//((AbstractTableModel) this.jTableDatosValorRubroVariable.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosValorRubroVariable();
			}
		}
	}
	
	public void actualizarVisualTableDatosValorRubroVariable() throws Exception {
		
		ValorRubroVariableModel valorrubrovariableModel=(ValorRubroVariableModel)this.jTableDatosValorRubroVariable.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			valorrubrovariableModel.valorrubrovariables=this.valorrubrovariableLogic.getValorRubroVariables();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			valorrubrovariableModel.valorrubrovariables=this.valorrubrovariables;
		}
		
		
		((ValorRubroVariableModel) this.jTableDatosValorRubroVariable.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaValorRubroVariable() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvalorrubrovariableAnterior(),this.valorrubrovariableLogic.getValorRubroVariables());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvalorrubrovariableAnterior(),this.valorrubrovariables);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosValorRubroVariable();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioValorRubroVariable(ValorRubroVariable valorrubrovariable,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
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
										
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.valorrubrovariable,new Object(),generalEntityParameterGeneral,this.valorrubrovariableReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ValorRubroVariableConstantesFunciones.getClassesRelationshipsOfValorRubroVariable(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ValorRubroVariableConstantesFunciones.getClassesRelationshipsFromStringsOfValorRubroVariable(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormValorRubroVariable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ValorRubroVariableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.valorrubrovariable,new Object(),generalEntityParameterGeneral,this.valorrubrovariableReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioValorRubroVariable(ValorRubroVariableBean valorrubrovariableBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanValorRubroVariable(ArrayList<Classe> classes,ValorRubroVariableReturnGeneral valorrubrovariableReturnGeneral,ValorRubroVariableBean valorrubrovariableBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualValorRubroVariable(ValorRubroVariable valorrubrovariable,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.valorrubrovariable)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormValorRubroVariable = new ValorRubroVariableDetalleFormJInternalFrame(jDesktopPane,this.valorrubrovariableSessionBean.getConGuardarRelaciones(),this.valorrubrovariableSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.setVisible(false);
		this.jInternalFrameDetalleFormValorRubroVariable.setSelected(false);						
		
		this.jInternalFrameDetalleFormValorRubroVariable.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormValorRubroVariable.valorrubrovariableLogic=this.valorrubrovariableLogic;
		
		this.cargarCombosFrameForeignKeyValorRubroVariable("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleValorRubroVariable();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleValorRubroVariable();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyValorRubroVariable("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyValorRubroVariable();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormValorRubroVariable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarValorRubroVariable"));
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarValorRubroVariable.addActionListener(new ButtonActionListener(this,"ModificarValorRubroVariable"));

		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarToolBarValorRubroVariable.addActionListener(new ButtonActionListener(this,"ModificarToolBarValorRubroVariable"));
					
		this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemModificarValorRubroVariable.addActionListener(new ButtonActionListener(this,"MenuItemModificarValorRubroVariable"));		
		
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarValorRubroVariable.addActionListener (new ButtonActionListener(this,"ActualizarValorRubroVariable"));
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarToolBarValorRubroVariable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarValorRubroVariable"));
						
		this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemActualizarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarValorRubroVariable"));		
		
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarValorRubroVariable.addActionListener (new ButtonActionListener(this,"EliminarValorRubroVariable"));
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"EliminarToolBarValorRubroVariable"));
								
		this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemEliminarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarValorRubroVariable"));		
		
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarValorRubroVariable.addActionListener (new ButtonActionListener(this,"CancelarValorRubroVariable"));
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"CancelarToolBarValorRubroVariable"));
					
		this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemCancelarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarValorRubroVariable"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemDetalleCerrarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarValorRubroVariable"));		
		
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarValorRubroVariable"));
		
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarValorRubroVariable"));
		
		
		
		this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioValorRubroVariable"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonidValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"idValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empresaValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empresaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empleadoValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empleadoValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_rubro_empleaValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_rubro_empleaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaValorRubroVariableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonfechaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"fechaValorRubroVariableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonvalorValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"valorValorRubroVariableBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesValorRubroVariable"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameValorRubroVariable"));
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarValorRubroVariable"));
		}
		
		this.jTableDatosValorRubroVariable.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarValorRubroVariable"));
		
		this.jTableDatosValorRubroVariable.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarValorRubroVariable"));
		
		this.jButtonNuevoValorRubroVariable.addActionListener(new ButtonActionListener(this,"NuevoValorRubroVariable"));
		
		this.jButtonDuplicarValorRubroVariable.addActionListener(new ButtonActionListener(this,"DuplicarValorRubroVariable"));
		
		this.jButtonCopiarValorRubroVariable.addActionListener(new ButtonActionListener(this,"CopiarValorRubroVariable"));
		
		this.jButtonVerFormValorRubroVariable.addActionListener(new ButtonActionListener(this,"VerFormValorRubroVariable"));
		
		
		this.jButtonNuevoToolBarValorRubroVariable.addActionListener(new ButtonActionListener(this,"NuevoToolBarValorRubroVariable"));
			
		this.jButtonDuplicarToolBarValorRubroVariable.addActionListener(new ButtonActionListener(this,"DuplicarToolBarValorRubroVariable"));
			
		this.jMenuItemNuevoValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoValorRubroVariable"));
			
		this.jMenuItemDuplicarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarValorRubroVariable"));		
		
		
		this.jButtonNuevoRelacionesValorRubroVariable.addActionListener (new ButtonActionListener(this,"NuevoRelacionesValorRubroVariable"));
		
		
		this.jButtonNuevoRelacionesToolBarValorRubroVariable.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarValorRubroVariable"));
			
		this.jMenuItemNuevoRelacionesValorRubroVariable.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesValorRubroVariable"));		
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarValorRubroVariable.addActionListener(new ButtonActionListener(this,"ModificarValorRubroVariable"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonModificarToolBarValorRubroVariable.addActionListener(new ButtonActionListener(this,"ModificarToolBarValorRubroVariable"));
			
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemModificarValorRubroVariable.addActionListener(new ButtonActionListener(this,"MenuItemModificarValorRubroVariable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarValorRubroVariable.addActionListener (new ButtonActionListener(this,"ActualizarValorRubroVariable"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonActualizarToolBarValorRubroVariable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarValorRubroVariable"));
				
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemActualizarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarValorRubroVariable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarValorRubroVariable.addActionListener (new ButtonActionListener(this,"EliminarValorRubroVariable"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonEliminarToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"EliminarToolBarValorRubroVariable"));
						
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemEliminarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarValorRubroVariable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarValorRubroVariable.addActionListener (new ButtonActionListener(this,"CancelarValorRubroVariable"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonCancelarToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"CancelarToolBarValorRubroVariable"));
			
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemCancelarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarValorRubroVariable"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarValorRubroVariable"));		
		
		
		this.jButtonCerrarValorRubroVariable.addActionListener (new ButtonActionListener(this,"CerrarValorRubroVariable"));
		
		
		this.jButtonCerrarToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"CerrarToolBarValorRubroVariable"));
			
		this.jMenuItemCerrarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemCerrarValorRubroVariable"));
			
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jMenuItemDetalleCerrarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarValorRubroVariable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosValorRubroVariable.addActionListener (new ButtonActionListener(this,"GuardarCambiosValorRubroVariable"));
		}
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarValorRubroVariable"));
		}
		
		this.jButtonCopiarToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"CopiarToolBarValorRubroVariable"));
			
		this.jButtonVerFormToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"VerFormToolBarValorRubroVariable"));
		
		this.jMenuItemGuardarCambiosValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosValorRubroVariable"));
			
		this.jMenuItemCopiarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemCopiarValorRubroVariable"));		
		
		this.jMenuItemVerFormValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemVerFormValorRubroVariable"));		
		
		
		this.jButtonGuardarCambiosTablaValorRubroVariable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaValorRubroVariable"));
		
		
		this.jButtonGuardarCambiosTablaToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarValorRubroVariable"));
			
		this.jMenuItemGuardarCambiosTablaValorRubroVariable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaValorRubroVariable"));		
		
		
		
		this.jButtonRecargarInformacionValorRubroVariable.addActionListener (new ButtonActionListener(this,"RecargarInformacionValorRubroVariable"));
					
		this.jButtonRecargarInformacionToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarValorRubroVariable"));
		
		this.jMenuItemRecargarInformacionValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionValorRubroVariable"));		
		
		
		
		this.jButtonAnterioresValorRubroVariable.addActionListener (new ButtonActionListener(this,"AnterioresValorRubroVariable"));
		
		
		this.jButtonAnterioresToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"AnterioresToolBarValorRubroVariable"));
		
		this.jMenuItemAnterioresValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresValorRubroVariable"));		
		
		
		this.jButtonSiguientesValorRubroVariable.addActionListener (new ButtonActionListener(this,"SiguientesValorRubroVariable"));
		
		
		this.jButtonSiguientesToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"SiguientesToolBarValorRubroVariable"));
			
		this.jMenuItemSiguientesValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesValorRubroVariable"));
			
		this.jMenuItemAbrirOrderByValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByValorRubroVariable"));
			
		this.jMenuItemMostrarOcultarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarValorRubroVariable"));
			
		this.jMenuItemDetalleAbrirOrderByValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByValorRubroVariable"));
			
		this.jMenuItemDetalleMostarOcultarValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarValorRubroVariable"));		
		
		
		this.jButtonNuevoGuardarCambiosValorRubroVariable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosValorRubroVariable"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarValorRubroVariable"));
			
		this.jMenuItemNuevoGuardarCambiosValorRubroVariable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosValorRubroVariable"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosValorRubroVariable.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosValorRubroVariable"));

		this.jCheckBoxSeleccionadosValorRubroVariable.addItemListener(new CheckBoxItemListener(this,"SeleccionadosValorRubroVariable"));
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioValorRubroVariable"));
		}
		
		
		this.jComboBoxTiposRelacionesValorRubroVariable.addActionListener (new ButtonActionListener(this,"TiposRelacionesValorRubroVariable"));
			
		this.jComboBoxTiposAccionesValorRubroVariable.addActionListener (new ButtonActionListener(this,"TiposAccionesValorRubroVariable"));
					
		this.jComboBoxTiposSeleccionarValorRubroVariable.addActionListener (new ButtonActionListener(this,"TiposSeleccionarValorRubroVariable"));
			
		this.jTextFieldValorCampoGeneralValorRubroVariable.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralValorRubroVariable"));		
		
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonidValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"idValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empresaValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empresaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empleadoValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empleadoValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_rubro_empleaValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_rubro_empleaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaValorRubroVariableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonfechaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"fechaValorRubroVariableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonvalorValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"valorValorRubroVariableBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoValorRubroVariable.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoValorRubroVariable"));

			this.jButtonFK_IdRubroEmpleaValorRubroVariable.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaValorRubroVariable"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoValorRubroVariable!=null) {
				this.jInternalFrameReporteDinamicoValorRubroVariable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoValorRubroVariable"));
				this.jInternalFrameReporteDinamicoValorRubroVariable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoValorRubroVariable"));
				this.jInternalFrameReporteDinamicoValorRubroVariable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoValorRubroVariable"));
			}
			
			//this.jButtonCerrarReporteDinamicoValorRubroVariable.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoValorRubroVariable"));				
			//this.jButtonGenerarReporteDinamicoValorRubroVariable.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoValorRubroVariable"));
			//this.jButtonGenerarExcelReporteDinamicoValorRubroVariable.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoValorRubroVariable"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionValorRubroVariable!=null) {
				this.jInternalFrameImportacionValorRubroVariable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionValorRubroVariable"));
				this.jInternalFrameImportacionValorRubroVariable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionValorRubroVariable"));
				this.jInternalFrameImportacionValorRubroVariable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionValorRubroVariable"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByValorRubroVariable.addActionListener (new ButtonActionListener(this,"AbrirOrderByValorRubroVariable"));
			
			this.jButtonAbrirOrderByToolBarValorRubroVariable.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarValorRubroVariable"));			
			
			if(this.jInternalFrameOrderByValorRubroVariable!=null) {
				this.jInternalFrameOrderByValorRubroVariable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByValorRubroVariable"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormValorRubroVariable.jTabbedPaneRelacionesValorRubroVariable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesValorRubroVariable"));
		
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
            		closingInternalFrameValorRubroVariable();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormValorRubroVariable.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormValorRubroVariable = (JInternalFrameBase)event.getSource();
	            	
	            ValorRubroVariableBeanSwingJInternalFrame jInternalFrameParent=(ValorRubroVariableBeanSwingJInternalFrame)jInternalFrameDetalleFormValorRubroVariable.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarValorRubroVariableActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosValorRubroVariable.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosValorRubroVariableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosValorRubroVariable.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosValorRubroVariable.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorRubroVariableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorRubroVariableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorRubroVariableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoValorRubroVariable";
		inputMap = this.jButtonNuevoValorRubroVariable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoValorRubroVariable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoValorRubroVariableActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorRubroVariableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorRubroVariableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoValorRubroVariableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesValorRubroVariable";
		inputMap = this.jButtonNuevoRelacionesValorRubroVariable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesValorRubroVariable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoValorRubroVariableActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarValorRubroVariable";
		inputMap = this.jButtonModificarValorRubroVariable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarValorRubroVariable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarValorRubroVariableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarValorRubroVariable";
		inputMap = this.jButtonActualizarValorRubroVariable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarValorRubroVariable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarValorRubroVariableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarValorRubroVariable";
		inputMap = this.jButtonEliminarValorRubroVariable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarValorRubroVariable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarValorRubroVariableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarValorRubroVariable";
		inputMap = this.jButtonCancelarValorRubroVariable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarValorRubroVariable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarValorRubroVariableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarValorRubroVariable";
		inputMap = this.jButtonCerrarValorRubroVariable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarValorRubroVariable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarValorRubroVariableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosValorRubroVariable";
		inputMap = this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosValorRubroVariable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonGuardarCambiosValorRubroVariable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosValorRubroVariableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosValorRubroVariable.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosValorRubroVariableItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesValorRubroVariable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesValorRubroVariableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarValorRubroVariable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarValorRubroVariableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralValorRubroVariable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralValorRubroVariableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonidValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"idValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empresaValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empresaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empleadoValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_empleadoValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoValorRubroVariableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_rubro_empleaValorRubroVariableUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaValorRubroVariableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonid_rubro_empleaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaValorRubroVariableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonfechaValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"fechaValorRubroVariableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormValorRubroVariable.jButtonvalorValorRubroVariableBusqueda.addActionListener(new ButtonActionListener(this,"valorValorRubroVariableBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoValorRubroVariable.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoValorRubroVariable"));

		this.jButtonFK_IdRubroEmpleaValorRubroVariable.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaValorRubroVariable"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionValorRubroVariable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionValorRubroVariableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarValorRubroVariableActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarValorRubroVariable.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosValorRubroVariable(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
					valorrubrovariableAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ValorRubroVariable valorrubrovariableAux:valorrubrovariables) {
					valorrubrovariableAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosValorRubroVariableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingValorRubroVariable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
						valorrubrovariableAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ValorRubroVariable valorrubrovariableAux:valorrubrovariables) {
						valorrubrovariableAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ValorRubroVariable valorrubrovariableAux:valorrubrovariables) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaValorRubroVariable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosValorRubroVariable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosValorRubroVariable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosValorRubroVariableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingValorRubroVariable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosValorRubroVariable.getSelectedRows();
			
			ValorRubroVariable valorrubrovariableLocal=new ValorRubroVariable();
			
			//this.seleccionarTodosValorRubroVariable(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					valorrubrovariableLocal =(ValorRubroVariable) this.valorrubrovariableLogic.getValorRubroVariables().toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					valorrubrovariableLocal =(ValorRubroVariable) this.valorrubrovariables.toArray()[this.jTableDatosValorRubroVariable.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				valorrubrovariableLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
						valorrubrovariableAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ValorRubroVariable valorrubrovariableAux:valorrubrovariables) {
						valorrubrovariableAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaValorRubroVariable(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosValorRubroVariable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosValorRubroVariable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosValorRubroVariable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualValorRubroVariableItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarValorRubroVariableParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralValorRubroVariableActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingValorRubroVariable(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralValorRubroVariable.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariableLogic.getValorRubroVariables()) {
				
						if(sTipoSeleccionar.equals(ValorRubroVariableConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							valorrubrovariableAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ValorRubroVariableConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							valorrubrovariableAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ValorRubroVariable valorrubrovariableAux:valorrubrovariables) {
					
						if(sTipoSeleccionar.equals(ValorRubroVariableConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							valorrubrovariableAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ValorRubroVariableConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							valorrubrovariableAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaValorRubroVariable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesValorRubroVariableActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingValorRubroVariable(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioValorRubroVariable=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesValorRubroVariable.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteValorRubroVariable) {				
					conSplash=true;//false;										
					
					//this.startProcessValorRubroVariable(conSplash);
				
					this.generarReporteValorRubroVariablesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoValorRubroVariablesSeleccionados();
				//this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoValorRubroVariablesSeleccionados(false);
				//this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoValorRubroVariablesSeleccionados(true);
				//this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessValorRubroVariable();
				
				this.exportarValorRubroVariablesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionValorRubroVariables();
				//this.importarValorRubroVariables();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessValorRubroVariable();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelValorRubroVariablesSeleccionados();
				//this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Valor Rubro Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessValorRubroVariable();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoValorRubroVariable)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyValorRubroVariable(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.setSelectedIndex(0);					
				}	
			} 			
			else if(ValorRubroVariableBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteValorRubroVariable) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessValorRubroVariable(conSplash);
					
						//this.actualizarParametrosGeneralValorRubroVariable();
						
						this.generarReporteProcesoAccionValorRubroVariablesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ValorRubroVariableBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Valor Rubro VariableS SELECCIONADOS?", "MANTENIMIENTO DE Valor Rubro Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessValorRubroVariable();
				
						this.actualizarParametrosGeneralValorRubroVariable();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.valorrubrovariableReturnGeneral=valorrubrovariableLogic.procesarAccionValorRubroVariablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.valorrubrovariableLogic.getValorRubroVariables(),this.valorrubrovariableParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarValorRubroVariableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralValorRubroVariable();
					
					ValorRubroVariableBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarValorRubroVariableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesValorRubroVariable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxTiposAccionesFormularioValorRubroVariable.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessValorRubroVariable(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesValorRubroVariableActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessValorRubroVariable();
			
			if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		
			ValorRubroVariable valorrubrovariable=new ValorRubroVariable();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingValorRubroVariable(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesValorRubroVariable.getSelectedItem();
			
			
			
			
			valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
			//this.sTipoAccion;
			
			if(valorrubrovariablesSeleccionados.size()==1) {
				for(ValorRubroVariable valorrubrovariableAux:valorrubrovariablesSeleccionados) {
					valorrubrovariable=valorrubrovariableAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessValorRubroVariable();
			
      		//this.finishProcessValorRubroVariable(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarValorRubroVariableReturnGeneral() throws Exception {
		if(this.valorrubrovariableReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.valorrubrovariableReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.valorrubrovariableReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.valorrubrovariableReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.valorrubrovariableReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.valorrubrovariableReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingValorRubroVariable(false);
		}
		
		if(this.valorrubrovariableReturnGeneral.getConRetornoLista() || this.valorrubrovariableReturnGeneral.getConRetornoObjeto()) {
			if(this.valorrubrovariableReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.valorrubrovariableLogic.setValorRubroVariables(this.valorrubrovariableReturnGeneral.getValorRubroVariables());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.valorrubrovariableReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.valorrubrovariableLogic.setValorRubroVariable(this.valorrubrovariableReturnGeneral.getValorRubroVariable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingValorRubroVariable(false);
		}
	}
	
	public void actualizarParametrosGeneralValorRubroVariable() throws Exception {
		
		
	}
	
	public ArrayList<ValorRubroVariable> getValorRubroVariablesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioValorRubroVariable) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ValorRubroVariable valorrubrovariableAux:valorrubrovariableLogic.getValorRubroVariables()) {
					if(valorrubrovariableAux.getIsSelected()) {
						valorrubrovariablesSeleccionados.add(valorrubrovariableAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ValorRubroVariable valorrubrovariableAux:this.valorrubrovariables) {
					if(valorrubrovariableAux.getIsSelected()) {
						valorrubrovariablesSeleccionados.add(valorrubrovariableAux);				
					}
				}
			}
			
			if(valorrubrovariablesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						valorrubrovariablesSeleccionados.addAll(this.valorrubrovariableLogic.getValorRubroVariables());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						valorrubrovariablesSeleccionados.addAll(this.valorrubrovariables);				
					}
				}
			}
		} else {
			valorrubrovariablesSeleccionados.add(this.valorrubrovariable);
		}
		
		return valorrubrovariablesSeleccionados;
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
	
	public void generarReporteValorRubroVariablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalValorRubroVariablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoValorRubroVariablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoValorRubroVariablesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoValorRubroVariablesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Valor Rubro Variable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesValorRubroVariablesSeleccionados() throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteValorRubroVariables("Todos",valorrubrovariablesSeleccionados);
		
	}	
	
	public void generarReporteNormalValorRubroVariablesSeleccionados() throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteValorRubroVariables("Todos",valorrubrovariablesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionValorRubroVariablesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteValorRubroVariables("Todos",valorrubrovariablesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoValorRubroVariablesSeleccionados() throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		
		
		
		this.abrirInicializarFrameReporteDinamicoValorRubroVariable();
		
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoValorRubroVariable();
		
		
		//this.generarReporteValorRubroVariables("Todos",valorrubrovariablesSeleccionados ,valorrubrovariableImplementable,valorrubrovariableImplementableHome);
	}
	
	public void mostrarImportacionValorRubroVariables() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionValorRubroVariable();
		
		this.abrirFrameImportacionValorRubroVariable();		
		
			
		//this.generarReporteValorRubroVariables("Todos",valorrubrovariablesSeleccionados ,valorrubrovariableImplementable,valorrubrovariableImplementableHome);
	}
	
	public void importarValorRubroVariables() throws Exception {		
	
	}
	
	public void exportarValorRubroVariablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelValorRubroVariablesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoValorRubroVariablesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlValorRubroVariablesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Valor Rubro Variable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoValorRubroVariablesSeleccionados() throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorrubrovariable."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarValorRubroVariable(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ValorRubroVariable valorrubrovariableAux:valorrubrovariablesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarValorRubroVariable(valorrubrovariableAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//valorrubrovariableAux.setsDetalleGeneralEntityReporte(valorrubrovariableAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarValorRubroVariable(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ValorRubroVariableConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorRubroVariableConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorRubroVariableConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ValorRubroVariableConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarValorRubroVariable(ValorRubroVariable valorrubrovariable,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=valorrubrovariable.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=valorrubrovariable.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=valorrubrovariable.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=valorrubrovariable.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=valorrubrovariable.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=valorrubrovariable.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=valorrubrovariable.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelValorRubroVariablesSeleccionados() throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorrubrovariable.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ValorRubroVariables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelValorRubroVariable(row);				
				iRow++;
			}				
			
			for(ValorRubroVariable valorrubrovariableAux:valorrubrovariablesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelValorRubroVariable(valorrubrovariableAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlValorRubroVariablesSeleccionados() throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();		
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"valorrubrovariable.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("valorrubrovariables");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("valorrubrovariable");
			//elementRoot.appendChild(element);
		
			for(ValorRubroVariable valorrubrovariableAux:valorrubrovariablesSeleccionados) {
				element = document.createElement("valorrubrovariable");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlValorRubroVariable(valorrubrovariableAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Valor Rubro Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelValorRubroVariable(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ValorRubroVariableConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelValorRubroVariable(ValorRubroVariable valorrubrovariable,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(valorrubrovariable.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(valorrubrovariable.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(valorrubrovariable.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(valorrubrovariable.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(valorrubrovariable.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(valorrubrovariable.getvalor());				
	}
	
	public void setFilaDatosExportarXmlValorRubroVariable(ValorRubroVariable valorrubrovariable,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ValorRubroVariableConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(valorrubrovariable.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ValorRubroVariableConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(valorrubrovariable.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ValorRubroVariableConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(valorrubrovariable.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(ValorRubroVariableConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(valorrubrovariable.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(ValorRubroVariableConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(valorrubrovariable.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementfecha = document.createElement(ValorRubroVariableConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(valorrubrovariable.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor = document.createElement(ValorRubroVariableConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(valorrubrovariable.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoValorRubroVariablesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados=new ArrayList<ValorRubroVariable>();
		
		valorrubrovariablesSeleccionados=this.getValorRubroVariablesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoValorRubroVariable(valorrubrovariablesSeleccionados);
		
		this.generarReporteValorRubroVariables("Todos",valorrubrovariablesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoValorRubroVariable(ArrayList<ValorRubroVariable> valorrubrovariablesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ValorRubroVariable valorrubrovariableAux:valorrubrovariablesSeleccionados) {
				valorrubrovariableAux.setsDetalleGeneralEntityReporte(valorrubrovariableAux.toString());
			
				if(sTipoSeleccionar.equals(ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					valorrubrovariableAux.setsDescripcionGeneralEntityReporte1(valorrubrovariableAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					valorrubrovariableAux.setsDescripcionGeneralEntityReporte1(valorrubrovariableAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					valorrubrovariableAux.setsDescripcionGeneralEntityReporte1(valorrubrovariableAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ValorRubroVariableConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					valorrubrovariableAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(valorrubrovariableAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ValorRubroVariableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesValorRubroVariable(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoValorRubroVariable=true;
				this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=true;
				this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=true;
			}
			
			this.isVisibilidadCeldaModificarValorRubroVariable=false;
			this.isVisibilidadCeldaActualizarValorRubroVariable=false;
			this.isVisibilidadCeldaEliminarValorRubroVariable=false;
			this.isVisibilidadCeldaCancelarValorRubroVariable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorRubroVariable=true;
				} else {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoValorRubroVariable=false;
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=false;
			this.isVisibilidadCeldaModificarValorRubroVariable=false;
			this.isVisibilidadCeldaActualizarValorRubroVariable=true;
			this.isVisibilidadCeldaEliminarValorRubroVariable=false;
			this.isVisibilidadCeldaCancelarValorRubroVariable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorRubroVariable=true;
				} else {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoValorRubroVariable=false;
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=false;
			this.isVisibilidadCeldaModificarValorRubroVariable=false;
			this.isVisibilidadCeldaActualizarValorRubroVariable=true;
			this.isVisibilidadCeldaEliminarValorRubroVariable=true;
			this.isVisibilidadCeldaCancelarValorRubroVariable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorRubroVariable=true;
				} else {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoValorRubroVariable=false;
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=false;
			this.isVisibilidadCeldaModificarValorRubroVariable=false;
			this.isVisibilidadCeldaActualizarValorRubroVariable=true;
			this.isVisibilidadCeldaEliminarValorRubroVariable=false;
			this.isVisibilidadCeldaCancelarValorRubroVariable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				} else {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoValorRubroVariable=true;
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=true;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=true;
			this.isVisibilidadCeldaModificarValorRubroVariable=false;
			this.isVisibilidadCeldaActualizarValorRubroVariable=false;
			this.isVisibilidadCeldaEliminarValorRubroVariable=false;
			this.isVisibilidadCeldaCancelarValorRubroVariable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorRubroVariable=true;
				} else {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoValorRubroVariable=false;
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=false;
			this.isVisibilidadCeldaActualizarValorRubroVariable=false;
			this.isVisibilidadCeldaEliminarValorRubroVariable=false;
			this.isVisibilidadCeldaCancelarValorRubroVariable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				} else {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoValorRubroVariable=false;
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=false;
			this.isVisibilidadCeldaModificarValorRubroVariable=true;
			this.isVisibilidadCeldaActualizarValorRubroVariable=false;
			this.isVisibilidadCeldaEliminarValorRubroVariable=false;
			this.isVisibilidadCeldaCancelarValorRubroVariable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				} else {
					this.isVisibilidadCeldaGuardarValorRubroVariable=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoValorRubroVariable=true;
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=true;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=true;
		} else {
			this.actualizarEstadoPanelsValorRubroVariable(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarValorRubroVariable=false;
			//this.isVisibilidadCeldaVerFormValorRubroVariable=false;
			this.isVisibilidadCeldaDuplicarValorRubroVariable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!valorrubrovariableSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
		} else {
			this.isVisibilidadCeldaNuevoValorRubroVariable=false;
			this.isVisibilidadCeldaGuardarCambiosValorRubroVariable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			if(!valorrubrovariableSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;												
			}
			
			this.jButtonCerrarValorRubroVariable.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesValorRubroVariable=false;
		}
		
		if(!this.permiteMantenimiento(this.valorrubrovariable)) {
			this.isVisibilidadCeldaActualizarValorRubroVariable=false;
			this.isVisibilidadCeldaEliminarValorRubroVariable=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesValorRubroVariable() {
	}
	
	public void actualizarEstadoPanelsValorRubroVariable(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionValorRubroVariable!=null) {
				this.jScrollPanelDatosEdicionValorRubroVariable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosValorRubroVariable!=null) {
				this.jScrollPanelDatosValorRubroVariable.setVisible(true);
			}
			
			if(this.jPanelPaginacionValorRubroVariable!=null) {
				this.jPanelPaginacionValorRubroVariable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionValorRubroVariable!=null) {
				this.jScrollPanelDatosEdicionValorRubroVariable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosValorRubroVariable!=null) {
				this.jScrollPanelDatosValorRubroVariable.setVisible(false);
			}
			
			if(this.jPanelPaginacionValorRubroVariable!=null) {
				this.jPanelPaginacionValorRubroVariable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionValorRubroVariable!=null) {
				this.jScrollPanelDatosEdicionValorRubroVariable.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosValorRubroVariable!=null) {
				this.jScrollPanelDatosValorRubroVariable.setVisible(false);
			}
			
			if(this.jPanelPaginacionValorRubroVariable!=null) {
				this.jPanelPaginacionValorRubroVariable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionValorRubroVariable!=null) {
				this.jScrollPanelDatosEdicionValorRubroVariable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosValorRubroVariable!=null) {
				this.jScrollPanelDatosValorRubroVariable.setVisible(false);
			}
			
			if(this.jPanelPaginacionValorRubroVariable!=null) {
				this.jPanelPaginacionValorRubroVariable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionValorRubroVariable!=null) {
				this.jScrollPanelDatosEdicionValorRubroVariable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosValorRubroVariable!=null) {
				this.jScrollPanelDatosValorRubroVariable.setVisible(true);
			}
			
			if(this.jPanelPaginacionValorRubroVariable!=null) {
				this.jPanelPaginacionValorRubroVariable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionValorRubroVariable!=null) {
				this.jScrollPanelDatosEdicionValorRubroVariable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosValorRubroVariable!=null) {
				this.jScrollPanelDatosValorRubroVariable.setVisible(true);
			}
			
			if(this.jPanelPaginacionValorRubroVariable!=null) {
				this.jPanelPaginacionValorRubroVariable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionValorRubroVariable!=null) {
				this.jScrollPanelDatosEdicionValorRubroVariable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosValorRubroVariable!=null) {
				this.jScrollPanelDatosValorRubroVariable.setVisible(true);
			}
			
			if(this.jPanelPaginacionValorRubroVariable!=null) {
				this.jPanelPaginacionValorRubroVariable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
					this.jTabbedPaneBusquedasValorRubroVariable.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasValorRubroVariable!=null) {
				this.jTabbedPaneBusquedasValorRubroVariable.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesValorRubroVariable!=null) {
				this.jPanelParametrosReportesValorRubroVariable.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasValorRubroVariable.remove(jPanelFK_IdEmpleadoValorRubroVariable);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasValorRubroVariable.remove(jPanelFK_IdRubroEmpleaValorRubroVariable);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasValorRubroVariable.remove(jPanelFK_IdEmpleadoValorRubroVariable);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasValorRubroVariable.remove(jPanelFK_IdRubroEmpleaValorRubroVariable);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdEmpleado=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasValorRubroVariable.remove(jPanelFK_IdEmpleadoValorRubroVariable);}

			this.isVisibilidadFK_IdRubroEmplea=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasValorRubroVariable.remove(jPanelFK_IdRubroEmpleaValorRubroVariable);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ValorRubroVariableSessionBean valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
		
		if(this.valorrubrovariableSessionBean==null) {
			this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
		}
		
		this.valorrubrovariableSessionBean.setsUltimaBusquedaValorRubroVariable(this.getsAccionBusqueda());
		this.valorrubrovariableSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.valorrubrovariableSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			valorrubrovariableSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			valorrubrovariableSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
			valorrubrovariableSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdRubroEmplea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ValorRubroVariableSessionBean valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
		
		if(this.valorrubrovariableSessionBean==null) {
			this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
		}
		
		if(this.valorrubrovariableSessionBean.getsUltimaBusquedaValorRubroVariable()!=null&&!this.valorrubrovariableSessionBean.getsUltimaBusquedaValorRubroVariable().equals("")) {
			this.setsAccionBusqueda(valorrubrovariableSessionBean.getsUltimaBusquedaValorRubroVariable());
			this.setiNumeroPaginacion(valorrubrovariableSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(valorrubrovariableSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(valorrubrovariableSessionBean.getid_empleado());
				valorrubrovariableSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(valorrubrovariableSessionBean.getid_empresa());
				valorrubrovariableSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
				this.setid_rubro_empleaFK_IdRubroEmplea(valorrubrovariableSessionBean.getid_rubro_emplea());
				valorrubrovariableSessionBean.setid_rubro_emplea(-1L);
			}
		}
		
		this.valorrubrovariableSessionBean.setsUltimaBusquedaValorRubroVariable("");
		this.valorrubrovariableSessionBean.setiNumeroPaginacion(ValorRubroVariableConstantesFunciones.INUMEROPAGINACION);
		this.valorrubrovariableSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaValorRubroVariable(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioValorRubroVariable() {
		this.updateBorderResaltarBusquedasFormularioValorRubroVariable();
		this.updateVisibilidadBusquedasFormularioValorRubroVariable();
		this.updateHabilitarBusquedasFormularioValorRubroVariable();
	}
	
	public void updateBorderResaltarBusquedasFormularioValorRubroVariable() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasValorRubroVariable.getComponents().length>0) {
	

		if(this.valorrubrovariableConstantesFunciones.resaltarFK_IdEmpleadoValorRubroVariable!=null) {
			index= this.jTabbedPaneBusquedasValorRubroVariable.indexOfComponent(this.jPanelFK_IdEmpleadoValorRubroVariable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasValorRubroVariable.getComponent(index);
				jPanel.setBorder(this.valorrubrovariableConstantesFunciones.resaltarFK_IdEmpleadoValorRubroVariable);
			}
		}

		if(this.valorrubrovariableConstantesFunciones.resaltarFK_IdRubroEmpleaValorRubroVariable!=null) {
			index= this.jTabbedPaneBusquedasValorRubroVariable.indexOfComponent(this.jPanelFK_IdRubroEmpleaValorRubroVariable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasValorRubroVariable.getComponent(index);
				jPanel.setBorder(this.valorrubrovariableConstantesFunciones.resaltarFK_IdRubroEmpleaValorRubroVariable);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioValorRubroVariable() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasValorRubroVariable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasValorRubroVariable.indexOfComponent(this.jPanelFK_IdEmpleadoValorRubroVariable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasValorRubroVariable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.valorrubrovariableConstantesFunciones.mostrarFK_IdEmpleadoValorRubroVariable);
			if(!this.valorrubrovariableConstantesFunciones.mostrarFK_IdEmpleadoValorRubroVariable && index>-1) {
				this.jTabbedPaneBusquedasValorRubroVariable.remove(index);
			}

			index= this.jTabbedPaneBusquedasValorRubroVariable.indexOfComponent(this.jPanelFK_IdRubroEmpleaValorRubroVariable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasValorRubroVariable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.valorrubrovariableConstantesFunciones.mostrarFK_IdRubroEmpleaValorRubroVariable);
			if(!this.valorrubrovariableConstantesFunciones.mostrarFK_IdRubroEmpleaValorRubroVariable && index>-1) {
				this.jTabbedPaneBusquedasValorRubroVariable.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioValorRubroVariable() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasValorRubroVariable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasValorRubroVariable.indexOfComponent(this.jPanelFK_IdEmpleadoValorRubroVariable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasValorRubroVariable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.valorrubrovariableConstantesFunciones.activarFK_IdEmpleadoValorRubroVariable);
				this.jTabbedPaneBusquedasValorRubroVariable.setEnabledAt(index,this.valorrubrovariableConstantesFunciones.activarFK_IdEmpleadoValorRubroVariable);
			}

			index= this.jTabbedPaneBusquedasValorRubroVariable.indexOfComponent(this.jPanelFK_IdRubroEmpleaValorRubroVariable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasValorRubroVariable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.valorrubrovariableConstantesFunciones.activarFK_IdRubroEmpleaValorRubroVariable);
				this.jTabbedPaneBusquedasValorRubroVariable.setEnabledAt(index,this.valorrubrovariableConstantesFunciones.activarFK_IdRubroEmpleaValorRubroVariable);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaValorRubroVariable(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasValorRubroVariable.indexOfComponent(this.jPanelFK_IdEmpleadoValorRubroVariable);

			this.jTabbedPaneBusquedasValorRubroVariable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasValorRubroVariable.getComponent(index);

			this.valorrubrovariableConstantesFunciones.setResaltarFK_IdEmpleadoValorRubroVariable(resaltar);

			jPanel.setBorder(this.valorrubrovariableConstantesFunciones.resaltarFK_IdEmpleadoValorRubroVariable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRubroEmplea")) {
			index= this.jTabbedPaneBusquedasValorRubroVariable.indexOfComponent(this.jPanelFK_IdRubroEmpleaValorRubroVariable);

			this.jTabbedPaneBusquedasValorRubroVariable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasValorRubroVariable.getComponent(index);

			this.valorrubrovariableConstantesFunciones.setResaltarFK_IdRubroEmpleaValorRubroVariable(resaltar);

			jPanel.setBorder(this.valorrubrovariableConstantesFunciones.resaltarFK_IdRubroEmpleaValorRubroVariable);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarValorRubroVariable.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioValorRubroVariable() throws Exception {

		if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioValorRubroVariable();
		this.updateVisibilidadResaltarControlesFormularioValorRubroVariable();
		this.updateHabilitarResaltarControlesFormularioValorRubroVariable();
		
	}
	
	public void updateBorderResaltarControlesFormularioValorRubroVariable() throws Exception {
		if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.valorrubrovariableConstantesFunciones.resaltaridValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable!=null) {this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.setBorder(this.valorrubrovariableConstantesFunciones.resaltaridValorRubroVariable);}
		if(this.valorrubrovariableConstantesFunciones.resaltarid_empresaValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable!=null) {this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setBorder(this.valorrubrovariableConstantesFunciones.resaltarid_empresaValorRubroVariable);}
		if(this.valorrubrovariableConstantesFunciones.resaltarid_empleadoValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable!=null) {this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setBorder(this.valorrubrovariableConstantesFunciones.resaltarid_empleadoValorRubroVariable);}
		if(this.valorrubrovariableConstantesFunciones.resaltarid_rubro_empleaValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable!=null) {this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setBorder(this.valorrubrovariableConstantesFunciones.resaltarid_rubro_empleaValorRubroVariable);}
		if(this.valorrubrovariableConstantesFunciones.resaltarfechaValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable!=null) {this.jInternalFrameDetalleFormValorRubroVariable.jDateChooserfechaValorRubroVariable.setBorder(this.valorrubrovariableConstantesFunciones.resaltarfechaValorRubroVariable);}
		if(this.valorrubrovariableConstantesFunciones.resaltarvalorValorRubroVariable!=null && this.jInternalFrameDetalleFormValorRubroVariable!=null) {this.jInternalFrameDetalleFormValorRubroVariable.jTextFieldvalorValorRubroVariable.setBorder(this.valorrubrovariableConstantesFunciones.resaltarvalorValorRubroVariable);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioValorRubroVariable() throws Exception {		
		if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
	
		//this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostraridValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jPanelidValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostraridValorRubroVariable);
		//this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarid_empresaValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jPanelid_empresaValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarid_empresaValorRubroVariable);
		//this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarid_empleadoValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jPanelid_empleadoValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarid_empleadoValorRubroVariable);
		//this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarid_rubro_empleaValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jPanelid_rubro_empleaValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarid_rubro_empleaValorRubroVariable);
		//this.jInternalFrameDetalleFormValorRubroVariable.jDateChooserfechaValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarfechaValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jPanelfechaValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarfechaValorRubroVariable);
		//this.jInternalFrameDetalleFormValorRubroVariable.jTextFieldvalorValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarvalorValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jPanelvalorValorRubroVariable.setVisible(this.valorrubrovariableConstantesFunciones.mostrarvalorValorRubroVariable);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioValorRubroVariable() throws Exception {
		if(this.jInternalFrameDetalleFormValorRubroVariable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormValorRubroVariable!=null) {
	
		this.jInternalFrameDetalleFormValorRubroVariable.jLabelidValorRubroVariable.setEnabled(this.valorrubrovariableConstantesFunciones.activaridValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empresaValorRubroVariable.setEnabled(this.valorrubrovariableConstantesFunciones.activarid_empresaValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_empleadoValorRubroVariable.setEnabled(this.valorrubrovariableConstantesFunciones.activarid_empleadoValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jComboBoxid_rubro_empleaValorRubroVariable.setEnabled(this.valorrubrovariableConstantesFunciones.activarid_rubro_empleaValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jDateChooserfechaValorRubroVariable.setEnabled(this.valorrubrovariableConstantesFunciones.activarfechaValorRubroVariable);
		this.jInternalFrameDetalleFormValorRubroVariable.jTextFieldvalorValorRubroVariable.setEnabled(this.valorrubrovariableConstantesFunciones.activarvalorValorRubroVariable);
		}
	}
	
		
}