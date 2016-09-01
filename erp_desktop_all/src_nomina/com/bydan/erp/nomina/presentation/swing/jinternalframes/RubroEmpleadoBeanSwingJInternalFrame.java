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

import com.bydan.erp.nomina.util.RubroEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.RubroEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.RubroEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.RubroEmpleadoBean;
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
public class RubroEmpleadoBeanSwingJInternalFrame extends RubroEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RubroEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RubroEmpleado> rubroempleadoValidator = new ClassValidator<RubroEmpleado>(RubroEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RubroEmpleado rubroempleado;	
	public RubroEmpleado rubroempleadoAux;
	public RubroEmpleado rubroempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RubroEmpleado rubroempleadoTotales;
	public Long idRubroEmpleadoActual;
	public Long iIdNuevoRubroEmpleado=0L;
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

	public String sFinalQueryComboEstadoRubro="";

	public List<EstadoRubro> estadorubrosForeignKey;

	public List<EstadoRubro> getestadorubrosForeignKey() {
		return estadorubrosForeignKey;
	}

	public void setestadorubrosForeignKey(List<EstadoRubro> estadorubrosForeignKey) {
		this.estadorubrosForeignKey = estadorubrosForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoRubro estadorubroForeignKey;

	public EstadoRubro getestadorubroForeignKey() {
		return estadorubroForeignKey;
	}

	public void setestadorubroForeignKey(EstadoRubro estadorubroForeignKey) {
		this.estadorubroForeignKey = estadorubroForeignKey;
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
	
	public Boolean isPermisoTodoRubroEmpleado;
	public Boolean isPermisoNuevoRubroEmpleado;
	public Boolean isPermisoActualizarRubroEmpleado;
	public Boolean isPermisoActualizarOriginalRubroEmpleado;
	public Boolean isPermisoEliminarRubroEmpleado;
	public Boolean isPermisoGuardarCambiosRubroEmpleado;
	public Boolean isPermisoConsultaRubroEmpleado;
	public Boolean isPermisoBusquedaRubroEmpleado;
	public Boolean isPermisoReporteRubroEmpleado;
	public Boolean isPermisoPaginacionMedioRubroEmpleado;
	public Boolean isPermisoPaginacionAltoRubroEmpleado;
	public Boolean isPermisoPaginacionTodoRubroEmpleado;
	public Boolean isPermisoCopiarRubroEmpleado;
	public Boolean isPermisoVerFormRubroEmpleado;
	public Boolean isPermisoDuplicarRubroEmpleado;
	public Boolean isPermisoOrdenRubroEmpleado;
	
	
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
	
	public RubroEmpleadoParameterReturnGeneral rubroempleadoReturnGeneral;
	public RubroEmpleadoParameterReturnGeneral rubroempleadoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRubroEmpleado=false;
	public Boolean esParaAccionDesdeFormularioRubroEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RubroEmpleadoSessionBeanAdditional rubroempleadoSessionBeanAdditional=null;
	
	public RubroEmpleadoSessionBeanAdditional getRubroEmpleadoSessionBeanAdditional() {
		return this.rubroempleadoSessionBeanAdditional;
	}
	
	public void setRubroEmpleadoSessionBeanAdditional(RubroEmpleadoSessionBeanAdditional rubroempleadoSessionBeanAdditional) {
		try {
			this.rubroempleadoSessionBeanAdditional=rubroempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RubroEmpleadoBeanSwingJInternalFrameAdditional rubroempleadoBeanSwingJInternalFrameAdditional=null;
	//public class RubroEmpleadoBeanSwingJInternalFrame
	
	public RubroEmpleadoBeanSwingJInternalFrameAdditional getRubroEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.rubroempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setRubroEmpleadoBeanSwingJInternalFrameAdditional(RubroEmpleadoBeanSwingJInternalFrameAdditional rubroempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.rubroempleadoBeanSwingJInternalFrameAdditional=rubroempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RubroEmpleadoLogic rubroempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RubroEmpleado rubroempleadoBean;
	public RubroEmpleadoConstantesFunciones rubroempleadoConstantesFunciones;
	//public RubroEmpleadoParameterReturnGeneral rubroempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	public EstadoRubroLogic estadorubroLogic;
	
	//PARAMETROS
	
	
	//public List<RubroEmpleado> rubroempleados;	
	//public List<RubroEmpleado> rubroempleadosEliminados;
	//public List<RubroEmpleado> rubroempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRubroEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarRubroEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarRubroEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormRubroEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenRubroEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
	public Boolean isVisibilidadCeldaModificarRubroEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarRubroEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarRubroEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarRubroEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarRubroEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRubroEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoRubro=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	
	public Long getiIdNuevoRubroEmpleado() {
		return this.iIdNuevoRubroEmpleado;
	}

	public void setiIdNuevoRubroEmpleado(Long iIdNuevoRubroEmpleado) {
		this.iIdNuevoRubroEmpleado = iIdNuevoRubroEmpleado;
	}
	
	public Long getidRubroEmpleadoActual() {
		return this.idRubroEmpleadoActual;
	}

	public void setidRubroEmpleadoActual(Long idRubroEmpleadoActual) {
		this.idRubroEmpleadoActual = idRubroEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RubroEmpleado getrubroempleado() {
		return this.rubroempleado;
	}

	public void setrubroempleado(RubroEmpleado rubroempleado) {
		this.rubroempleado = rubroempleado;
	}
	
	public RubroEmpleado getrubroempleadoAux() {
		return this.rubroempleadoAux;
	}

	public void setrubroempleadoAux(RubroEmpleado rubroempleadoAux) {
		this.rubroempleadoAux = rubroempleadoAux;
	}				
	
	public RubroEmpleado getrubroempleadoAnterior() {
		return this.rubroempleadoAnterior;
	}

	public void setrubroempleadoAnterior(RubroEmpleado rubroempleadoAnterior) {
		this.rubroempleadoAnterior = rubroempleadoAnterior;
	}	
	
	public RubroEmpleado getrubroempleadoTotales() {
		return this.rubroempleadoTotales;
	}

	public void setrubroempleadoTotales(RubroEmpleado rubroempleadoTotales) {
		this.rubroempleadoTotales = rubroempleadoTotales;
	}	
	
	public RubroEmpleado getrubroempleadoBean() {
		return this.rubroempleadoBean;
	}

	public void setrubroempleadoBean(RubroEmpleado rubroempleadoBean) {
		this.rubroempleadoBean = rubroempleadoBean;
	}	
	
	public RubroEmpleadoParameterReturnGeneral getrubroempleadoReturnGeneral() {
		return this.rubroempleadoReturnGeneral;
	}

	public void setrubroempleadoReturnGeneral(RubroEmpleadoParameterReturnGeneral rubroempleadoReturnGeneral) {
		this.rubroempleadoReturnGeneral = rubroempleadoReturnGeneral;
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

	public Long id_estado_rubroFK_IdEstadoRubro=-1L;

	public Long getid_estado_rubroFK_IdEstadoRubro() {
		return this.id_estado_rubroFK_IdEstadoRubro;
	}

	public void setid_estado_rubroFK_IdEstadoRubro(Long id_estado_rubroFK_IdEstadoRubro) {
		this.id_estado_rubroFK_IdEstadoRubro = id_estado_rubroFK_IdEstadoRubro;
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
	
	
	public RubroEmpleadoLogic getRubroEmpleadoLogic()	{		
		return rubroempleadoLogic;
	}

	public void setRubroEmpleadoLogic(RubroEmpleadoLogic rubroempleadoLogic) {
		this.rubroempleadoLogic = rubroempleadoLogic;
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
	
	public Boolean getIsEsNuevoRubroEmpleado() {
		return isEsNuevoRubroEmpleado;
	}

	public void setIsEsNuevoRubroEmpleado(Boolean isEsNuevoRubroEmpleado) {
		this.isEsNuevoRubroEmpleado = isEsNuevoRubroEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioRubroEmpleado() {
		return esParaAccionDesdeFormularioRubroEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioRubroEmpleado(Boolean esParaAccionDesdeFormularioRubroEmpleado) {
		this.esParaAccionDesdeFormularioRubroEmpleado = esParaAccionDesdeFormularioRubroEmpleado;
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

			if(this.rubroempleadoSessionBean==null) {
				this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
			}

			if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rubroempleadoSessionBean.getlidEmpresaActual());
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

			if(this.rubroempleadoSessionBean==null) {
				this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
			}

			if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(rubroempleadoSessionBean.getlidEmpleadoActual());
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

			if(this.rubroempleadoSessionBean==null) {
				this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
			}

			if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
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
					rubroempleaLogic.getEntityWithConnection(rubroempleadoSessionBean.getlidRubroEmpleaActual());
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

	public void cargarCombosEstadoRubrosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadorubrosForeignKey=new ArrayList<EstadoRubro>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoRubroLogic estadorubroLogic=new EstadoRubroLogic();

			//estadorubroLogic.getEstadoRubroDataAccess().setIsForForeingKeyData(true);

			if(this.rubroempleadoSessionBean==null) {
				this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
			}

			if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoRubro()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadorubroLogic.getEstadoRubroDataAccess().setIsForForeingKeyData(true);

					estadorubroLogic.getTodosEstadoRubrosWithConnection(sFinalQuery,new Pagination());

					this.estadorubrosForeignKey=estadorubroLogic.getEstadoRubros();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoRubro(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadorubroLogic.getEntityWithConnection(rubroempleadoSessionBean.getlidEstadoRubroActual());
					this.estadorubrosForeignKey.add(estadorubroLogic.getEstadoRubro());
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

					if(this.rubroempleado!=null) {
						this.rubroempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
						this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRubroEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRubroEmpleadoGenerico)throws Exception
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
				jComboBoxid_empresaRubroEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRubroEmpleadoGenerico!=null && jComboBoxid_empresaRubroEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaRubroEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.rubroempleado!=null) {
						this.rubroempleado.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
						this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoRubroEmpleado.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoRubroEmpleadoGenerico)throws Exception
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
				jComboBoxid_empleadoRubroEmpleadoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoRubroEmpleadoGenerico!=null && jComboBoxid_empleadoRubroEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoRubroEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.rubroempleado!=null) {
						this.rubroempleado.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
						this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaRubroEmpleado.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado!=null) {
						jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado!=null) {
							//jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setSelectedIndex(0);
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
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaRubroEmpleadoGenerico)throws Exception
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
				jComboBoxid_rubro_empleaRubroEmpleadoGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaRubroEmpleadoGenerico!=null && jComboBoxid_rubro_empleaRubroEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaRubroEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoRubroForeignKey(Long idEstadoRubroSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoRubro  estadorubroTemp=null;

			for(EstadoRubro estadorubroAux:estadorubrosForeignKey) {
				if(estadorubroAux.getId()!=null && estadorubroAux.getId().equals(idEstadoRubroSeleccionado)) {
					estadorubroTemp=estadorubroAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadorubroTemp!=null) {

					if(this.rubroempleado!=null) {
						this.rubroempleado.setEstadoRubro(estadorubroTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
						this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setSelectedItem(estadorubroTemp);
					}
				} else {
					//jComboBoxid_estado_rubroRubroEmpleado.setSelectedItem(estadorubroTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoRubro") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadorubroTemp!=null && jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado!=null) {
						jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setSelectedItem(estadorubroTemp);
					} else {
						if(jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado!=null) {
							//jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setSelectedItem(estadorubroTemp);
							if(jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.getItemCount()>0) {
								jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setSelectedIndex(0);
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

	public String getActualEstadoRubroForeignKeyDescripcion(Long idEstadoRubroSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoRubro  estadorubroTemp=null;

			for(EstadoRubro estadorubroAux:estadorubrosForeignKey) {
				if(estadorubroAux.getId()!=null && estadorubroAux.getId().equals(idEstadoRubroSeleccionado)) {
					estadorubroTemp=estadorubroAux;
					break;
				}
			}


			sDescripcion=EstadoRubroConstantesFunciones.getEstadoRubroDescripcion(estadorubroTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoRubroForeignKeyGenerico(Long idEstadoRubroSeleccionado,JComboBox jComboBoxid_estado_rubroRubroEmpleadoGenerico)throws Exception
	{
		try
		{
			EstadoRubro  estadorubroTemp=null;

			for(EstadoRubro estadorubroAux:estadorubrosForeignKey) {
				if(estadorubroAux.getId()!=null && estadorubroAux.getId().equals(idEstadoRubroSeleccionado)) {
					estadorubroTemp=estadorubroAux;
					break;
				}
			}

			if(estadorubroTemp!=null) {
				jComboBoxid_estado_rubroRubroEmpleadoGenerico.setSelectedItem(estadorubroTemp);
			} else {
				if(jComboBoxid_estado_rubroRubroEmpleadoGenerico!=null && jComboBoxid_estado_rubroRubroEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_estado_rubroRubroEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RubroEmpleado rubroempleado,JComboBox jComboBoxid_empresaRubroEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRubroEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRubroEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				rubroempleado.setid_empresa(empresaAux.getId());
				rubroempleado.setempresa_descripcion(RubroEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				rubroempleado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(RubroEmpleado rubroempleado,JComboBox jComboBoxid_empleadoRubroEmpleadoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoRubroEmpleadoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoRubroEmpleadoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				rubroempleado.setid_empleado(empleadoAux.getId());
				rubroempleado.setempleado_descripcion(RubroEmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				rubroempleado.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(RubroEmpleado rubroempleado,JComboBox jComboBoxid_rubro_empleaRubroEmpleadoGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaRubroEmpleadoGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaRubroEmpleadoGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				rubroempleado.setid_rubro_emplea(rubroempleaAux.getId());
				rubroempleado.setrubroemplea_descripcion(RubroEmpleadoConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				rubroempleado.setRubroEmplea(rubroempleaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoRubroForeignKey(RubroEmpleado rubroempleado,JComboBox jComboBoxid_estado_rubroRubroEmpleadoGenerico)throws Exception
	{
		try
		{
			EstadoRubro  estadorubroAux=new EstadoRubro();

			if(jComboBoxid_estado_rubroRubroEmpleadoGenerico==null) {
				estadorubroAux=(EstadoRubro)this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.getSelectedItem();
			} else {
				estadorubroAux=(EstadoRubro)jComboBoxid_estado_rubroRubroEmpleadoGenerico.getSelectedItem();
			}

			if(estadorubroAux!=null && estadorubroAux.getId()!=null) {
				rubroempleado.setid_estado_rubro(estadorubroAux.getId());
				rubroempleado.setestadorubro_descripcion(RubroEmpleadoConstantesFunciones.getEstadoRubroDescripcion(estadorubroAux));
				rubroempleado.setEstadoRubro(estadorubroAux);			}
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

					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { 
					}

					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { 
					}

					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.addItem(empleado);
							}
						}

						if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { 
					}

					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.addItem(rubroemplea);
							}
						}

						if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoRubrosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoRubro=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.removeAllItems();

							for(EstadoRubro estadorubro:this.estadorubrosForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.addItem(estadorubro);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { 
					}

					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoRubro") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.removeAllItems();

							for(EstadoRubro estadorubro:this.estadorubrosForeignKey) {
								this.jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.addItem(estadorubro);
							}
						}

						if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoRubroForeignKey(EstadoRubro estadorubro,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setSelectedItem(estadorubro);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setSelectedItem(estadorubro);
						} else {
							this.jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRubroEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RubroEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesRubroEmpleado(this.rubroempleadoLogic.getRubroEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RubroEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesRubroEmpleado(this.rubroempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(RubroEmplea.class));
		classes.add(new Classe(EstadoRubro.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//rubroempleadoLogic.setRubroEmpleados(this.rubroempleados);
			rubroempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RubroEmpleadoParameterReturnGeneral getRubroEmpleadoParameterGeneral() {
		return this.rubroempleadoParameterGeneral;
	}
	
	public void setRubroEmpleadoParameterGeneral(RubroEmpleadoParameterReturnGeneral rubroempleadoParameterGeneral) {
		this.rubroempleadoParameterGeneral = rubroempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRubroEmpleado() {
		return isPermisoTodoRubroEmpleado;
	}

	public void setIsPermisoTodoRubroEmpleado(Boolean isPermisoTodoRubroEmpleado) {
		this.isPermisoTodoRubroEmpleado = isPermisoTodoRubroEmpleado;
	}

	public Boolean getIsPermisoNuevoRubroEmpleado() {
		return isPermisoNuevoRubroEmpleado;
	}

	public void setIsPermisoNuevoRubroEmpleado(Boolean isPermisoNuevoRubroEmpleado) {
		this.isPermisoNuevoRubroEmpleado = isPermisoNuevoRubroEmpleado;
	}

	public Boolean getIsPermisoActualizarRubroEmpleado() {
		return isPermisoActualizarRubroEmpleado;
	}

	public void setIsPermisoActualizarRubroEmpleado(Boolean isPermisoActualizarRubroEmpleado) {
		this.isPermisoActualizarRubroEmpleado = isPermisoActualizarRubroEmpleado;
	}

	public Boolean getIsPermisoEliminarRubroEmpleado() {
		return isPermisoEliminarRubroEmpleado;
	}

	public void setIsPermisoEliminarRubroEmpleado(Boolean isPermisoEliminarRubroEmpleado) {
		this.isPermisoEliminarRubroEmpleado = isPermisoEliminarRubroEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosRubroEmpleado() {
		return isPermisoGuardarCambiosRubroEmpleado;
	}

	public void setIsPermisoGuardarCambiosRubroEmpleado(Boolean isPermisoGuardarCambiosRubroEmpleado) {
		this.isPermisoGuardarCambiosRubroEmpleado = isPermisoGuardarCambiosRubroEmpleado;
	}
	
	public Boolean getIsPermisoConsultaRubroEmpleado() {
		return isPermisoConsultaRubroEmpleado;
	}

	public void setIsPermisoConsultaRubroEmpleado(Boolean isPermisoConsultaRubroEmpleado) {
		this.isPermisoConsultaRubroEmpleado = isPermisoConsultaRubroEmpleado;
	}

	public Boolean getIsPermisoBusquedaRubroEmpleado() {
		return isPermisoBusquedaRubroEmpleado;
	}

	public void setIsPermisoBusquedaRubroEmpleado(Boolean isPermisoBusquedaRubroEmpleado) {
		this.isPermisoBusquedaRubroEmpleado = isPermisoBusquedaRubroEmpleado;
	}

	public Boolean getIsPermisoReporteRubroEmpleado() {
		return isPermisoReporteRubroEmpleado;
	}

	public void setIsPermisoReporteRubroEmpleado(Boolean isPermisoReporteRubroEmpleado) {
		this.isPermisoReporteRubroEmpleado = isPermisoReporteRubroEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioRubroEmpleado() {
		return isPermisoPaginacionMedioRubroEmpleado;
	}

	public void setIsPermisoPaginacionMedioRubroEmpleado(Boolean isPermisoPaginacionMedioRubroEmpleado) {
		this.isPermisoPaginacionMedioRubroEmpleado = isPermisoPaginacionMedioRubroEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoRubroEmpleado() {
		return isPermisoPaginacionTodoRubroEmpleado;
	}

	public void setIsPermisoPaginacionTodoRubroEmpleado(Boolean isPermisoPaginacionTodoRubroEmpleado) {
		this.isPermisoPaginacionTodoRubroEmpleado = isPermisoPaginacionTodoRubroEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoRubroEmpleado() {
		return isPermisoPaginacionAltoRubroEmpleado;
	}

	public void setIsPermisoPaginacionAltoRubroEmpleado(Boolean isPermisoPaginacionAltoRubroEmpleado) {
		this.isPermisoPaginacionAltoRubroEmpleado = isPermisoPaginacionAltoRubroEmpleado;
	}
	
	public Boolean getIsPermisoCopiarRubroEmpleado() {
		return isPermisoCopiarRubroEmpleado;
	}

	public void setIsPermisoCopiarRubroEmpleado(Boolean isPermisoCopiarRubroEmpleado) {
		this.isPermisoCopiarRubroEmpleado = isPermisoCopiarRubroEmpleado;
	}
	
	public Boolean getIsPermisoVerFormRubroEmpleado() {
		return isPermisoVerFormRubroEmpleado;
	}

	public void setIsPermisoVerFormRubroEmpleado(Boolean isPermisoVerFormRubroEmpleado) {
		this.isPermisoVerFormRubroEmpleado = isPermisoVerFormRubroEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarRubroEmpleado() {
		return isPermisoDuplicarRubroEmpleado;
	}

	public void setIsPermisoDuplicarRubroEmpleado(Boolean isPermisoDuplicarRubroEmpleado) {
		this.isPermisoDuplicarRubroEmpleado = isPermisoDuplicarRubroEmpleado;
	}
	
	public Boolean getIsPermisoOrdenRubroEmpleado() {
		return isPermisoOrdenRubroEmpleado;
	}

	public void setIsPermisoOrdenRubroEmpleado(Boolean isPermisoOrdenRubroEmpleado) {
		this.isPermisoOrdenRubroEmpleado = isPermisoOrdenRubroEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRubroEmpleado() {
		return isVisibilidadCeldaNuevoRubroEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRubroEmpleado(Boolean isVisibilidadCeldaNuevoRubroEmpleado) {
		this.isVisibilidadCeldaNuevoRubroEmpleado = isVisibilidadCeldaNuevoRubroEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRubroEmpleado() {
		return isVisibilidadCeldaDuplicarRubroEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarRubroEmpleado(Boolean isVisibilidadCeldaDuplicarRubroEmpleado) {
		this.isVisibilidadCeldaDuplicarRubroEmpleado = isVisibilidadCeldaDuplicarRubroEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRubroEmpleado() {
		return isVisibilidadCeldaCopiarRubroEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarRubroEmpleado(Boolean isVisibilidadCeldaCopiarRubroEmpleado) {
		this.isVisibilidadCeldaCopiarRubroEmpleado = isVisibilidadCeldaCopiarRubroEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRubroEmpleado() {
		return isVisibilidadCeldaVerFormRubroEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormRubroEmpleado(Boolean isVisibilidadCeldaVerFormRubroEmpleado) {
		this.isVisibilidadCeldaVerFormRubroEmpleado = isVisibilidadCeldaVerFormRubroEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRubroEmpleado() {
		return isVisibilidadCeldaOrdenRubroEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenRubroEmpleado(Boolean isVisibilidadCeldaOrdenRubroEmpleado) {
		this.isVisibilidadCeldaOrdenRubroEmpleado = isVisibilidadCeldaOrdenRubroEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRubroEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesRubroEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRubroEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesRubroEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado = isVisibilidadCeldaNuevoRelacionesRubroEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRubroEmpleado() {
		return isVisibilidadCeldaModificarRubroEmpleado;
	}

	public void setIsVisibilidadCeldaModificarRubroEmpleado(Boolean isVisibilidadCeldaModificarRubroEmpleado) {
		this.isVisibilidadCeldaModificarRubroEmpleado = isVisibilidadCeldaModificarRubroEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRubroEmpleado() {
		return isVisibilidadCeldaActualizarRubroEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarRubroEmpleado(Boolean isVisibilidadCeldaActualizarRubroEmpleado) {
		this.isVisibilidadCeldaActualizarRubroEmpleado = isVisibilidadCeldaActualizarRubroEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarRubroEmpleado() {
		return isVisibilidadCeldaEliminarRubroEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarRubroEmpleado(Boolean isVisibilidadCeldaEliminarRubroEmpleado) {
		this.isVisibilidadCeldaEliminarRubroEmpleado = isVisibilidadCeldaEliminarRubroEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarRubroEmpleado() {
		return isVisibilidadCeldaCancelarRubroEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarRubroEmpleado(Boolean isVisibilidadCeldaCancelarRubroEmpleado) {
		this.isVisibilidadCeldaCancelarRubroEmpleado = isVisibilidadCeldaCancelarRubroEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarRubroEmpleado() {
		return isVisibilidadCeldaGuardarRubroEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarRubroEmpleado(Boolean isVisibilidadCeldaGuardarRubroEmpleado) {
		this.isVisibilidadCeldaGuardarRubroEmpleado = isVisibilidadCeldaGuardarRubroEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRubroEmpleado() {
		return isVisibilidadCeldaGuardarCambiosRubroEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRubroEmpleado(Boolean isVisibilidadCeldaGuardarCambiosRubroEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosRubroEmpleado = isVisibilidadCeldaGuardarCambiosRubroEmpleado;
	}
		
	public RubroEmpleadoSessionBean getrubroempleadoSessionBean() {
		return this.rubroempleadoSessionBean;
	}
	
	public void setrubroempleadoSessionBean(RubroEmpleadoSessionBean rubroempleadoSessionBean) {
		this.rubroempleadoSessionBean=rubroempleadoSessionBean;
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

	public Boolean getisVisibilidadFK_IdEstadoRubro() {
		return this.isVisibilidadFK_IdEstadoRubro;
	}

	public void setisVisibilidadFK_IdEstadoRubro(Boolean isVisibilidadFK_IdEstadoRubro) {
		this.isVisibilidadFK_IdEstadoRubro=isVisibilidadFK_IdEstadoRubro;
	}

	public Boolean getisVisibilidadFK_IdRubroEmplea() {
		return this.isVisibilidadFK_IdRubroEmplea;
	}

	public void setisVisibilidadFK_IdRubroEmplea(Boolean isVisibilidadFK_IdRubroEmplea) {
		this.isVisibilidadFK_IdRubroEmplea=isVisibilidadFK_IdRubroEmplea;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(RubroEmpleado rubroempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(rubroempleado,null);
				this.setActualParaGuardarEmpleadoForeignKey(rubroempleado,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(rubroempleado,null);
				this.setActualParaGuardarEstadoRubroForeignKey(rubroempleado,null);
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
	
	public void bugActualizarReferenciaActual(RubroEmpleado rubroempleado,RubroEmpleado rubroempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRubroEmpleado(rubroempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rubroempleadoAux.setId(rubroempleado.getId());
		rubroempleadoAux.setVersionRow(rubroempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRubroEmpleado();
		
			int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = rubroempleadoValidator.getInvalidValues(this.rubroempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			rubroempleadoLogic.setDatosCliente(datosCliente);
			rubroempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				rubroempleadoAux=new  RubroEmpleado();
				
				rubroempleadoAux.setIsNew(true);
				rubroempleadoAux.setIsChanged(true);
				
				rubroempleadoAux.setRubroEmpleadoOriginal(this.rubroempleado);
				
				rubroempleadoAux.setId(this.rubroempleado.getId());	
				rubroempleadoAux.setVersionRow(this.rubroempleado.getVersionRow());	
				rubroempleadoAux.setid_empresa(this.rubroempleado.getid_empresa());	
				rubroempleadoAux.setid_empleado(this.rubroempleado.getid_empleado());	
				rubroempleadoAux.setid_rubro_emplea(this.rubroempleado.getid_rubro_emplea());	
				rubroempleadoAux.setid_estado_rubro(this.rubroempleado.getid_estado_rubro());	
				rubroempleadoAux.setvalor(this.rubroempleado.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rubroempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(rubroempleadoAux,rubroempleadoLogic.getRubroEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroempleadoAux,rubroempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoLogic.saveRubroEmpleados();//WithConnection
						//rubroempleadoLogic.getSetVersionRowRubroEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rubroempleado,rubroempleadoAux);
					
					this.refrescarForeignKeysDescripcionesRubroEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroempleadoLogic.saveRubroEmpleadoRelaciones(rubroempleadoAux);//WithConnection
								//rubroempleadoLogic.getSetVersionRowRubroEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rubroempleado,rubroempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rubroempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rubroempleadoAux,rubroempleadoLogic.getRubroEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rubroempleadoAux,rubroempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rubroempleado,rubroempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				rubroempleadoAux=new  RubroEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.rubroempleadoSessionBean.getEsGuardarRelacionado() && this.rubroempleado.getId()>=0)) {
						
					rubroempleadoAux.setIsNew(false);
				}
				
				rubroempleadoAux.setIsDeleted(false);
			
				rubroempleadoAux.setId(this.rubroempleado.getId());	
				rubroempleadoAux.setVersionRow(this.rubroempleado.getVersionRow());	
				rubroempleadoAux.setid_empresa(this.rubroempleado.getid_empresa());	
				rubroempleadoAux.setid_empleado(this.rubroempleado.getid_empleado());	
				rubroempleadoAux.setid_rubro_emplea(this.rubroempleado.getid_rubro_emplea());	
				rubroempleadoAux.setid_estado_rubro(this.rubroempleado.getid_estado_rubro());	
				rubroempleadoAux.setvalor(this.rubroempleado.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rubroempleadoAux,rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroempleadoAux,rubroempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoLogic.saveRubroEmpleados();//WithConnection
						//rubroempleadoLogic.getSetVersionRowRubroEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rubroempleado,rubroempleadoAux);
					
					this.refrescarForeignKeysDescripcionesRubroEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroempleadoLogic.saveRubroEmpleadoRelaciones(rubroempleadoAux);//WithConnection
								//rubroempleadoLogic.getSetVersionRowRubroEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rubroempleado,rubroempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rubroempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rubroempleadoAux,rubroempleadoLogic.getRubroEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rubroempleadoAux,rubroempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rubroempleado,rubroempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				rubroempleadoAux=new  RubroEmpleado();
				
				rubroempleadoAux.setIsNew(false);
				rubroempleadoAux.setIsChanged(false);
				
				rubroempleadoAux.setIsDeleted(true);
				
				rubroempleadoAux.setId(this.rubroempleado.getId());	
				rubroempleadoAux.setVersionRow(this.rubroempleado.getVersionRow());	
				rubroempleadoAux.setid_empresa(this.rubroempleado.getid_empresa());	
				rubroempleadoAux.setid_empleado(this.rubroempleado.getid_empleado());	
				rubroempleadoAux.setid_rubro_emplea(this.rubroempleado.getid_rubro_emplea());	
				rubroempleadoAux.setid_estado_rubro(this.rubroempleado.getid_estado_rubro());	
				rubroempleadoAux.setvalor(this.rubroempleado.getvalor());	
				
				if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.rubroempleadoAux.getId()>=0) {	
						this.rubroempleadosEliminados.add(rubroempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(rubroempleadoAux,rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroempleadoAux,rubroempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoLogic.saveRubroEmpleados();//WithConnection
						//rubroempleadoLogic.getSetVersionRowRubroEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroempleadoLogic.saveRubroEmpleadoRelaciones(rubroempleadoAux);//WithConnection
								//rubroempleadoLogic.getSetVersionRowRubroEmpleados();//WithConnection
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
							if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.rubroempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(rubroempleadoAux,rubroempleadoLogic.getRubroEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(rubroempleadoAux,rubroempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.getRubroEmpleados().addAll(this.rubroempleadosEliminados);
					
					rubroempleadoLogic.saveRubroEmpleados();//WithConnection
					//rubroempleadoLogic.getSetVersionRowRubroEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRubroEmpleado();
				
				this.rubroempleadosEliminados= new ArrayList<RubroEmpleado>();		
			}
			
			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Rubro Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.rubroempleado=rubroempleadoAux;
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
      		//this.finishProcessRubroEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(RubroEmpleado rubroempleadoLocal) throws Exception {
		
		if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RubroEmpleado rubroempleadoLocal) throws Exception {	
		if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rubroempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				rubroempleadoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				rubroempleadoLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoRubroDetalleFormJInternalFrame.class)) {
				EstadoRubroBeanSwingJInternalFrame estadorubroBeanSwingJInternalFrameLocal=(EstadoRubroBeanSwingJInternalFrame) ((EstadoRubroDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadorubroBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoRubro(estadorubroBeanSwingJInternalFrameLocal.getestadorubro(),true);
				estadorubroBeanSwingJInternalFrameLocal.actualizarLista(estadorubroBeanSwingJInternalFrameLocal.estadorubro,this.estadorubrosForeignKey);

				estadorubroBeanSwingJInternalFrameLocal.actualizarRelaciones(estadorubroBeanSwingJInternalFrameLocal.estadorubro);

				rubroempleadoLocal.setEstadoRubro(estadorubroBeanSwingJInternalFrameLocal.estadorubro);

				this.addItemDefectoCombosForeignKeyEstadoRubro();
				this.cargarCombosFrameEstadoRubrosForeignKey("Formulario");
				this.setActualEstadoRubroForeignKey(estadorubroBeanSwingJInternalFrameLocal.estadorubro.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRubroEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rubroempleadoValidator.getInvalidValues(this.rubroempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RubroEmpleado rubroempleado,List<RubroEmpleado> rubroempleados) throws Exception {
		try	{		
			RubroEmpleadoConstantesFunciones.actualizarLista(rubroempleado,rubroempleados,this.rubroempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RubroEmpleado rubroempleado,List<RubroEmpleado> rubroempleados) throws Exception {
		try	{			
			RubroEmpleadoConstantesFunciones.actualizarSelectedLista(rubroempleado,rubroempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RubroEmpleado> rubroempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rubroempleadosLocal=this.rubroempleadoLogic.getRubroEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rubroempleadosLocal=this.rubroempleados;
			}
			//ARCHITECTURE
		
			for(RubroEmpleado rubroempleadoLocal:rubroempleadosLocal) {
				if(this.permiteMantenimiento(rubroempleadoLocal) && rubroempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RubroEmpleadoConstantesFunciones.getRubroEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RubroEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleado.jLabelid_empresaRubroEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEmpleadoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleado.jLabelid_empleadoRubroEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEmpleadoConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleado.jLabelid_rubro_empleaRubroEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEmpleadoConstantesFunciones.IDESTADORUBRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleado.jLabelid_estado_rubroRubroEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEmpleadoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleado.jLabelvalorRubroEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleado.jLabelid_empresaRubroEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleado.jLabelid_empleadoRubroEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleado.jLabelid_rubro_empleaRubroEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleado.jLabelid_estado_rubroRubroEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleado.jLabelvalorRubroEmpleado,"");
		
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
		this.iIdNuevoRubroEmpleado--;	
		
		
		this.rubroempleadoAux=new RubroEmpleado();
		
		this.rubroempleadoAux.setId(this.iIdNuevoRubroEmpleado);
		this.rubroempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rubroempleadoLogic.getRubroEmpleados().add(this.rubroempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rubroempleados.add(this.rubroempleadoAux);
		}
		//ARCHITECTURE
		
		this.rubroempleado=this.rubroempleadoAux;
		
		if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRubroEmpleado(this.rubroempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyRubroEmpleado(this.rubroempleado);
		}
				
		//this.setDefaultControlesRubroEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRubroEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRubroEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRubroEmpleado(this.rubroempleadoBean,this.rubroempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RubroEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
			classes=RubroEmpleadoConstantesFunciones.getClassesRelationshipsOfRubroEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.rubroempleadoReturnGeneral=rubroempleadoLogic.procesarEventosRubroEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroempleadoLogic.getRubroEmpleados(),this.rubroempleado,this.rubroempleadoParameterGeneral,this.isEsNuevoRubroEmpleado,classes);//this.rubroempleadoLogic.getRubroEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRubroEmpleado(this.rubroempleadoReturnGeneral,this.rubroempleadoBean,false);
		
		if(this.rubroempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRubroEmpleado(this.rubroempleadoReturnGeneral.getRubroEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRubroEmpleado(this.rubroempleadoReturnGeneral.getRubroEmpleado());
		}
		
		if(this.rubroempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRubroEmpleado(this.rubroempleadoReturnGeneral.getRubroEmpleado(),classes);//this.rubroempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRubroEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRubroEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormRubroEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRubroEmpleado(false);
						
			if(rubroempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEmpleado();
			}
			
			this.actualizarVisualTableDatosRubroEmpleado();
			
			this.jTableDatosRubroEmpleado.setRowSelectionInterval(this.getIndiceNuevoRubroEmpleado(), this.getIndiceNuevoRubroEmpleado());
			
			this.seleccionarFilaTablaRubroEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesRubroEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRubroEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRubroEmpleado.jTextFieldvalorRubroEmpleado.setEnabled(isHabilitar && this.rubroempleadoConstantesFunciones.activarvalorRubroEmpleado);	
		//
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setEnabled(isHabilitar && this.rubroempleadoConstantesFunciones.activarid_empresaRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setEnabled(isHabilitar && this.rubroempleadoConstantesFunciones.activarid_empleadoRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setEnabled(isHabilitar && this.rubroempleadoConstantesFunciones.activarid_rubro_empleaRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setEnabled(isHabilitar && this.rubroempleadoConstantesFunciones.activarid_estado_rubroRubroEmpleado);
	};
	
	public void setDefaultControlesRubroEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRubroEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rubroempleadoSessionBean.setConGuardarRelaciones(true);			
			this.rubroempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.setVisible(true);
			
					
		} else {
			//this.rubroempleadoSessionBean.setConGuardarRelaciones(false);			
			this.rubroempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRubroEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
				if(rubroempleadoAux.getId().equals(this.iIdNuevoRubroEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleado rubroempleadoAux:this.rubroempleados) {
				if(rubroempleadoAux.getId().equals(this.iIdNuevoRubroEmpleado)) {
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
	
	public int getIndiceActualRubroEmpleado(RubroEmpleado rubroempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
				if(rubroempleadoAux.getId().equals(rubroempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleado rubroempleadoAux:this.rubroempleados) {
				if(rubroempleadoAux.getId().equals(rubroempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRubroEmpleado(RubroEmpleado rubroempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
				if(rubroempleadoAux.getRubroEmpleadoOriginal().getId().equals(rubroempleadoOriginal.getId())) {
					existe=true;
					rubroempleadoOriginal.setId(rubroempleadoAux.getId());
					rubroempleadoOriginal.setVersionRow(rubroempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleado rubroempleadoAux:this.rubroempleados) {
				if(rubroempleadoAux.getRubroEmpleadoOriginal().getId().equals(rubroempleadoOriginal.getId())) {
					existe=true;
					rubroempleadoOriginal.setId(rubroempleadoAux.getId());
					rubroempleadoOriginal.setVersionRow(rubroempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRubroEmpleado(Boolean esParaCancelar) throws Exception {
		rubroempleadosAux=new ArrayList<RubroEmpleado>();
		rubroempleadoAux=new RubroEmpleado();
		
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
					if(rubroempleadoAux.getId()<0) {
						rubroempleadosAux.add(rubroempleadoAux);
					}		
				}
				this.iIdNuevoRubroEmpleado=0L;
				this.rubroempleadoLogic.getRubroEmpleados().removeAll(rubroempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEmpleado rubroempleadoAux:this.rubroempleados) {
					if(rubroempleadoAux.getId()<0) {
						rubroempleadosAux.add(rubroempleadoAux);
					}		
				}
				this.iIdNuevoRubroEmpleado=0L;
				this.rubroempleados.removeAll(rubroempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRubroEmpleado 
					&& this.rubroempleadoLogic.getRubroEmpleados().size()>0
					) {
					rubroempleadoAux=this.rubroempleadoLogic.getRubroEmpleados().get(this.rubroempleadoLogic.getRubroEmpleados().size() - 1);
				
					if(rubroempleadoAux.getId()<0) {
						this.rubroempleadoLogic.getRubroEmpleados().remove(rubroempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRubroEmpleado && this.rubroempleados.size()>0) {
					rubroempleadoAux=this.rubroempleados.get(this.rubroempleados.size() - 1);
				
					if(rubroempleadoAux.getId()<0) {
						this.rubroempleados.remove(rubroempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRubroEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(rubroempleado.getId()<0) {
				this.rubroempleadoLogic.getRubroEmpleados().remove(this.rubroempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(rubroempleado.getId()<0) {
				this.rubroempleados.remove(this.rubroempleado);
			}
		}			
	}
	
	public void setEstadosInicialesRubroEmpleado(List<RubroEmpleado> rubroempleadosAux) throws Exception {
		RubroEmpleadoConstantesFunciones.setEstadosInicialesRubroEmpleado(rubroempleadosAux);
	}
	
	public void setEstadosInicialesRubroEmpleado(RubroEmpleado rubroempleadoAux) throws Exception {
		RubroEmpleadoConstantesFunciones.setEstadosInicialesRubroEmpleado(rubroempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRubroEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRubroEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRubroEmpleadoActual()) {
				if(!this.isEsNuevoRubroEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRubroEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRubroEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRubroEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Rubro Empleado ?", "MANTENIMIENTO DE Rubro Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRubroEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RubroEmpleado rubroempleado) throws Exception {
		RubroEmpleadoConstantesFunciones.seleccionarAsignar(this.rubroempleado,rubroempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRubroEmpleado=this.isPermisoActualizarOriginalRubroEmpleado;
			
			
			this.seleccionarAsignar(rubroempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RubroEmpleadoConstantesFunciones.quitarEspaciosRubroEmpleado(this.rubroempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRubroEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rubroempleadoSessionBean.setsFuncionBusquedaRapida(this.rubroempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRubroEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRubroEmpleado(esParaCancelar);				
				this.cancelarNuevoRubroEmpleado(esParaCancelar);								
			}
			
			this.rubroempleado=new RubroEmpleado();
			
			this.inicializarRubroEmpleado();
			
			this.actualizarEstadoCeldasBotonesRubroEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRubroEmpleado() throws Exception {
		try {
			RubroEmpleadoConstantesFunciones.inicializarRubroEmpleado(this.rubroempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rubroempleadoLogic.getRubroEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRubroEmpleados(String sAccionBusqueda,List<RubroEmpleado> rubroempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="RubroEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RubroEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RubroEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RubroEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Rubro Empleados");		
		parameters.put("busquedapor", RubroEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRubroEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RubroEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RubroEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRubroEmpleado=new JRBeanArrayDataSource(RubroEmpleadoJInternalFrame.TraerRubroEmpleadoBeans(rubroempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRubroEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RubroEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RubroEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RubroEmpleadoBean.TraerRubroEmpleadoBeans(rubroempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteRubroEmpleados(sAccionBusqueda,sTipoArchivoReporte,rubroempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRubroEmpleados(sAccionBusqueda,sTipoArchivoReporte,rubroempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRubroEmpleadoActionPerformed(null);
					//this.generarExcelReporteRubroEmpleados(sAccionBusqueda,sTipoArchivoReporte,rubroempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRubroEmpleados(sAccionBusqueda,sTipoArchivoReporte,rubroempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRubroEmpleados(sAccionBusqueda,sTipoArchivoReporte,rubroempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRubroEmpleados(sAccionBusqueda,sTipoArchivoReporte,rubroempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRubroEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEmpleado> rubroempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRubroEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RubroEmpleado rubroempleado : rubroempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RubroEmpleadoConstantesFunciones.generarExcelReporteDataRubroEmpleado("NORMAL",row,workbook,rubroempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRubroEmpleado(String sTipo,Row row,Workbook workbook) {
		
		RubroEmpleadoConstantesFunciones.generarExcelReporteHeaderRubroEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRubroEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEmpleado> rubroempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RubroEmpleado rubroempleado : rubroempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RubroEmpleadoConstantesFunciones.getRubroEmpleadoDescripcion(rubroempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleado.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleado.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleado.getestadorubro_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleadoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleado.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRubroEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEmpleado> rubroempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RubroEmpleado> rubroempleadosRespaldo=null;
		
		classes=RubroEmpleadoConstantesFunciones.getClassesRelationshipsOfRubroEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rubroempleadoLogic.setDatosCliente(this.datosCliente);
		this.rubroempleadoLogic.setDatosDeep(this.datosDeep);
		this.rubroempleadoLogic.setIsConDeep(true);
		
		rubroempleadosRespaldo=this.rubroempleadoLogic.getRubroEmpleados();
		
		this.rubroempleadoLogic.setRubroEmpleados(rubroempleadosParaReportes);	
		this.rubroempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rubroempleadosParaReportes=this.rubroempleadoLogic.getRubroEmpleados();
		this.rubroempleadoLogic.setRubroEmpleados(rubroempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRubroEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RubroEmpleado rubroempleado : rubroempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRubroEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RubroEmpleadoConstantesFunciones.generarExcelReporteDataRubroEmpleado("NORMAL",row,workbook,rubroempleado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RubroEmpleadoConstantesFunciones.getRubroEmpleadoDescripcion(rubroempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRubroEmpleado() throws Exception {		
		this.startProcessRubroEmpleado(true);
	}
	
	public void startProcessRubroEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRubroEmpleado ,this.jPanelParametrosReportesRubroEmpleado, this.jScrollPanelDatosRubroEmpleado,this.jPanelPaginacionRubroEmpleado, this.jScrollPanelDatosEdicionRubroEmpleado, this.jPanelAccionesRubroEmpleado,this.jPanelAccionesFormularioRubroEmpleado,this.jmenuBarRubroEmpleado,this.jmenuBarDetalleRubroEmpleado,this.jTtoolBarRubroEmpleado,this.jTtoolBarDetalleRubroEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasRubroEmpleado=this.jTabbedPaneBusquedasRubroEmpleado; 
		
		final JPanel jPanelParametrosReportesRubroEmpleado=this.jPanelParametrosReportesRubroEmpleado;
		//final JScrollPane jScrollPanelDatosRubroEmpleado=this.jScrollPanelDatosRubroEmpleado;
		final JTable jTableDatosRubroEmpleado=this.jTableDatosRubroEmpleado;		
		final JPanel jPanelPaginacionRubroEmpleado=this.jPanelPaginacionRubroEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionRubroEmpleado=this.jScrollPanelDatosEdicionRubroEmpleado;
		final JPanel jPanelAccionesRubroEmpleado=this.jPanelAccionesRubroEmpleado;
		
		JPanel jPanelCamposAuxiliarRubroEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRubroEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			jPanelCamposAuxiliarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jPanelCamposRubroEmpleado;
			jPanelAccionesFormularioAuxiliarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jPanelAccionesFormularioRubroEmpleado;
		}
		
		final JPanel jPanelCamposRubroEmpleado=jPanelCamposAuxiliarRubroEmpleado;
		final JPanel jPanelAccionesFormularioRubroEmpleado=jPanelAccionesFormularioAuxiliarRubroEmpleado;
		
		
		final JMenuBar jmenuBarRubroEmpleado=this.jmenuBarRubroEmpleado;
		final JToolBar jTtoolBarRubroEmpleado=this.jTtoolBarRubroEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRubroEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRubroEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			jmenuBarDetalleAuxiliarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jmenuBarDetalleRubroEmpleado;
			jTtoolBarDetalleAuxiliarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jTtoolBarDetalleRubroEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleRubroEmpleado=jmenuBarDetalleAuxiliarRubroEmpleado;
		final JToolBar jTtoolBarDetalleRubroEmpleado=jTtoolBarDetalleAuxiliarRubroEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRubroEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRubroEmpleado;
			processRunnable.jTableDatos=jTableDatosRubroEmpleado;
			processRunnable.jPanelCampos=jPanelCamposRubroEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionRubroEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesRubroEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRubroEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarRubroEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRubroEmpleado;
			processRunnable.jTtoolBar=jTtoolBarRubroEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRubroEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRubroEmpleado ,jPanelParametrosReportesRubroEmpleado,jTableDatosRubroEmpleado, /*jScrollPanelDatosRubroEmpleado,*/jPanelCamposRubroEmpleado,jPanelPaginacionRubroEmpleado, /*jScrollPanelDatosEdicionRubroEmpleado,*/ jPanelAccionesRubroEmpleado,jPanelAccionesFormularioRubroEmpleado,jmenuBarRubroEmpleado,jmenuBarDetalleRubroEmpleado,jTtoolBarRubroEmpleado,jTtoolBarDetalleRubroEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRubroEmpleado ,jPanelParametrosReportesRubroEmpleado, jScrollPanelDatosRubroEmpleado,jPanelPaginacionRubroEmpleado, jScrollPanelDatosEdicionRubroEmpleado, jPanelAccionesRubroEmpleado,jPanelAccionesFormularioRubroEmpleado,jmenuBarRubroEmpleado,jmenuBarDetalleRubroEmpleado,jTtoolBarRubroEmpleado,jTtoolBarDetalleRubroEmpleado);
						
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
	
	public void finishProcessRubroEmpleado() {// throws Exception 
		this.finishProcessRubroEmpleado(true);
	}
	
	public void finishProcessRubroEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRubroEmpleado ,this.jPanelParametrosReportesRubroEmpleado, this.jScrollPanelDatosRubroEmpleado,this.jPanelPaginacionRubroEmpleado, this.jScrollPanelDatosEdicionRubroEmpleado, this.jPanelAccionesRubroEmpleado,this.jPanelAccionesFormularioRubroEmpleado,this.jmenuBarRubroEmpleado,this.jmenuBarDetalleRubroEmpleado,this.jTtoolBarRubroEmpleado,this.jTtoolBarDetalleRubroEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasRubroEmpleado=this.jTabbedPaneBusquedasRubroEmpleado; 
		
		final JPanel jPanelParametrosReportesRubroEmpleado=this.jPanelParametrosReportesRubroEmpleado;
		//final JScrollPane jScrollPanelDatosRubroEmpleado=this.jScrollPanelDatosRubroEmpleado;
		final JTable jTableDatosRubroEmpleado=this.jTableDatosRubroEmpleado;		
		final JPanel jPanelPaginacionRubroEmpleado=this.jPanelPaginacionRubroEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionRubroEmpleado=this.jScrollPanelDatosEdicionRubroEmpleado;
		final JPanel jPanelAccionesRubroEmpleado=this.jPanelAccionesRubroEmpleado;
		
		JPanel jPanelCamposAuxiliarRubroEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRubroEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			jPanelCamposAuxiliarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jPanelCamposRubroEmpleado;
			jPanelAccionesFormularioAuxiliarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jPanelAccionesFormularioRubroEmpleado;
		}
		
		final JPanel jPanelCamposRubroEmpleado=jPanelCamposAuxiliarRubroEmpleado;
		final JPanel jPanelAccionesFormularioRubroEmpleado=jPanelAccionesFormularioAuxiliarRubroEmpleado;
		
		
		final JMenuBar jmenuBarRubroEmpleado=this.jmenuBarRubroEmpleado;		
		final JToolBar jTtoolBarRubroEmpleado=this.jTtoolBarRubroEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarRubroEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRubroEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			jmenuBarDetalleAuxiliarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jmenuBarDetalleRubroEmpleado;
			jTtoolBarDetalleAuxiliarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jTtoolBarDetalleRubroEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleRubroEmpleado=jmenuBarDetalleAuxiliarRubroEmpleado;
		final JToolBar jTtoolBarDetalleRubroEmpleado=jTtoolBarDetalleAuxiliarRubroEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRubroEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRubroEmpleado;
			processRunnable.jTableDatos=jTableDatosRubroEmpleado;
			processRunnable.jPanelCampos=jPanelCamposRubroEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionRubroEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesRubroEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRubroEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarRubroEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRubroEmpleado;
			processRunnable.jTtoolBar=jTtoolBarRubroEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRubroEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRubroEmpleado ,jPanelParametrosReportesRubroEmpleado, jTableDatosRubroEmpleado,/*jScrollPanelDatosRubroEmpleado,*/jPanelCamposRubroEmpleado,jPanelPaginacionRubroEmpleado, /*jScrollPanelDatosEdicionRubroEmpleado,*/ jPanelAccionesRubroEmpleado,jPanelAccionesFormularioRubroEmpleado,jmenuBarRubroEmpleado,jmenuBarDetalleRubroEmpleado,jTtoolBarRubroEmpleado,jTtoolBarDetalleRubroEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRubroEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRubroEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRubroEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRubroEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRubroEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRubroEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRubroEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRubroEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRubroEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rubroempleadoConstantesFunciones.getsFinalQueryRubroEmpleado();
		String  finalQueryPaginacionTodos=this.rubroempleadoConstantesFunciones.getsFinalQueryRubroEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RubroEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoRubroEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RubroEmpleadoConstantesFunciones.getArrayColumnasGlobalesRubroEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RubroEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rubroempleadosEliminados= new ArrayList<RubroEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRubroEmpleado();
		
				///*RubroEmpleadoSessionBean*/this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
			
			if(this.rubroempleadoSessionBean==null) {
				this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
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
					this.iNumeroPaginacion=RubroEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RubroEmpleadoConstantesFunciones.getClassesForeignKeysOfRubroEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/rubroempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rubroempleadosAux= new ArrayList<RubroEmpleado>();
			
				
			rubroempleadoLogic.setDatosCliente(this.datosCliente);
			rubroempleadoLogic.setDatosDeep(this.datosDeep);
			rubroempleadoLogic.setIsConDeep(true);
			
			
			rubroempleadoLogic.getRubroEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					rubroempleadoLogic.getTodosRubroEmpleados(finalQueryGlobal,pagination);
					
					//rubroempleadoLogic.getTodosRubroEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(rubroempleadoLogic.getRubroEmpleados()==null|| rubroempleadoLogic.getRubroEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroempleadosAux= new ArrayList<RubroEmpleado>();
							rubroempleadosAux.addAll(rubroempleadoLogic.getRubroEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleadosAux= new ArrayList<RubroEmpleado>();
							rubroempleadosAux.addAll(rubroempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroempleadoLogic.getTodosRubroEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//rubroempleadoLogic.getTodosRubroEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRubroEmpleados("Todos",rubroempleadoLogic.getRubroEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());					
							rubroempleadoLogic.getRubroEmpleados().addAll(rubroempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleados=new ArrayList<RubroEmpleado>();
							rubroempleados.addAll(rubroempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRubroEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRubroEmpleado=this.idActual;
				
				} else if(this.idRubroEmpleadoActual!=null && this.idRubroEmpleadoActual!=0L) {
					idRubroEmpleado=idRubroEmpleadoActual;
				}
				
					
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndicePorId(idRubroEmpleado);
				
				this.rubroempleados=new ArrayList<RubroEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					rubroempleadoLogic.getEntity(idRubroEmpleado);
					
					//rubroempleadoLogic.getEntityWithConnection(idRubroEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());
					rubroempleadoLogic.getRubroEmpleados().add(rubroempleadoLogic.getRubroEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleados=new ArrayList<RubroEmpleado>();
					this.rubroempleados.add(rubroempleado);
				}
				
				if(rubroempleadoLogic.getRubroEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleadoLogic.getRubroEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleadoLogic.getRubroEmpleados()==null||rubroempleadoLogic.getRubroEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleados==null|| rubroempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadosAux=new ArrayList<RubroEmpleado>();
						rubroempleadosAux.addAll(rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleadosAux=new ArrayList<RubroEmpleado>();
							rubroempleadosAux.addAll(rubroempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleadoLogic.getRubroEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleados("FK_IdEmpleado",rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleados("FK_IdEmpleado",rubroempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());
						rubroempleadoLogic.getRubroEmpleados().addAll(rubroempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleados=new ArrayList<RubroEmpleado>();
							rubroempleados.addAll(rubroempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleadoLogic.getRubroEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleadoLogic.getRubroEmpleados()==null||rubroempleadoLogic.getRubroEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleados==null|| rubroempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadosAux=new ArrayList<RubroEmpleado>();
						rubroempleadosAux.addAll(rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleadosAux=new ArrayList<RubroEmpleado>();
							rubroempleadosAux.addAll(rubroempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleadoLogic.getRubroEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleados("FK_IdEmpresa",rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleados("FK_IdEmpresa",rubroempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());
						rubroempleadoLogic.getRubroEmpleados().addAll(rubroempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleados=new ArrayList<RubroEmpleado>();
							rubroempleados.addAll(rubroempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoRubro")) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstadoRubro(id_estado_rubroFK_IdEstadoRubro);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleadoLogic.getRubroEmpleadosFK_IdEstadoRubro(finalQueryGlobal,pagination,id_estado_rubroFK_IdEstadoRubro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstadoRubro(id_estado_rubroFK_IdEstadoRubro);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstadoRubro(id_estado_rubroFK_IdEstadoRubro);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleadoLogic.getRubroEmpleados()==null||rubroempleadoLogic.getRubroEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleados==null|| rubroempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadosAux=new ArrayList<RubroEmpleado>();
						rubroempleadosAux.addAll(rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleadosAux=new ArrayList<RubroEmpleado>();
							rubroempleadosAux.addAll(rubroempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleadoLogic.getRubroEmpleadosFK_IdEstadoRubro(finalQueryGlobal,pagination,id_estado_rubroFK_IdEstadoRubro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstadoRubro(id_estado_rubroFK_IdEstadoRubro);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEstadoRubro(id_estado_rubroFK_IdEstadoRubro);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleados("FK_IdEstadoRubro",rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleados("FK_IdEstadoRubro",rubroempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());
						rubroempleadoLogic.getRubroEmpleados().addAll(rubroempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleados=new ArrayList<RubroEmpleado>();
							rubroempleados.addAll(rubroempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRubroEmplea")) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleadoLogic.getRubroEmpleadosFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleadoLogic.getRubroEmpleados()==null||rubroempleadoLogic.getRubroEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleados==null|| rubroempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadosAux=new ArrayList<RubroEmpleado>();
						rubroempleadosAux.addAll(rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleadosAux=new ArrayList<RubroEmpleado>();
							rubroempleadosAux.addAll(rubroempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleadoLogic.getRubroEmpleadosFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleadoConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleados("FK_IdRubroEmplea",rubroempleadoLogic.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleados("FK_IdRubroEmplea",rubroempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());
						rubroempleadoLogic.getRubroEmpleados().addAll(rubroempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleados=new ArrayList<RubroEmpleado>();
							rubroempleados.addAll(rubroempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRubroEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRubroEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rubroempleadoLogic.getRubroEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rubroempleadoLogic.getRubroEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RubroEmpleado rubroempleado) {
		Boolean permite=true;
		
		if(this.rubroempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RubroEmpleadoConstantesFunciones.getOrderByListaRubroEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RubroEmpleadoConstantesFunciones.getOrderByListaRubroEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleado rubroempleado:rubroempleadoLogic.getRubroEmpleados()) {
				if(rubroempleado.getsType().equals(Constantes2.S_TOTALES)) {
					rubroempleadoTotales=rubroempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleado rubroempleado:this.rubroempleados) {
				if(rubroempleado.getsType().equals(Constantes2.S_TOTALES)) {
					rubroempleadoTotales=rubroempleado;
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
			this.rubroempleadoAux=new RubroEmpleado();
			this.rubroempleadoAux.setsType(Constantes2.S_TOTALES);
			this.rubroempleadoAux.setIsNew(false);
			this.rubroempleadoAux.setIsChanged(false);
			this.rubroempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RubroEmpleadoConstantesFunciones.TotalizarValoresFilaRubroEmpleado(this.rubroempleadoLogic.getRubroEmpleados(),this.rubroempleadoAux);
				
				this.rubroempleadoLogic.getRubroEmpleados().add(this.rubroempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RubroEmpleadoConstantesFunciones.TotalizarValoresFilaRubroEmpleado(this.rubroempleados,this.rubroempleadoAux);
				
				this.rubroempleados.add(this.rubroempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rubroempleadoTotales=new RubroEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rubroempleadoLogic.getRubroEmpleados().remove(rubroempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rubroempleados.remove(rubroempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rubroempleadoTotales=new RubroEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleado rubroempleado:rubroempleadoLogic.getRubroEmpleados()) {
				if(rubroempleado.getsType().equals(Constantes2.S_TOTALES)) {
					rubroempleadoTotales=rubroempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RubroEmpleadoConstantesFunciones.TotalizarValoresFilaRubroEmpleado(this.rubroempleadoLogic.getRubroEmpleados(),rubroempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleado rubroempleado:this.rubroempleados) {
				if(rubroempleado.getsType().equals(Constantes2.S_TOTALES)) {
					rubroempleadoTotales=rubroempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RubroEmpleadoConstantesFunciones.TotalizarValoresFilaRubroEmpleado(this.rubroempleados,rubroempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRubroEmpleadosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEmpleadosFK_IdEstadoRubro()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoRubro";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEmpleadosFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRubroEmpleadosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleadoLogic.getRubroEmpleadosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleadoLogic.getRubroEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEmpleadosFK_IdEstadoRubro(String sFinalQuery,Long id_estado_rubro)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleadoLogic.getRubroEmpleadosFK_IdEstadoRubro(sFinalQuery,this.pagination,id_estado_rubro);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEmpleadosFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleadoLogic.getRubroEmpleadosFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
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
	
	public void inicializarPermisosRubroEmpleado() {
		this.isPermisoTodoRubroEmpleado=false;
		this.isPermisoNuevoRubroEmpleado=false;
		this.isPermisoActualizarRubroEmpleado=false;
		this.isPermisoActualizarOriginalRubroEmpleado=false;
		this.isPermisoEliminarRubroEmpleado=false;
		this.isPermisoGuardarCambiosRubroEmpleado=false;
		this.isPermisoConsultaRubroEmpleado=false;
		this.isPermisoBusquedaRubroEmpleado=false;
		this.isPermisoReporteRubroEmpleado=false;		
		this.isPermisoOrdenRubroEmpleado=false;		
		this.isPermisoPaginacionMedioRubroEmpleado=false;		
		this.isPermisoPaginacionAltoRubroEmpleado=false;
		this.isPermisoPaginacionTodoRubroEmpleado=false;
		this.isPermisoCopiarRubroEmpleado=false;		
		this.isPermisoVerFormRubroEmpleado=false;		
		this.isPermisoDuplicarRubroEmpleado=false;		
		this.isPermisoOrdenRubroEmpleado=false;		
	}
	
	public void setPermisosUsuarioRubroEmpleado(Boolean isPermiso) {
		this.isPermisoTodoRubroEmpleado=isPermiso;
		this.isPermisoNuevoRubroEmpleado=isPermiso;
		this.isPermisoActualizarRubroEmpleado=isPermiso;
		this.isPermisoActualizarOriginalRubroEmpleado=isPermiso;
		this.isPermisoEliminarRubroEmpleado=isPermiso;
		this.isPermisoGuardarCambiosRubroEmpleado=isPermiso;
		this.isPermisoConsultaRubroEmpleado=isPermiso;
		this.isPermisoBusquedaRubroEmpleado=isPermiso;
		this.isPermisoReporteRubroEmpleado=isPermiso;
		this.isPermisoOrdenRubroEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioRubroEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoRubroEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoRubroEmpleado=isPermiso;		
		this.isPermisoCopiarRubroEmpleado=isPermiso;		
		this.isPermisoVerFormRubroEmpleado=isPermiso;		
		this.isPermisoDuplicarRubroEmpleado=isPermiso;
		this.isPermisoOrdenRubroEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRubroEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoRubroEmpleado=isPermiso;
		this.isPermisoNuevoRubroEmpleado=isPermiso;
		this.isPermisoActualizarRubroEmpleado=isPermiso;
		this.isPermisoActualizarOriginalRubroEmpleado=isPermiso;
		this.isPermisoEliminarRubroEmpleado=isPermiso;
		this.isPermisoGuardarCambiosRubroEmpleado=isPermiso;
		//this.isPermisoConsultaRubroEmpleado=isPermiso;
		//this.isPermisoBusquedaRubroEmpleado=isPermiso;
		//this.isPermisoReporteRubroEmpleado=isPermiso;
		//this.isPermisoOrdenRubroEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioRubroEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoRubroEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoRubroEmpleado=isPermiso;		
		//this.isPermisoCopiarRubroEmpleado=isPermiso;		
		//this.isPermisoDuplicarRubroEmpleado=isPermiso;
		//this.isPermisoOrdenRubroEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRubroEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RubroEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRubroEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRubroEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRubroEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRubroEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRubroEmpleadoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRubroEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RubroEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RubroEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRubroEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRubroEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRubroEmpleado=this.isPermisoActualizarRubroEmpleado;
			this.isPermisoEliminarRubroEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRubroEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRubroEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRubroEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRubroEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRubroEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRubroEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRubroEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRubroEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRubroEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRubroEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRubroEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRubroEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRubroEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRubroEmpleado.setToolTipText(this.jTableDatosRubroEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRubroEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRubroEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RubroEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RubroEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRubroEmpleado() throws Exception {
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
	public void inicializarCombosForeignKeyRubroEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
				this.estadorubrosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRubroEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RubroEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRubroEmpleadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoRubroListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstadoRubroListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadorubrosForeignKey==null||this.estadorubrosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoRubroConstantesFunciones.getArrayColumnasGlobalesEstadoRubro(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoRubroConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoRubroConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoRubrosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRubroEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RubroEmpleadoParameterReturnGeneral rubroempleadoReturnGeneral=new RubroEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.rubroempleadoConstantesFunciones.cargarid_empresaRubroEmpleado)
					 || (this.esRecargarFks && this.rubroempleadoConstantesFunciones.cargarid_empresaRubroEmpleado)) {

					if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+rubroempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.rubroempleadoConstantesFunciones.cargarid_empleadoRubroEmpleado)
					 || (this.esRecargarFks && this.rubroempleadoConstantesFunciones.cargarid_empleadoRubroEmpleado)) {

					if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+rubroempleadoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.rubroempleadoConstantesFunciones.cargarid_rubro_empleaRubroEmpleado)
					 || (this.esRecargarFks && this.rubroempleadoConstantesFunciones.cargarid_rubro_empleaRubroEmpleado)) {

					if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+rubroempleadoSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}


				String finalQueryGlobalEstadoRubro="";

				if(((this.estadorubrosForeignKey==null||this.estadorubrosForeignKey.size()<=0) && this.rubroempleadoConstantesFunciones.cargarid_estado_rubroRubroEmpleado)
					 || (this.esRecargarFks && this.rubroempleadoConstantesFunciones.cargarid_estado_rubroRubroEmpleado)) {

					if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoRubro()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoRubroConstantesFunciones.getArrayColumnasGlobalesEstadoRubro(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoRubro=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoRubroConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoRubro=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoRubro, "");
						finalQueryGlobalEstadoRubro+=EstadoRubroConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoRubrosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoRubro=" WHERE " + ConstantesSql.ID + "="+rubroempleadoSessionBean.getlidEstadoRubroActual();
					}
				} else {
					finalQueryGlobalEstadoRubro="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				rubroempleadoReturnGeneral=rubroempleadoLogic.cargarCombosLoteForeignKeyRubroEmpleado(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalRubroEmplea,finalQueryGlobalEstadoRubro);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=rubroempleadoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=rubroempleadoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=rubroempleadoReturnGeneral.getrubroempleasForeignKey();
			}

			if(!finalQueryGlobalEstadoRubro.equals("NONE")) {
				this.estadorubrosForeignKey=rubroempleadoReturnGeneral.getestadorubrosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRubroEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
			this.addItemDefectoCombosForeignKeyEstadoRubro();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.rubroempleadoSessionBean==null) {
				this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
			}

			if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

			if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
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

	public void addItemDefectoCombosForeignKeyEstadoRubro()throws Exception {
		try {

			if(!this.rubroempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoRubro()) {
				EstadoRubro estadorubro=new EstadoRubro();
				EstadoRubroConstantesFunciones.setEstadoRubroDescripcion(estadorubro,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadorubro.setId(null);

				if(!EstadoRubroConstantesFunciones.ExisteEnLista(this.estadorubrosForeignKey,estadorubro,true)) {

					this.estadorubrosForeignKey.add(0,estadorubro);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRubroEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRubroEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRubroEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRubroEmpleado(RubroEmpleado rubroempleado)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(rubroempleado.getid_empleado(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(rubroempleado.getid_rubro_emplea(),false,"Formulario");
			this.setActualEstadoRubroForeignKey(rubroempleado.getid_estado_rubro(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRubroEmpleado(RubroEmpleado rubroempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRubroEmpleado()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.rubroempleadoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(this.rubroempleadoConstantesFunciones.getid_rubro_emplea(),false,"Formulario");
			this.setActualEstadoRubroForeignKey(this.rubroempleadoConstantesFunciones.getid_estado_rubro(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRubroEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRubroEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRubroEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRubroEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
			this.cargarCombosFrameEstadoRubrosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRubroEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoRubrosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRubroEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public RubroEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RubroEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RubroEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean(); 
		this.rubroempleadoConstantesFunciones=new RubroEmpleadoConstantesFunciones(); 
		this.rubroempleadoBean=new RubroEmpleado();//(this.rubroempleadoConstantesFunciones); 		
		this.rubroempleadoReturnGeneral=new RubroEmpleadoParameterReturnGeneral(); 
		
		this.rubroempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RubroEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RubroEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RubroEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRubroEmpleado(true);
			
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
			
			this.rubroempleadoConstantesFunciones=new RubroEmpleadoConstantesFunciones(); 
			this.rubroempleadoBean=new RubroEmpleado();//this.rubroempleadoConstantesFunciones); 			
			this.rubroempleadoReturnGeneral=new RubroEmpleadoParameterReturnGeneral(); 
		
			RubroEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubro Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.rubroempleado=new RubroEmpleado();
			this.rubroempleados = new ArrayList<RubroEmpleado>();
			this.rubroempleadosAux = new ArrayList<RubroEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic=new RubroEmpleadoLogic();
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.rubroempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rubroempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRubroEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRubroEmpleado);	
					}
					
					if(this.jInternalFrameImportacionRubroEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRubroEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRubroEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRubroEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRubroEmpleado);
				this.jInternalFrameDetalleFormRubroEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormRubroEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRubroEmpleado);
					this.jInternalFrameReporteDinamicoRubroEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoRubroEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRubroEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRubroEmpleado);
					this.jInternalFrameImportacionRubroEmpleado.setVisible(false);
					this.jInternalFrameImportacionRubroEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRubroEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRubroEmpleado);
					this.jInternalFrameOrderByRubroEmpleado.setVisible(false);
					this.jInternalFrameOrderByRubroEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRubroEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RubroEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rubroempleadoReturnGeneral=new RubroEmpleadoParameterReturnGeneral();
			
			this.rubroempleadoParameterGeneral=new RubroEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rubroempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RubroEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RubroEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rubroempleadoSessionBean.getEsGuardarRelacionado(),this.rubroempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RubroEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rubroempleadoSessionBean.getEsGuardarRelacionado(),this.rubroempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRubroEmpleado=false;
			this.isVisibilidadCeldaDuplicarRubroEmpleado=true;
			this.isVisibilidadCeldaCopiarRubroEmpleado=true;
			this.isVisibilidadCeldaVerFormRubroEmpleado=true;
			this.isVisibilidadCeldaOrdenRubroEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
			this.isVisibilidadCeldaModificarRubroEmpleado=false;
			this.isVisibilidadCeldaActualizarRubroEmpleado=false;
			this.isVisibilidadCeldaEliminarRubroEmpleado=false;
			this.isVisibilidadCeldaCancelarRubroEmpleado=false;
			this.isVisibilidadCeldaGuardarRubroEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoRubro=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRubroEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRubroEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRubroEmpleado(false);
			
			this.setPermisosUsuarioRubroEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.rubroempleadoSessionBean.getEsGuardarRelacionado() && this.rubroempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRubroEmpleadoClasesRelacionadas();
			}
			
			if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRubroEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRubroEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRubroEmpleado();
			}
			
			if(!this.isPermisoBusquedaRubroEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRubroEmpleado,this.isPermisoPaginacionMedioRubroEmpleado,this.isPermisoPaginacionTodoRubroEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RubroEmpleadoConstantesFunciones.getTiposSeleccionarRubroEmpleado());
				
				this.tiposColumnasSelect=RubroEmpleadoConstantesFunciones.getTiposSeleccionarRubroEmpleado(true);
				
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
			//if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRubroEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioRubroEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioRubroEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEmpleado() ;
			
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
			this.estadorubroLogic=new EstadoRubroLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				rubroempleadoImplementable= (RubroEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RubroEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rubroempleadoImplementableHome= (RubroEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RubroEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rubroempleados= new ArrayList<RubroEmpleado>();
			this.rubroempleadosEliminados= new ArrayList<RubroEmpleado>();
						
			this.isEsNuevoRubroEmpleado=false;
			this.esParaAccionDesdeFormularioRubroEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			this.estadorubrosForeignKey=new ArrayList<EstadoRubro>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRubroEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRubroEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RubroEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RubroEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRubroEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRubroEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRubroEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRubroEmpleado();
			}
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRubroEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRubroEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRubroEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRubroEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RubroEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRubroEmpleado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRubroEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRubroEmpleado();	
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
	
	public void cargarCombosForeignKeyRubroEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRubroEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRubroEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRubroEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRubroEmpleado();
		
		this.cargarCombosFrameForeignKeyRubroEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRubroEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRubroEmpleado();
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

	public void cargarCombosForeignKeyEstadoRubro(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoRubroListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoRubro();
				this.cargarCombosFrameEstadoRubrosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoRubro(this.estadorubrosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRubroEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
			
			if(jTableDatosRubroEmpleado.getRowCount()>=1) {
				jTableDatosRubroEmpleado.removeRowSelectionInterval(0, jTableDatosRubroEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoRubroEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRubroEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRubroEmpleado(true);			
			//this.rubroempleado=new RubroEmpleado();
			//this.rubroempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEmpleado() ;
			
			if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.rubroempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);				
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
			if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RubroEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRubroEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRubroEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRubroEmpleado.getSelectedRows().length;			
			}
			
			rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRubroEmpleado--;			
				//RubroEmpleado rubroempleadoAux= new RubroEmpleado();			
				//rubroempleadoAux.setId(this.iIdNuevoRubroEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RubroEmpleado rubroempleadoOrigen=new RubroEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RubroEmpleado rubroempleadoOrigen : rubroempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rubroempleadoOrigen =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleadoOrigen =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRubroEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.rubroempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRubroEmpleado(rubroempleadoOrigen,this.rubroempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rubroempleadoLogic.getRubroEmpleados().add(this.rubroempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rubroempleados.add(this.rubroempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRubroEmpleado(false);
				
				this.jTableDatosRubroEmpleado.setRowSelectionInterval(this.getIndiceNuevoRubroEmpleado(), this.getIndiceNuevoRubroEmpleado());
				
				int iLastRow =  this.jTableDatosRubroEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRubroEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRubroEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();									
		
			RubroEmpleado rubroempleadoOrigen=new RubroEmpleado();
			RubroEmpleado rubroempleadoDestino=new RubroEmpleado();
				
			rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRubroEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rubroempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRubroEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoOrigen =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rubroempleadoOrigen =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleadoDestino =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rubroempleadoDestino =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rubroempleadoOrigen =rubroempleadosSeleccionados.get(0);
				rubroempleadoDestino =rubroempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRubroEmpleado(rubroempleadoOrigen,rubroempleadoDestino,true,false);
				
				rubroempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rubroempleadoDestino,rubroempleadoLogic.getRubroEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroempleadoDestino,rubroempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRubroEmpleado(false);
				
				//this.jTableDatosRubroEmpleado.setRowSelectionInterval(this.getIndiceNuevoRubroEmpleado(), this.getIndiceNuevoRubroEmpleado());
				
				int iLastRow =  this.jTableDatosRubroEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRubroEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRubroEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRubroEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRubroEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRubroEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRubroEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionRubroEmpleado.setVisible(!isVisible);
			this.jPanelAccionesRubroEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRubroEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRubroEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRubroEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRubroEmpleado();
			
			this.abrirFrameOrderByRubroEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRubroEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRubroEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRubroEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRubroEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormRubroEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRubroEmpleado.setSize(this.jInternalFrameDetalleFormRubroEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormRubroEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRubroEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRubroEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRubroEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormRubroEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRubroEmpleado.jContentPaneDetalleRubroEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRubroEmpleado.jContentPaneDetalleRubroEmpleado.getWidth(),RubroEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRubroEmpleado.jContentPaneDetalleRubroEmpleado.getWidth(),RubroEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRubroEmpleado.jContentPaneDetalleRubroEmpleado.getWidth(),RubroEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRubroEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormRubroEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRubroEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRubroEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRubroEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByRubroEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRubroEmpleado);
				this.jInternalFrameOrderByRubroEmpleado.setVisible(false);
				this.jInternalFrameOrderByRubroEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByRubroEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRubroEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByRubroEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRubroEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRubroEmpleado==null) {
				
				this.jInternalFrameImportacionRubroEmpleado=new ImportacionJInternalFrame(RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRubroEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRubroEmpleado);
				this.jInternalFrameImportacionRubroEmpleado.setVisible(false);
				this.jInternalFrameImportacionRubroEmpleado.setSelected(false);


				this.jInternalFrameImportacionRubroEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRubroEmpleado"));
				this.jInternalFrameImportacionRubroEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRubroEmpleado"));
				this.jInternalFrameImportacionRubroEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRubroEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRubroEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRubroEmpleado==null) {
				this.jInternalFrameReporteDinamicoRubroEmpleado=new ReporteDinamicoJInternalFrame(RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRubroEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRubroEmpleado);
				this.jInternalFrameReporteDinamicoRubroEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoRubroEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRubroEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEmpleado"));
				this.jInternalFrameReporteDinamicoRubroEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEmpleado"));
				this.jInternalFrameReporteDinamicoRubroEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRubroEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRubroEmpleado);
			
	       	this.jInternalFrameDetalleFormRubroEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormRubroEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormRubroEmpleado.dispose();
			//this.jInternalFrameDetalleFormRubroEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRubroEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRubroEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoRubroEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRubroEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRubroEmpleado.setVisible(true);
	        this.jInternalFrameImportacionRubroEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRubroEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRubroEmpleado.setVisible(true);
	        this.jInternalFrameOrderByRubroEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRubroEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRubroEmpleado.setVisible(false);
	        this.jInternalFrameOrderByRubroEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRubroEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRubroEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoRubroEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRubroEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRubroEmpleado.setVisible(false);
	        this.jInternalFrameImportacionRubroEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRubroEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRubroEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRubroEmpleado(true);
			//this.isEsNuevoRubroEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRubroEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEmpleado(false) ;
			
			if(rubroempleadoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRubroEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRubroEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRubroEmpleado(true);
			//this.isEsNuevoRubroEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.rubroempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRubroEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRubroEmpleado(false) ;
			
			if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubroEmpleado.getSelectedRow();

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
		TableColumn tableColumnRubroEmplea=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubroEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoRubro(List<EstadoRubro> estadorubrosForeignKey)throws Exception{
		TableColumn tableColumnEstadoRubro=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO));
		TableCellEditor tableCellEditorEstadoRubro =tableColumnEstadoRubro.getCellEditor();

		EstadoRubroTableCell estadorubroTableCellFk=(EstadoRubroTableCell)tableCellEditorEstadoRubro;

		if(estadorubroTableCellFk!=null) {
			estadorubroTableCellFk.setestadorubrosForeignKey(estadorubrosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubroEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadorubroTableCellFk.setRowActual(intSelectedRow);
			//estadorubroTableCellFk.setestadorubrosForeignKeyActual(estadorubrosForeignKey);
		//}


		if(estadorubroTableCellFk!=null) {
			estadorubroTableCellFk.RecargarEstadoRubrosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRubroEmpleado(false);
			
			//if(!this.isEsNuevoRubroEmpleado) {								
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
				
			}
			
			if(this.permiteMantenimiento(this.rubroempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRubroEmpleado=true;
					this.inicializarActualizarBindingTablaRubroEmpleado(false);
					this.isEsNuevoRubroEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRubroEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRubroEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRubroEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEmpleado(false);
				
				this.habilitarDeshabilitarControlesRubroEmpleado(false);
			
												
				
				if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRubroEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRubroEmpleadoActionPerformed(evt,rubroempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRubroEmpleado(this.rubroempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRubroEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rubroempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.rubroempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.rubroempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.rubroempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.rubroempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RubroEmpleadoModel) this.jTableDatosRubroEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRubroEmpleado=true;
				this.inicializarActualizarBindingTablaRubroEmpleado(false);
				this.isEsNuevoRubroEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRubroEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEmpleado(false);
				
				this.habilitarDeshabilitarControlesRubroEmpleado(false);
				
				
				
				if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRubroEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRubroEmpleado.getRowCount()>=1) {
				jTableDatosRubroEmpleado.removeRowSelectionInterval(0, jTableDatosRubroEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRubroEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRubroEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEmpleado(false) ;
			
			this.isEsNuevoRubroEmpleado=false;
			
			if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRubroEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRubroEmpleado(false);
				
				//SI ES MANUAL
				if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRubroEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRubroEmpleado--;			
			//RubroEmpleado rubroempleadoAux= new RubroEmpleado();			
			//rubroempleadoAux.setId(this.iIdNuevoRubroEmpleado);
			
			if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRubroEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
			
			this.rubroempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rubroempleadoLogic.getRubroEmpleados().add(this.rubroempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rubroempleados.add(this.rubroempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRubroEmpleado(false);
			
			this.jTableDatosRubroEmpleado.setRowSelectionInterval(this.getIndiceNuevoRubroEmpleado(), this.getIndiceNuevoRubroEmpleado());
			
			int iLastRow =  this.jTableDatosRubroEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRubroEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRubroEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRubroEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRubroEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEmpleado(false);
			
			//SI ES MANUAL
			if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEmpleado();
			}
			
			//this.abrirFrameTreeRubroEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Rubro EmpleadoS ?", "MANTENIMIENTO DE Rubro Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRubroEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRubroEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.rubroempleadoReturnGeneral=rubroempleadoLogic.procesarImportacionRubroEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.rubroempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRubroEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRubroEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRubroEmpleado.setFileImportacion(this.jInternalFrameImportacionRubroEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRubroEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRubroEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRubroEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRubroEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		

		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RubroEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RubroEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteRubroEmpleados("Todos",rubroempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoRubro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoRubro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoRubro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoRubro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEmpleadoConstantesFunciones.LABEL_VALOR:
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
		
		if(this.jInternalFrameReporteDinamicoRubroEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO:
					sNombreCampoCategoria="id_estado_rubro";
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO:
					sNombreCampoCategoriaValor="id_estado_rubro";
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Rubro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_rubro");
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_VALOR:
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
	
	public void jButtonGenerarExcelReporteDinamicoRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RubroEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RubroEmpleado rubroempleado:rubroempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(RubroEmpleado rubroempleado:rubroempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleado.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(RubroEmpleado rubroempleado:rubroempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleado.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO);
					iRow++;

					for(RubroEmpleado rubroempleado:rubroempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleado.getestadorubro_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEmpleadoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(RubroEmpleado rubroempleado:rubroempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleado.getvalor());
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
			//	this.getFilaCabeceraExportarExcelRubroEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(RubroEmpleado rubroempleadoAux:rubroempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRubroEmpleado(rubroempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEmpleado(false);
			
			//SI ES MANUAL
			if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEmpleado(false);
			
			//SI ES MANUAL
			if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRubroEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEmpleado(false);
			
			//SI ES MANUAL
			if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRubroEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRubroEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRubroEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRubroEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRubroEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRubroEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRubroEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosRubroEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosRubroEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRubroEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRubroEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRubroEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRubroEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRubroEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRubroEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRubroEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRubroEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRubroEmpleado();
		
		this.inicializarActualizarBindingBotonesManualRubroEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRubroEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRubroEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRubroEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRubroEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRubroEmpleado.jCheckBoxPostAccionNuevoRubroEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRubroEmpleado.jCheckBoxPostAccionSinCerrarRubroEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRubroEmpleado.jCheckBoxPostAccionSinMensajeRubroEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRubroEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRubroEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRubroEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
				this.jInternalFrameDetalleFormRubroEmpleado.jCheckBoxPostAccionNuevoRubroEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRubroEmpleado.jCheckBoxPostAccionSinCerrarRubroEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRubroEmpleado.jCheckBoxPostAccionSinMensajeRubroEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRubroEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRubroEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRubroEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRubroEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRubroEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRubroEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRubroEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRubroEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRubroEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRubroEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRubroEmpleado() throws Exception {
		try	{
			if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRubroEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRubroEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRubroEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRubroEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRubroEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRubroEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRubroEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRubroEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRubroEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRubroEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRubroEmpleado.addItem(reporte);
			}
			
			
			if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRubroEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRubroEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRubroEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRubroEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRubroEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRubroEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRubroEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRubroEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRubroEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
				this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
				this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRubroEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RubroEmpleadoConstantesFunciones.getTiposSeleccionarRubroEmpleado(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RubroEmpleadoConstantesFunciones.getTiposSeleccionarRubroEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RubroEmpleadoConstantesFunciones.getTiposSeleccionarRubroEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRubroEmpleado.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRubroEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.getSelectedItem()!=null){this.id_estado_rubroFK_IdEstadoRubro=((EstadoRubro)this.jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.getSelectedItem()!=null){this.id_rubro_empleaFK_IdRubroEmplea=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRubroEmpleado(Boolean esInicializar) throws Exception {				
		if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRubroEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRubroEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaRubroEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRubroEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRubroEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRubroEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rubroempleadoLogic.getRubroEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rubroempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRubroEmpleado.setModel(new RubroEmpleadoModel(this.rubroempleadoLogic.getRubroEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRubroEmpleado.setModel(new RubroEmpleadoModel(this.rubroempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRubroEmpleado!=null && this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRubroEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO,rubroempleadoConstantesFunciones.resaltarSeleccionarRubroEmpleado,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO,rubroempleadoConstantesFunciones.resaltarSeleccionarRubroEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_ID));

		if(this.rubroempleadoConstantesFunciones.mostraridRubroEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rubroempleadoConstantesFunciones.resaltaridRubroEmpleado,this.rubroempleadoConstantesFunciones.activaridRubroEmpleado,iSizeTabla,this,true,"idRubroEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubroempleadoConstantesFunciones.resaltaridRubroEmpleado,this.rubroempleadoConstantesFunciones.activaridRubroEmpleado,this,true,"idRubroEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.rubroempleadoConstantesFunciones.mostrarid_empresaRubroEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.rubroempleadoConstantesFunciones.resaltarid_empresaRubroEmpleado,this,this.rubroempleadoConstantesFunciones.activarid_empresaRubroEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.rubroempleadoConstantesFunciones.resaltarid_empresaRubroEmpleado,this,this.rubroempleadoConstantesFunciones.activarid_empresaRubroEmpleado,false,"id_empresaRubroEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.rubroempleadoConstantesFunciones.mostrarid_empleadoRubroEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.rubroempleadoConstantesFunciones.resaltarid_empleadoRubroEmpleado,this,this.rubroempleadoConstantesFunciones.activarid_empleadoRubroEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.rubroempleadoConstantesFunciones.resaltarid_empleadoRubroEmpleado,this,this.rubroempleadoConstantesFunciones.activarid_empleadoRubroEmpleado,true,"id_empleadoRubroEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.rubroempleadoConstantesFunciones.mostrarid_rubro_empleaRubroEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.rubroempleadoConstantesFunciones.resaltarid_rubro_empleaRubroEmpleado,this,this.rubroempleadoConstantesFunciones.activarid_rubro_empleaRubroEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.rubroempleadoConstantesFunciones.resaltarid_rubro_empleaRubroEmpleado,this,this.rubroempleadoConstantesFunciones.activarid_rubro_empleaRubroEmpleado,true,"id_rubro_empleaRubroEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO));

		if(this.rubroempleadoConstantesFunciones.mostrarid_estado_rubroRubroEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoRubroTableCell(this.estadorubrosForeignKey,this.rubroempleadoConstantesFunciones.resaltarid_estado_rubroRubroEmpleado,this,this.rubroempleadoConstantesFunciones.activarid_estado_rubroRubroEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EstadoRubroTableCell(this.estadorubrosForeignKey,this.rubroempleadoConstantesFunciones.resaltarid_estado_rubroRubroEmpleado,this,this.rubroempleadoConstantesFunciones.activarid_estado_rubroRubroEmpleado,true,"id_estado_rubroRubroEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,RubroEmpleadoConstantesFunciones.LABEL_VALOR));

		if(this.rubroempleadoConstantesFunciones.mostrarvalorRubroEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleadoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rubroempleadoConstantesFunciones.resaltarvalorRubroEmpleado,this.rubroempleadoConstantesFunciones.activarvalorRubroEmpleado,iSizeTabla,this,true,"valorRubroEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubroempleadoConstantesFunciones.resaltarvalorRubroEmpleado,this.rubroempleadoConstantesFunciones.activarvalorRubroEmpleado,this,true,"valorRubroEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RubroEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rubroempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rubroempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRubroEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rubroempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rubroempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRubroEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rubroempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rubroempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRubroEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosRubroEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRubroEmpleado.moveColumn(this.jTableDatosRubroEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRubroEmpleado.moveColumn(this.jTableDatosRubroEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRubroEmpleado.moveColumn(this.jTableDatosRubroEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRubroEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRubroEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRubroEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRubroEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRubroEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRubroEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRubroEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRubroEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=rubroempleadoLogic.getRubroEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rubroempleados.size()-1;
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
		//this.jTableDatosRubroEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRubroEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRubroEmpleado();
			
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
				
				//this.isEsNuevoRubroEmpleado=false;
					
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
				if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRubroEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRubroEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRubroEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.rubroempleado.getsType().equals("DUPLICADO")
				   || this.rubroempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRubroEmpleado=true;
				
				} else {
					this.isEsNuevoRubroEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.rubroempleado.getId()>=0 && !this.rubroempleado.getIsNew()) {						
						this.isEsNuevoRubroEmpleado=false;
						
					} else {
						this.isEsNuevoRubroEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRubroEmpleado(esRelaciones);						
				
				this.seleccionarRubroEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.rubroempleado.getId()<0) {
					this.isEsNuevoRubroEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRubroEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRubroEmpleado(evt,rowIndex);
				}	
				
				if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RubroEmpleado: " + this.dDif); 
					}
				}								
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRubroEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.rubroempleado)) {
					if(this.rubroempleado.getId()>0) {
						this.rubroempleado.setIsDeleted(true);
						
						this.rubroempleadosEliminados.add(this.rubroempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rubroempleadoLogic.getRubroEmpleados().remove(this.rubroempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rubroempleados.remove(this.rubroempleado);				
					}
					
					
					((RubroEmpleadoModel) this.jTableDatosRubroEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRubroEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRubroEmpleado) {
			
			if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRubroEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRubroEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRubroEmpleado(this.rubroempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.rubroempleadoConstantesFunciones.cargarid_empresaRubroEmpleado || this.rubroempleadoConstantesFunciones.event_dependid_empresaRubroEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.rubroempleado.getid_empresa());
									//this.inicializarActualizarBindingRubroEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(rubroempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(rubroempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.rubroempleado.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.rubroempleadoConstantesFunciones.cargarid_empleadoRubroEmpleado || this.rubroempleadoConstantesFunciones.event_dependid_empleadoRubroEmpleado) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.rubroempleado.getid_empleado());
									//this.inicializarActualizarBindingRubroEmpleado(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(rubroempleado.getEmpleado()!=null) {
							this.empleadosForeignKey.add(rubroempleado.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.rubroempleado.getid_empleado(),false,"Formulario");

					//RubroEmplea
					if(!this.rubroempleadoConstantesFunciones.cargarid_rubro_empleaRubroEmpleado || this.rubroempleadoConstantesFunciones.event_dependid_rubro_empleaRubroEmpleado) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.rubroempleado.getid_rubro_emplea());
									//this.inicializarActualizarBindingRubroEmpleado(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(rubroempleado.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(rubroempleado.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.rubroempleado.getid_rubro_emplea(),false,"Formulario");

					//EstadoRubro
					if(!this.rubroempleadoConstantesFunciones.cargarid_estado_rubroRubroEmpleado || this.rubroempleadoConstantesFunciones.event_dependid_estado_rubroRubroEmpleado) {
						//this.cargarCombosEstadoRubrosForeignKeyLista(" where id="+this.rubroempleado.getid_estado_rubro());
									//this.inicializarActualizarBindingRubroEmpleado(false,false);
						this.estadorubrosForeignKey=new ArrayList<EstadoRubro>();

						if(rubroempleado.getEstadoRubro()!=null) {
							this.estadorubrosForeignKey.add(rubroempleado.getEstadoRubro());
						}

						this.addItemDefectoCombosForeignKeyEstadoRubro();
						this.cargarCombosFrameEstadoRubrosForeignKey("Todos");
					}
					this.setActualEstadoRubroForeignKey(this.rubroempleado.getid_estado_rubro(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRubroEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRubroEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRubroEmpleado(RubroEmpleado rubroempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRubroEmpleado(rubroempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRubroEmpleado(RubroEmpleado rubroempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRubroEmpleado(rubroempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRubroEmpleado(rubroempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRubroEmpleado(rubroempleado);
	}
	
	public void setVariablesObjetoActualToFormularioRubroEmpleado(RubroEmpleado rubroempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.setText(rubroempleado.getId().toString());
			this.jInternalFrameDetalleFormRubroEmpleado.jTextFieldvalorRubroEmpleado.setText(rubroempleado.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RubroEmpleado rubroempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rubroempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RubroEmpleado rubroempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rubroempleadoLocal=this.rubroempleado;
			} else {
				rubroempleadoLocal=this.rubroempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rubroempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRubroEmpleado(rubroempleadoLocal,true);
					
					if(rubroempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rubroempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rubroempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRubroEmpleado(RubroEmpleado rubroempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRubroEmpleado(rubroempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(rubroempleado);
	}
	
	public void setVariablesFormularioToObjetoActualRubroEmpleado(RubroEmpleado rubroempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRubroEmpleado(rubroempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRubroEmpleado(RubroEmpleado rubroempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.getText()==null || this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.getText()=="" || this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.setText("0");
			}

			if(conColumnasBase) {rubroempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubroEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleado.jLabelIdRubroEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rubroempleado.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormRubroEmpleado.jTextFieldvalorRubroEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubroEmpleadoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleado.jLabelvalorRubroEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRubroEmpleado(RubroEmpleado rubroempleadoBean,RubroEmpleado rubroempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && rubroempleadoBean.getid_empleado()!=null && !rubroempleadoBean.getid_empleado().equals(-1L))) {rubroempleado.setid_empleado(rubroempleadoBean.getid_empleado());}
			if(conDefault || (!conDefault && rubroempleadoBean.getid_rubro_emplea()!=null && !rubroempleadoBean.getid_rubro_emplea().equals(-1L))) {rubroempleado.setid_rubro_emplea(rubroempleadoBean.getid_rubro_emplea());}
			if(conDefault || (!conDefault && rubroempleadoBean.getid_estado_rubro()!=null && !rubroempleadoBean.getid_estado_rubro().equals(-1L))) {rubroempleado.setid_estado_rubro(rubroempleadoBean.getid_estado_rubro());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRubroEmpleado(RubroEmpleado rubroempleadoOrigen,RubroEmpleado rubroempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rubroempleadoOrigen.getId()!=null && !rubroempleadoOrigen.getId().equals(0L))) {rubroempleado.setId(rubroempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && rubroempleadoOrigen.getid_empleado()!=null && !rubroempleadoOrigen.getid_empleado().equals(-1L))) {rubroempleado.setid_empleado(rubroempleadoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && rubroempleadoOrigen.getid_rubro_emplea()!=null && !rubroempleadoOrigen.getid_rubro_emplea().equals(-1L))) {rubroempleado.setid_rubro_emplea(rubroempleadoOrigen.getid_rubro_emplea());}
			if(conDefault || (!conDefault && rubroempleadoOrigen.getid_estado_rubro()!=null && !rubroempleadoOrigen.getid_estado_rubro().equals(-1L))) {rubroempleado.setid_estado_rubro(rubroempleadoOrigen.getid_estado_rubro());}
			if(conDefault || (!conDefault && rubroempleadoOrigen.getvalor()!=null && !rubroempleadoOrigen.getvalor().equals(0.0))) {rubroempleado.setvalor(rubroempleadoOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRubroEmpleado(RubroEmpleado rubroempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.setText(rubroempleado.getId().toString());
			this.jInternalFrameDetalleFormRubroEmpleado.jTextFieldvalorRubroEmpleado.setText(rubroempleado.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRubroEmpleado(RubroEmpleadoBean rubroempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.setText(rubroempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormRubroEmpleado.jTextFieldvalorRubroEmpleado.setText(rubroempleadoBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRubroEmpleado(RubroEmpleadoParameterReturnGeneral rubroempleadoReturnGeneral,RubroEmpleadoBean rubroempleadoBean,Boolean conDefault) throws Exception { 
		try {
			RubroEmpleado rubroempleadoLocal=new RubroEmpleado();
			
			rubroempleadoLocal=rubroempleadoReturnGeneral.getRubroEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rubroempleadoLocal.getId()!=null && !rubroempleadoLocal.getId().equals(0L))) {rubroempleadoBean.setId(rubroempleadoLocal.getId());}}
			if(conDefault || (!conDefault && rubroempleadoLocal.getid_empleado()!=null && !rubroempleadoLocal.getid_empleado().equals(-1L))) {rubroempleadoBean.setid_empleado(rubroempleadoLocal.getid_empleado());}
			if(conDefault || (!conDefault && rubroempleadoLocal.getid_rubro_emplea()!=null && !rubroempleadoLocal.getid_rubro_emplea().equals(-1L))) {rubroempleadoBean.setid_rubro_emplea(rubroempleadoLocal.getid_rubro_emplea());}
			if(conDefault || (!conDefault && rubroempleadoLocal.getid_estado_rubro()!=null && !rubroempleadoLocal.getid_estado_rubro().equals(-1L))) {rubroempleadoBean.setid_estado_rubro(rubroempleadoLocal.getid_estado_rubro());}
			if(conDefault || (!conDefault && rubroempleadoLocal.getvalor()!=null && !rubroempleadoLocal.getvalor().equals(0.0))) {rubroempleadoBean.setvalor(rubroempleadoLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRubroEmpleadoGenerico(Long idRubroEmpleadoSeleccionado,JComboBox jComboBoxRubroEmpleado,List<RubroEmpleado> rubroempleadosLocal)throws Exception {
		try {
			RubroEmpleado  rubroempleadoTemp=null;

			for(RubroEmpleado rubroempleadoAux:rubroempleadosLocal) {
				if(rubroempleadoAux.getId()!=null && rubroempleadoAux.getId().equals(idRubroEmpleadoSeleccionado)) {
					rubroempleadoTemp=rubroempleadoAux;
					break;
				}
			}

			jComboBoxRubroEmpleado.setSelectedItem(rubroempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRubroEmpleadoGenerico(JComboBox jComboBoxRubroEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRubroEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRubroEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRubroEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRubroEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRubroEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRubroEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroempleado=(RubroEmpleado) rubroempleadoLogic.getRubroEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rubroempleado =(RubroEmpleado) rubroempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!rubroempleado.getIsNew() && !rubroempleado.getIsChanged() && !rubroempleado.getIsDeleted()) {
				sDescripcion=rubroempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!rubroempleado.getIsNew() && !rubroempleado.getIsChanged() && !rubroempleado.getIsDeleted()) {
				sDescripcion=rubroempleado.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleado.getempleado_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!rubroempleado.getIsNew() && !rubroempleado.getIsChanged() && !rubroempleado.getIsDeleted()) {
				sDescripcion=rubroempleado.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleado.getrubroemplea_descripcion();
			}
		}

		if(sTipo.equals("EstadoRubro")) {
			//sDescripcion=this.getActualEstadoRubroForeignKeyDescripcion((Long)value);
			if(!rubroempleado.getIsNew() && !rubroempleado.getIsChanged() && !rubroempleado.getIsDeleted()) {
				sDescripcion=rubroempleado.getestadorubro_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoRubroForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleado.getestadorubro_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RubroEmpleado rubroempleadoRow=new RubroEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroempleadoRow=(RubroEmpleado) rubroempleadoLogic.getRubroEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rubroempleadoRow=(RubroEmpleado) rubroempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRubroEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleado && this.isPermisoNuevoRubroEmpleado));			
			this.jButtonDuplicarRubroEmpleado.setVisible((this.isVisibilidadCeldaDuplicarRubroEmpleado && this.isPermisoDuplicarRubroEmpleado));			
			this.jButtonCopiarRubroEmpleado.setVisible((this.isVisibilidadCeldaCopiarRubroEmpleado && this.isPermisoCopiarRubroEmpleado));
			this.jButtonVerFormRubroEmpleado.setVisible((this.isVisibilidadCeldaVerFormRubroEmpleado && this.isPermisoVerFormRubroEmpleado));
			
			this.jButtonAbrirOrderByRubroEmpleado.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleado && this.isPermisoOrdenRubroEmpleado));			
			
			this.jButtonNuevoRelacionesRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado && this.isPermisoNuevoRubroEmpleado));			
			this.jButtonNuevoGuardarCambiosRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleado && this.isPermisoNuevoRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));
			
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarRubroEmpleado.setVisible((this.isVisibilidadCeldaModificarRubroEmpleado && this.isPermisoActualizarRubroEmpleado));	
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarRubroEmpleado.setVisible((this.isVisibilidadCeldaActualizarRubroEmpleado && this.isPermisoActualizarRubroEmpleado));	
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarRubroEmpleado.setVisible((this.isVisibilidadCeldaEliminarRubroEmpleado && this.isPermisoEliminarRubroEmpleado));
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarRubroEmpleado.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleado);							
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosRubroEmpleado.setVisible((this.isVisibilidadCeldaGuardarRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaRubroEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleado && this.isPermisoNuevoRubroEmpleado));						
			this.jButtonDuplicarToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaDuplicarRubroEmpleado && this.isPermisoDuplicarRubroEmpleado));						
			this.jButtonCopiarToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaCopiarRubroEmpleado && this.isPermisoCopiarRubroEmpleado));			
			this.jButtonVerFormToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaVerFormRubroEmpleado && this.isPermisoVerFormRubroEmpleado));			
			this.jButtonAbrirOrderByToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleado && this.isPermisoOrdenRubroEmpleado));
			this.jButtonNuevoRelacionesToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado && this.isPermisoNuevoRubroEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleado && this.isPermisoNuevoRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));			
			
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaModificarRubroEmpleado && this.isPermisoActualizarRubroEmpleado));	
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaActualizarRubroEmpleado  && this.isPermisoActualizarRubroEmpleado));	
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaEliminarRubroEmpleado && this.isPermisoEliminarRubroEmpleado));
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarToolBarRubroEmpleado.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleado);				
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaGuardarRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRubroEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleado && this.isPermisoNuevoRubroEmpleado));			
			this.jMenuItemDuplicarRubroEmpleado.setVisible((this.isVisibilidadCeldaDuplicarRubroEmpleado && this.isPermisoDuplicarRubroEmpleado));			
			this.jMenuItemCopiarRubroEmpleado.setVisible((this.isVisibilidadCeldaCopiarRubroEmpleado && this.isPermisoCopiarRubroEmpleado));			
			this.jMenuItemVerFormRubroEmpleado.setVisible((this.isVisibilidadCeldaVerFormRubroEmpleado && this.isPermisoVerFormRubroEmpleado));			
			this.jMenuItemAbrirOrderByRubroEmpleado.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleado && this.isPermisoOrdenRubroEmpleado));			
			//this.jMenuItemMostrarOcultarRubroEmpleado.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleado && this.isPermisoOrdenRubroEmpleado));
			this.jMenuItemDetalleAbrirOrderByRubroEmpleado.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleado && this.isPermisoOrdenRubroEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarRubroEmpleado.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleado && this.isPermisoOrdenRubroEmpleado));			
			this.jMenuItemNuevoRelacionesRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado && this.isPermisoNuevoRubroEmpleado));			
			this.jMenuItemNuevoGuardarCambiosRubroEmpleado.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleado && this.isPermisoNuevoRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));									
			
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemModificarRubroEmpleado.setVisible((this.isVisibilidadCeldaModificarRubroEmpleado && this.isPermisoActualizarRubroEmpleado));	
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemActualizarRubroEmpleado.setVisible((this.isVisibilidadCeldaActualizarRubroEmpleado && this.isPermisoActualizarRubroEmpleado));	
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemEliminarRubroEmpleado.setVisible((this.isVisibilidadCeldaEliminarRubroEmpleado && this.isPermisoEliminarRubroEmpleado));
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemCancelarRubroEmpleado.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosRubroEmpleado.setVisible((this.isVisibilidadCeldaGuardarRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));						
			this.jMenuItemGuardarCambiosTablaRubroEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRubroEmpleado=this.jButtonNuevoRubroEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarRubroEmpleado=this.jButtonDuplicarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarRubroEmpleado=this.jButtonCopiarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormRubroEmpleado=this.jButtonVerFormRubroEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenRubroEmpleado=this.jButtonAbrirOrderByRubroEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=this.jButtonNuevoRelacionesRubroEmpleado.isVisible();
			this.isVisibilidadCeldaModificarRubroEmpleado=this.jButtonModificarRubroEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			this.isVisibilidadCeldaActualizarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosRubroEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=this.jButtonGuardarCambiosTablaRubroEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRubroEmpleado=this.jButtonNuevoToolBarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=this.jButtonNuevoRelacionesToolBarRubroEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			this.isVisibilidadCeldaModificarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarToolBarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarToolBarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarToolBarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarToolBarRubroEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRubroEmpleado=this.jButtonGuardarCambiosToolBarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=this.jButtonGuardarCambiosTablaToolBarRubroEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRubroEmpleado=this.jMenuItemNuevoRubroEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=this.jMenuItemNuevoRelacionesRubroEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			this.isVisibilidadCeldaModificarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemModificarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemActualizarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemEliminarRubroEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarRubroEmpleado=this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemCancelarRubroEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRubroEmpleado=this.jMenuItemGuardarCambiosRubroEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=this.jMenuItemGuardarCambiosTablaRubroEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRubroEmpleado(Boolean esInicializar) {
		if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRubroEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualRubroEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRubroEmpleado() {
		this.jButtonNuevoRubroEmpleado.setVisible(this.isPermisoNuevoRubroEmpleado);			
		this.jButtonDuplicarRubroEmpleado.setVisible(this.isPermisoDuplicarRubroEmpleado);			
		this.jButtonCopiarRubroEmpleado.setVisible(this.isPermisoCopiarRubroEmpleado);			
		this.jButtonVerFormRubroEmpleado.setVisible(this.isPermisoVerFormRubroEmpleado);			
		
		this.jButtonAbrirOrderByRubroEmpleado.setVisible(this.isPermisoOrdenRubroEmpleado);					
		
		this.jButtonNuevoRelacionesRubroEmpleado.setVisible(this.isPermisoNuevoRubroEmpleado);			
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarRubroEmpleado.setVisible(this.isPermisoActualizarRubroEmpleado);	
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarRubroEmpleado.setVisible(this.isPermisoActualizarRubroEmpleado);	
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarRubroEmpleado.setVisible(this.isPermisoEliminarRubroEmpleado);
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarRubroEmpleado.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleado);						
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosRubroEmpleado.setVisible(this.isPermisoGuardarCambiosRubroEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaRubroEmpleado.setVisible(this.isPermisoActualizarRubroEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRubroEmpleado() {
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarRubroEmpleado.setVisible(this.isPermisoActualizarRubroEmpleado);	
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarRubroEmpleado.setVisible(this.isPermisoActualizarRubroEmpleado);	
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarRubroEmpleado.setVisible(this.isPermisoEliminarRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarRubroEmpleado.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleado);							
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosRubroEmpleado.setVisible((this.isVisibilidadCeldaGuardarRubroEmpleado && this.isPermisoGuardarCambiosRubroEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRubroEmpleado() {
		if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRubroEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRubroEmpleado() {
	}
	
	public void jTableDatosRubroEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRubroEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRubroEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleado==null) {
						this.rubroempleado = new RubroEmpleado();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
				}

				if(this.rubroempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.rubroempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRubroEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRubroEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rubroempleadoLogic.getConnexion());

				if(this.rubroempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.rubroempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleado=(TitledBorder)this.jScrollPanelDatosRubroEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRubroEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRubroEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleado==null) {
						this.rubroempleado = new RubroEmpleado();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
				}

				if(this.rubroempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.rubroempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoRubroEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebRubroEmpleado(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.rubroempleadoLogic.getConnexion());

				if(this.rubroempleado.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.rubroempleado.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleado=(TitledBorder)this.jScrollPanelDatosRubroEmpleado.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderRubroEmpleado.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoRubroEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleado==null) {
						this.rubroempleado = new RubroEmpleado();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
				}

				if(this.rubroempleado.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.rubroempleado.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaRubroEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebRubroEmpleado(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.rubroempleadoLogic.getConnexion());

				if(this.rubroempleado.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.rubroempleado.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleado=(TitledBorder)this.jScrollPanelDatosRubroEmpleado.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderRubroEmpleado.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaRubroEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleado==null) {
						this.rubroempleado = new RubroEmpleado();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
				}

				if(this.rubroempleado.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.rubroempleado.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_rubroRubroEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadorubro=true;

			idTienePermisoestadorubro=this.tienePermisosUsuarioEnPaginaWebRubroEmpleado(EstadoRubroConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadorubro) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);

				this.estadorubroBeanSwingJInternalFrame=new EstadoRubroBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadorubroBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadorubroBeanSwingJInternalFrame.getEstadoRubroLogic().setConnexion(this.rubroempleadoLogic.getConnexion());

				if(this.rubroempleado.getid_estado_rubro()!=null) {
					this.estadorubroBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadorubroBeanSwingJInternalFrame.setIdActual(this.rubroempleado.getid_estado_rubro());
					this.estadorubroBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadorubroBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadorubroBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoRubro();
				}

				JInternalFrameBase jinternalFrame =this.estadorubroBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleado=(TitledBorder)this.jScrollPanelDatosRubroEmpleado.getBorder();
				TitledBorder titledBorderestadorubro=(TitledBorder)this.estadorubroBeanSwingJInternalFrame.jScrollPanelDatosEstadoRubro.getBorder();

				titledBorderestadorubro.setTitle(titledBorderRubroEmpleado.getTitle() + " -> Estado Rubro");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_rubroRubroEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleado==null) {
						this.rubroempleado = new RubroEmpleado();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
				}

				if(this.rubroempleado.getid_estado_rubro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_rubro = "+this.rubroempleado.getid_estado_rubro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorRubroEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.getrubroempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleado==null) {
						this.rubroempleado = new RubroEmpleado();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);
				}

				if(this.rubroempleado.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.rubroempleado.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleado(false,false);

			this.getRubroEmpleadosFK_IdEmpleado();

			this.inicializarActualizarBindingRubroEmpleado(false);

			//if(RubroEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleado(false,false);

			this.getRubroEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingRubroEmpleado(false);

			//if(RubroEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoRubroRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleado(false,false);

			this.getRubroEmpleadosFK_IdEstadoRubro();

			this.inicializarActualizarBindingRubroEmpleado(false);

			//if(RubroEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaRubroEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleado(false,false);

			this.getRubroEmpleadosFK_IdRubroEmplea();

			this.inicializarActualizarBindingRubroEmpleado(false);

			//if(RubroEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRubroEmpleado() {
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
			this.jInternalFrameDetalleFormRubroEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormRubroEmpleado.dispose();
			this.jInternalFrameDetalleFormRubroEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
			this.jInternalFrameReporteDinamicoRubroEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRubroEmpleado.dispose();
			this.jInternalFrameReporteDinamicoRubroEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionRubroEmpleado!=null) {
			this.jInternalFrameImportacionRubroEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionRubroEmpleado.dispose();
			this.jInternalFrameImportacionRubroEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRubroEmpleado();
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoRubroEmpleado")) {
				jButtonNuevoRubroEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRubroEmpleado")) {
				jButtonDuplicarRubroEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRubroEmpleado")) {
				jButtonCopiarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormRubroEmpleado")) {
				jButtonVerFormRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRubroEmpleado")) {
				jButtonNuevoRubroEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRubroEmpleado")) {
				jButtonDuplicarRubroEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRubroEmpleado")) {
				jButtonNuevoRubroEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRubroEmpleado")) {
				jButtonDuplicarRubroEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRubroEmpleado")) {
				jButtonNuevoRubroEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRubroEmpleado")) {
				jButtonNuevoRubroEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRubroEmpleado")) {
				jButtonNuevoRubroEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRubroEmpleado")) {
				jButtonModificarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRubroEmpleado")) {
				jButtonModificarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRubroEmpleado")) {
				jButtonModificarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRubroEmpleado")) {
				jButtonActualizarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRubroEmpleado")) {
				jButtonActualizarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRubroEmpleado")) {
				jButtonActualizarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarRubroEmpleado")) {
				jButtonEliminarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRubroEmpleado")) {
				jButtonEliminarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRubroEmpleado")) {
				jButtonEliminarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarRubroEmpleado")) {
				jButtonCancelarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRubroEmpleado")) {
				jButtonCancelarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRubroEmpleado")) {
				jButtonCancelarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarRubroEmpleado")) {
				jButtonCerrarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRubroEmpleado")) {
				jButtonCerrarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRubroEmpleado")) {
				jButtonCerrarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRubroEmpleado")) {
				jButtonMostrarOcultarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRubroEmpleado")) {
				jButtonCancelarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRubroEmpleado")) {
				jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRubroEmpleado")) {
				jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRubroEmpleado")) {
				jButtonCopiarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRubroEmpleado")) {
				jButtonVerFormRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRubroEmpleado")) {
				jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRubroEmpleado")) {
				jButtonCopiarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRubroEmpleado")) {
				jButtonVerFormRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRubroEmpleado")) {
				jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRubroEmpleado")) {
				jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRubroEmpleado")) {
				jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRubroEmpleado")) {
				jButtonRecargarInformacionRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRubroEmpleado")) {
				jButtonRecargarInformacionRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRubroEmpleado")) {
				jButtonRecargarInformacionRubroEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRubroEmpleado")) {
				jButtonAnterioresRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRubroEmpleado")) {
				jButtonAnterioresRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRubroEmpleado")) {
				jButtonAnterioresRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRubroEmpleado")) {
				jButtonSiguientesRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRubroEmpleado")) {
				jButtonSiguientesRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRubroEmpleado")) {
				jButtonSiguientesRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRubroEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByRubroEmpleado")) {
				jButtonAbrirOrderByRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRubroEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarRubroEmpleado")) {
				jButtonMostrarOcultarRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRubroEmpleado")) {
				jButtonNuevoGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRubroEmpleado")) {
				jButtonNuevoGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRubroEmpleado")) {
				jButtonNuevoGuardarCambiosRubroEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRubroEmpleado")) {
				jButtonCerrarReporteDinamicoRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRubroEmpleado")) {
				jButtonGenerarReporteDinamicoRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRubroEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRubroEmpleado")) {
				jButtonCerrarImportacionRubroEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRubroEmpleado")) {
				
				jButtonGenerarImportacionRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRubroEmpleado")) {
				
				jButtonAbrirImportacionRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRubroEmpleado")) {
				jComboBoxTiposAccionesRubroEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRubroEmpleado")) {
				jComboBoxTiposRelacionesRubroEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRubroEmpleado")) {
				jComboBoxTiposAccionesRubroEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRubroEmpleado")) {
				
				jComboBoxTiposSeleccionarRubroEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRubroEmpleado")) {
				jTextFieldValorCampoGeneralRubroEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRubroEmpleado")) {
				jButtonAbrirOrderByRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRubroEmpleado")) {
				jButtonAbrirOrderByRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRubroEmpleado")) {
				jButtonCerrarOrderByRubroEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRubroEmpleadoBusqueda")) {
				this.jButtonidRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRubroEmpleadoUpdate")) {
				this.jButtonid_empresaRubroEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRubroEmpleadoBusqueda")) {
				this.jButtonid_empresaRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoRubroEmpleadoUpdate")) {
				this.jButtonid_empleadoRubroEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoRubroEmpleadoBusqueda")) {
				this.jButtonid_empleadoRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEmpleadoUpdate")) {
				this.jButtonid_rubro_empleaRubroEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEmpleadoBusqueda")) {
				this.jButtonid_rubro_empleaRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_rubroRubroEmpleadoUpdate")) {
				this.jButtonid_estado_rubroRubroEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_rubroRubroEmpleadoBusqueda")) {
				this.jButtonid_estado_rubroRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRubroEmpleadoBusqueda")) {
				this.jButtonvalorRubroEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoRubroEmpleado")) {
				this.jButtonFK_IdEmpleadoRubroEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoRubroRubroEmpleado")) {
				this.jButtonFK_IdEstadoRubroRubroEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRubroEmpleaRubroEmpleado")) {
				this.jButtonFK_IdRubroEmpleaRubroEmpleadoActionPerformed(evt);
			}
			
			;
			
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRubroEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				


				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RubroEmpleado rubroempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				rubroempleadoLocal=this.rubroempleado;
			} else {
				rubroempleadoLocal=this.rubroempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
							
				
				


				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
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
			
			


			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
								
						
				


				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
								
				
				


				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
							
				
				


				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
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
			
			


			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
								
				
				


				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRubroEmpleado")) {
					jCheckBoxSeleccionarTodosRubroEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRubroEmpleado")) {
					jCheckBoxSeleccionadosRubroEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRubroEmpleado")) {
					
				}
				
				


				
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
												
				
				


				
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
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
			
			


			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleado);
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
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
				
				


				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleadoAnterior =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRubroEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRubroEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRubroEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.rubroempleado =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.rubroempleado =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.rubroempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRubroEmpleado")) {
				
				}
				
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRubroEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRubroEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRubroEmpleado")) {
			
			}
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRubroEmpleado();
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoRubroEmpleado")) {
				jButtonNuevoRubroEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRubroEmpleado")) {
				jButtonDuplicarRubroEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRubroEmpleado")) {
				jButtonCopiarRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRubroEmpleado")) {
				jButtonVerFormRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRubroEmpleado")) {
				jButtonNuevoRubroEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRubroEmpleado")) {
				jButtonModificarRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRubroEmpleado")) {
				jButtonActualizarRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRubroEmpleado")) {
				jButtonEliminarRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRubroEmpleado")) {
				jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRubroEmpleado")) {
				jButtonCancelarRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRubroEmpleado")) {
				jButtonCerrarRubroEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRubroEmpleado")) {
				jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRubroEmpleado")) {
				jButtonNuevoGuardarCambiosRubroEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRubroEmpleado")) {
				jButtonAbrirOrderByRubroEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRubroEmpleado")) {
				jButtonRecargarInformacionRubroEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRubroEmpleado")) {
				jButtonAnterioresRubroEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRubroEmpleado")) {
				jButtonSiguientesRubroEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRubroEmpleadoBusqueda")) {
				this.jButtonidRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRubroEmpleadoUpdate")) {
				this.jButtonid_empresaRubroEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRubroEmpleadoBusqueda")) {
				this.jButtonid_empresaRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoRubroEmpleadoUpdate")) {
				this.jButtonid_empleadoRubroEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoRubroEmpleadoBusqueda")) {
				this.jButtonid_empleadoRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEmpleadoUpdate")) {
				this.jButtonid_rubro_empleaRubroEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEmpleadoBusqueda")) {
				this.jButtonid_rubro_empleaRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_rubroRubroEmpleadoUpdate")) {
				this.jButtonid_estado_rubroRubroEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_rubroRubroEmpleadoBusqueda")) {
				this.jButtonid_estado_rubroRubroEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRubroEmpleadoBusqueda")) {
				this.jButtonvalorRubroEmpleadoBusquedaActionPerformed(evt);
			}
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRubroEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRubroEmpleado")) {
				closingInternalFrameRubroEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarRubroEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormRubroEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            RubroEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(RubroEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormRubroEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRubroEmpleadoActionPerformed(null);
			}
			
			RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rubroempleado,new Object(),this.rubroempleadoParameterGeneral,this.rubroempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRubroEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRubroEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRubroEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.rubroempleado)) {
			if(!esControlTabla) {
				if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);			
				}
				
				if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRubroEmpleado(this.rubroempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rubroempleadoReturnGeneral=rubroempleadoLogic.procesarEventosRubroEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroempleadoLogic.getRubroEmpleados(),this.rubroempleado,this.rubroempleadoParameterGeneral,this.isEsNuevoRubroEmpleado,classes);//this.rubroempleadoLogic.getRubroEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRubroEmpleado(this.rubroempleadoReturnGeneral,this.rubroempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRubroEmpleado(classes,this.rubroempleadoReturnGeneral,this.rubroempleadoBean,false);
					}
						
					if(this.rubroempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRubroEmpleado(this.rubroempleadoReturnGeneral.getRubroEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRubroEmpleado(this.rubroempleadoReturnGeneral.getRubroEmpleado());	
					}
						
					if(this.rubroempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRubroEmpleado(this.rubroempleadoReturnGeneral.getRubroEmpleado(),classes);//this.rubroempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRubroEmpleado(this.rubroempleado,classes);//this.rubroempleadoBean);									
				}
			
				if(RubroEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRubroEmpleado(this.rubroempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleado(this.rubroempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rubroempleadoAnterior!=null) {
						this.rubroempleado=this.rubroempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rubroempleadoReturnGeneral=rubroempleadoLogic.procesarEventosRubroEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroempleadoLogic.getRubroEmpleados(),this.rubroempleado,this.rubroempleadoParameterGeneral,this.isEsNuevoRubroEmpleado,classes);//this.rubroempleadoLogic.getRubroEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rubroempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rubroempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rubroempleadoReturnGeneral.getRubroEmpleado(),rubroempleadoLogic.getRubroEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rubroempleadoReturnGeneral.getRubroEmpleado(),this.rubroempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRubroEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosRubroEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRubroEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosRubroEmpleado() throws Exception {
		
		RubroEmpleadoModel rubroempleadoModel=(RubroEmpleadoModel)this.jTableDatosRubroEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroempleadoModel.rubroempleados=this.rubroempleadoLogic.getRubroEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rubroempleadoModel.rubroempleados=this.rubroempleados;
		}
		
		
		((RubroEmpleadoModel) this.jTableDatosRubroEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRubroEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrubroempleadoAnterior(),this.rubroempleadoLogic.getRubroEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrubroempleadoAnterior(),this.rubroempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRubroEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRubroEmpleado(RubroEmpleado rubroempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
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
										
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroempleado,new Object(),generalEntityParameterGeneral,this.rubroempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rubroempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RubroEmpleadoConstantesFunciones.getClassesRelationshipsOfRubroEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RubroEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfRubroEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRubroEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RubroEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroempleado,new Object(),generalEntityParameterGeneral,this.rubroempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRubroEmpleado(RubroEmpleadoBean rubroempleadoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRubroEmpleado(ArrayList<Classe> classes,RubroEmpleadoReturnGeneral rubroempleadoReturnGeneral,RubroEmpleadoBean rubroempleadoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRubroEmpleado(RubroEmpleado rubroempleado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.rubroempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRubroEmpleado = new RubroEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.rubroempleadoSessionBean.getConGuardarRelaciones(),this.rubroempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormRubroEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormRubroEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRubroEmpleado.rubroempleadoLogic=this.rubroempleadoLogic;
		
		this.cargarCombosFrameForeignKeyRubroEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRubroEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRubroEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRubroEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRubroEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRubroEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRubroEmpleado"));
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarRubroEmpleado.addActionListener(new ButtonActionListener(this,"ModificarRubroEmpleado"));

		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarToolBarRubroEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarRubroEmpleado"));
					
		this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemModificarRubroEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarRubroEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarRubroEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarRubroEmpleado"));
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarToolBarRubroEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRubroEmpleado"));
						
		this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemActualizarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRubroEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarRubroEmpleado.addActionListener (new ButtonActionListener(this,"EliminarRubroEmpleado"));
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarRubroEmpleado"));
								
		this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemEliminarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRubroEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarRubroEmpleado.addActionListener (new ButtonActionListener(this,"CancelarRubroEmpleado"));
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarRubroEmpleado"));
					
		this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemCancelarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRubroEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemDetalleCerrarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRubroEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRubroEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonidRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empresaRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empresaRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empleadoRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empleadoRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_rubro_empleaRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_rubro_empleaRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_estado_rubroRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_rubroRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_estado_rubroRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_rubroRubroEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonvalorRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valorRubroEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRubroEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRubroEmpleado"));
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRubroEmpleado"));
		}
		
		this.jTableDatosRubroEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRubroEmpleado"));
		
		this.jTableDatosRubroEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRubroEmpleado"));
		
		this.jButtonNuevoRubroEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRubroEmpleado"));
		
		this.jButtonDuplicarRubroEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarRubroEmpleado"));
		
		this.jButtonCopiarRubroEmpleado.addActionListener(new ButtonActionListener(this,"CopiarRubroEmpleado"));
		
		this.jButtonVerFormRubroEmpleado.addActionListener(new ButtonActionListener(this,"VerFormRubroEmpleado"));
		
		
		this.jButtonNuevoToolBarRubroEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarRubroEmpleado"));
			
		this.jButtonDuplicarToolBarRubroEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRubroEmpleado"));
			
		this.jMenuItemNuevoRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRubroEmpleado"));
			
		this.jMenuItemDuplicarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRubroEmpleado"));		
		
		
		this.jButtonNuevoRelacionesRubroEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRubroEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarRubroEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRubroEmpleado"));
			
		this.jMenuItemNuevoRelacionesRubroEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRubroEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarRubroEmpleado.addActionListener(new ButtonActionListener(this,"ModificarRubroEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonModificarToolBarRubroEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarRubroEmpleado"));
			
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemModificarRubroEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarRubroEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarRubroEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarRubroEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonActualizarToolBarRubroEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRubroEmpleado"));
				
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemActualizarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRubroEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarRubroEmpleado.addActionListener (new ButtonActionListener(this,"EliminarRubroEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonEliminarToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarRubroEmpleado"));
						
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemEliminarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRubroEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarRubroEmpleado.addActionListener (new ButtonActionListener(this,"CancelarRubroEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonCancelarToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarRubroEmpleado"));
			
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemCancelarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRubroEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRubroEmpleado"));		
		
		
		this.jButtonCerrarRubroEmpleado.addActionListener (new ButtonActionListener(this,"CerrarRubroEmpleado"));
		
		
		this.jButtonCerrarToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarRubroEmpleado"));
			
		this.jMenuItemCerrarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRubroEmpleado"));
			
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jMenuItemDetalleCerrarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRubroEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosRubroEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosRubroEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEmpleado"));
		}
		
		this.jButtonCopiarToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarRubroEmpleado"));
			
		this.jButtonVerFormToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarRubroEmpleado"));
		
		this.jMenuItemGuardarCambiosRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRubroEmpleado"));
			
		this.jMenuItemCopiarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRubroEmpleado"));		
		
		this.jMenuItemVerFormRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRubroEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaRubroEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRubroEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRubroEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaRubroEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRubroEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionRubroEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionRubroEmpleado"));
					
		this.jButtonRecargarInformacionToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRubroEmpleado"));
		
		this.jMenuItemRecargarInformacionRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRubroEmpleado"));		
		
		
		
		this.jButtonAnterioresRubroEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresRubroEmpleado"));
		
		
		this.jButtonAnterioresToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRubroEmpleado"));
		
		this.jMenuItemAnterioresRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRubroEmpleado"));		
		
		
		this.jButtonSiguientesRubroEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesRubroEmpleado"));
		
		
		this.jButtonSiguientesToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRubroEmpleado"));
			
		this.jMenuItemSiguientesRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRubroEmpleado"));
			
		this.jMenuItemAbrirOrderByRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRubroEmpleado"));
			
		this.jMenuItemMostrarOcultarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRubroEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRubroEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRubroEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosRubroEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRubroEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRubroEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosRubroEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRubroEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRubroEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRubroEmpleado"));

		this.jCheckBoxSeleccionadosRubroEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRubroEmpleado"));
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRubroEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesRubroEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesRubroEmpleado"));
			
		this.jComboBoxTiposAccionesRubroEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesRubroEmpleado"));
					
		this.jComboBoxTiposSeleccionarRubroEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRubroEmpleado"));
			
		this.jTextFieldValorCampoGeneralRubroEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRubroEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonidRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empresaRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empresaRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empleadoRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empleadoRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_rubro_empleaRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_rubro_empleaRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_estado_rubroRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_rubroRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_estado_rubroRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_rubroRubroEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonvalorRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valorRubroEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoRubroEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoRubroEmpleado"));

			this.jButtonFK_IdEstadoRubroRubroEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEstadoRubroRubroEmpleado"));

			this.jButtonFK_IdRubroEmpleaRubroEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaRubroEmpleado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRubroEmpleado!=null) {
				this.jInternalFrameReporteDinamicoRubroEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEmpleado"));
				this.jInternalFrameReporteDinamicoRubroEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEmpleado"));
				this.jInternalFrameReporteDinamicoRubroEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoRubroEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEmpleado"));				
			//this.jButtonGenerarReporteDinamicoRubroEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoRubroEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRubroEmpleado!=null) {
				this.jInternalFrameImportacionRubroEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRubroEmpleado"));
				this.jInternalFrameImportacionRubroEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRubroEmpleado"));
				this.jInternalFrameImportacionRubroEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRubroEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRubroEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByRubroEmpleado"));
			
			this.jButtonAbrirOrderByToolBarRubroEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRubroEmpleado"));			
			
			if(this.jInternalFrameOrderByRubroEmpleado!=null) {
				this.jInternalFrameOrderByRubroEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRubroEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleado.jTabbedPaneRelacionesRubroEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRubroEmpleado"));
		
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
            		closingInternalFrameRubroEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRubroEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRubroEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            RubroEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(RubroEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormRubroEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRubroEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRubroEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRubroEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRubroEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRubroEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRubroEmpleado";
		inputMap = this.jButtonNuevoRubroEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRubroEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRubroEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRubroEmpleado";
		inputMap = this.jButtonNuevoRelacionesRubroEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRubroEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRubroEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRubroEmpleado";
		inputMap = this.jButtonModificarRubroEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRubroEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRubroEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRubroEmpleado";
		inputMap = this.jButtonActualizarRubroEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRubroEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRubroEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRubroEmpleado";
		inputMap = this.jButtonEliminarRubroEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRubroEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRubroEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRubroEmpleado";
		inputMap = this.jButtonCancelarRubroEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRubroEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRubroEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRubroEmpleado";
		inputMap = this.jButtonCerrarRubroEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRubroEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRubroEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRubroEmpleado";
		inputMap = this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosRubroEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonGuardarCambiosRubroEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRubroEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRubroEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRubroEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRubroEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRubroEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRubroEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRubroEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRubroEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRubroEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonidRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empresaRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empresaRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empleadoRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_empleadoRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_rubro_empleaRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_rubro_empleaRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_estado_rubroRubroEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_rubroRubroEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonid_estado_rubroRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_rubroRubroEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleado.jButtonvalorRubroEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valorRubroEmpleadoBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoRubroEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoRubroEmpleado"));

		this.jButtonFK_IdEstadoRubroRubroEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEstadoRubroRubroEmpleado"));

		this.jButtonFK_IdRubroEmpleaRubroEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaRubroEmpleado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRubroEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRubroEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRubroEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRubroEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRubroEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
					rubroempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEmpleado rubroempleadoAux:rubroempleados) {
					rubroempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRubroEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRubroEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
						rubroempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEmpleado rubroempleadoAux:rubroempleados) {
						rubroempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEmpleado rubroempleadoAux:rubroempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRubroEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRubroEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRubroEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRubroEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRubroEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRubroEmpleado.getSelectedRows();
			
			RubroEmpleado rubroempleadoLocal=new RubroEmpleado();
			
			//this.seleccionarTodosRubroEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleadoLocal =(RubroEmpleado) this.rubroempleadoLogic.getRubroEmpleados().toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rubroempleadoLocal =(RubroEmpleado) this.rubroempleados.toArray()[this.jTableDatosRubroEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rubroempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
						rubroempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEmpleado rubroempleadoAux:rubroempleados) {
						rubroempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRubroEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRubroEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRubroEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRubroEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRubroEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRubroEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRubroEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRubroEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RubroEmpleado rubroempleadoAux:this.rubroempleadoLogic.getRubroEmpleados()) {
				
						if(sTipoSeleccionar.equals(RubroEmpleadoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							rubroempleadoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEmpleado rubroempleadoAux:rubroempleados) {
					
						if(sTipoSeleccionar.equals(RubroEmpleadoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							rubroempleadoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRubroEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRubroEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRubroEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRubroEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRubroEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRubroEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessRubroEmpleado(conSplash);
				
					this.generarReporteRubroEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRubroEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRubroEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRubroEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRubroEmpleado();
				
				this.exportarRubroEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRubroEmpleados();
				//this.importarRubroEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRubroEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRubroEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Rubro Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRubroEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRubroEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRubroEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(RubroEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRubroEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRubroEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralRubroEmpleado();
						
						this.generarReporteProcesoAccionRubroEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RubroEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Rubro EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Rubro Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRubroEmpleado();
				
						this.actualizarParametrosGeneralRubroEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rubroempleadoReturnGeneral=rubroempleadoLogic.procesarAccionRubroEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rubroempleadoLogic.getRubroEmpleados(),this.rubroempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRubroEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRubroEmpleado();
					
					RubroEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRubroEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRubroEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxTiposAccionesFormularioRubroEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRubroEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRubroEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRubroEmpleado();
			
			if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		
			RubroEmpleado rubroempleado=new RubroEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRubroEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRubroEmpleado.getSelectedItem();
			
			
			
			
			rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(rubroempleadosSeleccionados.size()==1) {
				for(RubroEmpleado rubroempleadoAux:rubroempleadosSeleccionados) {
					rubroempleado=rubroempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRubroEmpleado();
			
      		//this.finishProcessRubroEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRubroEmpleadoReturnGeneral() throws Exception {
		if(this.rubroempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rubroempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rubroempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rubroempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rubroempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rubroempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRubroEmpleado(false);
		}
		
		if(this.rubroempleadoReturnGeneral.getConRetornoLista() || this.rubroempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.rubroempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rubroempleadoLogic.setRubroEmpleados(this.rubroempleadoReturnGeneral.getRubroEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.rubroempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rubroempleadoLogic.setRubroEmpleado(this.rubroempleadoReturnGeneral.getRubroEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRubroEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralRubroEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<RubroEmpleado> getRubroEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRubroEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RubroEmpleado rubroempleadoAux:rubroempleadoLogic.getRubroEmpleados()) {
					if(rubroempleadoAux.getIsSelected()) {
						rubroempleadosSeleccionados.add(rubroempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEmpleado rubroempleadoAux:this.rubroempleados) {
					if(rubroempleadoAux.getIsSelected()) {
						rubroempleadosSeleccionados.add(rubroempleadoAux);				
					}
				}
			}
			
			if(rubroempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rubroempleadosSeleccionados.addAll(this.rubroempleadoLogic.getRubroEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rubroempleadosSeleccionados.addAll(this.rubroempleados);				
					}
				}
			}
		} else {
			rubroempleadosSeleccionados.add(this.rubroempleado);
		}
		
		return rubroempleadosSeleccionados;
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
	
	public void generarReporteRubroEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRubroEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRubroEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRubroEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRubroEmpleadosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Rubro Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRubroEmpleadosSeleccionados() throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRubroEmpleados("Todos",rubroempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalRubroEmpleadosSeleccionados() throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRubroEmpleados("Todos",rubroempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRubroEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRubroEmpleados("Todos",rubroempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRubroEmpleadosSeleccionados() throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRubroEmpleado();
		
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRubroEmpleado();
		
		
		//this.generarReporteRubroEmpleados("Todos",rubroempleadosSeleccionados ,rubroempleadoImplementable,rubroempleadoImplementableHome);
	}
	
	public void mostrarImportacionRubroEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRubroEmpleado();
		
		this.abrirFrameImportacionRubroEmpleado();		
		
			
		//this.generarReporteRubroEmpleados("Todos",rubroempleadosSeleccionados ,rubroempleadoImplementable,rubroempleadoImplementableHome);
	}
	
	public void importarRubroEmpleados() throws Exception {		
	
	}
	
	public void exportarRubroEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRubroEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRubroEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRubroEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Rubro Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRubroEmpleadosSeleccionados() throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRubroEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RubroEmpleado rubroempleadoAux:rubroempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRubroEmpleado(rubroempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rubroempleadoAux.setsDetalleGeneralEntityReporte(rubroempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRubroEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RubroEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleadoConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRubroEmpleado(RubroEmpleado rubroempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=rubroempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleado.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleado.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleado.getestadorubro_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleado.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRubroEmpleadosSeleccionados() throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RubroEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRubroEmpleado(row);				
				iRow++;
			}				
			
			for(RubroEmpleado rubroempleadoAux:rubroempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRubroEmpleado(rubroempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRubroEmpleadosSeleccionados() throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();		
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rubroempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("rubroempleado");
			//elementRoot.appendChild(element);
		
			for(RubroEmpleado rubroempleadoAux:rubroempleadosSeleccionados) {
				element = document.createElement("rubroempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRubroEmpleado(rubroempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRubroEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleadoConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRubroEmpleado(RubroEmpleado rubroempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleado.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleado.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleado.getestadorubro_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleado.getvalor());				
	}
	
	public void setFilaDatosExportarXmlRubroEmpleado(RubroEmpleado rubroempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RubroEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(rubroempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RubroEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(rubroempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RubroEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(rubroempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(RubroEmpleadoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(rubroempleado.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(RubroEmpleadoConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(rubroempleado.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementestadorubro_descripcion = document.createElement(RubroEmpleadoConstantesFunciones.IDESTADORUBRO);
		elementestadorubro_descripcion.appendChild(document.createTextNode(rubroempleado.getestadorubro_descripcion()));
		element.appendChild(elementestadorubro_descripcion);

		Element elementvalor = document.createElement(RubroEmpleadoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(rubroempleado.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoRubroEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RubroEmpleado> rubroempleadosSeleccionados=new ArrayList<RubroEmpleado>();
		
		rubroempleadosSeleccionados=this.getRubroEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRubroEmpleado(rubroempleadosSeleccionados);
		
		this.generarReporteRubroEmpleados("Todos",rubroempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRubroEmpleado(ArrayList<RubroEmpleado> rubroempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RubroEmpleado rubroempleadoAux:rubroempleadosSeleccionados) {
				rubroempleadoAux.setsDetalleGeneralEntityReporte(rubroempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(RubroEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rubroempleadoAux.setsDescripcionGeneralEntityReporte1(rubroempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEmpleadoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					rubroempleadoAux.setsDescripcionGeneralEntityReporte1(rubroempleadoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEmpleadoConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					rubroempleadoAux.setsDescripcionGeneralEntityReporte1(rubroempleadoAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEmpleadoConstantesFunciones.LABEL_IDESTADORUBRO)) {
					existe=true;
					rubroempleadoAux.setsDescripcionGeneralEntityReporte1(rubroempleadoAux.getestadorubro_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRubroEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRubroEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarRubroEmpleado=false;
			this.isVisibilidadCeldaActualizarRubroEmpleado=false;
			this.isVisibilidadCeldaEliminarRubroEmpleado=false;
			this.isVisibilidadCeldaCancelarRubroEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRubroEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=false;
			this.isVisibilidadCeldaModificarRubroEmpleado=false;
			this.isVisibilidadCeldaActualizarRubroEmpleado=true;
			this.isVisibilidadCeldaEliminarRubroEmpleado=false;
			this.isVisibilidadCeldaCancelarRubroEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRubroEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=false;
			this.isVisibilidadCeldaModificarRubroEmpleado=false;
			this.isVisibilidadCeldaActualizarRubroEmpleado=true;
			this.isVisibilidadCeldaEliminarRubroEmpleado=true;
			this.isVisibilidadCeldaCancelarRubroEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRubroEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=false;
			this.isVisibilidadCeldaModificarRubroEmpleado=false;
			this.isVisibilidadCeldaActualizarRubroEmpleado=true;
			this.isVisibilidadCeldaEliminarRubroEmpleado=false;
			this.isVisibilidadCeldaCancelarRubroEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRubroEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=true;
			this.isVisibilidadCeldaModificarRubroEmpleado=false;
			this.isVisibilidadCeldaActualizarRubroEmpleado=false;
			this.isVisibilidadCeldaEliminarRubroEmpleado=false;
			this.isVisibilidadCeldaCancelarRubroEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRubroEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=false;
			this.isVisibilidadCeldaActualizarRubroEmpleado=false;
			this.isVisibilidadCeldaEliminarRubroEmpleado=false;
			this.isVisibilidadCeldaCancelarRubroEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRubroEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=false;
			this.isVisibilidadCeldaModificarRubroEmpleado=true;
			this.isVisibilidadCeldaActualizarRubroEmpleado=false;
			this.isVisibilidadCeldaEliminarRubroEmpleado=false;
			this.isVisibilidadCeldaCancelarRubroEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRubroEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=true;
		} else {
			this.actualizarEstadoPanelsRubroEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRubroEmpleado=false;
			//this.isVisibilidadCeldaVerFormRubroEmpleado=false;
			this.isVisibilidadCeldaDuplicarRubroEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rubroempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoRubroEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!rubroempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;												
			}
			
			this.jButtonCerrarRubroEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.rubroempleado)) {
			this.isVisibilidadCeldaActualizarRubroEmpleado=false;
			this.isVisibilidadCeldaEliminarRubroEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRubroEmpleado() {
	}
	
	public void actualizarEstadoPanelsRubroEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRubroEmpleado!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleado!=null) {
				this.jScrollPanelDatosRubroEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEmpleado!=null) {
				this.jPanelPaginacionRubroEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRubroEmpleado!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRubroEmpleado!=null) {
				this.jScrollPanelDatosRubroEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEmpleado!=null) {
				this.jPanelPaginacionRubroEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRubroEmpleado!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleado!=null) {
				this.jScrollPanelDatosRubroEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEmpleado!=null) {
				this.jPanelPaginacionRubroEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRubroEmpleado!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleado!=null) {
				this.jScrollPanelDatosRubroEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEmpleado!=null) {
				this.jPanelPaginacionRubroEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRubroEmpleado!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleado!=null) {
				this.jScrollPanelDatosRubroEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEmpleado!=null) {
				this.jPanelPaginacionRubroEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRubroEmpleado!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleado!=null) {
				this.jScrollPanelDatosRubroEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEmpleado!=null) {
				this.jPanelPaginacionRubroEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRubroEmpleado!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleado!=null) {
				this.jScrollPanelDatosRubroEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEmpleado!=null) {
				this.jPanelPaginacionRubroEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
					this.jTabbedPaneBusquedasRubroEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleado!=null) {
				this.jTabbedPaneBusquedasRubroEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRubroEmpleado!=null) {
				this.jPanelParametrosReportesRubroEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdEmpleadoRubroEmpleado);}

			this.isVisibilidadFK_IdEstadoRubro=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoRubro) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdEstadoRubroRubroEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdRubroEmpleaRubroEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdEmpleadoRubroEmpleado);}

			this.isVisibilidadFK_IdEstadoRubro=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoRubro) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdEstadoRubroRubroEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdRubroEmpleaRubroEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdEmpleado=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdEmpleadoRubroEmpleado);}

			this.isVisibilidadFK_IdEstadoRubro=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEstadoRubro) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdEstadoRubroRubroEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdRubroEmpleaRubroEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoRubro(Boolean isParaEstadoRubro){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoRubroNegation=!isParaEstadoRubro;

			this.isVisibilidadFK_IdEmpleado=isParaEstadoRubroNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdEmpleadoRubroEmpleado);}

			this.isVisibilidadFK_IdEstadoRubro=isParaEstadoRubro;
			if(!this.isVisibilidadFK_IdEstadoRubro) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdEstadoRubroRubroEmpleado);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEstadoRubroNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleado.remove(jPanelFK_IdRubroEmpleaRubroEmpleado);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RubroEmpleadoSessionBean rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		
		if(this.rubroempleadoSessionBean==null) {
			this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		}
		
		this.rubroempleadoSessionBean.setsUltimaBusquedaRubroEmpleado(this.getsAccionBusqueda());
		this.rubroempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.rubroempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			rubroempleadoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			rubroempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoRubro")) {
			rubroempleadoSessionBean.setid_estado_rubro(this.getid_estado_rubroFK_IdEstadoRubro());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
			rubroempleadoSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdRubroEmplea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RubroEmpleadoSessionBean rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		
		if(this.rubroempleadoSessionBean==null) {
			this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		}
		
		if(this.rubroempleadoSessionBean.getsUltimaBusquedaRubroEmpleado()!=null&&!this.rubroempleadoSessionBean.getsUltimaBusquedaRubroEmpleado().equals("")) {
			this.setsAccionBusqueda(rubroempleadoSessionBean.getsUltimaBusquedaRubroEmpleado());
			this.setiNumeroPaginacion(rubroempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(rubroempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(rubroempleadoSessionBean.getid_empleado());
				rubroempleadoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(rubroempleadoSessionBean.getid_empresa());
				rubroempleadoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoRubro")) {
				this.setid_estado_rubroFK_IdEstadoRubro(rubroempleadoSessionBean.getid_estado_rubro());
				rubroempleadoSessionBean.setid_estado_rubro(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
				this.setid_rubro_empleaFK_IdRubroEmplea(rubroempleadoSessionBean.getid_rubro_emplea());
				rubroempleadoSessionBean.setid_rubro_emplea(-1L);
			}
		}
		
		this.rubroempleadoSessionBean.setsUltimaBusquedaRubroEmpleado("");
		this.rubroempleadoSessionBean.setiNumeroPaginacion(RubroEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.rubroempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRubroEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRubroEmpleado() {
		this.updateBorderResaltarBusquedasFormularioRubroEmpleado();
		this.updateVisibilidadBusquedasFormularioRubroEmpleado();
		this.updateHabilitarBusquedasFormularioRubroEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioRubroEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRubroEmpleado.getComponents().length>0) {
	

		if(this.rubroempleadoConstantesFunciones.resaltarFK_IdEmpleadoRubroEmpleado!=null) {
			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoRubroEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
				jPanel.setBorder(this.rubroempleadoConstantesFunciones.resaltarFK_IdEmpleadoRubroEmpleado);
			}
		}

		if(this.rubroempleadoConstantesFunciones.resaltarFK_IdEstadoRubroRubroEmpleado!=null) {
			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdEstadoRubroRubroEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
				jPanel.setBorder(this.rubroempleadoConstantesFunciones.resaltarFK_IdEstadoRubroRubroEmpleado);
			}
		}

		if(this.rubroempleadoConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEmpleado!=null) {
			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
				jPanel.setBorder(this.rubroempleadoConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEmpleado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRubroEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRubroEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoRubroEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubroempleadoConstantesFunciones.mostrarFK_IdEmpleadoRubroEmpleado);
			if(!this.rubroempleadoConstantesFunciones.mostrarFK_IdEmpleadoRubroEmpleado && index>-1) {
				this.jTabbedPaneBusquedasRubroEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdEstadoRubroRubroEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubroempleadoConstantesFunciones.mostrarFK_IdEstadoRubroRubroEmpleado);
			if(!this.rubroempleadoConstantesFunciones.mostrarFK_IdEstadoRubroRubroEmpleado && index>-1) {
				this.jTabbedPaneBusquedasRubroEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubroempleadoConstantesFunciones.mostrarFK_IdRubroEmpleaRubroEmpleado);
			if(!this.rubroempleadoConstantesFunciones.mostrarFK_IdRubroEmpleaRubroEmpleado && index>-1) {
				this.jTabbedPaneBusquedasRubroEmpleado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRubroEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRubroEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoRubroEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubroempleadoConstantesFunciones.activarFK_IdEmpleadoRubroEmpleado);
				this.jTabbedPaneBusquedasRubroEmpleado.setEnabledAt(index,this.rubroempleadoConstantesFunciones.activarFK_IdEmpleadoRubroEmpleado);
			}

			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdEstadoRubroRubroEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubroempleadoConstantesFunciones.activarFK_IdEstadoRubroRubroEmpleado);
				this.jTabbedPaneBusquedasRubroEmpleado.setEnabledAt(index,this.rubroempleadoConstantesFunciones.activarFK_IdEstadoRubroRubroEmpleado);
			}

			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubroempleadoConstantesFunciones.activarFK_IdRubroEmpleaRubroEmpleado);
				this.jTabbedPaneBusquedasRubroEmpleado.setEnabledAt(index,this.rubroempleadoConstantesFunciones.activarFK_IdRubroEmpleaRubroEmpleado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRubroEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoRubroEmpleado);

			this.jTabbedPaneBusquedasRubroEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);

			this.rubroempleadoConstantesFunciones.setResaltarFK_IdEmpleadoRubroEmpleado(resaltar);

			jPanel.setBorder(this.rubroempleadoConstantesFunciones.resaltarFK_IdEmpleadoRubroEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoRubro")) {
			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdEstadoRubroRubroEmpleado);

			this.jTabbedPaneBusquedasRubroEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);

			this.rubroempleadoConstantesFunciones.setResaltarFK_IdEstadoRubroRubroEmpleado(resaltar);

			jPanel.setBorder(this.rubroempleadoConstantesFunciones.resaltarFK_IdEstadoRubroRubroEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRubroEmplea")) {
			index= this.jTabbedPaneBusquedasRubroEmpleado.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEmpleado);

			this.jTabbedPaneBusquedasRubroEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleado.getComponent(index);

			this.rubroempleadoConstantesFunciones.setResaltarFK_IdRubroEmpleaRubroEmpleado(resaltar);

			jPanel.setBorder(this.rubroempleadoConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEmpleado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRubroEmpleado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRubroEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRubroEmpleado();
		this.updateVisibilidadResaltarControlesFormularioRubroEmpleado();
		this.updateHabilitarResaltarControlesFormularioRubroEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioRubroEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rubroempleadoConstantesFunciones.resaltaridRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado!=null) {this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.setBorder(this.rubroempleadoConstantesFunciones.resaltaridRubroEmpleado);}
		if(this.rubroempleadoConstantesFunciones.resaltarid_empresaRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado!=null) {this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setBorder(this.rubroempleadoConstantesFunciones.resaltarid_empresaRubroEmpleado);}
		if(this.rubroempleadoConstantesFunciones.resaltarid_empleadoRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado!=null) {this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setBorder(this.rubroempleadoConstantesFunciones.resaltarid_empleadoRubroEmpleado);}
		if(this.rubroempleadoConstantesFunciones.resaltarid_rubro_empleaRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado!=null) {this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setBorder(this.rubroempleadoConstantesFunciones.resaltarid_rubro_empleaRubroEmpleado);}
		if(this.rubroempleadoConstantesFunciones.resaltarid_estado_rubroRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado!=null) {this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setBorder(this.rubroempleadoConstantesFunciones.resaltarid_estado_rubroRubroEmpleado);}
		if(this.rubroempleadoConstantesFunciones.resaltarvalorRubroEmpleado!=null && this.jInternalFrameDetalleFormRubroEmpleado!=null) {this.jInternalFrameDetalleFormRubroEmpleado.jTextFieldvalorRubroEmpleado.setBorder(this.rubroempleadoConstantesFunciones.resaltarvalorRubroEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRubroEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostraridRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jPanelidRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostraridRubroEmpleado);
		//this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarid_empresaRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jPanelid_empresaRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarid_empresaRubroEmpleado);
		//this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarid_empleadoRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jPanelid_empleadoRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarid_empleadoRubroEmpleado);
		//this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarid_rubro_empleaRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jPanelid_rubro_empleaRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarid_rubro_empleaRubroEmpleado);
		//this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarid_estado_rubroRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jPanelid_estado_rubroRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarid_estado_rubroRubroEmpleado);
		//this.jInternalFrameDetalleFormRubroEmpleado.jTextFieldvalorRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarvalorRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jPanelvalorRubroEmpleado.setVisible(this.rubroempleadoConstantesFunciones.mostrarvalorRubroEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRubroEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormRubroEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRubroEmpleado!=null) {
	
		this.jInternalFrameDetalleFormRubroEmpleado.jLabelidRubroEmpleado.setEnabled(this.rubroempleadoConstantesFunciones.activaridRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empresaRubroEmpleado.setEnabled(this.rubroempleadoConstantesFunciones.activarid_empresaRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_empleadoRubroEmpleado.setEnabled(this.rubroempleadoConstantesFunciones.activarid_empleadoRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_rubro_empleaRubroEmpleado.setEnabled(this.rubroempleadoConstantesFunciones.activarid_rubro_empleaRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jComboBoxid_estado_rubroRubroEmpleado.setEnabled(this.rubroempleadoConstantesFunciones.activarid_estado_rubroRubroEmpleado);
		this.jInternalFrameDetalleFormRubroEmpleado.jTextFieldvalorRubroEmpleado.setEnabled(this.rubroempleadoConstantesFunciones.activarvalorRubroEmpleado);
		}
	}
	
		
}